package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.FilePath;
import org.chromium.mojo_base.mojom.ReadOnlyFile;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface NetworkContextClient extends Interface {
    public static final Manager<NetworkContextClient, Proxy> MANAGER = NetworkContextClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnCanSendDomainReliabilityUploadResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface OnCanSendReportingReportsResponse extends Callbacks.Callback1<Origin[]> {
    }

    /* loaded from: classes2.dex */
    public interface OnFileUploadRequestedResponse extends Callbacks.Callback2<Integer, ReadOnlyFile[]> {
    }

    /* loaded from: classes2.dex */
    public interface OnGenerateHttpNegotiateAuthTokenResponse extends Callbacks.Callback2<Integer, String> {
    }

    /* loaded from: classes2.dex */
    public interface OnTrustTokenIssuanceDivertedToSystemResponse extends Callbacks.Callback1<FulfillTrustTokenIssuanceAnswer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkContextClient, Interface.Proxy {
    }

    void onCanSendDomainReliabilityUpload(Url url, OnCanSendDomainReliabilityUploadResponse onCanSendDomainReliabilityUploadResponse);

    void onCanSendReportingReports(Origin[] originArr, OnCanSendReportingReportsResponse onCanSendReportingReportsResponse);

    void onFileUploadRequested(int i, boolean z, FilePath[] filePathArr, OnFileUploadRequestedResponse onFileUploadRequestedResponse);

    void onGenerateHttpNegotiateAuthToken(String str, boolean z, String str2, String str3, OnGenerateHttpNegotiateAuthTokenResponse onGenerateHttpNegotiateAuthTokenResponse);

    void onTrustTokenIssuanceDivertedToSystem(FulfillTrustTokenIssuanceRequest fulfillTrustTokenIssuanceRequest, OnTrustTokenIssuanceDivertedToSystemResponse onTrustTokenIssuanceDivertedToSystemResponse);
}
