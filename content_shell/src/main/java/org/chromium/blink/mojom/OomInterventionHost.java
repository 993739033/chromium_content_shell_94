package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface OomInterventionHost extends Interface {
    public static final Manager<OomInterventionHost, Proxy> MANAGER = OomInterventionHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends OomInterventionHost, Interface.Proxy {
    }

    void onHighMemoryUsage();
}
