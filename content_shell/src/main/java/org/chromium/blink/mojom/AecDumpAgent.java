package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AecDumpAgent extends Interface {
    public static final Manager<AecDumpAgent, Proxy> MANAGER = AecDumpAgent_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AecDumpAgent, Interface.Proxy {
    }

    void start(org.chromium.mojo_base.mojom.File file);

    void stop();
}
