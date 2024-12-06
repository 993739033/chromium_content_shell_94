package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeechRecognitionSessionClient extends Interface {
    public static final Manager<SpeechRecognitionSessionClient, Proxy> MANAGER = SpeechRecognitionSessionClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeechRecognitionSessionClient, Interface.Proxy {
    }

    void audioEnded();

    void audioStarted();

    void ended();

    void errorOccurred(SpeechRecognitionError speechRecognitionError);

    void resultRetrieved(SpeechRecognitionResult[] speechRecognitionResultArr);

    void soundEnded();

    void soundStarted();

    void started();
}
