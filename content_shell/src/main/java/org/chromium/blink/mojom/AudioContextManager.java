package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioContextManager extends Interface {
    public static final Manager<AudioContextManager, Proxy> MANAGER = AudioContextManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioContextManager, Interface.Proxy {
    }

    void audioContextAudiblePlaybackStarted(int i);

    void audioContextAudiblePlaybackStopped(int i);
}
