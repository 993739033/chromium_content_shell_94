package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.FileInfo;
import org.chromium.mojo_base.mojom.FilePath;
/* loaded from: classes2.dex */
public interface FileUtilitiesHost extends Interface {
    public static final Manager<FileUtilitiesHost, Proxy> MANAGER = FileUtilitiesHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetFileInfoResponse extends Callbacks.Callback1<FileInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileUtilitiesHost, Interface.Proxy {
    }

    void getFileInfo(FilePath filePath, GetFileInfoResponse getFileInfoResponse);
}
