package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeechSynthesisClient extends Interface {
    public static final Manager<SpeechSynthesisClient, Proxy> MANAGER = SpeechSynthesisClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeechSynthesisClient, Interface.Proxy {
    }

    void onEncounteredSentenceBoundary(int i, int i2);

    void onEncounteredSpeakingError();

    void onEncounteredWordBoundary(int i, int i2);

    void onFinishedSpeaking();

    void onPausedSpeaking();

    void onResumedSpeaking();

    void onStartedSpeaking();
}
