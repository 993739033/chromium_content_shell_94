package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FederatedAuthResponse extends Interface {
    public static final Manager<FederatedAuthResponse, Proxy> MANAGER = FederatedAuthResponse_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ProvideIdTokenResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FederatedAuthResponse, Interface.Proxy {
    }

    void provideIdToken(String str, ProvideIdTokenResponse provideIdTokenResponse);
}
