package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.MessagePipeHandle;
/* loaded from: classes2.dex */
public interface Service extends Interface {
    public static final Manager<Service, Proxy> MANAGER = Service_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnBindInterfaceResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface OnStartResponse extends Callbacks.Callback2<InterfaceRequest<Connector>, AssociatedInterfaceRequestNotSupported> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Service, Interface.Proxy {
    }

    void createPackagedServiceInstance(Identity identity, InterfaceRequest<Service> interfaceRequest, ProcessMetadata processMetadata);

    void onBindInterface(BindSourceInfo bindSourceInfo, String str, MessagePipeHandle messagePipeHandle, OnBindInterfaceResponse onBindInterfaceResponse);

    void onStart(Identity identity, OnStartResponse onStartResponse);
}
