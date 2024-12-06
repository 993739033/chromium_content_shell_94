package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface DataPipeGetter extends Interface {
    public static final Manager<DataPipeGetter, Proxy> MANAGER = DataPipeGetter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DataPipeGetter, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback2<Integer, Long> {
    }

    void clone(InterfaceRequest<DataPipeGetter> interfaceRequest);

    void read(DataPipe.ProducerHandle producerHandle, ReadResponse readResponse);
}
