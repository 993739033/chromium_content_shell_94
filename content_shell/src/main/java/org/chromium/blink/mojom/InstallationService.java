package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface InstallationService extends Interface {
    public static final Manager<InstallationService, Proxy> MANAGER = InstallationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends InstallationService, Interface.Proxy {
    }

    void onInstall();
}
