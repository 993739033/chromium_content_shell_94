package org.chromium.blink.test.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface StorageAccessAutomation extends Interface {
    public static final Manager<StorageAccessAutomation, Proxy> MANAGER = StorageAccessAutomation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends StorageAccessAutomation, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetStorageAccessResponse extends Callbacks.Callback1<Boolean> {
    }

    void setStorageAccess(String str, String str2, boolean z, SetStorageAccessResponse setStorageAccessResponse);
}
