package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Authenticator extends Interface {
    public static final Manager<Authenticator, Proxy> MANAGER = Authenticator_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetAssertionResponse extends Callbacks.Callback2<Integer, GetAssertionAuthenticatorResponse> {
    }

    /* loaded from: classes2.dex */
    public interface IsUserVerifyingPlatformAuthenticatorAvailableResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface MakeCredentialResponse extends Callbacks.Callback2<Integer, MakeCredentialAuthenticatorResponse> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Authenticator, Interface.Proxy {
    }

    void cancel();

    void getAssertion(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, GetAssertionResponse getAssertionResponse);

    void isUserVerifyingPlatformAuthenticatorAvailable(IsUserVerifyingPlatformAuthenticatorAvailableResponse isUserVerifyingPlatformAuthenticatorAvailableResponse);

    void makeCredential(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, MakeCredentialResponse makeCredentialResponse);
}
