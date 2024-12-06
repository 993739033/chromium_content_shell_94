package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DateTimeChooser extends Interface {
    public static final Manager<DateTimeChooser, Proxy> MANAGER = DateTimeChooser_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OpenDateTimeDialogResponse extends Callbacks.Callback2<Boolean, Double> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DateTimeChooser, Interface.Proxy {
    }

    void openDateTimeDialog(DateTimeDialogValue dateTimeDialogValue, OpenDateTimeDialogResponse openDateTimeDialogResponse);
}
