package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface AudioLogFactory extends Interface {
    public static final Manager<AudioLogFactory, Proxy> MANAGER = AudioLogFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioLogFactory, Interface.Proxy {
    }

    void createAudioLog(int i, int i2, InterfaceRequest<AudioLog> interfaceRequest);
}
