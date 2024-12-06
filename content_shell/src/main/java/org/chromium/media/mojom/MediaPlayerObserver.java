package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.media_session.mojom.MediaPosition;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaPlayerObserver extends Interface {
    public static final Manager<MediaPlayerObserver, Proxy> MANAGER = MediaPlayerObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaPlayerObserver, Interface.Proxy {
    }

    void onAudioOutputSinkChanged(String str);

    void onAudioOutputSinkChangingDisabled();

    void onBufferUnderflow();

    void onMediaEffectivelyFullscreenChanged(int i);

    void onMediaMetadataChanged(boolean z, boolean z2, int i);

    void onMediaPaused(boolean z);

    void onMediaPlaying();

    void onMediaPositionStateChanged(MediaPosition mediaPosition);

    void onMediaSizeChanged(Size size);

    void onMutedStatusChanged(boolean z);

    void onPictureInPictureAvailabilityChanged(boolean z);

    void onSeek();

    void onUseAudioServiceChanged(boolean z);
}
