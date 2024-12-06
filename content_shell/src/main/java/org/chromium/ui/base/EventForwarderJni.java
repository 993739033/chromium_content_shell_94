package org.chromium.ui.base;

import android.view.KeyEvent;
import android.view.MotionEvent;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.EventForwarder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class EventForwarderJni implements EventForwarder.Natives {
    public static final JniStaticTestMocker<EventForwarder.Natives> TEST_HOOKS = new JniStaticTestMocker<EventForwarder.Natives>() { // from class: org.chromium.ui.base.EventForwarderJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(EventForwarder.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                EventForwarder.Natives unused = EventForwarderJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static EventForwarder.Natives testInstance;

    EventForwarderJni() {
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public WindowAndroid getJavaWindowAndroid(long nativeEventForwarder, EventForwarder caller) {
        return (WindowAndroid) GEN_JNI.org_chromium_ui_base_EventForwarder_getJavaWindowAndroid(nativeEventForwarder, caller);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public boolean onTouchEvent(long nativeEventForwarder, EventForwarder caller, MotionEvent event, long timeMs, int action, int pointerCount, int historySize, int actionIndex, float x0, float y0, float x1, float y1, int pointerId0, int pointerId1, float touchMajor0, float touchMajor1, float touchMinor0, float touchMinor1, float orientation0, float orientation1, float tilt0, float tilt1, float rawX, float rawY, int androidToolType0, int androidToolType1, int gestureClassification, int androidButtonState, int androidMetaState, boolean isTouchHandleEvent) {
        return GEN_JNI.org_chromium_ui_base_EventForwarder_onTouchEvent(nativeEventForwarder, caller, event, timeMs, action, pointerCount, historySize, actionIndex, x0, y0, x1, y1, pointerId0, pointerId1, touchMajor0, touchMajor1, touchMinor0, touchMinor1, orientation0, orientation1, tilt0, tilt1, rawX, rawY, androidToolType0, androidToolType1, gestureClassification, androidButtonState, androidMetaState, isTouchHandleEvent);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void onMouseEvent(long nativeEventForwarder, EventForwarder caller, long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation, float tilt, int changedButton, int buttonState, int metaState, int toolType) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_onMouseEvent(nativeEventForwarder, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void onDragEvent(long nativeEventForwarder, EventForwarder caller, int action, int x, int y, int screenX, int screenY, String[] mimeTypes, String content) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_onDragEvent(nativeEventForwarder, caller, action, x, y, screenX, screenY, mimeTypes, content);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public boolean onGestureEvent(long nativeEventForwarder, EventForwarder caller, int type, long timeMs, float delta) {
        return GEN_JNI.org_chromium_ui_base_EventForwarder_onGestureEvent(nativeEventForwarder, caller, type, timeMs, delta);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public boolean onGenericMotionEvent(long nativeEventForwarder, EventForwarder caller, MotionEvent event, long timeMs) {
        return GEN_JNI.org_chromium_ui_base_EventForwarder_onGenericMotionEvent(nativeEventForwarder, caller, event, timeMs);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public boolean onKeyUp(long nativeEventForwarder, EventForwarder caller, KeyEvent event, int keyCode) {
        return GEN_JNI.org_chromium_ui_base_EventForwarder_onKeyUp(nativeEventForwarder, caller, event, keyCode);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public boolean dispatchKeyEvent(long nativeEventForwarder, EventForwarder caller, KeyEvent event) {
        return GEN_JNI.org_chromium_ui_base_EventForwarder_dispatchKeyEvent(nativeEventForwarder, caller, event);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void scrollBy(long nativeEventForwarder, EventForwarder caller, float deltaX, float deltaY) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_scrollBy(nativeEventForwarder, caller, deltaX, deltaY);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void scrollTo(long nativeEventForwarder, EventForwarder caller, float x, float y) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_scrollTo(nativeEventForwarder, caller, x, y);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void doubleTap(long nativeEventForwarder, EventForwarder caller, long timeMs, int x, int y) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_doubleTap(nativeEventForwarder, caller, timeMs, x, y);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void startFling(long nativeEventForwarder, EventForwarder caller, long timeMs, float velocityX, float velocityY, boolean syntheticScroll, boolean preventBoosting) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_startFling(nativeEventForwarder, caller, timeMs, velocityX, velocityY, syntheticScroll, preventBoosting);
    }

    @Override // org.chromium.ui.base.EventForwarder.Natives
    public void cancelFling(long nativeEventForwarder, EventForwarder caller, long timeMs, boolean preventBoosting) {
        GEN_JNI.org_chromium_ui_base_EventForwarder_cancelFling(nativeEventForwarder, caller, timeMs, preventBoosting);
    }

    public static EventForwarder.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            EventForwarder.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.EventForwarder.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new EventForwarderJni();
    }
}
