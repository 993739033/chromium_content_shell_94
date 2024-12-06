package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface FederatedAuthRequest extends Interface {
    public static final Manager<FederatedAuthRequest, Proxy> MANAGER = FederatedAuthRequest_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface LogoutResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FederatedAuthRequest, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestIdTokenResponse extends Callbacks.Callback2<Integer, String> {
    }

    void logout(String[] strArr, LogoutResponse logoutResponse);

    void requestIdToken(Url url, String str, String str2, int i, RequestIdTokenResponse requestIdTokenResponse);
}
