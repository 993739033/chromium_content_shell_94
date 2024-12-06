package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface NativeIoHost extends Interface {
    public static final Manager<NativeIoHost, Proxy> MANAGER = NativeIoHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteFileResponse extends Callbacks.Callback2<NativeIoError, Long> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllFileNamesResponse extends Callbacks.Callback2<Boolean, String[]> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileResponse extends Callbacks.Callback3<org.chromium.mojo_base.mojom.File, Long, NativeIoError> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NativeIoHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RenameFileResponse extends Callbacks.Callback1<NativeIoError> {
    }

    /* loaded from: classes2.dex */
    public interface RequestCapacityChangeResponse extends Callbacks.Callback1<Long> {
    }

    void deleteFile(String str, DeleteFileResponse deleteFileResponse);

    void getAllFileNames(GetAllFileNamesResponse getAllFileNamesResponse);

    void openFile(String str, InterfaceRequest<NativeIoFileHost> interfaceRequest, OpenFileResponse openFileResponse);

    void renameFile(String str, String str2, RenameFileResponse renameFileResponse);

    void requestCapacityChange(long j, RequestCapacityChangeResponse requestCapacityChangeResponse);
}
