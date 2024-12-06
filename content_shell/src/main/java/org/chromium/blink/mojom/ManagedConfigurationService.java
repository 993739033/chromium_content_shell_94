package org.chromium.blink.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ManagedConfigurationService extends Interface {
    public static final Manager<ManagedConfigurationService, Proxy> MANAGER = ManagedConfigurationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetManagedConfigurationResponse extends Callbacks.Callback1<Map<String, String>> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ManagedConfigurationService, Interface.Proxy {
    }

    void getManagedConfiguration(String[] strArr, GetManagedConfigurationResponse getManagedConfigurationResponse);

    void subscribeToManagedConfiguration(ManagedConfigurationObserver managedConfigurationObserver);
}
