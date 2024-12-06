package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class PermissionDescriptorExtension extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private CameraDevicePermissionDescriptor mCameraDevice;
    private ClipboardPermissionDescriptor mClipboard;
    private MidiPermissionDescriptor mMidi;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int CameraDevice = 2;
        public static final int Clipboard = 1;
        public static final int Midi = 0;
    }

    public void setMidi(MidiPermissionDescriptor midi) {
        this.mTag = 0;
        this.mMidi = midi;
    }

    public MidiPermissionDescriptor getMidi() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mMidi;
    }

    public void setClipboard(ClipboardPermissionDescriptor clipboard) {
        this.mTag = 1;
        this.mClipboard = clipboard;
    }

    public ClipboardPermissionDescriptor getClipboard() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mClipboard;
    }

    public void setCameraDevice(CameraDevicePermissionDescriptor cameraDevice) {
        this.mTag = 2;
        this.mCameraDevice = cameraDevice;
    }

    public CameraDevicePermissionDescriptor getCameraDevice() {
        if (this.mTag != 2) {
            throw new AssertionError();
        }
        return this.mCameraDevice;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mMidi, offset + 8, false);
                return;
            case 1:
                encoder0.encode((Struct) this.mClipboard, offset + 8, false);
                return;
            case 2:
                encoder0.encode((Struct) this.mCameraDevice, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static PermissionDescriptorExtension deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final PermissionDescriptorExtension decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        PermissionDescriptorExtension result = new PermissionDescriptorExtension();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mMidi = MidiPermissionDescriptor.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                Decoder decoder12 = decoder0.readPointer(offset + 8, false);
                result.mClipboard = ClipboardPermissionDescriptor.decode(decoder12);
                result.mTag = 1;
                break;
            case 2:
                Decoder decoder13 = decoder0.readPointer(offset + 8, false);
                result.mCameraDevice = CameraDevicePermissionDescriptor.decode(decoder13);
                result.mTag = 2;
                break;
        }
        return result;
    }
}
