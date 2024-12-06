package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface NetworkQualityEstimatorManagerClient extends Interface {
    public static final Manager<NetworkQualityEstimatorManagerClient, Proxy> MANAGER = NetworkQualityEstimatorManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkQualityEstimatorManagerClient, Interface.Proxy {
    }

    void onNetworkQualityChanged(int i, TimeDelta timeDelta, TimeDelta timeDelta2, int i2);
}
