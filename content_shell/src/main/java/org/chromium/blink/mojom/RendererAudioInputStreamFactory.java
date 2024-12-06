package org.chromium.blink.mojom;

import org.chromium.media.mojom.AudioParameters;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface RendererAudioInputStreamFactory extends Interface {
    public static final Manager<RendererAudioInputStreamFactory, Proxy> MANAGER = RendererAudioInputStreamFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RendererAudioInputStreamFactory, Interface.Proxy {
    }

    void associateInputAndOutputForAec(UnguessableToken unguessableToken, String str);

    void createStream(RendererAudioInputStreamFactoryClient rendererAudioInputStreamFactoryClient, UnguessableToken unguessableToken, AudioParameters audioParameters, boolean z, int i);
}
