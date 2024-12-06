package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.SharedWorkerFactory;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class SharedWorkerFactory_Internal {
    private static final int CREATE_SHARED_WORKER_ORDINAL = 0;
    public static final Interface.Manager<SharedWorkerFactory, SharedWorkerFactory.Proxy> MANAGER = new Interface.Manager<SharedWorkerFactory, SharedWorkerFactory.Proxy>() { // from class: org.chromium.blink.mojom.SharedWorkerFactory_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.SharedWorkerFactory";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public SharedWorkerFactory.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, SharedWorkerFactory impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public SharedWorkerFactory[] buildArray(int size) {
            return new SharedWorkerFactory[size];
        }
    };

    SharedWorkerFactory_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements SharedWorkerFactory.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.SharedWorkerFactory
        public void createSharedWorker(SharedWorkerInfo info, SharedWorkerToken token, Origin constructorOrigin, String userAgent, UserAgentMetadata uaMetadata, boolean pauseOnStart, UnguessableToken devtoolsWorkerToken, RendererPreferences rendererPreferences, InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver, WorkerContentSettingsProxy contentSettings, ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo, UnguessableToken appcacheHostId, WorkerMainScriptLoadParams mainScriptLoadParams, UrlLoaderFactoryBundle subresourceLoaderFactories, ControllerServiceWorkerInfo controllerInfo, SharedWorkerHost host, InterfaceRequest<SharedWorker> sharedWorker, BrowserInterfaceBroker browserInterfaceBroker, long ukmSourceId) {
            SharedWorkerFactoryCreateSharedWorkerParams _message = new SharedWorkerFactoryCreateSharedWorkerParams();
            _message.info = info;
            _message.token = token;
            _message.constructorOrigin = constructorOrigin;
            _message.userAgent = userAgent;
            _message.uaMetadata = uaMetadata;
            _message.pauseOnStart = pauseOnStart;
            _message.devtoolsWorkerToken = devtoolsWorkerToken;
            _message.rendererPreferences = rendererPreferences;
            _message.preferenceWatcherReceiver = preferenceWatcherReceiver;
            _message.contentSettings = contentSettings;
            _message.serviceWorkerContainerInfo = serviceWorkerContainerInfo;
            _message.appcacheHostId = appcacheHostId;
            _message.mainScriptLoadParams = mainScriptLoadParams;
            _message.subresourceLoaderFactories = subresourceLoaderFactories;
            _message.controllerInfo = controllerInfo;
            _message.host = host;
            _message.sharedWorker = sharedWorker;
            _message.browserInterfaceBroker = browserInterfaceBroker;
            _message.ukmSourceId = ukmSourceId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<SharedWorkerFactory> {
        Stub(Core core, SharedWorkerFactory impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(SharedWorkerFactory_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        SharedWorkerFactoryCreateSharedWorkerParams data = SharedWorkerFactoryCreateSharedWorkerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createSharedWorker(data.info, data.token, data.constructorOrigin, data.userAgent, data.uaMetadata, data.pauseOnStart, data.devtoolsWorkerToken, data.rendererPreferences, data.preferenceWatcherReceiver, data.contentSettings, data.serviceWorkerContainerInfo, data.appcacheHostId, data.mainScriptLoadParams, data.subresourceLoaderFactories, data.controllerInfo, data.host, data.sharedWorker, data.browserInterfaceBroker, data.ukmSourceId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), SharedWorkerFactory_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class SharedWorkerFactoryCreateSharedWorkerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 152;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken appcacheHostId;
        public BrowserInterfaceBroker browserInterfaceBroker;
        public Origin constructorOrigin;
        public WorkerContentSettingsProxy contentSettings;
        public ControllerServiceWorkerInfo controllerInfo;
        public UnguessableToken devtoolsWorkerToken;
        public SharedWorkerHost host;
        public SharedWorkerInfo info;
        public WorkerMainScriptLoadParams mainScriptLoadParams;
        public boolean pauseOnStart;
        public InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver;
        public RendererPreferences rendererPreferences;
        public ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo;
        public InterfaceRequest<SharedWorker> sharedWorker;
        public UrlLoaderFactoryBundle subresourceLoaderFactories;
        public SharedWorkerToken token;
        public UserAgentMetadata uaMetadata;
        public long ukmSourceId;
        public String userAgent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(152, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SharedWorkerFactoryCreateSharedWorkerParams(int version) {
            super(152, version);
        }

        public SharedWorkerFactoryCreateSharedWorkerParams() {
            this(0);
        }

        public static SharedWorkerFactoryCreateSharedWorkerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SharedWorkerFactoryCreateSharedWorkerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SharedWorkerFactoryCreateSharedWorkerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SharedWorkerFactoryCreateSharedWorkerParams result = new SharedWorkerFactoryCreateSharedWorkerParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = SharedWorkerInfo.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.token = SharedWorkerToken.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.constructorOrigin = Origin.decode(decoder13);
                result.userAgent = decoder0.readString(32, false);
                Decoder decoder14 = decoder0.readPointer(40, false);
                result.uaMetadata = UserAgentMetadata.decode(decoder14);
                result.pauseOnStart = decoder0.readBoolean(48, 0);
                result.preferenceWatcherReceiver = decoder0.readInterfaceRequest(52, false);
                Decoder decoder15 = decoder0.readPointer(56, false);
                result.devtoolsWorkerToken = UnguessableToken.decode(decoder15);
                Decoder decoder16 = decoder0.readPointer(64, false);
                result.rendererPreferences = RendererPreferences.decode(decoder16);
                result.contentSettings = (WorkerContentSettingsProxy) decoder0.readServiceInterface(72, false, WorkerContentSettingsProxy.MANAGER);
                Decoder decoder17 = decoder0.readPointer(80, true);
                result.serviceWorkerContainerInfo = ServiceWorkerContainerInfoForClient.decode(decoder17);
                Decoder decoder18 = decoder0.readPointer(88, true);
                result.appcacheHostId = UnguessableToken.decode(decoder18);
                Decoder decoder19 = decoder0.readPointer(96, false);
                result.mainScriptLoadParams = WorkerMainScriptLoadParams.decode(decoder19);
                Decoder decoder110 = decoder0.readPointer(104, false);
                result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder110);
                Decoder decoder111 = decoder0.readPointer(112, true);
                result.controllerInfo = ControllerServiceWorkerInfo.decode(decoder111);
                result.host = (SharedWorkerHost) decoder0.readServiceInterface(120, false, SharedWorkerHost.MANAGER);
                result.sharedWorker = decoder0.readInterfaceRequest(128, false);
                result.browserInterfaceBroker = (BrowserInterfaceBroker) decoder0.readServiceInterface(132, false, BrowserInterfaceBroker.MANAGER);
                result.ukmSourceId = decoder0.readLong(144);
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
            encoder0.encode((Struct) this.token, 16, false);
            encoder0.encode((Struct) this.constructorOrigin, 24, false);
            encoder0.encode(this.userAgent, 32, false);
            encoder0.encode((Struct) this.uaMetadata, 40, false);
            encoder0.encode(this.pauseOnStart, 48, 0);
            encoder0.encode((InterfaceRequest) this.preferenceWatcherReceiver, 52, false);
            encoder0.encode((Struct) this.devtoolsWorkerToken, 56, false);
            encoder0.encode((Struct) this.rendererPreferences, 64, false);
            encoder0.encode( this.contentSettings, 72, false,  WorkerContentSettingsProxy.MANAGER);
            encoder0.encode((Struct) this.serviceWorkerContainerInfo, 80, true);
            encoder0.encode((Struct) this.appcacheHostId, 88, true);
            encoder0.encode((Struct) this.mainScriptLoadParams, 96, false);
            encoder0.encode((Struct) this.subresourceLoaderFactories, 104, false);
            encoder0.encode((Struct) this.controllerInfo, 112, true);
            encoder0.encode( this.host, 120, false,  SharedWorkerHost.MANAGER);
            encoder0.encode((InterfaceRequest) this.sharedWorker, 128, false);
            encoder0.encode(this.browserInterfaceBroker, 132, false,  BrowserInterfaceBroker.MANAGER);
            encoder0.encode(this.ukmSourceId, 144);
        }
    }
}
