package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BackForwardCacheControllerHost extends Interface {
    public static final Manager<BackForwardCacheControllerHost, Proxy> MANAGER = BackForwardCacheControllerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BackForwardCacheControllerHost, Interface.Proxy {
    }

    void evictFromBackForwardCache(int i);
}
