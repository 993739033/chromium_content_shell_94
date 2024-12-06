package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface FaceDetection extends Interface {
    public static final Manager<FaceDetection, Proxy> MANAGER = FaceDetection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DetectResponse extends Callbacks.Callback1<FaceDetectionResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FaceDetection, Interface.Proxy {
    }

    void detect(BitmapN32 bitmapN32, DetectResponse detectResponse);
}
