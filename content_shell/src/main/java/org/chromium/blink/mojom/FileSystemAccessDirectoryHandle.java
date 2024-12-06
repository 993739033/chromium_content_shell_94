package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface FileSystemAccessDirectoryHandle extends Interface {
    public static final Manager<FileSystemAccessDirectoryHandle, Proxy> MANAGER = FileSystemAccessDirectoryHandle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDirectoryResponse extends Callbacks.Callback2<FileSystemAccessError, FileSystemAccessDirectoryHandle> {
    }

    /* loaded from: classes2.dex */
    public interface GetFileResponse extends Callbacks.Callback2<FileSystemAccessError, FileSystemAccessFileHandle> {
    }

    /* loaded from: classes2.dex */
    public interface GetPermissionStatusResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessDirectoryHandle, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveEntryResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface RemoveResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface RequestPermissionResponse extends Callbacks.Callback2<FileSystemAccessError, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ResolveResponse extends Callbacks.Callback2<FileSystemAccessError, String[]> {
    }

    void getDirectory(String str, boolean z, GetDirectoryResponse getDirectoryResponse);

    void getEntries(FileSystemAccessDirectoryEntriesListener fileSystemAccessDirectoryEntriesListener);

    void getFile(String str, boolean z, GetFileResponse getFileResponse);

    void getPermissionStatus(boolean z, GetPermissionStatusResponse getPermissionStatusResponse);

    void remove(boolean z, RemoveResponse removeResponse);

    void removeEntry(String str, boolean z, RemoveEntryResponse removeEntryResponse);

    void requestPermission(boolean z, RequestPermissionResponse requestPermissionResponse);

    void resolve(FileSystemAccessTransferToken fileSystemAccessTransferToken, ResolveResponse resolveResponse);

    void transfer(InterfaceRequest<FileSystemAccessTransferToken> interfaceRequest);
}
