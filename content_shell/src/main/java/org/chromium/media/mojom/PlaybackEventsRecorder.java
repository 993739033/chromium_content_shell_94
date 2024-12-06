package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PlaybackEventsRecorder extends Interface {
    public static final Manager<PlaybackEventsRecorder, Proxy> MANAGER = PlaybackEventsRecorder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PlaybackEventsRecorder, Interface.Proxy {
    }

    void onBuffering();

    void onBufferingComplete();

    void onEnded();

    void onError(int i);

    void onNaturalSizeChanged(Size size);

    void onPaused();

    void onPipelineStatistics(PipelineStatistics pipelineStatistics);

    void onPlaying();

    void onSeeking();
}
