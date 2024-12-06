package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CdmDocumentService extends Interface {
    public static final Manager<CdmDocumentService, Proxy> MANAGER = CdmDocumentService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChallengePlatformResponse extends Callbacks.Callback4<Boolean, String, String, String> {
    }

    /* loaded from: classes2.dex */
    public interface GetStorageIdResponse extends Callbacks.Callback2<Integer, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CdmDocumentService, Interface.Proxy {
    }

    void challengePlatform(String str, String str2, ChallengePlatformResponse challengePlatformResponse);

    void getStorageId(int i, GetStorageIdResponse getStorageIdResponse);
}
