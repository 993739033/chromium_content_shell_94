package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ContentUiEventHandler;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ContentUiEventHandlerJni implements ContentUiEventHandler.Natives {
    public static final JniStaticTestMocker<ContentUiEventHandler.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentUiEventHandler.Natives>() { // from class: org.chromium.content.browser.ContentUiEventHandlerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContentUiEventHandler.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContentUiEventHandler.Natives unused = ContentUiEventHandlerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContentUiEventHandler.Natives testInstance;

    ContentUiEventHandlerJni() {
    }

    @Override // org.chromium.content.browser.ContentUiEventHandler.Natives
    public long init(ContentUiEventHandler caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.ContentUiEventHandler.Natives
    public void sendMouseWheelEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller, long timeMs, float x, float y, float ticksX, float ticksY) {
        GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendMouseWheelEvent(nativeContentUiEventHandler, caller, timeMs, x, y, ticksX, ticksY);
    }

    @Override // org.chromium.content.browser.ContentUiEventHandler.Natives
    public void sendMouseEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller, long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation, float tilt, int changedButton, int buttonState, int metaState, int toolType) {
        GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendMouseEvent(nativeContentUiEventHandler, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
    }

    @Override // org.chromium.content.browser.ContentUiEventHandler.Natives
    public void sendScrollEvent(long nativeContentUiEventHandler, ContentUiEventHandler caller, long timeMs, float deltaX, float deltaY) {
        GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_sendScrollEvent(nativeContentUiEventHandler, caller, timeMs, deltaX, deltaY);
    }

    @Override // org.chromium.content.browser.ContentUiEventHandler.Natives
    public void cancelFling(long nativeContentUiEventHandler, ContentUiEventHandler caller, long timeMs) {
        GEN_JNI.org_chromium_content_browser_ContentUiEventHandler_cancelFling(nativeContentUiEventHandler, caller, timeMs);
    }

    public static ContentUiEventHandler.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContentUiEventHandler.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentUiEventHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ContentUiEventHandlerJni();
    }
}
