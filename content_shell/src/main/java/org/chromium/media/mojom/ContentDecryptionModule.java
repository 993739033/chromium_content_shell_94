package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ContentDecryptionModule extends Interface {
    public static final Manager<ContentDecryptionModule, Proxy> MANAGER = ContentDecryptionModule_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CloseSessionResponse extends Callbacks.Callback1<CdmPromiseResult> {
    }

    /* loaded from: classes2.dex */
    public interface CreateSessionAndGenerateRequestResponse extends Callbacks.Callback2<CdmPromiseResult, String> {
    }

    /* loaded from: classes2.dex */
    public interface GetStatusForPolicyResponse extends Callbacks.Callback2<CdmPromiseResult, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface LoadSessionResponse extends Callbacks.Callback2<CdmPromiseResult, String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ContentDecryptionModule, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveSessionResponse extends Callbacks.Callback1<CdmPromiseResult> {
    }

    /* loaded from: classes2.dex */
    public interface SetServerCertificateResponse extends Callbacks.Callback1<CdmPromiseResult> {
    }

    /* loaded from: classes2.dex */
    public interface UpdateSessionResponse extends Callbacks.Callback1<CdmPromiseResult> {
    }

    void closeSession(String str, CloseSessionResponse closeSessionResponse);

    void createSessionAndGenerateRequest(int i, int i2, byte[] bArr, CreateSessionAndGenerateRequestResponse createSessionAndGenerateRequestResponse);

    void getStatusForPolicy(int i, GetStatusForPolicyResponse getStatusForPolicyResponse);

    void loadSession(int i, String str, LoadSessionResponse loadSessionResponse);

    void removeSession(String str, RemoveSessionResponse removeSessionResponse);

    void setClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);

    void setServerCertificate(byte[] bArr, SetServerCertificateResponse setServerCertificateResponse);

    void updateSession(String str, byte[] bArr, UpdateSessionResponse updateSessionResponse);
}
