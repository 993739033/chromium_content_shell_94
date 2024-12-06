package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.HighPriorityLocalFrame;
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
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
class HighPriorityLocalFrame_Internal {
    private static final int DISPATCH_BEFORE_UNLOAD_ORDINAL = 0;
    public static final Interface.Manager<HighPriorityLocalFrame, HighPriorityLocalFrame.Proxy> MANAGER = new Interface.Manager<HighPriorityLocalFrame, HighPriorityLocalFrame.Proxy>() { // from class: org.chromium.blink.mojom.HighPriorityLocalFrame_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.HighPriorityLocalFrame";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HighPriorityLocalFrame.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HighPriorityLocalFrame impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HighPriorityLocalFrame[] buildArray(int size) {
            return new HighPriorityLocalFrame[size];
        }
    };

    HighPriorityLocalFrame_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HighPriorityLocalFrame.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.HighPriorityLocalFrame
        public void dispatchBeforeUnload(boolean isReload, DispatchBeforeUnloadResponse callback) {
            HighPriorityLocalFrameDispatchBeforeUnloadParams _message = new HighPriorityLocalFrameDispatchBeforeUnloadParams();
            _message.isReload = isReload;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HighPriorityLocalFrame> {
        Stub(Core core, HighPriorityLocalFrame impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HighPriorityLocalFrame_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HighPriorityLocalFrame_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        HighPriorityLocalFrameDispatchBeforeUnloadParams data = HighPriorityLocalFrameDispatchBeforeUnloadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchBeforeUnload(data.isReload, new HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class HighPriorityLocalFrameDispatchBeforeUnloadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isReload;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HighPriorityLocalFrameDispatchBeforeUnloadParams(int version) {
            super(16, version);
        }

        public HighPriorityLocalFrameDispatchBeforeUnloadParams() {
            this(0);
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HighPriorityLocalFrameDispatchBeforeUnloadParams result = new HighPriorityLocalFrameDispatchBeforeUnloadParams(elementsOrVersion);
                result.isReload = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isReload, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HighPriorityLocalFrameDispatchBeforeUnloadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeTicks beforeUnloadEndTime;
        public TimeTicks beforeUnloadStartTime;
        public boolean proceed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HighPriorityLocalFrameDispatchBeforeUnloadResponseParams(int version) {
            super(32, version);
        }

        public HighPriorityLocalFrameDispatchBeforeUnloadResponseParams() {
            this(0);
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HighPriorityLocalFrameDispatchBeforeUnloadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HighPriorityLocalFrameDispatchBeforeUnloadResponseParams result = new HighPriorityLocalFrameDispatchBeforeUnloadResponseParams(elementsOrVersion);
                result.proceed = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.beforeUnloadStartTime = TimeTicks.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.beforeUnloadEndTime = TimeTicks.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.proceed, 8, 0);
            encoder0.encode((Struct) this.beforeUnloadStartTime, 16, false);
            encoder0.encode((Struct) this.beforeUnloadEndTime, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HighPriorityLocalFrame.DispatchBeforeUnloadResponse mCallback;

        HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsForwardToCallback(HighPriorityLocalFrame.DispatchBeforeUnloadResponse callback) {
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
                HighPriorityLocalFrameDispatchBeforeUnloadResponseParams response = HighPriorityLocalFrameDispatchBeforeUnloadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.proceed), response.beforeUnloadStartTime, response.beforeUnloadEndTime);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsProxyToResponder implements HighPriorityLocalFrame.DispatchBeforeUnloadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HighPriorityLocalFrameDispatchBeforeUnloadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean proceed, TimeTicks beforeUnloadStartTime, TimeTicks beforeUnloadEndTime) {
            HighPriorityLocalFrameDispatchBeforeUnloadResponseParams _response = new HighPriorityLocalFrameDispatchBeforeUnloadResponseParams();
            _response.proceed = proceed.booleanValue();
            _response.beforeUnloadStartTime = beforeUnloadStartTime;
            _response.beforeUnloadEndTime = beforeUnloadEndTime;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
