package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DelegatedInkPointRenderer extends Interface {
    public static final Manager<DelegatedInkPointRenderer, Proxy> MANAGER = DelegatedInkPointRenderer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DelegatedInkPointRenderer, Interface.Proxy {
    }

    void resetPrediction();

    void storeDelegatedInkPoint(DelegatedInkPoint delegatedInkPoint);
}
