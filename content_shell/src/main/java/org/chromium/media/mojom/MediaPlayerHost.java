package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaPlayerHost extends Interface {
    public static final Manager<MediaPlayerHost, Proxy> MANAGER = MediaPlayerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaPlayerHost, Interface.Proxy {
    }

    void onMediaPlayerAdded(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, int i);
}
