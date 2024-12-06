package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AudioDecoder extends Interface {
    public static final Manager<AudioDecoder, Proxy> MANAGER = AudioDecoder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DecodeResponse extends Callbacks.Callback1<Status> {
    }

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback3<Status, Boolean, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioDecoder, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ResetResponse extends Callbacks.Callback0 {
    }

    void construct(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);

    void decode(DecoderBuffer decoderBuffer, DecodeResponse decodeResponse);

    void initialize(AudioDecoderConfig audioDecoderConfig, UnguessableToken unguessableToken, InitializeResponse initializeResponse);

    void reset(ResetResponse resetResponse);

    void setDataSource(DataPipe.ConsumerHandle consumerHandle);
}
