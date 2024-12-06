package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface CacheStorageCache extends Interface {
    public static final Manager<CacheStorageCache, Proxy> MANAGER = CacheStorageCache_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface BatchResponse extends Callbacks.Callback1<CacheStorageVerboseError> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllMatchedEntriesResponse extends Callbacks.Callback1<GetAllMatchedEntriesResult> {
    }

    /* loaded from: classes2.dex */
    public interface KeysResponse extends Callbacks.Callback1<CacheKeysResult> {
    }

    /* loaded from: classes2.dex */
    public interface MatchAllResponse extends Callbacks.Callback1<MatchAllResult> {
    }

    /* loaded from: classes2.dex */
    public interface MatchResponse extends Callbacks.Callback1<MatchResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CacheStorageCache, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface WriteSideDataResponse extends Callbacks.Callback1<Integer> {
    }

    void batch(BatchOperation[] batchOperationArr, long j, BatchResponse batchResponse);

    void getAllMatchedEntries(FetchApiRequest fetchApiRequest, CacheQueryOptions cacheQueryOptions, long j, GetAllMatchedEntriesResponse getAllMatchedEntriesResponse);

    void keys(FetchApiRequest fetchApiRequest, CacheQueryOptions cacheQueryOptions, long j, KeysResponse keysResponse);

    void match(FetchApiRequest fetchApiRequest, CacheQueryOptions cacheQueryOptions, boolean z, long j, MatchResponse matchResponse);

    void matchAll(FetchApiRequest fetchApiRequest, CacheQueryOptions cacheQueryOptions, long j, MatchAllResponse matchAllResponse);

    void writeSideData(Url url, Time time, BigBuffer bigBuffer, long j, WriteSideDataResponse writeSideDataResponse);
}
