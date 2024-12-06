package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.FilePath;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ServiceWorkerContainerHost extends Interface {
    public static final Manager<ServiceWorkerContainerHost, Proxy> MANAGER = ServiceWorkerContainerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnsureFileAccessResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetRegistrationForReadyResponse extends Callbacks.Callback1<ServiceWorkerRegistrationObjectInfo> {
    }

    /* loaded from: classes2.dex */
    public interface GetRegistrationResponse extends Callbacks.Callback3<Integer, String, ServiceWorkerRegistrationObjectInfo> {
    }

    /* loaded from: classes2.dex */
    public interface GetRegistrationsResponse extends Callbacks.Callback3<Integer, String, ServiceWorkerRegistrationObjectInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerContainerHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RegisterResponse extends Callbacks.Callback3<Integer, String, ServiceWorkerRegistrationObjectInfo> {
    }

    void cloneContainerHost(InterfaceRequest<ServiceWorkerContainerHost> interfaceRequest);

    void ensureControllerServiceWorker(InterfaceRequest<ControllerServiceWorker> interfaceRequest, int i);

    void ensureFileAccess(FilePath[] filePathArr, EnsureFileAccessResponse ensureFileAccessResponse);

    void getRegistration(Url url, GetRegistrationResponse getRegistrationResponse);

    void getRegistrationForReady(GetRegistrationForReadyResponse getRegistrationForReadyResponse);

    void getRegistrations(GetRegistrationsResponse getRegistrationsResponse);

    void hintToUpdateServiceWorker();

    void onExecutionReady();

    void register(Url url, ServiceWorkerRegistrationOptions serviceWorkerRegistrationOptions, FetchClientSettingsObject fetchClientSettingsObject, RegisterResponse registerResponse);
}
