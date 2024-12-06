package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface OriginPolicyManager extends Interface {
    public static final Manager<OriginPolicyManager, Proxy> MANAGER = OriginPolicyManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends OriginPolicyManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RetrieveOriginPolicyResponse extends Callbacks.Callback1<OriginPolicy> {
    }

    void addExceptionFor(Origin origin);

    void retrieveOriginPolicy(Origin origin, IsolationInfo isolationInfo, String str, RetrieveOriginPolicyResponse retrieveOriginPolicyResponse);
}
