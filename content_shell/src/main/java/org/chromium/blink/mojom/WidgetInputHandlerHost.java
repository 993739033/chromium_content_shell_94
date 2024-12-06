package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Range;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WidgetInputHandlerHost extends Interface {
    public static final Manager<WidgetInputHandlerHost, Proxy> MANAGER = WidgetInputHandlerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WidgetInputHandlerHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestMouseLockResponse extends Callbacks.Callback2<Integer, PointerLockContext> {
    }

    void didOverscroll(DidOverscrollParams didOverscrollParams);

    void didStartScrollingViewport();

    void imeCancelComposition();

    void imeCompositionRangeChanged(Range range, Rect[] rectArr);

    void requestMouseLock(boolean z, boolean z2, RequestMouseLockResponse requestMouseLockResponse);

    void setMouseCapture(boolean z);

    void setTouchActionFromMain(int i);
}
