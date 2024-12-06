package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SslPrivateKey extends Interface {
    public static final Manager<SslPrivateKey, Proxy> MANAGER = SslPrivateKey_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SslPrivateKey, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SignResponse extends Callbacks.Callback2<Integer, byte[]> {
    }

    void sign(short s, byte[] bArr, SignResponse signResponse);
}
