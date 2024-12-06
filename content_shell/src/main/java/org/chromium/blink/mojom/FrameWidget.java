package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.PointF;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.viz.mojom.InputTargetClient;
/* loaded from: classes2.dex */
public interface FrameWidget extends Interface {
    public static final Manager<FrameWidget, Proxy> MANAGER = FrameWidget_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DragSourceEndedAtResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface DragTargetDragEnterResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DragTargetDragOverResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DragTargetDropResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameWidget, Interface.Proxy {
    }

    void bindInputTargetClient(InterfaceRequest<InputTargetClient> interfaceRequest);

    void bindWidgetCompositor(InterfaceRequest<WidgetCompositor> interfaceRequest);

    void disableDeviceEmulation();

    void dragSourceEndedAt(PointF pointF, PointF pointF2, int i, DragSourceEndedAtResponse dragSourceEndedAtResponse);

    void dragSourceSystemDragEnded();

    void dragTargetDragEnter(DragData dragData, PointF pointF, PointF pointF2, AllowedDragOperations allowedDragOperations, int i, DragTargetDragEnterResponse dragTargetDragEnterResponse);

    void dragTargetDragLeave(PointF pointF, PointF pointF2);

    void dragTargetDragOver(PointF pointF, PointF pointF2, AllowedDragOperations allowedDragOperations, int i, DragTargetDragOverResponse dragTargetDragOverResponse);

    void dragTargetDrop(DragData dragData, PointF pointF, PointF pointF2, int i, DragTargetDropResponse dragTargetDropResponse);

    void enableDeviceEmulation(DeviceEmulationParams deviceEmulationParams);

    void setActive(boolean z);

    void setBackgroundOpaque(boolean z);

    void setInheritedEffectiveTouchActionForSubFrame(int i);

    void setIsInertForSubFrame(boolean z);

    void setTextDirection(int i);

    void setViewportIntersection(ViewportIntersectionState viewportIntersectionState, VisualProperties visualProperties);

    void showContextMenu(int i, Point point);

    void updateRenderThrottlingStatusForSubFrame(boolean z, boolean z2, boolean z3);
}
