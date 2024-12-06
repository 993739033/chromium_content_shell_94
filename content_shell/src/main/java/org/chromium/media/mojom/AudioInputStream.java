package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioInputStream extends Interface {
    public static final Manager<AudioInputStream, Proxy> MANAGER = AudioInputStream_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioInputStream, Interface.Proxy {
    }

    void record();

    void setVolume(double d);
}
