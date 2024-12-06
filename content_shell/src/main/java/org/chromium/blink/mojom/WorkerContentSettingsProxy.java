package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WorkerContentSettingsProxy extends Interface {
    public static final Manager<WorkerContentSettingsProxy, Proxy> MANAGER = WorkerContentSettingsProxy_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AllowCacheStorageResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface AllowIndexedDbResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface AllowWebLocksResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WorkerContentSettingsProxy, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestFileSystemAccessSyncResponse extends Callbacks.Callback1<Boolean> {
    }

    void allowCacheStorage(AllowCacheStorageResponse allowCacheStorageResponse);

    void allowIndexedDb(AllowIndexedDbResponse allowIndexedDbResponse);

    void allowWebLocks(AllowWebLocksResponse allowWebLocksResponse);

    void requestFileSystemAccessSync(RequestFileSystemAccessSyncResponse requestFileSystemAccessSyncResponse);
}
