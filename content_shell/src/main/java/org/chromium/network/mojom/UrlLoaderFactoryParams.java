package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;

/* loaded from: classes2.dex */
public final class UrlLoaderFactoryParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 112;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean automaticallyAssignIsolationInfo;
    public ClientSecurityState clientSecurityState;
    public CrossOriginEmbedderPolicyReporter coepReporter;
    public CookieAccessObserver cookieObserver;
    public String debugTag;
    public DevToolsObserver devtoolsObserver;
    public boolean disableSecureDns;
    public boolean disableWebSecurity;
    public UrlLoaderFactoryOverride factoryOverride;
    public TrustedUrlLoaderHeaderClient headerClient;
    public boolean ignoreIsolatedWorldOrigin;
    public boolean isCorbEnabled;
    public boolean isTrusted;
    public IsolationInfo isolationInfo;
    public int processId;
    public boolean provideLoadingStateUpdates;
    public Origin requestInitiatorOriginLock;
    public UnguessableToken topFrameId;
    public int trustTokenRedemptionPolicy;
    public boolean unsafeNonWebbyInitiator;
    public UrlLoaderNetworkServiceObserver urlLoaderNetworkObserver;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(112, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private UrlLoaderFactoryParams(int version) {
        super(112, version);
        this.processId = -1;
        this.isCorbEnabled = true;
        this.ignoreIsolatedWorldOrigin = true;
        this.unsafeNonWebbyInitiator = false;
        this.disableWebSecurity = false;
        this.disableSecureDns = false;
        this.isTrusted = false;
        this.automaticallyAssignIsolationInfo = false;
        this.provideLoadingStateUpdates = false;
        this.trustTokenRedemptionPolicy = 1;
        this.debugTag = "";
    }

    public UrlLoaderFactoryParams() {
        this(0);
    }

    public static UrlLoaderFactoryParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static UrlLoaderFactoryParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static UrlLoaderFactoryParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            UrlLoaderFactoryParams result = new UrlLoaderFactoryParams(elementsOrVersion);
            result.processId = decoder0.readInt(8);
            result.isCorbEnabled = decoder0.readBoolean(12, 0);
            result.ignoreIsolatedWorldOrigin = decoder0.readBoolean(12, 1);
            result.unsafeNonWebbyInitiator = decoder0.readBoolean(12, 2);
            result.disableWebSecurity = decoder0.readBoolean(12, 3);
            result.disableSecureDns = decoder0.readBoolean(12, 4);
            result.isTrusted = decoder0.readBoolean(12, 5);
            result.automaticallyAssignIsolationInfo = decoder0.readBoolean(12, 6);
            result.provideLoadingStateUpdates = decoder0.readBoolean(12, 7);
            Decoder decoder1 = decoder0.readPointer(16, true);
            result.requestInitiatorOriginLock = Origin.decode(decoder1);
            result.headerClient = (TrustedUrlLoaderHeaderClient) decoder0.readServiceInterface(24, true, TrustedUrlLoaderHeaderClient.MANAGER);
            Decoder decoder12 = decoder0.readPointer(32, false);
            result.isolationInfo = IsolationInfo.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(40, true);
            result.topFrameId = UnguessableToken.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(48, true);
            result.factoryOverride = UrlLoaderFactoryOverride.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(56, true);
            result.clientSecurityState = ClientSecurityState.decode(decoder15);
            result.coepReporter = (CrossOriginEmbedderPolicyReporter) decoder0.readServiceInterface(64, true, CrossOriginEmbedderPolicyReporter.MANAGER);
            result.cookieObserver = (CookieAccessObserver) decoder0.readServiceInterface(72, true, CookieAccessObserver.MANAGER);
            result.urlLoaderNetworkObserver = (UrlLoaderNetworkServiceObserver) decoder0.readServiceInterface(80, true, UrlLoaderNetworkServiceObserver.MANAGER);
            result.devtoolsObserver = (DevToolsObserver) decoder0.readServiceInterface(88, true, DevToolsObserver.MANAGER);
            int readInt = decoder0.readInt(96);
            result.trustTokenRedemptionPolicy = readInt;
            TrustTokenRedemptionPolicy.validate(readInt);
            result.trustTokenRedemptionPolicy = TrustTokenRedemptionPolicy.toKnownValue(result.trustTokenRedemptionPolicy);
            result.debugTag = decoder0.readString(104, false);
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
        encoder0.encode(this.isCorbEnabled, 12, 0);
        encoder0.encode(this.ignoreIsolatedWorldOrigin, 12, 1);
        encoder0.encode(this.unsafeNonWebbyInitiator, 12, 2);
        encoder0.encode(this.disableWebSecurity, 12, 3);
        encoder0.encode(this.disableSecureDns, 12, 4);
        encoder0.encode(this.isTrusted, 12, 5);
        encoder0.encode(this.automaticallyAssignIsolationInfo, 12, 6);
        encoder0.encode(this.provideLoadingStateUpdates, 12, 7);
        encoder0.encode((Struct) this.requestInitiatorOriginLock, 16, true);
        encoder0.encode(this.headerClient, 24, true, TrustedUrlLoaderHeaderClient.MANAGER);
        encoder0.encode((Struct) this.isolationInfo, 32, false);
        encoder0.encode((Struct) this.topFrameId, 40, true);
        encoder0.encode((Struct) this.factoryOverride, 48, true);
        encoder0.encode((Struct) this.clientSecurityState, 56, true);
        encoder0.encode(this.coepReporter, 64, true, CrossOriginEmbedderPolicyReporter.MANAGER);
        encoder0.encode(this.cookieObserver, 72, true, CookieAccessObserver.MANAGER);
        encoder0.encode(this.urlLoaderNetworkObserver, 80, true, UrlLoaderNetworkServiceObserver.MANAGER);
        encoder0.encode(this.devtoolsObserver, 88, true, DevToolsObserver.MANAGER);
        encoder0.encode(this.trustTokenRedemptionPolicy, 96);
        encoder0.encode(this.debugTag, 104, false);
    }
}
