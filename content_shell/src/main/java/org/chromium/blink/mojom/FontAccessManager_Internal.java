package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.FontAccessManager;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
/* loaded from: classes2.dex */
class FontAccessManager_Internal {
    private static final int CHOOSE_LOCAL_FONTS_ORDINAL = 1;
    private static final int ENUMERATE_LOCAL_FONTS_ORDINAL = 0;
    public static final Interface.Manager<FontAccessManager, FontAccessManager.Proxy> MANAGER = new Interface.Manager<FontAccessManager, FontAccessManager.Proxy>() { // from class: org.chromium.blink.mojom.FontAccessManager_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.FontAccessManager";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public FontAccessManager.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, FontAccessManager impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public FontAccessManager[] buildArray(int size) {
            return new FontAccessManager[size];
        }
    };

    FontAccessManager_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements FontAccessManager.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.FontAccessManager
        public void enumerateLocalFonts(EnumerateLocalFontsResponse callback) {
            FontAccessManagerEnumerateLocalFontsParams _message = new FontAccessManagerEnumerateLocalFontsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new FontAccessManagerEnumerateLocalFontsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FontAccessManager
        public void chooseLocalFonts(String[] selection, ChooseLocalFontsResponse callback) {
            FontAccessManagerChooseLocalFontsParams _message = new FontAccessManagerChooseLocalFontsParams();
            _message.selection = selection;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new FontAccessManagerChooseLocalFontsResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<FontAccessManager> {
        Stub(Core core, FontAccessManager impl) {
            super(core, impl);
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 0;
                if (header.hasFlag(4)) {
                    flags = 0 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -2:
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(FontAccessManager_Internal.MANAGER, messageWithHeader);
                    default:
                        return false;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override // org.chromium.mojo.bindings.MessageReceiverWithResponder
        public boolean acceptWithResponder(Message message, MessageReceiver receiver) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 1;
                if (header.hasFlag(4)) {
                    flags = 1 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -1:
                        return InterfaceControlMessagesHelper.handleRun(getCore(), FontAccessManager_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        FontAccessManagerEnumerateLocalFontsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enumerateLocalFonts(new FontAccessManagerEnumerateLocalFontsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        FontAccessManagerChooseLocalFontsParams data = FontAccessManagerChooseLocalFontsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().chooseLocalFonts(data.selection, new FontAccessManagerChooseLocalFontsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    default:
                        return false;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class FontAccessManagerEnumerateLocalFontsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FontAccessManagerEnumerateLocalFontsParams(int version) {
            super(8, version);
        }

        public FontAccessManagerEnumerateLocalFontsParams() {
            this(0);
        }

        public static FontAccessManagerEnumerateLocalFontsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FontAccessManagerEnumerateLocalFontsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FontAccessManagerEnumerateLocalFontsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FontAccessManagerEnumerateLocalFontsParams result = new FontAccessManagerEnumerateLocalFontsParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FontAccessManagerEnumerateLocalFontsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int enumerationStatus;
        public ReadOnlySharedMemoryRegion enumerationTable;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FontAccessManagerEnumerateLocalFontsResponseParams(int version) {
            super(24, version);
        }

        public FontAccessManagerEnumerateLocalFontsResponseParams() {
            this(0);
        }

        public static FontAccessManagerEnumerateLocalFontsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FontAccessManagerEnumerateLocalFontsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FontAccessManagerEnumerateLocalFontsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FontAccessManagerEnumerateLocalFontsResponseParams result = new FontAccessManagerEnumerateLocalFontsResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.enumerationStatus = readInt;
                FontEnumerationStatus.validate(readInt);
                result.enumerationStatus = FontEnumerationStatus.toKnownValue(result.enumerationStatus);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.enumerationTable = ReadOnlySharedMemoryRegion.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enumerationStatus, 8);
            encoder0.encode((Struct) this.enumerationTable, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class FontAccessManagerEnumerateLocalFontsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FontAccessManager.EnumerateLocalFontsResponse mCallback;

        FontAccessManagerEnumerateLocalFontsResponseParamsForwardToCallback(FontAccessManager.EnumerateLocalFontsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 2)) {
                    return false;
                }
                FontAccessManagerEnumerateLocalFontsResponseParams response = FontAccessManagerEnumerateLocalFontsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.enumerationStatus), response.enumerationTable);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FontAccessManagerEnumerateLocalFontsResponseParamsProxyToResponder implements FontAccessManager.EnumerateLocalFontsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FontAccessManagerEnumerateLocalFontsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer enumerationStatus, ReadOnlySharedMemoryRegion enumerationTable) {
            FontAccessManagerEnumerateLocalFontsResponseParams _response = new FontAccessManagerEnumerateLocalFontsResponseParams();
            _response.enumerationStatus = enumerationStatus.intValue();
            _response.enumerationTable = enumerationTable;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FontAccessManagerChooseLocalFontsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] selection;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FontAccessManagerChooseLocalFontsParams(int version) {
            super(16, version);
        }

        public FontAccessManagerChooseLocalFontsParams() {
            this(0);
        }

        public static FontAccessManagerChooseLocalFontsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FontAccessManagerChooseLocalFontsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FontAccessManagerChooseLocalFontsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FontAccessManagerChooseLocalFontsParams result = new FontAccessManagerChooseLocalFontsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.selection = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.selection[i1] = decoder1.readString((i1 * 8) + 8, false);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            String[] strArr = this.selection;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.selection;
                if (i0 < strArr2.length) {
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FontAccessManagerChooseLocalFontsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public FontMetadata[] chosenFonts;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FontAccessManagerChooseLocalFontsResponseParams(int version) {
            super(24, version);
        }

        public FontAccessManagerChooseLocalFontsResponseParams() {
            this(0);
        }

        public static FontAccessManagerChooseLocalFontsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FontAccessManagerChooseLocalFontsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FontAccessManagerChooseLocalFontsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FontAccessManagerChooseLocalFontsResponseParams result = new FontAccessManagerChooseLocalFontsResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                FontEnumerationStatus.validate(readInt);
                result.status = FontEnumerationStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.chosenFonts = new FontMetadata[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.chosenFonts[i1] = FontMetadata.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
            FontMetadata[] fontMetadataArr = this.chosenFonts;
            if (fontMetadataArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(fontMetadataArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                FontMetadata[] fontMetadataArr2 = this.chosenFonts;
                if (i0 < fontMetadataArr2.length) {
                    encoder1.encode((Struct) fontMetadataArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FontAccessManagerChooseLocalFontsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FontAccessManager.ChooseLocalFontsResponse mCallback;

        FontAccessManagerChooseLocalFontsResponseParamsForwardToCallback(FontAccessManager.ChooseLocalFontsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 2)) {
                    return false;
                }
                FontAccessManagerChooseLocalFontsResponseParams response = FontAccessManagerChooseLocalFontsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.chosenFonts);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FontAccessManagerChooseLocalFontsResponseParamsProxyToResponder implements FontAccessManager.ChooseLocalFontsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FontAccessManagerChooseLocalFontsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, FontMetadata[] chosenFonts) {
            FontAccessManagerChooseLocalFontsResponseParams _response = new FontAccessManagerChooseLocalFontsResponseParams();
            _response.status = status.intValue();
            _response.chosenFonts = chosenFonts;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
