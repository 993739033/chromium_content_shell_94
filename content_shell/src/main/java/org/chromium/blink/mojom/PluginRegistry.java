package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface PluginRegistry extends Interface {
    public static final Manager<PluginRegistry, Proxy> MANAGER = PluginRegistry_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetPluginsResponse extends Callbacks.Callback1<PluginInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PluginRegistry, Interface.Proxy {
    }

    void getPlugins(boolean z, Origin origin, GetPluginsResponse getPluginsResponse);
}
