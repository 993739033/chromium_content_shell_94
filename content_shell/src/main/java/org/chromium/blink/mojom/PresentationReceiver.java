package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface PresentationReceiver extends Interface {
    public static final Manager<PresentationReceiver, Proxy> MANAGER = PresentationReceiver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PresentationReceiver, Interface.Proxy {
    }

    void onReceiverConnectionAvailable(PresentationInfo presentationInfo, PresentationConnection presentationConnection, InterfaceRequest<PresentationConnection> interfaceRequest);
}
