package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface Renderer extends Interface {
    public static final Manager<Renderer, Proxy> MANAGER = Renderer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Renderer, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetCdmResponse extends Callbacks.Callback1<Boolean> {
    }

    void flush(FlushResponse flushResponse);

    void initialize(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, DemuxerStream[] demuxerStreamArr, MediaUrlParams mediaUrlParams, InitializeResponse initializeResponse);

    void setCdm(UnguessableToken unguessableToken, SetCdmResponse setCdmResponse);

    void setPlaybackRate(double d);

    void setVolume(float f);

    void startPlayingFrom(TimeDelta timeDelta);
}
