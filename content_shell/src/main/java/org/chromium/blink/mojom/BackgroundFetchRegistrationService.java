package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface BackgroundFetchRegistrationService extends Interface {
    public static final Manager<BackgroundFetchRegistrationService, Proxy> MANAGER = BackgroundFetchRegistrationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AbortResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface MatchRequestsResponse extends Callbacks.Callback1<BackgroundFetchSettledFetch[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BackgroundFetchRegistrationService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface UpdateUiResponse extends Callbacks.Callback1<Integer> {
    }

    void abort(AbortResponse abortResponse);

    void addRegistrationObserver(BackgroundFetchRegistrationObserver backgroundFetchRegistrationObserver);

    void matchRequests(FetchApiRequest fetchApiRequest, CacheQueryOptions cacheQueryOptions, boolean z, MatchRequestsResponse matchRequestsResponse);

    void updateUi(String str, BitmapN32 bitmapN32, UpdateUiResponse updateUiResponse);
}
