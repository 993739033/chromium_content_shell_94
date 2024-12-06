package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RendererPreferenceWatcher extends Interface {
    public static final Manager<RendererPreferenceWatcher, Proxy> MANAGER = RendererPreferenceWatcher_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RendererPreferenceWatcher, Interface.Proxy {
    }

    void notifyUpdate(RendererPreferences rendererPreferences);
}
