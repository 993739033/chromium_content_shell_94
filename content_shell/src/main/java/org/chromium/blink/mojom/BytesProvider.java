package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public interface BytesProvider extends Interface {
    public static final Manager<BytesProvider, Proxy> MANAGER = BytesProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BytesProvider, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestAsFileResponse extends Callbacks.Callback1<Time> {
    }

    /* loaded from: classes2.dex */
    public interface RequestAsReplyResponse extends Callbacks.Callback1<byte[]> {
    }

    void requestAsFile(long j, long j2, org.chromium.mojo_base.mojom.File file, long j3, RequestAsFileResponse requestAsFileResponse);

    void requestAsReply(RequestAsReplyResponse requestAsReplyResponse);

    void requestAsStream(DataPipe.ProducerHandle producerHandle);
}
