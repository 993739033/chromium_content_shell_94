package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BlobReaderClient extends Interface {
    public static final Manager<BlobReaderClient, Proxy> MANAGER = BlobReaderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BlobReaderClient, Interface.Proxy {
    }

    void onCalculatedSize(long j, long j2);

    void onComplete(int i, long j);
}
