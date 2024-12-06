package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface FileSystemAccessManager extends Interface {
    public static final Manager<FileSystemAccessManager, Proxy> MANAGER = FileSystemAccessManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChooseEntriesResponse extends Callbacks.Callback2<FileSystemAccessError, FileSystemAccessEntry[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetEntryFromDataTransferTokenResponse extends Callbacks.Callback1<FileSystemAccessEntry> {
    }

    /* loaded from: classes2.dex */
    public interface GetSandboxedFileSystemResponse extends Callbacks.Callback2<FileSystemAccessError, FileSystemAccessDirectoryHandle> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessManager, Interface.Proxy {
    }

    void chooseEntries(FilePickerOptions filePickerOptions, CommonFilePickerOptions commonFilePickerOptions, ChooseEntriesResponse chooseEntriesResponse);

    void getDirectoryHandleFromToken(FileSystemAccessTransferToken fileSystemAccessTransferToken, InterfaceRequest<FileSystemAccessDirectoryHandle> interfaceRequest);

    void getEntryFromDataTransferToken(FileSystemAccessDataTransferToken fileSystemAccessDataTransferToken, GetEntryFromDataTransferTokenResponse getEntryFromDataTransferTokenResponse);

    void getFileHandleFromToken(FileSystemAccessTransferToken fileSystemAccessTransferToken, InterfaceRequest<FileSystemAccessFileHandle> interfaceRequest);

    void getSandboxedFileSystem(GetSandboxedFileSystemResponse getSandboxedFileSystemResponse);
}
