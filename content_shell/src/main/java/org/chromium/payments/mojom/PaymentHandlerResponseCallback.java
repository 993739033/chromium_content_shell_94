package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PaymentHandlerResponseCallback extends Interface {
    public static final Manager<PaymentHandlerResponseCallback, Proxy> MANAGER = PaymentHandlerResponseCallback_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentHandlerResponseCallback, Interface.Proxy {
    }

    void onResponseForAbortPayment(boolean z);

    void onResponseForCanMakePayment(CanMakePaymentResponse canMakePaymentResponse);

    void onResponseForPaymentRequest(PaymentHandlerResponse paymentHandlerResponse);
}
