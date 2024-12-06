package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface BarcodeDetection extends Interface {
    public static final Manager<BarcodeDetection, Proxy> MANAGER = BarcodeDetection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DetectResponse extends Callbacks.Callback1<BarcodeDetectionResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BarcodeDetection, Interface.Proxy {
    }

    void detect(BitmapN32 bitmapN32, DetectResponse detectResponse);
}
