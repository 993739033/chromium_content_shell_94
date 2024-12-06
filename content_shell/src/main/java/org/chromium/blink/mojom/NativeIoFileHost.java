package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NativeIoFileHost extends Interface {
    public static final Manager<NativeIoFileHost, Proxy> MANAGER = NativeIoFileHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NativeIoFileHost, Interface.Proxy {
    }

    void close(CloseResponse closeResponse);
}
