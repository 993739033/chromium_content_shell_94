package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AudioInputStreamClient extends Interface {
    public static final Manager<AudioInputStreamClient, Proxy> MANAGER = AudioInputStreamClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioInputStreamClient, Interface.Proxy {
    }

    void onError(int i);

    void onMutedStateChanged(boolean z);
}
