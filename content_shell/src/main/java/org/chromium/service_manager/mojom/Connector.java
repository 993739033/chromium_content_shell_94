package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.MessagePipeHandle;
/* loaded from: classes2.dex */
public interface Connector extends Interface {
    public static final Manager<Connector, Proxy> MANAGER = Connector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface BindInterfaceResponse extends Callbacks.Callback2<Integer, Identity> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Connector, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryServiceResponse extends Callbacks.Callback1<ServiceInfo> {
    }

    /* loaded from: classes2.dex */
    public interface RegisterServiceInstanceResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface WarmServiceResponse extends Callbacks.Callback2<Integer, Identity> {
    }

    void bindInterface(ServiceFilter serviceFilter, String str, MessagePipeHandle messagePipeHandle, int i, BindInterfaceResponse bindInterfaceResponse);

    void clone(InterfaceRequest<Connector> interfaceRequest);

    void queryService(String str, QueryServiceResponse queryServiceResponse);

    void registerServiceInstance(Identity identity, MessagePipeHandle messagePipeHandle, InterfaceRequest<ProcessMetadata> interfaceRequest, RegisterServiceInstanceResponse registerServiceInstanceResponse);

    void warmService(ServiceFilter serviceFilter, WarmServiceResponse warmServiceResponse);
}
