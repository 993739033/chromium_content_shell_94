package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface WebTransport extends Interface {
    public static final Manager<WebTransport, Proxy> MANAGER = WebTransport_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AcceptBidirectionalStreamResponse extends Callbacks.Callback3<Integer, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface AcceptUnidirectionalStreamResponse extends Callbacks.Callback2<Integer, DataPipe.ConsumerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface CreateStreamResponse extends Callbacks.Callback2<Boolean, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WebTransport, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SendDatagramResponse extends Callbacks.Callback1<Boolean> {
    }

    void abortStream(int i, long j);

    void acceptBidirectionalStream(AcceptBidirectionalStreamResponse acceptBidirectionalStreamResponse);

    void acceptUnidirectionalStream(AcceptUnidirectionalStreamResponse acceptUnidirectionalStreamResponse);

    void createStream(DataPipe.ConsumerHandle consumerHandle, DataPipe.ProducerHandle producerHandle, CreateStreamResponse createStreamResponse);

    void sendDatagram(ReadOnlyBuffer readOnlyBuffer, SendDatagramResponse sendDatagramResponse);

    void sendFin(int i);

    void setOutgoingDatagramExpirationDuration(TimeDelta timeDelta);
}
