package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FileSystemCancellableOperation extends Interface {
    public static final Manager<FileSystemCancellableOperation, Proxy> MANAGER = FileSystemCancellableOperation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CancelResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemCancellableOperation, Interface.Proxy {
    }

    void cancel(CancelResponse cancelResponse);
}
