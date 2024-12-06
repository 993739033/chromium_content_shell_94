package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface AcceptChFrameObserver extends Interface {
    public static final Manager<AcceptChFrameObserver, Proxy> MANAGER = AcceptChFrameObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnAcceptChFrameReceivedResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AcceptChFrameObserver, Interface.Proxy {
    }

    void clone(InterfaceRequest<AcceptChFrameObserver> interfaceRequest);

    void onAcceptChFrameReceived(Url url, int[] iArr, OnAcceptChFrameReceivedResponse onAcceptChFrameReceivedResponse);
}
