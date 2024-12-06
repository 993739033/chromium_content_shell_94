package org.chromium.blink.mojom;

import org.chromium.media.mojom.AudioOutputStreamProvider;
import org.chromium.media.mojom.AudioParameters;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface RendererAudioOutputStreamFactory extends Interface {
    public static final Manager<RendererAudioOutputStreamFactory, Proxy> MANAGER = RendererAudioOutputStreamFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RendererAudioOutputStreamFactory, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestDeviceAuthorizationResponse extends Callbacks.Callback3<Integer, AudioParameters, String> {
    }

    void requestDeviceAuthorization(InterfaceRequest<AudioOutputStreamProvider> interfaceRequest, UnguessableToken unguessableToken, String str, RequestDeviceAuthorizationResponse requestDeviceAuthorizationResponse);
}
