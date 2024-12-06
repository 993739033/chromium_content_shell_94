package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class UrlRequest extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 208;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean corbDetachable;
    public HttpRequestHeaders corsExemptHeaders;
    public int corsPreflightPolicy;
    public int credentialsMode;
    public int destination;
    public int[] devtoolsAcceptedStreamTypes;
    public String devtoolsRequestId;
    public String devtoolsStackId;
    public boolean doNotPromptForLogin;
    public boolean enableLoadTiming;
    public boolean enableUploadProgress;
    public String fetchIntegrity;
    public UnguessableToken fetchWindowId;
    public boolean hasUserGesture;
    public HttpRequestHeaders headers;
    public boolean isExternalRequest;
    public boolean isFavicon;
    public boolean isFetchLikeApi;
    public boolean isMainFrame;
    public boolean isRevalidating;
    public boolean isSignedExchangePrefetchCacheEnabled;
    public Origin isolatedWorldOrigin;
    public boolean keepalive;
    public int loadFlags;
    public String method;
    public int mode;
    public boolean obeyOriginPolicy;
    public boolean originatedFromServiceWorker;
    public int previewsState;
    public int priority;
    public UnguessableToken recursivePrefetchToken;
    public int redirectMode;
    public Url referrer;
    public int referrerPolicy;
    public UrlRequestBody requestBody;
    public Origin requestInitiator;
    public int resourceType;
    public boolean shouldResetAppcache;
    public SiteForCookies siteForCookies;
    public boolean skipServiceWorker;
    public UnguessableToken throttlingProfileId;
    public int transitionType;
    public TrustTokenParams trustTokenParams;
    public TrustedUrlRequestParams trustedParams;
    public boolean updateFirstPartyUrlOnRedirect;
    public boolean upgradeIfInsecure;
    public Url url;
    public WebBundleTokenParams webBundleTokenParams;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(208, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private UrlRequest(int version) {
        super(208, version);
        this.corbDetachable = false;
    }

    public UrlRequest() {
        this(0);
    }

    public static UrlRequest deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static UrlRequest deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static UrlRequest decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            UrlRequest result = new UrlRequest(elementsOrVersion);
            result.method = decoder0.readString(8, false);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.url = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.siteForCookies = SiteForCookies.decode(decoder12);
            result.updateFirstPartyUrlOnRedirect = decoder0.readBoolean(32, 0);
            result.shouldResetAppcache = decoder0.readBoolean(32, 1);
            result.isExternalRequest = decoder0.readBoolean(32, 2);
            result.originatedFromServiceWorker = decoder0.readBoolean(32, 3);
            result.skipServiceWorker = decoder0.readBoolean(32, 4);
            result.corbDetachable = decoder0.readBoolean(32, 5);
            result.keepalive = decoder0.readBoolean(32, 6);
            result.hasUserGesture = decoder0.readBoolean(32, 7);
            result.enableLoadTiming = decoder0.readBoolean(33, 0);
            result.enableUploadProgress = decoder0.readBoolean(33, 1);
            result.doNotPromptForLogin = decoder0.readBoolean(33, 2);
            result.isMainFrame = decoder0.readBoolean(33, 3);
            result.upgradeIfInsecure = decoder0.readBoolean(33, 4);
            result.isRevalidating = decoder0.readBoolean(33, 5);
            result.isSignedExchangePrefetchCacheEnabled = decoder0.readBoolean(33, 6);
            result.isFetchLikeApi = decoder0.readBoolean(33, 7);
            result.isFavicon = decoder0.readBoolean(34, 0);
            result.obeyOriginPolicy = decoder0.readBoolean(34, 1);
            int readInt = decoder0.readInt(36);
            result.referrerPolicy = readInt;
            UrlRequestReferrerPolicy.validate(readInt);
            result.referrerPolicy = UrlRequestReferrerPolicy.toKnownValue(result.referrerPolicy);
            Decoder decoder13 = decoder0.readPointer(40, true);
            result.requestInitiator = Origin.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(48, true);
            result.isolatedWorldOrigin = Origin.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(56, false);
            result.referrer = Url.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(64, false);
            result.headers = HttpRequestHeaders.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(72, false);
            result.corsExemptHeaders = HttpRequestHeaders.decode(decoder17);
            result.loadFlags = decoder0.readInt(80);
            result.resourceType = decoder0.readInt(84);
            int readInt2 = decoder0.readInt(88);
            result.priority = readInt2;
            RequestPriority.validate(readInt2);
            result.priority = RequestPriority.toKnownValue(result.priority);
            int readInt3 = decoder0.readInt(92);
            result.corsPreflightPolicy = readInt3;
            CorsPreflightPolicy.validate(readInt3);
            result.corsPreflightPolicy = CorsPreflightPolicy.toKnownValue(result.corsPreflightPolicy);
            int readInt4 = decoder0.readInt(96);
            result.mode = readInt4;
            RequestMode.validate(readInt4);
            result.mode = RequestMode.toKnownValue(result.mode);
            int readInt5 = decoder0.readInt(100);
            result.credentialsMode = readInt5;
            CredentialsMode.validate(readInt5);
            result.credentialsMode = CredentialsMode.toKnownValue(result.credentialsMode);
            int readInt6 = decoder0.readInt(104);
            result.redirectMode = readInt6;
            RedirectMode.validate(readInt6);
            result.redirectMode = RedirectMode.toKnownValue(result.redirectMode);
            int readInt7 = decoder0.readInt(108);
            result.destination = readInt7;
            RequestDestination.validate(readInt7);
            result.destination = RequestDestination.toKnownValue(result.destination);
            result.fetchIntegrity = decoder0.readString(112, false);
            Decoder decoder18 = decoder0.readPointer(120, true);
            result.requestBody = UrlRequestBody.decode(decoder18);
            result.transitionType = decoder0.readInt(128);
            result.previewsState = decoder0.readInt(132);
            Decoder decoder19 = decoder0.readPointer(136, true);
            result.throttlingProfileId = UnguessableToken.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(144, true);
            result.fetchWindowId = UnguessableToken.decode(decoder110);
            result.devtoolsRequestId = decoder0.readString(152, true);
            result.devtoolsStackId = decoder0.readString(160, true);
            Decoder decoder111 = decoder0.readPointer(168, true);
            result.trustedParams = TrustedUrlRequestParams.decode(decoder111);
            Decoder decoder112 = decoder0.readPointer(176, true);
            result.recursivePrefetchToken = UnguessableToken.decode(decoder112);
            Decoder decoder113 = decoder0.readPointer(184, true);
            result.trustTokenParams = TrustTokenParams.decode(decoder113);
            Decoder decoder114 = decoder0.readPointer(192, true);
            result.webBundleTokenParams = WebBundleTokenParams.decode(decoder114);
            int[] readInts = decoder0.readInts(200, 1, -1);
            result.devtoolsAcceptedStreamTypes = readInts;
            if (readInts != null) {
                int i1 = 0;
                while (true) {
                    int[] iArr = result.devtoolsAcceptedStreamTypes;
                    if (i1 >= iArr.length) {
                        break;
                    }
                    SourceType.validate(iArr[i1]);
                    i1++;
                }
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
        encoder0.encode(this.method, 8, false);
        encoder0.encode((Struct) this.url, 16, false);
        encoder0.encode((Struct) this.siteForCookies, 24, false);
        encoder0.encode(this.updateFirstPartyUrlOnRedirect, 32, 0);
        encoder0.encode(this.shouldResetAppcache, 32, 1);
        encoder0.encode(this.isExternalRequest, 32, 2);
        encoder0.encode(this.originatedFromServiceWorker, 32, 3);
        encoder0.encode(this.skipServiceWorker, 32, 4);
        encoder0.encode(this.corbDetachable, 32, 5);
        encoder0.encode(this.keepalive, 32, 6);
        encoder0.encode(this.hasUserGesture, 32, 7);
        encoder0.encode(this.enableLoadTiming, 33, 0);
        encoder0.encode(this.enableUploadProgress, 33, 1);
        encoder0.encode(this.doNotPromptForLogin, 33, 2);
        encoder0.encode(this.isMainFrame, 33, 3);
        encoder0.encode(this.upgradeIfInsecure, 33, 4);
        encoder0.encode(this.isRevalidating, 33, 5);
        encoder0.encode(this.isSignedExchangePrefetchCacheEnabled, 33, 6);
        encoder0.encode(this.isFetchLikeApi, 33, 7);
        encoder0.encode(this.isFavicon, 34, 0);
        encoder0.encode(this.obeyOriginPolicy, 34, 1);
        encoder0.encode(this.referrerPolicy, 36);
        encoder0.encode((Struct) this.requestInitiator, 40, true);
        encoder0.encode((Struct) this.isolatedWorldOrigin, 48, true);
        encoder0.encode((Struct) this.referrer, 56, false);
        encoder0.encode((Struct) this.headers, 64, false);
        encoder0.encode((Struct) this.corsExemptHeaders, 72, false);
        encoder0.encode(this.loadFlags, 80);
        encoder0.encode(this.resourceType, 84);
        encoder0.encode(this.priority, 88);
        encoder0.encode(this.corsPreflightPolicy, 92);
        encoder0.encode(this.mode, 96);
        encoder0.encode(this.credentialsMode, 100);
        encoder0.encode(this.redirectMode, 104);
        encoder0.encode(this.destination, 108);
        encoder0.encode(this.fetchIntegrity, 112, false);
        encoder0.encode((Struct) this.requestBody, 120, true);
        encoder0.encode(this.transitionType, 128);
        encoder0.encode(this.previewsState, 132);
        encoder0.encode((Struct) this.throttlingProfileId, 136, true);
        encoder0.encode((Struct) this.fetchWindowId, 144, true);
        encoder0.encode(this.devtoolsRequestId, 152, true);
        encoder0.encode(this.devtoolsStackId, 160, true);
        encoder0.encode((Struct) this.trustedParams, 168, true);
        encoder0.encode((Struct) this.recursivePrefetchToken, 176, true);
        encoder0.encode((Struct) this.trustTokenParams, 184, true);
        encoder0.encode((Struct) this.webBundleTokenParams, 192, true);
        encoder0.encode(this.devtoolsAcceptedStreamTypes, 200, 1, -1);
    }
}
