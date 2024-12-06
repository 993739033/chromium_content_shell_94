package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
/* loaded from: classes2.dex */
public interface UdpSocket extends Interface {
    public static final Manager<UdpSocket, Proxy> MANAGER = UdpSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface BindResponse extends Callbacks.Callback2<Integer, IpEndPoint> {
    }

    /* loaded from: classes2.dex */
    public interface ConnectResponse extends Callbacks.Callback2<Integer, IpEndPoint> {
    }

    /* loaded from: classes2.dex */
    public interface JoinGroupResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface LeaveGroupResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends UdpSocket, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SendResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SendToResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetBroadcastResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetReceiveBufferSizeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetSendBufferSizeResponse extends Callbacks.Callback1<Integer> {
    }

    void bind(IpEndPoint ipEndPoint, UdpSocketOptions udpSocketOptions, BindResponse bindResponse);

    @Override // org.chromium.mojo.bindings.Interface, java.io.Closeable, java.lang.AutoCloseable
    void close();

    void connect(IpEndPoint ipEndPoint, UdpSocketOptions udpSocketOptions, ConnectResponse connectResponse);

    void joinGroup(IpAddress ipAddress, JoinGroupResponse joinGroupResponse);

    void leaveGroup(IpAddress ipAddress, LeaveGroupResponse leaveGroupResponse);

    void receiveMore(int i);

    void receiveMoreWithBufferSize(int i, int i2);

    void send(ReadOnlyBuffer readOnlyBuffer, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, SendResponse sendResponse);

    void sendTo(IpEndPoint ipEndPoint, ReadOnlyBuffer readOnlyBuffer, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, SendToResponse sendToResponse);

    void setBroadcast(boolean z, SetBroadcastResponse setBroadcastResponse);

    void setReceiveBufferSize(int i, SetReceiveBufferSizeResponse setReceiveBufferSizeResponse);

    void setSendBufferSize(int i, SetSendBufferSizeResponse setSendBufferSizeResponse);
}
