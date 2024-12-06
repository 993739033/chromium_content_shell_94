package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.DeviceApiService;
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
class DeviceApiService_Internal {
    private static final int GET_ANNOTATED_ASSET_ID_ORDINAL = 3;
    private static final int GET_ANNOTATED_LOCATION_ORDINAL = 4;
    private static final int GET_DIRECTORY_ID_ORDINAL = 0;
    private static final int GET_HOSTNAME_ORDINAL = 1;
    private static final int GET_SERIAL_NUMBER_ORDINAL = 2;
    public static final Interface.Manager<DeviceApiService, DeviceApiService.Proxy> MANAGER = new Interface.Manager<DeviceApiService, DeviceApiService.Proxy>() { // from class: org.chromium.blink.mojom.DeviceApiService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.DeviceAPIService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DeviceApiService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DeviceApiService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DeviceApiService[] buildArray(int size) {
            return new DeviceApiService[size];
        }
    };

    DeviceApiService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DeviceApiService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.DeviceApiService
        public void getDirectoryId(GetDirectoryIdResponse callback) {
            DeviceApiServiceGetDirectoryIdParams _message = new DeviceApiServiceGetDirectoryIdParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new DeviceApiServiceGetDirectoryIdResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.DeviceApiService
        public void getHostname(GetHostnameResponse callback) {
            DeviceApiServiceGetHostnameParams _message = new DeviceApiServiceGetHostnameParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new DeviceApiServiceGetHostnameResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.DeviceApiService
        public void getSerialNumber(GetSerialNumberResponse callback) {
            DeviceApiServiceGetSerialNumberParams _message = new DeviceApiServiceGetSerialNumberParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new DeviceApiServiceGetSerialNumberResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.DeviceApiService
        public void getAnnotatedAssetId(GetAnnotatedAssetIdResponse callback) {
            DeviceApiServiceGetAnnotatedAssetIdParams _message = new DeviceApiServiceGetAnnotatedAssetIdParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new DeviceApiServiceGetAnnotatedAssetIdResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.DeviceApiService
        public void getAnnotatedLocation(GetAnnotatedLocationResponse callback) {
            DeviceApiServiceGetAnnotatedLocationParams _message = new DeviceApiServiceGetAnnotatedLocationParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new DeviceApiServiceGetAnnotatedLocationResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DeviceApiService> {
        Stub(Core core, DeviceApiService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DeviceApiService_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DeviceApiService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        DeviceApiServiceGetDirectoryIdParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDirectoryId(new DeviceApiServiceGetDirectoryIdResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        DeviceApiServiceGetHostnameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getHostname(new DeviceApiServiceGetHostnameResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        DeviceApiServiceGetSerialNumberParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getSerialNumber(new DeviceApiServiceGetSerialNumberResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        DeviceApiServiceGetAnnotatedAssetIdParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAnnotatedAssetId(new DeviceApiServiceGetAnnotatedAssetIdResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        DeviceApiServiceGetAnnotatedLocationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAnnotatedLocation(new DeviceApiServiceGetAnnotatedLocationResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class DeviceApiServiceGetDirectoryIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetDirectoryIdParams(int version) {
            super(8, version);
        }

        public DeviceApiServiceGetDirectoryIdParams() {
            this(0);
        }

        public static DeviceApiServiceGetDirectoryIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetDirectoryIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetDirectoryIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetDirectoryIdParams result = new DeviceApiServiceGetDirectoryIdParams(elementsOrVersion);
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
    public static final class DeviceApiServiceGetDirectoryIdResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DeviceAttributeResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetDirectoryIdResponseParams(int version) {
            super(24, version);
        }

        public DeviceApiServiceGetDirectoryIdResponseParams() {
            this(0);
        }

        public static DeviceApiServiceGetDirectoryIdResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetDirectoryIdResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetDirectoryIdResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetDirectoryIdResponseParams result = new DeviceApiServiceGetDirectoryIdResponseParams(elementsOrVersion);
                result.result = DeviceAttributeResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetDirectoryIdResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DeviceApiService.GetDirectoryIdResponse mCallback;

        DeviceApiServiceGetDirectoryIdResponseParamsForwardToCallback(DeviceApiService.GetDirectoryIdResponse callback) {
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
                DeviceApiServiceGetDirectoryIdResponseParams response = DeviceApiServiceGetDirectoryIdResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetDirectoryIdResponseParamsProxyToResponder implements DeviceApiService.GetDirectoryIdResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DeviceApiServiceGetDirectoryIdResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DeviceAttributeResult result) {
            DeviceApiServiceGetDirectoryIdResponseParams _response = new DeviceApiServiceGetDirectoryIdResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DeviceApiServiceGetHostnameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetHostnameParams(int version) {
            super(8, version);
        }

        public DeviceApiServiceGetHostnameParams() {
            this(0);
        }

        public static DeviceApiServiceGetHostnameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetHostnameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetHostnameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetHostnameParams result = new DeviceApiServiceGetHostnameParams(elementsOrVersion);
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
    public static final class DeviceApiServiceGetHostnameResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DeviceAttributeResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetHostnameResponseParams(int version) {
            super(24, version);
        }

        public DeviceApiServiceGetHostnameResponseParams() {
            this(0);
        }

        public static DeviceApiServiceGetHostnameResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetHostnameResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetHostnameResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetHostnameResponseParams result = new DeviceApiServiceGetHostnameResponseParams(elementsOrVersion);
                result.result = DeviceAttributeResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetHostnameResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DeviceApiService.GetHostnameResponse mCallback;

        DeviceApiServiceGetHostnameResponseParamsForwardToCallback(DeviceApiService.GetHostnameResponse callback) {
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
                DeviceApiServiceGetHostnameResponseParams response = DeviceApiServiceGetHostnameResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetHostnameResponseParamsProxyToResponder implements DeviceApiService.GetHostnameResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DeviceApiServiceGetHostnameResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DeviceAttributeResult result) {
            DeviceApiServiceGetHostnameResponseParams _response = new DeviceApiServiceGetHostnameResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DeviceApiServiceGetSerialNumberParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetSerialNumberParams(int version) {
            super(8, version);
        }

        public DeviceApiServiceGetSerialNumberParams() {
            this(0);
        }

        public static DeviceApiServiceGetSerialNumberParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetSerialNumberParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetSerialNumberParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetSerialNumberParams result = new DeviceApiServiceGetSerialNumberParams(elementsOrVersion);
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
    public static final class DeviceApiServiceGetSerialNumberResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DeviceAttributeResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetSerialNumberResponseParams(int version) {
            super(24, version);
        }

        public DeviceApiServiceGetSerialNumberResponseParams() {
            this(0);
        }

        public static DeviceApiServiceGetSerialNumberResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetSerialNumberResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetSerialNumberResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetSerialNumberResponseParams result = new DeviceApiServiceGetSerialNumberResponseParams(elementsOrVersion);
                result.result = DeviceAttributeResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetSerialNumberResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DeviceApiService.GetSerialNumberResponse mCallback;

        DeviceApiServiceGetSerialNumberResponseParamsForwardToCallback(DeviceApiService.GetSerialNumberResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
                    return false;
                }
                DeviceApiServiceGetSerialNumberResponseParams response = DeviceApiServiceGetSerialNumberResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetSerialNumberResponseParamsProxyToResponder implements DeviceApiService.GetSerialNumberResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DeviceApiServiceGetSerialNumberResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DeviceAttributeResult result) {
            DeviceApiServiceGetSerialNumberResponseParams _response = new DeviceApiServiceGetSerialNumberResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DeviceApiServiceGetAnnotatedAssetIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetAnnotatedAssetIdParams(int version) {
            super(8, version);
        }

        public DeviceApiServiceGetAnnotatedAssetIdParams() {
            this(0);
        }

        public static DeviceApiServiceGetAnnotatedAssetIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetAnnotatedAssetIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetAnnotatedAssetIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetAnnotatedAssetIdParams result = new DeviceApiServiceGetAnnotatedAssetIdParams(elementsOrVersion);
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
    public static final class DeviceApiServiceGetAnnotatedAssetIdResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DeviceAttributeResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetAnnotatedAssetIdResponseParams(int version) {
            super(24, version);
        }

        public DeviceApiServiceGetAnnotatedAssetIdResponseParams() {
            this(0);
        }

        public static DeviceApiServiceGetAnnotatedAssetIdResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetAnnotatedAssetIdResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetAnnotatedAssetIdResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetAnnotatedAssetIdResponseParams result = new DeviceApiServiceGetAnnotatedAssetIdResponseParams(elementsOrVersion);
                result.result = DeviceAttributeResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetAnnotatedAssetIdResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DeviceApiService.GetAnnotatedAssetIdResponse mCallback;

        DeviceApiServiceGetAnnotatedAssetIdResponseParamsForwardToCallback(DeviceApiService.GetAnnotatedAssetIdResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 2)) {
                    return false;
                }
                DeviceApiServiceGetAnnotatedAssetIdResponseParams response = DeviceApiServiceGetAnnotatedAssetIdResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetAnnotatedAssetIdResponseParamsProxyToResponder implements DeviceApiService.GetAnnotatedAssetIdResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DeviceApiServiceGetAnnotatedAssetIdResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DeviceAttributeResult result) {
            DeviceApiServiceGetAnnotatedAssetIdResponseParams _response = new DeviceApiServiceGetAnnotatedAssetIdResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DeviceApiServiceGetAnnotatedLocationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetAnnotatedLocationParams(int version) {
            super(8, version);
        }

        public DeviceApiServiceGetAnnotatedLocationParams() {
            this(0);
        }

        public static DeviceApiServiceGetAnnotatedLocationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetAnnotatedLocationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetAnnotatedLocationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetAnnotatedLocationParams result = new DeviceApiServiceGetAnnotatedLocationParams(elementsOrVersion);
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
    public static final class DeviceApiServiceGetAnnotatedLocationResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DeviceAttributeResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DeviceApiServiceGetAnnotatedLocationResponseParams(int version) {
            super(24, version);
        }

        public DeviceApiServiceGetAnnotatedLocationResponseParams() {
            this(0);
        }

        public static DeviceApiServiceGetAnnotatedLocationResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DeviceApiServiceGetAnnotatedLocationResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DeviceApiServiceGetAnnotatedLocationResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DeviceApiServiceGetAnnotatedLocationResponseParams result = new DeviceApiServiceGetAnnotatedLocationResponseParams(elementsOrVersion);
                result.result = DeviceAttributeResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetAnnotatedLocationResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DeviceApiService.GetAnnotatedLocationResponse mCallback;

        DeviceApiServiceGetAnnotatedLocationResponseParamsForwardToCallback(DeviceApiService.GetAnnotatedLocationResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 2)) {
                    return false;
                }
                DeviceApiServiceGetAnnotatedLocationResponseParams response = DeviceApiServiceGetAnnotatedLocationResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DeviceApiServiceGetAnnotatedLocationResponseParamsProxyToResponder implements DeviceApiService.GetAnnotatedLocationResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DeviceApiServiceGetAnnotatedLocationResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DeviceAttributeResult result) {
            DeviceApiServiceGetAnnotatedLocationResponseParams _response = new DeviceApiServiceGetAnnotatedLocationResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
