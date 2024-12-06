package org.chromium.data_decoder.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.BigBuffer;
/* loaded from: classes2.dex */
public interface ResourceSnapshotForWebBundle extends Interface {
    public static final Manager<ResourceSnapshotForWebBundle, Proxy> MANAGER = ResourceSnapshotForWebBundle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetResourceBodyResponse extends Callbacks.Callback1<BigBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface GetResourceCountResponse extends Callbacks.Callback1<Long> {
    }

    /* loaded from: classes2.dex */
    public interface GetResourceInfoResponse extends Callbacks.Callback1<SerializedResourceInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ResourceSnapshotForWebBundle, Interface.Proxy {
    }

    void getResourceBody(long j, GetResourceBodyResponse getResourceBodyResponse);

    void getResourceCount(GetResourceCountResponse getResourceCountResponse);

    void getResourceInfo(long j, GetResourceInfoResponse getResourceInfoResponse);
}
