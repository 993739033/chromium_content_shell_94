package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.BackgroundSyncNetworkObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BackgroundSyncNetworkObserverJni implements BackgroundSyncNetworkObserver.Natives {
    public static final JniStaticTestMocker<BackgroundSyncNetworkObserver.Natives> TEST_HOOKS = new JniStaticTestMocker<BackgroundSyncNetworkObserver.Natives>() { // from class: org.chromium.content.browser.BackgroundSyncNetworkObserverJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(BackgroundSyncNetworkObserver.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                BackgroundSyncNetworkObserver.Natives unused = BackgroundSyncNetworkObserverJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static BackgroundSyncNetworkObserver.Natives testInstance;

    BackgroundSyncNetworkObserverJni() {
    }

    @Override // org.chromium.content.browser.BackgroundSyncNetworkObserver.Natives
    public void notifyConnectionTypeChanged(long nativePtr, BackgroundSyncNetworkObserver caller, int newConnectionType) {
        GEN_JNI.org_chromium_content_browser_BackgroundSyncNetworkObserver_notifyConnectionTypeChanged(nativePtr, caller, newConnectionType);
    }

    public static BackgroundSyncNetworkObserver.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            BackgroundSyncNetworkObserver.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.BackgroundSyncNetworkObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new BackgroundSyncNetworkObserverJni();
    }
}
