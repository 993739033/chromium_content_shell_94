package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FrameSinkBundleClient extends Interface {
    public static final Manager<FrameSinkBundleClient, Proxy> MANAGER = FrameSinkBundleClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameSinkBundleClient, Interface.Proxy {
    }

    void flushNotifications(BundledReturnedResources[] bundledReturnedResourcesArr, BeginFrameInfo[] beginFrameInfoArr, BundledReturnedResources[] bundledReturnedResourcesArr2);

    void onBeginFramePausedChanged(int i, boolean z);

    void onCompositorFrameTransitionDirectiveProcessed(int i, int i2);
}
