package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface MediaService extends Interface {
    public static final Manager<MediaService, Proxy> MANAGER = MediaService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaService, Interface.Proxy {
    }

    void createInterfaceFactory(InterfaceRequest<InterfaceFactory> interfaceRequest, FrameInterfaceFactory frameInterfaceFactory);
}
