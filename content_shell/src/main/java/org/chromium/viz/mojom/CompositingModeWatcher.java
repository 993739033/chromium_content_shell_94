package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CompositingModeWatcher extends Interface {
    public static final Manager<CompositingModeWatcher, Proxy> MANAGER = CompositingModeWatcher_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CompositingModeWatcher, Interface.Proxy {
    }

    void compositingModeFallbackToSoftware();
}
