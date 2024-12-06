package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PeerConnectionManager extends Interface {
    public static final Manager<PeerConnectionManager, Proxy> MANAGER = PeerConnectionManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PeerConnectionManager, Interface.Proxy {
    }

    void getLegacyStats();

    void getStandardStats();

    void onSuspend();

    void onThermalStateChange(int i);

    void startEventLog(int i, int i2);

    void stopEventLog(int i);
}
