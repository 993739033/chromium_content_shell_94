package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface CredentialManager extends Interface {
    public static final Manager<CredentialManager, Proxy> MANAGER = CredentialManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetResponse extends Callbacks.Callback2<Integer, CredentialInfo> {
    }

    /* loaded from: classes2.dex */
    public interface PreventSilentAccessResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CredentialManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StoreResponse extends Callbacks.Callback0 {
    }

    void get(int i, boolean z, Url[] urlArr, GetResponse getResponse);

    void preventSilentAccess(PreventSilentAccessResponse preventSilentAccessResponse);

    void store(CredentialInfo credentialInfo, StoreResponse storeResponse);
}
