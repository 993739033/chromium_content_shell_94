package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface EyeDropperChooser extends Interface {
    public static final Manager<EyeDropperChooser, Proxy> MANAGER = EyeDropperChooser_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChooseResponse extends Callbacks.Callback2<Boolean, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends EyeDropperChooser, Interface.Proxy {
    }

    void choose(ChooseResponse chooseResponse);
}
