package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FlingingRendererClientExtension extends Interface {
    public static final Manager<FlingingRendererClientExtension, Proxy> MANAGER = FlingingRendererClientExtension_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FlingingRendererClientExtension, Interface.Proxy {
    }

    void onRemotePlayStateChange(int i);
}
