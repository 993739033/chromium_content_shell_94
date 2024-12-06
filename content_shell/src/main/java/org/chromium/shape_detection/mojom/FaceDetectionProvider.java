package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface FaceDetectionProvider extends Interface {
    public static final Manager<FaceDetectionProvider, Proxy> MANAGER = FaceDetectionProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FaceDetectionProvider, Interface.Proxy {
    }

    void createFaceDetection(InterfaceRequest<FaceDetection> interfaceRequest, FaceDetectorOptions faceDetectorOptions);
}
