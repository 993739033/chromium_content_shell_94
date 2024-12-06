package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.NetworkChangeNotifier;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NetworkChangeNotifierJni implements NetworkChangeNotifier.Natives {
    public static final JniStaticTestMocker<NetworkChangeNotifier.Natives> TEST_HOOKS = new JniStaticTestMocker<NetworkChangeNotifier.Natives>() { // from class: org.chromium.net.NetworkChangeNotifierJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(NetworkChangeNotifier.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                NetworkChangeNotifier.Natives unused = NetworkChangeNotifierJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static NetworkChangeNotifier.Natives testInstance;

    NetworkChangeNotifierJni() {
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyConnectionTypeChanged(long nativePtr, NetworkChangeNotifier caller, int newConnectionType, long defaultNetId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(nativePtr, caller, newConnectionType, defaultNetId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyMaxBandwidthChanged(long nativePtr, NetworkChangeNotifier caller, int subType) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(nativePtr, caller, subType);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkConnect(long nativePtr, NetworkChangeNotifier caller, long netId, int connectionType) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(nativePtr, caller, netId, connectionType);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkSoonToDisconnect(long nativePtr, NetworkChangeNotifier caller, long netId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(nativePtr, caller, netId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyOfNetworkDisconnect(long nativePtr, NetworkChangeNotifier caller, long netId) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(nativePtr, caller, netId);
    }

    @Override // org.chromium.net.NetworkChangeNotifier.Natives
    public void notifyPurgeActiveNetworkList(long nativePtr, NetworkChangeNotifier caller, long[] activeNetIds) {
        GEN_JNI.org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(nativePtr, caller, activeNetIds);
    }

    public static NetworkChangeNotifier.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NetworkChangeNotifier.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkChangeNotifier.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NetworkChangeNotifierJni();
    }
}
