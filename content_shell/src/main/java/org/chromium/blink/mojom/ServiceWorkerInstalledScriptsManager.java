package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerInstalledScriptsManager extends Interface {
    public static final Manager<ServiceWorkerInstalledScriptsManager, Proxy> MANAGER = ServiceWorkerInstalledScriptsManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerInstalledScriptsManager, Interface.Proxy {
    }

    void transferInstalledScript(ServiceWorkerScriptInfo serviceWorkerScriptInfo);
}
