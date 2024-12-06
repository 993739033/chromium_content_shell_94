package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface AutoplayConfigurationClient extends Interface {
    public static final Manager<AutoplayConfigurationClient, Proxy> MANAGER = AutoplayConfigurationClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AutoplayConfigurationClient, Interface.Proxy {
    }

    void addAutoplayFlags(Origin origin, int i);
}
