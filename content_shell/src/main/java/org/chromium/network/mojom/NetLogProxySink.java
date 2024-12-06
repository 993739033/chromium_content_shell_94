package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.Value;
/* loaded from: classes2.dex */
public interface NetLogProxySink extends Interface {
    public static final Manager<NetLogProxySink, Proxy> MANAGER = NetLogProxySink_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetLogProxySink, Interface.Proxy {
    }

    void addEntry(int i, int i2, int i3, TimeTicks timeTicks, int i4, TimeTicks timeTicks2, Value value);
}
