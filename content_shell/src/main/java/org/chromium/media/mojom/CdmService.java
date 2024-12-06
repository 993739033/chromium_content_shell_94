package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface CdmService extends Interface {
    public static final Manager<CdmService, Proxy> MANAGER = CdmService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CdmService, Interface.Proxy {
    }

    void createCdmFactory(InterfaceRequest<CdmFactory> interfaceRequest, FrameInterfaceFactory frameInterfaceFactory);
}
