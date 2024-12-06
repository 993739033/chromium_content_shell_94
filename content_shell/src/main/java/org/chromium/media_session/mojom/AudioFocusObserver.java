package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AudioFocusObserver extends Interface {
    public static final Manager<AudioFocusObserver, Proxy> MANAGER = AudioFocusObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioFocusObserver, Interface.Proxy {
    }

    void onFocusGained(AudioFocusRequestState audioFocusRequestState);

    void onFocusLost(AudioFocusRequestState audioFocusRequestState);

    void onRequestIdReleased(UnguessableToken unguessableToken);
}
