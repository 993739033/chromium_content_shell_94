package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ContentIndexService extends Interface {
    public static final Manager<ContentIndexService, Proxy> MANAGER = ContentIndexService_Internal.MANAGER;
    public static final int MAX_ICON_RESOLUTION = 65536;

    /* loaded from: classes2.dex */
    public interface AddResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface CheckOfflineCapabilityResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetDescriptionsResponse extends Callbacks.Callback2<Integer, ContentDescription[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetIconSizesResponse extends Callbacks.Callback1<Size[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ContentIndexService, Interface.Proxy {
    }

    void add(long j, ContentDescription contentDescription, BitmapN32[] bitmapN32Arr, Url url, AddResponse addResponse);

    void checkOfflineCapability(long j, Url url, CheckOfflineCapabilityResponse checkOfflineCapabilityResponse);

    void delete(long j, String str, DeleteResponse deleteResponse);

    void getDescriptions(long j, GetDescriptionsResponse getDescriptionsResponse);

    void getIconSizes(int i, GetIconSizesResponse getIconSizesResponse);
}
