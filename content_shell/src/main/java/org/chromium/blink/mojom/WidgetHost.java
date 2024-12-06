package org.chromium.blink.mojom;

import org.chromium.cc.mojom.RenderFrameMetadataObserver;
import org.chromium.cc.mojom.RenderFrameMetadataObserverClient;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.ui.mojom.Cursor;
import org.chromium.ui.mojom.TextInputState;
import org.chromium.viz.mojom.CompositorFrameSink;
import org.chromium.viz.mojom.CompositorFrameSinkClient;
/* loaded from: classes2.dex */
public interface WidgetHost extends Interface {
    public static final Manager<WidgetHost, Proxy> MANAGER = WidgetHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WidgetHost, Interface.Proxy {
    }

    void createFrameSink(InterfaceRequest<CompositorFrameSink> interfaceRequest, CompositorFrameSinkClient compositorFrameSinkClient);

    void registerRenderFrameMetadataObserver(InterfaceRequest<RenderFrameMetadataObserverClient> interfaceRequest, RenderFrameMetadataObserver renderFrameMetadataObserver);

    void selectionBoundsChanged(Rect rect, int i, Rect rect2, int i2, Rect rect3, boolean z);

    void setCursor(Cursor cursor);

    void textInputStateChanged(TextInputState textInputState);

    void updateTooltipFromKeyboard(String16 string16, int i, Rect rect);

    void updateTooltipUnderCursor(String16 string16, int i);
}
