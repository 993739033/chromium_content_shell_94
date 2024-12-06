package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ListValue;
/* loaded from: classes2.dex */
public interface PeerConnectionTrackerHost extends Interface {
    public static final Manager<PeerConnectionTrackerHost, Proxy> MANAGER = PeerConnectionTrackerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PeerConnectionTrackerHost, Interface.Proxy {
    }

    void addLegacyStats(int i, ListValue listValue);

    void addPeerConnection(PeerConnectionInfo peerConnectionInfo);

    void addStandardStats(int i, ListValue listValue);

    void getUserMedia(String str, boolean z, boolean z2, String str2, String str3);

    void onPeerConnectionSessionIdSet(int i, String str);

    void removePeerConnection(int i);

    void updatePeerConnection(int i, String str, String str2);

    void webRtcEventLogWrite(int i, byte[] bArr);
}
