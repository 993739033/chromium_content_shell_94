package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MimeRegistry extends Interface {
    public static final Manager<MimeRegistry, Proxy> MANAGER = MimeRegistry_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetMimeTypeFromExtensionResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MimeRegistry, Interface.Proxy {
    }

    void getMimeTypeFromExtension(String str, GetMimeTypeFromExtensionResponse getMimeTypeFromExtensionResponse);
}
