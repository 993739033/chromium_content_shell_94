package org.chromium.media.learning.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface LearningTaskController extends Interface {
    public static final Manager<LearningTaskController, Proxy> MANAGER = LearningTaskController_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface PredictDistributionResponse extends Callbacks.Callback1<TargetHistogram> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LearningTaskController, Interface.Proxy {
    }

    void beginObservation(UnguessableToken unguessableToken, FeatureValue[] featureValueArr, TargetValue targetValue);

    void cancelObservation(UnguessableToken unguessableToken);

    void completeObservation(UnguessableToken unguessableToken, ObservationCompletion observationCompletion);

    void predictDistribution(FeatureValue[] featureValueArr, PredictDistributionResponse predictDistributionResponse);

    void updateDefaultTarget(UnguessableToken unguessableToken, TargetValue targetValue);
}
