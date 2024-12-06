package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RemoteObject extends Interface {
    public static final Manager<RemoteObject, Proxy> MANAGER = RemoteObject_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetMethodsResponse extends Callbacks.Callback1<String[]> {
    }

    /* loaded from: classes2.dex */
    public interface HasMethodResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface InvokeMethodResponse extends Callbacks.Callback1<RemoteInvocationResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteObject, Interface.Proxy {
    }

    void getMethods(GetMethodsResponse getMethodsResponse);

    void hasMethod(String str, HasMethodResponse hasMethodResponse);

    void invokeMethod(String str, RemoteInvocationArgument[] remoteInvocationArgumentArr, InvokeMethodResponse invokeMethodResponse);

    void notifyReleasedObject();
}
