package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class EmbeddedWorkerStartParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 176;
    private static final DataHeader[] VERSION_ARRAY;
    public WorkerContentSettingsProxy contentSettingsProxy;
    public InterfaceRequest<ControllerServiceWorker> controllerReceiver;
    public UnguessableToken devtoolsWorkerToken;
    public ServiceWorkerInstalledScriptsInfo installedScriptsInfo;
    public AssociatedInterfaceNotSupported instanceHost;
    public boolean isInstalled;
    public WorkerMainScriptLoadParams mainScriptLoadParams;
    public FetchClientSettingsObject outsideFetchClientSettingsObject;
    public InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver;
    public ServiceWorkerProviderInfoForStartWorker providerInfo;
    public RendererPreferences rendererPreferences;
    public Url scope;
    public int scriptType;
    public Url scriptUrl;
    public Url scriptUrlToSkipThrottling;
    public InterfaceRequest<ServiceWorker> serviceWorkerReceiver;
    public int serviceWorkerRouteId;
    public ServiceWorkerToken serviceWorkerToken;
    public long serviceWorkerVersionId;
    public UrlLoaderFactoryBundle subresourceLoaderFactories;
    public InterfaceRequest<SubresourceLoaderUpdater> subresourceLoaderUpdater;
    public UserAgentMetadata uaMetadata;
    public long ukmSourceId;
    public String userAgent;
    public boolean waitForDebugger;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(176, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private EmbeddedWorkerStartParams(int version) {
        super(176, version);
    }

    public EmbeddedWorkerStartParams() {
        this(0);
    }

    public static EmbeddedWorkerStartParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static EmbeddedWorkerStartParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static EmbeddedWorkerStartParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            EmbeddedWorkerStartParams result = new EmbeddedWorkerStartParams(elementsOrVersion);
            result.serviceWorkerVersionId = decoder0.readLong(8);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.scope = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.scriptUrl = Url.decode(decoder12);
            int readInt = decoder0.readInt(32);
            result.scriptType = readInt;
            ScriptType.validate(readInt);
            result.scriptType = ScriptType.toKnownValue(result.scriptType);
            result.serviceWorkerRouteId = decoder0.readInt(36);
            Decoder decoder13 = decoder0.readPointer(40, false);
            result.outsideFetchClientSettingsObject = FetchClientSettingsObject.decode(decoder13);
            result.userAgent = decoder0.readString(48, false);
            Decoder decoder14 = decoder0.readPointer(56, false);
            result.uaMetadata = UserAgentMetadata.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(64, false);
            result.devtoolsWorkerToken = UnguessableToken.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(72, false);
            result.scriptUrlToSkipThrottling = Url.decode(decoder16);
            result.waitForDebugger = decoder0.readBoolean(80, 0);
            result.isInstalled = decoder0.readBoolean(80, 1);
            result.serviceWorkerReceiver = decoder0.readInterfaceRequest(84, false);
            Decoder decoder17 = decoder0.readPointer(88, false);
            result.rendererPreferences = RendererPreferences.decode(decoder17);
            result.controllerReceiver = decoder0.readInterfaceRequest(96, false);
            result.preferenceWatcherReceiver = decoder0.readInterfaceRequest(100, false);
            Decoder decoder18 = decoder0.readPointer(104, true);
            result.installedScriptsInfo = ServiceWorkerInstalledScriptsInfo.decode(decoder18);
            result.instanceHost = decoder0.readAssociatedServiceInterfaceNotSupported(112, false);
            Decoder decoder19 = decoder0.readPointer(120, false);
            result.providerInfo = ServiceWorkerProviderInfoForStartWorker.decode(decoder19);
            result.contentSettingsProxy = (WorkerContentSettingsProxy) decoder0.readServiceInterface(128, false, WorkerContentSettingsProxy.MANAGER);
            Decoder decoder110 = decoder0.readPointer(136, false);
            result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder110);
            result.subresourceLoaderUpdater = decoder0.readInterfaceRequest(144, false);
            Decoder decoder111 = decoder0.readPointer(152, false);
            result.serviceWorkerToken = ServiceWorkerToken.decode(decoder111);
            result.ukmSourceId = decoder0.readLong(160);
            Decoder decoder112 = decoder0.readPointer(168, true);
            result.mainScriptLoadParams = WorkerMainScriptLoadParams.decode(decoder112);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.serviceWorkerVersionId, 8);
        encoder0.encode((Struct) this.scope, 16, false);
        encoder0.encode((Struct) this.scriptUrl, 24, false);
        encoder0.encode(this.scriptType, 32);
        encoder0.encode(this.serviceWorkerRouteId, 36);
        encoder0.encode((Struct) this.outsideFetchClientSettingsObject, 40, false);
        encoder0.encode(this.userAgent, 48, false);
        encoder0.encode((Struct) this.uaMetadata, 56, false);
        encoder0.encode((Struct) this.devtoolsWorkerToken, 64, false);
        encoder0.encode((Struct) this.scriptUrlToSkipThrottling, 72, false);
        encoder0.encode(this.waitForDebugger, 80, 0);
        encoder0.encode(this.isInstalled, 80, 1);
        encoder0.encode((InterfaceRequest) this.serviceWorkerReceiver, 84, false);
        encoder0.encode((Struct) this.rendererPreferences, 88, false);
        encoder0.encode((InterfaceRequest) this.controllerReceiver, 96, false);
        encoder0.encode((InterfaceRequest) this.preferenceWatcherReceiver, 100, false);
        encoder0.encode((Struct) this.installedScriptsInfo, 104, true);
        encoder0.encode(this.instanceHost, 112, false);
        encoder0.encode((Struct) this.providerInfo, 120, false);
        encoder0.encode(this.contentSettingsProxy, 128, false,  WorkerContentSettingsProxy.MANAGER);
        encoder0.encode((Struct) this.subresourceLoaderFactories, 136, false);
        encoder0.encode((InterfaceRequest) this.subresourceLoaderUpdater, 144, false);
        encoder0.encode((Struct) this.serviceWorkerToken, 152, false);
        encoder0.encode(this.ukmSourceId, 160);
        encoder0.encode((Struct) this.mainScriptLoadParams, 168, true);
    }
}
