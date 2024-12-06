package org.chromium.network.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.DictionaryValue;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.mojo_base.mojom.Value;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface NetworkContext extends Interface {
    public static final Manager<NetworkContext, Proxy> MANAGER = NetworkContext_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddAuthCacheEntryResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface AddDomainReliabilityContextForTestingResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface AddExpectCtResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface AddHstsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearBadProxiesCacheResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearDomainReliabilityResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearHostCacheResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearHttpAuthCacheResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearHttpCacheResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearNetworkErrorLoggingResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearNetworkingHistoryBetweenResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearReportingCacheClientsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearReportingCacheReportsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ClearTrustTokenDataResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface CloseAllConnectionsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface CloseIdleConnectionsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ComputeHttpCacheSizeResponse extends Callbacks.Callback2<Boolean, Long> {
    }

    /* loaded from: classes2.dex */
    public interface CreateTcpBoundSocketResponse extends Callbacks.Callback2<Integer, IpEndPoint> {
    }

    /* loaded from: classes2.dex */
    public interface CreateTcpConnectedSocketResponse extends Callbacks.Callback5<Integer, IpEndPoint, IpEndPoint, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface CreateTcpServerSocketResponse extends Callbacks.Callback2<Integer, IpEndPoint> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteDynamicDataForHostResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteStoredTrustTokensResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface EnableStaticKeyPinningForTestingResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ForceDomainReliabilityUploadsForTestingResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ForceReloadProxyConfigResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetDomainReliabilityJsonResponse extends Callbacks.Callback1<Value> {
    }

    /* loaded from: classes2.dex */
    public interface GetExpectCtStateResponse extends Callbacks.Callback1<DictionaryValue> {
    }

    /* loaded from: classes2.dex */
    public interface GetHstsStateResponse extends Callbacks.Callback1<DictionaryValue> {
    }

    /* loaded from: classes2.dex */
    public interface GetStoredTrustTokenCountsResponse extends Callbacks.Callback1<StoredTrustTokensForIssuer[]> {
    }

    /* loaded from: classes2.dex */
    public interface IsHstsActiveForHostResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface LoadHttpAuthCacheProxyEntriesResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface LookupServerBasicAuthCredentialsResponse extends Callbacks.Callback1<AuthCredentials> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkContext, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SaveHttpAuthCacheProxyEntriesResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface SetCorsOriginAccessListsForOriginResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SetExpectCtTestReportResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface VerifyCertForSignedExchangeResponse extends Callbacks.Callback2<Integer, CertVerifyResult> {
    }

    /* loaded from: classes2.dex */
    public interface VerifyCertificateForTestingResponse extends Callbacks.Callback1<Integer> {
    }

    void addAuthCacheEntry(AuthChallengeInfo authChallengeInfo, NetworkIsolationKey networkIsolationKey, AuthCredentials authCredentials, AddAuthCacheEntryResponse addAuthCacheEntryResponse);

    void addDomainReliabilityContextForTesting(Url url, Url url2, AddDomainReliabilityContextForTestingResponse addDomainReliabilityContextForTestingResponse);

    void addExpectCt(String str, Time time, boolean z, Url url, NetworkIsolationKey networkIsolationKey, AddExpectCtResponse addExpectCtResponse);

    void addHsts(String str, Time time, boolean z, AddHstsResponse addHstsResponse);

    void clearBadProxiesCache(ClearBadProxiesCacheResponse clearBadProxiesCacheResponse);

    void clearDomainReliability(ClearDataFilter clearDataFilter, int i, ClearDomainReliabilityResponse clearDomainReliabilityResponse);

    void clearHostCache(ClearDataFilter clearDataFilter, ClearHostCacheResponse clearHostCacheResponse);

    void clearHttpAuthCache(Time time, Time time2, ClearHttpAuthCacheResponse clearHttpAuthCacheResponse);

    void clearHttpCache(Time time, Time time2, ClearDataFilter clearDataFilter, ClearHttpCacheResponse clearHttpCacheResponse);

    void clearNetworkErrorLogging(ClearDataFilter clearDataFilter, ClearNetworkErrorLoggingResponse clearNetworkErrorLoggingResponse);

    void clearNetworkingHistoryBetween(Time time, Time time2, ClearNetworkingHistoryBetweenResponse clearNetworkingHistoryBetweenResponse);

    void clearReportingCacheClients(ClearDataFilter clearDataFilter, ClearReportingCacheClientsResponse clearReportingCacheClientsResponse);

    void clearReportingCacheReports(ClearDataFilter clearDataFilter, ClearReportingCacheReportsResponse clearReportingCacheReportsResponse);

    void clearTrustTokenData(ClearDataFilter clearDataFilter, ClearTrustTokenDataResponse clearTrustTokenDataResponse);

    void closeAllConnections(CloseAllConnectionsResponse closeAllConnectionsResponse);

    void closeIdleConnections(CloseIdleConnectionsResponse closeIdleConnectionsResponse);

    void computeHttpCacheSize(Time time, Time time2, ComputeHttpCacheSizeResponse computeHttpCacheSizeResponse);

    void createHostResolver(DnsConfigOverrides dnsConfigOverrides, InterfaceRequest<HostResolver> interfaceRequest);

    void createMdnsResponder(InterfaceRequest<MdnsResponder> interfaceRequest);

    void createNetLogExporter(InterfaceRequest<NetLogExporter> interfaceRequest);

    void createP2pSocketManager(NetworkIsolationKey networkIsolationKey, P2pTrustedSocketManagerClient p2pTrustedSocketManagerClient, InterfaceRequest<P2pTrustedSocketManager> interfaceRequest, InterfaceRequest<P2pSocketManager> interfaceRequest2);

    void createProxyResolvingSocketFactory(InterfaceRequest<ProxyResolvingSocketFactory> interfaceRequest);

    void createTcpBoundSocket(IpEndPoint ipEndPoint, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<TcpBoundSocket> interfaceRequest, CreateTcpBoundSocketResponse createTcpBoundSocketResponse);

    void createTcpConnectedSocket(IpEndPoint ipEndPoint, AddressList addressList, TcpConnectedSocketOptions tcpConnectedSocketOptions, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<TcpConnectedSocket> interfaceRequest, SocketObserver socketObserver, CreateTcpConnectedSocketResponse createTcpConnectedSocketResponse);

    void createTcpServerSocket(IpEndPoint ipEndPoint, int i, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<TcpServerSocket> interfaceRequest, CreateTcpServerSocketResponse createTcpServerSocketResponse);

    void createUdpSocket(InterfaceRequest<UdpSocket> interfaceRequest, UdpSocketListener udpSocketListener);

    void createUrlLoaderFactory(InterfaceRequest<UrlLoaderFactory> interfaceRequest, UrlLoaderFactoryParams urlLoaderFactoryParams);

    void createWebSocket(Url url, String[] strArr, SiteForCookies siteForCookies, IsolationInfo isolationInfo, HttpHeader[] httpHeaderArr, int i, Origin origin, int i2, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, WebSocketHandshakeClient webSocketHandshakeClient, UrlLoaderNetworkServiceObserver urlLoaderNetworkServiceObserver, WebSocketAuthenticationHandler webSocketAuthenticationHandler, TrustedHeaderClient trustedHeaderClient, UnguessableToken unguessableToken);

    void createWebTransport(Url url, Origin origin, NetworkIsolationKey networkIsolationKey, WebTransportCertificateFingerprint[] webTransportCertificateFingerprintArr, WebTransportHandshakeClient webTransportHandshakeClient);

    void deleteDynamicDataForHost(String str, DeleteDynamicDataForHostResponse deleteDynamicDataForHostResponse);

    void deleteStoredTrustTokens(Origin origin, DeleteStoredTrustTokensResponse deleteStoredTrustTokensResponse);

    void enableStaticKeyPinningForTesting(EnableStaticKeyPinningForTestingResponse enableStaticKeyPinningForTestingResponse);

    void forceDomainReliabilityUploadsForTesting(ForceDomainReliabilityUploadsForTestingResponse forceDomainReliabilityUploadsForTestingResponse);

    void forceReloadProxyConfig(ForceReloadProxyConfigResponse forceReloadProxyConfigResponse);

    void getCookieManager(InterfaceRequest<CookieManager> interfaceRequest);

    void getDomainReliabilityJson(GetDomainReliabilityJsonResponse getDomainReliabilityJsonResponse);

    void getExpectCtState(String str, NetworkIsolationKey networkIsolationKey, GetExpectCtStateResponse getExpectCtStateResponse);

    void getHasTrustTokensAnswerer(InterfaceRequest<HasTrustTokensAnswerer> interfaceRequest, Origin origin);

    void getHstsState(String str, GetHstsStateResponse getHstsStateResponse);

    void getOriginPolicyManager(InterfaceRequest<OriginPolicyManager> interfaceRequest);

    void getRestrictedCookieManager(InterfaceRequest<RestrictedCookieManager> interfaceRequest, int i, Origin origin, IsolationInfo isolationInfo, CookieAccessObserver cookieAccessObserver);

    void getStoredTrustTokenCounts(GetStoredTrustTokenCountsResponse getStoredTrustTokenCountsResponse);

    void isHstsActiveForHost(String str, IsHstsActiveForHostResponse isHstsActiveForHostResponse);

    void loadHttpAuthCacheProxyEntries(UnguessableToken unguessableToken, LoadHttpAuthCacheProxyEntriesResponse loadHttpAuthCacheProxyEntriesResponse);

    void lookUpProxyForUrl(Url url, NetworkIsolationKey networkIsolationKey, ProxyLookupClient proxyLookupClient);

    void lookupServerBasicAuthCredentials(Url url, NetworkIsolationKey networkIsolationKey, LookupServerBasicAuthCredentialsResponse lookupServerBasicAuthCredentialsResponse);

    void notifyExternalCacheHit(Url url, String str, NetworkIsolationKey networkIsolationKey, boolean z);

    void preconnectSockets(int i, Url url, boolean z, NetworkIsolationKey networkIsolationKey);

    void queueReport(String str, String str2, Url url, NetworkIsolationKey networkIsolationKey, String str3, DictionaryValue dictionaryValue);

    void queueSignedExchangeReport(SignedExchangeReport signedExchangeReport, NetworkIsolationKey networkIsolationKey);

    void resetUrlLoaderFactories();

    void resolveHost(HostPortPair hostPortPair, NetworkIsolationKey networkIsolationKey, ResolveHostParameters resolveHostParameters, ResolveHostClient resolveHostClient);

    void saveHttpAuthCacheProxyEntries(SaveHttpAuthCacheProxyEntriesResponse saveHttpAuthCacheProxyEntriesResponse);

    void setAcceptLanguage(String str);

    void setClient(NetworkContextClient networkContextClient);

    void setCorsOriginAccessListsForOrigin(Origin origin, CorsOriginPattern[] corsOriginPatternArr, CorsOriginPattern[] corsOriginPatternArr2, SetCorsOriginAccessListsForOriginResponse setCorsOriginAccessListsForOriginResponse);

    void setCtPolicy(CtPolicy ctPolicy);

    void setDocumentReportingEndpoints(Origin origin, NetworkIsolationKey networkIsolationKey, Map<String, String> map);

    void setEnableReferrers(boolean z);

    void setExpectCtTestReport(Url url, SetExpectCtTestReportResponse setExpectCtTestReportResponse);

    void setNetworkConditions(UnguessableToken unguessableToken, NetworkConditions networkConditions);

    void setSctAuditingEnabled(boolean z);

    void setSplitAuthCacheByNetworkIsolationKey(boolean z);

    void verifyCertForSignedExchange(X509Certificate x509Certificate, Url url, NetworkIsolationKey networkIsolationKey, String str, String str2, VerifyCertForSignedExchangeResponse verifyCertForSignedExchangeResponse);

    void verifyCertificateForTesting(X509Certificate x509Certificate, String str, String str2, String str3, VerifyCertificateForTestingResponse verifyCertificateForTestingResponse);

    /* loaded from: classes2.dex */
    public static final class DomainReliabilityClearMode {
        public static final int CLEAR_BEACONS = 1;
        public static final int CLEAR_CONTEXTS = 0;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private DomainReliabilityClearMode() {
        }
    }
}
