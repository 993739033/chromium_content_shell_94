package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerRegistrationObjectHost extends Interface {
    public static final Manager<ServiceWorkerRegistrationObjectHost, Proxy> MANAGER = ServiceWorkerRegistrationObjectHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnableNavigationPreloadResponse extends Callbacks.Callback2<Integer, String> {
    }

    /* loaded from: classes2.dex */
    public interface GetNavigationPreloadStateResponse extends Callbacks.Callback3<Integer, String, NavigationPreloadState> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerRegistrationObjectHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetNavigationPreloadHeaderResponse extends Callbacks.Callback2<Integer, String> {
    }

    /* loaded from: classes2.dex */
    public interface UnregisterResponse extends Callbacks.Callback2<Integer, String> {
    }

    /* loaded from: classes2.dex */
    public interface UpdateResponse extends Callbacks.Callback2<Integer, String> {
    }

    void enableNavigationPreload(boolean z, EnableNavigationPreloadResponse enableNavigationPreloadResponse);

    void getNavigationPreloadState(GetNavigationPreloadStateResponse getNavigationPreloadStateResponse);

    void setNavigationPreloadHeader(String str, SetNavigationPreloadHeaderResponse setNavigationPreloadHeaderResponse);

    void unregister(UnregisterResponse unregisterResponse);

    void update(FetchClientSettingsObject fetchClientSettingsObject, UpdateResponse updateResponse);
}
