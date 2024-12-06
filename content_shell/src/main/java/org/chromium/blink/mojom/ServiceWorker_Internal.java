package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.ServiceWorker;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.network.mojom.CookieChangeInfo;
import org.chromium.payments.mojom.CanMakePaymentEventData;
import org.chromium.payments.mojom.PaymentHandlerResponseCallback;
import org.chromium.payments.mojom.PaymentRequestEventData;

/* loaded from: classes2.dex */
class ServiceWorker_Internal {
    private static final int ADD_MESSAGE_TO_CONSOLE_ORDINAL = 22;
    private static final int DISPATCH_ABORT_PAYMENT_EVENT_ORDINAL = 15;
    private static final int DISPATCH_ACTIVATE_EVENT_ORDINAL = 2;
    private static final int DISPATCH_BACKGROUND_FETCH_ABORT_EVENT_ORDINAL = 3;
    private static final int DISPATCH_BACKGROUND_FETCH_CLICK_EVENT_ORDINAL = 4;
    private static final int DISPATCH_BACKGROUND_FETCH_FAIL_EVENT_ORDINAL = 5;
    private static final int DISPATCH_BACKGROUND_FETCH_SUCCESS_EVENT_ORDINAL = 6;
    private static final int DISPATCH_CAN_MAKE_PAYMENT_EVENT_ORDINAL = 16;
    private static final int DISPATCH_CONTENT_DELETE_EVENT_ORDINAL = 19;
    private static final int DISPATCH_COOKIE_CHANGE_EVENT_ORDINAL = 7;
    private static final int DISPATCH_EXTENDABLE_MESSAGE_EVENT_ORDINAL = 18;
    private static final int DISPATCH_FETCH_EVENT_FOR_MAIN_RESOURCE_ORDINAL = 8;
    private static final int DISPATCH_INSTALL_EVENT_ORDINAL = 1;
    private static final int DISPATCH_NOTIFICATION_CLICK_EVENT_ORDINAL = 9;
    private static final int DISPATCH_NOTIFICATION_CLOSE_EVENT_ORDINAL = 10;
    private static final int DISPATCH_PAYMENT_REQUEST_EVENT_ORDINAL = 17;
    private static final int DISPATCH_PERIODIC_SYNC_EVENT_ORDINAL = 14;
    private static final int DISPATCH_PUSH_EVENT_ORDINAL = 11;
    private static final int DISPATCH_PUSH_SUBSCRIPTION_CHANGE_EVENT_ORDINAL = 12;
    private static final int DISPATCH_SYNC_EVENT_ORDINAL = 13;
    private static final int INITIALIZE_GLOBAL_SCOPE_ORDINAL = 0;
    public static final Interface.Manager<ServiceWorker, ServiceWorker.Proxy> MANAGER = new Interface.Manager<ServiceWorker, ServiceWorker.Proxy>() { // from class: org.chromium.blink.mojom.ServiceWorker_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.ServiceWorker";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ServiceWorker.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ServiceWorker impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ServiceWorker[] buildArray(int size) {
            return new ServiceWorker[size];
        }
    };
    private static final int PING_ORDINAL = 20;
    private static final int SET_IDLE_DELAY_ORDINAL = 21;

    ServiceWorker_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ServiceWorker.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void initializeGlobalScope(AssociatedInterfaceNotSupported serviceWorkerHost, ServiceWorkerRegistrationObjectInfo registrationInfo, ServiceWorkerObjectInfo serviceWorkerInfo, int fetchHandlerExistence, UrlLoaderFactoryBundle subresourceLoaderFactories, InterfaceRequest<ReportingObserver> reportingObserverReceiver) {
            ServiceWorkerInitializeGlobalScopeParams _message = new ServiceWorkerInitializeGlobalScopeParams();
            _message.serviceWorkerHost = serviceWorkerHost;
            _message.registrationInfo = registrationInfo;
            _message.serviceWorkerInfo = serviceWorkerInfo;
            _message.fetchHandlerExistence = fetchHandlerExistence;
            _message.subresourceLoaderFactories = subresourceLoaderFactories;
            _message.reportingObserverReceiver = reportingObserverReceiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchInstallEvent(DispatchInstallEventResponse callback) {
            ServiceWorkerDispatchInstallEventParams _message = new ServiceWorkerDispatchInstallEventParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new ServiceWorkerDispatchInstallEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchActivateEvent(DispatchActivateEventResponse callback) {
            ServiceWorkerDispatchActivateEventParams _message = new ServiceWorkerDispatchActivateEventParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new ServiceWorkerDispatchActivateEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchBackgroundFetchAbortEvent(BackgroundFetchRegistration registration, DispatchBackgroundFetchAbortEventResponse callback) {
            ServiceWorkerDispatchBackgroundFetchAbortEventParams _message = new ServiceWorkerDispatchBackgroundFetchAbortEventParams();
            _message.registration = registration;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchBackgroundFetchClickEvent(BackgroundFetchRegistration registration, DispatchBackgroundFetchClickEventResponse callback) {
            ServiceWorkerDispatchBackgroundFetchClickEventParams _message = new ServiceWorkerDispatchBackgroundFetchClickEventParams();
            _message.registration = registration;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchBackgroundFetchFailEvent(BackgroundFetchRegistration registration, DispatchBackgroundFetchFailEventResponse callback) {
            ServiceWorkerDispatchBackgroundFetchFailEventParams _message = new ServiceWorkerDispatchBackgroundFetchFailEventParams();
            _message.registration = registration;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchBackgroundFetchSuccessEvent(BackgroundFetchRegistration registration, DispatchBackgroundFetchSuccessEventResponse callback) {
            ServiceWorkerDispatchBackgroundFetchSuccessEventParams _message = new ServiceWorkerDispatchBackgroundFetchSuccessEventParams();
            _message.registration = registration;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchCookieChangeEvent(CookieChangeInfo change, DispatchCookieChangeEventResponse callback) {
            ServiceWorkerDispatchCookieChangeEventParams _message = new ServiceWorkerDispatchCookieChangeEventParams();
            _message.change = change;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new ServiceWorkerDispatchCookieChangeEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchFetchEventForMainResource(DispatchFetchEventParams params, ServiceWorkerFetchResponseCallback responseCallback, DispatchFetchEventForMainResourceResponse callback) {
            ServiceWorkerDispatchFetchEventForMainResourceParams _message = new ServiceWorkerDispatchFetchEventForMainResourceParams();
            _message.params = params;
            _message.responseCallback = responseCallback;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new ServiceWorkerDispatchFetchEventForMainResourceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchNotificationClickEvent(String notificationId, NotificationData notificationData, int actionIndex, String16 reply, DispatchNotificationClickEventResponse callback) {
            ServiceWorkerDispatchNotificationClickEventParams _message = new ServiceWorkerDispatchNotificationClickEventParams();
            _message.notificationId = notificationId;
            _message.notificationData = notificationData;
            _message.actionIndex = actionIndex;
            _message.reply = reply;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9, 1, 0L)), new ServiceWorkerDispatchNotificationClickEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchNotificationCloseEvent(String notificationId, NotificationData notificationData, DispatchNotificationCloseEventResponse callback) {
            ServiceWorkerDispatchNotificationCloseEventParams _message = new ServiceWorkerDispatchNotificationCloseEventParams();
            _message.notificationId = notificationId;
            _message.notificationData = notificationData;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10, 1, 0L)), new ServiceWorkerDispatchNotificationCloseEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchPushEvent(String payload, DispatchPushEventResponse callback) {
            ServiceWorkerDispatchPushEventParams _message = new ServiceWorkerDispatchPushEventParams();
            _message.payload = payload;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11, 1, 0L)), new ServiceWorkerDispatchPushEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchPushSubscriptionChangeEvent(PushSubscription oldSubscription, PushSubscription newSubscription, DispatchPushSubscriptionChangeEventResponse callback) {
            ServiceWorkerDispatchPushSubscriptionChangeEventParams _message = new ServiceWorkerDispatchPushSubscriptionChangeEventParams();
            _message.oldSubscription = oldSubscription;
            _message.newSubscription = newSubscription;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12, 1, 0L)), new ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchSyncEvent(String tag, boolean lastChance, TimeDelta timeout, DispatchSyncEventResponse callback) {
            ServiceWorkerDispatchSyncEventParams _message = new ServiceWorkerDispatchSyncEventParams();
            _message.tag = tag;
            _message.lastChance = lastChance;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13, 1, 0L)), new ServiceWorkerDispatchSyncEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchPeriodicSyncEvent(String tag, TimeDelta timeout, DispatchPeriodicSyncEventResponse callback) {
            ServiceWorkerDispatchPeriodicSyncEventParams _message = new ServiceWorkerDispatchPeriodicSyncEventParams();
            _message.tag = tag;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14, 1, 0L)), new ServiceWorkerDispatchPeriodicSyncEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchAbortPaymentEvent(PaymentHandlerResponseCallback resultOfAbortPayment, DispatchAbortPaymentEventResponse callback) {
            ServiceWorkerDispatchAbortPaymentEventParams _message = new ServiceWorkerDispatchAbortPaymentEventParams();
            _message.resultOfAbortPayment = resultOfAbortPayment;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15, 1, 0L)), new ServiceWorkerDispatchAbortPaymentEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchCanMakePaymentEvent(CanMakePaymentEventData eventData, PaymentHandlerResponseCallback resultOfCanMakePayment, DispatchCanMakePaymentEventResponse callback) {
            ServiceWorkerDispatchCanMakePaymentEventParams _message = new ServiceWorkerDispatchCanMakePaymentEventParams();
            _message.eventData = eventData;
            _message.resultOfCanMakePayment = resultOfCanMakePayment;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16, 1, 0L)), new ServiceWorkerDispatchCanMakePaymentEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchPaymentRequestEvent(PaymentRequestEventData requestData, PaymentHandlerResponseCallback responseCallback, DispatchPaymentRequestEventResponse callback) {
            ServiceWorkerDispatchPaymentRequestEventParams _message = new ServiceWorkerDispatchPaymentRequestEventParams();
            _message.requestData = requestData;
            _message.responseCallback = responseCallback;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17, 1, 0L)), new ServiceWorkerDispatchPaymentRequestEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchExtendableMessageEvent(ExtendableMessageEvent event, DispatchExtendableMessageEventResponse callback) {
            ServiceWorkerDispatchExtendableMessageEventParams _message = new ServiceWorkerDispatchExtendableMessageEventParams();
            _message.event = event;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18, 1, 0L)), new ServiceWorkerDispatchExtendableMessageEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void dispatchContentDeleteEvent(String id, DispatchContentDeleteEventResponse callback) {
            ServiceWorkerDispatchContentDeleteEventParams _message = new ServiceWorkerDispatchContentDeleteEventParams();
            _message.id = id;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19, 1, 0L)), new ServiceWorkerDispatchContentDeleteEventResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void ping(PingResponse callback) {
            ServiceWorkerPingParams _message = new ServiceWorkerPingParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20, 1, 0L)), new ServiceWorkerPingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void setIdleDelay(TimeDelta delay) {
            ServiceWorkerSetIdleDelayParams _message = new ServiceWorkerSetIdleDelayParams();
            _message.delay = delay;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorker
        public void addMessageToConsole(int level, String message) {
            ServiceWorkerAddMessageToConsoleParams _message = new ServiceWorkerAddMessageToConsoleParams();
            _message.level = level;
            _message.message = message;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ServiceWorker> {
        Stub(Core core, ServiceWorker impl) {
            super(core, impl);
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 0;
                if (header.hasFlag(4)) {
                    flags = 0 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -2:
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ServiceWorker_Internal.MANAGER, messageWithHeader);
                    case 0:
                        ServiceWorkerInitializeGlobalScopeParams data = ServiceWorkerInitializeGlobalScopeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().initializeGlobalScope(data.serviceWorkerHost, data.registrationInfo, data.serviceWorkerInfo, data.fetchHandlerExistence, data.subresourceLoaderFactories, data.reportingObserverReceiver);
                        return true;
                    case 21:
                        getImpl().setIdleDelay(ServiceWorkerSetIdleDelayParams.deserialize(messageWithHeader.getPayload()).delay);
                        return true;
                    case 22:
                        ServiceWorkerAddMessageToConsoleParams data2 = ServiceWorkerAddMessageToConsoleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addMessageToConsole(data2.level, data2.message);
                        return true;
                    default:
                        return false;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override // org.chromium.mojo.bindings.MessageReceiverWithResponder
        public boolean acceptWithResponder(Message message, MessageReceiver receiver) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 1;
                if (header.hasFlag(4)) {
                    flags = 1 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -1:
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ServiceWorker_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        ServiceWorkerDispatchInstallEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchInstallEvent(new ServiceWorkerDispatchInstallEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        ServiceWorkerDispatchActivateEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchActivateEvent(new ServiceWorkerDispatchActivateEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        ServiceWorkerDispatchBackgroundFetchAbortEventParams data = ServiceWorkerDispatchBackgroundFetchAbortEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchBackgroundFetchAbortEvent(data.registration, new ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        ServiceWorkerDispatchBackgroundFetchClickEventParams data2 = ServiceWorkerDispatchBackgroundFetchClickEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchBackgroundFetchClickEvent(data2.registration, new ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        ServiceWorkerDispatchBackgroundFetchFailEventParams data3 = ServiceWorkerDispatchBackgroundFetchFailEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchBackgroundFetchFailEvent(data3.registration, new ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        ServiceWorkerDispatchBackgroundFetchSuccessEventParams data4 = ServiceWorkerDispatchBackgroundFetchSuccessEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchBackgroundFetchSuccessEvent(data4.registration, new ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        ServiceWorkerDispatchCookieChangeEventParams data5 = ServiceWorkerDispatchCookieChangeEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchCookieChangeEvent(data5.change, new ServiceWorkerDispatchCookieChangeEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        ServiceWorkerDispatchFetchEventForMainResourceParams data6 = ServiceWorkerDispatchFetchEventForMainResourceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchFetchEventForMainResource(data6.params, data6.responseCallback, new ServiceWorkerDispatchFetchEventForMainResourceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 9:
                        ServiceWorkerDispatchNotificationClickEventParams data7 = ServiceWorkerDispatchNotificationClickEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchNotificationClickEvent(data7.notificationId, data7.notificationData, data7.actionIndex, data7.reply, new ServiceWorkerDispatchNotificationClickEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 10:
                        ServiceWorkerDispatchNotificationCloseEventParams data8 = ServiceWorkerDispatchNotificationCloseEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchNotificationCloseEvent(data8.notificationId, data8.notificationData, new ServiceWorkerDispatchNotificationCloseEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 11:
                        ServiceWorkerDispatchPushEventParams data9 = ServiceWorkerDispatchPushEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchPushEvent(data9.payload, new ServiceWorkerDispatchPushEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 12:
                        ServiceWorkerDispatchPushSubscriptionChangeEventParams data10 = ServiceWorkerDispatchPushSubscriptionChangeEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchPushSubscriptionChangeEvent(data10.oldSubscription, data10.newSubscription, new ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 13:
                        ServiceWorkerDispatchSyncEventParams data11 = ServiceWorkerDispatchSyncEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchSyncEvent(data11.tag, data11.lastChance, data11.timeout, new ServiceWorkerDispatchSyncEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 14:
                        ServiceWorkerDispatchPeriodicSyncEventParams data12 = ServiceWorkerDispatchPeriodicSyncEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchPeriodicSyncEvent(data12.tag, data12.timeout, new ServiceWorkerDispatchPeriodicSyncEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 15:
                        ServiceWorkerDispatchAbortPaymentEventParams data13 = ServiceWorkerDispatchAbortPaymentEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchAbortPaymentEvent(data13.resultOfAbortPayment, new ServiceWorkerDispatchAbortPaymentEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 16:
                        ServiceWorkerDispatchCanMakePaymentEventParams data14 = ServiceWorkerDispatchCanMakePaymentEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchCanMakePaymentEvent(data14.eventData, data14.resultOfCanMakePayment, new ServiceWorkerDispatchCanMakePaymentEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 17:
                        ServiceWorkerDispatchPaymentRequestEventParams data15 = ServiceWorkerDispatchPaymentRequestEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchPaymentRequestEvent(data15.requestData, data15.responseCallback, new ServiceWorkerDispatchPaymentRequestEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 18:
                        ServiceWorkerDispatchExtendableMessageEventParams data16 = ServiceWorkerDispatchExtendableMessageEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchExtendableMessageEvent(data16.event, new ServiceWorkerDispatchExtendableMessageEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 19:
                        ServiceWorkerDispatchContentDeleteEventParams data17 = ServiceWorkerDispatchContentDeleteEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchContentDeleteEvent(data17.id, new ServiceWorkerDispatchContentDeleteEventResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 20:
                        ServiceWorkerPingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().ping(new ServiceWorkerPingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerInitializeGlobalScopeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public int fetchHandlerExistence;
        public ServiceWorkerRegistrationObjectInfo registrationInfo;
        public InterfaceRequest<ReportingObserver> reportingObserverReceiver;
        public AssociatedInterfaceNotSupported serviceWorkerHost;
        public ServiceWorkerObjectInfo serviceWorkerInfo;
        public UrlLoaderFactoryBundle subresourceLoaderFactories;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerInitializeGlobalScopeParams(int version) {
            super(48, version);
        }

        public ServiceWorkerInitializeGlobalScopeParams() {
            this(0);
        }

        public static ServiceWorkerInitializeGlobalScopeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerInitializeGlobalScopeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerInitializeGlobalScopeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerInitializeGlobalScopeParams result = new ServiceWorkerInitializeGlobalScopeParams(elementsOrVersion);
                result.serviceWorkerHost = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.registrationInfo = ServiceWorkerRegistrationObjectInfo.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.serviceWorkerInfo = ServiceWorkerObjectInfo.decode(decoder12);
                int readInt = decoder0.readInt(32);
                result.fetchHandlerExistence = readInt;
                FetchHandlerExistence.validate(readInt);
                result.fetchHandlerExistence = FetchHandlerExistence.toKnownValue(result.fetchHandlerExistence);
                result.reportingObserverReceiver = decoder0.readInterfaceRequest(36, true);
                Decoder decoder13 = decoder0.readPointer(40, true);
                result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serviceWorkerHost, 8, false);
            encoder0.encode((Struct) this.registrationInfo, 16, false);
            encoder0.encode((Struct) this.serviceWorkerInfo, 24, false);
            encoder0.encode(this.fetchHandlerExistence, 32);
            encoder0.encode((InterfaceRequest) this.reportingObserverReceiver, 36, true);
            encoder0.encode((Struct) this.subresourceLoaderFactories, 40, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchInstallEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchInstallEventParams(int version) {
            super(8, version);
        }

        public ServiceWorkerDispatchInstallEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchInstallEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchInstallEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchInstallEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchInstallEventParams result = new ServiceWorkerDispatchInstallEventParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchInstallEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int fetchCount;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchInstallEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchInstallEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchInstallEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchInstallEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchInstallEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchInstallEventResponseParams result = new ServiceWorkerDispatchInstallEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                result.fetchCount = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
            encoder0.encode(this.fetchCount, 12);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchInstallEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchInstallEventResponse mCallback;

        ServiceWorkerDispatchInstallEventResponseParamsForwardToCallback(ServiceWorker.DispatchInstallEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 2)) {
                    return false;
                }
                ServiceWorkerDispatchInstallEventResponseParams response = ServiceWorkerDispatchInstallEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), Integer.valueOf(response.fetchCount));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchInstallEventResponseParamsProxyToResponder implements ServiceWorker.DispatchInstallEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchInstallEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, Integer fetchCount) {
            ServiceWorkerDispatchInstallEventResponseParams _response = new ServiceWorkerDispatchInstallEventResponseParams();
            _response.status = status.intValue();
            _response.fetchCount = fetchCount.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchActivateEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchActivateEventParams(int version) {
            super(8, version);
        }

        public ServiceWorkerDispatchActivateEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchActivateEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchActivateEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchActivateEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchActivateEventParams result = new ServiceWorkerDispatchActivateEventParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchActivateEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchActivateEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchActivateEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchActivateEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchActivateEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchActivateEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchActivateEventResponseParams result = new ServiceWorkerDispatchActivateEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchActivateEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchActivateEventResponse mCallback;

        ServiceWorkerDispatchActivateEventResponseParamsForwardToCallback(ServiceWorker.DispatchActivateEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
                    return false;
                }
                ServiceWorkerDispatchActivateEventResponseParams response = ServiceWorkerDispatchActivateEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchActivateEventResponseParamsProxyToResponder implements ServiceWorker.DispatchActivateEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchActivateEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchActivateEventResponseParams _response = new ServiceWorkerDispatchActivateEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchBackgroundFetchAbortEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BackgroundFetchRegistration registration;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchAbortEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchAbortEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchAbortEventParams result = new ServiceWorkerDispatchBackgroundFetchAbortEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.registration = BackgroundFetchRegistration.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.registration, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams result = new ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchBackgroundFetchAbortEventResponse mCallback;

        ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsForwardToCallback(ServiceWorker.DispatchBackgroundFetchAbortEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 2)) {
                    return false;
                }
                ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams response = ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsProxyToResponder implements ServiceWorker.DispatchBackgroundFetchAbortEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchBackgroundFetchAbortEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams _response = new ServiceWorkerDispatchBackgroundFetchAbortEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchBackgroundFetchClickEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BackgroundFetchRegistration registration;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchClickEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchClickEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchClickEventParams result = new ServiceWorkerDispatchBackgroundFetchClickEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.registration = BackgroundFetchRegistration.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.registration, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchBackgroundFetchClickEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchClickEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchClickEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchClickEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchClickEventResponseParams result = new ServiceWorkerDispatchBackgroundFetchClickEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchBackgroundFetchClickEventResponse mCallback;

        ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsForwardToCallback(ServiceWorker.DispatchBackgroundFetchClickEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 2)) {
                    return false;
                }
                ServiceWorkerDispatchBackgroundFetchClickEventResponseParams response = ServiceWorkerDispatchBackgroundFetchClickEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsProxyToResponder implements ServiceWorker.DispatchBackgroundFetchClickEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchBackgroundFetchClickEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchBackgroundFetchClickEventResponseParams _response = new ServiceWorkerDispatchBackgroundFetchClickEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchBackgroundFetchFailEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BackgroundFetchRegistration registration;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchFailEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchFailEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchFailEventParams result = new ServiceWorkerDispatchBackgroundFetchFailEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.registration = BackgroundFetchRegistration.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.registration, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchBackgroundFetchFailEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchFailEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchFailEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchFailEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchFailEventResponseParams result = new ServiceWorkerDispatchBackgroundFetchFailEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchBackgroundFetchFailEventResponse mCallback;

        ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsForwardToCallback(ServiceWorker.DispatchBackgroundFetchFailEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 2)) {
                    return false;
                }
                ServiceWorkerDispatchBackgroundFetchFailEventResponseParams response = ServiceWorkerDispatchBackgroundFetchFailEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsProxyToResponder implements ServiceWorker.DispatchBackgroundFetchFailEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchBackgroundFetchFailEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchBackgroundFetchFailEventResponseParams _response = new ServiceWorkerDispatchBackgroundFetchFailEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchBackgroundFetchSuccessEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BackgroundFetchRegistration registration;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchSuccessEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchSuccessEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchSuccessEventParams result = new ServiceWorkerDispatchBackgroundFetchSuccessEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.registration = BackgroundFetchRegistration.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.registration, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams result = new ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchBackgroundFetchSuccessEventResponse mCallback;

        ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsForwardToCallback(ServiceWorker.DispatchBackgroundFetchSuccessEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams response = ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsProxyToResponder implements ServiceWorker.DispatchBackgroundFetchSuccessEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams _response = new ServiceWorkerDispatchBackgroundFetchSuccessEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchCookieChangeEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CookieChangeInfo change;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchCookieChangeEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchCookieChangeEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchCookieChangeEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchCookieChangeEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchCookieChangeEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchCookieChangeEventParams result = new ServiceWorkerDispatchCookieChangeEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.change = CookieChangeInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.change, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchCookieChangeEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchCookieChangeEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchCookieChangeEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchCookieChangeEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchCookieChangeEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchCookieChangeEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchCookieChangeEventResponseParams result = new ServiceWorkerDispatchCookieChangeEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchCookieChangeEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchCookieChangeEventResponse mCallback;

        ServiceWorkerDispatchCookieChangeEventResponseParamsForwardToCallback(ServiceWorker.DispatchCookieChangeEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 2)) {
                    return false;
                }
                ServiceWorkerDispatchCookieChangeEventResponseParams response = ServiceWorkerDispatchCookieChangeEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchCookieChangeEventResponseParamsProxyToResponder implements ServiceWorker.DispatchCookieChangeEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchCookieChangeEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchCookieChangeEventResponseParams _response = new ServiceWorkerDispatchCookieChangeEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchFetchEventForMainResourceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DispatchFetchEventParams params;
        public ServiceWorkerFetchResponseCallback responseCallback;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchFetchEventForMainResourceParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchFetchEventForMainResourceParams() {
            this(0);
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchFetchEventForMainResourceParams result = new ServiceWorkerDispatchFetchEventForMainResourceParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = DispatchFetchEventParams.decode(decoder1);
                result.responseCallback = (ServiceWorkerFetchResponseCallback) decoder0.readServiceInterface(16, false, ServiceWorkerFetchResponseCallback.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
            encoder0.encode(this.responseCallback, 16, false, ServiceWorkerFetchResponseCallback.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchFetchEventForMainResourceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchFetchEventForMainResourceResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchFetchEventForMainResourceResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchFetchEventForMainResourceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchFetchEventForMainResourceResponseParams result = new ServiceWorkerDispatchFetchEventForMainResourceResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchFetchEventForMainResourceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchFetchEventForMainResourceResponse mCallback;

        ServiceWorkerDispatchFetchEventForMainResourceResponseParamsForwardToCallback(ServiceWorker.DispatchFetchEventForMainResourceResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 2)) {
                    return false;
                }
                ServiceWorkerDispatchFetchEventForMainResourceResponseParams response = ServiceWorkerDispatchFetchEventForMainResourceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchFetchEventForMainResourceResponseParamsProxyToResponder implements ServiceWorker.DispatchFetchEventForMainResourceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchFetchEventForMainResourceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchFetchEventForMainResourceResponseParams _response = new ServiceWorkerDispatchFetchEventForMainResourceResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchNotificationClickEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public int actionIndex;
        public NotificationData notificationData;
        public String notificationId;
        public String16 reply;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchNotificationClickEventParams(int version) {
            super(40, version);
        }

        public ServiceWorkerDispatchNotificationClickEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchNotificationClickEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchNotificationClickEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchNotificationClickEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchNotificationClickEventParams result = new ServiceWorkerDispatchNotificationClickEventParams(elementsOrVersion);
                result.notificationId = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.notificationData = NotificationData.decode(decoder1);
                result.actionIndex = decoder0.readInt(24);
                Decoder decoder12 = decoder0.readPointer(32, true);
                result.reply = String16.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.notificationId, 8, false);
            encoder0.encode((Struct) this.notificationData, 16, false);
            encoder0.encode(this.actionIndex, 24);
            encoder0.encode((Struct) this.reply, 32, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchNotificationClickEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchNotificationClickEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchNotificationClickEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchNotificationClickEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchNotificationClickEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchNotificationClickEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchNotificationClickEventResponseParams result = new ServiceWorkerDispatchNotificationClickEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchNotificationClickEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchNotificationClickEventResponse mCallback;

        ServiceWorkerDispatchNotificationClickEventResponseParamsForwardToCallback(ServiceWorker.DispatchNotificationClickEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(9, 2)) {
                    return false;
                }
                ServiceWorkerDispatchNotificationClickEventResponseParams response = ServiceWorkerDispatchNotificationClickEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchNotificationClickEventResponseParamsProxyToResponder implements ServiceWorker.DispatchNotificationClickEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchNotificationClickEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchNotificationClickEventResponseParams _response = new ServiceWorkerDispatchNotificationClickEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(9, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchNotificationCloseEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public NotificationData notificationData;
        public String notificationId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchNotificationCloseEventParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchNotificationCloseEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchNotificationCloseEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchNotificationCloseEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchNotificationCloseEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchNotificationCloseEventParams result = new ServiceWorkerDispatchNotificationCloseEventParams(elementsOrVersion);
                result.notificationId = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.notificationData = NotificationData.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.notificationId, 8, false);
            encoder0.encode((Struct) this.notificationData, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchNotificationCloseEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchNotificationCloseEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchNotificationCloseEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchNotificationCloseEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchNotificationCloseEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchNotificationCloseEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchNotificationCloseEventResponseParams result = new ServiceWorkerDispatchNotificationCloseEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchNotificationCloseEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchNotificationCloseEventResponse mCallback;

        ServiceWorkerDispatchNotificationCloseEventResponseParamsForwardToCallback(ServiceWorker.DispatchNotificationCloseEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(10, 2)) {
                    return false;
                }
                ServiceWorkerDispatchNotificationCloseEventResponseParams response = ServiceWorkerDispatchNotificationCloseEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchNotificationCloseEventResponseParamsProxyToResponder implements ServiceWorker.DispatchNotificationCloseEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchNotificationCloseEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchNotificationCloseEventResponseParams _response = new ServiceWorkerDispatchNotificationCloseEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(10, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchPushEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String payload;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPushEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchPushEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPushEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPushEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPushEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPushEventParams result = new ServiceWorkerDispatchPushEventParams(elementsOrVersion);
                result.payload = decoder0.readString(8, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.payload, 8, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchPushEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPushEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchPushEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPushEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPushEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPushEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPushEventResponseParams result = new ServiceWorkerDispatchPushEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPushEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchPushEventResponse mCallback;

        ServiceWorkerDispatchPushEventResponseParamsForwardToCallback(ServiceWorker.DispatchPushEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(11, 2)) {
                    return false;
                }
                ServiceWorkerDispatchPushEventResponseParams response = ServiceWorkerDispatchPushEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPushEventResponseParamsProxyToResponder implements ServiceWorker.DispatchPushEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchPushEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchPushEventResponseParams _response = new ServiceWorkerDispatchPushEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(11, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchPushSubscriptionChangeEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PushSubscription newSubscription;
        public PushSubscription oldSubscription;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPushSubscriptionChangeEventParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchPushSubscriptionChangeEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPushSubscriptionChangeEventParams result = new ServiceWorkerDispatchPushSubscriptionChangeEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.oldSubscription = PushSubscription.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, true);
                result.newSubscription = PushSubscription.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.oldSubscription, 8, true);
            encoder0.encode((Struct) this.newSubscription, 16, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams result = new ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchPushSubscriptionChangeEventResponse mCallback;

        ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsForwardToCallback(ServiceWorker.DispatchPushSubscriptionChangeEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(12, 2)) {
                    return false;
                }
                ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams response = ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsProxyToResponder implements ServiceWorker.DispatchPushSubscriptionChangeEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchPushSubscriptionChangeEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams _response = new ServiceWorkerDispatchPushSubscriptionChangeEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(12, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchSyncEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean lastChance;
        public String tag;
        public TimeDelta timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchSyncEventParams(int version) {
            super(32, version);
        }

        public ServiceWorkerDispatchSyncEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchSyncEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchSyncEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchSyncEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchSyncEventParams result = new ServiceWorkerDispatchSyncEventParams(elementsOrVersion);
                result.tag = decoder0.readString(8, false);
                result.lastChance = decoder0.readBoolean(16, 0);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.timeout = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.tag, 8, false);
            encoder0.encode(this.lastChance, 16, 0);
            encoder0.encode((Struct) this.timeout, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchSyncEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchSyncEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchSyncEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchSyncEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchSyncEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchSyncEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchSyncEventResponseParams result = new ServiceWorkerDispatchSyncEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchSyncEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchSyncEventResponse mCallback;

        ServiceWorkerDispatchSyncEventResponseParamsForwardToCallback(ServiceWorker.DispatchSyncEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(13, 2)) {
                    return false;
                }
                ServiceWorkerDispatchSyncEventResponseParams response = ServiceWorkerDispatchSyncEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchSyncEventResponseParamsProxyToResponder implements ServiceWorker.DispatchSyncEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchSyncEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchSyncEventResponseParams _response = new ServiceWorkerDispatchSyncEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(13, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchPeriodicSyncEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String tag;
        public TimeDelta timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPeriodicSyncEventParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchPeriodicSyncEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPeriodicSyncEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPeriodicSyncEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPeriodicSyncEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPeriodicSyncEventParams result = new ServiceWorkerDispatchPeriodicSyncEventParams(elementsOrVersion);
                result.tag = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.timeout = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.tag, 8, false);
            encoder0.encode((Struct) this.timeout, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchPeriodicSyncEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPeriodicSyncEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchPeriodicSyncEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPeriodicSyncEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPeriodicSyncEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPeriodicSyncEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPeriodicSyncEventResponseParams result = new ServiceWorkerDispatchPeriodicSyncEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPeriodicSyncEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchPeriodicSyncEventResponse mCallback;

        ServiceWorkerDispatchPeriodicSyncEventResponseParamsForwardToCallback(ServiceWorker.DispatchPeriodicSyncEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(14, 2)) {
                    return false;
                }
                ServiceWorkerDispatchPeriodicSyncEventResponseParams response = ServiceWorkerDispatchPeriodicSyncEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPeriodicSyncEventResponseParamsProxyToResponder implements ServiceWorker.DispatchPeriodicSyncEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchPeriodicSyncEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchPeriodicSyncEventResponseParams _response = new ServiceWorkerDispatchPeriodicSyncEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(14, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchAbortPaymentEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PaymentHandlerResponseCallback resultOfAbortPayment;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchAbortPaymentEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchAbortPaymentEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchAbortPaymentEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchAbortPaymentEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchAbortPaymentEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchAbortPaymentEventParams result = new ServiceWorkerDispatchAbortPaymentEventParams(elementsOrVersion);
                result.resultOfAbortPayment = (PaymentHandlerResponseCallback) decoder0.readServiceInterface(8, false, PaymentHandlerResponseCallback.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.resultOfAbortPayment, 8, false, PaymentHandlerResponseCallback.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchAbortPaymentEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchAbortPaymentEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchAbortPaymentEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchAbortPaymentEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchAbortPaymentEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchAbortPaymentEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchAbortPaymentEventResponseParams result = new ServiceWorkerDispatchAbortPaymentEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchAbortPaymentEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchAbortPaymentEventResponse mCallback;

        ServiceWorkerDispatchAbortPaymentEventResponseParamsForwardToCallback(ServiceWorker.DispatchAbortPaymentEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(15, 2)) {
                    return false;
                }
                ServiceWorkerDispatchAbortPaymentEventResponseParams response = ServiceWorkerDispatchAbortPaymentEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchAbortPaymentEventResponseParamsProxyToResponder implements ServiceWorker.DispatchAbortPaymentEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchAbortPaymentEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchAbortPaymentEventResponseParams _response = new ServiceWorkerDispatchAbortPaymentEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(15, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchCanMakePaymentEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public CanMakePaymentEventData eventData;
        public PaymentHandlerResponseCallback resultOfCanMakePayment;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchCanMakePaymentEventParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchCanMakePaymentEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchCanMakePaymentEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchCanMakePaymentEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchCanMakePaymentEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchCanMakePaymentEventParams result = new ServiceWorkerDispatchCanMakePaymentEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.eventData = CanMakePaymentEventData.decode(decoder1);
                result.resultOfCanMakePayment = (PaymentHandlerResponseCallback) decoder0.readServiceInterface(16, false, PaymentHandlerResponseCallback.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.eventData, 8, false);
            encoder0.encode(this.resultOfCanMakePayment, 16, false, PaymentHandlerResponseCallback.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchCanMakePaymentEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchCanMakePaymentEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchCanMakePaymentEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchCanMakePaymentEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchCanMakePaymentEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchCanMakePaymentEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchCanMakePaymentEventResponseParams result = new ServiceWorkerDispatchCanMakePaymentEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchCanMakePaymentEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchCanMakePaymentEventResponse mCallback;

        ServiceWorkerDispatchCanMakePaymentEventResponseParamsForwardToCallback(ServiceWorker.DispatchCanMakePaymentEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(16, 2)) {
                    return false;
                }
                ServiceWorkerDispatchCanMakePaymentEventResponseParams response = ServiceWorkerDispatchCanMakePaymentEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchCanMakePaymentEventResponseParamsProxyToResponder implements ServiceWorker.DispatchCanMakePaymentEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchCanMakePaymentEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchCanMakePaymentEventResponseParams _response = new ServiceWorkerDispatchCanMakePaymentEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(16, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchPaymentRequestEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PaymentRequestEventData requestData;
        public PaymentHandlerResponseCallback responseCallback;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPaymentRequestEventParams(int version) {
            super(24, version);
        }

        public ServiceWorkerDispatchPaymentRequestEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPaymentRequestEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPaymentRequestEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPaymentRequestEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPaymentRequestEventParams result = new ServiceWorkerDispatchPaymentRequestEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.requestData = PaymentRequestEventData.decode(decoder1);
                result.responseCallback = (PaymentHandlerResponseCallback) decoder0.readServiceInterface(16, false, PaymentHandlerResponseCallback.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.requestData, 8, false);
            encoder0.encode(this.responseCallback, 16, false, PaymentHandlerResponseCallback.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchPaymentRequestEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchPaymentRequestEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchPaymentRequestEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchPaymentRequestEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchPaymentRequestEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchPaymentRequestEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchPaymentRequestEventResponseParams result = new ServiceWorkerDispatchPaymentRequestEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPaymentRequestEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchPaymentRequestEventResponse mCallback;

        ServiceWorkerDispatchPaymentRequestEventResponseParamsForwardToCallback(ServiceWorker.DispatchPaymentRequestEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(17, 2)) {
                    return false;
                }
                ServiceWorkerDispatchPaymentRequestEventResponseParams response = ServiceWorkerDispatchPaymentRequestEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchPaymentRequestEventResponseParamsProxyToResponder implements ServiceWorker.DispatchPaymentRequestEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchPaymentRequestEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchPaymentRequestEventResponseParams _response = new ServiceWorkerDispatchPaymentRequestEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(17, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchExtendableMessageEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ExtendableMessageEvent event;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchExtendableMessageEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchExtendableMessageEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchExtendableMessageEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchExtendableMessageEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchExtendableMessageEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchExtendableMessageEventParams result = new ServiceWorkerDispatchExtendableMessageEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.event = ExtendableMessageEvent.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.event, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchExtendableMessageEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchExtendableMessageEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchExtendableMessageEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchExtendableMessageEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchExtendableMessageEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchExtendableMessageEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchExtendableMessageEventResponseParams result = new ServiceWorkerDispatchExtendableMessageEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchExtendableMessageEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchExtendableMessageEventResponse mCallback;

        ServiceWorkerDispatchExtendableMessageEventResponseParamsForwardToCallback(ServiceWorker.DispatchExtendableMessageEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(18, 2)) {
                    return false;
                }
                ServiceWorkerDispatchExtendableMessageEventResponseParams response = ServiceWorkerDispatchExtendableMessageEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchExtendableMessageEventResponseParamsProxyToResponder implements ServiceWorker.DispatchExtendableMessageEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchExtendableMessageEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchExtendableMessageEventResponseParams _response = new ServiceWorkerDispatchExtendableMessageEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(18, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerDispatchContentDeleteEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String id;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchContentDeleteEventParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchContentDeleteEventParams() {
            this(0);
        }

        public static ServiceWorkerDispatchContentDeleteEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchContentDeleteEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchContentDeleteEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchContentDeleteEventParams result = new ServiceWorkerDispatchContentDeleteEventParams(elementsOrVersion);
                result.id = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.id, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerDispatchContentDeleteEventResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerDispatchContentDeleteEventResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerDispatchContentDeleteEventResponseParams() {
            this(0);
        }

        public static ServiceWorkerDispatchContentDeleteEventResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerDispatchContentDeleteEventResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerDispatchContentDeleteEventResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerDispatchContentDeleteEventResponseParams result = new ServiceWorkerDispatchContentDeleteEventResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                ServiceWorkerEventStatus.validate(readInt);
                result.status = ServiceWorkerEventStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchContentDeleteEventResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.DispatchContentDeleteEventResponse mCallback;

        ServiceWorkerDispatchContentDeleteEventResponseParamsForwardToCallback(ServiceWorker.DispatchContentDeleteEventResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(19, 2)) {
                    return false;
                }
                ServiceWorkerDispatchContentDeleteEventResponseParams response = ServiceWorkerDispatchContentDeleteEventResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerDispatchContentDeleteEventResponseParamsProxyToResponder implements ServiceWorker.DispatchContentDeleteEventResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerDispatchContentDeleteEventResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            ServiceWorkerDispatchContentDeleteEventResponseParams _response = new ServiceWorkerDispatchContentDeleteEventResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(19, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerPingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerPingParams(int version) {
            super(8, version);
        }

        public ServiceWorkerPingParams() {
            this(0);
        }

        public static ServiceWorkerPingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerPingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerPingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerPingParams result = new ServiceWorkerPingParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerPingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerPingResponseParams(int version) {
            super(8, version);
        }

        public ServiceWorkerPingResponseParams() {
            this(0);
        }

        public static ServiceWorkerPingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerPingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerPingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerPingResponseParams result = new ServiceWorkerPingResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerPingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorker.PingResponse mCallback;

        ServiceWorkerPingResponseParamsForwardToCallback(ServiceWorker.PingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(20, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerPingResponseParamsProxyToResponder implements ServiceWorker.PingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerPingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            ServiceWorkerPingResponseParams _response = new ServiceWorkerPingResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(20, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerSetIdleDelayParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta delay;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerSetIdleDelayParams(int version) {
            super(16, version);
        }

        public ServiceWorkerSetIdleDelayParams() {
            this(0);
        }

        public static ServiceWorkerSetIdleDelayParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerSetIdleDelayParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerSetIdleDelayParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerSetIdleDelayParams result = new ServiceWorkerSetIdleDelayParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.delay = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.delay, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerAddMessageToConsoleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int level;
        public String message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerAddMessageToConsoleParams(int version) {
            super(24, version);
        }

        public ServiceWorkerAddMessageToConsoleParams() {
            this(0);
        }

        public static ServiceWorkerAddMessageToConsoleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerAddMessageToConsoleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerAddMessageToConsoleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerAddMessageToConsoleParams result = new ServiceWorkerAddMessageToConsoleParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.level = readInt;
                ConsoleMessageLevel.validate(readInt);
                result.level = ConsoleMessageLevel.toKnownValue(result.level);
                result.message = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.level, 8);
            encoder0.encode(this.message, 16, false);
        }
    }
}
