package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeechRecognitionSession extends Interface {
    public static final Manager<SpeechRecognitionSession, Proxy> MANAGER = SpeechRecognitionSession_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeechRecognitionSession, Interface.Proxy {
    }

    void abort();

    void stopCapture();
}
