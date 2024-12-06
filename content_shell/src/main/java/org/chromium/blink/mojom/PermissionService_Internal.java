package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.PermissionService;
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
class PermissionService_Internal {
    private static final int ADD_PERMISSION_OBSERVER_ORDINAL = 4;
    private static final int HAS_PERMISSION_ORDINAL = 0;
    public static final Interface.Manager<PermissionService, PermissionService.Proxy> MANAGER = new Interface.Manager<PermissionService, PermissionService.Proxy>() { // from class: org.chromium.blink.mojom.PermissionService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PermissionService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PermissionService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PermissionService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PermissionService[] buildArray(int size) {
            return new PermissionService[size];
        }
    };
    private static final int REQUEST_PERMISSIONS_ORDINAL = 2;
    private static final int REQUEST_PERMISSION_ORDINAL = 1;
    private static final int REVOKE_PERMISSION_ORDINAL = 3;

    PermissionService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PermissionService.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PermissionService
        public void hasPermission(PermissionDescriptor permission, HasPermissionResponse callback) {
            PermissionServiceHasPermissionParams _message = new PermissionServiceHasPermissionParams();
            _message.permission = permission;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PermissionServiceHasPermissionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PermissionService
        public void requestPermission(PermissionDescriptor permission, boolean userGesture, RequestPermissionResponse callback) {
            PermissionServiceRequestPermissionParams _message = new PermissionServiceRequestPermissionParams();
            _message.permission = permission;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new PermissionServiceRequestPermissionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PermissionService
        public void requestPermissions(PermissionDescriptor[] permission, boolean userGesture, RequestPermissionsResponse callback) {
            PermissionServiceRequestPermissionsParams _message = new PermissionServiceRequestPermissionsParams();
            _message.permission = permission;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new PermissionServiceRequestPermissionsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PermissionService
        public void revokePermission(PermissionDescriptor permission, RevokePermissionResponse callback) {
            PermissionServiceRevokePermissionParams _message = new PermissionServiceRevokePermissionParams();
            _message.permission = permission;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new PermissionServiceRevokePermissionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PermissionService
        public void addPermissionObserver(PermissionDescriptor permission, int lastKnownStatus, PermissionObserver observer) {
            PermissionServiceAddPermissionObserverParams _message = new PermissionServiceAddPermissionObserverParams();
            _message.permission = permission;
            _message.lastKnownStatus = lastKnownStatus;
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PermissionService> {
        Stub(Core core, PermissionService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PermissionService_Internal.MANAGER, messageWithHeader);
                    case 4:
                        PermissionServiceAddPermissionObserverParams data = PermissionServiceAddPermissionObserverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addPermissionObserver(data.permission, data.lastKnownStatus, data.observer);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PermissionService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().hasPermission(PermissionServiceHasPermissionParams.deserialize(messageWithHeader.getPayload()).permission, new PermissionServiceHasPermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        PermissionServiceRequestPermissionParams data = PermissionServiceRequestPermissionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestPermission(data.permission, data.userGesture, new PermissionServiceRequestPermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        PermissionServiceRequestPermissionsParams data2 = PermissionServiceRequestPermissionsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestPermissions(data2.permission, data2.userGesture, new PermissionServiceRequestPermissionsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        PermissionServiceRevokePermissionParams data3 = PermissionServiceRevokePermissionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().revokePermission(data3.permission, new PermissionServiceRevokePermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class PermissionServiceHasPermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PermissionDescriptor permission;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceHasPermissionParams(int version) {
            super(16, version);
        }

        public PermissionServiceHasPermissionParams() {
            this(0);
        }

        public static PermissionServiceHasPermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceHasPermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceHasPermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceHasPermissionParams result = new PermissionServiceHasPermissionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.permission = PermissionDescriptor.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.permission, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PermissionServiceHasPermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceHasPermissionResponseParams(int version) {
            super(16, version);
        }

        public PermissionServiceHasPermissionResponseParams() {
            this(0);
        }

        public static PermissionServiceHasPermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceHasPermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceHasPermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceHasPermissionResponseParams result = new PermissionServiceHasPermissionResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PermissionStatus.validate(readInt);
                result.status = PermissionStatus.toKnownValue(result.status);
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
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceHasPermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PermissionService.HasPermissionResponse mCallback;

        PermissionServiceHasPermissionResponseParamsForwardToCallback(PermissionService.HasPermissionResponse callback) {
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
                PermissionServiceHasPermissionResponseParams response = PermissionServiceHasPermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceHasPermissionResponseParamsProxyToResponder implements PermissionService.HasPermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PermissionServiceHasPermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            PermissionServiceHasPermissionResponseParams _response = new PermissionServiceHasPermissionResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PermissionServiceRequestPermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PermissionDescriptor permission;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRequestPermissionParams(int version) {
            super(24, version);
        }

        public PermissionServiceRequestPermissionParams() {
            this(0);
        }

        public static PermissionServiceRequestPermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRequestPermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRequestPermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRequestPermissionParams result = new PermissionServiceRequestPermissionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.permission = PermissionDescriptor.decode(decoder1);
                result.userGesture = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.permission, 8, false);
            encoder0.encode(this.userGesture, 16, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PermissionServiceRequestPermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRequestPermissionResponseParams(int version) {
            super(16, version);
        }

        public PermissionServiceRequestPermissionResponseParams() {
            this(0);
        }

        public static PermissionServiceRequestPermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRequestPermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRequestPermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRequestPermissionResponseParams result = new PermissionServiceRequestPermissionResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PermissionStatus.validate(readInt);
                result.status = PermissionStatus.toKnownValue(result.status);
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
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRequestPermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PermissionService.RequestPermissionResponse mCallback;

        PermissionServiceRequestPermissionResponseParamsForwardToCallback(PermissionService.RequestPermissionResponse callback) {
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
                PermissionServiceRequestPermissionResponseParams response = PermissionServiceRequestPermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRequestPermissionResponseParamsProxyToResponder implements PermissionService.RequestPermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PermissionServiceRequestPermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            PermissionServiceRequestPermissionResponseParams _response = new PermissionServiceRequestPermissionResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PermissionServiceRequestPermissionsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PermissionDescriptor[] permission;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRequestPermissionsParams(int version) {
            super(24, version);
        }

        public PermissionServiceRequestPermissionsParams() {
            this(0);
        }

        public static PermissionServiceRequestPermissionsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRequestPermissionsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRequestPermissionsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRequestPermissionsParams result = new PermissionServiceRequestPermissionsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.permission = new PermissionDescriptor[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.permission[i1] = PermissionDescriptor.decode(decoder2);
                }
                result.userGesture = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            PermissionDescriptor[] permissionDescriptorArr = this.permission;
            if (permissionDescriptorArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(permissionDescriptorArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    PermissionDescriptor[] permissionDescriptorArr2 = this.permission;
                    if (i0 >= permissionDescriptorArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) permissionDescriptorArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode(this.userGesture, 16, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PermissionServiceRequestPermissionsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int[] statuses;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRequestPermissionsResponseParams(int version) {
            super(16, version);
        }

        public PermissionServiceRequestPermissionsResponseParams() {
            this(0);
        }

        public static PermissionServiceRequestPermissionsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRequestPermissionsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRequestPermissionsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRequestPermissionsResponseParams result = new PermissionServiceRequestPermissionsResponseParams(elementsOrVersion);
                result.statuses = decoder0.readInts(8, 0, -1);
                int i1 = 0;
                while (true) {
                    int[] iArr = result.statuses;
                    if (i1 < iArr.length) {
                        PermissionStatus.validate(iArr[i1]);
                        i1++;
                    } else {
                        return result;
                    }
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.statuses, 8, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRequestPermissionsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PermissionService.RequestPermissionsResponse mCallback;

        PermissionServiceRequestPermissionsResponseParamsForwardToCallback(PermissionService.RequestPermissionsResponse callback) {
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
                PermissionServiceRequestPermissionsResponseParams response = PermissionServiceRequestPermissionsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.statuses);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRequestPermissionsResponseParamsProxyToResponder implements PermissionService.RequestPermissionsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PermissionServiceRequestPermissionsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(int[] statuses) {
            PermissionServiceRequestPermissionsResponseParams _response = new PermissionServiceRequestPermissionsResponseParams();
            _response.statuses = statuses;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PermissionServiceRevokePermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PermissionDescriptor permission;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRevokePermissionParams(int version) {
            super(16, version);
        }

        public PermissionServiceRevokePermissionParams() {
            this(0);
        }

        public static PermissionServiceRevokePermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRevokePermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRevokePermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRevokePermissionParams result = new PermissionServiceRevokePermissionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.permission = PermissionDescriptor.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.permission, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PermissionServiceRevokePermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceRevokePermissionResponseParams(int version) {
            super(16, version);
        }

        public PermissionServiceRevokePermissionResponseParams() {
            this(0);
        }

        public static PermissionServiceRevokePermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceRevokePermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceRevokePermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceRevokePermissionResponseParams result = new PermissionServiceRevokePermissionResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PermissionStatus.validate(readInt);
                result.status = PermissionStatus.toKnownValue(result.status);
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
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRevokePermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PermissionService.RevokePermissionResponse mCallback;

        PermissionServiceRevokePermissionResponseParamsForwardToCallback(PermissionService.RevokePermissionResponse callback) {
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
                PermissionServiceRevokePermissionResponseParams response = PermissionServiceRevokePermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionServiceRevokePermissionResponseParamsProxyToResponder implements PermissionService.RevokePermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PermissionServiceRevokePermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            PermissionServiceRevokePermissionResponseParams _response = new PermissionServiceRevokePermissionResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PermissionServiceAddPermissionObserverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int lastKnownStatus;
        public PermissionObserver observer;
        public PermissionDescriptor permission;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionServiceAddPermissionObserverParams(int version) {
            super(32, version);
        }

        public PermissionServiceAddPermissionObserverParams() {
            this(0);
        }

        public static PermissionServiceAddPermissionObserverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionServiceAddPermissionObserverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionServiceAddPermissionObserverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionServiceAddPermissionObserverParams result = new PermissionServiceAddPermissionObserverParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.permission = PermissionDescriptor.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.lastKnownStatus = readInt;
                PermissionStatus.validate(readInt);
                result.lastKnownStatus = PermissionStatus.toKnownValue(result.lastKnownStatus);
                result.observer = (PermissionObserver) decoder0.readServiceInterface(20, false, PermissionObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.permission, 8, false);
            encoder0.encode(this.lastKnownStatus, 16);
            encoder0.encode(this.observer, 20, false, PermissionObserver.MANAGER);
        }
    }
}
