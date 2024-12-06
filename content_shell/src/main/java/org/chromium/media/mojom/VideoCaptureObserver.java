package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VideoCaptureObserver extends Interface {
    public static final Manager<VideoCaptureObserver, Proxy> MANAGER = VideoCaptureObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoCaptureObserver, Interface.Proxy {
    }

    void onBufferDestroyed(int i);

    void onBufferReady(ReadyBuffer readyBuffer, ReadyBuffer[] readyBufferArr);

    void onNewBuffer(int i, VideoBufferHandle videoBufferHandle);

    void onStateChanged(int i);
}
