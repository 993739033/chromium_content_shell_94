package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ProvisionFetcher extends Interface {
    public static final Manager<ProvisionFetcher, Proxy> MANAGER = ProvisionFetcher_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProvisionFetcher, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RetrieveResponse extends Callbacks.Callback2<Boolean, String> {
    }

    void retrieve(Url url, String str, RetrieveResponse retrieveResponse);
}
