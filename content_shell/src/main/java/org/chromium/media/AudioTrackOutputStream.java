package org.chromium.media;

import android.media.AudioTrack;
import android.os.Build;
import java.nio.ByteBuffer;
import org.chromium.base.Log;
import org.chromium.base.annotations.JNINamespace;
@JNINamespace("media")
/* loaded from: classes2.dex */
class AudioTrackOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CHANNEL_ALIGNMENT = 16;
    private static final String TAG = "AudioTrackOutput";
    private AudioTrack mAudioTrack;
    private int mBufferSizeInBytes;
    private Callback mCallback;
    private int mLastPlaybackHeadPosition;
    private int mLeftSize;
    private long mNativeAudioTrackOutputStream;
    private ByteBuffer mReadBuffer;
    private long mTotalPlayedFrames;
    private long mTotalReadFrames;
    private WorkerThread mWorkerThread;
    private ByteBuffer mWriteBuffer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Callback {
        AudioTrack createAudioTrack(int i, int i2, int i3, int i4, int i5, int i6);

        long getAddress(ByteBuffer byteBuffer);

        int getMinBufferSize(int i, int i2, int i3);

        void onError();

        AudioBufferInfo onMoreData(ByteBuffer byteBuffer, long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        long getAddress(long j, AudioTrackOutputStream audioTrackOutputStream, ByteBuffer byteBuffer);

        void onError(long j, AudioTrackOutputStream audioTrackOutputStream);

        AudioBufferInfo onMoreData(long j, AudioTrackOutputStream audioTrackOutputStream, ByteBuffer byteBuffer, long j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AudioBufferInfo {
        private final int mNumBytes;
        private final int mNumFrames;

        public AudioBufferInfo(int frames, int bytes) {
            this.mNumFrames = frames;
            this.mNumBytes = bytes;
        }

        public int getNumFrames() {
            return this.mNumFrames;
        }

        public int getNumBytes() {
            return this.mNumBytes;
        }
    }

    /* loaded from: classes2.dex */
    class WorkerThread extends Thread {
        private volatile boolean mDone;

        WorkerThread() {
        }

        public void finish() {
            this.mDone = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int left;
            while (!this.mDone && (left = AudioTrackOutputStream.this.writeData()) >= 0) {
                if (left <= 0) {
                    AudioTrackOutputStream.this.readMoreData();
                }
            }
        }
    }

    private static AudioTrackOutputStream create() {
        return new AudioTrackOutputStream(null);
    }

    static AudioTrackOutputStream create(Callback callback) {
        return new AudioTrackOutputStream(callback);
    }

    private AudioTrackOutputStream(Callback callback) {
        this.mCallback = callback;
        if (callback != null) {
            return;
        }
        this.mCallback = new Callback() { // from class: org.chromium.media.AudioTrackOutputStream.1
            @Override // org.chromium.media.AudioTrackOutputStream.Callback
            public int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) {
                return AudioTrack.getMinBufferSize(sampleRateInHz, channelConfig, audioFormat);
            }

            @Override // org.chromium.media.AudioTrackOutputStream.Callback
            public AudioTrack createAudioTrack(int streamType, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes, int mode) {
                return new AudioTrack(streamType, sampleRateInHz, channelConfig, audioFormat, bufferSizeInBytes, mode);
            }

            @Override // org.chromium.media.AudioTrackOutputStream.Callback
            public AudioBufferInfo onMoreData(ByteBuffer audioData, long delayInFrames) {
                return AudioTrackOutputStreamJni.get().onMoreData(AudioTrackOutputStream.this.mNativeAudioTrackOutputStream, AudioTrackOutputStream.this, audioData, delayInFrames);
            }

            @Override // org.chromium.media.AudioTrackOutputStream.Callback
            public long getAddress(ByteBuffer byteBuffer) {
                return AudioTrackOutputStreamJni.get().getAddress(AudioTrackOutputStream.this.mNativeAudioTrackOutputStream, AudioTrackOutputStream.this, byteBuffer);
            }

            @Override // org.chromium.media.AudioTrackOutputStream.Callback
            public void onError() {
                AudioTrackOutputStreamJni.get().onError(AudioTrackOutputStream.this.mNativeAudioTrackOutputStream, AudioTrackOutputStream.this);
            }
        };
    }

    private int getChannelConfig(int channelCount) {
        switch (channelCount) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
            case 5:
            case 7:
            default:
                return 1;
            case 4:
                return 204;
            case 6:
                return 252;
            case 8:
                if (Build.VERSION.SDK_INT >= 23) {
                    return 6396;
                }
                return 1020;
        }
    }

    boolean open(int channelCount, int sampleRate, int sampleFormat) {
        if (this.mAudioTrack != null) {
            throw new AssertionError();
        }
        int channelConfig = getChannelConfig(channelCount);
        this.mBufferSizeInBytes = this.mCallback.getMinBufferSize(sampleRate, channelConfig, sampleFormat) * 3;
        try {
            Log.d(TAG, "Crate AudioTrack with sample rate:%d, channel:%d, format:%d ", Integer.valueOf(sampleRate), Integer.valueOf(channelConfig), Integer.valueOf(sampleFormat));
            AudioTrack createAudioTrack = this.mCallback.createAudioTrack(3, sampleRate, channelConfig, sampleFormat, this.mBufferSizeInBytes, 1);
            this.mAudioTrack = createAudioTrack;
            if (createAudioTrack == null) {
                throw new AssertionError();
            } else if (createAudioTrack.getState() == 0) {
                Log.e(TAG, "Cannot create AudioTrack", new Object[0]);
                this.mAudioTrack = null;
                return false;
            } else {
                this.mLastPlaybackHeadPosition = 0;
                this.mTotalPlayedFrames = 0L;
                return true;
            }
        } catch (IllegalArgumentException ile) {
            Log.e(TAG, "Exception creating AudioTrack for playback: ", ile);
            return false;
        }
    }

    private ByteBuffer allocateAlignedByteBuffer(int capacity, int alignment) {
        int mask = alignment - 1;
        ByteBuffer buffer = ByteBuffer.allocateDirect(capacity + mask);
        long address = this.mCallback.getAddress(buffer);
        int offset = (alignment - ((int) (mask & address))) & mask;
        buffer.position(offset);
        buffer.limit(offset + capacity);
        return buffer.slice();
    }

    void start(long nativeAudioTrackOutputStream) {
        Log.d(TAG, "AudioTrackOutputStream.start()", new Object[0]);
        if (this.mWorkerThread != null) {
            return;
        }
        this.mNativeAudioTrackOutputStream = nativeAudioTrackOutputStream;
        this.mTotalReadFrames = 0L;
        this.mReadBuffer = allocateAlignedByteBuffer(this.mBufferSizeInBytes, 16);
        this.mAudioTrack.play();
        WorkerThread workerThread = new WorkerThread();
        this.mWorkerThread = workerThread;
        workerThread.start();
    }

    void stop() {
        Log.d(TAG, "AudioTrackOutputStream.stop()", new Object[0]);
        WorkerThread workerThread = this.mWorkerThread;
        if (workerThread != null) {
            workerThread.finish();
            try {
                this.mWorkerThread.interrupt();
                this.mWorkerThread.join();
            } catch (InterruptedException e) {
                Log.e(TAG, "Exception while waiting for AudioTrack worker thread finished: ", e);
            } catch (SecurityException e2) {
                Log.e(TAG, "Exception while waiting for AudioTrack worker thread finished: ", e2);
            }
            this.mWorkerThread = null;
        }
        this.mAudioTrack.pause();
        this.mAudioTrack.flush();
        this.mLastPlaybackHeadPosition = 0;
        this.mTotalPlayedFrames = 0L;
        this.mNativeAudioTrackOutputStream = 0L;
    }

    void setVolume(double volume) {
        float scaledVolume = (float) (AudioTrack.getMaxVolume() * volume);
        this.mAudioTrack.setStereoVolume(scaledVolume, scaledVolume);
    }

    void close() {
        Log.d(TAG, "AudioTrackOutputStream.close()", new Object[0]);
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.mAudioTrack = null;
        }
    }

    AudioBufferInfo createAudioBufferInfo(int frames, int size) {
        return new AudioBufferInfo(frames, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readMoreData() {
        if (this.mNativeAudioTrackOutputStream == 0) {
            throw new AssertionError();
        }
        int position = this.mAudioTrack.getPlaybackHeadPosition();
        long j = this.mTotalPlayedFrames + (position - this.mLastPlaybackHeadPosition);
        this.mTotalPlayedFrames = j;
        this.mLastPlaybackHeadPosition = position;
        long delayInFrames = this.mTotalReadFrames - j;
        if (delayInFrames < 0) {
            delayInFrames = 0;
        }
        AudioBufferInfo info = this.mCallback.onMoreData(this.mReadBuffer.duplicate(), delayInFrames);
        if (info == null || info.getNumBytes() <= 0) {
            return;
        }
        this.mTotalReadFrames += info.getNumFrames();
        this.mWriteBuffer = this.mReadBuffer.asReadOnlyBuffer();
        this.mLeftSize = info.getNumBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int writeData() {
        if (this.mLeftSize == 0) {
            return 0;
        }
        int written = writeAudioTrack();
        if (written < 0) {
            Log.e(TAG, "AudioTrack.write() failed. Error:" + written, new Object[0]);
            this.mCallback.onError();
            return written;
        }
        int i = this.mLeftSize;
        if (i < written) {
            throw new AssertionError();
        }
        int i2 = i - written;
        this.mLeftSize = i2;
        return i2;
    }

    private int writeAudioTrack() {
        return this.mAudioTrack.write(this.mWriteBuffer, this.mLeftSize, 0);
    }
}
