package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioOutputStreamProviderClient extends Interface {
    public static final Manager<AudioOutputStreamProviderClient, Proxy> MANAGER = AudioOutputStreamProviderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioOutputStreamProviderClient, Interface.Proxy {
    }

    void created(AudioOutputStream audioOutputStream, ReadWriteAudioDataPipe readWriteAudioDataPipe);
}
