package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.BigBuffer;
/* loaded from: classes2.dex */
public interface UrlLoaderClient extends Interface {
    public static final Manager<UrlLoaderClient, Proxy> MANAGER = UrlLoaderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnUploadProgressResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends UrlLoaderClient, Interface.Proxy {
    }

    void onComplete(UrlLoaderCompletionStatus urlLoaderCompletionStatus);

    void onReceiveCachedMetadata(BigBuffer bigBuffer);

    void onReceiveEarlyHints(EarlyHints earlyHints);

    void onReceiveRedirect(UrlRequestRedirectInfo urlRequestRedirectInfo, UrlResponseHead urlResponseHead);

    void onReceiveResponse(UrlResponseHead urlResponseHead);

    void onStartLoadingResponseBody(DataPipe.ConsumerHandle consumerHandle);

    void onTransferSizeUpdated(int i);

    void onUploadProgress(long j, long j2, OnUploadProgressResponse onUploadProgressResponse);
}
