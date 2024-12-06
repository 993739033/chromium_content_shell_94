package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ManifestUrlChangeObserver extends Interface {
    public static final Manager<ManifestUrlChangeObserver, Proxy> MANAGER = ManifestUrlChangeObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ManifestUrlChangeObserver, Interface.Proxy {
    }

    void manifestUrlChanged(Url url);
}
