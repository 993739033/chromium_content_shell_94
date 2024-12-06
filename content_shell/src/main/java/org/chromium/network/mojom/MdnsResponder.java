package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MdnsResponder extends Interface {
    public static final Manager<MdnsResponder, Proxy> MANAGER = MdnsResponder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateNameForAddressResponse extends Callbacks.Callback2<String, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MdnsResponder, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveNameForAddressResponse extends Callbacks.Callback2<Boolean, Boolean> {
    }

    void createNameForAddress(IpAddress ipAddress, CreateNameForAddressResponse createNameForAddressResponse);

    void removeNameForAddress(IpAddress ipAddress, RemoveNameForAddressResponse removeNameForAddressResponse);
}
