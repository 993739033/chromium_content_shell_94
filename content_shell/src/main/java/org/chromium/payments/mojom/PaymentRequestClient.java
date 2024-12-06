package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PaymentRequestClient extends Interface {
    public static final Manager<PaymentRequestClient, Proxy> MANAGER = PaymentRequestClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentRequestClient, Interface.Proxy {
    }

    void onAbort(boolean z);

    void onCanMakePayment(int i);

    void onComplete();

    void onError(int i, String str);

    void onHasEnrolledInstrument(int i);

    void onPayerDetailChange(PayerDetail payerDetail);

    void onPaymentMethodChange(String str, String str2);

    void onPaymentResponse(PaymentResponse paymentResponse);

    void onShippingAddressChange(PaymentAddress paymentAddress);

    void onShippingOptionChange(String str);

    void warnNoFavicon();
}
