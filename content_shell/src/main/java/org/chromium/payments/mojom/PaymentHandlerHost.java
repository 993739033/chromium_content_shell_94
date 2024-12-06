package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PaymentHandlerHost extends Interface {
    public static final Manager<PaymentHandlerHost, Proxy> MANAGER = PaymentHandlerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChangePaymentMethodResponse extends Callbacks.Callback1<PaymentRequestDetailsUpdate> {
    }

    /* loaded from: classes2.dex */
    public interface ChangeShippingAddressResponse extends Callbacks.Callback1<PaymentRequestDetailsUpdate> {
    }

    /* loaded from: classes2.dex */
    public interface ChangeShippingOptionResponse extends Callbacks.Callback1<PaymentRequestDetailsUpdate> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentHandlerHost, Interface.Proxy {
    }

    void changePaymentMethod(PaymentHandlerMethodData paymentHandlerMethodData, ChangePaymentMethodResponse changePaymentMethodResponse);

    void changeShippingAddress(PaymentAddress paymentAddress, ChangeShippingAddressResponse changeShippingAddressResponse);

    void changeShippingOption(String str, ChangeShippingOptionResponse changeShippingOptionResponse);
}
