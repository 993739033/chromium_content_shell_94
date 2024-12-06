package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NfcClient extends Interface {
    public static final Manager<NfcClient, Proxy> MANAGER = NfcClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NfcClient, Interface.Proxy {
    }

    void onError(NdefError ndefError);

    void onWatch(int[] iArr, String str, NdefMessage ndefMessage);
}
