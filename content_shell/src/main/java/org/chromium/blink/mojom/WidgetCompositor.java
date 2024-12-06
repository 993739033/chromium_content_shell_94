package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WidgetCompositor extends Interface {
    public static final Manager<WidgetCompositor, Proxy> MANAGER = WidgetCompositor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WidgetCompositor, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface VisualStateRequestResponse extends Callbacks.Callback0 {
    }

    void visualStateRequest(VisualStateRequestResponse visualStateRequestResponse);
}
