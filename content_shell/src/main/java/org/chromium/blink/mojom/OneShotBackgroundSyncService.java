package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface OneShotBackgroundSyncService extends Interface {
    public static final Manager<OneShotBackgroundSyncService, Proxy> MANAGER = OneShotBackgroundSyncService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetRegistrationsResponse extends Callbacks.Callback2<Integer, SyncRegistrationOptions[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends OneShotBackgroundSyncService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RegisterResponse extends Callbacks.Callback2<Integer, SyncRegistrationOptions> {
    }

    void didResolveRegistration(BackgroundSyncRegistrationInfo backgroundSyncRegistrationInfo);

    void getRegistrations(long j, GetRegistrationsResponse getRegistrationsResponse);

    void register(SyncRegistrationOptions syncRegistrationOptions, long j, RegisterResponse registerResponse);
}
