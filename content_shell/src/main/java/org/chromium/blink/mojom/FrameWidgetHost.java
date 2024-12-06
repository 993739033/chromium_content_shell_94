package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.PointF;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Vector2d;
import org.chromium.gfx.mojom.Vector2dF;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface FrameWidgetHost extends Interface {
    public static final Manager<FrameWidgetHost, Proxy> MANAGER = FrameWidgetHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameWidgetHost, Interface.Proxy {
    }

    void animateDoubleTapZoomInMainFrame(Point point, Rect rect);

    void autoscrollEnd();

    void autoscrollFling(Vector2dF vector2dF);

    void autoscrollStart(PointF pointF);

    void intrinsicSizingInfoChanged(IntrinsicSizingInfo intrinsicSizingInfo);

    void setHasTouchEventConsumers(TouchEventConsumers touchEventConsumers);

    void startDragging(DragData dragData, AllowedDragOperations allowedDragOperations, BitmapN32 bitmapN32, Vector2d vector2d, DragEventSourceInfo dragEventSourceInfo);

    void zoomToFindInPageRectInMainFrame(Rect rect);
}
