package org.chromium.blink.mojom;

import org.chromium.media.mojom.VideoCaptureFormat;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaDevicesDispatcherHost extends Interface {
    public static final Manager<MediaDevicesDispatcherHost, Proxy> MANAGER = MediaDevicesDispatcherHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnumerateDevicesResponse extends Callbacks.Callback3<MediaDeviceInfo[][], VideoInputDeviceCapabilities[], AudioInputDeviceCapabilities[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllVideoInputDeviceFormatsResponse extends Callbacks.Callback1<VideoCaptureFormat[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetAudioInputCapabilitiesResponse extends Callbacks.Callback1<AudioInputDeviceCapabilities[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetAvailableVideoInputDeviceFormatsResponse extends Callbacks.Callback1<VideoCaptureFormat[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetVideoInputCapabilitiesResponse extends Callbacks.Callback1<VideoInputDeviceCapabilities[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaDevicesDispatcherHost, Interface.Proxy {
    }

    void addMediaDevicesListener(boolean z, boolean z2, boolean z3, MediaDevicesListener mediaDevicesListener);

    void enumerateDevices(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumerateDevicesResponse enumerateDevicesResponse);

    void getAllVideoInputDeviceFormats(String str, GetAllVideoInputDeviceFormatsResponse getAllVideoInputDeviceFormatsResponse);

    void getAudioInputCapabilities(GetAudioInputCapabilitiesResponse getAudioInputCapabilitiesResponse);

    void getAvailableVideoInputDeviceFormats(String str, GetAvailableVideoInputDeviceFormatsResponse getAvailableVideoInputDeviceFormatsResponse);

    void getVideoInputCapabilities(GetVideoInputCapabilitiesResponse getVideoInputCapabilitiesResponse);

    void setCaptureHandleConfig(CaptureHandleConfig captureHandleConfig);
}
