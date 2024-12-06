package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
/* loaded from: classes2.dex */
public interface BackgroundFetchService extends Interface {
    public static final Manager<BackgroundFetchService, Proxy> MANAGER = BackgroundFetchService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FetchResponse extends Callbacks.Callback2<Integer, BackgroundFetchRegistration> {
    }

    /* loaded from: classes2.dex */
    public interface GetDeveloperIdsResponse extends Callbacks.Callback2<Integer, String[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetIconDisplaySizeResponse extends Callbacks.Callback1<Size> {
    }

    /* loaded from: classes2.dex */
    public interface GetRegistrationResponse extends Callbacks.Callback2<Integer, BackgroundFetchRegistration> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BackgroundFetchService, Interface.Proxy {
    }

    void fetch(long j, String str, FetchApiRequest[] fetchApiRequestArr, BackgroundFetchOptions backgroundFetchOptions, BitmapN32 bitmapN32, BackgroundFetchUkmData backgroundFetchUkmData, FetchResponse fetchResponse);

    void getDeveloperIds(long j, GetDeveloperIdsResponse getDeveloperIdsResponse);

    void getIconDisplaySize(GetIconDisplaySizeResponse getIconDisplaySizeResponse);

    void getRegistration(long j, String str, GetRegistrationResponse getRegistrationResponse);
}
