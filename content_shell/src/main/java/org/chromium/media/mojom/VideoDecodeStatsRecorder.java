package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VideoDecodeStatsRecorder extends Interface {
    public static final Manager<VideoDecodeStatsRecorder, Proxy> MANAGER = VideoDecodeStatsRecorder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoDecodeStatsRecorder, Interface.Proxy {
    }

    void startNewRecord(PredictionFeatures predictionFeatures);

    void updateRecord(PredictionTargets predictionTargets);
}
