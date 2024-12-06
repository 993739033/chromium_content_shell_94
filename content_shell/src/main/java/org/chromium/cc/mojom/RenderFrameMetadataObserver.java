package org.chromium.cc.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RenderFrameMetadataObserver extends Interface {
    public static final Manager<RenderFrameMetadataObserver, Proxy> MANAGER = RenderFrameMetadataObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RenderFrameMetadataObserver, Interface.Proxy {
    }

    void reportAllFrameSubmissionsForTesting(boolean z);

    void reportAllRootScrolls(boolean z);
}
