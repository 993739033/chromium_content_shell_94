package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WebOtpService extends Interface {
    public static final Manager<WebOtpService, Proxy> MANAGER = WebOtpService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebOtpService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReceiveResponse extends Callbacks.Callback2<Integer, String> {
    }

    void abort();

    void receive(ReceiveResponse receiveResponse);
}
