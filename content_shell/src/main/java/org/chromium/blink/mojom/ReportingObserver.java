package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ReportingObserver extends Interface {
    public static final Manager<ReportingObserver, Proxy> MANAGER = ReportingObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ReportingObserver, Interface.Proxy {
    }

    void notify(Report report);
}
