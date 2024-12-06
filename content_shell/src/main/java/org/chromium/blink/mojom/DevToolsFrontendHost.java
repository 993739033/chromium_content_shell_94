package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.DictionaryValue;
/* loaded from: classes2.dex */
public interface DevToolsFrontendHost extends Interface {
    public static final Manager<DevToolsFrontendHost, Proxy> MANAGER = DevToolsFrontendHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsFrontendHost, Interface.Proxy {
    }

    void dispatchEmbedderMessage(DictionaryValue dictionaryValue);
}
