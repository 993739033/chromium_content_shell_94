package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FlocService extends Interface {
    public static final Manager<FlocService, Proxy> MANAGER = FlocService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetInterestCohortResponse extends Callbacks.Callback1<InterestCohort> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FlocService, Interface.Proxy {
    }

    void getInterestCohort(GetInterestCohortResponse getInterestCohortResponse);
}
