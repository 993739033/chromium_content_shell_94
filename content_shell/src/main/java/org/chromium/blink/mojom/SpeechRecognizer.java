package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeechRecognizer extends Interface {
    public static final Manager<SpeechRecognizer, Proxy> MANAGER = SpeechRecognizer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeechRecognizer, Interface.Proxy {
    }

    void start(StartSpeechRecognitionRequestParams startSpeechRecognitionRequestParams);
}
