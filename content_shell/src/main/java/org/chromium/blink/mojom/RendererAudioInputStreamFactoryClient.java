package org.chromium.blink.mojom;

import org.chromium.media.mojom.AudioInputStream;
import org.chromium.media.mojom.AudioInputStreamClient;
import org.chromium.media.mojom.ReadOnlyAudioDataPipe;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface RendererAudioInputStreamFactoryClient extends Interface {
    public static final Manager<RendererAudioInputStreamFactoryClient, Proxy> MANAGER = RendererAudioInputStreamFactoryClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RendererAudioInputStreamFactoryClient, Interface.Proxy {
    }

    void streamCreated(AudioInputStream audioInputStream, InterfaceRequest<AudioInputStreamClient> interfaceRequest, ReadOnlyAudioDataPipe readOnlyAudioDataPipe, boolean z, UnguessableToken unguessableToken);
}
