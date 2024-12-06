package org.chromium.media.mojom;

import org.chromium.gfx.mojom.ColorSpace;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface VideoDecoder extends Interface {
    public static final Manager<VideoDecoder, Proxy> MANAGER = VideoDecoder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DecodeResponse extends Callbacks.Callback1<Status> {
    }

    /* loaded from: classes2.dex */
    public interface GetSupportedConfigsResponse extends Callbacks.Callback2<SupportedVideoDecoderConfig[], Integer> {
    }

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback4<Status, Boolean, Integer, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoDecoder, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ResetResponse extends Callbacks.Callback0 {
    }

    void construct(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceNotSupported associatedInterfaceNotSupported2, InterfaceRequest<VideoFrameHandleReleaser> interfaceRequest, DataPipe.ConsumerHandle consumerHandle, CommandBufferId commandBufferId, ColorSpace colorSpace);

    void decode(DecoderBuffer decoderBuffer, DecodeResponse decodeResponse);

    void getSupportedConfigs(GetSupportedConfigsResponse getSupportedConfigsResponse);

    void initialize(VideoDecoderConfig videoDecoderConfig, boolean z, UnguessableToken unguessableToken, InitializeResponse initializeResponse);

    void onOverlayInfoChanged(OverlayInfo overlayInfo);

    void reset(ResetResponse resetResponse);
}
