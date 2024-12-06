package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioFocusRequestClient extends Interface {
    public static final Manager<AudioFocusRequestClient, Proxy> MANAGER = AudioFocusRequestClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioFocusRequestClient, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestAudioFocusResponse extends Callbacks.Callback0 {
    }

    void abandonAudioFocus();

    void mediaSessionInfoChanged(MediaSessionInfo mediaSessionInfo);

    void requestAudioFocus(MediaSessionInfo mediaSessionInfo, int i, RequestAudioFocusResponse requestAudioFocusResponse);
}
