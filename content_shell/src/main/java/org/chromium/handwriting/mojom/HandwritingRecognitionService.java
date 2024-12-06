package org.chromium.handwriting.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HandwritingRecognitionService extends Interface {
    public static final Manager<HandwritingRecognitionService, Proxy> MANAGER = HandwritingRecognitionService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateHandwritingRecognizerResponse extends Callbacks.Callback2<Integer, HandwritingRecognizer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HandwritingRecognitionService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryHandwritingRecognizerSupportResponse extends Callbacks.Callback1<HandwritingFeatureQueryResult> {
    }

    void createHandwritingRecognizer(HandwritingModelConstraint handwritingModelConstraint, CreateHandwritingRecognizerResponse createHandwritingRecognizerResponse);

    void queryHandwritingRecognizerSupport(HandwritingFeatureQuery handwritingFeatureQuery, QueryHandwritingRecognizerSupportResponse queryHandwritingRecognizerSupportResponse);
}
