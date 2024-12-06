package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ManifestManager extends Interface {
    public static final Manager<ManifestManager, Proxy> MANAGER = ManifestManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ManifestManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestManifestDebugInfoResponse extends Callbacks.Callback3<Url, Manifest_, ManifestDebugInfo> {
    }

    /* loaded from: classes2.dex */
    public interface RequestManifestResponse extends Callbacks.Callback2<Url, Manifest_> {
    }

    void requestManifest(RequestManifestResponse requestManifestResponse);

    void requestManifestDebugInfo(RequestManifestDebugInfoResponse requestManifestDebugInfoResponse);
}
