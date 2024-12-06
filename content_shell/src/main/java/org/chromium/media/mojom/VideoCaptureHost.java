package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface VideoCaptureHost extends Interface {
    public static final Manager<VideoCaptureHost, Proxy> MANAGER = VideoCaptureHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDeviceFormatsInUseResponse extends Callbacks.Callback1<VideoCaptureFormat[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetDeviceSupportedFormatsResponse extends Callbacks.Callback1<VideoCaptureFormat[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoCaptureHost, Interface.Proxy {
    }

    void getDeviceFormatsInUse(UnguessableToken unguessableToken, UnguessableToken unguessableToken2, GetDeviceFormatsInUseResponse getDeviceFormatsInUseResponse);

    void getDeviceSupportedFormats(UnguessableToken unguessableToken, UnguessableToken unguessableToken2, GetDeviceSupportedFormatsResponse getDeviceSupportedFormatsResponse);

    void onFrameDropped(UnguessableToken unguessableToken, int i);

    void onLog(UnguessableToken unguessableToken, String str);

    void pause(UnguessableToken unguessableToken);

    void releaseBuffer(UnguessableToken unguessableToken, int i, VideoCaptureFeedback videoCaptureFeedback);

    void requestRefreshFrame(UnguessableToken unguessableToken);

    void resume(UnguessableToken unguessableToken, UnguessableToken unguessableToken2, VideoCaptureParams videoCaptureParams);

    void start(UnguessableToken unguessableToken, UnguessableToken unguessableToken2, VideoCaptureParams videoCaptureParams, VideoCaptureObserver videoCaptureObserver);

    void stop(UnguessableToken unguessableToken);
}
