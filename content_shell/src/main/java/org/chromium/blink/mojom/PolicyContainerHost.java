package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.network.mojom.ContentSecurityPolicy;
/* loaded from: classes2.dex */
public interface PolicyContainerHost extends Interface {
    public static final Manager<PolicyContainerHost, Proxy> MANAGER = PolicyContainerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PolicyContainerHost, Interface.Proxy {
    }

    void addContentSecurityPolicies(ContentSecurityPolicy[] contentSecurityPolicyArr);

    void issueKeepAliveHandle(InterfaceRequest<PolicyContainerHostKeepAliveHandle> interfaceRequest);

    void setReferrerPolicy(int i);
}
