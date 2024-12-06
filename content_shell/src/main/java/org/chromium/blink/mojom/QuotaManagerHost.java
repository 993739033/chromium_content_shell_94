package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface QuotaManagerHost extends Interface {
    public static final Manager<QuotaManagerHost, Proxy> MANAGER = QuotaManagerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddChangeListenerResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends QuotaManagerHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryStorageUsageAndQuotaResponse extends Callbacks.Callback4<Integer, Long, Long, UsageBreakdown> {
    }

    /* loaded from: classes2.dex */
    public interface RequestStorageQuotaResponse extends Callbacks.Callback3<Integer, Long, Long> {
    }

    void addChangeListener(QuotaChangeListener quotaChangeListener, AddChangeListenerResponse addChangeListenerResponse);

    void queryStorageUsageAndQuota(int i, QueryStorageUsageAndQuotaResponse queryStorageUsageAndQuotaResponse);

    void requestStorageQuota(int i, long j, RequestStorageQuotaResponse requestStorageQuotaResponse);
}
