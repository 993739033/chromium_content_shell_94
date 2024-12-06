package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BackgroundFetchRegistrationObserver extends Interface {
    public static final Manager<BackgroundFetchRegistrationObserver, Proxy> MANAGER = BackgroundFetchRegistrationObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BackgroundFetchRegistrationObserver, Interface.Proxy {
    }

    void onProgress(long j, long j2, long j3, long j4, int i, int i2);

    void onRecordsUnavailable();

    void onRequestCompleted(FetchApiRequest fetchApiRequest, FetchApiResponse fetchApiResponse);
}
