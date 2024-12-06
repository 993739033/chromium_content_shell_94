package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ContextMenuClient extends Interface {
    public static final Manager<ContextMenuClient, Proxy> MANAGER = ContextMenuClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ContextMenuClient, Interface.Proxy {
    }

    void contextMenuClosed(Url url);

    void customContextMenuAction(int i);
}
