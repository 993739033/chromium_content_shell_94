package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public interface RendererClient extends Interface {
    public static final Manager<RendererClient, Proxy> MANAGER = RendererClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RendererClient, Interface.Proxy {
    }

    void onAudioConfigChange(AudioDecoderConfig audioDecoderConfig);

    void onBufferingStateChange(int i, int i2);

    void onEnded();

    void onError(Status status);

    void onStatisticsUpdate(PipelineStatistics pipelineStatistics);

    void onTimeUpdate(TimeDelta timeDelta, TimeDelta timeDelta2, TimeTicks timeTicks);

    void onVideoConfigChange(VideoDecoderConfig videoDecoderConfig);

    void onVideoNaturalSizeChange(Size size);

    void onVideoOpacityChange(boolean z);

    void onWaiting(int i);
}
