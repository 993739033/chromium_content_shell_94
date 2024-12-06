package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioDecoderClient extends Interface {
    public static final Manager<AudioDecoderClient, Proxy> MANAGER = AudioDecoderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioDecoderClient, Interface.Proxy {
    }

    void onBufferDecoded(AudioBuffer audioBuffer);

    void onWaiting(int i);
}
