package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DigitalGoodsFactory extends Interface {
    public static final Manager<DigitalGoodsFactory, Proxy> MANAGER = DigitalGoodsFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateDigitalGoodsResponse extends Callbacks.Callback2<Integer, DigitalGoods> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DigitalGoodsFactory, Interface.Proxy {
    }

    void createDigitalGoods(String str, CreateDigitalGoodsResponse createDigitalGoodsResponse);
}
