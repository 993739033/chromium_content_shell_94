package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PopupMenuClient extends Interface {
    public static final Manager<PopupMenuClient, Proxy> MANAGER = PopupMenuClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PopupMenuClient, Interface.Proxy {
    }

    void didAcceptIndices(int[] iArr);

    void didCancel();
}
