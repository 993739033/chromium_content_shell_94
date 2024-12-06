package org.chromium.media;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.compat.ApiHelperForS;
@JNINamespace("media")
/* loaded from: classes2.dex */
class AudioManagerAndroid {
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int DEFAULT_SAMPLING_RATE = 44100;
    private static final int DEVICE_BLUETOOTH_HEADSET = 3;
    private static final int DEVICE_COUNT = 5;
    private static final int DEVICE_DEFAULT = -2;
    private static final int DEVICE_EARPIECE = 2;
    private static final int DEVICE_INVALID = -1;
    private static final int DEVICE_SPEAKERPHONE = 0;
    private static final int DEVICE_USB_AUDIO = 4;
    private static final int DEVICE_WIRED_HEADSET = 1;
    private static final int STATE_BLUETOOTH_SCO_INVALID = -1;
    private static final int STATE_BLUETOOTH_SCO_OFF = 0;
    private static final int STATE_BLUETOOTH_SCO_ON = 1;
    private static final int STATE_BLUETOOTH_SCO_TURNING_OFF = 3;
    private static final int STATE_BLUETOOTH_SCO_TURNING_ON = 2;
    private static final String TAG = "media";
    private BroadcastReceiver mBluetoothHeadsetReceiver;
    private BroadcastReceiver mBluetoothScoReceiver;
    private int mCurrentVolume;
    private boolean mHasBluetoothPermission;
    private boolean mHasModifyAudioSettingsPermission;
    private boolean mIsInitialized;
    private final long mNativeAudioManagerAndroid;
    private boolean mSavedIsMicrophoneMute;
    private boolean mSavedIsSpeakerphoneOn;
    private ContentObserver mSettingsObserver;
    private HandlerThread mSettingsObserverThread;
    private BroadcastReceiver mUsbAudioReceiver;
    private BroadcastReceiver mWiredHeadsetReceiver;
    private static final String[] DEVICE_NAMES = {"Speakerphone", "Wired headset", "Headset earpiece", "Bluetooth headset", "USB audio"};
    private static final Integer[] VALID_DEVICES = {0, 1, 2, 3, 4};
    private static final Method sGetOutputLatency = reflectMethod("getOutputLatency");
    private int mBluetoothScoState = -1;
    private int mRequestedAudioDevice = -1;
    private final NonThreadSafe mNonThreadSafe = new NonThreadSafe();
    private final Object mLock = new Object();
    private boolean[] mAudioDevices = new boolean[5];
    private final AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private final ContentResolver mContentResolver = ContextUtils.getApplicationContext().getContentResolver();
    private final UsbManager mUsbManager = (UsbManager) ContextUtils.getApplicationContext().getSystemService("usb");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void setMute(long j, AudioManagerAndroid audioManagerAndroid, boolean z);
    }

    /* loaded from: classes2.dex */
    private static class NonThreadSafe {
        private final Long mThreadId = 0L;

        public boolean calledOnValidThread() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    private static class AudioDeviceName {
        private final int mId;
        private final String mName;

        private AudioDeviceName(int id, String name) {
            this.mId = id;
            this.mName = name;
        }

        private String id() {
            return String.valueOf(this.mId);
        }

        private String name() {
            return this.mName;
        }
    }

    private static AudioManagerAndroid createAudioManagerAndroid(long nativeAudioManagerAndroid) {
        return new AudioManagerAndroid(nativeAudioManagerAndroid);
    }

    private AudioManagerAndroid(long nativeAudioManagerAndroid) {
        this.mNativeAudioManagerAndroid = nativeAudioManagerAndroid;
    }

    private void init() {
        checkIfCalledOnValidThread();
        if (this.mIsInitialized) {
            return;
        }
        this.mHasModifyAudioSettingsPermission = hasPermission("android.permission.MODIFY_AUDIO_SETTINGS");
        this.mAudioDevices[2] = hasEarpiece();
        this.mAudioDevices[1] = hasWiredHeadset();
        this.mAudioDevices[4] = hasUsbAudio();
        this.mAudioDevices[0] = true;
        registerBluetoothIntentsIfNeeded();
        registerForWiredHeadsetIntentBroadcast();
        registerForUsbAudioIntentBroadcast();
        this.mIsInitialized = true;
    }

    private void close() {
        checkIfCalledOnValidThread();
        if (this.mIsInitialized) {
            stopObservingVolumeChanges();
            unregisterForWiredHeadsetIntentBroadcast();
            unregisterBluetoothIntentsIfNeeded();
            unregisterForUsbAudioIntentBroadcast();
            this.mIsInitialized = false;
        }
    }

    private void setCommunicationAudioModeOn(boolean on) {
        checkIfCalledOnValidThread();
        if (this.mIsInitialized) {
            if (!this.mHasModifyAudioSettingsPermission) {
                Log.w(TAG, "MODIFY_AUDIO_SETTINGS is missing => client will run with reduced functionality", new Object[0]);
                return;
            }
            if (on) {
                this.mSavedIsSpeakerphoneOn = this.mAudioManager.isSpeakerphoneOn();
                this.mSavedIsMicrophoneMute = this.mAudioManager.isMicrophoneMute();
                startObservingVolumeChanges();
            } else {
                stopObservingVolumeChanges();
                stopBluetoothSco();
                synchronized (this.mLock) {
                    this.mRequestedAudioDevice = -1;
                }
                setMicrophoneMute(this.mSavedIsMicrophoneMute);
                setSpeakerphoneOn(this.mSavedIsSpeakerphoneOn);
            }
            setCommunicationAudioModeOnInternal(on);
        }
    }

    private void setCommunicationAudioModeOnInternal(boolean on) {
        if (on) {
            try {
                this.mAudioManager.setMode(3);
                return;
            } catch (SecurityException e) {
                logDeviceInfo();
                throw e;
            }
        }
        try {
            this.mAudioManager.setMode(0);
        } catch (SecurityException e2) {
            logDeviceInfo();
            throw e2;
        }
    }

    private boolean setDevice(String deviceId) {
        boolean[] devices;
        if (this.mIsInitialized) {
            boolean hasRecordAudioPermission = hasPermission("android.permission.RECORD_AUDIO");
            if (!this.mHasModifyAudioSettingsPermission || !hasRecordAudioPermission) {
                Log.w(TAG, "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO. Selected device will not be available for recording", new Object[0]);
                return false;
            }
            int intDeviceId = deviceId.isEmpty() ? -2 : Integer.parseInt(deviceId);
            if (intDeviceId == -2) {
                synchronized (this.mLock) {
                    devices = (boolean[]) this.mAudioDevices.clone();
                    this.mRequestedAudioDevice = -2;
                }
                int defaultDevice = selectDefaultDevice(devices);
                setAudioDevice(defaultDevice);
                return true;
            }
            List<Integer> validIds = Arrays.asList(VALID_DEVICES);
            if (validIds.contains(Integer.valueOf(intDeviceId)) && this.mAudioDevices[intDeviceId]) {
                synchronized (this.mLock) {
                    this.mRequestedAudioDevice = intDeviceId;
                }
                setAudioDevice(intDeviceId);
                return true;
            }
            return false;
        }
        return false;
    }

    private AudioDeviceName[] getAudioInputDeviceNames() {
        boolean[] devices;
        if (this.mIsInitialized) {
            boolean hasRecordAudioPermission = hasPermission("android.permission.RECORD_AUDIO");
            if (!this.mHasModifyAudioSettingsPermission || !hasRecordAudioPermission) {
                Log.w(TAG, "Requires MODIFY_AUDIO_SETTINGS and RECORD_AUDIO. No audio device will be available for recording", new Object[0]);
                return null;
            }
            synchronized (this.mLock) {
                devices = (boolean[]) this.mAudioDevices.clone();
            }
            List<String> list = new ArrayList<>();
            AudioDeviceName[] array = new AudioDeviceName[getNumOfAudioDevices(devices)];
            int i = 0;
            for (int id = 0; id < 5; id++) {
                if (devices[id]) {
                    String[] strArr = DEVICE_NAMES;
                    array[i] = new AudioDeviceName(id, strArr[id]);
                    list.add(strArr[id]);
                    i++;
                }
            }
            return array;
        }
        return null;
    }

    private int getNativeOutputSampleRate() {
        String sampleRateString = this.mAudioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return sampleRateString == null ? DEFAULT_SAMPLING_RATE : Integer.parseInt(sampleRateString);
    }

    private static int getMinInputFrameSize(int sampleRate, int channels) {
        int channelConfig;
        if (channels == 1) {
            channelConfig = 16;
        } else if (channels == 2) {
            channelConfig = 12;
        } else {
            return -1;
        }
        return (AudioRecord.getMinBufferSize(sampleRate, channelConfig, 2) / 2) / channels;
    }

    private static int getMinOutputFrameSize(int sampleRate, int channels) {
        int channelConfig;
        if (channels == 1) {
            channelConfig = 4;
        } else if (channels == 2) {
            channelConfig = 12;
        } else {
            return -1;
        }
        return (AudioTrack.getMinBufferSize(sampleRate, channelConfig, 2) / 2) / channels;
    }

    private boolean isAudioLowLatencySupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private int getAudioLowLatencyOutputFrameSize() {
        String framesPerBuffer = this.mAudioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (framesPerBuffer == null) {
            return 256;
        }
        return Integer.parseInt(framesPerBuffer);
    }

    private static boolean acousticEchoCancelerIsAvailable() {
        return AcousticEchoCanceler.isAvailable();
    }

    private static final Method reflectMethod(String methodName) {
        try {
            return AudioManager.class.getMethod(methodName, Integer.TYPE);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    private int getOutputLatency() {
        checkIfCalledOnValidThread();
        Method method = sGetOutputLatency;
        if (method == null) {
            return 0;
        }
        try {
            int result = ((Integer) method.invoke(this.mAudioManager, 3)).intValue();
            return result;
        } catch (Exception e) {
            return 0;
        }
    }

    private void checkIfCalledOnValidThread() {
    }

    private void registerBluetoothIntentsIfNeeded() {
        this.mHasBluetoothPermission = hasPermission("android.permission.BLUETOOTH");
        if (Build.VERSION.SDK_INT >= 31) {
            this.mHasBluetoothPermission &= ApiHelperForS.hasBluetoothConnectPermission();
        }
        if (!this.mHasBluetoothPermission) {
            Log.w(TAG, "Requires BLUETOOTH permission", new Object[0]);
            return;
        }
        this.mAudioDevices[3] = hasBluetoothHeadset();
        registerForBluetoothHeadsetIntentBroadcast();
        registerForBluetoothScoIntentBroadcast();
    }

    private void unregisterBluetoothIntentsIfNeeded() {
        if (this.mHasBluetoothPermission) {
            this.mAudioManager.stopBluetoothSco();
            unregisterForBluetoothHeadsetIntentBroadcast();
            unregisterForBluetoothScoIntentBroadcast();
        }
    }

    private void setSpeakerphoneOn(boolean on) {
        boolean wasOn = this.mAudioManager.isSpeakerphoneOn();
        if (wasOn == on) {
            return;
        }
        this.mAudioManager.setSpeakerphoneOn(on);
    }

    private void setMicrophoneMute(boolean on) {
        boolean wasMuted = this.mAudioManager.isMicrophoneMute();
        if (wasMuted == on) {
            return;
        }
        this.mAudioManager.setMicrophoneMute(on);
    }

    private boolean isMicrophoneMute() {
        return this.mAudioManager.isMicrophoneMute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public boolean hasWiredHeadset() {
        return this.mAudioManager.isWiredHeadsetOn();
    }

    private boolean hasPermission(String permission) {
        return ContextUtils.getApplicationContext().checkPermission(permission, Process.myPid(), Process.myUid()) == 0;
    }

    private boolean hasBluetoothHeadset() {
        if (!this.mHasBluetoothPermission) {
            Log.w(TAG, "hasBluetoothHeadset() requires BLUETOOTH permission", new Object[0]);
            return false;
        }
        BluetoothManager btManager = (BluetoothManager) ContextUtils.getApplicationContext().getSystemService("bluetooth");
        BluetoothAdapter btAdapter = btManager.getAdapter();
        if (btAdapter == null) {
            return false;
        }
        int profileConnectionState = btAdapter.getProfileConnectionState(1);
        return btAdapter.isEnabled() && profileConnectionState == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasUsbAudio() {
        try {
            Map<String, UsbDevice> devices = this.mUsbManager.getDeviceList();
            for (UsbDevice device : devices.values()) {
                if (hasUsbAudioCommInterface(device)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    private void registerForWiredHeadsetIntentBroadcast() {
        IntentFilter filter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        this.mWiredHeadsetReceiver = new BroadcastReceiver() { // from class: org.chromium.media.AudioManagerAndroid.1
            private static final int HAS_MIC = 1;
            private static final int HAS_NO_MIC = 0;
            private static final int STATE_PLUGGED = 1;
            private static final int STATE_UNPLUGGED = 0;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int state = intent.getIntExtra("state", 0);
                switch (state) {
                    case 0:
                        synchronized (AudioManagerAndroid.this.mLock) {
                            AudioManagerAndroid.this.mAudioDevices[1] = false;
                            if (!AudioManagerAndroid.this.hasUsbAudio()) {
                                if (AudioManagerAndroid.this.hasEarpiece()) {
                                    AudioManagerAndroid.this.mAudioDevices[2] = true;
                                    AudioManagerAndroid.this.mAudioDevices[4] = false;
                                }
                            } else {
                                AudioManagerAndroid.this.mAudioDevices[4] = true;
                                AudioManagerAndroid.this.mAudioDevices[2] = false;
                            }
                        }
                        break;
                    case 1:
                        synchronized (AudioManagerAndroid.this.mLock) {
                            AudioManagerAndroid.this.mAudioDevices[1] = true;
                            AudioManagerAndroid.this.mAudioDevices[2] = false;
                            AudioManagerAndroid.this.mAudioDevices[4] = false;
                        }
                        break;
                    default:
                        AudioManagerAndroid.loge("Invalid state");
                        break;
                }
                if (AudioManagerAndroid.this.deviceHasBeenRequested()) {
                    AudioManagerAndroid.this.updateDeviceActivation();
                }
            }
        };
        ContextUtils.getApplicationContext().registerReceiver(this.mWiredHeadsetReceiver, filter);
    }

    private void unregisterForWiredHeadsetIntentBroadcast() {
        ContextUtils.getApplicationContext().unregisterReceiver(this.mWiredHeadsetReceiver);
        this.mWiredHeadsetReceiver = null;
    }

    private void registerForBluetoothHeadsetIntentBroadcast() {
        IntentFilter filter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        this.mBluetoothHeadsetReceiver = new BroadcastReceiver() { // from class: org.chromium.media.AudioManagerAndroid.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int profileState = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                switch (profileState) {
                    case 0:
                        synchronized (AudioManagerAndroid.this.mLock) {
                            AudioManagerAndroid.this.mAudioDevices[3] = false;
                        }
                        return;
                    case 1:
                    case 3:
                        return;
                    case 2:
                        synchronized (AudioManagerAndroid.this.mLock) {
                            AudioManagerAndroid.this.mAudioDevices[3] = true;
                        }
                        return;
                    default:
                        AudioManagerAndroid.loge("Invalid state");
                        return;
                }
            }
        };
        ContextUtils.getApplicationContext().registerReceiver(this.mBluetoothHeadsetReceiver, filter);
    }

    private void unregisterForBluetoothHeadsetIntentBroadcast() {
        ContextUtils.getApplicationContext().unregisterReceiver(this.mBluetoothHeadsetReceiver);
        this.mBluetoothHeadsetReceiver = null;
    }

    private void registerForBluetoothScoIntentBroadcast() {
        IntentFilter filter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        this.mBluetoothScoReceiver = new BroadcastReceiver() { // from class: org.chromium.media.AudioManagerAndroid.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int state = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
                switch (state) {
                    case 0:
                        if (AudioManagerAndroid.this.mBluetoothScoState != 3 && AudioManagerAndroid.this.deviceHasBeenRequested()) {
                            AudioManagerAndroid.this.updateDeviceActivation();
                        }
                        AudioManagerAndroid.this.mBluetoothScoState = 0;
                        return;
                    case 1:
                        AudioManagerAndroid.this.mBluetoothScoState = 1;
                        return;
                    case 2:
                        return;
                    default:
                        AudioManagerAndroid.loge("Invalid state");
                        return;
                }
            }
        };
        ContextUtils.getApplicationContext().registerReceiver(this.mBluetoothScoReceiver, filter);
    }

    private void unregisterForBluetoothScoIntentBroadcast() {
        ContextUtils.getApplicationContext().unregisterReceiver(this.mBluetoothScoReceiver);
        this.mBluetoothScoReceiver = null;
    }

    private void startBluetoothSco() {
        int i;
        if (!this.mHasBluetoothPermission || (i = this.mBluetoothScoState) == 1 || i == 2) {
            return;
        }
        if (this.mAudioManager.isBluetoothScoOn()) {
            this.mBluetoothScoState = 1;
            return;
        }
        this.mBluetoothScoState = 2;
        this.mAudioManager.startBluetoothSco();
    }

    private void stopBluetoothSco() {
        if (!this.mHasBluetoothPermission) {
            return;
        }
        int i = this.mBluetoothScoState;
        if (i != 1 && i != 2) {
            return;
        }
        if (!this.mAudioManager.isBluetoothScoOn()) {
            loge("Unable to stop BT SCO since it is already disabled");
            this.mBluetoothScoState = 0;
            return;
        }
        this.mBluetoothScoState = 3;
        this.mAudioManager.stopBluetoothSco();
    }

    private void setAudioDevice(int device) {
        if (device == 3) {
            startBluetoothSco();
        } else {
            stopBluetoothSco();
        }
        switch (device) {
            case 0:
                setSpeakerphoneOn(true);
                break;
            case 1:
                setSpeakerphoneOn(false);
                break;
            case 2:
                setSpeakerphoneOn(false);
                break;
            case 3:
                break;
            case 4:
                setSpeakerphoneOn(false);
                break;
            default:
                loge("Invalid audio device selection");
                break;
        }
        reportUpdate();
    }

    private static int selectDefaultDevice(boolean[] devices) {
        if (devices[1]) {
            return 1;
        }
        if (devices[4]) {
            return 4;
        }
        if (devices[3]) {
            return 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean deviceHasBeenRequested() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mRequestedAudioDevice != -1;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDeviceActivation() {
        int requested;
        boolean[] devices;
        synchronized (this.mLock) {
            requested = this.mRequestedAudioDevice;
            devices = (boolean[]) this.mAudioDevices.clone();
        }
        if (requested == -1) {
            loge("Unable to activate device since no device is selected");
        } else if (requested == -2 || !devices[requested]) {
            int defaultDevice = selectDefaultDevice(devices);
            setAudioDevice(defaultDevice);
        } else {
            setAudioDevice(requested);
        }
    }

    private static int getNumOfAudioDevices(boolean[] devices) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (devices[i]) {
                count++;
            }
        }
        return count;
    }

    private void reportUpdate() {
    }

    private void logDeviceInfo() {
        logd("Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    private static void logd(String msg) {
        Log.d(TAG, msg, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loge(String msg) {
        Log.e(TAG, msg, new Object[0]);
    }

    private void startObservingVolumeChanges() {
        if (this.mSettingsObserverThread != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("SettingsObserver");
        this.mSettingsObserverThread = handlerThread;
        handlerThread.start();
        this.mSettingsObserver = new ContentObserver(new Handler(this.mSettingsObserverThread.getLooper())) { // from class: org.chromium.media.AudioManagerAndroid.4
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                int volume = AudioManagerAndroid.this.mAudioManager.getStreamVolume(0);
                AudioManagerAndroidJni.get().setMute(AudioManagerAndroid.this.mNativeAudioManagerAndroid, AudioManagerAndroid.this, volume == 0);
            }
        };
        this.mContentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, this.mSettingsObserver);
    }

    private void stopObservingVolumeChanges() {
        if (this.mSettingsObserverThread == null) {
            return;
        }
        this.mContentResolver.unregisterContentObserver(this.mSettingsObserver);
        this.mSettingsObserver = null;
        this.mSettingsObserverThread.quit();
        try {
            this.mSettingsObserverThread.join();
        } catch (InterruptedException e) {
            Log.e(TAG, "Thread.join() exception: ", e);
        }
        this.mSettingsObserverThread = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasUsbAudioCommInterface(UsbDevice device) {
        for (int i = 0; i < device.getInterfaceCount(); i++) {
            UsbInterface iface = device.getInterface(i);
            if (iface.getInterfaceClass() == 1 && iface.getInterfaceSubclass() == 2) {
                return true;
            }
        }
        return false;
    }

    private void registerForUsbAudioIntentBroadcast() {
        this.mUsbAudioReceiver = new BroadcastReceiver() { // from class: org.chromium.media.AudioManagerAndroid.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                UsbDevice device = (UsbDevice) intent.getParcelableExtra("device");
                if (AudioManagerAndroid.this.hasUsbAudioCommInterface(device)) {
                    if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(intent.getAction())) {
                        synchronized (AudioManagerAndroid.this.mLock) {
                            if (!AudioManagerAndroid.this.hasWiredHeadset()) {
                                AudioManagerAndroid.this.mAudioDevices[4] = true;
                                AudioManagerAndroid.this.mAudioDevices[2] = false;
                            }
                        }
                    } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(intent.getAction()) && !AudioManagerAndroid.this.hasUsbAudio()) {
                        synchronized (AudioManagerAndroid.this.mLock) {
                            if (!AudioManagerAndroid.this.hasWiredHeadset()) {
                                AudioManagerAndroid.this.mAudioDevices[4] = false;
                                if (AudioManagerAndroid.this.hasEarpiece()) {
                                    AudioManagerAndroid.this.mAudioDevices[2] = true;
                                }
                            }
                        }
                    }
                    if (AudioManagerAndroid.this.deviceHasBeenRequested()) {
                        AudioManagerAndroid.this.updateDeviceActivation();
                    }
                }
            }
        };
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        ContextUtils.getApplicationContext().registerReceiver(this.mUsbAudioReceiver, filter);
    }

    private void unregisterForUsbAudioIntentBroadcast() {
        ContextUtils.getApplicationContext().unregisterReceiver(this.mUsbAudioReceiver);
        this.mUsbAudioReceiver = null;
    }
}
