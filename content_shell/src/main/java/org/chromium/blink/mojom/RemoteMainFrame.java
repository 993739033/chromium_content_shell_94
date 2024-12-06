package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RemoteMainFrame extends Interface {
    public static final Manager<RemoteMainFrame, Proxy> MANAGER = RemoteMainFrame_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteMainFrame, Interface.Proxy {
    }

    void updateTextAutosizerPageInfo(TextAutosizerPageInfo textAutosizerPageInfo);
}
