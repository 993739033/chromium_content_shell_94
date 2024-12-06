package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.mojo_base.mojom.FilePath;
import org.chromium.mojo_base.mojom.ReadOnlyFile;
import org.chromium.network.mojom.NetworkContextClient;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class NetworkContextClient_Internal {
    public static final Interface.Manager<NetworkContextClient, NetworkContextClient.Proxy> MANAGER = new Interface.Manager<NetworkContextClient, NetworkContextClient.Proxy>() { // from class: org.chromium.network.mojom.NetworkContextClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.NetworkContextClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkContextClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NetworkContextClient impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkContextClient[] buildArray(int size) {
            return new NetworkContextClient[size];
        }
    };
    private static final int ON_CAN_SEND_DOMAIN_RELIABILITY_UPLOAD_ORDINAL = 2;
    private static final int ON_CAN_SEND_REPORTING_REPORTS_ORDINAL = 1;
    private static final int ON_FILE_UPLOAD_REQUESTED_ORDINAL = 0;
    private static final int ON_GENERATE_HTTP_NEGOTIATE_AUTH_TOKEN_ORDINAL = 3;
    private static final int ON_TRUST_TOKEN_ISSUANCE_DIVERTED_TO_SYSTEM_ORDINAL = 4;

    NetworkContextClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NetworkContextClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.NetworkContextClient
        public void onFileUploadRequested(int processId, boolean async, FilePath[] filePaths, OnFileUploadRequestedResponse callback) {
            NetworkContextClientOnFileUploadRequestedParams _message = new NetworkContextClientOnFileUploadRequestedParams();
            _message.processId = processId;
            _message.async = async;
            _message.filePaths = filePaths;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new NetworkContextClientOnFileUploadRequestedResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContextClient
        public void onCanSendReportingReports(Origin[] origins, OnCanSendReportingReportsResponse callback) {
            NetworkContextClientOnCanSendReportingReportsParams _message = new NetworkContextClientOnCanSendReportingReportsParams();
            _message.origins = origins;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new NetworkContextClientOnCanSendReportingReportsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContextClient
        public void onCanSendDomainReliabilityUpload(Url origin, OnCanSendDomainReliabilityUploadResponse callback) {
            NetworkContextClientOnCanSendDomainReliabilityUploadParams _message = new NetworkContextClientOnCanSendDomainReliabilityUploadParams();
            _message.origin = origin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContextClient
        public void onGenerateHttpNegotiateAuthToken(String serverAuthToken, boolean canDelegate, String authNegotiateAndroidAccountType, String spn, OnGenerateHttpNegotiateAuthTokenResponse callback) {
            NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams _message = new NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams();
            _message.serverAuthToken = serverAuthToken;
            _message.canDelegate = canDelegate;
            _message.authNegotiateAndroidAccountType = authNegotiateAndroidAccountType;
            _message.spn = spn;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContextClient
        public void onTrustTokenIssuanceDivertedToSystem(FulfillTrustTokenIssuanceRequest request, OnTrustTokenIssuanceDivertedToSystemResponse callback) {
            NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams _message = new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams();
            _message.request = request;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NetworkContextClient> {
        Stub(Core core, NetworkContextClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NetworkContextClient_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NetworkContextClient_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        NetworkContextClientOnFileUploadRequestedParams data = NetworkContextClientOnFileUploadRequestedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onFileUploadRequested(data.processId, data.async, data.filePaths, new NetworkContextClientOnFileUploadRequestedResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        getImpl().onCanSendReportingReports(NetworkContextClientOnCanSendReportingReportsParams.deserialize(messageWithHeader.getPayload()).origins, new NetworkContextClientOnCanSendReportingReportsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().onCanSendDomainReliabilityUpload(NetworkContextClientOnCanSendDomainReliabilityUploadParams.deserialize(messageWithHeader.getPayload()).origin, new NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams data2 = NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onGenerateHttpNegotiateAuthToken(data2.serverAuthToken, data2.canDelegate, data2.authNegotiateAndroidAccountType, data2.spn, new NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        getImpl().onTrustTokenIssuanceDivertedToSystem(NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams.deserialize(messageWithHeader.getPayload()).request, new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class NetworkContextClientOnFileUploadRequestedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean async;
        public FilePath[] filePaths;
        public int processId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnFileUploadRequestedParams(int version) {
            super(24, version);
        }

        public NetworkContextClientOnFileUploadRequestedParams() {
            this(0);
        }

        public static NetworkContextClientOnFileUploadRequestedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnFileUploadRequestedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnFileUploadRequestedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnFileUploadRequestedParams result = new NetworkContextClientOnFileUploadRequestedParams(elementsOrVersion);
                result.processId = decoder0.readInt(8);
                result.async = decoder0.readBoolean(12, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.filePaths = new FilePath[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.filePaths[i1] = FilePath.decode(decoder2);
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
            encoder0.encode(this.processId, 8);
            encoder0.encode(this.async, 12, 0);
            FilePath[] filePathArr = this.filePaths;
            if (filePathArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(filePathArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                FilePath[] filePathArr2 = this.filePaths;
                if (i0 < filePathArr2.length) {
                    encoder1.encode((Struct) filePathArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextClientOnFileUploadRequestedResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyFile[] files;
        public int netError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnFileUploadRequestedResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextClientOnFileUploadRequestedResponseParams() {
            this(0);
        }

        public static NetworkContextClientOnFileUploadRequestedResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnFileUploadRequestedResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnFileUploadRequestedResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnFileUploadRequestedResponseParams result = new NetworkContextClientOnFileUploadRequestedResponseParams(elementsOrVersion);
                result.netError = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.files = new ReadOnlyFile[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.files[i1] = ReadOnlyFile.decode(decoder2);
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
            encoder0.encode(this.netError, 8);
            ReadOnlyFile[] readOnlyFileArr = this.files;
            if (readOnlyFileArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(readOnlyFileArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ReadOnlyFile[] readOnlyFileArr2 = this.files;
                if (i0 < readOnlyFileArr2.length) {
                    encoder1.encode((Struct) readOnlyFileArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnFileUploadRequestedResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContextClient.OnFileUploadRequestedResponse mCallback;

        NetworkContextClientOnFileUploadRequestedResponseParamsForwardToCallback(NetworkContextClient.OnFileUploadRequestedResponse callback) {
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
                NetworkContextClientOnFileUploadRequestedResponseParams response = NetworkContextClientOnFileUploadRequestedResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.netError), response.files);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnFileUploadRequestedResponseParamsProxyToResponder implements NetworkContextClient.OnFileUploadRequestedResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClientOnFileUploadRequestedResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer netError, ReadOnlyFile[] files) {
            NetworkContextClientOnFileUploadRequestedResponseParams _response = new NetworkContextClientOnFileUploadRequestedResponseParams();
            _response.netError = netError.intValue();
            _response.files = files;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClientOnCanSendReportingReportsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin[] origins;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnCanSendReportingReportsParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnCanSendReportingReportsParams() {
            this(0);
        }

        public static NetworkContextClientOnCanSendReportingReportsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnCanSendReportingReportsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnCanSendReportingReportsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnCanSendReportingReportsParams result = new NetworkContextClientOnCanSendReportingReportsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.origins = new Origin[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.origins[i1] = Origin.decode(decoder2);
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
            Origin[] originArr = this.origins;
            if (originArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(originArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                Origin[] originArr2 = this.origins;
                if (i0 < originArr2.length) {
                    encoder1.encode((Struct) originArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextClientOnCanSendReportingReportsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin[] origins;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnCanSendReportingReportsResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnCanSendReportingReportsResponseParams() {
            this(0);
        }

        public static NetworkContextClientOnCanSendReportingReportsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnCanSendReportingReportsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnCanSendReportingReportsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnCanSendReportingReportsResponseParams result = new NetworkContextClientOnCanSendReportingReportsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.origins = new Origin[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.origins[i1] = Origin.decode(decoder2);
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
            Origin[] originArr = this.origins;
            if (originArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(originArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                Origin[] originArr2 = this.origins;
                if (i0 < originArr2.length) {
                    encoder1.encode((Struct) originArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnCanSendReportingReportsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContextClient.OnCanSendReportingReportsResponse mCallback;

        NetworkContextClientOnCanSendReportingReportsResponseParamsForwardToCallback(NetworkContextClient.OnCanSendReportingReportsResponse callback) {
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
                NetworkContextClientOnCanSendReportingReportsResponseParams response = NetworkContextClientOnCanSendReportingReportsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.origins);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnCanSendReportingReportsResponseParamsProxyToResponder implements NetworkContextClient.OnCanSendReportingReportsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClientOnCanSendReportingReportsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Origin[] origins) {
            NetworkContextClientOnCanSendReportingReportsResponseParams _response = new NetworkContextClientOnCanSendReportingReportsResponseParams();
            _response.origins = origins;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClientOnCanSendDomainReliabilityUploadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnCanSendDomainReliabilityUploadParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnCanSendDomainReliabilityUploadParams() {
            this(0);
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnCanSendDomainReliabilityUploadParams result = new NetworkContextClientOnCanSendDomainReliabilityUploadParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Url.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean allowed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams() {
            this(0);
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams result = new NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams(elementsOrVersion);
                result.allowed = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.allowed, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContextClient.OnCanSendDomainReliabilityUploadResponse mCallback;

        NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsForwardToCallback(NetworkContextClient.OnCanSendDomainReliabilityUploadResponse callback) {
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
                NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams response = NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.allowed));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsProxyToResponder implements NetworkContextClient.OnCanSendDomainReliabilityUploadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClientOnCanSendDomainReliabilityUploadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean allowed) {
            NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams _response = new NetworkContextClientOnCanSendDomainReliabilityUploadResponseParams();
            _response.allowed = allowed.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String authNegotiateAndroidAccountType;
        public boolean canDelegate;
        public String serverAuthToken;
        public String spn;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams(int version) {
            super(40, version);
        }

        public NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams() {
            this(0);
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams result = new NetworkContextClientOnGenerateHttpNegotiateAuthTokenParams(elementsOrVersion);
                result.serverAuthToken = decoder0.readString(8, false);
                result.canDelegate = decoder0.readBoolean(16, 0);
                result.authNegotiateAndroidAccountType = decoder0.readString(24, false);
                result.spn = decoder0.readString(32, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serverAuthToken, 8, false);
            encoder0.encode(this.canDelegate, 16, 0);
            encoder0.encode(this.authNegotiateAndroidAccountType, 24, false);
            encoder0.encode(this.spn, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String authToken;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams() {
            this(0);
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams result = new NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
                result.authToken = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
            encoder0.encode(this.authToken, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContextClient.OnGenerateHttpNegotiateAuthTokenResponse mCallback;

        NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsForwardToCallback(NetworkContextClient.OnGenerateHttpNegotiateAuthTokenResponse callback) {
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
                NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams response = NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.authToken);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsProxyToResponder implements NetworkContextClient.OnGenerateHttpNegotiateAuthTokenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer result, String authToken) {
            NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams _response = new NetworkContextClientOnGenerateHttpNegotiateAuthTokenResponseParams();
            _response.result = result.intValue();
            _response.authToken = authToken;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FulfillTrustTokenIssuanceRequest request;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams() {
            this(0);
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams result = new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.request = FulfillTrustTokenIssuanceRequest.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FulfillTrustTokenIssuanceAnswer response;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams() {
            this(0);
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams result = new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.response = FulfillTrustTokenIssuanceAnswer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.response, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContextClient.OnTrustTokenIssuanceDivertedToSystemResponse mCallback;

        NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsForwardToCallback(NetworkContextClient.OnTrustTokenIssuanceDivertedToSystemResponse callback) {
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
                NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams response = NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.response);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsProxyToResponder implements NetworkContextClient.OnTrustTokenIssuanceDivertedToSystemResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(FulfillTrustTokenIssuanceAnswer response) {
            NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams _response = new NetworkContextClientOnTrustTokenIssuanceDivertedToSystemResponseParams();
            _response.response = response;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
