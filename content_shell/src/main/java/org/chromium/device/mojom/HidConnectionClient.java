package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HidConnectionClient extends Interface {
    public static final Manager<HidConnectionClient, Proxy> MANAGER = HidConnectionClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends HidConnectionClient, Interface.Proxy {
    }

    void onInputReport(byte b, byte[] bArr);
}
