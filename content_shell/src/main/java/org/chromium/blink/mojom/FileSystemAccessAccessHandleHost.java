package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FileSystemAccessAccessHandleHost extends Interface {
    public static final Manager<FileSystemAccessAccessHandleHost, Proxy> MANAGER = FileSystemAccessAccessHandleHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessAccessHandleHost, Interface.Proxy {
    }

    void close(CloseResponse closeResponse);
}
