package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.V8DetailedMemoryReporter;
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
/* loaded from: classes2.dex */
class V8DetailedMemoryReporter_Internal {
    private static final int GET_V8_MEMORY_USAGE_ORDINAL = 0;
    public static final Interface.Manager<V8DetailedMemoryReporter, V8DetailedMemoryReporter.Proxy> MANAGER = new Interface.Manager<V8DetailedMemoryReporter, V8DetailedMemoryReporter.Proxy>() { // from class: org.chromium.blink.mojom.V8DetailedMemoryReporter_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.V8DetailedMemoryReporter";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public V8DetailedMemoryReporter.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, V8DetailedMemoryReporter impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public V8DetailedMemoryReporter[] buildArray(int size) {
            return new V8DetailedMemoryReporter[size];
        }
    };

    V8DetailedMemoryReporter_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements V8DetailedMemoryReporter.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.V8DetailedMemoryReporter
        public void getV8MemoryUsage(int mode, GetV8MemoryUsageResponse callback) {
            V8DetailedMemoryReporterGetV8MemoryUsageParams _message = new V8DetailedMemoryReporterGetV8MemoryUsageParams();
            _message.mode = mode;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<V8DetailedMemoryReporter> {
        Stub(Core core, V8DetailedMemoryReporter impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(V8DetailedMemoryReporter_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), V8DetailedMemoryReporter_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        V8DetailedMemoryReporterGetV8MemoryUsageParams data = V8DetailedMemoryReporterGetV8MemoryUsageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getV8MemoryUsage(data.mode, new V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class V8DetailedMemoryReporterGetV8MemoryUsageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int mode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private V8DetailedMemoryReporterGetV8MemoryUsageParams(int version) {
            super(16, version);
        }

        public V8DetailedMemoryReporterGetV8MemoryUsageParams() {
            this(0);
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                V8DetailedMemoryReporterGetV8MemoryUsageParams result = new V8DetailedMemoryReporterGetV8MemoryUsageParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.mode = readInt;
                V8DetailedMemoryReporter.Mode.validate(readInt);
                result.mode = V8DetailedMemoryReporter.Mode.toKnownValue(result.mode);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.mode, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class V8DetailedMemoryReporterGetV8MemoryUsageResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PerProcessV8MemoryUsage memoryUsage;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private V8DetailedMemoryReporterGetV8MemoryUsageResponseParams(int version) {
            super(16, version);
        }

        public V8DetailedMemoryReporterGetV8MemoryUsageResponseParams() {
            this(0);
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static V8DetailedMemoryReporterGetV8MemoryUsageResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                V8DetailedMemoryReporterGetV8MemoryUsageResponseParams result = new V8DetailedMemoryReporterGetV8MemoryUsageResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.memoryUsage = PerProcessV8MemoryUsage.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.memoryUsage, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final V8DetailedMemoryReporter.GetV8MemoryUsageResponse mCallback;

        V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsForwardToCallback(V8DetailedMemoryReporter.GetV8MemoryUsageResponse callback) {
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
                V8DetailedMemoryReporterGetV8MemoryUsageResponseParams response = V8DetailedMemoryReporterGetV8MemoryUsageResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.memoryUsage);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsProxyToResponder implements V8DetailedMemoryReporter.GetV8MemoryUsageResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        V8DetailedMemoryReporterGetV8MemoryUsageResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(PerProcessV8MemoryUsage memoryUsage) {
            V8DetailedMemoryReporterGetV8MemoryUsageResponseParams _response = new V8DetailedMemoryReporterGetV8MemoryUsageResponseParams();
            _response.memoryUsage = memoryUsage;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
