package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.AndroidFontLookup;
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
import org.chromium.mojo_base.mojom.ReadOnlyFile;
/* loaded from: classes2.dex */
class AndroidFontLookup_Internal {
    private static final int GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL = 0;
    public static final Interface.Manager<AndroidFontLookup, AndroidFontLookup.Proxy> MANAGER = new Interface.Manager<AndroidFontLookup, AndroidFontLookup.Proxy>() { // from class: org.chromium.blink.mojom.AndroidFontLookup_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.AndroidFontLookup";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AndroidFontLookup.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AndroidFontLookup impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AndroidFontLookup[] buildArray(int size) {
            return new AndroidFontLookup[size];
        }
    };
    private static final int MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL = 1;

    AndroidFontLookup_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AndroidFontLookup.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.AndroidFontLookup
        public void getUniqueNameLookupTable(GetUniqueNameLookupTableResponse callback) {
            AndroidFontLookupGetUniqueNameLookupTableParams _message = new AndroidFontLookupGetUniqueNameLookupTableParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new AndroidFontLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.AndroidFontLookup
        public void matchLocalFontByUniqueName(String fontUniqueName, MatchLocalFontByUniqueNameResponse callback) {
            AndroidFontLookupMatchLocalFontByUniqueNameParams _message = new AndroidFontLookupMatchLocalFontByUniqueNameParams();
            _message.fontUniqueName = fontUniqueName;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AndroidFontLookup> {
        Stub(Core core, AndroidFontLookup impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AndroidFontLookup_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AndroidFontLookup_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        AndroidFontLookupGetUniqueNameLookupTableParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getUniqueNameLookupTable(new AndroidFontLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        AndroidFontLookupMatchLocalFontByUniqueNameParams data = AndroidFontLookupMatchLocalFontByUniqueNameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().matchLocalFontByUniqueName(data.fontUniqueName, new AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class AndroidFontLookupGetUniqueNameLookupTableParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AndroidFontLookupGetUniqueNameLookupTableParams(int version) {
            super(8, version);
        }

        public AndroidFontLookupGetUniqueNameLookupTableParams() {
            this(0);
        }

        public static AndroidFontLookupGetUniqueNameLookupTableParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AndroidFontLookupGetUniqueNameLookupTableParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AndroidFontLookupGetUniqueNameLookupTableParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AndroidFontLookupGetUniqueNameLookupTableParams result = new AndroidFontLookupGetUniqueNameLookupTableParams(elementsOrVersion);
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
    public static final class AndroidFontLookupGetUniqueNameLookupTableResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] uniqueFontNames;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AndroidFontLookupGetUniqueNameLookupTableResponseParams(int version) {
            super(16, version);
        }

        public AndroidFontLookupGetUniqueNameLookupTableResponseParams() {
            this(0);
        }

        public static AndroidFontLookupGetUniqueNameLookupTableResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AndroidFontLookupGetUniqueNameLookupTableResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AndroidFontLookupGetUniqueNameLookupTableResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AndroidFontLookupGetUniqueNameLookupTableResponseParams result = new AndroidFontLookupGetUniqueNameLookupTableResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.uniqueFontNames = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.uniqueFontNames[i1] = decoder1.readString((i1 * 8) + 8, false);
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
            String[] strArr = this.uniqueFontNames;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.uniqueFontNames;
                if (i0 < strArr2.length) {
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AndroidFontLookupGetUniqueNameLookupTableResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AndroidFontLookup.GetUniqueNameLookupTableResponse mCallback;

        AndroidFontLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(AndroidFontLookup.GetUniqueNameLookupTableResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 6)) {
                    return false;
                }
                AndroidFontLookupGetUniqueNameLookupTableResponseParams response = AndroidFontLookupGetUniqueNameLookupTableResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.uniqueFontNames);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AndroidFontLookupGetUniqueNameLookupTableResponseParamsProxyToResponder implements AndroidFontLookup.GetUniqueNameLookupTableResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AndroidFontLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(String[] uniqueFontNames) {
            AndroidFontLookupGetUniqueNameLookupTableResponseParams _response = new AndroidFontLookupGetUniqueNameLookupTableResponseParams();
            _response.uniqueFontNames = uniqueFontNames;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AndroidFontLookupMatchLocalFontByUniqueNameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String fontUniqueName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AndroidFontLookupMatchLocalFontByUniqueNameParams(int version) {
            super(16, version);
        }

        public AndroidFontLookupMatchLocalFontByUniqueNameParams() {
            this(0);
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AndroidFontLookupMatchLocalFontByUniqueNameParams result = new AndroidFontLookupMatchLocalFontByUniqueNameParams(elementsOrVersion);
                result.fontUniqueName = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.fontUniqueName, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AndroidFontLookupMatchLocalFontByUniqueNameResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyFile fontFileHandle;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AndroidFontLookupMatchLocalFontByUniqueNameResponseParams(int version) {
            super(16, version);
        }

        public AndroidFontLookupMatchLocalFontByUniqueNameResponseParams() {
            this(0);
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AndroidFontLookupMatchLocalFontByUniqueNameResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AndroidFontLookupMatchLocalFontByUniqueNameResponseParams result = new AndroidFontLookupMatchLocalFontByUniqueNameResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.fontFileHandle = ReadOnlyFile.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.fontFileHandle, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AndroidFontLookup.MatchLocalFontByUniqueNameResponse mCallback;

        AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsForwardToCallback(AndroidFontLookup.MatchLocalFontByUniqueNameResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 6)) {
                    return false;
                }
                AndroidFontLookupMatchLocalFontByUniqueNameResponseParams response = AndroidFontLookupMatchLocalFontByUniqueNameResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.fontFileHandle);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsProxyToResponder implements AndroidFontLookup.MatchLocalFontByUniqueNameResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(ReadOnlyFile fontFileHandle) {
            AndroidFontLookupMatchLocalFontByUniqueNameResponseParams _response = new AndroidFontLookupMatchLocalFontByUniqueNameResponseParams();
            _response.fontFileHandle = fontFileHandle;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
