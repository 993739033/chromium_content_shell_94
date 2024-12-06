package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaStreamTrackMetricsHost extends Interface {
    public static final Manager<MediaStreamTrackMetricsHost, Proxy> MANAGER = MediaStreamTrackMetricsHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaStreamTrackMetricsHost, Interface.Proxy {
    }

    void addTrack(long j, boolean z, boolean z2);

    void removeTrack(long j);
}
