package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface ChunkedDataPipeGetter extends Interface {
    public static final Manager<ChunkedDataPipeGetter, Proxy> MANAGER = ChunkedDataPipeGetter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetSizeResponse extends Callbacks.Callback2<Integer, Long> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ChunkedDataPipeGetter, Interface.Proxy {
    }

    void getSize(GetSizeResponse getSizeResponse);

    void startReading(DataPipe.ProducerHandle producerHandle);
}
