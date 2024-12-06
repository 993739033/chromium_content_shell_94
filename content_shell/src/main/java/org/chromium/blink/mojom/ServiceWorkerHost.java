package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ServiceWorkerHost extends Interface {
    public static final Manager<ServiceWorkerHost, Proxy> MANAGER = ServiceWorkerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ClaimClientsResponse extends Callbacks.Callback2<Integer, String> {
    }

    /* loaded from: classes2.dex */
    public interface FocusClientResponse extends Callbacks.Callback1<ServiceWorkerClientInfo> {
    }

    /* loaded from: classes2.dex */
    public interface GetClientResponse extends Callbacks.Callback1<ServiceWorkerClientInfo> {
    }

    /* loaded from: classes2.dex */
    public interface GetClientsResponse extends Callbacks.Callback1<ServiceWorkerClientInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface NavigateClientResponse extends Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> {
    }

    /* loaded from: classes2.dex */
    public interface OpenNewTabResponse extends Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> {
    }

    /* loaded from: classes2.dex */
    public interface OpenPaymentHandlerWindowResponse extends Callbacks.Callback3<Boolean, ServiceWorkerClientInfo, String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SkipWaitingResponse extends Callbacks.Callback1<Boolean> {
    }

    void claimClients(ClaimClientsResponse claimClientsResponse);

    void clearCachedMetadata(Url url);

    void focusClient(String str, FocusClientResponse focusClientResponse);

    void getClient(String str, GetClientResponse getClientResponse);

    void getClients(ServiceWorkerClientQueryOptions serviceWorkerClientQueryOptions, GetClientsResponse getClientsResponse);

    void navigateClient(String str, Url url, NavigateClientResponse navigateClientResponse);

    void openNewTab(Url url, OpenNewTabResponse openNewTabResponse);

    void openPaymentHandlerWindow(Url url, OpenPaymentHandlerWindowResponse openPaymentHandlerWindowResponse);

    void postMessageToClient(String str, TransferableMessage transferableMessage);

    void setCachedMetadata(Url url, ReadOnlyBuffer readOnlyBuffer);

    void skipWaiting(SkipWaitingResponse skipWaitingResponse);
}
