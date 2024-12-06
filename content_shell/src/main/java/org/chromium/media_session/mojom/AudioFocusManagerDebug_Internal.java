package org.chromium.media_session.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media_session.mojom.AudioFocusManagerDebug;
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
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
class AudioFocusManagerDebug_Internal {
    private static final int GET_DEBUG_INFO_FOR_REQUEST_ORDINAL = 0;
    public static final Interface.Manager<AudioFocusManagerDebug, AudioFocusManagerDebug.Proxy> MANAGER = new Interface.Manager<AudioFocusManagerDebug, AudioFocusManagerDebug.Proxy>() { // from class: org.chromium.media_session.mojom.AudioFocusManagerDebug_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media_session.mojom.AudioFocusManagerDebug";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AudioFocusManagerDebug.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AudioFocusManagerDebug impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AudioFocusManagerDebug[] buildArray(int size) {
            return new AudioFocusManagerDebug[size];
        }
    };

    AudioFocusManagerDebug_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AudioFocusManagerDebug.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media_session.mojom.AudioFocusManagerDebug
        public void getDebugInfoForRequest(UnguessableToken requestId, GetDebugInfoForRequestResponse callback) {
            AudioFocusManagerDebugGetDebugInfoForRequestParams _message = new AudioFocusManagerDebugGetDebugInfoForRequestParams();
            _message.requestId = requestId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AudioFocusManagerDebug> {
        Stub(Core core, AudioFocusManagerDebug impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AudioFocusManagerDebug_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AudioFocusManagerDebug_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        AudioFocusManagerDebugGetDebugInfoForRequestParams data = AudioFocusManagerDebugGetDebugInfoForRequestParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDebugInfoForRequest(data.requestId, new AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class AudioFocusManagerDebugGetDebugInfoForRequestParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken requestId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AudioFocusManagerDebugGetDebugInfoForRequestParams(int version) {
            super(16, version);
        }

        public AudioFocusManagerDebugGetDebugInfoForRequestParams() {
            this(0);
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AudioFocusManagerDebugGetDebugInfoForRequestParams result = new AudioFocusManagerDebugGetDebugInfoForRequestParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.requestId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.requestId, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AudioFocusManagerDebugGetDebugInfoForRequestResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaSessionDebugInfo debugInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AudioFocusManagerDebugGetDebugInfoForRequestResponseParams(int version) {
            super(16, version);
        }

        public AudioFocusManagerDebugGetDebugInfoForRequestResponseParams() {
            this(0);
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AudioFocusManagerDebugGetDebugInfoForRequestResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AudioFocusManagerDebugGetDebugInfoForRequestResponseParams result = new AudioFocusManagerDebugGetDebugInfoForRequestResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.debugInfo = MediaSessionDebugInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.debugInfo, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AudioFocusManagerDebug.GetDebugInfoForRequestResponse mCallback;

        AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsForwardToCallback(AudioFocusManagerDebug.GetDebugInfoForRequestResponse callback) {
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
                AudioFocusManagerDebugGetDebugInfoForRequestResponseParams response = AudioFocusManagerDebugGetDebugInfoForRequestResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.debugInfo);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsProxyToResponder implements AudioFocusManagerDebug.GetDebugInfoForRequestResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AudioFocusManagerDebugGetDebugInfoForRequestResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(MediaSessionDebugInfo debugInfo) {
            AudioFocusManagerDebugGetDebugInfoForRequestResponseParams _response = new AudioFocusManagerDebugGetDebugInfoForRequestResponseParams();
            _response.debugInfo = debugInfo;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
