package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DigitalGoods extends Interface {
    public static final Manager<DigitalGoods, Proxy> MANAGER = DigitalGoods_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AcknowledgeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetDetailsResponse extends Callbacks.Callback2<Integer, ItemDetails[]> {
    }

    /* loaded from: classes2.dex */
    public interface ListPurchasesResponse extends Callbacks.Callback2<Integer, PurchaseDetails[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DigitalGoods, Interface.Proxy {
    }

    void acknowledge(String str, boolean z, AcknowledgeResponse acknowledgeResponse);

    void getDetails(String[] strArr, GetDetailsResponse getDetailsResponse);

    void listPurchases(ListPurchasesResponse listPurchasesResponse);
}
