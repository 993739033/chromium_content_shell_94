package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface WebDatabaseHost extends Interface {
    public static final Manager<WebDatabaseHost, Proxy> MANAGER = WebDatabaseHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteFileResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetFileAttributesResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetSpaceAvailableResponse extends Callbacks.Callback1<Long> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileResponse extends Callbacks.Callback1<org.chromium.mojo_base.mojom.File> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WebDatabaseHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetFileSizeResponse extends Callbacks.Callback1<Boolean> {
    }

    void closed(Origin origin, String16 string16);

    void deleteFile(String16 string16, boolean z, DeleteFileResponse deleteFileResponse);

    void getFileAttributes(String16 string16, GetFileAttributesResponse getFileAttributesResponse);

    void getSpaceAvailable(Origin origin, GetSpaceAvailableResponse getSpaceAvailableResponse);

    void handleSqliteError(Origin origin, String16 string16, int i);

    void modified(Origin origin, String16 string16);

    void openFile(String16 string16, int i, OpenFileResponse openFileResponse);

    void opened(Origin origin, String16 string16, String16 string162);

    void setFileSize(String16 string16, long j, SetFileSizeResponse setFileSizeResponse);
}
