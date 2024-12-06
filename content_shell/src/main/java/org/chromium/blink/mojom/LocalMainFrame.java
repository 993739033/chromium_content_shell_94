package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.CrossOriginOpenerPolicyReporter;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface LocalMainFrame extends Interface {
    public static final Manager<LocalMainFrame, Proxy> MANAGER = LocalMainFrame_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ClosePageResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface OnPortalActivatedResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LocalMainFrame, Interface.Proxy {
    }

    void animateDoubleTapZoom(Point point, Rect rect);

    void closePage(ClosePageResponse closePageResponse);

    void enablePreferredSizeChangedMode();

    void forwardMessageFromHost(TransferableMessage transferableMessage, Origin origin);

    void installCoopAccessMonitor(int i, FrameToken frameToken, CrossOriginOpenerPolicyReporter crossOriginOpenerPolicyReporter, boolean z, String str);

    void onPortalActivated(PortalToken portalToken, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, TransferableMessage transferableMessage, long j, OnPortalActivatedResponse onPortalActivatedResponse);

    void pluginActionAt(Point point, int i);

    void setInitialFocus(boolean z);

    void setScaleFactor(float f);

    void updateBrowserControlsState(int i, int i2, boolean z);

    void zoomToFindInPageRect(Rect rect);
}
