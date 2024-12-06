package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PopupWidgetHost extends Interface {
    public static final Manager<PopupWidgetHost, Proxy> MANAGER = PopupWidgetHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PopupWidgetHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetPopupBoundsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ShowPopupResponse extends Callbacks.Callback0 {
    }

    void requestClosePopup();

    void setPopupBounds(Rect rect, SetPopupBoundsResponse setPopupBoundsResponse);

    void showPopup(Rect rect, ShowPopupResponse showPopupResponse);
}
