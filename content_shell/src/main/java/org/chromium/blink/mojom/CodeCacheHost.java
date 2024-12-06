package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface CodeCacheHost extends Interface {
    public static final Manager<CodeCacheHost, Proxy> MANAGER = CodeCacheHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FetchCachedCodeResponse extends Callbacks.Callback2<Time, BigBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CodeCacheHost, Interface.Proxy {
    }

    void clearCodeCacheEntry(int i, Url url);

    void didGenerateCacheableMetadata(int i, Url url, Time time, BigBuffer bigBuffer);

    void didGenerateCacheableMetadataInCacheStorage(Url url, Time time, BigBuffer bigBuffer, Origin origin, String str);

    void fetchCachedCode(int i, Url url, FetchCachedCodeResponse fetchCachedCodeResponse);
}
