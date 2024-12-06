package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NoStatePrefetchProcessor extends Interface {
    public static final Manager<NoStatePrefetchProcessor, Proxy> MANAGER = NoStatePrefetchProcessor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NoStatePrefetchProcessor, Interface.Proxy {
    }

    void cancel();

    void start(PrerenderAttributes prerenderAttributes);
}
