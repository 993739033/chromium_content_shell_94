package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.UrlLoaderFactory;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface AppCacheFrontend extends Interface {
    public static final Manager<AppCacheFrontend, Proxy> MANAGER = AppCacheFrontend_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AppCacheFrontend, Interface.Proxy {
    }

    void cacheSelected(AppCacheInfo appCacheInfo);

    void errorEventRaised(AppCacheErrorDetails appCacheErrorDetails);

    void eventRaised(int i);

    void logMessage(int i, String str);

    void progressEventRaised(Url url, int i, int i2);

    void setSubresourceFactory(UrlLoaderFactory urlLoaderFactory);
}
