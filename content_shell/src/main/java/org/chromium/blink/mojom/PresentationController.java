package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface PresentationController extends Interface {
    public static final Manager<PresentationController, Proxy> MANAGER = PresentationController_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PresentationController, Interface.Proxy {
    }

    void onConnectionClosed(PresentationInfo presentationInfo, int i, String str);

    void onConnectionStateChanged(PresentationInfo presentationInfo, int i);

    void onDefaultPresentationStarted(PresentationConnectionResult presentationConnectionResult);

    void onScreenAvailabilityUpdated(Url url, int i);
}
