package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PushMessaging extends Interface {
    public static final Manager<PushMessaging, Proxy> MANAGER = PushMessaging_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetSubscriptionResponse extends Callbacks.Callback2<Integer, PushSubscription> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PushMessaging, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SubscribeResponse extends Callbacks.Callback2<Integer, PushSubscription> {
    }

    /* loaded from: classes2.dex */
    public interface UnsubscribeResponse extends Callbacks.Callback3<Integer, Boolean, String> {
    }

    void getSubscription(long j, GetSubscriptionResponse getSubscriptionResponse);

    void subscribe(long j, PushSubscriptionOptions pushSubscriptionOptions, boolean z, SubscribeResponse subscribeResponse);

    void unsubscribe(long j, UnsubscribeResponse unsubscribeResponse);
}
