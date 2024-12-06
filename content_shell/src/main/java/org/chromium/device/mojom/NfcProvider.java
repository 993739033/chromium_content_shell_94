package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface NfcProvider extends Interface {
    public static final Manager<NfcProvider, Proxy> MANAGER = NfcProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NfcProvider, Interface.Proxy {
    }

    void getNfcForHost(int i, InterfaceRequest<Nfc> interfaceRequest);

    void resumeNfcOperations();

    void suspendNfcOperations();
}
