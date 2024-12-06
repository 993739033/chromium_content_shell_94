package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.NativeIoHost;
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
class NativeIoHost_Internal {
    private static final int DELETE_FILE_ORDINAL = 2;
    private static final int GET_ALL_FILE_NAMES_ORDINAL = 3;
    public static final Interface.Manager<NativeIoHost, NativeIoHost.Proxy> MANAGER = new Interface.Manager<NativeIoHost, NativeIoHost.Proxy>() { // from class: org.chromium.blink.mojom.NativeIoHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.NativeIOHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public NativeIoHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NativeIoHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NativeIoHost[] buildArray(int size) {
            return new NativeIoHost[size];
        }
    };
    private static final int OPEN_FILE_ORDINAL = 1;
    private static final int RENAME_FILE_ORDINAL = 4;
    private static final int REQUEST_CAPACITY_CHANGE_ORDINAL = 0;

    NativeIoHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NativeIoHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.NativeIoHost
        public void requestCapacityChange(long capacityDelta, RequestCapacityChangeResponse callback) {
            NativeIoHostRequestCapacityChangeParams _message = new NativeIoHostRequestCapacityChangeParams();
            _message.capacityDelta = capacityDelta;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new NativeIoHostRequestCapacityChangeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.NativeIoHost
        public void openFile(String name, InterfaceRequest<NativeIoFileHost> fileHostReceiver, OpenFileResponse callback) {
            NativeIoHostOpenFileParams _message = new NativeIoHostOpenFileParams();
            _message.name = name;
            _message.fileHostReceiver = fileHostReceiver;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new NativeIoHostOpenFileResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.NativeIoHost
        public void deleteFile(String name, DeleteFileResponse callback) {
            NativeIoHostDeleteFileParams _message = new NativeIoHostDeleteFileParams();
            _message.name = name;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new NativeIoHostDeleteFileResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.NativeIoHost
        public void getAllFileNames(GetAllFileNamesResponse callback) {
            NativeIoHostGetAllFileNamesParams _message = new NativeIoHostGetAllFileNamesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new NativeIoHostGetAllFileNamesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.NativeIoHost
        public void renameFile(String oldName, String newName, RenameFileResponse callback) {
            NativeIoHostRenameFileParams _message = new NativeIoHostRenameFileParams();
            _message.oldName = oldName;
            _message.newName = newName;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new NativeIoHostRenameFileResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NativeIoHost> {
        Stub(Core core, NativeIoHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NativeIoHost_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NativeIoHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().requestCapacityChange(NativeIoHostRequestCapacityChangeParams.deserialize(messageWithHeader.getPayload()).capacityDelta, new NativeIoHostRequestCapacityChangeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        NativeIoHostOpenFileParams data = NativeIoHostOpenFileParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openFile(data.name, data.fileHostReceiver, new NativeIoHostOpenFileResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        NativeIoHostDeleteFileParams data2 = NativeIoHostDeleteFileParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteFile(data2.name, new NativeIoHostDeleteFileResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        NativeIoHostGetAllFileNamesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAllFileNames(new NativeIoHostGetAllFileNamesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        NativeIoHostRenameFileParams data3 = NativeIoHostRenameFileParams.deserialize(messageWithHeader.getPayload());
                        getImpl().renameFile(data3.oldName, data3.newName, new NativeIoHostRenameFileResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class NativeIoHostRequestCapacityChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long capacityDelta;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostRequestCapacityChangeParams(int version) {
            super(16, version);
        }

        public NativeIoHostRequestCapacityChangeParams() {
            this(0);
        }

        public static NativeIoHostRequestCapacityChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostRequestCapacityChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostRequestCapacityChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostRequestCapacityChangeParams result = new NativeIoHostRequestCapacityChangeParams(elementsOrVersion);
                result.capacityDelta = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.capacityDelta, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NativeIoHostRequestCapacityChangeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long grantedCapacityDelta;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostRequestCapacityChangeResponseParams(int version) {
            super(16, version);
        }

        public NativeIoHostRequestCapacityChangeResponseParams() {
            this(0);
        }

        public static NativeIoHostRequestCapacityChangeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostRequestCapacityChangeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostRequestCapacityChangeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostRequestCapacityChangeResponseParams result = new NativeIoHostRequestCapacityChangeResponseParams(elementsOrVersion);
                result.grantedCapacityDelta = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.grantedCapacityDelta, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostRequestCapacityChangeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NativeIoHost.RequestCapacityChangeResponse mCallback;

        NativeIoHostRequestCapacityChangeResponseParamsForwardToCallback(NativeIoHost.RequestCapacityChangeResponse callback) {
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
                NativeIoHostRequestCapacityChangeResponseParams response = NativeIoHostRequestCapacityChangeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Long.valueOf(response.grantedCapacityDelta));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostRequestCapacityChangeResponseParamsProxyToResponder implements NativeIoHost.RequestCapacityChangeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NativeIoHostRequestCapacityChangeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Long grantedCapacityDelta) {
            NativeIoHostRequestCapacityChangeResponseParams _response = new NativeIoHostRequestCapacityChangeResponseParams();
            _response.grantedCapacityDelta = grantedCapacityDelta.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NativeIoHostOpenFileParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NativeIoFileHost> fileHostReceiver;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostOpenFileParams(int version) {
            super(24, version);
        }

        public NativeIoHostOpenFileParams() {
            this(0);
        }

        public static NativeIoHostOpenFileParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostOpenFileParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostOpenFileParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostOpenFileParams result = new NativeIoHostOpenFileParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                result.fileHostReceiver = decoder0.readInterfaceRequest(16, false);
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
            encoder0.encode((InterfaceRequest) this.fileHostReceiver, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NativeIoHostOpenFileResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public org.chromium.mojo_base.mojom.File backingFile;
        public long backingFileSize;
        public NativeIoError openError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostOpenFileResponseParams(int version) {
            super(32, version);
        }

        public NativeIoHostOpenFileResponseParams() {
            this(0);
        }

        public static NativeIoHostOpenFileResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostOpenFileResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostOpenFileResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostOpenFileResponseParams result = new NativeIoHostOpenFileResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.backingFile = org.chromium.mojo_base.mojom.File.decode(decoder1);
                result.backingFileSize = decoder0.readLong(16);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.openError = NativeIoError.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.backingFile, 8, true);
            encoder0.encode(this.backingFileSize, 16);
            encoder0.encode((Struct) this.openError, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostOpenFileResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NativeIoHost.OpenFileResponse mCallback;

        NativeIoHostOpenFileResponseParamsForwardToCallback(NativeIoHost.OpenFileResponse callback) {
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
                NativeIoHostOpenFileResponseParams response = NativeIoHostOpenFileResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.backingFile, Long.valueOf(response.backingFileSize), response.openError);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostOpenFileResponseParamsProxyToResponder implements NativeIoHost.OpenFileResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NativeIoHostOpenFileResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(org.chromium.mojo_base.mojom.File backingFile, Long backingFileSize, NativeIoError openError) {
            NativeIoHostOpenFileResponseParams _response = new NativeIoHostOpenFileResponseParams();
            _response.backingFile = backingFile;
            _response.backingFileSize = backingFileSize.longValue();
            _response.openError = openError;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NativeIoHostDeleteFileParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostDeleteFileParams(int version) {
            super(16, version);
        }

        public NativeIoHostDeleteFileParams() {
            this(0);
        }

        public static NativeIoHostDeleteFileParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostDeleteFileParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostDeleteFileParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostDeleteFileParams result = new NativeIoHostDeleteFileParams(elementsOrVersion);
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
    public static final class NativeIoHostDeleteFileResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public NativeIoError deleteError;
        public long grantedCapacityDelta;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostDeleteFileResponseParams(int version) {
            super(24, version);
        }

        public NativeIoHostDeleteFileResponseParams() {
            this(0);
        }

        public static NativeIoHostDeleteFileResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostDeleteFileResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostDeleteFileResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostDeleteFileResponseParams result = new NativeIoHostDeleteFileResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.deleteError = NativeIoError.decode(decoder1);
                result.grantedCapacityDelta = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.deleteError, 8, false);
            encoder0.encode(this.grantedCapacityDelta, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostDeleteFileResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NativeIoHost.DeleteFileResponse mCallback;

        NativeIoHostDeleteFileResponseParamsForwardToCallback(NativeIoHost.DeleteFileResponse callback) {
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
                NativeIoHostDeleteFileResponseParams response = NativeIoHostDeleteFileResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.deleteError, Long.valueOf(response.grantedCapacityDelta));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostDeleteFileResponseParamsProxyToResponder implements NativeIoHost.DeleteFileResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NativeIoHostDeleteFileResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(NativeIoError deleteError, Long grantedCapacityDelta) {
            NativeIoHostDeleteFileResponseParams _response = new NativeIoHostDeleteFileResponseParams();
            _response.deleteError = deleteError;
            _response.grantedCapacityDelta = grantedCapacityDelta.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NativeIoHostGetAllFileNamesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostGetAllFileNamesParams(int version) {
            super(8, version);
        }

        public NativeIoHostGetAllFileNamesParams() {
            this(0);
        }

        public static NativeIoHostGetAllFileNamesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostGetAllFileNamesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostGetAllFileNamesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostGetAllFileNamesParams result = new NativeIoHostGetAllFileNamesParams(elementsOrVersion);
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
    public static final class NativeIoHostGetAllFileNamesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] names;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostGetAllFileNamesResponseParams(int version) {
            super(24, version);
        }

        public NativeIoHostGetAllFileNamesResponseParams() {
            this(0);
        }

        public static NativeIoHostGetAllFileNamesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostGetAllFileNamesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostGetAllFileNamesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostGetAllFileNamesResponseParams result = new NativeIoHostGetAllFileNamesResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.names = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.names[i1] = decoder1.readString((i1 * 8) + 8, false);
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
            encoder0.encode(this.success, 8, 0);
            String[] strArr = this.names;
            if (strArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.names;
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
    static class NativeIoHostGetAllFileNamesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NativeIoHost.GetAllFileNamesResponse mCallback;

        NativeIoHostGetAllFileNamesResponseParamsForwardToCallback(NativeIoHost.GetAllFileNamesResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 6)) {
                    return false;
                }
                NativeIoHostGetAllFileNamesResponseParams response = NativeIoHostGetAllFileNamesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.names);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostGetAllFileNamesResponseParamsProxyToResponder implements NativeIoHost.GetAllFileNamesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NativeIoHostGetAllFileNamesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean success, String[] names) {
            NativeIoHostGetAllFileNamesResponseParams _response = new NativeIoHostGetAllFileNamesResponseParams();
            _response.success = success.booleanValue();
            _response.names = names;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NativeIoHostRenameFileParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String newName;
        public String oldName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostRenameFileParams(int version) {
            super(24, version);
        }

        public NativeIoHostRenameFileParams() {
            this(0);
        }

        public static NativeIoHostRenameFileParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostRenameFileParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostRenameFileParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostRenameFileParams result = new NativeIoHostRenameFileParams(elementsOrVersion);
                result.oldName = decoder0.readString(8, false);
                result.newName = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.oldName, 8, false);
            encoder0.encode(this.newName, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NativeIoHostRenameFileResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public NativeIoError renameError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NativeIoHostRenameFileResponseParams(int version) {
            super(16, version);
        }

        public NativeIoHostRenameFileResponseParams() {
            this(0);
        }

        public static NativeIoHostRenameFileResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NativeIoHostRenameFileResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NativeIoHostRenameFileResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NativeIoHostRenameFileResponseParams result = new NativeIoHostRenameFileResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.renameError = NativeIoError.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.renameError, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostRenameFileResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NativeIoHost.RenameFileResponse mCallback;

        NativeIoHostRenameFileResponseParamsForwardToCallback(NativeIoHost.RenameFileResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 6)) {
                    return false;
                }
                NativeIoHostRenameFileResponseParams response = NativeIoHostRenameFileResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.renameError);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NativeIoHostRenameFileResponseParamsProxyToResponder implements NativeIoHost.RenameFileResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NativeIoHostRenameFileResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(NativeIoError renameError) {
            NativeIoHostRenameFileResponseParams _response = new NativeIoHostRenameFileResponseParams();
            _response.renameError = renameError;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
