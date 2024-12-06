package org.chromium.cert_verifier.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.network.mojom.UrlLoaderFactory;
/* loaded from: classes2.dex */
public interface UrlLoaderFactoryConnector extends Interface {
    public static final Manager<UrlLoaderFactoryConnector, Proxy> MANAGER = UrlLoaderFactoryConnector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends UrlLoaderFactoryConnector, Interface.Proxy {
    }

    void createUrlLoaderFactory(InterfaceRequest<UrlLoaderFactory> interfaceRequest);
}
