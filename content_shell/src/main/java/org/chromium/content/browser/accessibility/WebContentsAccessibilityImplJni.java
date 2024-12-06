package org.chromium.content.browser.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class WebContentsAccessibilityImplJni implements WebContentsAccessibilityImpl.Natives {
    public static final JniStaticTestMocker<WebContentsAccessibilityImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<WebContentsAccessibilityImpl.Natives>() { // from class: org.chromium.content.browser.accessibility.WebContentsAccessibilityImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(WebContentsAccessibilityImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                WebContentsAccessibilityImpl.Natives unused = WebContentsAccessibilityImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static WebContentsAccessibilityImpl.Natives testInstance;

    WebContentsAccessibilityImplJni() {
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public long init(WebContentsAccessibilityImpl caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public long initWithAXTree(WebContentsAccessibilityImpl caller, long axTreePtr) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_initWithAXTree(caller, axTreePtr);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void deleteEarly(long nativeWebContentsAccessibilityAndroid) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_deleteEarly(nativeWebContentsAccessibilityAndroid);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void onAutofillPopupDisplayed(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDisplayed(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void onAutofillPopupDismissed(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDismissed(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getIdForElementAfterElementHostingAutofillPopup(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getIdForElementAfterElementHostingAutofillPopup(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getRootId(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getRootId(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isNodeValid(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isNodeValid(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isAutofillPopupNode(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isAutofillPopupNode(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isEditableText(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEditableText(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isFocused(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isFocused(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getEditableTextSelectionStart(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionStart(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getEditableTextSelectionEnd(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionEnd(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int[] getAbsolutePositionForNode(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getAbsolutePositionForNode(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean updateCachedAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, AccessibilityNodeInfo info, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_updateCachedAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, caller, info, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean populateAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, AccessibilityNodeInfo info, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityNodeInfo(nativeWebContentsAccessibilityAndroid, caller, info, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean populateAccessibilityEvent(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, AccessibilityEvent event, int id, int eventType) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityEvent(nativeWebContentsAccessibilityAndroid, caller, event, id, eventType);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void click(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_click(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void focus(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_focus(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void blur(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_blur(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void scrollToMakeNodeVisible(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scrollToMakeNodeVisible(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int findElementType(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int startId, String elementType, boolean forwards, boolean canWrapToLastElement) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_findElementType(nativeWebContentsAccessibilityAndroid, caller, startId, elementType, forwards, canWrapToLastElement);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void setTextFieldValue(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, String newValue) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setTextFieldValue(nativeWebContentsAccessibilityAndroid, caller, id, newValue);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void setSelection(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, int start, int end) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setSelection(nativeWebContentsAccessibilityAndroid, caller, id, start, end);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean nextAtGranularity(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_nextAtGranularity(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean previousAtGranularity(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_previousAtGranularity(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean adjustSlider(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, boolean increment) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_adjustSlider(nativeWebContentsAccessibilityAndroid, caller, id, increment);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void moveAccessibilityFocus(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int oldId, int newId) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_moveAccessibilityFocus(nativeWebContentsAccessibilityAndroid, caller, oldId, newId);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isSlider(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isSlider(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean scroll(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, int direction, boolean pageScroll) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scroll(nativeWebContentsAccessibilityAndroid, caller, id, direction, pageScroll);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean setRangeValue(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, float value) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setRangeValue(nativeWebContentsAccessibilityAndroid, caller, id, value);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public String getSupportedHtmlElementTypes(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getSupportedHtmlElementTypes(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void showContextMenu(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_showContextMenu(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean isEnabled(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEnabled(nativeWebContentsAccessibilityAndroid, caller);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void enable(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, boolean screenReaderMode) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_enable(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void setAXMode(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, boolean screenReaderMode) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setAXMode(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean areInlineTextBoxesLoaded(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_areInlineTextBoxesLoaded(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void loadInlineTextBoxes(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_loadInlineTextBoxes(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int[] getCharacterBoundingBoxes(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, int start, int len) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getCharacterBoundingBoxes(nativeWebContentsAccessibilityAndroid, caller, id, start, len);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getTextLength(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getTextLength(nativeWebContentsAccessibilityAndroid, caller, id);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void addSpellingErrorForTesting(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int id, int startOffset, int endOffset) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_addSpellingErrorForTesting(nativeWebContentsAccessibilityAndroid, caller, id, startOffset, endOffset);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void setMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, int maxEvents) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid, caller, maxEvents);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public int getMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getMaxContentChangedEventsToFireForTesting(nativeWebContentsAccessibilityAndroid);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void signalEndOfTestForTesting(long nativeWebContentsAccessibilityAndroid) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_signalEndOfTestForTesting(nativeWebContentsAccessibilityAndroid);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public void setIsRunningAsWebView(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, boolean isWebView) {
        GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setIsRunningAsWebView(nativeWebContentsAccessibilityAndroid, caller, isWebView);
    }

    @Override // org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives
    public boolean onHoverEventNoRenderer(long nativeWebContentsAccessibilityAndroid, WebContentsAccessibilityImpl caller, float x, float y) {
        return GEN_JNI.org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onHoverEventNoRenderer(nativeWebContentsAccessibilityAndroid, caller, x, y);
    }

    public static WebContentsAccessibilityImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            WebContentsAccessibilityImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new WebContentsAccessibilityImplJni();
    }
}
