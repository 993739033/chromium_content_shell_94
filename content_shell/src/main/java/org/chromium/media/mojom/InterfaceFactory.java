package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface InterfaceFactory extends Interface {
    public static final Manager<InterfaceFactory, Proxy> MANAGER = InterfaceFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateCdmResponse extends Callbacks.Callback3<ContentDecryptionModule, CdmContext, String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends InterfaceFactory, Interface.Proxy {
    }

    void createAudioDecoder(InterfaceRequest<AudioDecoder> interfaceRequest);

    void createCdm(String str, CdmConfig cdmConfig, CreateCdmResponse createCdmResponse);

    void createDefaultRenderer(String str, InterfaceRequest<Renderer> interfaceRequest);

    void createFlingingRenderer(String str, FlingingRendererClientExtension flingingRendererClientExtension, InterfaceRequest<Renderer> interfaceRequest);

    void createMediaPlayerRenderer(MediaPlayerRendererClientExtension mediaPlayerRendererClientExtension, InterfaceRequest<Renderer> interfaceRequest, InterfaceRequest<MediaPlayerRendererExtension> interfaceRequest2);

    void createVideoDecoder(InterfaceRequest<VideoDecoder> interfaceRequest);
}
