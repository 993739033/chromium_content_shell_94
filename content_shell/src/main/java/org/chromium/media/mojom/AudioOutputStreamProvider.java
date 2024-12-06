package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioOutputStreamProvider extends Interface {
    public static final Manager<AudioOutputStreamProvider, Proxy> MANAGER = AudioOutputStreamProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioOutputStreamProvider, Interface.Proxy {
    }

    void acquire(AudioParameters audioParameters, AudioOutputStreamProviderClient audioOutputStreamProviderClient);
}
