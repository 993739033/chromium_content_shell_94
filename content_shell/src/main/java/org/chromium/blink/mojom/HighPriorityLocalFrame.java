package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public interface HighPriorityLocalFrame extends Interface {
    public static final Manager<HighPriorityLocalFrame, Proxy> MANAGER = HighPriorityLocalFrame_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DispatchBeforeUnloadResponse extends Callbacks.Callback3<Boolean, TimeTicks, TimeTicks> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HighPriorityLocalFrame, Interface.Proxy {
    }

    void dispatchBeforeUnload(boolean z, DispatchBeforeUnloadResponse dispatchBeforeUnloadResponse);
}
