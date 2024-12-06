package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SubresourceLoaderUpdater extends Interface {
    public static final Manager<SubresourceLoaderUpdater, Proxy> MANAGER = SubresourceLoaderUpdater_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SubresourceLoaderUpdater, Interface.Proxy {
    }

    void updateSubresourceLoaderFactories(UrlLoaderFactoryBundle urlLoaderFactoryBundle);
}
