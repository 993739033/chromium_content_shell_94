package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerFetchResponseCallback extends Interface {
    public static final Manager<ServiceWorkerFetchResponseCallback, Proxy> MANAGER = ServiceWorkerFetchResponseCallback_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerFetchResponseCallback, Interface.Proxy {
    }

    void onFallback(ServiceWorkerFetchEventTiming serviceWorkerFetchEventTiming);

    void onResponse(FetchApiResponse fetchApiResponse, ServiceWorkerFetchEventTiming serviceWorkerFetchEventTiming);

    void onResponseStream(FetchApiResponse fetchApiResponse, ServiceWorkerStreamHandle serviceWorkerStreamHandle, ServiceWorkerFetchEventTiming serviceWorkerFetchEventTiming);
}
