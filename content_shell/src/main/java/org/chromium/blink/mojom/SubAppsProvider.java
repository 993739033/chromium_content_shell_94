package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SubAppsProvider extends Interface {
    public static final Manager<SubAppsProvider, Proxy> MANAGER = SubAppsProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends SubAppsProvider, Interface.Proxy {
    }

    void add(AddResponse addResponse);
}
