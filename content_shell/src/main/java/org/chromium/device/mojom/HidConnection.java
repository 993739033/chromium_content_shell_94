package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HidConnection extends Interface {
    public static final Manager<HidConnection, Proxy> MANAGER = HidConnection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetFeatureReportResponse extends Callbacks.Callback2<Boolean, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HidConnection, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback3<Boolean, Byte, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface SendFeatureReportResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface WriteResponse extends Callbacks.Callback1<Boolean> {
    }

    void getFeatureReport(byte b, GetFeatureReportResponse getFeatureReportResponse);

    void read(ReadResponse readResponse);

    void sendFeatureReport(byte b, byte[] bArr, SendFeatureReportResponse sendFeatureReportResponse);

    void write(byte b, byte[] bArr, WriteResponse writeResponse);
}
