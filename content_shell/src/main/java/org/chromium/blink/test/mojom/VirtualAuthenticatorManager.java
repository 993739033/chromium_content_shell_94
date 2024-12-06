package org.chromium.blink.test.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VirtualAuthenticatorManager extends Interface {
    public static final Manager<VirtualAuthenticatorManager, Proxy> MANAGER = VirtualAuthenticatorManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ClearAuthenticatorsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface CreateAuthenticatorResponse extends Callbacks.Callback1<VirtualAuthenticator> {
    }

    /* loaded from: classes2.dex */
    public interface GetAuthenticatorsResponse extends Callbacks.Callback1<VirtualAuthenticator[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VirtualAuthenticatorManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveAuthenticatorResponse extends Callbacks.Callback1<Boolean> {
    }

    void clearAuthenticators(ClearAuthenticatorsResponse clearAuthenticatorsResponse);

    void createAuthenticator(VirtualAuthenticatorOptions virtualAuthenticatorOptions, CreateAuthenticatorResponse createAuthenticatorResponse);

    void getAuthenticators(GetAuthenticatorsResponse getAuthenticatorsResponse);

    void removeAuthenticator(String str, RemoveAuthenticatorResponse removeAuthenticatorResponse);
}
