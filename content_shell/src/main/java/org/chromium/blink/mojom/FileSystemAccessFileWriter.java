package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface FileSystemAccessFileWriter extends Interface {
    public static final Manager<FileSystemAccessFileWriter, Proxy> MANAGER = FileSystemAccessFileWriter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AbortResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessFileWriter, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface TruncateResponse extends Callbacks.Callback1<FileSystemAccessError> {
    }

    /* loaded from: classes2.dex */
    public interface WriteResponse extends Callbacks.Callback2<FileSystemAccessError, Long> {
    }

    void abort(AbortResponse abortResponse);

    void close(CloseResponse closeResponse);

    void truncate(long j, TruncateResponse truncateResponse);

    void write(long j, DataPipe.ConsumerHandle consumerHandle, WriteResponse writeResponse);
}
