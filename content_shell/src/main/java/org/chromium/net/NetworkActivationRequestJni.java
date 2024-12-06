package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.NetworkActivationRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NetworkActivationRequestJni implements NetworkActivationRequest.Natives {
    public static final JniStaticTestMocker<NetworkActivationRequest.Natives> TEST_HOOKS = new JniStaticTestMocker<NetworkActivationRequest.Natives>() { // from class: org.chromium.net.NetworkActivationRequestJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(NetworkActivationRequest.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                NetworkActivationRequest.Natives unused = NetworkActivationRequestJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static NetworkActivationRequest.Natives testInstance;

    NetworkActivationRequestJni() {
    }

    @Override // org.chromium.net.NetworkActivationRequest.Natives
    public void notifyAvailable(long nativeNetworkActivationRequest, long netId) {
        GEN_JNI.org_chromium_net_NetworkActivationRequest_notifyAvailable(nativeNetworkActivationRequest, netId);
    }

    public static NetworkActivationRequest.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NetworkActivationRequest.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.NetworkActivationRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NetworkActivationRequestJni();
    }
}
