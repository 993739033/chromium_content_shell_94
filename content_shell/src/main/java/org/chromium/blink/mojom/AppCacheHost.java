package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface AppCacheHost extends Interface {
    public static final Manager<AppCacheHost, Proxy> MANAGER = AppCacheHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetResourceListResponse extends Callbacks.Callback1<AppCacheResourceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetStatusResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AppCacheHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StartUpdateResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SwapCacheResponse extends Callbacks.Callback1<Boolean> {
    }

    void getResourceList(GetResourceListResponse getResourceListResponse);

    void getStatus(GetStatusResponse getStatusResponse);

    void markAsForeignEntry(Url url, long j);

    void selectCache(Url url, long j, Url url2);

    void selectCacheForWorker(long j);

    void setSpawningHostId(UnguessableToken unguessableToken);

    void startUpdate(StartUpdateResponse startUpdateResponse);

    void swapCache(SwapCacheResponse swapCacheResponse);
}
