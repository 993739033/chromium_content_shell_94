package org.chromium.filesystem.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface File extends Interface {
    public static final Manager<File, Proxy> MANAGER = File_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AsHandleResponse extends Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.File> {
    }

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DupResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface LockResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends File, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback2<Integer, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface SeekResponse extends Callbacks.Callback2<Integer, Long> {
    }

    /* loaded from: classes2.dex */
    public interface StatResponse extends Callbacks.Callback2<Integer, FileInformation> {
    }

    /* loaded from: classes2.dex */
    public interface TellResponse extends Callbacks.Callback2<Integer, Long> {
    }

    /* loaded from: classes2.dex */
    public interface TouchResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface TruncateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface UnlockResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface WriteResponse extends Callbacks.Callback2<Integer, Integer> {
    }

    void asHandle(AsHandleResponse asHandleResponse);

    void close(CloseResponse closeResponse);

    void dup(InterfaceRequest<File> interfaceRequest, DupResponse dupResponse);

    void flush(FlushResponse flushResponse);

    void lock(LockResponse lockResponse);

    void read(int i, long j, int i2, ReadResponse readResponse);

    void seek(long j, int i, SeekResponse seekResponse);

    void stat(StatResponse statResponse);

    void tell(TellResponse tellResponse);

    void touch(TimespecOrNow timespecOrNow, TimespecOrNow timespecOrNow2, TouchResponse touchResponse);

    void truncate(long j, TruncateResponse truncateResponse);

    void unlock(UnlockResponse unlockResponse);

    void write(byte[] bArr, long j, int i, WriteResponse writeResponse);
}
