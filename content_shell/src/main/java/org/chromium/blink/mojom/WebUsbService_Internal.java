package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.WebUsbService;
import org.chromium.device.mojom.UsbDevice;
import org.chromium.device.mojom.UsbDeviceFilter;
import org.chromium.device.mojom.UsbDeviceInfo;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class WebUsbService_Internal {
    private static final int GET_DEVICES_ORDINAL = 0;
    private static final int GET_DEVICE_ORDINAL = 1;
    private static final int GET_PERMISSION_ORDINAL = 2;
    public static final Interface.Manager<WebUsbService, WebUsbService.Proxy> MANAGER = new Interface.Manager<WebUsbService, WebUsbService.Proxy>() { // from class: org.chromium.blink.mojom.WebUsbService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.WebUsbService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public WebUsbService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, WebUsbService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebUsbService[] buildArray(int size) {
            return new WebUsbService[size];
        }
    };
    private static final int SET_CLIENT_ORDINAL = 3;

    WebUsbService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements WebUsbService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.WebUsbService
        public void getDevices(GetDevicesResponse callback) {
            WebUsbServiceGetDevicesParams _message = new WebUsbServiceGetDevicesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new WebUsbServiceGetDevicesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.WebUsbService
        public void getDevice(String guid, InterfaceRequest<UsbDevice> deviceReceiver) {
            WebUsbServiceGetDeviceParams _message = new WebUsbServiceGetDeviceParams();
            _message.guid = guid;
            _message.deviceReceiver = deviceReceiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.WebUsbService
        public void getPermission(UsbDeviceFilter[] deviceFilters, GetPermissionResponse callback) {
            WebUsbServiceGetPermissionParams _message = new WebUsbServiceGetPermissionParams();
            _message.deviceFilters = deviceFilters;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new WebUsbServiceGetPermissionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.WebUsbService
        public void setClient(AssociatedInterfaceNotSupported client) {
            WebUsbServiceSetClientParams _message = new WebUsbServiceSetClientParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<WebUsbService> {
        Stub(Core core, WebUsbService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(WebUsbService_Internal.MANAGER, messageWithHeader);
                    case 1:
                        WebUsbServiceGetDeviceParams data = WebUsbServiceGetDeviceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDevice(data.guid, data.deviceReceiver);
                        return true;
                    case 3:
                        getImpl().setClient(WebUsbServiceSetClientParams.deserialize(messageWithHeader.getPayload()).client);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), WebUsbService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        WebUsbServiceGetDevicesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDevices(new WebUsbServiceGetDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                    default:
                        return false;
                    case 2:
                        WebUsbServiceGetPermissionParams data = WebUsbServiceGetPermissionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPermission(data.deviceFilters, new WebUsbServiceGetPermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class WebUsbServiceGetDevicesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceGetDevicesParams(int version) {
            super(8, version);
        }

        public WebUsbServiceGetDevicesParams() {
            this(0);
        }

        public static WebUsbServiceGetDevicesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceGetDevicesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceGetDevicesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceGetDevicesParams result = new WebUsbServiceGetDevicesParams(elementsOrVersion);
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
    public static final class WebUsbServiceGetDevicesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UsbDeviceInfo[] results;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceGetDevicesResponseParams(int version) {
            super(16, version);
        }

        public WebUsbServiceGetDevicesResponseParams() {
            this(0);
        }

        public static WebUsbServiceGetDevicesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceGetDevicesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceGetDevicesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceGetDevicesResponseParams result = new WebUsbServiceGetDevicesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.results = new UsbDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.results[i1] = UsbDeviceInfo.decode(decoder2);
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
            UsbDeviceInfo[] usbDeviceInfoArr = this.results;
            if (usbDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(usbDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                UsbDeviceInfo[] usbDeviceInfoArr2 = this.results;
                if (i0 < usbDeviceInfoArr2.length) {
                    encoder1.encode((Struct) usbDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class WebUsbServiceGetDevicesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final WebUsbService.GetDevicesResponse mCallback;

        WebUsbServiceGetDevicesResponseParamsForwardToCallback(WebUsbService.GetDevicesResponse callback) {
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
                WebUsbServiceGetDevicesResponseParams response = WebUsbServiceGetDevicesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.results);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class WebUsbServiceGetDevicesResponseParamsProxyToResponder implements WebUsbService.GetDevicesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        WebUsbServiceGetDevicesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UsbDeviceInfo[] results) {
            WebUsbServiceGetDevicesResponseParams _response = new WebUsbServiceGetDevicesResponseParams();
            _response.results = results;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class WebUsbServiceGetDeviceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<UsbDevice> deviceReceiver;
        public String guid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceGetDeviceParams(int version) {
            super(24, version);
        }

        public WebUsbServiceGetDeviceParams() {
            this(0);
        }

        public static WebUsbServiceGetDeviceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceGetDeviceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceGetDeviceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceGetDeviceParams result = new WebUsbServiceGetDeviceParams(elementsOrVersion);
                result.guid = decoder0.readString(8, false);
                result.deviceReceiver = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.guid, 8, false);
            encoder0.encode((InterfaceRequest) this.deviceReceiver, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class WebUsbServiceGetPermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UsbDeviceFilter[] deviceFilters;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceGetPermissionParams(int version) {
            super(16, version);
        }

        public WebUsbServiceGetPermissionParams() {
            this(0);
        }

        public static WebUsbServiceGetPermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceGetPermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceGetPermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceGetPermissionParams result = new WebUsbServiceGetPermissionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.deviceFilters = new UsbDeviceFilter[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.deviceFilters[i1] = UsbDeviceFilter.decode(decoder2);
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
            UsbDeviceFilter[] usbDeviceFilterArr = this.deviceFilters;
            if (usbDeviceFilterArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(usbDeviceFilterArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                UsbDeviceFilter[] usbDeviceFilterArr2 = this.deviceFilters;
                if (i0 < usbDeviceFilterArr2.length) {
                    encoder1.encode((Struct) usbDeviceFilterArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class WebUsbServiceGetPermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UsbDeviceInfo result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceGetPermissionResponseParams(int version) {
            super(16, version);
        }

        public WebUsbServiceGetPermissionResponseParams() {
            this(0);
        }

        public static WebUsbServiceGetPermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceGetPermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceGetPermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceGetPermissionResponseParams result = new WebUsbServiceGetPermissionResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.result = UsbDeviceInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.result, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class WebUsbServiceGetPermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final WebUsbService.GetPermissionResponse mCallback;

        WebUsbServiceGetPermissionResponseParamsForwardToCallback(WebUsbService.GetPermissionResponse callback) {
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
                WebUsbServiceGetPermissionResponseParams response = WebUsbServiceGetPermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class WebUsbServiceGetPermissionResponseParamsProxyToResponder implements WebUsbService.GetPermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        WebUsbServiceGetPermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UsbDeviceInfo result) {
            WebUsbServiceGetPermissionResponseParams _response = new WebUsbServiceGetPermissionResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class WebUsbServiceSetClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebUsbServiceSetClientParams(int version) {
            super(16, version);
        }

        public WebUsbServiceSetClientParams() {
            this(0);
        }

        public static WebUsbServiceSetClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebUsbServiceSetClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebUsbServiceSetClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebUsbServiceSetClientParams result = new WebUsbServiceSetClientParams(elementsOrVersion);
                result.client = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.client, 8, false);
        }
    }
}
