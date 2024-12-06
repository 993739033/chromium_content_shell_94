package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface PaymentManager extends Interface {
    public static final Manager<PaymentManager, Proxy> MANAGER = PaymentManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ClearPaymentInstrumentsResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DeletePaymentInstrumentResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface EnableDelegationsResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetPaymentInstrumentResponse extends Callbacks.Callback2<PaymentInstrument, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface HasPaymentInstrumentResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface KeysOfPaymentInstrumentsResponse extends Callbacks.Callback2<String[], Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetPaymentInstrumentResponse extends Callbacks.Callback1<Integer> {
    }

    void clearPaymentInstruments(ClearPaymentInstrumentsResponse clearPaymentInstrumentsResponse);

    void deletePaymentInstrument(String str, DeletePaymentInstrumentResponse deletePaymentInstrumentResponse);

    void enableDelegations(int[] iArr, EnableDelegationsResponse enableDelegationsResponse);

    void getPaymentInstrument(String str, GetPaymentInstrumentResponse getPaymentInstrumentResponse);

    void hasPaymentInstrument(String str, HasPaymentInstrumentResponse hasPaymentInstrumentResponse);

    void init(Url url, String str);

    void keysOfPaymentInstruments(KeysOfPaymentInstrumentsResponse keysOfPaymentInstrumentsResponse);

    void setPaymentInstrument(String str, PaymentInstrument paymentInstrument, SetPaymentInstrumentResponse setPaymentInstrumentResponse);

    void setUserHint(String str);
}
