package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CopyOutputResultSender extends Interface {
    public static final Manager<CopyOutputResultSender, Proxy> MANAGER = CopyOutputResultSender_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CopyOutputResultSender, Interface.Proxy {
    }

    void sendResult(CopyOutputResult copyOutputResult);
}
