package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NetworkQualityEstimatorManager extends Interface {
    public static final Manager<NetworkQualityEstimatorManager, Proxy> MANAGER = NetworkQualityEstimatorManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkQualityEstimatorManager, Interface.Proxy {
    }

    void requestNotifications(NetworkQualityEstimatorManagerClient networkQualityEstimatorManagerClient);
}
