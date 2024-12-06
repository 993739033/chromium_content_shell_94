package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.BigBuffer;
/* loaded from: classes2.dex */
public interface FileSystemAccessFileDelegateHost extends Interface {
    public static final Manager<FileSystemAccessFileDelegateHost, Proxy> MANAGER = FileSystemAccessFileDelegateHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetLengthResponse extends Callbacks.Callback2<Integer, Long> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessFileDelegateHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback3<BigBuffer, Integer, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetLengthResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface WriteResponse extends Callbacks.Callback2<Integer, Integer> {
    }

    void getLength(GetLengthResponse getLengthResponse);

    void read(long j, long j2, ReadResponse readResponse);

    void setLength(long j, SetLengthResponse setLengthResponse);

    void write(long j, DataPipe.ConsumerHandle consumerHandle, WriteResponse writeResponse);
}
