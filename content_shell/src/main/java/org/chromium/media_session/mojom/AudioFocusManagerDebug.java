package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AudioFocusManagerDebug extends Interface {
    public static final Manager<AudioFocusManagerDebug, Proxy> MANAGER = AudioFocusManagerDebug_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDebugInfoForRequestResponse extends Callbacks.Callback1<MediaSessionDebugInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioFocusManagerDebug, Interface.Proxy {
    }

    void getDebugInfoForRequest(UnguessableToken unguessableToken, GetDebugInfoForRequestResponse getDebugInfoForRequestResponse);
}
