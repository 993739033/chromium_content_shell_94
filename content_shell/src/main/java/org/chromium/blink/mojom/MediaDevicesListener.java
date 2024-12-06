package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaDevicesListener extends Interface {
    public static final Manager<MediaDevicesListener, Proxy> MANAGER = MediaDevicesListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaDevicesListener, Interface.Proxy {
    }

    void onDevicesChanged(int i, MediaDeviceInfo[] mediaDeviceInfoArr);
}
