package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PaymentRequest extends Interface {
    public static final Manager<PaymentRequest, Proxy> MANAGER = PaymentRequest_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentRequest, Interface.Proxy {
    }

    void abort();

    void canMakePayment();

    void complete(int i);

    void hasEnrolledInstrument();

    void init(PaymentRequestClient paymentRequestClient, PaymentMethodData[] paymentMethodDataArr, PaymentDetails paymentDetails, PaymentOptions paymentOptions, boolean z);

    void onPaymentDetailsNotUpdated();

    void retry(PaymentValidationErrors paymentValidationErrors);

    void show(boolean z, boolean z2);

    void updateWith(PaymentDetails paymentDetails);
}
