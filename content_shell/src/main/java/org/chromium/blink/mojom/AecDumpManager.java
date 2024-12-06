package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AecDumpManager extends Interface {
    public static final Manager<AecDumpManager, Proxy> MANAGER = AecDumpManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AecDumpManager, Interface.Proxy {
    }

    void add(AecDumpAgent aecDumpAgent);
}
