package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WebBundleHandle extends Interface {
    public static final Manager<WebBundleHandle, Proxy> MANAGER = WebBundleHandle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebBundleHandle, Interface.Proxy {
    }

    void clone(InterfaceRequest<WebBundleHandle> interfaceRequest);

    void onWebBundleError(int i, String str);

    void onWebBundleLoadFinished(boolean z);
}
