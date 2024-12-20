package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class FileSystemAccessAccessHandleFile extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private FileSystemAccessFileDelegateHost mIncognitoFileDelegate;
    private org.chromium.mojo_base.mojom.File mRegularFile;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int IncognitoFileDelegate = 1;
        public static final int RegularFile = 0;
    }

    public void setRegularFile(org.chromium.mojo_base.mojom.File regularFile) {
        this.mTag = 0;
        this.mRegularFile = regularFile;
    }

    public org.chromium.mojo_base.mojom.File getRegularFile() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mRegularFile;
    }

    public void setIncognitoFileDelegate(FileSystemAccessFileDelegateHost incognitoFileDelegate) {
        this.mTag = 1;
        this.mIncognitoFileDelegate = incognitoFileDelegate;
    }

    public FileSystemAccessFileDelegateHost getIncognitoFileDelegate() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mIncognitoFileDelegate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mRegularFile, offset + 8, false);
                return;
            case 1:
                encoder0.encode( this.mIncognitoFileDelegate, offset + 8, false,  FileSystemAccessFileDelegateHost.MANAGER);
                return;
            default:
                return;
        }
    }

    public static FileSystemAccessAccessHandleFile deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final FileSystemAccessAccessHandleFile decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        FileSystemAccessAccessHandleFile result = new FileSystemAccessAccessHandleFile();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mRegularFile = org.chromium.mojo_base.mojom.File.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                result.mIncognitoFileDelegate = (FileSystemAccessFileDelegateHost) decoder0.readServiceInterface(offset + 8, false, FileSystemAccessFileDelegateHost.MANAGER);
                result.mTag = 1;
                break;
        }
        return result;
    }
}
