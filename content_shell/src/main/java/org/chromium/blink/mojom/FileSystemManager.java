package org.chromium.blink.mojom;

import org.chromium.filesystem.mojom.DirectoryEntry;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.FileInfo;
import org.chromium.mojo_base.mojom.FilePath;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface FileSystemManager extends Interface {
    public static final Manager<FileSystemManager, Proxy> MANAGER = FileSystemManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CopyResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface CreateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface CreateSnapshotFileResponse extends Callbacks.Callback4<FileInfo, FilePath, Integer, ReceivedSnapshotListener> {
    }

    /* loaded from: classes2.dex */
    public interface ExistsResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetPlatformPathResponse extends Callbacks.Callback1<FilePath> {
    }

    /* loaded from: classes2.dex */
    public interface MoveResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface OpenResponse extends Callbacks.Callback3<String, Url, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadDirectorySyncResponse extends Callbacks.Callback2<DirectoryEntry[], Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ReadMetadataResponse extends Callbacks.Callback2<FileInfo, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface RemoveResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ResolveUrlResponse extends Callbacks.Callback4<FileSystemInfo, FilePath, Boolean, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface TruncateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface TruncateSyncResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface WriteSyncResponse extends Callbacks.Callback2<Long, Integer> {
    }

    void copy(Url url, Url url2, CopyResponse copyResponse);

    void create(Url url, boolean z, boolean z2, boolean z3, CreateResponse createResponse);

    void createSnapshotFile(Url url, CreateSnapshotFileResponse createSnapshotFileResponse);

    void exists(Url url, boolean z, ExistsResponse existsResponse);

    void getPlatformPath(Url url, GetPlatformPathResponse getPlatformPathResponse);

    void move(Url url, Url url2, MoveResponse moveResponse);

    void open(Origin origin, int i, OpenResponse openResponse);

    void readDirectory(Url url, FileSystemOperationListener fileSystemOperationListener);

    void readDirectorySync(Url url, ReadDirectorySyncResponse readDirectorySyncResponse);

    void readMetadata(Url url, ReadMetadataResponse readMetadataResponse);

    void remove(Url url, boolean z, RemoveResponse removeResponse);

    void resolveUrl(Url url, ResolveUrlResponse resolveUrlResponse);

    void truncate(Url url, long j, InterfaceRequest<FileSystemCancellableOperation> interfaceRequest, TruncateResponse truncateResponse);

    void truncateSync(Url url, long j, TruncateSyncResponse truncateSyncResponse);

    void write(Url url, String str, long j, InterfaceRequest<FileSystemCancellableOperation> interfaceRequest, FileSystemOperationListener fileSystemOperationListener);

    void writeSync(Url url, String str, long j, WriteSyncResponse writeSyncResponse);
}
