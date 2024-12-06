package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.CssSampleId;
import org.chromium.blink.mojom.WebFeature;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.proxy_resolver.mojom.ProxyServer;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class UrlResponseHead extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 248;
    private static final DataHeader[] VERSION_ARRAY;
    public String alpnNegotiatedProtocol;
    public long appcacheId;
    public Url appcacheManifestUrl;
    public boolean asyncRevalidationRequested;
    public AuthChallengeInfo authChallengeInfo;
    public String cacheStorageCacheName;
    public int certStatus;
    public String charset;
    public int connectionInfo;
    public long contentLength;
    public String[] corsExposedHeaderNames;
    public int ctPolicyCompliance;
    public boolean didMimeSniff;
    public boolean didServiceWorkerNavigationPreload;
    public String[] dnsAliases;
    public long encodedBodyLength;
    public long encodedDataLength;
    public boolean hasAuthorizationCoveredByWildcardOnPreflight;
    public boolean hasRangeRequested;
    public HttpResponseHeaders headers;
    public boolean interceptedByPlugin;
    public boolean isLegacyTlsVersion;
    public boolean isSignedExchangeInnerResponse;
    public boolean isValidated;
    public LoadTimingInfo loadTiming;
    public String mimeType;
    public boolean networkAccessed;
    public OriginPolicy originPolicy;
    public long padding;
    public ParsedHeaders parsedHeaders;
    public ProxyServer proxyServer;
    public UnguessableToken recursivePrefetchToken;
    public IpEndPoint remoteEndpoint;
    public boolean requestIncludeCredentials;
    public TimeTicks requestStart;
    public Time requestTime;
    public TimeTicks responseStart;
    public Time responseTime;
    public int responseType;
    public int serviceWorkerResponseSource;
    public boolean shouldReportCorbBlocking;
    public SslInfo sslInfo;
    public boolean timingAllowPassed;
    public Url[] urlListViaServiceWorker;
    public boolean wasAlpnNegotiated;
    public boolean wasAlternateProtocolAvailable;
    public boolean wasCookieInRequest;
    public boolean wasFetchedViaCache;
    public boolean wasFetchedViaServiceWorker;
    public boolean wasFetchedViaSpdy;
    public boolean wasInPrefetchCache;
    public Url webBundleUrl;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(248, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private UrlResponseHead(int version) {
        super(248, version);
        this.contentLength = -1L;
        this.encodedDataLength = -1L;
        this.encodedBodyLength = -1L;
        this.networkAccessed = false;
        this.appcacheId = 0L;
        this.wasFetchedViaSpdy = false;
        this.wasAlpnNegotiated = false;
        this.wasAlternateProtocolAvailable = false;
        this.isValidated = false;
        this.wasFetchedViaCache = false;
        this.wasFetchedViaServiceWorker = false;
        this.serviceWorkerResponseSource = 0;
        this.responseType = 2;
        this.padding = 0L;
        this.certStatus = 0;
        this.didServiceWorkerNavigationPreload = false;
        this.shouldReportCorbBlocking = false;
        this.asyncRevalidationRequested = false;
        this.didMimeSniff = false;
        this.isSignedExchangeInnerResponse = false;
        this.wasInPrefetchCache = false;
        this.wasCookieInRequest = false;
        this.interceptedByPlugin = false;
        this.isLegacyTlsVersion = false;
        this.hasRangeRequested = false;
        this.timingAllowPassed = false;
        this.hasAuthorizationCoveredByWildcardOnPreflight = false;
        this.requestIncludeCredentials = true;
    }

    public UrlResponseHead() {
        this(0);
    }

    public static UrlResponseHead deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static UrlResponseHead deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static UrlResponseHead decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            UrlResponseHead result = new UrlResponseHead(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.requestTime = Time.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.responseTime = Time.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.headers = HttpResponseHeaders.decode(decoder13);
            result.mimeType = decoder0.readString(32, false);
            result.charset = decoder0.readString(40, false);
            int readInt = decoder0.readInt(48);
            result.ctPolicyCompliance = readInt;
            CtPolicyCompliance.validate(readInt);
            result.ctPolicyCompliance = CtPolicyCompliance.toKnownValue(result.ctPolicyCompliance);
            result.networkAccessed = decoder0.readBoolean(52, 0);
            result.wasFetchedViaSpdy = decoder0.readBoolean(52, 1);
            result.wasAlpnNegotiated = decoder0.readBoolean(52, 2);
            result.wasAlternateProtocolAvailable = decoder0.readBoolean(52, 3);
            result.isValidated = decoder0.readBoolean(52, 4);
            result.wasFetchedViaCache = decoder0.readBoolean(52, 5);
            result.wasFetchedViaServiceWorker = decoder0.readBoolean(52, 6);
            result.didServiceWorkerNavigationPreload = decoder0.readBoolean(52, 7);
            result.shouldReportCorbBlocking = decoder0.readBoolean(53, 0);
            result.asyncRevalidationRequested = decoder0.readBoolean(53, 1);
            result.didMimeSniff = decoder0.readBoolean(53, 2);
            result.isSignedExchangeInnerResponse = decoder0.readBoolean(53, 3);
            result.wasInPrefetchCache = decoder0.readBoolean(53, 4);
            result.wasCookieInRequest = decoder0.readBoolean(53, 5);
            result.interceptedByPlugin = decoder0.readBoolean(53, 6);
            result.isLegacyTlsVersion = decoder0.readBoolean(53, 7);
            result.hasRangeRequested = decoder0.readBoolean(54, 0);
            result.timingAllowPassed = decoder0.readBoolean(54, 1);
            result.hasAuthorizationCoveredByWildcardOnPreflight = decoder0.readBoolean(54, 2);
            result.requestIncludeCredentials = decoder0.readBoolean(54, 3);
            result.contentLength = decoder0.readLong(56);
            result.encodedDataLength = decoder0.readLong(64);
            result.encodedBodyLength = decoder0.readLong(72);
            result.appcacheId = decoder0.readLong(80);
            Decoder decoder14 = decoder0.readPointer(88, false);
            result.appcacheManifestUrl = Url.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(96, false);
            result.loadTiming = LoadTimingInfo.decode(decoder15);
            int readInt2 = decoder0.readInt(104);
            result.connectionInfo = readInt2;
            ConnectionInfo.validate(readInt2);
            result.connectionInfo = ConnectionInfo.toKnownValue(result.connectionInfo);
            int readInt3 = decoder0.readInt(108);
            result.serviceWorkerResponseSource = readInt3;
            FetchResponseSource.validate(readInt3);
            result.serviceWorkerResponseSource = FetchResponseSource.toKnownValue(result.serviceWorkerResponseSource);
            result.alpnNegotiatedProtocol = decoder0.readString(112, false);
            Decoder decoder16 = decoder0.readPointer(120, false);
            result.remoteEndpoint = IpEndPoint.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(128, false);
            result.proxyServer = ProxyServer.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(136, false);
            DataHeader si1 = decoder18.readDataHeaderForPointerArray(-1);
            result.urlListViaServiceWorker = new Url[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder18.readPointer((i1 * 8) + 8, false);
                result.urlListViaServiceWorker[i1] = Url.decode(decoder2);
            }
            int readInt4 = decoder0.readInt(144);
            result.responseType = readInt4;
            FetchResponseType.validate(readInt4);
            result.responseType = FetchResponseType.toKnownValue(result.responseType);
            result.certStatus = decoder0.readInt(WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT);
            result.padding = decoder0.readLong(152);
            result.cacheStorageCacheName = decoder0.readString(160, false);
            Decoder decoder19 = decoder0.readPointer(168, true);
            result.sslInfo = SslInfo.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(176, false);
            DataHeader si12 = decoder110.readDataHeaderForPointerArray(-1);
            result.corsExposedHeaderNames = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.corsExposedHeaderNames[i12] = decoder110.readString((i12 * 8) + 8, false);
            }
            Decoder decoder111 = decoder0.readPointer(184, true);
            result.authChallengeInfo = AuthChallengeInfo.decode(decoder111);
            Decoder decoder112 = decoder0.readPointer(192, false);
            result.requestStart = TimeTicks.decode(decoder112);
            Decoder decoder113 = decoder0.readPointer(200, false);
            result.responseStart = TimeTicks.decode(decoder113);
            Decoder decoder114 = decoder0.readPointer(CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, true);
            result.parsedHeaders = ParsedHeaders.decode(decoder114);
            Decoder decoder115 = decoder0.readPointer(216, true);
            result.originPolicy = OriginPolicy.decode(decoder115);
            Decoder decoder116 = decoder0.readPointer(CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, true);
            result.recursivePrefetchToken = UnguessableToken.decode(decoder116);
            Decoder decoder117 = decoder0.readPointer(232, false);
            DataHeader si13 = decoder117.readDataHeaderForPointerArray(-1);
            result.dnsAliases = new String[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.dnsAliases[i13] = decoder117.readString((i13 * 8) + 8, false);
            }
            Decoder decoder118 = decoder0.readPointer(240, false);
            result.webBundleUrl = Url.decode(decoder118);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.requestTime, 8, false);
        encoder0.encode((Struct) this.responseTime, 16, false);
        encoder0.encode((Struct) this.headers, 24, false);
        encoder0.encode(this.mimeType, 32, false);
        encoder0.encode(this.charset, 40, false);
        encoder0.encode(this.ctPolicyCompliance, 48);
        encoder0.encode(this.networkAccessed, 52, 0);
        encoder0.encode(this.wasFetchedViaSpdy, 52, 1);
        encoder0.encode(this.wasAlpnNegotiated, 52, 2);
        encoder0.encode(this.wasAlternateProtocolAvailable, 52, 3);
        encoder0.encode(this.isValidated, 52, 4);
        encoder0.encode(this.wasFetchedViaCache, 52, 5);
        encoder0.encode(this.wasFetchedViaServiceWorker, 52, 6);
        encoder0.encode(this.didServiceWorkerNavigationPreload, 52, 7);
        encoder0.encode(this.shouldReportCorbBlocking, 53, 0);
        encoder0.encode(this.asyncRevalidationRequested, 53, 1);
        encoder0.encode(this.didMimeSniff, 53, 2);
        encoder0.encode(this.isSignedExchangeInnerResponse, 53, 3);
        encoder0.encode(this.wasInPrefetchCache, 53, 4);
        encoder0.encode(this.wasCookieInRequest, 53, 5);
        encoder0.encode(this.interceptedByPlugin, 53, 6);
        encoder0.encode(this.isLegacyTlsVersion, 53, 7);
        encoder0.encode(this.hasRangeRequested, 54, 0);
        encoder0.encode(this.timingAllowPassed, 54, 1);
        encoder0.encode(this.hasAuthorizationCoveredByWildcardOnPreflight, 54, 2);
        encoder0.encode(this.requestIncludeCredentials, 54, 3);
        encoder0.encode(this.contentLength, 56);
        encoder0.encode(this.encodedDataLength, 64);
        encoder0.encode(this.encodedBodyLength, 72);
        encoder0.encode(this.appcacheId, 80);
        encoder0.encode((Struct) this.appcacheManifestUrl, 88, false);
        encoder0.encode((Struct) this.loadTiming, 96, false);
        encoder0.encode(this.connectionInfo, 104);
        encoder0.encode(this.serviceWorkerResponseSource, 108);
        encoder0.encode(this.alpnNegotiatedProtocol, 112, false);
        encoder0.encode((Struct) this.remoteEndpoint, 120, false);
        encoder0.encode((Struct) this.proxyServer, 128, false);
        Url[] urlArr = this.urlListViaServiceWorker;
        if (urlArr == null) {
            encoder0.encodeNullPointer(136, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(urlArr.length, 136, -1);
            int i0 = 0;
            while (true) {
                Url[] urlArr2 = this.urlListViaServiceWorker;
                if (i0 >= urlArr2.length) {
                    break;
                }
                encoder1.encode((Struct) urlArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.responseType, 144);
        encoder0.encode(this.certStatus, WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT);
        encoder0.encode(this.padding, 152);
        encoder0.encode(this.cacheStorageCacheName, 160, false);
        encoder0.encode((Struct) this.sslInfo, 168, true);
        String[] strArr = this.corsExposedHeaderNames;
        if (strArr == null) {
            encoder0.encodeNullPointer(176, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr.length, 176, -1);
            int i02 = 0;
            while (true) {
                String[] strArr2 = this.corsExposedHeaderNames;
                if (i02 >= strArr2.length) {
                    break;
                }
                encoder12.encode(strArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode((Struct) this.authChallengeInfo, 184, true);
        encoder0.encode((Struct) this.requestStart, 192, false);
        encoder0.encode((Struct) this.responseStart, 200, false);
        encoder0.encode((Struct) this.parsedHeaders, CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, true);
        encoder0.encode((Struct) this.originPolicy, 216, true);
        encoder0.encode((Struct) this.recursivePrefetchToken, CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, true);
        String[] strArr3 = this.dnsAliases;
        if (strArr3 == null) {
            encoder0.encodeNullPointer(232, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(strArr3.length, 232, -1);
            int i03 = 0;
            while (true) {
                String[] strArr4 = this.dnsAliases;
                if (i03 >= strArr4.length) {
                    break;
                }
                encoder13.encode(strArr4[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode((Struct) this.webBundleUrl, 240, false);
    }
}
