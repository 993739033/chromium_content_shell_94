package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.ProxyChangeListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ProxyChangeListenerJni implements ProxyChangeListener.Natives {
    public static final JniStaticTestMocker<ProxyChangeListener.Natives> TEST_HOOKS = new JniStaticTestMocker<ProxyChangeListener.Natives>() { // from class: org.chromium.net.ProxyChangeListenerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ProxyChangeListener.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ProxyChangeListener.Natives unused = ProxyChangeListenerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ProxyChangeListener.Natives testInstance;

    ProxyChangeListenerJni() {
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChangedTo(long nativePtr, ProxyChangeListener caller, String host, int port, String pacUrl, String[] exclusionList) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(nativePtr, caller, host, port, pacUrl, exclusionList);
    }

    @Override // org.chromium.net.ProxyChangeListener.Natives
    public void proxySettingsChanged(long nativePtr, ProxyChangeListener caller) {
        GEN_JNI.org_chromium_net_ProxyChangeListener_proxySettingsChanged(nativePtr, caller);
    }

    public static ProxyChangeListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ProxyChangeListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.ProxyChangeListener.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ProxyChangeListenerJni();
    }
}
