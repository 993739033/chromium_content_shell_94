package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ServiceWorkerInstalledScriptsManagerHost extends Interface {
    public static final Manager<ServiceWorkerInstalledScriptsManagerHost, Proxy> MANAGER = ServiceWorkerInstalledScriptsManagerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerInstalledScriptsManagerHost, Interface.Proxy {
    }

    void requestInstalledScript(Url url);
}
