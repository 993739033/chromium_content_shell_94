package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeechSynthesisVoiceListObserver extends Interface {
    public static final Manager<SpeechSynthesisVoiceListObserver, Proxy> MANAGER = SpeechSynthesisVoiceListObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeechSynthesisVoiceListObserver, Interface.Proxy {
    }

    void onSetVoiceList(SpeechSynthesisVoice[] speechSynthesisVoiceArr);
}
