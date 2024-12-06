package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface QuotaChangeListener extends Interface {
    public static final Manager<QuotaChangeListener, Proxy> MANAGER = QuotaChangeListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends QuotaChangeListener, Interface.Proxy {
    }

    void onQuotaChange();
}
