package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PeriodicBackgroundSyncService extends Interface {
    public static final Manager<PeriodicBackgroundSyncService, Proxy> MANAGER = PeriodicBackgroundSyncService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetRegistrationsResponse extends Callbacks.Callback2<Integer, SyncRegistrationOptions[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PeriodicBackgroundSyncService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RegisterResponse extends Callbacks.Callback2<Integer, SyncRegistrationOptions> {
    }

    /* loaded from: classes2.dex */
    public interface UnregisterResponse extends Callbacks.Callback1<Integer> {
    }

    void getRegistrations(long j, GetRegistrationsResponse getRegistrationsResponse);

    void register(SyncRegistrationOptions syncRegistrationOptions, long j, RegisterResponse registerResponse);

    void unregister(long j, String str, UnregisterResponse unregisterResponse);
}
