package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.FileSystemAccessFileHandle;
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
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.FileInfo;
/* loaded from: classes2.dex */
class FileSystemAccessFileHandle_Internal {
    private static final int AS_BLOB_ORDINAL = 2;
    private static final int CREATE_FILE_WRITER_ORDINAL = 3;
    private static final int GET_PERMISSION_STATUS_ORDINAL = 0;
    private static final int IS_SAME_ENTRY_ORDINAL = 6;
    public static final Interface.Manager<FileSystemAccessFileHandle, FileSystemAccessFileHandle.Proxy> MANAGER = new Interface.Manager<FileSystemAccessFileHandle, FileSystemAccessFileHandle.Proxy>() { // from class: org.chromium.blink.mojom.FileSystemAccessFileHandle_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.FileSystemAccessFileHandle";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public FileSystemAccessFileHandle.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, FileSystemAccessFileHandle impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public FileSystemAccessFileHandle[] buildArray(int size) {
            return new FileSystemAccessFileHandle[size];
        }
    };
    private static final int OPEN_ACCESS_HANDLE_ORDINAL = 5;
    private static final int REMOVE_ORDINAL = 4;
    private static final int REQUEST_PERMISSION_ORDINAL = 1;
    private static final int TRANSFER_ORDINAL = 7;

    FileSystemAccessFileHandle_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements FileSystemAccessFileHandle.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void getPermissionStatus(boolean writable, GetPermissionStatusResponse callback) {
            FileSystemAccessFileHandleGetPermissionStatusParams _message = new FileSystemAccessFileHandleGetPermissionStatusParams();
            _message.writable = writable;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new FileSystemAccessFileHandleGetPermissionStatusResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void requestPermission(boolean writable, RequestPermissionResponse callback) {
            FileSystemAccessFileHandleRequestPermissionParams _message = new FileSystemAccessFileHandleRequestPermissionParams();
            _message.writable = writable;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new FileSystemAccessFileHandleRequestPermissionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void asBlob(AsBlobResponse callback) {
            FileSystemAccessFileHandleAsBlobParams _message = new FileSystemAccessFileHandleAsBlobParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new FileSystemAccessFileHandleAsBlobResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void createFileWriter(boolean keepExistingData, boolean autoClose, CreateFileWriterResponse callback) {
            FileSystemAccessFileHandleCreateFileWriterParams _message = new FileSystemAccessFileHandleCreateFileWriterParams();
            _message.keepExistingData = keepExistingData;
            _message.autoClose = autoClose;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new FileSystemAccessFileHandleCreateFileWriterResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void remove(RemoveResponse callback) {
            FileSystemAccessFileHandleRemoveParams _message = new FileSystemAccessFileHandleRemoveParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new FileSystemAccessFileHandleRemoveResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void openAccessHandle(OpenAccessHandleResponse callback) {
            FileSystemAccessFileHandleOpenAccessHandleParams _message = new FileSystemAccessFileHandleOpenAccessHandleParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new FileSystemAccessFileHandleOpenAccessHandleResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void isSameEntry(FileSystemAccessTransferToken other, IsSameEntryResponse callback) {
            FileSystemAccessFileHandleIsSameEntryParams _message = new FileSystemAccessFileHandleIsSameEntryParams();
            _message.other = other;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new FileSystemAccessFileHandleIsSameEntryResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FileSystemAccessFileHandle
        public void transfer(InterfaceRequest<FileSystemAccessTransferToken> token) {
            FileSystemAccessFileHandleTransferParams _message = new FileSystemAccessFileHandleTransferParams();
            _message.token = token;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<FileSystemAccessFileHandle> {
        Stub(Core core, FileSystemAccessFileHandle impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(FileSystemAccessFileHandle_Internal.MANAGER, messageWithHeader);
                    case 7:
                        FileSystemAccessFileHandleTransferParams data = FileSystemAccessFileHandleTransferParams.deserialize(messageWithHeader.getPayload());
                        getImpl().transfer(data.token);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), FileSystemAccessFileHandle_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        FileSystemAccessFileHandleGetPermissionStatusParams data = FileSystemAccessFileHandleGetPermissionStatusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPermissionStatus(data.writable, new FileSystemAccessFileHandleGetPermissionStatusResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        FileSystemAccessFileHandleRequestPermissionParams data2 = FileSystemAccessFileHandleRequestPermissionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestPermission(data2.writable, new FileSystemAccessFileHandleRequestPermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        FileSystemAccessFileHandleAsBlobParams.deserialize(messageWithHeader.getPayload());
                        getImpl().asBlob(new FileSystemAccessFileHandleAsBlobResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        FileSystemAccessFileHandleCreateFileWriterParams data3 = FileSystemAccessFileHandleCreateFileWriterParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createFileWriter(data3.keepExistingData, data3.autoClose, new FileSystemAccessFileHandleCreateFileWriterResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        FileSystemAccessFileHandleRemoveParams.deserialize(messageWithHeader.getPayload());
                        getImpl().remove(new FileSystemAccessFileHandleRemoveResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        FileSystemAccessFileHandleOpenAccessHandleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openAccessHandle(new FileSystemAccessFileHandleOpenAccessHandleResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        FileSystemAccessFileHandleIsSameEntryParams data4 = FileSystemAccessFileHandleIsSameEntryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isSameEntry(data4.other, new FileSystemAccessFileHandleIsSameEntryResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class FileSystemAccessFileHandleGetPermissionStatusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean writable;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleGetPermissionStatusParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleGetPermissionStatusParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleGetPermissionStatusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleGetPermissionStatusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleGetPermissionStatusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleGetPermissionStatusParams result = new FileSystemAccessFileHandleGetPermissionStatusParams(elementsOrVersion);
                result.writable = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.writable, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileSystemAccessFileHandleGetPermissionStatusResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleGetPermissionStatusResponseParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleGetPermissionStatusResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleGetPermissionStatusResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleGetPermissionStatusResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleGetPermissionStatusResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleGetPermissionStatusResponseParams result = new FileSystemAccessFileHandleGetPermissionStatusResponseParams(elementsOrVersion);
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
    static class FileSystemAccessFileHandleGetPermissionStatusResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.GetPermissionStatusResponse mCallback;

        FileSystemAccessFileHandleGetPermissionStatusResponseParamsForwardToCallback(FileSystemAccessFileHandle.GetPermissionStatusResponse callback) {
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
                FileSystemAccessFileHandleGetPermissionStatusResponseParams response = FileSystemAccessFileHandleGetPermissionStatusResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleGetPermissionStatusResponseParamsProxyToResponder implements FileSystemAccessFileHandle.GetPermissionStatusResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleGetPermissionStatusResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            FileSystemAccessFileHandleGetPermissionStatusResponseParams _response = new FileSystemAccessFileHandleGetPermissionStatusResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleRequestPermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean writable;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleRequestPermissionParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleRequestPermissionParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleRequestPermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleRequestPermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleRequestPermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleRequestPermissionParams result = new FileSystemAccessFileHandleRequestPermissionParams(elementsOrVersion);
                result.writable = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.writable, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileSystemAccessFileHandleRequestPermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public FileSystemAccessError result;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleRequestPermissionResponseParams(int version) {
            super(24, version);
        }

        public FileSystemAccessFileHandleRequestPermissionResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleRequestPermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleRequestPermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleRequestPermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleRequestPermissionResponseParams result = new FileSystemAccessFileHandleRequestPermissionResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
                int readInt = decoder0.readInt(16);
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
            encoder0.encode((Struct) this.result, 8, false);
            encoder0.encode(this.status, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleRequestPermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.RequestPermissionResponse mCallback;

        FileSystemAccessFileHandleRequestPermissionResponseParamsForwardToCallback(FileSystemAccessFileHandle.RequestPermissionResponse callback) {
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
                FileSystemAccessFileHandleRequestPermissionResponseParams response = FileSystemAccessFileHandleRequestPermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result, Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleRequestPermissionResponseParamsProxyToResponder implements FileSystemAccessFileHandle.RequestPermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleRequestPermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(FileSystemAccessError result, Integer status) {
            FileSystemAccessFileHandleRequestPermissionResponseParams _response = new FileSystemAccessFileHandleRequestPermissionResponseParams();
            _response.result = result;
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleAsBlobParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleAsBlobParams(int version) {
            super(8, version);
        }

        public FileSystemAccessFileHandleAsBlobParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleAsBlobParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleAsBlobParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleAsBlobParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleAsBlobParams result = new FileSystemAccessFileHandleAsBlobParams(elementsOrVersion);
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
    public static final class FileSystemAccessFileHandleAsBlobResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public SerializedBlob blob;
        public FileInfo info;
        public FileSystemAccessError result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleAsBlobResponseParams(int version) {
            super(32, version);
        }

        public FileSystemAccessFileHandleAsBlobResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleAsBlobResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleAsBlobResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleAsBlobResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleAsBlobResponseParams result = new FileSystemAccessFileHandleAsBlobResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.info = FileInfo.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.blob = SerializedBlob.decode(decoder13);
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
            encoder0.encode((Struct) this.info, 16, false);
            encoder0.encode((Struct) this.blob, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleAsBlobResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.AsBlobResponse mCallback;

        FileSystemAccessFileHandleAsBlobResponseParamsForwardToCallback(FileSystemAccessFileHandle.AsBlobResponse callback) {
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
                FileSystemAccessFileHandleAsBlobResponseParams response = FileSystemAccessFileHandleAsBlobResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result, response.info, response.blob);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleAsBlobResponseParamsProxyToResponder implements FileSystemAccessFileHandle.AsBlobResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleAsBlobResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(FileSystemAccessError result, FileInfo info, SerializedBlob blob) {
            FileSystemAccessFileHandleAsBlobResponseParams _response = new FileSystemAccessFileHandleAsBlobResponseParams();
            _response.result = result;
            _response.info = info;
            _response.blob = blob;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleCreateFileWriterParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean autoClose;
        public boolean keepExistingData;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleCreateFileWriterParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleCreateFileWriterParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleCreateFileWriterParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleCreateFileWriterParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleCreateFileWriterParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleCreateFileWriterParams result = new FileSystemAccessFileHandleCreateFileWriterParams(elementsOrVersion);
                result.keepExistingData = decoder0.readBoolean(8, 0);
                result.autoClose = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.keepExistingData, 8, 0);
            encoder0.encode(this.autoClose, 8, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileSystemAccessFileHandleCreateFileWriterResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public FileSystemAccessError result;
        public FileSystemAccessFileWriter writer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleCreateFileWriterResponseParams(int version) {
            super(24, version);
        }

        public FileSystemAccessFileHandleCreateFileWriterResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleCreateFileWriterResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleCreateFileWriterResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleCreateFileWriterResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleCreateFileWriterResponseParams result = new FileSystemAccessFileHandleCreateFileWriterResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
                result.writer = (FileSystemAccessFileWriter) decoder0.readServiceInterface(16, true, FileSystemAccessFileWriter.MANAGER);
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
            encoder0.encode(this.writer, 16, true, FileSystemAccessFileWriter.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleCreateFileWriterResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.CreateFileWriterResponse mCallback;

        FileSystemAccessFileHandleCreateFileWriterResponseParamsForwardToCallback(FileSystemAccessFileHandle.CreateFileWriterResponse callback) {
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
                FileSystemAccessFileHandleCreateFileWriterResponseParams response = FileSystemAccessFileHandleCreateFileWriterResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result, response.writer);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleCreateFileWriterResponseParamsProxyToResponder implements FileSystemAccessFileHandle.CreateFileWriterResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleCreateFileWriterResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(FileSystemAccessError result, FileSystemAccessFileWriter writer) {
            FileSystemAccessFileHandleCreateFileWriterResponseParams _response = new FileSystemAccessFileHandleCreateFileWriterResponseParams();
            _response.result = result;
            _response.writer = writer;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleRemoveParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleRemoveParams(int version) {
            super(8, version);
        }

        public FileSystemAccessFileHandleRemoveParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleRemoveParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleRemoveParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleRemoveParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleRemoveParams result = new FileSystemAccessFileHandleRemoveParams(elementsOrVersion);
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
    public static final class FileSystemAccessFileHandleRemoveResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FileSystemAccessError result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleRemoveResponseParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleRemoveResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleRemoveResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleRemoveResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleRemoveResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleRemoveResponseParams result = new FileSystemAccessFileHandleRemoveResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
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
    static class FileSystemAccessFileHandleRemoveResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.RemoveResponse mCallback;

        FileSystemAccessFileHandleRemoveResponseParamsForwardToCallback(FileSystemAccessFileHandle.RemoveResponse callback) {
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
                FileSystemAccessFileHandleRemoveResponseParams response = FileSystemAccessFileHandleRemoveResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleRemoveResponseParamsProxyToResponder implements FileSystemAccessFileHandle.RemoveResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleRemoveResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(FileSystemAccessError result) {
            FileSystemAccessFileHandleRemoveResponseParams _response = new FileSystemAccessFileHandleRemoveResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleOpenAccessHandleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleOpenAccessHandleParams(int version) {
            super(8, version);
        }

        public FileSystemAccessFileHandleOpenAccessHandleParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleOpenAccessHandleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleOpenAccessHandleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleOpenAccessHandleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleOpenAccessHandleParams result = new FileSystemAccessFileHandleOpenAccessHandleParams(elementsOrVersion);
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
    public static final class FileSystemAccessFileHandleOpenAccessHandleResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public FileSystemAccessAccessHandleHost accessHandleHost;
        public FileSystemAccessAccessHandleFile file;
        public FileSystemAccessError result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleOpenAccessHandleResponseParams(int version) {
            super(40, version);
        }

        public FileSystemAccessFileHandleOpenAccessHandleResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleOpenAccessHandleResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleOpenAccessHandleResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleOpenAccessHandleResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleOpenAccessHandleResponseParams result = new FileSystemAccessFileHandleOpenAccessHandleResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
                result.file = FileSystemAccessAccessHandleFile.decode(decoder0, 16);
                result.accessHandleHost = (FileSystemAccessAccessHandleHost) decoder0.readServiceInterface(32, true, FileSystemAccessAccessHandleHost.MANAGER);
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
            encoder0.encode((Union) this.file, 16, true);
            encoder0.encode(this.accessHandleHost, 32, true,  FileSystemAccessAccessHandleHost.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleOpenAccessHandleResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.OpenAccessHandleResponse mCallback;

        FileSystemAccessFileHandleOpenAccessHandleResponseParamsForwardToCallback(FileSystemAccessFileHandle.OpenAccessHandleResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 2)) {
                    return false;
                }
                FileSystemAccessFileHandleOpenAccessHandleResponseParams response = FileSystemAccessFileHandleOpenAccessHandleResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result, response.file, response.accessHandleHost);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleOpenAccessHandleResponseParamsProxyToResponder implements FileSystemAccessFileHandle.OpenAccessHandleResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleOpenAccessHandleResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(FileSystemAccessError result, FileSystemAccessAccessHandleFile file, FileSystemAccessAccessHandleHost accessHandleHost) {
            FileSystemAccessFileHandleOpenAccessHandleResponseParams _response = new FileSystemAccessFileHandleOpenAccessHandleResponseParams();
            _response.result = result;
            _response.file = file;
            _response.accessHandleHost = accessHandleHost;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleIsSameEntryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FileSystemAccessTransferToken other;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleIsSameEntryParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleIsSameEntryParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleIsSameEntryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleIsSameEntryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleIsSameEntryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleIsSameEntryParams result = new FileSystemAccessFileHandleIsSameEntryParams(elementsOrVersion);
                result.other = (FileSystemAccessTransferToken) decoder0.readServiceInterface(8, false, FileSystemAccessTransferToken.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.other, 8, false,  FileSystemAccessTransferToken.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileSystemAccessFileHandleIsSameEntryResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isSame;
        public FileSystemAccessError result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleIsSameEntryResponseParams(int version) {
            super(24, version);
        }

        public FileSystemAccessFileHandleIsSameEntryResponseParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleIsSameEntryResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleIsSameEntryResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleIsSameEntryResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleIsSameEntryResponseParams result = new FileSystemAccessFileHandleIsSameEntryResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = FileSystemAccessError.decode(decoder1);
                result.isSame = decoder0.readBoolean(16, 0);
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
            encoder0.encode(this.isSame, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleIsSameEntryResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FileSystemAccessFileHandle.IsSameEntryResponse mCallback;

        FileSystemAccessFileHandleIsSameEntryResponseParamsForwardToCallback(FileSystemAccessFileHandle.IsSameEntryResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                FileSystemAccessFileHandleIsSameEntryResponseParams response = FileSystemAccessFileHandleIsSameEntryResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result, Boolean.valueOf(response.isSame));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSystemAccessFileHandleIsSameEntryResponseParamsProxyToResponder implements FileSystemAccessFileHandle.IsSameEntryResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSystemAccessFileHandleIsSameEntryResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(FileSystemAccessError result, Boolean isSame) {
            FileSystemAccessFileHandleIsSameEntryResponseParams _response = new FileSystemAccessFileHandleIsSameEntryResponseParams();
            _response.result = result;
            _response.isSame = isSame.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSystemAccessFileHandleTransferParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<FileSystemAccessTransferToken> token;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSystemAccessFileHandleTransferParams(int version) {
            super(16, version);
        }

        public FileSystemAccessFileHandleTransferParams() {
            this(0);
        }

        public static FileSystemAccessFileHandleTransferParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSystemAccessFileHandleTransferParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSystemAccessFileHandleTransferParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSystemAccessFileHandleTransferParams result = new FileSystemAccessFileHandleTransferParams(elementsOrVersion);
                result.token = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.token, 8, false);
        }
    }
}
