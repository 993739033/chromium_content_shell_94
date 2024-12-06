package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioOutputStream extends Interface {
    public static final Manager<AudioOutputStream, Proxy> MANAGER = AudioOutputStream_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioOutputStream, Interface.Proxy {
    }

    void flush();

    void pause();

    void play();

    void setVolume(double d);
}
