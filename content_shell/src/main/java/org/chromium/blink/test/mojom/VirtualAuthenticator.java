package org.chromium.blink.test.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VirtualAuthenticator extends Interface {
    public static final Manager<VirtualAuthenticator, Proxy> MANAGER = VirtualAuthenticator_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddRegistrationResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface ClearRegistrationsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetLargeBlobResponse extends Callbacks.Callback1<byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetRegistrationsResponse extends Callbacks.Callback1<RegisteredKey[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetUniqueIdResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VirtualAuthenticator, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveRegistrationResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetLargeBlobResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetUserVerifiedResponse extends Callbacks.Callback0 {
    }

    void addRegistration(RegisteredKey registeredKey, AddRegistrationResponse addRegistrationResponse);

    void clearRegistrations(ClearRegistrationsResponse clearRegistrationsResponse);

    void getLargeBlob(byte[] bArr, GetLargeBlobResponse getLargeBlobResponse);

    void getRegistrations(GetRegistrationsResponse getRegistrationsResponse);

    void getUniqueId(GetUniqueIdResponse getUniqueIdResponse);

    void removeRegistration(byte[] bArr, RemoveRegistrationResponse removeRegistrationResponse);

    void setLargeBlob(byte[] bArr, byte[] bArr2, SetLargeBlobResponse setLargeBlobResponse);

    void setUserVerified(boolean z, SetUserVerifiedResponse setUserVerifiedResponse);
}
