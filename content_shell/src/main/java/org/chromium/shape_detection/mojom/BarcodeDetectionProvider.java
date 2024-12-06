package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface BarcodeDetectionProvider extends Interface {
    public static final Manager<BarcodeDetectionProvider, Proxy> MANAGER = BarcodeDetectionProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnumerateSupportedFormatsResponse extends Callbacks.Callback1<int[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BarcodeDetectionProvider, Interface.Proxy {
    }

    void createBarcodeDetection(InterfaceRequest<BarcodeDetection> interfaceRequest, BarcodeDetectorOptions barcodeDetectorOptions);

    void enumerateSupportedFormats(EnumerateSupportedFormatsResponse enumerateSupportedFormatsResponse);
}
