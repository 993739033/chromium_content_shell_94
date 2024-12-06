package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface KeySystemSupport extends Interface {
    public static final Manager<KeySystemSupport, Proxy> MANAGER = KeySystemSupport_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface IsKeySystemSupportedResponse extends Callbacks.Callback2<Boolean, KeySystemCapability> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends KeySystemSupport, Interface.Proxy {
    }

    void isKeySystemSupported(String str, IsKeySystemSupportedResponse isKeySystemSupportedResponse);
}
