package org.chromium.mojo.system.impl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.mojo.system.impl.WatcherImpl;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class WatcherImplJni implements WatcherImpl.Natives {
    public static final JniStaticTestMocker<WatcherImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<WatcherImpl.Natives>() { // from class: org.chromium.mojo.system.impl.WatcherImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(WatcherImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                WatcherImpl.Natives unused = WatcherImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static WatcherImpl.Natives testInstance;

    WatcherImplJni() {
    }

    @Override // org.chromium.mojo.system.impl.WatcherImpl.Natives
    public long createWatcher(WatcherImpl caller) {
        return GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_createWatcher(caller);
    }

    @Override // org.chromium.mojo.system.impl.WatcherImpl.Natives
    public int start(WatcherImpl caller, long implPtr, int mojoHandle, int flags) {
        return GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_start(caller, implPtr, mojoHandle, flags);
    }

    @Override // org.chromium.mojo.system.impl.WatcherImpl.Natives
    public void cancel(WatcherImpl caller, long implPtr) {
        GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_cancel(caller, implPtr);
    }

    @Override // org.chromium.mojo.system.impl.WatcherImpl.Natives
    public void delete(WatcherImpl caller, long implPtr) {
        GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_delete(caller, implPtr);
    }

    public static WatcherImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            WatcherImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.WatcherImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new WatcherImplJni();
    }
}
