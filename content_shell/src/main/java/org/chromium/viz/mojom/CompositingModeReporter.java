package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CompositingModeReporter extends Interface {
    public static final Manager<CompositingModeReporter, Proxy> MANAGER = CompositingModeReporter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CompositingModeReporter, Interface.Proxy {
    }

    void addCompositingModeWatcher(CompositingModeWatcher compositingModeWatcher);
}
