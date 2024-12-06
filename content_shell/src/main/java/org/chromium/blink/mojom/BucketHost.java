package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public interface BucketHost extends Interface {
    public static final Manager<BucketHost, Proxy> MANAGER = BucketHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DurabilityResponse extends Callbacks.Callback2<Integer, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface EstimateResponse extends Callbacks.Callback3<Long, Long, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface ExpiresResponse extends Callbacks.Callback2<Time, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface PersistResponse extends Callbacks.Callback2<Boolean, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface PersistedResponse extends Callbacks.Callback2<Boolean, Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BucketHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetExpiresResponse extends Callbacks.Callback1<Boolean> {
    }

    void durability(DurabilityResponse durabilityResponse);

    void estimate(EstimateResponse estimateResponse);

    void expires(ExpiresResponse expiresResponse);

    void persist(PersistResponse persistResponse);

    void persisted(PersistedResponse persistedResponse);

    void setExpires(Time time, SetExpiresResponse setExpiresResponse);
}
