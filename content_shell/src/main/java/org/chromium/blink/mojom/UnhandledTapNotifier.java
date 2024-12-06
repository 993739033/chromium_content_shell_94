package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface UnhandledTapNotifier extends Interface {
    public static final Manager<UnhandledTapNotifier, Proxy> MANAGER = UnhandledTapNotifier_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends UnhandledTapNotifier, Interface.Proxy {
    }

    void showUnhandledTapUiIfNeeded(UnhandledTapInfo unhandledTapInfo);
}
