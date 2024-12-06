package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VideoDetectorObserver extends Interface {
    public static final Manager<VideoDetectorObserver, Proxy> MANAGER = VideoDetectorObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoDetectorObserver, Interface.Proxy {
    }

    void onVideoActivityEnded();

    void onVideoActivityStarted();
}
