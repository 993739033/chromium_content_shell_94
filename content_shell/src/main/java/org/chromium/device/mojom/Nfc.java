package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Nfc extends Interface {
    public static final Manager<Nfc, Proxy> MANAGER = Nfc_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends Nfc, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface PushResponse extends Callbacks.Callback1<NdefError> {
    }

    /* loaded from: classes2.dex */
    public interface WatchResponse extends Callbacks.Callback1<NdefError> {
    }

    void cancelPush();

    void cancelWatch(int i);

    void push(NdefMessage ndefMessage, NdefWriteOptions ndefWriteOptions, PushResponse pushResponse);

    void setClient(NfcClient nfcClient);

    void watch(int i, WatchResponse watchResponse);
}
