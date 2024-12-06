package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.CssSampleId;
import org.chromium.blink.mojom.WebFeature;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.FilePath;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.proxy_resolver.mojom.ProxyResolverFactory;

/* loaded from: classes2.dex */
public final class NetworkContextParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 240;
    private static final DataHeader[] VERSION_ARRAY;
    public String acceptLanguage;
    public boolean allowAnyCorsExemptHeaderForBrowser;
    public CertVerifierServiceRemoteParams certVerifierParams;
    public boolean checkClearTextPermitted;
    public String contextName;
    public InterfaceRequest<CookieManager> cookieManager;
    public CookieManagerParams cookieManagerParams;
    public FilePath cookiePath;
    public String[] corsExemptHeaderList;
    public CorsOriginAccessPatterns[] corsOriginAccessList;
    public CtPolicy ctPolicy;
    public InterfaceRequest<CustomProxyConfigClient> customProxyConfigClientReceiver;
    public CustomProxyConnectionObserver customProxyConnectionObserverRemote;
    public boolean disableIdleSocketsCloseOnMemoryPressure;
    public boolean discardDomainReliablityUploads;
    public String domainReliabilityUploadReporter;
    public boolean enableBrotli;
    public boolean enableCertificateReporting;
    public boolean enableDomainReliability;
    public boolean enableEncryptedCookies;
    public boolean enableExpectCtReporting;
    public boolean enableFtpUrlSupport;
    public boolean enableReferrers;
    public boolean enableSctAuditing;
    public boolean enforceChromeCtPolicy;
    public String[] hstsPolicyBypassList;
    public HttpAuthStaticNetworkContextParams httpAuthStaticNetworkContextParams;
    public boolean httpCacheEnabled;
    public int httpCacheMaxSize;
    public FilePath httpCachePath;
    public FilePath httpServerPropertiesPath;
    public CustomProxyConfig initialCustomProxyConfig;
    public ProxyConfigWithAnnotation initialProxyConfig;
    public SslConfig initialSslConfig;
    public boolean pacQuickCheckEnabled;
    public boolean persistSessionCookies;
    public InterfaceRequest<ProxyConfigClient> proxyConfigClientReceiver;
    public ProxyConfigPollerClient proxyConfigPollerClient;
    public ProxyErrorClient proxyErrorClient;
    public ProxyResolverFactory proxyResolverFactory;
    public String quicUserAgentId;
    public FilePath reportingAndNelStorePath;
    public TimeDelta reportingDeliveryInterval;
    public boolean requireNetworkIsolationKey;
    public boolean resetHttpCacheBackend;
    public boolean restoreOldSessionCookies;
    public boolean skipReportingSendPermissionCheck;
    public boolean splitAuthCacheByNetworkIsolationKey;
    public InterfaceRequest<SslConfigClient> sslConfigClientReceiver;
    public FilePath transportSecurityPersisterFilePath;
    public FilePath trustTokenPath;
    public String userAgent;
    public boolean validateReferrerPolicyOnInitialRequest;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(240, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private NetworkContextParams(int version) {
        super(240, version);
        this.enableBrotli = true;
        this.enableReferrers = true;
        this.validateReferrerPolicyOnInitialRequest = true;
        this.enableEncryptedCookies = true;
        this.restoreOldSessionCookies = false;
        this.persistSessionCookies = false;
        this.httpCacheEnabled = true;
        this.httpCacheMaxSize = 0;
        this.enableFtpUrlSupport = false;
        this.checkClearTextPermitted = false;
        this.disableIdleSocketsCloseOnMemoryPressure = false;
        this.pacQuickCheckEnabled = true;
        this.enableCertificateReporting = false;
        this.enforceChromeCtPolicy = false;
        this.enableExpectCtReporting = false;
        this.enableSctAuditing = false;
        this.enableDomainReliability = false;
        this.discardDomainReliablityUploads = false;
        this.skipReportingSendPermissionCheck = false;
        this.allowAnyCorsExemptHeaderForBrowser = false;
        this.resetHttpCacheBackend = false;
        this.splitAuthCacheByNetworkIsolationKey = false;
        this.requireNetworkIsolationKey = false;
    }

    public NetworkContextParams() {
        this(0);
    }

    public static NetworkContextParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static NetworkContextParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static NetworkContextParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            NetworkContextParams result = new NetworkContextParams(elementsOrVersion);
            result.contextName = decoder0.readString(8, true);
            result.userAgent = decoder0.readString(16, false);
            result.acceptLanguage = decoder0.readString(24, false);
            result.enableBrotli = decoder0.readBoolean(32, 0);
            result.enableReferrers = decoder0.readBoolean(32, 1);
            result.validateReferrerPolicyOnInitialRequest = decoder0.readBoolean(32, 2);
            result.enableEncryptedCookies = decoder0.readBoolean(32, 3);
            result.restoreOldSessionCookies = decoder0.readBoolean(32, 4);
            result.persistSessionCookies = decoder0.readBoolean(32, 5);
            result.httpCacheEnabled = decoder0.readBoolean(32, 6);
            result.enableFtpUrlSupport = decoder0.readBoolean(32, 7);
            result.checkClearTextPermitted = decoder0.readBoolean(33, 0);
            result.disableIdleSocketsCloseOnMemoryPressure = decoder0.readBoolean(33, 1);
            result.pacQuickCheckEnabled = decoder0.readBoolean(33, 2);
            result.enableCertificateReporting = decoder0.readBoolean(33, 3);
            result.enforceChromeCtPolicy = decoder0.readBoolean(33, 4);
            result.enableExpectCtReporting = decoder0.readBoolean(33, 5);
            result.enableSctAuditing = decoder0.readBoolean(33, 6);
            result.enableDomainReliability = decoder0.readBoolean(33, 7);
            result.discardDomainReliablityUploads = decoder0.readBoolean(34, 0);
            result.skipReportingSendPermissionCheck = decoder0.readBoolean(34, 1);
            result.allowAnyCorsExemptHeaderForBrowser = decoder0.readBoolean(34, 2);
            result.resetHttpCacheBackend = decoder0.readBoolean(34, 3);
            result.splitAuthCacheByNetworkIsolationKey = decoder0.readBoolean(34, 4);
            result.requireNetworkIsolationKey = decoder0.readBoolean(34, 5);
            result.httpCacheMaxSize = decoder0.readInt(36);
            result.quicUserAgentId = decoder0.readString(40, false);
            result.proxyResolverFactory = (ProxyResolverFactory) decoder0.readServiceInterface(48, true, ProxyResolverFactory.MANAGER);
            Decoder decoder1 = decoder0.readPointer(56, true);
            result.cookiePath = FilePath.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(64, true);
            result.trustTokenPath = FilePath.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(72, true);
            result.httpCachePath = FilePath.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(80, true);
            result.httpServerPropertiesPath = FilePath.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(88, true);
            result.transportSecurityPersisterFilePath = FilePath.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(96, true);
            result.initialSslConfig = SslConfig.decode(decoder16);
            result.sslConfigClientReceiver = decoder0.readInterfaceRequest(104, true);
            result.proxyConfigClientReceiver = decoder0.readInterfaceRequest(108, true);
            Decoder decoder17 = decoder0.readPointer(112, true);
            result.initialProxyConfig = ProxyConfigWithAnnotation.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(120, true);
            result.initialCustomProxyConfig = CustomProxyConfig.decode(decoder18);
            result.customProxyConfigClientReceiver = decoder0.readInterfaceRequest(128, true);
            result.customProxyConnectionObserverRemote = (CustomProxyConnectionObserver) decoder0.readServiceInterface(132, true, CustomProxyConnectionObserver.MANAGER);
            result.proxyConfigPollerClient = (ProxyConfigPollerClient) decoder0.readServiceInterface(140, true, ProxyConfigPollerClient.MANAGER);
            result.proxyErrorClient = (ProxyErrorClient) decoder0.readServiceInterface(WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT, true, ProxyErrorClient.MANAGER);
            result.cookieManager = decoder0.readInterfaceRequest(CssSampleId.UNICODE_RANGE, true);
            Decoder decoder19 = decoder0.readPointer(160, true);
            result.ctPolicy = CtPolicy.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(168, false);
            result.certVerifierParams = CertVerifierServiceRemoteParams.decode(decoder110);
            Decoder decoder111 = decoder0.readPointer(176, true);
            result.cookieManagerParams = CookieManagerParams.decode(decoder111);
            result.domainReliabilityUploadReporter = decoder0.readString(184, false);
            Decoder decoder112 = decoder0.readPointer(192, true);
            result.reportingDeliveryInterval = TimeDelta.decode(decoder112);
            Decoder decoder113 = decoder0.readPointer(200, false);
            DataHeader si1 = decoder113.readDataHeaderForPointerArray(-1);
            result.corsOriginAccessList = new CorsOriginAccessPatterns[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder113.readPointer((i1 * 8) + 8, false);
                result.corsOriginAccessList[i1] = CorsOriginAccessPatterns.decode(decoder2);
            }
            Decoder decoder114 = decoder0.readPointer(CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, false);
            DataHeader si12 = decoder114.readDataHeaderForPointerArray(-1);
            result.corsExemptHeaderList = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.corsExemptHeaderList[i12] = decoder114.readString((i12 * 8) + 8, false);
            }
            Decoder decoder115 = decoder0.readPointer(216, false);
            DataHeader si13 = decoder115.readDataHeaderForPointerArray(-1);
            result.hstsPolicyBypassList = new String[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.hstsPolicyBypassList[i13] = decoder115.readString((i13 * 8) + 8, false);
            }
            Decoder decoder116 = decoder0.readPointer(CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, true);
            result.reportingAndNelStorePath = FilePath.decode(decoder116);
            Decoder decoder117 = decoder0.readPointer(232, true);
            result.httpAuthStaticNetworkContextParams = HttpAuthStaticNetworkContextParams.decode(decoder117);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.contextName, 8, true);
        encoder0.encode(this.userAgent, 16, false);
        encoder0.encode(this.acceptLanguage, 24, false);
        encoder0.encode(this.enableBrotli, 32, 0);
        encoder0.encode(this.enableReferrers, 32, 1);
        encoder0.encode(this.validateReferrerPolicyOnInitialRequest, 32, 2);
        encoder0.encode(this.enableEncryptedCookies, 32, 3);
        encoder0.encode(this.restoreOldSessionCookies, 32, 4);
        encoder0.encode(this.persistSessionCookies, 32, 5);
        encoder0.encode(this.httpCacheEnabled, 32, 6);
        encoder0.encode(this.enableFtpUrlSupport, 32, 7);
        encoder0.encode(this.checkClearTextPermitted, 33, 0);
        encoder0.encode(this.disableIdleSocketsCloseOnMemoryPressure, 33, 1);
        encoder0.encode(this.pacQuickCheckEnabled, 33, 2);
        encoder0.encode(this.enableCertificateReporting, 33, 3);
        encoder0.encode(this.enforceChromeCtPolicy, 33, 4);
        encoder0.encode(this.enableExpectCtReporting, 33, 5);
        encoder0.encode(this.enableSctAuditing, 33, 6);
        encoder0.encode(this.enableDomainReliability, 33, 7);
        encoder0.encode(this.discardDomainReliablityUploads, 34, 0);
        encoder0.encode(this.skipReportingSendPermissionCheck, 34, 1);
        encoder0.encode(this.allowAnyCorsExemptHeaderForBrowser, 34, 2);
        encoder0.encode(this.resetHttpCacheBackend, 34, 3);
        encoder0.encode(this.splitAuthCacheByNetworkIsolationKey, 34, 4);
        encoder0.encode(this.requireNetworkIsolationKey, 34, 5);
        encoder0.encode(this.httpCacheMaxSize, 36);
        encoder0.encode(this.quicUserAgentId, 40, false);
        encoder0.encode(this.proxyResolverFactory, 48, true, ProxyResolverFactory.MANAGER);
        encoder0.encode((Struct) this.cookiePath, 56, true);
        encoder0.encode((Struct) this.trustTokenPath, 64, true);
        encoder0.encode((Struct) this.httpCachePath, 72, true);
        encoder0.encode((Struct) this.httpServerPropertiesPath, 80, true);
        encoder0.encode((Struct) this.transportSecurityPersisterFilePath, 88, true);
        encoder0.encode((Struct) this.initialSslConfig, 96, true);
        encoder0.encode((InterfaceRequest) this.sslConfigClientReceiver, 104, true);
        encoder0.encode((InterfaceRequest) this.proxyConfigClientReceiver, 108, true);
        encoder0.encode((Struct) this.initialProxyConfig, 112, true);
        encoder0.encode((Struct) this.initialCustomProxyConfig, 120, true);
        encoder0.encode((InterfaceRequest) this.customProxyConfigClientReceiver, 128, true);
        encoder0.encode(this.customProxyConnectionObserverRemote, 132, true, CustomProxyConnectionObserver.MANAGER);
        encoder0.encode(this.proxyConfigPollerClient, 140, true, ProxyConfigPollerClient.MANAGER);
        encoder0.encode(this.proxyErrorClient, WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT, true, ProxyErrorClient.MANAGER);
        encoder0.encode((InterfaceRequest) this.cookieManager, CssSampleId.UNICODE_RANGE, true);
        encoder0.encode((Struct) this.ctPolicy, 160, true);
        encoder0.encode((Struct) this.certVerifierParams, 168, false);
        encoder0.encode((Struct) this.cookieManagerParams, 176, true);
        encoder0.encode(this.domainReliabilityUploadReporter, 184, false);
        encoder0.encode((Struct) this.reportingDeliveryInterval, 192, true);
        CorsOriginAccessPatterns[] corsOriginAccessPatternsArr = this.corsOriginAccessList;
        if (corsOriginAccessPatternsArr == null) {
            encoder0.encodeNullPointer(200, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(corsOriginAccessPatternsArr.length, 200, -1);
            int i0 = 0;
            while (true) {
                CorsOriginAccessPatterns[] corsOriginAccessPatternsArr2 = this.corsOriginAccessList;
                if (i0 >= corsOriginAccessPatternsArr2.length) {
                    break;
                }
                encoder1.encode((Struct) corsOriginAccessPatternsArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        String[] strArr = this.corsExemptHeaderList;
        if (strArr == null) {
            encoder0.encodeNullPointer(CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr.length, CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, -1);
            int i02 = 0;
            while (true) {
                String[] strArr2 = this.corsExemptHeaderList;
                if (i02 >= strArr2.length) {
                    break;
                }
                encoder12.encode(strArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        String[] strArr3 = this.hstsPolicyBypassList;
        if (strArr3 == null) {
            encoder0.encodeNullPointer(216, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(strArr3.length, 216, -1);
            int i03 = 0;
            while (true) {
                String[] strArr4 = this.hstsPolicyBypassList;
                if (i03 >= strArr4.length) {
                    break;
                }
                encoder13.encode(strArr4[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode((Struct) this.reportingAndNelStorePath, CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, true);
        encoder0.encode((Struct) this.httpAuthStaticNetworkContextParams, 232, true);
    }
}
