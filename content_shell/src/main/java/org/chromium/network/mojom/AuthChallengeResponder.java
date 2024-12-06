package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AuthChallengeResponder extends Interface {
    public static final Manager<AuthChallengeResponder, Proxy> MANAGER = AuthChallengeResponder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AuthChallengeResponder, Interface.Proxy {
    }

    void onAuthCredentials(AuthCredentials authCredentials);
}
