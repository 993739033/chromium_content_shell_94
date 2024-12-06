package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.AppCacheFrontend;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.network.mojom.UrlLoaderFactory;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class AppCacheFrontend_Internal {
    private static final int CACHE_SELECTED_ORDINAL = 0;
    private static final int ERROR_EVENT_RAISED_ORDINAL = 3;
    private static final int EVENT_RAISED_ORDINAL = 1;
    private static final int LOG_MESSAGE_ORDINAL = 4;
    public static final Interface.Manager<AppCacheFrontend, AppCacheFrontend.Proxy> MANAGER = new Interface.Manager<AppCacheFrontend, AppCacheFrontend.Proxy>() { // from class: org.chromium.blink.mojom.AppCacheFrontend_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.AppCacheFrontend";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AppCacheFrontend.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AppCacheFrontend impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AppCacheFrontend[] buildArray(int size) {
            return new AppCacheFrontend[size];
        }
    };
    private static final int PROGRESS_EVENT_RAISED_ORDINAL = 2;
    private static final int SET_SUBRESOURCE_FACTORY_ORDINAL = 5;

    AppCacheFrontend_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AppCacheFrontend.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void cacheSelected(AppCacheInfo info) {
            AppCacheFrontendCacheSelectedParams _message = new AppCacheFrontendCacheSelectedParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void eventRaised(int eventId) {
            AppCacheFrontendEventRaisedParams _message = new AppCacheFrontendEventRaisedParams();
            _message.eventId = eventId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void progressEventRaised(Url url, int total, int complete) {
            AppCacheFrontendProgressEventRaisedParams _message = new AppCacheFrontendProgressEventRaisedParams();
            _message.url = url;
            _message.total = total;
            _message.complete = complete;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void errorEventRaised(AppCacheErrorDetails errorDetails) {
            AppCacheFrontendErrorEventRaisedParams _message = new AppCacheFrontendErrorEventRaisedParams();
            _message.errorDetails = errorDetails;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void logMessage(int logLevel, String message) {
            AppCacheFrontendLogMessageParams _message = new AppCacheFrontendLogMessageParams();
            _message.logLevel = logLevel;
            _message.message = message;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.AppCacheFrontend
        public void setSubresourceFactory(UrlLoaderFactory urlLoaderFactory) {
            AppCacheFrontendSetSubresourceFactoryParams _message = new AppCacheFrontendSetSubresourceFactoryParams();
            _message.urlLoaderFactory = urlLoaderFactory;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AppCacheFrontend> {
        Stub(Core core, AppCacheFrontend impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AppCacheFrontend_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        AppCacheFrontendCacheSelectedParams data = AppCacheFrontendCacheSelectedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().cacheSelected(data.info);
                        return true;
                    case 1:
                        AppCacheFrontendEventRaisedParams data2 = AppCacheFrontendEventRaisedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().eventRaised(data2.eventId);
                        return true;
                    case 2:
                        AppCacheFrontendProgressEventRaisedParams data3 = AppCacheFrontendProgressEventRaisedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().progressEventRaised(data3.url, data3.total, data3.complete);
                        return true;
                    case 3:
                        AppCacheFrontendErrorEventRaisedParams data4 = AppCacheFrontendErrorEventRaisedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().errorEventRaised(data4.errorDetails);
                        return true;
                    case 4:
                        AppCacheFrontendLogMessageParams data5 = AppCacheFrontendLogMessageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().logMessage(data5.logLevel, data5.message);
                        return true;
                    case 5:
                        AppCacheFrontendSetSubresourceFactoryParams data6 = AppCacheFrontendSetSubresourceFactoryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSubresourceFactory(data6.urlLoaderFactory);
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AppCacheFrontend_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class AppCacheFrontendCacheSelectedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AppCacheInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendCacheSelectedParams(int version) {
            super(16, version);
        }

        public AppCacheFrontendCacheSelectedParams() {
            this(0);
        }

        public static AppCacheFrontendCacheSelectedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendCacheSelectedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendCacheSelectedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendCacheSelectedParams result = new AppCacheFrontendCacheSelectedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = AppCacheInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheFrontendEventRaisedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int eventId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendEventRaisedParams(int version) {
            super(16, version);
        }

        public AppCacheFrontendEventRaisedParams() {
            this(0);
        }

        public static AppCacheFrontendEventRaisedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendEventRaisedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendEventRaisedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendEventRaisedParams result = new AppCacheFrontendEventRaisedParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.eventId = readInt;
                AppCacheEventId.validate(readInt);
                result.eventId = AppCacheEventId.toKnownValue(result.eventId);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.eventId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheFrontendProgressEventRaisedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int complete;
        public int total;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendProgressEventRaisedParams(int version) {
            super(24, version);
        }

        public AppCacheFrontendProgressEventRaisedParams() {
            this(0);
        }

        public static AppCacheFrontendProgressEventRaisedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendProgressEventRaisedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendProgressEventRaisedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendProgressEventRaisedParams result = new AppCacheFrontendProgressEventRaisedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.total = decoder0.readInt(16);
                result.complete = decoder0.readInt(20);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.url, 8, false);
            encoder0.encode(this.total, 16);
            encoder0.encode(this.complete, 20);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheFrontendErrorEventRaisedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AppCacheErrorDetails errorDetails;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendErrorEventRaisedParams(int version) {
            super(16, version);
        }

        public AppCacheFrontendErrorEventRaisedParams() {
            this(0);
        }

        public static AppCacheFrontendErrorEventRaisedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendErrorEventRaisedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendErrorEventRaisedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendErrorEventRaisedParams result = new AppCacheFrontendErrorEventRaisedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.errorDetails = AppCacheErrorDetails.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.errorDetails, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheFrontendLogMessageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int logLevel;
        public String message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendLogMessageParams(int version) {
            super(24, version);
        }

        public AppCacheFrontendLogMessageParams() {
            this(0);
        }

        public static AppCacheFrontendLogMessageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendLogMessageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendLogMessageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendLogMessageParams result = new AppCacheFrontendLogMessageParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.logLevel = readInt;
                ConsoleMessageLevel.validate(readInt);
                result.logLevel = ConsoleMessageLevel.toKnownValue(result.logLevel);
                result.message = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.logLevel, 8);
            encoder0.encode(this.message, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheFrontendSetSubresourceFactoryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UrlLoaderFactory urlLoaderFactory;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheFrontendSetSubresourceFactoryParams(int version) {
            super(16, version);
        }

        public AppCacheFrontendSetSubresourceFactoryParams() {
            this(0);
        }

        public static AppCacheFrontendSetSubresourceFactoryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheFrontendSetSubresourceFactoryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheFrontendSetSubresourceFactoryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheFrontendSetSubresourceFactoryParams result = new AppCacheFrontendSetSubresourceFactoryParams(elementsOrVersion);
                result.urlLoaderFactory = (UrlLoaderFactory) decoder0.readServiceInterface(8, false, UrlLoaderFactory.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.urlLoaderFactory, 8, false,  UrlLoaderFactory.MANAGER);
        }
    }
}
