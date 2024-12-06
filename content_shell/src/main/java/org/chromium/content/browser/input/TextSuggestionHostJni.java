package org.chromium.content.browser.input;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.input.TextSuggestionHost;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TextSuggestionHostJni implements TextSuggestionHost.Natives {
    public static final JniStaticTestMocker<TextSuggestionHost.Natives> TEST_HOOKS = new JniStaticTestMocker<TextSuggestionHost.Natives>() { // from class: org.chromium.content.browser.input.TextSuggestionHostJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(TextSuggestionHost.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                TextSuggestionHost.Natives unused = TextSuggestionHostJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static TextSuggestionHost.Natives testInstance;

    TextSuggestionHostJni() {
    }

    @Override // org.chromium.content.browser.input.TextSuggestionHost.Natives
    public void applySpellCheckSuggestion(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller, String suggestion) {
        GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_applySpellCheckSuggestion(nativeTextSuggestionHostAndroid, caller, suggestion);
    }

    @Override // org.chromium.content.browser.input.TextSuggestionHost.Natives
    public void applyTextSuggestion(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller, int markerTag, int suggestionIndex) {
        GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_applyTextSuggestion(nativeTextSuggestionHostAndroid, caller, markerTag, suggestionIndex);
    }

    @Override // org.chromium.content.browser.input.TextSuggestionHost.Natives
    public void deleteActiveSuggestionRange(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller) {
        GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_deleteActiveSuggestionRange(nativeTextSuggestionHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.input.TextSuggestionHost.Natives
    public void onNewWordAddedToDictionary(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller, String word) {
        GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_onNewWordAddedToDictionary(nativeTextSuggestionHostAndroid, caller, word);
    }

    @Override // org.chromium.content.browser.input.TextSuggestionHost.Natives
    public void onSuggestionMenuClosed(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller) {
        GEN_JNI.org_chromium_content_browser_input_TextSuggestionHost_onSuggestionMenuClosed(nativeTextSuggestionHostAndroid, caller);
    }

    public static TextSuggestionHost.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TextSuggestionHost.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.TextSuggestionHost.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new TextSuggestionHostJni();
    }
}
