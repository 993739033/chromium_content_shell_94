package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ReceivedSnapshotListener extends Interface {
    public static final Manager<ReceivedSnapshotListener, Proxy> MANAGER = ReceivedSnapshotListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ReceivedSnapshotListener, Interface.Proxy {
    }

    void didReceiveSnapshotFile();
}
