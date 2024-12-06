package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VideoDecodePerfHistory extends Interface {
    public static final Manager<VideoDecodePerfHistory, Proxy> MANAGER = VideoDecodePerfHistory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetPerfInfoResponse extends Callbacks.Callback2<Boolean, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoDecodePerfHistory, Interface.Proxy {
    }

    void getPerfInfo(PredictionFeatures predictionFeatures, GetPerfInfoResponse getPerfInfoResponse);
}
