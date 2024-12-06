package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface VideoEncodeAcceleratorProvider extends Interface {
    public static final Manager<VideoEncodeAcceleratorProvider, Proxy> MANAGER = VideoEncodeAcceleratorProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetVideoEncodeAcceleratorSupportedProfilesResponse extends Callbacks.Callback1<VideoEncodeAcceleratorSupportedProfile[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoEncodeAcceleratorProvider, Interface.Proxy {
    }

    void createVideoEncodeAccelerator(InterfaceRequest<VideoEncodeAccelerator> interfaceRequest);

    void getVideoEncodeAcceleratorSupportedProfiles(GetVideoEncodeAcceleratorSupportedProfilesResponse getVideoEncodeAcceleratorSupportedProfilesResponse);
}
