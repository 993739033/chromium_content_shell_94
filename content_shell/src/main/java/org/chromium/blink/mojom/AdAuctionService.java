package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface AdAuctionService extends Interface {
    public static final Manager<AdAuctionService, Proxy> MANAGER = AdAuctionService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AdAuctionService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RunAdAuctionResponse extends Callbacks.Callback1<Url> {
    }

    void runAdAuction(AuctionAdConfig auctionAdConfig, RunAdAuctionResponse runAdAuctionResponse);
}
