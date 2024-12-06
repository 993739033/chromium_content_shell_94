package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface TextDetection extends Interface {
    public static final Manager<TextDetection, Proxy> MANAGER = TextDetection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DetectResponse extends Callbacks.Callback1<TextDetectionResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends TextDetection, Interface.Proxy {
    }

    void detect(BitmapN32 bitmapN32, DetectResponse detectResponse);
}
