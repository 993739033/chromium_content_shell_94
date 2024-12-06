package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.FileInfo;
/* loaded from: classes2.dex */
public interface FileSystemAccessFileHandle extends Interface {
    public static final Manager<FileSystemAccessFileHandle, Proxy> MANAGER = FileSystemAccessFileHandle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AsBlobResponse extends Callbacks.Callback3<FileSystemAccessError, FileInfo, SerializedBlob> {
    }

    /* loaded from: classes2.dex */
    public interface CreateFileWriterResponse extends Callbacks.Callback2<FileSystemAccessError, FileSystemAccessFileWriter> {
    }

    /* loaded from: classes2.dex */
    public interface GetPermissionStatusResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface IsSameEntryResponse extends Callbacks.Callback2<FileSystemAccessError, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface OpenAccessHandleResponse extends Callbacks.Callback3<FileSystemAccessError, FileSystemAccessAccessHandleFile, FileSystemAccessAccessHandleHost> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessFileHandle, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface RequestPermissionResponse extends Callbacks.Callback2<FileSystemAccessError, Integer> {
    }

    void asBlob(AsBlobResponse asBlobResponse);

    void createFileWriter(boolean z, boolean z2, CreateFileWriterResponse createFileWriterResponse);

    void getPermissionStatus(boolean z, GetPermissionStatusResponse getPermissionStatusResponse);

    void isSameEntry(FileSystemAccessTransferToken fileSystemAccessTransferToken, IsSameEntryResponse isSameEntryResponse);

    void openAccessHandle(OpenAccessHandleResponse openAccessHandleResponse);

    void remove(RemoveResponse removeResponse);

    void requestPermission(boolean z, RequestPermissionResponse requestPermissionResponse);

    void transfer(InterfaceRequest<FileSystemAccessTransferToken> interfaceRequest);
}
