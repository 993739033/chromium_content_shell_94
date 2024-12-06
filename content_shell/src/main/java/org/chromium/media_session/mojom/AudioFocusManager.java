package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AudioFocusManager extends Interface {
    public static final Manager<AudioFocusManager, Proxy> MANAGER = AudioFocusManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetFocusRequestsResponse extends Callbacks.Callback1<AudioFocusRequestState[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetSourceFocusRequestsResponse extends Callbacks.Callback1<AudioFocusRequestState[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioFocusManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestAudioFocusResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface RequestGroupedAudioFocusResponse extends Callbacks.Callback1<Boolean> {
    }

    void addObserver(AudioFocusObserver audioFocusObserver);

    void addSourceObserver(UnguessableToken unguessableToken, AudioFocusObserver audioFocusObserver);

    void getFocusRequests(GetFocusRequestsResponse getFocusRequestsResponse);

    void getSourceFocusRequests(UnguessableToken unguessableToken, GetSourceFocusRequestsResponse getSourceFocusRequestsResponse);

    void requestAudioFocus(InterfaceRequest<AudioFocusRequestClient> interfaceRequest, MediaSession mediaSession, MediaSessionInfo mediaSessionInfo, int i, RequestAudioFocusResponse requestAudioFocusResponse);

    void requestGroupedAudioFocus(UnguessableToken unguessableToken, InterfaceRequest<AudioFocusRequestClient> interfaceRequest, MediaSession mediaSession, MediaSessionInfo mediaSessionInfo, int i, UnguessableToken unguessableToken2, RequestGroupedAudioFocusResponse requestGroupedAudioFocusResponse);

    void requestIdReleased(UnguessableToken unguessableToken);

    void setEnforcementMode(int i);

    void setSource(UnguessableToken unguessableToken, String str);
}
