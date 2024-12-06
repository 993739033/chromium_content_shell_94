package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Range;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.ui.mojom.ImeTextSpan;
import org.chromium.ui.mojom.LatencyInfo;
/* loaded from: classes2.dex */
public interface WidgetInputHandler extends Interface {
    public static final Manager<WidgetInputHandler, Proxy> MANAGER = WidgetInputHandler_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DispatchEventResponse extends Callbacks.Callback5<Integer, LatencyInfo, Integer, DidOverscrollParams, TouchActionOptional> {
    }

    /* loaded from: classes2.dex */
    public interface ImeCommitTextResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ImeSetCompositionResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WidgetInputHandler, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface WaitForInputProcessedResponse extends Callbacks.Callback0 {
    }

    void attachSynchronousCompositor(SynchronousCompositorControlHost synchronousCompositorControlHost, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported);

    void cursorVisibilityChanged(boolean z);

    void dispatchEvent(Event event, DispatchEventResponse dispatchEventResponse);

    void dispatchNonBlockingEvent(Event event);

    void getFrameWidgetInputHandler(AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported);

    void imeCommitText(String16 string16, ImeTextSpan[] imeTextSpanArr, Range range, int i, ImeCommitTextResponse imeCommitTextResponse);

    void imeFinishComposingText(boolean z);

    void imeSetComposition(String16 string16, ImeTextSpan[] imeTextSpanArr, Range range, int i, int i2, ImeSetCompositionResponse imeSetCompositionResponse);

    void mouseCaptureLost();

    void requestCompositionUpdates(boolean z, boolean z2);

    void requestTextInputStateUpdate();

    void setEditCommandsForNextKeyEvent(EditCommand[] editCommandArr);

    void setFocus(boolean z);

    void waitForInputProcessed(WaitForInputProcessedResponse waitForInputProcessedResponse);
}
