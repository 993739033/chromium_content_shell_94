package org.chromium.mojo.system.impl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.mojo.system.impl.BaseRunLoop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseRunLoopJni implements BaseRunLoop.Natives {
    public static final JniStaticTestMocker<BaseRunLoop.Natives> TEST_HOOKS = new JniStaticTestMocker<BaseRunLoop.Natives>() { // from class: org.chromium.mojo.system.impl.BaseRunLoopJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(BaseRunLoop.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                BaseRunLoop.Natives unused = BaseRunLoopJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static BaseRunLoop.Natives testInstance;

    BaseRunLoopJni() {
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public long createBaseRunLoop(BaseRunLoop caller) {
        return GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_createBaseRunLoop(caller);
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public void run(BaseRunLoop caller) {
        GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_run(caller);
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public void runUntilIdle(BaseRunLoop caller) {
        GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_runUntilIdle(caller);
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public void quit(BaseRunLoop caller) {
        GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_quit(caller);
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public void postDelayedTask(BaseRunLoop caller, long runLoopID, Runnable runnable, long delay) {
        GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_postDelayedTask(caller, runLoopID, runnable, delay);
    }

    @Override // org.chromium.mojo.system.impl.BaseRunLoop.Natives
    public void deleteMessageLoop(BaseRunLoop caller, long runLoopID) {
        GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_deleteMessageLoop(caller, runLoopID);
    }

    public static BaseRunLoop.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            BaseRunLoop.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.BaseRunLoop.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new BaseRunLoopJni();
    }
}
