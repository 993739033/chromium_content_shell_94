package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.GenericPendingReceiver;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface FrameInterfaceFactory extends Interface {
    public static final Manager<FrameInterfaceFactory, Proxy> MANAGER = FrameInterfaceFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetCdmOriginResponse extends Callbacks.Callback1<Origin> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameInterfaceFactory, Interface.Proxy {
    }

    void bindEmbedderReceiver(GenericPendingReceiver genericPendingReceiver);

    void createCdmStorage(InterfaceRequest<CdmStorage> interfaceRequest);

    void createProvisionFetcher(InterfaceRequest<ProvisionFetcher> interfaceRequest);

    void getCdmOrigin(GetCdmOriginResponse getCdmOriginResponse);
}
