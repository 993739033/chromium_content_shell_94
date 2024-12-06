package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.JavascriptInjectorImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class JavascriptInjectorImplJni implements JavascriptInjectorImpl.Natives {
    public static final JniStaticTestMocker<JavascriptInjectorImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<JavascriptInjectorImpl.Natives>() { // from class: org.chromium.content.browser.JavascriptInjectorImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(JavascriptInjectorImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                JavascriptInjectorImpl.Natives unused = JavascriptInjectorImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static JavascriptInjectorImpl.Natives testInstance;

    JavascriptInjectorImplJni() {
    }

    @Override // org.chromium.content.browser.JavascriptInjectorImpl.Natives
    public long init(JavascriptInjectorImpl caller, WebContents webContents, Object retainedObjects) {
        return GEN_JNI.org_chromium_content_browser_JavascriptInjectorImpl_init(caller, webContents, retainedObjects);
    }

    @Override // org.chromium.content.browser.JavascriptInjectorImpl.Natives
    public void setAllowInspection(long nativeJavascriptInjector, JavascriptInjectorImpl caller, boolean allow) {
        GEN_JNI.org_chromium_content_browser_JavascriptInjectorImpl_setAllowInspection(nativeJavascriptInjector, caller, allow);
    }

    @Override // org.chromium.content.browser.JavascriptInjectorImpl.Natives
    public void addInterface(long nativeJavascriptInjector, JavascriptInjectorImpl caller, Object object, String name, Class requiredAnnotation) {
        GEN_JNI.org_chromium_content_browser_JavascriptInjectorImpl_addInterface(nativeJavascriptInjector, caller, object, name, requiredAnnotation);
    }

    @Override // org.chromium.content.browser.JavascriptInjectorImpl.Natives
    public void removeInterface(long nativeJavascriptInjector, JavascriptInjectorImpl caller, String name) {
        GEN_JNI.org_chromium_content_browser_JavascriptInjectorImpl_removeInterface(nativeJavascriptInjector, caller, name);
    }

    public static JavascriptInjectorImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            JavascriptInjectorImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.JavascriptInjectorImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new JavascriptInjectorImplJni();
    }
}
