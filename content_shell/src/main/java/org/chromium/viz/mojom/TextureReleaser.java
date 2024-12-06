package org.chromium.viz.mojom;

import org.chromium.gpu.mojom.SyncToken;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface TextureReleaser extends Interface {
    public static final Manager<TextureReleaser, Proxy> MANAGER = TextureReleaser_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends TextureReleaser, Interface.Proxy {
    }

    void release(SyncToken syncToken, boolean z);
}
