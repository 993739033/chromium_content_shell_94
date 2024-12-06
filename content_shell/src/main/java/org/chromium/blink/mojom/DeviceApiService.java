package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DeviceApiService extends Interface {
    public static final Manager<DeviceApiService, Proxy> MANAGER = DeviceApiService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetAnnotatedAssetIdResponse extends Callbacks.Callback1<DeviceAttributeResult> {
    }

    /* loaded from: classes2.dex */
    public interface GetAnnotatedLocationResponse extends Callbacks.Callback1<DeviceAttributeResult> {
    }

    /* loaded from: classes2.dex */
    public interface GetDirectoryIdResponse extends Callbacks.Callback1<DeviceAttributeResult> {
    }

    /* loaded from: classes2.dex */
    public interface GetHostnameResponse extends Callbacks.Callback1<DeviceAttributeResult> {
    }

    /* loaded from: classes2.dex */
    public interface GetSerialNumberResponse extends Callbacks.Callback1<DeviceAttributeResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DeviceApiService, Interface.Proxy {
    }

    void getAnnotatedAssetId(GetAnnotatedAssetIdResponse getAnnotatedAssetIdResponse);

    void getAnnotatedLocation(GetAnnotatedLocationResponse getAnnotatedLocationResponse);

    void getDirectoryId(GetDirectoryIdResponse getDirectoryIdResponse);

    void getHostname(GetHostnameResponse getHostnameResponse);

    void getSerialNumber(GetSerialNumberResponse getSerialNumberResponse);
}
