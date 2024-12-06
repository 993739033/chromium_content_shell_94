package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CookieStore extends Interface {
    public static final Manager<CookieStore, Proxy> MANAGER = CookieStore_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddSubscriptionsResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface GetSubscriptionsResponse extends Callbacks.Callback2<CookieChangeSubscription[], Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CookieStore, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveSubscriptionsResponse extends Callbacks.Callback1<Boolean> {
    }

    void addSubscriptions(long j, CookieChangeSubscription[] cookieChangeSubscriptionArr, AddSubscriptionsResponse addSubscriptionsResponse);

    void getSubscriptions(long j, GetSubscriptionsResponse getSubscriptionsResponse);

    void removeSubscriptions(long j, CookieChangeSubscription[] cookieChangeSubscriptionArr, RemoveSubscriptionsResponse removeSubscriptionsResponse);
}
