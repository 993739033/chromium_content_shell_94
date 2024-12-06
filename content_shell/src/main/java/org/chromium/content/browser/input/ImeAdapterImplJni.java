package org.chromium.content.browser.input;

import android.view.KeyEvent;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ImeAdapterImplJni implements ImeAdapterImpl.Natives {
    public static final JniStaticTestMocker<ImeAdapterImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<ImeAdapterImpl.Natives>() { // from class: org.chromium.content.browser.input.ImeAdapterImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ImeAdapterImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ImeAdapterImpl.Natives unused = ImeAdapterImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ImeAdapterImpl.Natives testInstance;

    ImeAdapterImplJni() {
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public long init(ImeAdapterImpl caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public boolean sendKeyEvent(long nativeImeAdapterAndroid, ImeAdapterImpl caller, KeyEvent event, int type, int modifiers, long timestampMs, int keyCode, int scanCode, boolean isSystemKey, int unicodeChar) {
        return GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_sendKeyEvent(nativeImeAdapterAndroid, caller, event, type, modifiers, timestampMs, keyCode, scanCode, isSystemKey, unicodeChar);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void appendUnderlineSpan(long spanPtr, int start, int end) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendUnderlineSpan(spanPtr, start, end);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void appendBackgroundColorSpan(long spanPtr, int start, int end, int backgroundColor) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendBackgroundColorSpan(spanPtr, start, end, backgroundColor);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void appendSuggestionSpan(long spanPtr, int start, int end, boolean isMisspelling, boolean removeOnFinishComposing, int underlineColor, int suggestionHighlightColor, String[] suggestions) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_appendSuggestionSpan(spanPtr, start, end, isMisspelling, removeOnFinishComposing, underlineColor, suggestionHighlightColor, suggestions);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void setComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, CharSequence text, String textStr, int newCursorPosition) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setComposingText(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void commitText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, CharSequence text, String textStr, int newCursorPosition) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_commitText(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void finishComposingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_finishComposingText(nativeImeAdapterAndroid, caller);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void setEditableSelectionOffsets(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int start, int end) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setEditableSelectionOffsets(nativeImeAdapterAndroid, caller, start, end);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void setComposingRegion(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int start, int end) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_setComposingRegion(nativeImeAdapterAndroid, caller, start, end);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void deleteSurroundingText(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int before, int after) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingText(nativeImeAdapterAndroid, caller, before, after);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void deleteSurroundingTextInCodePoints(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int before, int after) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingTextInCodePoints(nativeImeAdapterAndroid, caller, before, after);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public boolean requestTextInputStateUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller) {
        return GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_requestTextInputStateUpdate(nativeImeAdapterAndroid, caller);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void requestCursorUpdate(long nativeImeAdapterAndroid, ImeAdapterImpl caller, boolean immediateRequest, boolean monitorRequest) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_requestCursorUpdate(nativeImeAdapterAndroid, caller, immediateRequest, monitorRequest);
    }

    @Override // org.chromium.content.browser.input.ImeAdapterImpl.Natives
    public void advanceFocusInForm(long nativeImeAdapterAndroid, ImeAdapterImpl caller, int focusType) {
        GEN_JNI.org_chromium_content_browser_input_ImeAdapterImpl_advanceFocusInForm(nativeImeAdapterAndroid, caller, focusType);
    }

    public static ImeAdapterImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ImeAdapterImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.ImeAdapterImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ImeAdapterImplJni();
    }
}
