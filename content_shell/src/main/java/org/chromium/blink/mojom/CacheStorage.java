package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.String16;
/* loaded from: classes2.dex */
public interface CacheStorage extends Interface {
    public static final Manager<CacheStorage, Proxy> MANAGER = CacheStorage_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface HasResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface KeysResponse extends Callbacks.Callback1<String16[]> {
    }

    /* loaded from: classes2.dex */
    public interface MatchResponse extends Callbacks.Callback1<MatchResult> {
    }

    /* loaded from: classes2.dex */
    public interface OpenResponse extends Callbacks.Callback1<OpenResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CacheStorage, Interface.Proxy {
    }

    void delete(String16 string16, long j, DeleteResponse deleteResponse);

    void has(String16 string16, long j, HasResponse hasResponse);

    void keys(long j, KeysResponse keysResponse);

    void match(FetchApiRequest fetchApiRequest, MultiCacheQueryOptions multiCacheQueryOptions, boolean z, long j, MatchResponse matchResponse);

    void open(String16 string16, long j, OpenResponse openResponse);
}
