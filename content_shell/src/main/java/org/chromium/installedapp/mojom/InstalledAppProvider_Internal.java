package org.chromium.installedapp.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.installedapp.mojom.InstalledAppProvider;
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
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class InstalledAppProvider_Internal {
    private static final int FILTER_INSTALLED_APPS_ORDINAL = 0;
    public static final Interface.Manager<InstalledAppProvider, InstalledAppProvider.Proxy> MANAGER = new Interface.Manager<InstalledAppProvider, InstalledAppProvider.Proxy>() { // from class: org.chromium.installedapp.mojom.InstalledAppProvider_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.InstalledAppProvider";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public InstalledAppProvider.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, InstalledAppProvider impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public InstalledAppProvider[] buildArray(int size) {
            return new InstalledAppProvider[size];
        }
    };

    InstalledAppProvider_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements InstalledAppProvider.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.installedapp.mojom.InstalledAppProvider
        public void filterInstalledApps(RelatedApplication[] relatedApps, Url manifestUrl, FilterInstalledAppsResponse callback) {
            InstalledAppProviderFilterInstalledAppsParams _message = new InstalledAppProviderFilterInstalledAppsParams();
            _message.relatedApps = relatedApps;
            _message.manifestUrl = manifestUrl;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new InstalledAppProviderFilterInstalledAppsResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<InstalledAppProvider> {
        Stub(Core core, InstalledAppProvider impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(InstalledAppProvider_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), InstalledAppProvider_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        InstalledAppProviderFilterInstalledAppsParams data = InstalledAppProviderFilterInstalledAppsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().filterInstalledApps(data.relatedApps, data.manifestUrl, new InstalledAppProviderFilterInstalledAppsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class InstalledAppProviderFilterInstalledAppsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Url manifestUrl;
        public RelatedApplication[] relatedApps;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InstalledAppProviderFilterInstalledAppsParams(int version) {
            super(24, version);
        }

        public InstalledAppProviderFilterInstalledAppsParams() {
            this(0);
        }

        public static InstalledAppProviderFilterInstalledAppsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InstalledAppProviderFilterInstalledAppsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InstalledAppProviderFilterInstalledAppsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InstalledAppProviderFilterInstalledAppsParams result = new InstalledAppProviderFilterInstalledAppsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.relatedApps = new RelatedApplication[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.relatedApps[i1] = RelatedApplication.decode(decoder2);
                }
                result.manifestUrl = Url.decode(decoder0.readPointer(16, false));
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            RelatedApplication[] relatedApplicationArr = this.relatedApps;
            if (relatedApplicationArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(relatedApplicationArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    RelatedApplication[] relatedApplicationArr2 = this.relatedApps;
                    if (i0 >= relatedApplicationArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) relatedApplicationArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode((Struct) this.manifestUrl, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class InstalledAppProviderFilterInstalledAppsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public RelatedApplication[] installedApps;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InstalledAppProviderFilterInstalledAppsResponseParams(int version) {
            super(16, version);
        }

        public InstalledAppProviderFilterInstalledAppsResponseParams() {
            this(0);
        }

        public static InstalledAppProviderFilterInstalledAppsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InstalledAppProviderFilterInstalledAppsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InstalledAppProviderFilterInstalledAppsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InstalledAppProviderFilterInstalledAppsResponseParams result = new InstalledAppProviderFilterInstalledAppsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.installedApps = new RelatedApplication[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.installedApps[i1] = RelatedApplication.decode(decoder2);
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
            RelatedApplication[] relatedApplicationArr = this.installedApps;
            if (relatedApplicationArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(relatedApplicationArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                RelatedApplication[] relatedApplicationArr2 = this.installedApps;
                if (i0 < relatedApplicationArr2.length) {
                    encoder1.encode((Struct) relatedApplicationArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InstalledAppProviderFilterInstalledAppsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final InstalledAppProvider.FilterInstalledAppsResponse mCallback;

        InstalledAppProviderFilterInstalledAppsResponseParamsForwardToCallback(InstalledAppProvider.FilterInstalledAppsResponse callback) {
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
                InstalledAppProviderFilterInstalledAppsResponseParams response = InstalledAppProviderFilterInstalledAppsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.installedApps);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InstalledAppProviderFilterInstalledAppsResponseParamsProxyToResponder implements InstalledAppProvider.FilterInstalledAppsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InstalledAppProviderFilterInstalledAppsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(RelatedApplication[] installedApps) {
            InstalledAppProviderFilterInstalledAppsResponseParams _response = new InstalledAppProviderFilterInstalledAppsResponseParams();
            _response.installedApps = installedApps;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
