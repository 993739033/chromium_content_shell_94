package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public interface Widget extends Interface {
    public static final Manager<Widget, Proxy> MANAGER = Widget_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ForceRedrawResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Widget, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface UpdateScreenRectsResponse extends Callbacks.Callback0 {
    }

    void forceRedraw(ForceRedrawResponse forceRedrawResponse);

    void getWidgetInputHandler(InterfaceRequest<WidgetInputHandler> interfaceRequest, WidgetInputHandlerHost widgetInputHandlerHost);

    void updateScreenRects(Rect rect, Rect rect2, UpdateScreenRectsResponse updateScreenRectsResponse);

    void updateVisualProperties(VisualProperties visualProperties);

    void wasHidden();

    void wasShown(TimeTicks timeTicks, boolean z, RecordContentToVisibleTimeRequest recordContentToVisibleTimeRequest);
}
