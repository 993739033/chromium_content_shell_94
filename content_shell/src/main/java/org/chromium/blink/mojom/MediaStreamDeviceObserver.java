package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaStreamDeviceObserver extends Interface {
    public static final Manager<MediaStreamDeviceObserver, Proxy> MANAGER = MediaStreamDeviceObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaStreamDeviceObserver, Interface.Proxy {
    }

    void onDeviceCaptureHandleChange(String str, MediaStreamDevice mediaStreamDevice);

    void onDeviceChanged(String str, MediaStreamDevice mediaStreamDevice, MediaStreamDevice mediaStreamDevice2);

    void onDeviceRequestStateChange(String str, MediaStreamDevice mediaStreamDevice, int i);

    void onDeviceStopped(String str, MediaStreamDevice mediaStreamDevice);
}
