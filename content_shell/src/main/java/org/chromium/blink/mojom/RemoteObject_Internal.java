package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.RemoteObject;
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
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class RemoteObject_Internal {
    private static final int GET_METHODS_ORDINAL = 1;
    private static final int HAS_METHOD_ORDINAL = 0;
    private static final int INVOKE_METHOD_ORDINAL = 2;
    public static final Interface.Manager<RemoteObject, RemoteObject.Proxy> MANAGER = new Interface.Manager<RemoteObject, RemoteObject.Proxy>() { // from class: org.chromium.blink.mojom.RemoteObject_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.RemoteObject";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public RemoteObject.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RemoteObject impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RemoteObject[] buildArray(int size) {
            return new RemoteObject[size];
        }
    };
    private static final int NOTIFY_RELEASED_OBJECT_ORDINAL = 3;

    RemoteObject_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RemoteObject.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.RemoteObject
        public void hasMethod(String name, HasMethodResponse callback) {
            RemoteObjectHasMethodParams _message = new RemoteObjectHasMethodParams();
            _message.name = name;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new RemoteObjectHasMethodResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.RemoteObject
        public void getMethods(GetMethodsResponse callback) {
            RemoteObjectGetMethodsParams _message = new RemoteObjectGetMethodsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new RemoteObjectGetMethodsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.RemoteObject
        public void invokeMethod(String name, RemoteInvocationArgument[] arguments, InvokeMethodResponse callback) {
            RemoteObjectInvokeMethodParams _message = new RemoteObjectInvokeMethodParams();
            _message.name = name;
            _message.arguments = arguments;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new RemoteObjectInvokeMethodResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.RemoteObject
        public void notifyReleasedObject() {
            RemoteObjectNotifyReleasedObjectParams _message = new RemoteObjectNotifyReleasedObjectParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RemoteObject> {
        Stub(Core core, RemoteObject impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RemoteObject_Internal.MANAGER, messageWithHeader);
                    case 3:
                        RemoteObjectNotifyReleasedObjectParams.deserialize(messageWithHeader.getPayload());
                        getImpl().notifyReleasedObject();
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RemoteObject_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().hasMethod(RemoteObjectHasMethodParams.deserialize(messageWithHeader.getPayload()).name, new RemoteObjectHasMethodResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        RemoteObjectGetMethodsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getMethods(new RemoteObjectGetMethodsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        RemoteObjectInvokeMethodParams data = RemoteObjectInvokeMethodParams.deserialize(messageWithHeader.getPayload());
                        getImpl().invokeMethod(data.name, data.arguments, new RemoteObjectInvokeMethodResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class RemoteObjectHasMethodParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectHasMethodParams(int version) {
            super(16, version);
        }

        public RemoteObjectHasMethodParams() {
            this(0);
        }

        public static RemoteObjectHasMethodParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectHasMethodParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectHasMethodParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectHasMethodParams result = new RemoteObjectHasMethodParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RemoteObjectHasMethodResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean methodExists;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectHasMethodResponseParams(int version) {
            super(16, version);
        }

        public RemoteObjectHasMethodResponseParams() {
            this(0);
        }

        public static RemoteObjectHasMethodResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectHasMethodResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectHasMethodResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectHasMethodResponseParams result = new RemoteObjectHasMethodResponseParams(elementsOrVersion);
                result.methodExists = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.methodExists, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class RemoteObjectHasMethodResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RemoteObject.HasMethodResponse mCallback;

        RemoteObjectHasMethodResponseParamsForwardToCallback(RemoteObject.HasMethodResponse callback) {
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
                RemoteObjectHasMethodResponseParams response = RemoteObjectHasMethodResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.methodExists));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RemoteObjectHasMethodResponseParamsProxyToResponder implements RemoteObject.HasMethodResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RemoteObjectHasMethodResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean methodExists) {
            RemoteObjectHasMethodResponseParams _response = new RemoteObjectHasMethodResponseParams();
            _response.methodExists = methodExists.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteObjectGetMethodsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectGetMethodsParams(int version) {
            super(8, version);
        }

        public RemoteObjectGetMethodsParams() {
            this(0);
        }

        public static RemoteObjectGetMethodsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectGetMethodsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectGetMethodsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectGetMethodsParams result = new RemoteObjectGetMethodsParams(elementsOrVersion);
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
    public static final class RemoteObjectGetMethodsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] methodNames;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectGetMethodsResponseParams(int version) {
            super(16, version);
        }

        public RemoteObjectGetMethodsResponseParams() {
            this(0);
        }

        public static RemoteObjectGetMethodsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectGetMethodsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectGetMethodsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectGetMethodsResponseParams result = new RemoteObjectGetMethodsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.methodNames = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.methodNames[i1] = decoder1.readString((i1 * 8) + 8, false);
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
            String[] strArr = this.methodNames;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.methodNames;
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
    static class RemoteObjectGetMethodsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RemoteObject.GetMethodsResponse mCallback;

        RemoteObjectGetMethodsResponseParamsForwardToCallback(RemoteObject.GetMethodsResponse callback) {
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
                RemoteObjectGetMethodsResponseParams response = RemoteObjectGetMethodsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.methodNames);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RemoteObjectGetMethodsResponseParamsProxyToResponder implements RemoteObject.GetMethodsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RemoteObjectGetMethodsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(String[] methodNames) {
            RemoteObjectGetMethodsResponseParams _response = new RemoteObjectGetMethodsResponseParams();
            _response.methodNames = methodNames;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteObjectInvokeMethodParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public RemoteInvocationArgument[] arguments;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectInvokeMethodParams(int version) {
            super(24, version);
        }

        public RemoteObjectInvokeMethodParams() {
            this(0);
        }

        public static RemoteObjectInvokeMethodParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectInvokeMethodParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectInvokeMethodParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectInvokeMethodParams result = new RemoteObjectInvokeMethodParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.arguments = new RemoteInvocationArgument[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.arguments[i1] = RemoteInvocationArgument.decode(decoder1, (i1 * 16) + 8);
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
            encoder0.encode(this.name, 8, false);
            RemoteInvocationArgument[] remoteInvocationArgumentArr = this.arguments;
            if (remoteInvocationArgumentArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodeUnionArray(remoteInvocationArgumentArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                RemoteInvocationArgument[] remoteInvocationArgumentArr2 = this.arguments;
                if (i0 < remoteInvocationArgumentArr2.length) {
                    encoder1.encode((Union) remoteInvocationArgumentArr2[i0], (i0 * 16) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RemoteObjectInvokeMethodResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public RemoteInvocationResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectInvokeMethodResponseParams(int version) {
            super(16, version);
        }

        public RemoteObjectInvokeMethodResponseParams() {
            this(0);
        }

        public static RemoteObjectInvokeMethodResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectInvokeMethodResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectInvokeMethodResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectInvokeMethodResponseParams result = new RemoteObjectInvokeMethodResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = RemoteInvocationResult.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class RemoteObjectInvokeMethodResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RemoteObject.InvokeMethodResponse mCallback;

        RemoteObjectInvokeMethodResponseParamsForwardToCallback(RemoteObject.InvokeMethodResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 6)) {
                    return false;
                }
                RemoteObjectInvokeMethodResponseParams response = RemoteObjectInvokeMethodResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RemoteObjectInvokeMethodResponseParamsProxyToResponder implements RemoteObject.InvokeMethodResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RemoteObjectInvokeMethodResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(RemoteInvocationResult result) {
            RemoteObjectInvokeMethodResponseParams _response = new RemoteObjectInvokeMethodResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteObjectNotifyReleasedObjectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteObjectNotifyReleasedObjectParams(int version) {
            super(8, version);
        }

        public RemoteObjectNotifyReleasedObjectParams() {
            this(0);
        }

        public static RemoteObjectNotifyReleasedObjectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteObjectNotifyReleasedObjectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteObjectNotifyReleasedObjectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteObjectNotifyReleasedObjectParams result = new RemoteObjectNotifyReleasedObjectParams(elementsOrVersion);
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
}
