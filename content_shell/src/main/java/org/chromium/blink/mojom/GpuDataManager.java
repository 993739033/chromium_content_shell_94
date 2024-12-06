package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface GpuDataManager extends Interface {
    public static final Manager<GpuDataManager, Proxy> MANAGER = GpuDataManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Are3DapIsBlockedForUrlResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GpuDataManager, Interface.Proxy {
    }

    void are3DapIsBlockedForUrl(Url url, Are3DapIsBlockedForUrlResponse are3DapIsBlockedForUrlResponse);
}
