package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
/* loaded from: classes2.dex */
public interface UsbDevice extends Interface {
    public static final Manager<UsbDevice, Proxy> MANAGER = UsbDevice_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ClaimInterfaceResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ClearHaltResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ControlTransferInResponse extends Callbacks.Callback2<Integer, ReadOnlyBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface ControlTransferOutResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GenericTransferInResponse extends Callbacks.Callback2<Integer, ReadOnlyBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface GenericTransferOutResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface IsochronousTransferInResponse extends Callbacks.Callback2<ReadOnlyBuffer, UsbIsochronousPacket[]> {
    }

    /* loaded from: classes2.dex */
    public interface IsochronousTransferOutResponse extends Callbacks.Callback1<UsbIsochronousPacket[]> {
    }

    /* loaded from: classes2.dex */
    public interface OpenResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends UsbDevice, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReleaseInterfaceResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface ResetResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetConfigurationResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetInterfaceAlternateSettingResponse extends Callbacks.Callback1<Boolean> {
    }

    void claimInterface(byte b, ClaimInterfaceResponse claimInterfaceResponse);

    void clearHalt(int i, byte b, ClearHaltResponse clearHaltResponse);

    void close(CloseResponse closeResponse);

    void controlTransferIn(UsbControlTransferParams usbControlTransferParams, int i, int i2, ControlTransferInResponse controlTransferInResponse);

    void controlTransferOut(UsbControlTransferParams usbControlTransferParams, ReadOnlyBuffer readOnlyBuffer, int i, ControlTransferOutResponse controlTransferOutResponse);

    void genericTransferIn(byte b, int i, int i2, GenericTransferInResponse genericTransferInResponse);

    void genericTransferOut(byte b, ReadOnlyBuffer readOnlyBuffer, int i, GenericTransferOutResponse genericTransferOutResponse);

    void isochronousTransferIn(byte b, int[] iArr, int i, IsochronousTransferInResponse isochronousTransferInResponse);

    void isochronousTransferOut(byte b, ReadOnlyBuffer readOnlyBuffer, int[] iArr, int i, IsochronousTransferOutResponse isochronousTransferOutResponse);

    void open(OpenResponse openResponse);

    void releaseInterface(byte b, ReleaseInterfaceResponse releaseInterfaceResponse);

    void reset(ResetResponse resetResponse);

    void setConfiguration(byte b, SetConfigurationResponse setConfigurationResponse);

    void setInterfaceAlternateSetting(byte b, byte b2, SetInterfaceAlternateSettingResponse setInterfaceAlternateSettingResponse);
}
