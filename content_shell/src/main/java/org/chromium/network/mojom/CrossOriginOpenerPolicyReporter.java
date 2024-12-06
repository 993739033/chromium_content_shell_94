package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CrossOriginOpenerPolicyReporter extends Interface {
    public static final Manager<CrossOriginOpenerPolicyReporter, Proxy> MANAGER = CrossOriginOpenerPolicyReporter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CrossOriginOpenerPolicyReporter, Interface.Proxy {
    }

    void queueAccessReport(int i, String str, SourceLocation sourceLocation, String str2);
}
