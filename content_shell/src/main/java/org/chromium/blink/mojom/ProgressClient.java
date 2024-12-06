package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ProgressClient extends Interface {
    public static final Manager<ProgressClient, Proxy> MANAGER = ProgressClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProgressClient, Interface.Proxy {
    }

    void onProgress(long j);
}
