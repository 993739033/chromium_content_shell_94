package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyFile;
/* loaded from: classes2.dex */
public interface Hyphenation extends Interface {
    public static final Manager<Hyphenation, Proxy> MANAGER = Hyphenation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OpenDictionaryResponse extends Callbacks.Callback1<ReadOnlyFile> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Hyphenation, Interface.Proxy {
    }

    void openDictionary(String str, OpenDictionaryResponse openDictionaryResponse);
}
