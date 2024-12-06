package org.chromium.filesystem.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface Directory extends Interface {
    public static final Manager<Directory, Proxy> MANAGER = Directory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ExistsResponse extends Callbacks.Callback2<Integer, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface IsWritableResponse extends Callbacks.Callback2<Integer, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface OpenDirectoryResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileHandleResponse extends Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.File> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileHandlesResponse extends Callbacks.Callback1<FileOpenResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Directory, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadEntireFileResponse extends Callbacks.Callback2<Integer, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback2<Integer, DirectoryEntry[]> {
    }

    /* loaded from: classes2.dex */
    public interface RenameResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ReplaceResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface StatFileResponse extends Callbacks.Callback2<Integer, FileInformation> {
    }

    /* loaded from: classes2.dex */
    public interface WriteFileResponse extends Callbacks.Callback1<Integer> {
    }

    void clone(InterfaceRequest<Directory> interfaceRequest);

    void delete(String str, int i, DeleteResponse deleteResponse);

    void exists(String str, ExistsResponse existsResponse);

    void flush(FlushResponse flushResponse);

    void isWritable(String str, IsWritableResponse isWritableResponse);

    void openDirectory(String str, InterfaceRequest<Directory> interfaceRequest, int i, OpenDirectoryResponse openDirectoryResponse);

    void openFile(String str, InterfaceRequest<File> interfaceRequest, int i, OpenFileResponse openFileResponse);

    void openFileHandle(String str, int i, OpenFileHandleResponse openFileHandleResponse);

    void openFileHandles(FileOpenDetails[] fileOpenDetailsArr, OpenFileHandlesResponse openFileHandlesResponse);

    void read(ReadResponse readResponse);

    void readEntireFile(String str, ReadEntireFileResponse readEntireFileResponse);

    void rename(String str, String str2, RenameResponse renameResponse);

    void replace(String str, String str2, ReplaceResponse replaceResponse);

    void statFile(String str, StatFileResponse statFileResponse);

    void writeFile(String str, byte[] bArr, WriteFileResponse writeFileResponse);
}
