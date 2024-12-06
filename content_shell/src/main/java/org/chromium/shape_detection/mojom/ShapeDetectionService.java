package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface ShapeDetectionService extends Interface {
    public static final Manager<ShapeDetectionService, Proxy> MANAGER = ShapeDetectionService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ShapeDetectionService, Interface.Proxy {
    }

    void bindBarcodeDetectionProvider(InterfaceRequest<BarcodeDetectionProvider> interfaceRequest);

    void bindFaceDetectionProvider(InterfaceRequest<FaceDetectionProvider> interfaceRequest);

    void bindTextDetection(InterfaceRequest<TextDetection> interfaceRequest);
}
