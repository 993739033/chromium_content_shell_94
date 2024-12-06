package org.chromium.filesystem.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.filesystem.mojom.File;
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
import org.chromium.mojo_base.mojom.FileError;
/* loaded from: classes2.dex */
class File_Internal {
    private static final int AS_HANDLE_ORDINAL = 12;
    private static final int CLOSE_ORDINAL = 0;
    private static final int DUP_ORDINAL = 8;
    private static final int FLUSH_ORDINAL = 9;
    private static final int LOCK_ORDINAL = 10;
    public static final Interface.Manager<File, File.Proxy> MANAGER = new Interface.Manager<File, File.Proxy>() { // from class: org.chromium.filesystem.mojom.File_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "filesystem.mojom.File";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public File.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, File impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public File[] buildArray(int size) {
            return new File[size];
        }
    };
    private static final int READ_ORDINAL = 1;
    private static final int SEEK_ORDINAL = 4;
    private static final int STAT_ORDINAL = 5;
    private static final int TELL_ORDINAL = 3;
    private static final int TOUCH_ORDINAL = 7;
    private static final int TRUNCATE_ORDINAL = 6;
    private static final int UNLOCK_ORDINAL = 11;
    private static final int WRITE_ORDINAL = 2;

    File_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements File.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.filesystem.mojom.File
        public void close(CloseResponse callback) {
            FileCloseParams _message = new FileCloseParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new FileCloseResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void read(int numBytesToRead, long offset, int whence, ReadResponse callback) {
            FileReadParams _message = new FileReadParams();
            _message.numBytesToRead = numBytesToRead;
            _message.offset = offset;
            _message.whence = whence;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new FileReadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void write(byte[] bytesToWrite, long offset, int whence, WriteResponse callback) {
            FileWriteParams _message = new FileWriteParams();
            _message.bytesToWrite = bytesToWrite;
            _message.offset = offset;
            _message.whence = whence;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new FileWriteResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void tell(TellResponse callback) {
            FileTellParams _message = new FileTellParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new FileTellResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void seek(long offset, int whence, SeekResponse callback) {
            FileSeekParams _message = new FileSeekParams();
            _message.offset = offset;
            _message.whence = whence;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new FileSeekResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void stat(StatResponse callback) {
            FileStatParams _message = new FileStatParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new FileStatResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void truncate(long size, TruncateResponse callback) {
            FileTruncateParams _message = new FileTruncateParams();
            _message.size = size;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new FileTruncateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void touch(TimespecOrNow atime, TimespecOrNow mtime, TouchResponse callback) {
            FileTouchParams _message = new FileTouchParams();
            _message.atime = atime;
            _message.mtime = mtime;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new FileTouchResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void dup(InterfaceRequest<File> file, DupResponse callback) {
            FileDupParams _message = new FileDupParams();
            _message.file = file;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new FileDupResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void flush(FlushResponse callback) {
            FileFlushParams _message = new FileFlushParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9, 1, 0L)), new FileFlushResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void lock(LockResponse callback) {
            FileLockParams _message = new FileLockParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10, 1, 0L)), new FileLockResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void unlock(UnlockResponse callback) {
            FileUnlockParams _message = new FileUnlockParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11, 1, 0L)), new FileUnlockResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.filesystem.mojom.File
        public void asHandle(AsHandleResponse callback) {
            FileAsHandleParams _message = new FileAsHandleParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12, 1, 0L)), new FileAsHandleResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<File> {
        Stub(Core core, File impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(File_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), File_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        FileCloseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().close(new FileCloseResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        FileReadParams data = FileReadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().read(data.numBytesToRead, data.offset, data.whence, new FileReadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        FileWriteParams data2 = FileWriteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().write(data2.bytesToWrite, data2.offset, data2.whence, new FileWriteResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        FileTellParams.deserialize(messageWithHeader.getPayload());
                        getImpl().tell(new FileTellResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        FileSeekParams data3 = FileSeekParams.deserialize(messageWithHeader.getPayload());
                        getImpl().seek(data3.offset, data3.whence, new FileSeekResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        FileStatParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stat(new FileStatResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        getImpl().truncate(FileTruncateParams.deserialize(messageWithHeader.getPayload()).size, new FileTruncateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        FileTouchParams data4 = FileTouchParams.deserialize(messageWithHeader.getPayload());
                        getImpl().touch(data4.atime, data4.mtime, new FileTouchResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        getImpl().dup(FileDupParams.deserialize(messageWithHeader.getPayload()).file, new FileDupResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 9:
                        FileFlushParams.deserialize(messageWithHeader.getPayload());
                        getImpl().flush(new FileFlushResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 10:
                        FileLockParams.deserialize(messageWithHeader.getPayload());
                        getImpl().lock(new FileLockResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 11:
                        FileUnlockParams.deserialize(messageWithHeader.getPayload());
                        getImpl().unlock(new FileUnlockResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 12:
                        FileAsHandleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().asHandle(new FileAsHandleResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class FileCloseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileCloseParams(int version) {
            super(8, version);
        }

        public FileCloseParams() {
            this(0);
        }

        public static FileCloseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileCloseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileCloseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileCloseParams result = new FileCloseParams(elementsOrVersion);
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
    public static final class FileCloseResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int err;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileCloseResponseParams(int version) {
            super(16, version);
        }

        public FileCloseResponseParams() {
            this(0);
        }

        public static FileCloseResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileCloseResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileCloseResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileCloseResponseParams result = new FileCloseResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.err = readInt;
                FileError.validate(readInt);
                result.err = FileError.toKnownValue(result.err);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.err, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileCloseResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.CloseResponse mCallback;

        FileCloseResponseParamsForwardToCallback(File.CloseResponse callback) {
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
                FileCloseResponseParams response = FileCloseResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.err));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileCloseResponseParamsProxyToResponder implements File.CloseResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileCloseResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer err) {
            FileCloseResponseParams _response = new FileCloseResponseParams();
            _response.err = err.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileReadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int numBytesToRead;
        public long offset;
        public int whence;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileReadParams(int version) {
            super(24, version);
        }

        public FileReadParams() {
            this(0);
        }

        public static FileReadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileReadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileReadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileReadParams result = new FileReadParams(elementsOrVersion);
                result.numBytesToRead = decoder0.readInt(8);
                int readInt = decoder0.readInt(12);
                result.whence = readInt;
                Whence.validate(readInt);
                result.whence = Whence.toKnownValue(result.whence);
                result.offset = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.numBytesToRead, 8);
            encoder0.encode(this.whence, 12);
            encoder0.encode(this.offset, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileReadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] bytesRead;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileReadResponseParams(int version) {
            super(24, version);
        }

        public FileReadResponseParams() {
            this(0);
        }

        public static FileReadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileReadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileReadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileReadResponseParams result = new FileReadResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                result.bytesRead = decoder0.readBytes(16, 1, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.bytesRead, 16, 1, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class FileReadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.ReadResponse mCallback;

        FileReadResponseParamsForwardToCallback(File.ReadResponse callback) {
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
                FileReadResponseParams response = FileReadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.bytesRead);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileReadResponseParamsProxyToResponder implements File.ReadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileReadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, byte[] bytesRead) {
            FileReadResponseParams _response = new FileReadResponseParams();
            _response.error = error.intValue();
            _response.bytesRead = bytesRead;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileWriteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] bytesToWrite;
        public long offset;
        public int whence;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileWriteParams(int version) {
            super(32, version);
        }

        public FileWriteParams() {
            this(0);
        }

        public static FileWriteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileWriteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileWriteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileWriteParams result = new FileWriteParams(elementsOrVersion);
                result.bytesToWrite = decoder0.readBytes(8, 0, -1);
                result.offset = decoder0.readLong(16);
                int readInt = decoder0.readInt(24);
                result.whence = readInt;
                Whence.validate(readInt);
                result.whence = Whence.toKnownValue(result.whence);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.bytesToWrite, 8, 0, -1);
            encoder0.encode(this.offset, 16);
            encoder0.encode(this.whence, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileWriteResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public int numBytesWritten;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileWriteResponseParams(int version) {
            super(16, version);
        }

        public FileWriteResponseParams() {
            this(0);
        }

        public static FileWriteResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileWriteResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileWriteResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileWriteResponseParams result = new FileWriteResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                result.numBytesWritten = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.numBytesWritten, 12);
        }
    }

    /* loaded from: classes2.dex */
    static class FileWriteResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.WriteResponse mCallback;

        FileWriteResponseParamsForwardToCallback(File.WriteResponse callback) {
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
                FileWriteResponseParams response = FileWriteResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), Integer.valueOf(response.numBytesWritten));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileWriteResponseParamsProxyToResponder implements File.WriteResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileWriteResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, Integer numBytesWritten) {
            FileWriteResponseParams _response = new FileWriteResponseParams();
            _response.error = error.intValue();
            _response.numBytesWritten = numBytesWritten.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileTellParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTellParams(int version) {
            super(8, version);
        }

        public FileTellParams() {
            this(0);
        }

        public static FileTellParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTellParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTellParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTellParams result = new FileTellParams(elementsOrVersion);
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
    public static final class FileTellResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public long position;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTellResponseParams(int version) {
            super(24, version);
        }

        public FileTellResponseParams() {
            this(0);
        }

        public static FileTellResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTellResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTellResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTellResponseParams result = new FileTellResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                result.position = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.position, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class FileTellResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.TellResponse mCallback;

        FileTellResponseParamsForwardToCallback(File.TellResponse callback) {
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
                FileTellResponseParams response = FileTellResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), Long.valueOf(response.position));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileTellResponseParamsProxyToResponder implements File.TellResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileTellResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, Long position) {
            FileTellResponseParams _response = new FileTellResponseParams();
            _response.error = error.intValue();
            _response.position = position.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileSeekParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public long offset;
        public int whence;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSeekParams(int version) {
            super(24, version);
        }

        public FileSeekParams() {
            this(0);
        }

        public static FileSeekParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSeekParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSeekParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSeekParams result = new FileSeekParams(elementsOrVersion);
                result.offset = decoder0.readLong(8);
                int readInt = decoder0.readInt(16);
                result.whence = readInt;
                Whence.validate(readInt);
                result.whence = Whence.toKnownValue(result.whence);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.offset, 8);
            encoder0.encode(this.whence, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileSeekResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public long position;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileSeekResponseParams(int version) {
            super(24, version);
        }

        public FileSeekResponseParams() {
            this(0);
        }

        public static FileSeekResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileSeekResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileSeekResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileSeekResponseParams result = new FileSeekResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                result.position = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.position, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class FileSeekResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.SeekResponse mCallback;

        FileSeekResponseParamsForwardToCallback(File.SeekResponse callback) {
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
                FileSeekResponseParams response = FileSeekResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), Long.valueOf(response.position));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileSeekResponseParamsProxyToResponder implements File.SeekResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileSeekResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, Long position) {
            FileSeekResponseParams _response = new FileSeekResponseParams();
            _response.error = error.intValue();
            _response.position = position.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileStatParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileStatParams(int version) {
            super(8, version);
        }

        public FileStatParams() {
            this(0);
        }

        public static FileStatParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileStatParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileStatParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileStatParams result = new FileStatParams(elementsOrVersion);
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
    public static final class FileStatResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public FileInformation fileInformation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileStatResponseParams(int version) {
            super(24, version);
        }

        public FileStatResponseParams() {
            this(0);
        }

        public static FileStatResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileStatResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileStatResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileStatResponseParams result = new FileStatResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.fileInformation = FileInformation.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode((Struct) this.fileInformation, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class FileStatResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.StatResponse mCallback;

        FileStatResponseParamsForwardToCallback(File.StatResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 6)) {
                    return false;
                }
                FileStatResponseParams response = FileStatResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.fileInformation);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileStatResponseParamsProxyToResponder implements File.StatResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileStatResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, FileInformation fileInformation) {
            FileStatResponseParams _response = new FileStatResponseParams();
            _response.error = error.intValue();
            _response.fileInformation = fileInformation;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileTruncateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long size;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTruncateParams(int version) {
            super(16, version);
        }

        public FileTruncateParams() {
            this(0);
        }

        public static FileTruncateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTruncateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTruncateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTruncateParams result = new FileTruncateParams(elementsOrVersion);
                result.size = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.size, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileTruncateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTruncateResponseParams(int version) {
            super(16, version);
        }

        public FileTruncateResponseParams() {
            this(0);
        }

        public static FileTruncateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTruncateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTruncateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTruncateResponseParams result = new FileTruncateResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileTruncateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.TruncateResponse mCallback;

        FileTruncateResponseParamsForwardToCallback(File.TruncateResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 6)) {
                    return false;
                }
                FileTruncateResponseParams response = FileTruncateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileTruncateResponseParamsProxyToResponder implements File.TruncateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileTruncateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileTruncateResponseParams _response = new FileTruncateResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileTouchParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public TimespecOrNow atime;
        public TimespecOrNow mtime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTouchParams(int version) {
            super(24, version);
        }

        public FileTouchParams() {
            this(0);
        }

        public static FileTouchParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTouchParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTouchParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTouchParams result = new FileTouchParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.atime = TimespecOrNow.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, true);
                result.mtime = TimespecOrNow.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.atime, 8, true);
            encoder0.encode((Struct) this.mtime, 16, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileTouchResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileTouchResponseParams(int version) {
            super(16, version);
        }

        public FileTouchResponseParams() {
            this(0);
        }

        public static FileTouchResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileTouchResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileTouchResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileTouchResponseParams result = new FileTouchResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileTouchResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.TouchResponse mCallback;

        FileTouchResponseParamsForwardToCallback(File.TouchResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 6)) {
                    return false;
                }
                FileTouchResponseParams response = FileTouchResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileTouchResponseParamsProxyToResponder implements File.TouchResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileTouchResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileTouchResponseParams _response = new FileTouchResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileDupParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<File> file;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileDupParams(int version) {
            super(16, version);
        }

        public FileDupParams() {
            this(0);
        }

        public static FileDupParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileDupParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileDupParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileDupParams result = new FileDupParams(elementsOrVersion);
                result.file = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.file, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FileDupResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileDupResponseParams(int version) {
            super(16, version);
        }

        public FileDupResponseParams() {
            this(0);
        }

        public static FileDupResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileDupResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileDupResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileDupResponseParams result = new FileDupResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileDupResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.DupResponse mCallback;

        FileDupResponseParamsForwardToCallback(File.DupResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 6)) {
                    return false;
                }
                FileDupResponseParams response = FileDupResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileDupResponseParamsProxyToResponder implements File.DupResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileDupResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileDupResponseParams _response = new FileDupResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileFlushParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileFlushParams(int version) {
            super(8, version);
        }

        public FileFlushParams() {
            this(0);
        }

        public static FileFlushParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileFlushParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileFlushParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileFlushParams result = new FileFlushParams(elementsOrVersion);
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
    public static final class FileFlushResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileFlushResponseParams(int version) {
            super(16, version);
        }

        public FileFlushResponseParams() {
            this(0);
        }

        public static FileFlushResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileFlushResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileFlushResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileFlushResponseParams result = new FileFlushResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileFlushResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.FlushResponse mCallback;

        FileFlushResponseParamsForwardToCallback(File.FlushResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(9, 6)) {
                    return false;
                }
                FileFlushResponseParams response = FileFlushResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileFlushResponseParamsProxyToResponder implements File.FlushResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileFlushResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileFlushResponseParams _response = new FileFlushResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(9, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileLockParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileLockParams(int version) {
            super(8, version);
        }

        public FileLockParams() {
            this(0);
        }

        public static FileLockParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileLockParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileLockParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileLockParams result = new FileLockParams(elementsOrVersion);
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
    public static final class FileLockResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileLockResponseParams(int version) {
            super(16, version);
        }

        public FileLockResponseParams() {
            this(0);
        }

        public static FileLockResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileLockResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileLockResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileLockResponseParams result = new FileLockResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileLockResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.LockResponse mCallback;

        FileLockResponseParamsForwardToCallback(File.LockResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(10, 6)) {
                    return false;
                }
                FileLockResponseParams response = FileLockResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileLockResponseParamsProxyToResponder implements File.LockResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileLockResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileLockResponseParams _response = new FileLockResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(10, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileUnlockParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileUnlockParams(int version) {
            super(8, version);
        }

        public FileUnlockParams() {
            this(0);
        }

        public static FileUnlockParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileUnlockParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileUnlockParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileUnlockParams result = new FileUnlockParams(elementsOrVersion);
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
    public static final class FileUnlockResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileUnlockResponseParams(int version) {
            super(16, version);
        }

        public FileUnlockResponseParams() {
            this(0);
        }

        public static FileUnlockResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileUnlockResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileUnlockResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileUnlockResponseParams result = new FileUnlockResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FileUnlockResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.UnlockResponse mCallback;

        FileUnlockResponseParamsForwardToCallback(File.UnlockResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(11, 6)) {
                    return false;
                }
                FileUnlockResponseParams response = FileUnlockResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileUnlockResponseParamsProxyToResponder implements File.UnlockResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileUnlockResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            FileUnlockResponseParams _response = new FileUnlockResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(11, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FileAsHandleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileAsHandleParams(int version) {
            super(8, version);
        }

        public FileAsHandleParams() {
            this(0);
        }

        public static FileAsHandleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileAsHandleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileAsHandleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileAsHandleParams result = new FileAsHandleParams(elementsOrVersion);
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
    public static final class FileAsHandleResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public org.chromium.mojo_base.mojom.File fileHandle;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FileAsHandleResponseParams(int version) {
            super(24, version);
        }

        public FileAsHandleResponseParams() {
            this(0);
        }

        public static FileAsHandleResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FileAsHandleResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FileAsHandleResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FileAsHandleResponseParams result = new FileAsHandleResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                FileError.validate(readInt);
                result.error = FileError.toKnownValue(result.error);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.fileHandle = org.chromium.mojo_base.mojom.File.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode((Struct) this.fileHandle, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class FileAsHandleResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final File.AsHandleResponse mCallback;

        FileAsHandleResponseParamsForwardToCallback(File.AsHandleResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(12, 6)) {
                    return false;
                }
                FileAsHandleResponseParams response = FileAsHandleResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.fileHandle);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FileAsHandleResponseParamsProxyToResponder implements File.AsHandleResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FileAsHandleResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, org.chromium.mojo_base.mojom.File fileHandle) {
            FileAsHandleResponseParams _response = new FileAsHandleResponseParams();
            _response.error = error.intValue();
            _response.fileHandle = fileHandle;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(12, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
