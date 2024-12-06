package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ContactsManager extends Interface {
    public static final Manager<ContactsManager, Proxy> MANAGER = ContactsManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ContactsManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SelectResponse extends Callbacks.Callback1<ContactInfo[]> {
    }

    void select(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, SelectResponse selectResponse);
}
