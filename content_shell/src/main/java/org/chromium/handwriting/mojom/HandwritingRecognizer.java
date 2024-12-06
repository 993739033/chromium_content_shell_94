package org.chromium.handwriting.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HandwritingRecognizer extends Interface {
    public static final Manager<HandwritingRecognizer, Proxy> MANAGER = HandwritingRecognizer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetPredictionResponse extends Callbacks.Callback1<HandwritingPrediction[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HandwritingRecognizer, Interface.Proxy {
    }

    void getPrediction(HandwritingStroke[] handwritingStrokeArr, HandwritingHints handwritingHints, GetPredictionResponse getPredictionResponse);
}
