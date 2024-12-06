package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.FileHandlingExpiry;
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
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
class FileHandlingExpiry_Internal {
    public static final Interface.Manager<FileHandlingExpiry, FileHandlingExpiry.Proxy> MANAGER = new Interface.Manager<FileHandlingExpiry, FileHandlingExpiry.Proxy>() { // from class: org.chromium.blink.mojom.FileHandlingExpiry_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.FileHandlingExpiry";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public FileHandlingExpiry.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, FileHandlingExpiry impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public FileHandlingExpiry[] buildArray(int size) {
            return new FileHandlingExpiry[size];
        }
    };
    private static final int REQUEST_ORIGIN_TRIAL_EXPIRY_TIME_ORDINAL = 0;

    FileHandlingExpiry_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements FileHandlingExpiry.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.FileHandlingExpiry
        public void requestOriginTrialExpiryTime(RequestOriginTrialExpiryTimeResponse callback) {
            FileHandlingExpiryRequestOriginTrialExpiryTimeParams _message = new FileHandlingExpiryRequestOriginTrialExpiryTimeParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<FileHandlingExpiry> {
        Stub(Core core, FileHandlingExpiry impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(FileHandlingExpiry_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), FileHandlingExpiry_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        FileHandlingExpiryRequestOriginTrialExpiryTimeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestOriginTrialExpiryTime(new FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class FileHandlingExpiryRequestOriginTrialExpiryTimeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileHandlingExpiryRequestOriginTrialExpiryTimeParams(int version) {
            super(8, version);
        }

        public FileHandlingExpiryRequestOriginTrialExpiryTimeParams() {
            this(0);
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileHandlingExpiryRequestOriginTrialExpiryTimeParams result = new FileHandlingExpiryRequestOriginTrialExpiryTimeParams(elementsOrVersion);
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
    public static final class FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Time expiryTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams(int version) {
            super(16, version);
        }

        public FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams() {
            this(0);
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams result = new FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.expiryTime = Time.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.expiryTime, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileHandlingExpiry.RequestOriginTrialExpiryTimeResponse mCallback;

        FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsForwardToCallback(FileHandlingExpiry.RequestOriginTrialExpiryTimeResponse callback) {
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
                FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams response = FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.expiryTime);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsProxyToResponder implements FileHandlingExpiry.RequestOriginTrialExpiryTimeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Time expiryTime) {
            FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams _response = new FileHandlingExpiryRequestOriginTrialExpiryTimeResponseParams();
            _response.expiryTime = expiryTime;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
