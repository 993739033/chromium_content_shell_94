package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PresentationConnection extends Interface {
    public static final Manager<PresentationConnection, Proxy> MANAGER = PresentationConnection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PresentationConnection, Interface.Proxy {
    }

    void didChangeState(int i);

    void didClose(int i);

    void onMessage(PresentationConnectionMessage presentationConnectionMessage);
}
