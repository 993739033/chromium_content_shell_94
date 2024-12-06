package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.network.mojom.CookieChangeInfo;
import org.chromium.payments.mojom.CanMakePaymentEventData;
import org.chromium.payments.mojom.PaymentHandlerResponseCallback;
import org.chromium.payments.mojom.PaymentRequestEventData;
/* loaded from: classes2.dex */
public interface ServiceWorker extends Interface {
    public static final Manager<ServiceWorker, Proxy> MANAGER = ServiceWorker_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DispatchAbortPaymentEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchActivateEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchBackgroundFetchAbortEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchBackgroundFetchClickEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchBackgroundFetchFailEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchBackgroundFetchSuccessEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchCanMakePaymentEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchContentDeleteEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchCookieChangeEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchExtendableMessageEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchFetchEventForMainResourceResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchInstallEventResponse extends Callbacks.Callback2<Integer, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchNotificationClickEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchNotificationCloseEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchPaymentRequestEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchPeriodicSyncEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchPushEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchPushSubscriptionChangeEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DispatchSyncEventResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface PingResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorker, Interface.Proxy {
    }

    void addMessageToConsole(int i, String str);

    void dispatchAbortPaymentEvent(PaymentHandlerResponseCallback paymentHandlerResponseCallback, DispatchAbortPaymentEventResponse dispatchAbortPaymentEventResponse);

    void dispatchActivateEvent(DispatchActivateEventResponse dispatchActivateEventResponse);

    void dispatchBackgroundFetchAbortEvent(BackgroundFetchRegistration backgroundFetchRegistration, DispatchBackgroundFetchAbortEventResponse dispatchBackgroundFetchAbortEventResponse);

    void dispatchBackgroundFetchClickEvent(BackgroundFetchRegistration backgroundFetchRegistration, DispatchBackgroundFetchClickEventResponse dispatchBackgroundFetchClickEventResponse);

    void dispatchBackgroundFetchFailEvent(BackgroundFetchRegistration backgroundFetchRegistration, DispatchBackgroundFetchFailEventResponse dispatchBackgroundFetchFailEventResponse);

    void dispatchBackgroundFetchSuccessEvent(BackgroundFetchRegistration backgroundFetchRegistration, DispatchBackgroundFetchSuccessEventResponse dispatchBackgroundFetchSuccessEventResponse);

    void dispatchCanMakePaymentEvent(CanMakePaymentEventData canMakePaymentEventData, PaymentHandlerResponseCallback paymentHandlerResponseCallback, DispatchCanMakePaymentEventResponse dispatchCanMakePaymentEventResponse);

    void dispatchContentDeleteEvent(String str, DispatchContentDeleteEventResponse dispatchContentDeleteEventResponse);

    void dispatchCookieChangeEvent(CookieChangeInfo cookieChangeInfo, DispatchCookieChangeEventResponse dispatchCookieChangeEventResponse);

    void dispatchExtendableMessageEvent(ExtendableMessageEvent extendableMessageEvent, DispatchExtendableMessageEventResponse dispatchExtendableMessageEventResponse);

    void dispatchFetchEventForMainResource(DispatchFetchEventParams dispatchFetchEventParams, ServiceWorkerFetchResponseCallback serviceWorkerFetchResponseCallback, DispatchFetchEventForMainResourceResponse dispatchFetchEventForMainResourceResponse);

    void dispatchInstallEvent(DispatchInstallEventResponse dispatchInstallEventResponse);

    void dispatchNotificationClickEvent(String str, NotificationData notificationData, int i, String16 string16, DispatchNotificationClickEventResponse dispatchNotificationClickEventResponse);

    void dispatchNotificationCloseEvent(String str, NotificationData notificationData, DispatchNotificationCloseEventResponse dispatchNotificationCloseEventResponse);

    void dispatchPaymentRequestEvent(PaymentRequestEventData paymentRequestEventData, PaymentHandlerResponseCallback paymentHandlerResponseCallback, DispatchPaymentRequestEventResponse dispatchPaymentRequestEventResponse);

    void dispatchPeriodicSyncEvent(String str, TimeDelta timeDelta, DispatchPeriodicSyncEventResponse dispatchPeriodicSyncEventResponse);

    void dispatchPushEvent(String str, DispatchPushEventResponse dispatchPushEventResponse);

    void dispatchPushSubscriptionChangeEvent(PushSubscription pushSubscription, PushSubscription pushSubscription2, DispatchPushSubscriptionChangeEventResponse dispatchPushSubscriptionChangeEventResponse);

    void dispatchSyncEvent(String str, boolean z, TimeDelta timeDelta, DispatchSyncEventResponse dispatchSyncEventResponse);

    void initializeGlobalScope(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, ServiceWorkerRegistrationObjectInfo serviceWorkerRegistrationObjectInfo, ServiceWorkerObjectInfo serviceWorkerObjectInfo, int i, UrlLoaderFactoryBundle urlLoaderFactoryBundle, InterfaceRequest<ReportingObserver> interfaceRequest);

    void ping(PingResponse pingResponse);

    void setIdleDelay(TimeDelta timeDelta);
}
