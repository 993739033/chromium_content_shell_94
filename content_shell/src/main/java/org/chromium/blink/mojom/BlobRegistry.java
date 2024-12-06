package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface BlobRegistry extends Interface {
    public static final Manager<BlobRegistry, Proxy> MANAGER = BlobRegistry_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetBlobFromUuidResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BlobRegistry, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RegisterFromStreamResponse extends Callbacks.Callback1<SerializedBlob> {
    }

    /* loaded from: classes2.dex */
    public interface RegisterResponse extends Callbacks.Callback0 {
    }

    void getBlobFromUuid(InterfaceRequest<Blob> interfaceRequest, String str, GetBlobFromUuidResponse getBlobFromUuidResponse);

    void register(InterfaceRequest<Blob> interfaceRequest, String str, String str2, String str3, DataElement[] dataElementArr, RegisterResponse registerResponse);

    void registerFromStream(String str, String str2, long j, DataPipe.ConsumerHandle consumerHandle, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, RegisterFromStreamResponse registerFromStreamResponse);

    void urlStoreForOrigin(Origin origin, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported);
}
