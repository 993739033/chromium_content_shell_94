package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
import org.chromium.mojo_base.mojom.DictionaryValue;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.mojo_base.mojom.Value;
import org.chromium.network.mojom.NetworkContext;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;

/* loaded from: classes2.dex */
class NetworkContext_Internal {
    private static final int ADD_AUTH_CACHE_ENTRY_ORDINAL = 57;
    private static final int ADD_DOMAIN_RELIABILITY_CONTEXT_FOR_TESTING_ORDINAL = 61;
    private static final int ADD_EXPECT_CT_ORDINAL = 29;
    private static final int ADD_HSTS_ORDINAL = 49;
    private static final int CLEAR_BAD_PROXIES_CACHE_ORDINAL = 39;
    private static final int CLEAR_DOMAIN_RELIABILITY_ORDINAL = 18;
    private static final int CLEAR_HOST_CACHE_ORDINAL = 13;
    private static final int CLEAR_HTTP_AUTH_CACHE_ORDINAL = 14;
    private static final int CLEAR_HTTP_CACHE_ORDINAL = 10;
    private static final int CLEAR_NETWORKING_HISTORY_BETWEEN_ORDINAL = 9;
    private static final int CLEAR_NETWORK_ERROR_LOGGING_ORDINAL = 17;
    private static final int CLEAR_REPORTING_CACHE_CLIENTS_ORDINAL = 16;
    private static final int CLEAR_REPORTING_CACHE_REPORTS_ORDINAL = 15;
    private static final int CLEAR_TRUST_TOKEN_DATA_ORDINAL = 6;
    private static final int CLOSE_ALL_CONNECTIONS_ORDINAL = 23;
    private static final int CLOSE_IDLE_CONNECTIONS_ORDINAL = 24;
    private static final int COMPUTE_HTTP_CACHE_SIZE_ORDINAL = 11;
    private static final int CREATE_HOST_RESOLVER_ORDINAL = 47;
    private static final int CREATE_MDNS_RESPONDER_ORDINAL = 45;
    private static final int CREATE_NET_LOG_EXPORTER_ORDINAL = 42;
    private static final int CREATE_P2P_SOCKET_MANAGER_ORDINAL = 44;
    private static final int CREATE_PROXY_RESOLVING_SOCKET_FACTORY_ORDINAL = 36;
    private static final int CREATE_TCP_BOUND_SOCKET_ORDINAL = 35;
    private static final int CREATE_TCP_CONNECTED_SOCKET_ORDINAL = 34;
    private static final int CREATE_TCP_SERVER_SOCKET_ORDINAL = 33;
    private static final int CREATE_UDP_SOCKET_ORDINAL = 32;
    private static final int CREATE_URL_LOADER_FACTORY_ORDINAL = 1;
    private static final int CREATE_WEB_SOCKET_ORDINAL = 40;
    private static final int CREATE_WEB_TRANSPORT_ORDINAL = 41;
    private static final int DELETE_DYNAMIC_DATA_FOR_HOST_ORDINAL = 53;
    private static final int DELETE_STORED_TRUST_TOKENS_ORDINAL = 8;
    private static final int ENABLE_STATIC_KEY_PINNING_FOR_TESTING_ORDINAL = 59;
    private static final int FORCE_DOMAIN_RELIABILITY_UPLOADS_FOR_TESTING_ORDINAL = 62;
    private static final int FORCE_RELOAD_PROXY_CONFIG_ORDINAL = 38;
    private static final int GET_COOKIE_MANAGER_ORDINAL = 3;
    private static final int GET_DOMAIN_RELIABILITY_JSON_ORDINAL = 19;
    private static final int GET_EXPECT_CT_STATE_ORDINAL = 31;
    private static final int GET_HAS_TRUST_TOKENS_ANSWERER_ORDINAL = 5;
    private static final int GET_HSTS_STATE_ORDINAL = 51;
    private static final int GET_ORIGIN_POLICY_MANAGER_ORDINAL = 63;
    private static final int GET_RESTRICTED_COOKIE_MANAGER_ORDINAL = 4;
    private static final int GET_STORED_TRUST_TOKEN_COUNTS_ORDINAL = 7;
    private static final int IS_HSTS_ACTIVE_FOR_HOST_ORDINAL = 50;
    private static final int LOAD_HTTP_AUTH_CACHE_PROXY_ENTRIES_ORDINAL = 56;
    private static final int LOOKUP_SERVER_BASIC_AUTH_CREDENTIALS_ORDINAL = 58;
    private static final int LOOK_UP_PROXY_FOR_URL_ORDINAL = 37;
    public static final Interface.Manager<NetworkContext, NetworkContext.Proxy> MANAGER = new Interface.Manager<NetworkContext, NetworkContext.Proxy>() { // from class: org.chromium.network.mojom.NetworkContext_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.NetworkContext";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkContext.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NetworkContext impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkContext[] buildArray(int size) {
            return new NetworkContext[size];
        }
    };
    private static final int NOTIFY_EXTERNAL_CACHE_HIT_ORDINAL = 12;
    private static final int PRECONNECT_SOCKETS_ORDINAL = 43;
    private static final int QUEUE_REPORT_ORDINAL = 21;
    private static final int QUEUE_SIGNED_EXCHANGE_REPORT_ORDINAL = 22;
    private static final int RESET_URL_LOADER_FACTORIES_ORDINAL = 2;
    private static final int RESOLVE_HOST_ORDINAL = 46;
    private static final int SAVE_HTTP_AUTH_CACHE_PROXY_ENTRIES_ORDINAL = 55;
    private static final int SET_ACCEPT_LANGUAGE_ORDINAL = 26;
    private static final int SET_CLIENT_ORDINAL = 0;
    private static final int SET_CORS_ORIGIN_ACCESS_LISTS_FOR_ORIGIN_ORDINAL = 52;
    private static final int SET_CT_POLICY_ORDINAL = 28;
    private static final int SET_DOCUMENT_REPORTING_ENDPOINTS_ORDINAL = 20;
    private static final int SET_ENABLE_REFERRERS_ORDINAL = 27;
    private static final int SET_EXPECT_CT_TEST_REPORT_ORDINAL = 30;
    private static final int SET_NETWORK_CONDITIONS_ORDINAL = 25;
    private static final int SET_SCT_AUDITING_ENABLED_ORDINAL = 64;
    private static final int SET_SPLIT_AUTH_CACHE_BY_NETWORK_ISOLATION_KEY_ORDINAL = 54;
    private static final int VERIFY_CERTIFICATE_FOR_TESTING_ORDINAL = 60;
    private static final int VERIFY_CERT_FOR_SIGNED_EXCHANGE_ORDINAL = 48;

    NetworkContext_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NetworkContext.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setClient(NetworkContextClient client) {
            NetworkContextSetClientParams _message = new NetworkContextSetClientParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createUrlLoaderFactory(InterfaceRequest<UrlLoaderFactory> urlLoaderFactory, UrlLoaderFactoryParams params) {
            NetworkContextCreateUrlLoaderFactoryParams _message = new NetworkContextCreateUrlLoaderFactoryParams();
            _message.urlLoaderFactory = urlLoaderFactory;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void resetUrlLoaderFactories() {
            NetworkContextResetUrlLoaderFactoriesParams _message = new NetworkContextResetUrlLoaderFactoriesParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getCookieManager(InterfaceRequest<CookieManager> cookieManager) {
            NetworkContextGetCookieManagerParams _message = new NetworkContextGetCookieManagerParams();
            _message.cookieManager = cookieManager;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getRestrictedCookieManager(InterfaceRequest<RestrictedCookieManager> restrictedCookieManager, int role, Origin origin, IsolationInfo isolationInfo, CookieAccessObserver cookieObserver) {
            NetworkContextGetRestrictedCookieManagerParams _message = new NetworkContextGetRestrictedCookieManagerParams();
            _message.restrictedCookieManager = restrictedCookieManager;
            _message.role = role;
            _message.origin = origin;
            _message.isolationInfo = isolationInfo;
            _message.cookieObserver = cookieObserver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getHasTrustTokensAnswerer(InterfaceRequest<HasTrustTokensAnswerer> hasTrustTokensAnswerer, Origin topFrameOrigin) {
            NetworkContextGetHasTrustTokensAnswererParams _message = new NetworkContextGetHasTrustTokensAnswererParams();
            _message.hasTrustTokensAnswerer = hasTrustTokensAnswerer;
            _message.topFrameOrigin = topFrameOrigin;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearTrustTokenData(ClearDataFilter filter, ClearTrustTokenDataResponse callback) {
            NetworkContextClearTrustTokenDataParams _message = new NetworkContextClearTrustTokenDataParams();
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new NetworkContextClearTrustTokenDataResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getStoredTrustTokenCounts(GetStoredTrustTokenCountsResponse callback) {
            NetworkContextGetStoredTrustTokenCountsParams _message = new NetworkContextGetStoredTrustTokenCountsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new NetworkContextGetStoredTrustTokenCountsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void deleteStoredTrustTokens(Origin issuer, DeleteStoredTrustTokensResponse callback) {
            NetworkContextDeleteStoredTrustTokensParams _message = new NetworkContextDeleteStoredTrustTokensParams();
            _message.issuer = issuer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new NetworkContextDeleteStoredTrustTokensResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearNetworkingHistoryBetween(Time startTime, Time endTime, ClearNetworkingHistoryBetweenResponse callback) {
            NetworkContextClearNetworkingHistoryBetweenParams _message = new NetworkContextClearNetworkingHistoryBetweenParams();
            _message.startTime = startTime;
            _message.endTime = endTime;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9, 1, 0L)), new NetworkContextClearNetworkingHistoryBetweenResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearHttpCache(Time startTime, Time endTime, ClearDataFilter filter, ClearHttpCacheResponse callback) {
            NetworkContextClearHttpCacheParams _message = new NetworkContextClearHttpCacheParams();
            _message.startTime = startTime;
            _message.endTime = endTime;
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10, 1, 0L)), new NetworkContextClearHttpCacheResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void computeHttpCacheSize(Time startTime, Time endTime, ComputeHttpCacheSizeResponse callback) {
            NetworkContextComputeHttpCacheSizeParams _message = new NetworkContextComputeHttpCacheSizeParams();
            _message.startTime = startTime;
            _message.endTime = endTime;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11, 1, 0L)), new NetworkContextComputeHttpCacheSizeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void notifyExternalCacheHit(Url url, String httpMethod, NetworkIsolationKey key, boolean isSubframeDocumentResource) {
            NetworkContextNotifyExternalCacheHitParams _message = new NetworkContextNotifyExternalCacheHitParams();
            _message.url = url;
            _message.httpMethod = httpMethod;
            _message.key = key;
            _message.isSubframeDocumentResource = isSubframeDocumentResource;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearHostCache(ClearDataFilter filter, ClearHostCacheResponse callback) {
            NetworkContextClearHostCacheParams _message = new NetworkContextClearHostCacheParams();
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13, 1, 0L)), new NetworkContextClearHostCacheResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearHttpAuthCache(Time startTime, Time endTime, ClearHttpAuthCacheResponse callback) {
            NetworkContextClearHttpAuthCacheParams _message = new NetworkContextClearHttpAuthCacheParams();
            _message.startTime = startTime;
            _message.endTime = endTime;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14, 1, 0L)), new NetworkContextClearHttpAuthCacheResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearReportingCacheReports(ClearDataFilter filter, ClearReportingCacheReportsResponse callback) {
            NetworkContextClearReportingCacheReportsParams _message = new NetworkContextClearReportingCacheReportsParams();
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15, 1, 0L)), new NetworkContextClearReportingCacheReportsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearReportingCacheClients(ClearDataFilter filter, ClearReportingCacheClientsResponse callback) {
            NetworkContextClearReportingCacheClientsParams _message = new NetworkContextClearReportingCacheClientsParams();
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16, 1, 0L)), new NetworkContextClearReportingCacheClientsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearNetworkErrorLogging(ClearDataFilter filter, ClearNetworkErrorLoggingResponse callback) {
            NetworkContextClearNetworkErrorLoggingParams _message = new NetworkContextClearNetworkErrorLoggingParams();
            _message.filter = filter;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17, 1, 0L)), new NetworkContextClearNetworkErrorLoggingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearDomainReliability(ClearDataFilter filter, int mode, ClearDomainReliabilityResponse callback) {
            NetworkContextClearDomainReliabilityParams _message = new NetworkContextClearDomainReliabilityParams();
            _message.filter = filter;
            _message.mode = mode;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18, 1, 0L)), new NetworkContextClearDomainReliabilityResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getDomainReliabilityJson(GetDomainReliabilityJsonResponse callback) {
            NetworkContextGetDomainReliabilityJsonParams _message = new NetworkContextGetDomainReliabilityJsonParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19, 1, 0L)), new NetworkContextGetDomainReliabilityJsonResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setDocumentReportingEndpoints(Origin origin, NetworkIsolationKey networkIsolationKey, Map<String, String> endpoints) {
            NetworkContextSetDocumentReportingEndpointsParams _message = new NetworkContextSetDocumentReportingEndpointsParams();
            _message.origin = origin;
            _message.networkIsolationKey = networkIsolationKey;
            _message.endpoints = endpoints;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void queueReport(String type, String group, Url url, NetworkIsolationKey networkIsolationKey, String userAgent, DictionaryValue body) {
            NetworkContextQueueReportParams _message = new NetworkContextQueueReportParams();
            _message.type = type;
            _message.group = group;
            _message.url = url;
            _message.networkIsolationKey = networkIsolationKey;
            _message.userAgent = userAgent;
            _message.body = body;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void queueSignedExchangeReport(SignedExchangeReport report, NetworkIsolationKey networkIsolationKey) {
            NetworkContextQueueSignedExchangeReportParams _message = new NetworkContextQueueSignedExchangeReportParams();
            _message.report = report;
            _message.networkIsolationKey = networkIsolationKey;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void closeAllConnections(CloseAllConnectionsResponse callback) {
            NetworkContextCloseAllConnectionsParams _message = new NetworkContextCloseAllConnectionsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23, 1, 0L)), new NetworkContextCloseAllConnectionsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void closeIdleConnections(CloseIdleConnectionsResponse callback) {
            NetworkContextCloseIdleConnectionsParams _message = new NetworkContextCloseIdleConnectionsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24, 1, 0L)), new NetworkContextCloseIdleConnectionsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setNetworkConditions(UnguessableToken throttlingProfileId, NetworkConditions conditions) {
            NetworkContextSetNetworkConditionsParams _message = new NetworkContextSetNetworkConditionsParams();
            _message.throttlingProfileId = throttlingProfileId;
            _message.conditions = conditions;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setAcceptLanguage(String newAcceptLanguage) {
            NetworkContextSetAcceptLanguageParams _message = new NetworkContextSetAcceptLanguageParams();
            _message.newAcceptLanguage = newAcceptLanguage;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(26)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setEnableReferrers(boolean enableReferrers) {
            NetworkContextSetEnableReferrersParams _message = new NetworkContextSetEnableReferrersParams();
            _message.enableReferrers = enableReferrers;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(27)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setCtPolicy(CtPolicy ctPolicy) {
            NetworkContextSetCtPolicyParams _message = new NetworkContextSetCtPolicyParams();
            _message.ctPolicy = ctPolicy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(28)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void addExpectCt(String host, Time expiry, boolean enforce, Url reportUri, NetworkIsolationKey networkIsolationKey, AddExpectCtResponse callback) {
            NetworkContextAddExpectCtParams _message = new NetworkContextAddExpectCtParams();
            _message.host = host;
            _message.expiry = expiry;
            _message.enforce = enforce;
            _message.reportUri = reportUri;
            _message.networkIsolationKey = networkIsolationKey;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(29, 1, 0L)), new NetworkContextAddExpectCtResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setExpectCtTestReport(Url reportUri, SetExpectCtTestReportResponse callback) {
            NetworkContextSetExpectCtTestReportParams _message = new NetworkContextSetExpectCtTestReportParams();
            _message.reportUri = reportUri;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(30, 1, 0L)), new NetworkContextSetExpectCtTestReportResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getExpectCtState(String domain, NetworkIsolationKey networkIsolationKey, GetExpectCtStateResponse callback) {
            NetworkContextGetExpectCtStateParams _message = new NetworkContextGetExpectCtStateParams();
            _message.domain = domain;
            _message.networkIsolationKey = networkIsolationKey;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(31, 1, 0L)), new NetworkContextGetExpectCtStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createUdpSocket(InterfaceRequest<UdpSocket> receiver, UdpSocketListener listener) {
            NetworkContextCreateUdpSocketParams _message = new NetworkContextCreateUdpSocketParams();
            _message.receiver = receiver;
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(32)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createTcpServerSocket(IpEndPoint localAddr, int backlog, MutableNetworkTrafficAnnotationTag trafficAnnotation, InterfaceRequest<TcpServerSocket> socket, CreateTcpServerSocketResponse callback) {
            NetworkContextCreateTcpServerSocketParams _message = new NetworkContextCreateTcpServerSocketParams();
            _message.localAddr = localAddr;
            _message.backlog = backlog;
            _message.trafficAnnotation = trafficAnnotation;
            _message.socket = socket;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(33, 1, 0L)), new NetworkContextCreateTcpServerSocketResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createTcpConnectedSocket(IpEndPoint localAddr, AddressList remoteAddrList, TcpConnectedSocketOptions tcpConnectedSocketOptions, MutableNetworkTrafficAnnotationTag trafficAnnotation, InterfaceRequest<TcpConnectedSocket> socket, SocketObserver observer, CreateTcpConnectedSocketResponse callback) {
            NetworkContextCreateTcpConnectedSocketParams _message = new NetworkContextCreateTcpConnectedSocketParams();
            _message.localAddr = localAddr;
            _message.remoteAddrList = remoteAddrList;
            _message.tcpConnectedSocketOptions = tcpConnectedSocketOptions;
            _message.trafficAnnotation = trafficAnnotation;
            _message.socket = socket;
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(34, 1, 0L)), new NetworkContextCreateTcpConnectedSocketResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createTcpBoundSocket(IpEndPoint localAddr, MutableNetworkTrafficAnnotationTag trafficAnnotation, InterfaceRequest<TcpBoundSocket> socket, CreateTcpBoundSocketResponse callback) {
            NetworkContextCreateTcpBoundSocketParams _message = new NetworkContextCreateTcpBoundSocketParams();
            _message.localAddr = localAddr;
            _message.trafficAnnotation = trafficAnnotation;
            _message.socket = socket;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(35, 1, 0L)), new NetworkContextCreateTcpBoundSocketResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createProxyResolvingSocketFactory(InterfaceRequest<ProxyResolvingSocketFactory> factory) {
            NetworkContextCreateProxyResolvingSocketFactoryParams _message = new NetworkContextCreateProxyResolvingSocketFactoryParams();
            _message.factory = factory;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(36)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void lookUpProxyForUrl(Url url, NetworkIsolationKey networkIsolationKey, ProxyLookupClient proxyLookupClient) {
            NetworkContextLookUpProxyForUrlParams _message = new NetworkContextLookUpProxyForUrlParams();
            _message.url = url;
            _message.networkIsolationKey = networkIsolationKey;
            _message.proxyLookupClient = proxyLookupClient;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(37)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void forceReloadProxyConfig(ForceReloadProxyConfigResponse callback) {
            NetworkContextForceReloadProxyConfigParams _message = new NetworkContextForceReloadProxyConfigParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(38, 1, 0L)), new NetworkContextForceReloadProxyConfigResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void clearBadProxiesCache(ClearBadProxiesCacheResponse callback) {
            NetworkContextClearBadProxiesCacheParams _message = new NetworkContextClearBadProxiesCacheParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(39, 1, 0L)), new NetworkContextClearBadProxiesCacheResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createWebSocket(Url url, String[] requestedProtocols, SiteForCookies siteForCookies, IsolationInfo isolationInfo, HttpHeader[] additionalHeaders, int processId, Origin origin, int options, MutableNetworkTrafficAnnotationTag trafficAnnotation, WebSocketHandshakeClient handshakeClient, UrlLoaderNetworkServiceObserver urlLoaderNetworkObserver, WebSocketAuthenticationHandler authHandler, TrustedHeaderClient headerClient, UnguessableToken throttlingProfileId) {
            NetworkContextCreateWebSocketParams _message = new NetworkContextCreateWebSocketParams();
            _message.url = url;
            _message.requestedProtocols = requestedProtocols;
            _message.siteForCookies = siteForCookies;
            _message.isolationInfo = isolationInfo;
            _message.additionalHeaders = additionalHeaders;
            _message.processId = processId;
            _message.origin = origin;
            _message.options = options;
            _message.trafficAnnotation = trafficAnnotation;
            _message.handshakeClient = handshakeClient;
            _message.urlLoaderNetworkObserver = urlLoaderNetworkObserver;
            _message.authHandler = authHandler;
            _message.headerClient = headerClient;
            _message.throttlingProfileId = throttlingProfileId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(40)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createWebTransport(Url url, Origin origin, NetworkIsolationKey networkIsolationKey, WebTransportCertificateFingerprint[] fingerprints, WebTransportHandshakeClient handshakeClient) {
            NetworkContextCreateWebTransportParams _message = new NetworkContextCreateWebTransportParams();
            _message.url = url;
            _message.origin = origin;
            _message.networkIsolationKey = networkIsolationKey;
            _message.fingerprints = fingerprints;
            _message.handshakeClient = handshakeClient;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(41)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createNetLogExporter(InterfaceRequest<NetLogExporter> receiver) {
            NetworkContextCreateNetLogExporterParams _message = new NetworkContextCreateNetLogExporterParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(42)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void preconnectSockets(int numStreams, Url url, boolean allowCredentials, NetworkIsolationKey networkIsolationKey) {
            NetworkContextPreconnectSocketsParams _message = new NetworkContextPreconnectSocketsParams();
            _message.numStreams = numStreams;
            _message.url = url;
            _message.allowCredentials = allowCredentials;
            _message.networkIsolationKey = networkIsolationKey;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(43)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createP2pSocketManager(NetworkIsolationKey networkIsolationKey, P2pTrustedSocketManagerClient client, InterfaceRequest<P2pTrustedSocketManager> trustedSocketManager, InterfaceRequest<P2pSocketManager> socketManager) {
            NetworkContextCreateP2pSocketManagerParams _message = new NetworkContextCreateP2pSocketManagerParams();
            _message.networkIsolationKey = networkIsolationKey;
            _message.client = client;
            _message.trustedSocketManager = trustedSocketManager;
            _message.socketManager = socketManager;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(44)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createMdnsResponder(InterfaceRequest<MdnsResponder> responderReceiver) {
            NetworkContextCreateMdnsResponderParams _message = new NetworkContextCreateMdnsResponderParams();
            _message.responderReceiver = responderReceiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(45)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void resolveHost(HostPortPair host, NetworkIsolationKey networkIsolationKey, ResolveHostParameters optionalParameters, ResolveHostClient responseClient) {
            NetworkContextResolveHostParams _message = new NetworkContextResolveHostParams();
            _message.host = host;
            _message.networkIsolationKey = networkIsolationKey;
            _message.optionalParameters = optionalParameters;
            _message.responseClient = responseClient;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(46)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void createHostResolver(DnsConfigOverrides configOverrides, InterfaceRequest<HostResolver> hostResolver) {
            NetworkContextCreateHostResolverParams _message = new NetworkContextCreateHostResolverParams();
            _message.configOverrides = configOverrides;
            _message.hostResolver = hostResolver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(47)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void verifyCertForSignedExchange(X509Certificate certificate, Url url, NetworkIsolationKey networkIsolationKey, String ocspResponse, String sctList, VerifyCertForSignedExchangeResponse callback) {
            NetworkContextVerifyCertForSignedExchangeParams _message = new NetworkContextVerifyCertForSignedExchangeParams();
            _message.certificate = certificate;
            _message.url = url;
            _message.networkIsolationKey = networkIsolationKey;
            _message.ocspResponse = ocspResponse;
            _message.sctList = sctList;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(48, 1, 0L)), new NetworkContextVerifyCertForSignedExchangeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void addHsts(String host, Time expiry, boolean includeSubdomains, AddHstsResponse callback) {
            NetworkContextAddHstsParams _message = new NetworkContextAddHstsParams();
            _message.host = host;
            _message.expiry = expiry;
            _message.includeSubdomains = includeSubdomains;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(49, 1, 0L)), new NetworkContextAddHstsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void isHstsActiveForHost(String host, IsHstsActiveForHostResponse callback) {
            NetworkContextIsHstsActiveForHostParams _message = new NetworkContextIsHstsActiveForHostParams();
            _message.host = host;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(50, 1, 0L)), new NetworkContextIsHstsActiveForHostResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getHstsState(String domain, GetHstsStateResponse callback) {
            NetworkContextGetHstsStateParams _message = new NetworkContextGetHstsStateParams();
            _message.domain = domain;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(51, 1, 0L)), new NetworkContextGetHstsStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setCorsOriginAccessListsForOrigin(Origin sourceOrigin, CorsOriginPattern[] allowPatterns, CorsOriginPattern[] blockPatterns, SetCorsOriginAccessListsForOriginResponse callback) {
            NetworkContextSetCorsOriginAccessListsForOriginParams _message = new NetworkContextSetCorsOriginAccessListsForOriginParams();
            _message.sourceOrigin = sourceOrigin;
            _message.allowPatterns = allowPatterns;
            _message.blockPatterns = blockPatterns;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(52, 1, 0L)), new NetworkContextSetCorsOriginAccessListsForOriginResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void deleteDynamicDataForHost(String host, DeleteDynamicDataForHostResponse callback) {
            NetworkContextDeleteDynamicDataForHostParams _message = new NetworkContextDeleteDynamicDataForHostParams();
            _message.host = host;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(53, 1, 0L)), new NetworkContextDeleteDynamicDataForHostResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setSplitAuthCacheByNetworkIsolationKey(boolean splitAuthCacheByNetworkIsolationKey) {
            NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams _message = new NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams();
            _message.splitAuthCacheByNetworkIsolationKey = splitAuthCacheByNetworkIsolationKey;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(54)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void saveHttpAuthCacheProxyEntries(SaveHttpAuthCacheProxyEntriesResponse callback) {
            NetworkContextSaveHttpAuthCacheProxyEntriesParams _message = new NetworkContextSaveHttpAuthCacheProxyEntriesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(55, 1, 0L)), new NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void loadHttpAuthCacheProxyEntries(UnguessableToken cacheKey, LoadHttpAuthCacheProxyEntriesResponse callback) {
            NetworkContextLoadHttpAuthCacheProxyEntriesParams _message = new NetworkContextLoadHttpAuthCacheProxyEntriesParams();
            _message.cacheKey = cacheKey;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(56, 1, 0L)), new NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void addAuthCacheEntry(AuthChallengeInfo challenge, NetworkIsolationKey networkIsolationKey, AuthCredentials credentials, AddAuthCacheEntryResponse callback) {
            NetworkContextAddAuthCacheEntryParams _message = new NetworkContextAddAuthCacheEntryParams();
            _message.challenge = challenge;
            _message.networkIsolationKey = networkIsolationKey;
            _message.credentials = credentials;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(57, 1, 0L)), new NetworkContextAddAuthCacheEntryResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void lookupServerBasicAuthCredentials(Url url, NetworkIsolationKey networkIsolationKey, LookupServerBasicAuthCredentialsResponse callback) {
            NetworkContextLookupServerBasicAuthCredentialsParams _message = new NetworkContextLookupServerBasicAuthCredentialsParams();
            _message.url = url;
            _message.networkIsolationKey = networkIsolationKey;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(58, 1, 0L)), new NetworkContextLookupServerBasicAuthCredentialsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void enableStaticKeyPinningForTesting(EnableStaticKeyPinningForTestingResponse callback) {
            NetworkContextEnableStaticKeyPinningForTestingParams _message = new NetworkContextEnableStaticKeyPinningForTestingParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(59, 1, 0L)), new NetworkContextEnableStaticKeyPinningForTestingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void verifyCertificateForTesting(X509Certificate certificate, String hostname, String ocspResponse, String sctList, VerifyCertificateForTestingResponse callback) {
            NetworkContextVerifyCertificateForTestingParams _message = new NetworkContextVerifyCertificateForTestingParams();
            _message.certificate = certificate;
            _message.hostname = hostname;
            _message.ocspResponse = ocspResponse;
            _message.sctList = sctList;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(60, 1, 0L)), new NetworkContextVerifyCertificateForTestingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void addDomainReliabilityContextForTesting(Url origin, Url uploadUrl, AddDomainReliabilityContextForTestingResponse callback) {
            NetworkContextAddDomainReliabilityContextForTestingParams _message = new NetworkContextAddDomainReliabilityContextForTestingParams();
            _message.origin = origin;
            _message.uploadUrl = uploadUrl;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(61, 1, 0L)), new NetworkContextAddDomainReliabilityContextForTestingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void forceDomainReliabilityUploadsForTesting(ForceDomainReliabilityUploadsForTestingResponse callback) {
            NetworkContextForceDomainReliabilityUploadsForTestingParams _message = new NetworkContextForceDomainReliabilityUploadsForTestingParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(62, 1, 0L)), new NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void getOriginPolicyManager(InterfaceRequest<OriginPolicyManager> originPolicyManager) {
            NetworkContextGetOriginPolicyManagerParams _message = new NetworkContextGetOriginPolicyManagerParams();
            _message.originPolicyManager = originPolicyManager;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(63)));
        }

        @Override // org.chromium.network.mojom.NetworkContext
        public void setSctAuditingEnabled(boolean enabled) {
            NetworkContextSetSctAuditingEnabledParams _message = new NetworkContextSetSctAuditingEnabledParams();
            _message.enabled = enabled;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(64)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NetworkContext> {
        Stub(Core core, NetworkContext impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NetworkContext_Internal.MANAGER, messageWithHeader);
                    case 0:
                        getImpl().setClient(NetworkContextSetClientParams.deserialize(messageWithHeader.getPayload()).client);
                        return true;
                    case 1:
                        NetworkContextCreateUrlLoaderFactoryParams data = NetworkContextCreateUrlLoaderFactoryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createUrlLoaderFactory(data.urlLoaderFactory, data.params);
                        return true;
                    case 2:
                        NetworkContextResetUrlLoaderFactoriesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resetUrlLoaderFactories();
                        return true;
                    case 3:
                        NetworkContextGetCookieManagerParams data2 = NetworkContextGetCookieManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getCookieManager(data2.cookieManager);
                        return true;
                    case 4:
                        NetworkContextGetRestrictedCookieManagerParams data3 = NetworkContextGetRestrictedCookieManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getRestrictedCookieManager(data3.restrictedCookieManager, data3.role, data3.origin, data3.isolationInfo, data3.cookieObserver);
                        return true;
                    case 5:
                        NetworkContextGetHasTrustTokensAnswererParams data4 = NetworkContextGetHasTrustTokensAnswererParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getHasTrustTokensAnswerer(data4.hasTrustTokensAnswerer, data4.topFrameOrigin);
                        return true;
                    case 12:
                        NetworkContextNotifyExternalCacheHitParams data5 = NetworkContextNotifyExternalCacheHitParams.deserialize(messageWithHeader.getPayload());
                        getImpl().notifyExternalCacheHit(data5.url, data5.httpMethod, data5.key, data5.isSubframeDocumentResource);
                        return true;
                    case 20:
                        NetworkContextSetDocumentReportingEndpointsParams data6 = NetworkContextSetDocumentReportingEndpointsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setDocumentReportingEndpoints(data6.origin, data6.networkIsolationKey, data6.endpoints);
                        return true;
                    case 21:
                        NetworkContextQueueReportParams data7 = NetworkContextQueueReportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().queueReport(data7.type, data7.group, data7.url, data7.networkIsolationKey, data7.userAgent, data7.body);
                        return true;
                    case 22:
                        NetworkContextQueueSignedExchangeReportParams data8 = NetworkContextQueueSignedExchangeReportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().queueSignedExchangeReport(data8.report, data8.networkIsolationKey);
                        return true;
                    case 25:
                        NetworkContextSetNetworkConditionsParams data9 = NetworkContextSetNetworkConditionsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setNetworkConditions(data9.throttlingProfileId, data9.conditions);
                        return true;
                    case 26:
                        NetworkContextSetAcceptLanguageParams data10 = NetworkContextSetAcceptLanguageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setAcceptLanguage(data10.newAcceptLanguage);
                        return true;
                    case 27:
                        NetworkContextSetEnableReferrersParams data11 = NetworkContextSetEnableReferrersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setEnableReferrers(data11.enableReferrers);
                        return true;
                    case 28:
                        NetworkContextSetCtPolicyParams data12 = NetworkContextSetCtPolicyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCtPolicy(data12.ctPolicy);
                        return true;
                    case 32:
                        NetworkContextCreateUdpSocketParams data13 = NetworkContextCreateUdpSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createUdpSocket(data13.receiver, data13.listener);
                        return true;
                    case 36:
                        NetworkContextCreateProxyResolvingSocketFactoryParams data14 = NetworkContextCreateProxyResolvingSocketFactoryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createProxyResolvingSocketFactory(data14.factory);
                        return true;
                    case 37:
                        NetworkContextLookUpProxyForUrlParams data15 = NetworkContextLookUpProxyForUrlParams.deserialize(messageWithHeader.getPayload());
                        getImpl().lookUpProxyForUrl(data15.url, data15.networkIsolationKey, data15.proxyLookupClient);
                        return true;
                    case 40:
                        NetworkContextCreateWebSocketParams data16 = NetworkContextCreateWebSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createWebSocket(data16.url, data16.requestedProtocols, data16.siteForCookies, data16.isolationInfo, data16.additionalHeaders, data16.processId, data16.origin, data16.options, data16.trafficAnnotation, data16.handshakeClient, data16.urlLoaderNetworkObserver, data16.authHandler, data16.headerClient, data16.throttlingProfileId);
                        return true;
                    case 41:
                        NetworkContextCreateWebTransportParams data17 = NetworkContextCreateWebTransportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createWebTransport(data17.url, data17.origin, data17.networkIsolationKey, data17.fingerprints, data17.handshakeClient);
                        return true;
                    case 42:
                        NetworkContextCreateNetLogExporterParams data18 = NetworkContextCreateNetLogExporterParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createNetLogExporter(data18.receiver);
                        return true;
                    case 43:
                        NetworkContextPreconnectSocketsParams data19 = NetworkContextPreconnectSocketsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().preconnectSockets(data19.numStreams, data19.url, data19.allowCredentials, data19.networkIsolationKey);
                        return true;
                    case 44:
                        NetworkContextCreateP2pSocketManagerParams data20 = NetworkContextCreateP2pSocketManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createP2pSocketManager(data20.networkIsolationKey, data20.client, data20.trustedSocketManager, data20.socketManager);
                        return true;
                    case 45:
                        NetworkContextCreateMdnsResponderParams data21 = NetworkContextCreateMdnsResponderParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createMdnsResponder(data21.responderReceiver);
                        return true;
                    case 46:
                        NetworkContextResolveHostParams data22 = NetworkContextResolveHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resolveHost(data22.host, data22.networkIsolationKey, data22.optionalParameters, data22.responseClient);
                        return true;
                    case 47:
                        NetworkContextCreateHostResolverParams data23 = NetworkContextCreateHostResolverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createHostResolver(data23.configOverrides, data23.hostResolver);
                        return true;
                    case 54:
                        NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams data24 = NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSplitAuthCacheByNetworkIsolationKey(data24.splitAuthCacheByNetworkIsolationKey);
                        return true;
                    case 63:
                        NetworkContextGetOriginPolicyManagerParams data25 = NetworkContextGetOriginPolicyManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getOriginPolicyManager(data25.originPolicyManager);
                        return true;
                    case 64:
                        NetworkContextSetSctAuditingEnabledParams data26 = NetworkContextSetSctAuditingEnabledParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSctAuditingEnabled(data26.enabled);
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NetworkContext_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 12:
                    case 20:
                    case 21:
                    case 22:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 32:
                    case 36:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 54:
                    default:
                        return false;
                    case 6:
                        NetworkContextClearTrustTokenDataParams data = NetworkContextClearTrustTokenDataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearTrustTokenData(data.filter, new NetworkContextClearTrustTokenDataResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        NetworkContextGetStoredTrustTokenCountsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getStoredTrustTokenCounts(new NetworkContextGetStoredTrustTokenCountsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        NetworkContextDeleteStoredTrustTokensParams data2 = NetworkContextDeleteStoredTrustTokensParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteStoredTrustTokens(data2.issuer, new NetworkContextDeleteStoredTrustTokensResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 9:
                        NetworkContextClearNetworkingHistoryBetweenParams data3 = NetworkContextClearNetworkingHistoryBetweenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearNetworkingHistoryBetween(data3.startTime, data3.endTime, new NetworkContextClearNetworkingHistoryBetweenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 10:
                        NetworkContextClearHttpCacheParams data4 = NetworkContextClearHttpCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearHttpCache(data4.startTime, data4.endTime, data4.filter, new NetworkContextClearHttpCacheResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 11:
                        NetworkContextComputeHttpCacheSizeParams data5 = NetworkContextComputeHttpCacheSizeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().computeHttpCacheSize(data5.startTime, data5.endTime, new NetworkContextComputeHttpCacheSizeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 13:
                        NetworkContextClearHostCacheParams data6 = NetworkContextClearHostCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearHostCache(data6.filter, new NetworkContextClearHostCacheResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 14:
                        NetworkContextClearHttpAuthCacheParams data7 = NetworkContextClearHttpAuthCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearHttpAuthCache(data7.startTime, data7.endTime, new NetworkContextClearHttpAuthCacheResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 15:
                        NetworkContextClearReportingCacheReportsParams data8 = NetworkContextClearReportingCacheReportsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearReportingCacheReports(data8.filter, new NetworkContextClearReportingCacheReportsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 16:
                        NetworkContextClearReportingCacheClientsParams data9 = NetworkContextClearReportingCacheClientsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearReportingCacheClients(data9.filter, new NetworkContextClearReportingCacheClientsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 17:
                        NetworkContextClearNetworkErrorLoggingParams data10 = NetworkContextClearNetworkErrorLoggingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearNetworkErrorLogging(data10.filter, new NetworkContextClearNetworkErrorLoggingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 18:
                        NetworkContextClearDomainReliabilityParams data11 = NetworkContextClearDomainReliabilityParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearDomainReliability(data11.filter, data11.mode, new NetworkContextClearDomainReliabilityResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 19:
                        NetworkContextGetDomainReliabilityJsonParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDomainReliabilityJson(new NetworkContextGetDomainReliabilityJsonResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 23:
                        NetworkContextCloseAllConnectionsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().closeAllConnections(new NetworkContextCloseAllConnectionsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 24:
                        NetworkContextCloseIdleConnectionsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().closeIdleConnections(new NetworkContextCloseIdleConnectionsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 29:
                        NetworkContextAddExpectCtParams data12 = NetworkContextAddExpectCtParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addExpectCt(data12.host, data12.expiry, data12.enforce, data12.reportUri, data12.networkIsolationKey, new NetworkContextAddExpectCtResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 30:
                        NetworkContextSetExpectCtTestReportParams data13 = NetworkContextSetExpectCtTestReportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setExpectCtTestReport(data13.reportUri, new NetworkContextSetExpectCtTestReportResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 31:
                        NetworkContextGetExpectCtStateParams data14 = NetworkContextGetExpectCtStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getExpectCtState(data14.domain, data14.networkIsolationKey, new NetworkContextGetExpectCtStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 33:
                        NetworkContextCreateTcpServerSocketParams data15 = NetworkContextCreateTcpServerSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createTcpServerSocket(data15.localAddr, data15.backlog, data15.trafficAnnotation, data15.socket, new NetworkContextCreateTcpServerSocketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 34:
                        NetworkContextCreateTcpConnectedSocketParams data16 = NetworkContextCreateTcpConnectedSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createTcpConnectedSocket(data16.localAddr, data16.remoteAddrList, data16.tcpConnectedSocketOptions, data16.trafficAnnotation, data16.socket, data16.observer, new NetworkContextCreateTcpConnectedSocketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 35:
                        NetworkContextCreateTcpBoundSocketParams data17 = NetworkContextCreateTcpBoundSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createTcpBoundSocket(data17.localAddr, data17.trafficAnnotation, data17.socket, new NetworkContextCreateTcpBoundSocketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 38:
                        NetworkContextForceReloadProxyConfigParams.deserialize(messageWithHeader.getPayload());
                        getImpl().forceReloadProxyConfig(new NetworkContextForceReloadProxyConfigResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 39:
                        NetworkContextClearBadProxiesCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearBadProxiesCache(new NetworkContextClearBadProxiesCacheResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 48:
                        NetworkContextVerifyCertForSignedExchangeParams data18 = NetworkContextVerifyCertForSignedExchangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().verifyCertForSignedExchange(data18.certificate, data18.url, data18.networkIsolationKey, data18.ocspResponse, data18.sctList, new NetworkContextVerifyCertForSignedExchangeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 49:
                        NetworkContextAddHstsParams data19 = NetworkContextAddHstsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addHsts(data19.host, data19.expiry, data19.includeSubdomains, new NetworkContextAddHstsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 50:
                        NetworkContextIsHstsActiveForHostParams data20 = NetworkContextIsHstsActiveForHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isHstsActiveForHost(data20.host, new NetworkContextIsHstsActiveForHostResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 51:
                        NetworkContextGetHstsStateParams data21 = NetworkContextGetHstsStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getHstsState(data21.domain, new NetworkContextGetHstsStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 52:
                        NetworkContextSetCorsOriginAccessListsForOriginParams data22 = NetworkContextSetCorsOriginAccessListsForOriginParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCorsOriginAccessListsForOrigin(data22.sourceOrigin, data22.allowPatterns, data22.blockPatterns, new NetworkContextSetCorsOriginAccessListsForOriginResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 53:
                        NetworkContextDeleteDynamicDataForHostParams data23 = NetworkContextDeleteDynamicDataForHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteDynamicDataForHost(data23.host, new NetworkContextDeleteDynamicDataForHostResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 55:
                        NetworkContextSaveHttpAuthCacheProxyEntriesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().saveHttpAuthCacheProxyEntries(new NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 56:
                        NetworkContextLoadHttpAuthCacheProxyEntriesParams data24 = NetworkContextLoadHttpAuthCacheProxyEntriesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().loadHttpAuthCacheProxyEntries(data24.cacheKey, new NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 57:
                        NetworkContextAddAuthCacheEntryParams data25 = NetworkContextAddAuthCacheEntryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addAuthCacheEntry(data25.challenge, data25.networkIsolationKey, data25.credentials, new NetworkContextAddAuthCacheEntryResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 58:
                        NetworkContextLookupServerBasicAuthCredentialsParams data26 = NetworkContextLookupServerBasicAuthCredentialsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().lookupServerBasicAuthCredentials(data26.url, data26.networkIsolationKey, new NetworkContextLookupServerBasicAuthCredentialsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 59:
                        NetworkContextEnableStaticKeyPinningForTestingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enableStaticKeyPinningForTesting(new NetworkContextEnableStaticKeyPinningForTestingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 60:
                        NetworkContextVerifyCertificateForTestingParams data27 = NetworkContextVerifyCertificateForTestingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().verifyCertificateForTesting(data27.certificate, data27.hostname, data27.ocspResponse, data27.sctList, new NetworkContextVerifyCertificateForTestingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 61:
                        NetworkContextAddDomainReliabilityContextForTestingParams data28 = NetworkContextAddDomainReliabilityContextForTestingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addDomainReliabilityContextForTesting(data28.origin, data28.uploadUrl, new NetworkContextAddDomainReliabilityContextForTestingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 62:
                        NetworkContextForceDomainReliabilityUploadsForTestingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().forceDomainReliabilityUploadsForTesting(new NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkContextClient client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetClientParams(int version) {
            super(16, version);
        }

        public NetworkContextSetClientParams() {
            this(0);
        }

        public static NetworkContextSetClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetClientParams result = new NetworkContextSetClientParams(elementsOrVersion);
                result.client = (NetworkContextClient) decoder0.readServiceInterface(8, false, NetworkContextClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.client, 8, false, NetworkContextClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateUrlLoaderFactoryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public UrlLoaderFactoryParams params;
        public InterfaceRequest<UrlLoaderFactory> urlLoaderFactory;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateUrlLoaderFactoryParams(int version) {
            super(24, version);
        }

        public NetworkContextCreateUrlLoaderFactoryParams() {
            this(0);
        }

        public static NetworkContextCreateUrlLoaderFactoryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateUrlLoaderFactoryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateUrlLoaderFactoryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateUrlLoaderFactoryParams result = new NetworkContextCreateUrlLoaderFactoryParams(elementsOrVersion);
                result.urlLoaderFactory = decoder0.readInterfaceRequest(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.params = UrlLoaderFactoryParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.urlLoaderFactory, 8, false);
            encoder0.encode((Struct) this.params, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextResetUrlLoaderFactoriesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextResetUrlLoaderFactoriesParams(int version) {
            super(8, version);
        }

        public NetworkContextResetUrlLoaderFactoriesParams() {
            this(0);
        }

        public static NetworkContextResetUrlLoaderFactoriesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextResetUrlLoaderFactoriesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextResetUrlLoaderFactoriesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextResetUrlLoaderFactoriesParams result = new NetworkContextResetUrlLoaderFactoriesParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetCookieManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<CookieManager> cookieManager;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetCookieManagerParams(int version) {
            super(16, version);
        }

        public NetworkContextGetCookieManagerParams() {
            this(0);
        }

        public static NetworkContextGetCookieManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetCookieManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetCookieManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetCookieManagerParams result = new NetworkContextGetCookieManagerParams(elementsOrVersion);
                result.cookieManager = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.cookieManager, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetRestrictedCookieManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public CookieAccessObserver cookieObserver;
        public IsolationInfo isolationInfo;
        public Origin origin;
        public InterfaceRequest<RestrictedCookieManager> restrictedCookieManager;
        public int role;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetRestrictedCookieManagerParams(int version) {
            super(40, version);
        }

        public NetworkContextGetRestrictedCookieManagerParams() {
            this(0);
        }

        public static NetworkContextGetRestrictedCookieManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetRestrictedCookieManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetRestrictedCookieManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetRestrictedCookieManagerParams result = new NetworkContextGetRestrictedCookieManagerParams(elementsOrVersion);
                result.restrictedCookieManager = decoder0.readInterfaceRequest(8, false);
                int readInt = decoder0.readInt(12);
                result.role = readInt;
                RestrictedCookieManagerRole.validate(readInt);
                result.role = RestrictedCookieManagerRole.toKnownValue(result.role);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.origin = Origin.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.isolationInfo = IsolationInfo.decode(decoder12);
                result.cookieObserver = (CookieAccessObserver) decoder0.readServiceInterface(32, true, CookieAccessObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.restrictedCookieManager, 8, false);
            encoder0.encode(this.role, 12);
            encoder0.encode((Struct) this.origin, 16, false);
            encoder0.encode((Struct) this.isolationInfo, 24, false);
            encoder0.encode(this.cookieObserver, 32, true, CookieAccessObserver.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetHasTrustTokensAnswererParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<HasTrustTokensAnswerer> hasTrustTokensAnswerer;
        public Origin topFrameOrigin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetHasTrustTokensAnswererParams(int version) {
            super(24, version);
        }

        public NetworkContextGetHasTrustTokensAnswererParams() {
            this(0);
        }

        public static NetworkContextGetHasTrustTokensAnswererParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetHasTrustTokensAnswererParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetHasTrustTokensAnswererParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetHasTrustTokensAnswererParams result = new NetworkContextGetHasTrustTokensAnswererParams(elementsOrVersion);
                result.hasTrustTokensAnswerer = decoder0.readInterfaceRequest(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.topFrameOrigin = Origin.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.hasTrustTokensAnswerer, 8, false);
            encoder0.encode((Struct) this.topFrameOrigin, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearTrustTokenDataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearTrustTokenDataParams(int version) {
            super(16, version);
        }

        public NetworkContextClearTrustTokenDataParams() {
            this(0);
        }

        public static NetworkContextClearTrustTokenDataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearTrustTokenDataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearTrustTokenDataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearTrustTokenDataParams result = new NetworkContextClearTrustTokenDataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearTrustTokenDataResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearTrustTokenDataResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearTrustTokenDataResponseParams() {
            this(0);
        }

        public static NetworkContextClearTrustTokenDataResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearTrustTokenDataResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearTrustTokenDataResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearTrustTokenDataResponseParams result = new NetworkContextClearTrustTokenDataResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearTrustTokenDataResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearTrustTokenDataResponse mCallback;

        NetworkContextClearTrustTokenDataResponseParamsForwardToCallback(NetworkContext.ClearTrustTokenDataResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearTrustTokenDataResponseParamsProxyToResponder implements NetworkContext.ClearTrustTokenDataResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearTrustTokenDataResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearTrustTokenDataResponseParams _response = new NetworkContextClearTrustTokenDataResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetStoredTrustTokenCountsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetStoredTrustTokenCountsParams(int version) {
            super(8, version);
        }

        public NetworkContextGetStoredTrustTokenCountsParams() {
            this(0);
        }

        public static NetworkContextGetStoredTrustTokenCountsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetStoredTrustTokenCountsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetStoredTrustTokenCountsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetStoredTrustTokenCountsParams result = new NetworkContextGetStoredTrustTokenCountsParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextGetStoredTrustTokenCountsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public StoredTrustTokensForIssuer[] tokens;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetStoredTrustTokenCountsResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextGetStoredTrustTokenCountsResponseParams() {
            this(0);
        }

        public static NetworkContextGetStoredTrustTokenCountsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetStoredTrustTokenCountsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetStoredTrustTokenCountsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetStoredTrustTokenCountsResponseParams result = new NetworkContextGetStoredTrustTokenCountsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.tokens = new StoredTrustTokensForIssuer[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.tokens[i1] = StoredTrustTokensForIssuer.decode(decoder2);
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
            StoredTrustTokensForIssuer[] storedTrustTokensForIssuerArr = this.tokens;
            if (storedTrustTokensForIssuerArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(storedTrustTokensForIssuerArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                StoredTrustTokensForIssuer[] storedTrustTokensForIssuerArr2 = this.tokens;
                if (i0 < storedTrustTokensForIssuerArr2.length) {
                    encoder1.encode((Struct) storedTrustTokensForIssuerArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetStoredTrustTokenCountsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.GetStoredTrustTokenCountsResponse mCallback;

        NetworkContextGetStoredTrustTokenCountsResponseParamsForwardToCallback(NetworkContext.GetStoredTrustTokenCountsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 2)) {
                    return false;
                }
                NetworkContextGetStoredTrustTokenCountsResponseParams response = NetworkContextGetStoredTrustTokenCountsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.tokens);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetStoredTrustTokenCountsResponseParamsProxyToResponder implements NetworkContext.GetStoredTrustTokenCountsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextGetStoredTrustTokenCountsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(StoredTrustTokensForIssuer[] tokens) {
            NetworkContextGetStoredTrustTokenCountsResponseParams _response = new NetworkContextGetStoredTrustTokenCountsResponseParams();
            _response.tokens = tokens;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextDeleteStoredTrustTokensParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin issuer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextDeleteStoredTrustTokensParams(int version) {
            super(16, version);
        }

        public NetworkContextDeleteStoredTrustTokensParams() {
            this(0);
        }

        public static NetworkContextDeleteStoredTrustTokensParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextDeleteStoredTrustTokensParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextDeleteStoredTrustTokensParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextDeleteStoredTrustTokensParams result = new NetworkContextDeleteStoredTrustTokensParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.issuer = Origin.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.issuer, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextDeleteStoredTrustTokensResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextDeleteStoredTrustTokensResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextDeleteStoredTrustTokensResponseParams() {
            this(0);
        }

        public static NetworkContextDeleteStoredTrustTokensResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextDeleteStoredTrustTokensResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextDeleteStoredTrustTokensResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextDeleteStoredTrustTokensResponseParams result = new NetworkContextDeleteStoredTrustTokensResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                DeleteStoredTrustTokensStatus.validate(readInt);
                result.status = DeleteStoredTrustTokensStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextDeleteStoredTrustTokensResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.DeleteStoredTrustTokensResponse mCallback;

        NetworkContextDeleteStoredTrustTokensResponseParamsForwardToCallback(NetworkContext.DeleteStoredTrustTokensResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 2)) {
                    return false;
                }
                NetworkContextDeleteStoredTrustTokensResponseParams response = NetworkContextDeleteStoredTrustTokensResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextDeleteStoredTrustTokensResponseParamsProxyToResponder implements NetworkContext.DeleteStoredTrustTokensResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextDeleteStoredTrustTokensResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            NetworkContextDeleteStoredTrustTokensResponseParams _response = new NetworkContextDeleteStoredTrustTokensResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearNetworkingHistoryBetweenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Time endTime;
        public Time startTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearNetworkingHistoryBetweenParams(int version) {
            super(24, version);
        }

        public NetworkContextClearNetworkingHistoryBetweenParams() {
            this(0);
        }

        public static NetworkContextClearNetworkingHistoryBetweenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearNetworkingHistoryBetweenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearNetworkingHistoryBetweenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearNetworkingHistoryBetweenParams result = new NetworkContextClearNetworkingHistoryBetweenParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.startTime = Time.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.endTime = Time.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.startTime, 8, false);
            encoder0.encode((Struct) this.endTime, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearNetworkingHistoryBetweenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearNetworkingHistoryBetweenResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearNetworkingHistoryBetweenResponseParams() {
            this(0);
        }

        public static NetworkContextClearNetworkingHistoryBetweenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearNetworkingHistoryBetweenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearNetworkingHistoryBetweenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearNetworkingHistoryBetweenResponseParams result = new NetworkContextClearNetworkingHistoryBetweenResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearNetworkingHistoryBetweenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearNetworkingHistoryBetweenResponse mCallback;

        NetworkContextClearNetworkingHistoryBetweenResponseParamsForwardToCallback(NetworkContext.ClearNetworkingHistoryBetweenResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(9, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearNetworkingHistoryBetweenResponseParamsProxyToResponder implements NetworkContext.ClearNetworkingHistoryBetweenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearNetworkingHistoryBetweenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearNetworkingHistoryBetweenResponseParams _response = new NetworkContextClearNetworkingHistoryBetweenResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(9, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHttpCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Time endTime;
        public ClearDataFilter filter;
        public Time startTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHttpCacheParams(int version) {
            super(32, version);
        }

        public NetworkContextClearHttpCacheParams() {
            this(0);
        }

        public static NetworkContextClearHttpCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHttpCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHttpCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHttpCacheParams result = new NetworkContextClearHttpCacheParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.startTime = Time.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.endTime = Time.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.filter = ClearDataFilter.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.startTime, 8, false);
            encoder0.encode((Struct) this.endTime, 16, false);
            encoder0.encode((Struct) this.filter, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHttpCacheResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHttpCacheResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearHttpCacheResponseParams() {
            this(0);
        }

        public static NetworkContextClearHttpCacheResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHttpCacheResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHttpCacheResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHttpCacheResponseParams result = new NetworkContextClearHttpCacheResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHttpCacheResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearHttpCacheResponse mCallback;

        NetworkContextClearHttpCacheResponseParamsForwardToCallback(NetworkContext.ClearHttpCacheResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(10, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHttpCacheResponseParamsProxyToResponder implements NetworkContext.ClearHttpCacheResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearHttpCacheResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearHttpCacheResponseParams _response = new NetworkContextClearHttpCacheResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(10, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextComputeHttpCacheSizeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Time endTime;
        public Time startTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextComputeHttpCacheSizeParams(int version) {
            super(24, version);
        }

        public NetworkContextComputeHttpCacheSizeParams() {
            this(0);
        }

        public static NetworkContextComputeHttpCacheSizeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextComputeHttpCacheSizeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextComputeHttpCacheSizeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextComputeHttpCacheSizeParams result = new NetworkContextComputeHttpCacheSizeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.startTime = Time.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.endTime = Time.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.startTime, 8, false);
            encoder0.encode((Struct) this.endTime, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextComputeHttpCacheSizeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isUpperBound;
        public long sizeOrError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextComputeHttpCacheSizeResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextComputeHttpCacheSizeResponseParams() {
            this(0);
        }

        public static NetworkContextComputeHttpCacheSizeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextComputeHttpCacheSizeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextComputeHttpCacheSizeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextComputeHttpCacheSizeResponseParams result = new NetworkContextComputeHttpCacheSizeResponseParams(elementsOrVersion);
                result.isUpperBound = decoder0.readBoolean(8, 0);
                result.sizeOrError = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isUpperBound, 8, 0);
            encoder0.encode(this.sizeOrError, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextComputeHttpCacheSizeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ComputeHttpCacheSizeResponse mCallback;

        NetworkContextComputeHttpCacheSizeResponseParamsForwardToCallback(NetworkContext.ComputeHttpCacheSizeResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(11, 2)) {
                    return false;
                }
                NetworkContextComputeHttpCacheSizeResponseParams response = NetworkContextComputeHttpCacheSizeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.isUpperBound), Long.valueOf(response.sizeOrError));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextComputeHttpCacheSizeResponseParamsProxyToResponder implements NetworkContext.ComputeHttpCacheSizeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextComputeHttpCacheSizeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean isUpperBound, Long sizeOrError) {
            NetworkContextComputeHttpCacheSizeResponseParams _response = new NetworkContextComputeHttpCacheSizeResponseParams();
            _response.isUpperBound = isUpperBound.booleanValue();
            _response.sizeOrError = sizeOrError.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(11, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextNotifyExternalCacheHitParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String httpMethod;
        public boolean isSubframeDocumentResource;
        public NetworkIsolationKey key;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextNotifyExternalCacheHitParams(int version) {
            super(40, version);
        }

        public NetworkContextNotifyExternalCacheHitParams() {
            this(0);
        }

        public static NetworkContextNotifyExternalCacheHitParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextNotifyExternalCacheHitParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextNotifyExternalCacheHitParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextNotifyExternalCacheHitParams result = new NetworkContextNotifyExternalCacheHitParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.httpMethod = decoder0.readString(16, false);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.key = NetworkIsolationKey.decode(decoder12);
                result.isSubframeDocumentResource = decoder0.readBoolean(32, 0);
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
            encoder0.encode(this.httpMethod, 16, false);
            encoder0.encode((Struct) this.key, 24, false);
            encoder0.encode(this.isSubframeDocumentResource, 32, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHostCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHostCacheParams(int version) {
            super(16, version);
        }

        public NetworkContextClearHostCacheParams() {
            this(0);
        }

        public static NetworkContextClearHostCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHostCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHostCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHostCacheParams result = new NetworkContextClearHostCacheParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHostCacheResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHostCacheResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearHostCacheResponseParams() {
            this(0);
        }

        public static NetworkContextClearHostCacheResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHostCacheResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHostCacheResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHostCacheResponseParams result = new NetworkContextClearHostCacheResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHostCacheResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearHostCacheResponse mCallback;

        NetworkContextClearHostCacheResponseParamsForwardToCallback(NetworkContext.ClearHostCacheResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(13, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHostCacheResponseParamsProxyToResponder implements NetworkContext.ClearHostCacheResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearHostCacheResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearHostCacheResponseParams _response = new NetworkContextClearHostCacheResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(13, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHttpAuthCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Time endTime;
        public Time startTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHttpAuthCacheParams(int version) {
            super(24, version);
        }

        public NetworkContextClearHttpAuthCacheParams() {
            this(0);
        }

        public static NetworkContextClearHttpAuthCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHttpAuthCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHttpAuthCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHttpAuthCacheParams result = new NetworkContextClearHttpAuthCacheParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.startTime = Time.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.endTime = Time.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.startTime, 8, false);
            encoder0.encode((Struct) this.endTime, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearHttpAuthCacheResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearHttpAuthCacheResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearHttpAuthCacheResponseParams() {
            this(0);
        }

        public static NetworkContextClearHttpAuthCacheResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearHttpAuthCacheResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearHttpAuthCacheResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearHttpAuthCacheResponseParams result = new NetworkContextClearHttpAuthCacheResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHttpAuthCacheResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearHttpAuthCacheResponse mCallback;

        NetworkContextClearHttpAuthCacheResponseParamsForwardToCallback(NetworkContext.ClearHttpAuthCacheResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(14, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearHttpAuthCacheResponseParamsProxyToResponder implements NetworkContext.ClearHttpAuthCacheResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearHttpAuthCacheResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearHttpAuthCacheResponseParams _response = new NetworkContextClearHttpAuthCacheResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(14, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearReportingCacheReportsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearReportingCacheReportsParams(int version) {
            super(16, version);
        }

        public NetworkContextClearReportingCacheReportsParams() {
            this(0);
        }

        public static NetworkContextClearReportingCacheReportsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearReportingCacheReportsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearReportingCacheReportsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearReportingCacheReportsParams result = new NetworkContextClearReportingCacheReportsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearReportingCacheReportsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearReportingCacheReportsResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearReportingCacheReportsResponseParams() {
            this(0);
        }

        public static NetworkContextClearReportingCacheReportsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearReportingCacheReportsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearReportingCacheReportsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearReportingCacheReportsResponseParams result = new NetworkContextClearReportingCacheReportsResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearReportingCacheReportsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearReportingCacheReportsResponse mCallback;

        NetworkContextClearReportingCacheReportsResponseParamsForwardToCallback(NetworkContext.ClearReportingCacheReportsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(15, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearReportingCacheReportsResponseParamsProxyToResponder implements NetworkContext.ClearReportingCacheReportsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearReportingCacheReportsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearReportingCacheReportsResponseParams _response = new NetworkContextClearReportingCacheReportsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(15, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearReportingCacheClientsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearReportingCacheClientsParams(int version) {
            super(16, version);
        }

        public NetworkContextClearReportingCacheClientsParams() {
            this(0);
        }

        public static NetworkContextClearReportingCacheClientsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearReportingCacheClientsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearReportingCacheClientsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearReportingCacheClientsParams result = new NetworkContextClearReportingCacheClientsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearReportingCacheClientsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearReportingCacheClientsResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearReportingCacheClientsResponseParams() {
            this(0);
        }

        public static NetworkContextClearReportingCacheClientsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearReportingCacheClientsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearReportingCacheClientsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearReportingCacheClientsResponseParams result = new NetworkContextClearReportingCacheClientsResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearReportingCacheClientsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearReportingCacheClientsResponse mCallback;

        NetworkContextClearReportingCacheClientsResponseParamsForwardToCallback(NetworkContext.ClearReportingCacheClientsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(16, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearReportingCacheClientsResponseParamsProxyToResponder implements NetworkContext.ClearReportingCacheClientsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearReportingCacheClientsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearReportingCacheClientsResponseParams _response = new NetworkContextClearReportingCacheClientsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(16, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearNetworkErrorLoggingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearNetworkErrorLoggingParams(int version) {
            super(16, version);
        }

        public NetworkContextClearNetworkErrorLoggingParams() {
            this(0);
        }

        public static NetworkContextClearNetworkErrorLoggingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearNetworkErrorLoggingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearNetworkErrorLoggingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearNetworkErrorLoggingParams result = new NetworkContextClearNetworkErrorLoggingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearNetworkErrorLoggingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearNetworkErrorLoggingResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearNetworkErrorLoggingResponseParams() {
            this(0);
        }

        public static NetworkContextClearNetworkErrorLoggingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearNetworkErrorLoggingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearNetworkErrorLoggingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearNetworkErrorLoggingResponseParams result = new NetworkContextClearNetworkErrorLoggingResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearNetworkErrorLoggingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearNetworkErrorLoggingResponse mCallback;

        NetworkContextClearNetworkErrorLoggingResponseParamsForwardToCallback(NetworkContext.ClearNetworkErrorLoggingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(17, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearNetworkErrorLoggingResponseParamsProxyToResponder implements NetworkContext.ClearNetworkErrorLoggingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearNetworkErrorLoggingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearNetworkErrorLoggingResponseParams _response = new NetworkContextClearNetworkErrorLoggingResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(17, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearDomainReliabilityParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ClearDataFilter filter;
        public int mode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearDomainReliabilityParams(int version) {
            super(24, version);
        }

        public NetworkContextClearDomainReliabilityParams() {
            this(0);
        }

        public static NetworkContextClearDomainReliabilityParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearDomainReliabilityParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearDomainReliabilityParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearDomainReliabilityParams result = new NetworkContextClearDomainReliabilityParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.filter = ClearDataFilter.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.mode = readInt;
                NetworkContext.DomainReliabilityClearMode.validate(readInt);
                result.mode = NetworkContext.DomainReliabilityClearMode.toKnownValue(result.mode);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.filter, 8, true);
            encoder0.encode(this.mode, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearDomainReliabilityResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearDomainReliabilityResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearDomainReliabilityResponseParams() {
            this(0);
        }

        public static NetworkContextClearDomainReliabilityResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearDomainReliabilityResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearDomainReliabilityResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearDomainReliabilityResponseParams result = new NetworkContextClearDomainReliabilityResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearDomainReliabilityResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearDomainReliabilityResponse mCallback;

        NetworkContextClearDomainReliabilityResponseParamsForwardToCallback(NetworkContext.ClearDomainReliabilityResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(18, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearDomainReliabilityResponseParamsProxyToResponder implements NetworkContext.ClearDomainReliabilityResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearDomainReliabilityResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearDomainReliabilityResponseParams _response = new NetworkContextClearDomainReliabilityResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(18, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetDomainReliabilityJsonParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetDomainReliabilityJsonParams(int version) {
            super(8, version);
        }

        public NetworkContextGetDomainReliabilityJsonParams() {
            this(0);
        }

        public static NetworkContextGetDomainReliabilityJsonParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetDomainReliabilityJsonParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetDomainReliabilityJsonParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetDomainReliabilityJsonParams result = new NetworkContextGetDomainReliabilityJsonParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextGetDomainReliabilityJsonResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Value data;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetDomainReliabilityJsonResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextGetDomainReliabilityJsonResponseParams() {
            this(0);
        }

        public static NetworkContextGetDomainReliabilityJsonResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetDomainReliabilityJsonResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetDomainReliabilityJsonResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetDomainReliabilityJsonResponseParams result = new NetworkContextGetDomainReliabilityJsonResponseParams(elementsOrVersion);
                result.data = Value.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.data, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetDomainReliabilityJsonResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.GetDomainReliabilityJsonResponse mCallback;

        NetworkContextGetDomainReliabilityJsonResponseParamsForwardToCallback(NetworkContext.GetDomainReliabilityJsonResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(19, 2)) {
                    return false;
                }
                NetworkContextGetDomainReliabilityJsonResponseParams response = NetworkContextGetDomainReliabilityJsonResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.data);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetDomainReliabilityJsonResponseParamsProxyToResponder implements NetworkContext.GetDomainReliabilityJsonResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextGetDomainReliabilityJsonResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Value data) {
            NetworkContextGetDomainReliabilityJsonResponseParams _response = new NetworkContextGetDomainReliabilityJsonResponseParams();
            _response.data = data;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(19, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetDocumentReportingEndpointsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Map<String, String> endpoints;
        public NetworkIsolationKey networkIsolationKey;
        public Origin origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetDocumentReportingEndpointsParams(int version) {
            super(32, version);
        }

        public NetworkContextSetDocumentReportingEndpointsParams() {
            this(0);
        }

        public static NetworkContextSetDocumentReportingEndpointsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetDocumentReportingEndpointsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetDocumentReportingEndpointsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetDocumentReportingEndpointsParams result = new NetworkContextSetDocumentReportingEndpointsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                decoder13.readDataHeaderForMap();
                Decoder decoder2 = decoder13.readPointer(8, false);
                DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
                String[] keys0 = new String[si2.elementsOrVersion];
                for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                    keys0[i2] = decoder2.readString((i2 * 8) + 8, false);
                }
                Decoder decoder22 = decoder13.readPointer(16, false);
                DataHeader si22 = decoder22.readDataHeaderForPointerArray(keys0.length);
                String[] values0 = new String[si22.elementsOrVersion];
                for (int i22 = 0; i22 < si22.elementsOrVersion; i22++) {
                    values0[i22] = decoder22.readString((i22 * 8) + 8, false);
                }
                result.endpoints = new HashMap();
                for (int index0 = 0; index0 < keys0.length; index0++) {
                    result.endpoints.put(keys0[index0], values0[index0]);
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
            encoder0.encode((Struct) this.origin, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            if (this.endpoints == null) {
                encoder0.encodeNullPointer(24, false);
                return;
            }
            Encoder encoder1 = encoder0.encoderForMap(24);
            int size0 = this.endpoints.size();
            String[] keys0 = new String[size0];
            String[] values0 = new String[size0];
            int index0 = 0;
            for (Map.Entry<String, String> entry0 : this.endpoints.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                index0++;
            }
            Encoder encoder2 = encoder1.encodePointerArray(keys0.length, 8, -1);
            for (int i1 = 0; i1 < keys0.length; i1++) {
                encoder2.encode(keys0[i1], (i1 * 8) + 8, false);
            }
            Encoder encoder22 = encoder1.encodePointerArray(values0.length, 16, -1);
            for (int i12 = 0; i12 < values0.length; i12++) {
                encoder22.encode(values0[i12], (i12 * 8) + 8, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextQueueReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public DictionaryValue body;
        public String group;
        public NetworkIsolationKey networkIsolationKey;
        public String type;
        public Url url;
        public String userAgent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextQueueReportParams(int version) {
            super(56, version);
        }

        public NetworkContextQueueReportParams() {
            this(0);
        }

        public static NetworkContextQueueReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextQueueReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextQueueReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextQueueReportParams result = new NetworkContextQueueReportParams(elementsOrVersion);
                result.type = decoder0.readString(8, false);
                result.group = decoder0.readString(16, false);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                result.userAgent = decoder0.readString(40, true);
                Decoder decoder13 = decoder0.readPointer(48, false);
                result.body = DictionaryValue.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.type, 8, false);
            encoder0.encode(this.group, 16, false);
            encoder0.encode((Struct) this.url, 24, false);
            encoder0.encode((Struct) this.networkIsolationKey, 32, false);
            encoder0.encode(this.userAgent, 40, true);
            encoder0.encode((Struct) this.body, 48, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextQueueSignedExchangeReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkIsolationKey networkIsolationKey;
        public SignedExchangeReport report;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextQueueSignedExchangeReportParams(int version) {
            super(24, version);
        }

        public NetworkContextQueueSignedExchangeReportParams() {
            this(0);
        }

        public static NetworkContextQueueSignedExchangeReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextQueueSignedExchangeReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextQueueSignedExchangeReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextQueueSignedExchangeReportParams result = new NetworkContextQueueSignedExchangeReportParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.report = SignedExchangeReport.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.report, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCloseAllConnectionsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCloseAllConnectionsParams(int version) {
            super(8, version);
        }

        public NetworkContextCloseAllConnectionsParams() {
            this(0);
        }

        public static NetworkContextCloseAllConnectionsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCloseAllConnectionsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCloseAllConnectionsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCloseAllConnectionsParams result = new NetworkContextCloseAllConnectionsParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCloseAllConnectionsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCloseAllConnectionsResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextCloseAllConnectionsResponseParams() {
            this(0);
        }

        public static NetworkContextCloseAllConnectionsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCloseAllConnectionsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCloseAllConnectionsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCloseAllConnectionsResponseParams result = new NetworkContextCloseAllConnectionsResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCloseAllConnectionsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.CloseAllConnectionsResponse mCallback;

        NetworkContextCloseAllConnectionsResponseParamsForwardToCallback(NetworkContext.CloseAllConnectionsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(23, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCloseAllConnectionsResponseParamsProxyToResponder implements NetworkContext.CloseAllConnectionsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextCloseAllConnectionsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextCloseAllConnectionsResponseParams _response = new NetworkContextCloseAllConnectionsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(23, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCloseIdleConnectionsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCloseIdleConnectionsParams(int version) {
            super(8, version);
        }

        public NetworkContextCloseIdleConnectionsParams() {
            this(0);
        }

        public static NetworkContextCloseIdleConnectionsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCloseIdleConnectionsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCloseIdleConnectionsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCloseIdleConnectionsParams result = new NetworkContextCloseIdleConnectionsParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCloseIdleConnectionsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCloseIdleConnectionsResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextCloseIdleConnectionsResponseParams() {
            this(0);
        }

        public static NetworkContextCloseIdleConnectionsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCloseIdleConnectionsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCloseIdleConnectionsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCloseIdleConnectionsResponseParams result = new NetworkContextCloseIdleConnectionsResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCloseIdleConnectionsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.CloseIdleConnectionsResponse mCallback;

        NetworkContextCloseIdleConnectionsResponseParamsForwardToCallback(NetworkContext.CloseIdleConnectionsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(24, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCloseIdleConnectionsResponseParamsProxyToResponder implements NetworkContext.CloseIdleConnectionsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextCloseIdleConnectionsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextCloseIdleConnectionsResponseParams _response = new NetworkContextCloseIdleConnectionsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(24, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetNetworkConditionsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkConditions conditions;
        public UnguessableToken throttlingProfileId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetNetworkConditionsParams(int version) {
            super(24, version);
        }

        public NetworkContextSetNetworkConditionsParams() {
            this(0);
        }

        public static NetworkContextSetNetworkConditionsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetNetworkConditionsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetNetworkConditionsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetNetworkConditionsParams result = new NetworkContextSetNetworkConditionsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.throttlingProfileId = UnguessableToken.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, true);
                result.conditions = NetworkConditions.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.throttlingProfileId, 8, false);
            encoder0.encode((Struct) this.conditions, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetAcceptLanguageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String newAcceptLanguage;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetAcceptLanguageParams(int version) {
            super(16, version);
        }

        public NetworkContextSetAcceptLanguageParams() {
            this(0);
        }

        public static NetworkContextSetAcceptLanguageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetAcceptLanguageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetAcceptLanguageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetAcceptLanguageParams result = new NetworkContextSetAcceptLanguageParams(elementsOrVersion);
                result.newAcceptLanguage = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.newAcceptLanguage, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetEnableReferrersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enableReferrers;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetEnableReferrersParams(int version) {
            super(16, version);
        }

        public NetworkContextSetEnableReferrersParams() {
            this(0);
        }

        public static NetworkContextSetEnableReferrersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetEnableReferrersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetEnableReferrersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetEnableReferrersParams result = new NetworkContextSetEnableReferrersParams(elementsOrVersion);
                result.enableReferrers = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enableReferrers, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetCtPolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CtPolicy ctPolicy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetCtPolicyParams(int version) {
            super(16, version);
        }

        public NetworkContextSetCtPolicyParams() {
            this(0);
        }

        public static NetworkContextSetCtPolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetCtPolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetCtPolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetCtPolicyParams result = new NetworkContextSetCtPolicyParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.ctPolicy = CtPolicy.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.ctPolicy, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddExpectCtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enforce;
        public Time expiry;
        public String host;
        public NetworkIsolationKey networkIsolationKey;
        public Url reportUri;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddExpectCtParams(int version) {
            super(48, version);
        }

        public NetworkContextAddExpectCtParams() {
            this(0);
        }

        public static NetworkContextAddExpectCtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddExpectCtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddExpectCtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddExpectCtParams result = new NetworkContextAddExpectCtParams(elementsOrVersion);
                result.host = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.expiry = Time.decode(decoder1);
                result.enforce = decoder0.readBoolean(24, 0);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.reportUri = Url.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(40, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
            encoder0.encode((Struct) this.expiry, 16, false);
            encoder0.encode(this.enforce, 24, 0);
            encoder0.encode((Struct) this.reportUri, 32, false);
            encoder0.encode((Struct) this.networkIsolationKey, 40, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextAddExpectCtResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddExpectCtResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextAddExpectCtResponseParams() {
            this(0);
        }

        public static NetworkContextAddExpectCtResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddExpectCtResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddExpectCtResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddExpectCtResponseParams result = new NetworkContextAddExpectCtResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddExpectCtResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.AddExpectCtResponse mCallback;

        NetworkContextAddExpectCtResponseParamsForwardToCallback(NetworkContext.AddExpectCtResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(29, 2)) {
                    return false;
                }
                NetworkContextAddExpectCtResponseParams response = NetworkContextAddExpectCtResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddExpectCtResponseParamsProxyToResponder implements NetworkContext.AddExpectCtResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextAddExpectCtResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            NetworkContextAddExpectCtResponseParams _response = new NetworkContextAddExpectCtResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(29, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetExpectCtTestReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url reportUri;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetExpectCtTestReportParams(int version) {
            super(16, version);
        }

        public NetworkContextSetExpectCtTestReportParams() {
            this(0);
        }

        public static NetworkContextSetExpectCtTestReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetExpectCtTestReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetExpectCtTestReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetExpectCtTestReportParams result = new NetworkContextSetExpectCtTestReportParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.reportUri = Url.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.reportUri, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextSetExpectCtTestReportResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetExpectCtTestReportResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextSetExpectCtTestReportResponseParams() {
            this(0);
        }

        public static NetworkContextSetExpectCtTestReportResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetExpectCtTestReportResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetExpectCtTestReportResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetExpectCtTestReportResponseParams result = new NetworkContextSetExpectCtTestReportResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSetExpectCtTestReportResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.SetExpectCtTestReportResponse mCallback;

        NetworkContextSetExpectCtTestReportResponseParamsForwardToCallback(NetworkContext.SetExpectCtTestReportResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(30, 2)) {
                    return false;
                }
                NetworkContextSetExpectCtTestReportResponseParams response = NetworkContextSetExpectCtTestReportResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSetExpectCtTestReportResponseParamsProxyToResponder implements NetworkContext.SetExpectCtTestReportResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextSetExpectCtTestReportResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            NetworkContextSetExpectCtTestReportResponseParams _response = new NetworkContextSetExpectCtTestReportResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(30, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetExpectCtStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String domain;
        public NetworkIsolationKey networkIsolationKey;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetExpectCtStateParams(int version) {
            super(24, version);
        }

        public NetworkContextGetExpectCtStateParams() {
            this(0);
        }

        public static NetworkContextGetExpectCtStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetExpectCtStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetExpectCtStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetExpectCtStateParams result = new NetworkContextGetExpectCtStateParams(elementsOrVersion);
                result.domain = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.domain, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextGetExpectCtStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DictionaryValue state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetExpectCtStateResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextGetExpectCtStateResponseParams() {
            this(0);
        }

        public static NetworkContextGetExpectCtStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetExpectCtStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetExpectCtStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetExpectCtStateResponseParams result = new NetworkContextGetExpectCtStateResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.state = DictionaryValue.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.state, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetExpectCtStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.GetExpectCtStateResponse mCallback;

        NetworkContextGetExpectCtStateResponseParamsForwardToCallback(NetworkContext.GetExpectCtStateResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(31, 2)) {
                    return false;
                }
                NetworkContextGetExpectCtStateResponseParams response = NetworkContextGetExpectCtStateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.state);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetExpectCtStateResponseParamsProxyToResponder implements NetworkContext.GetExpectCtStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextGetExpectCtStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DictionaryValue state) {
            NetworkContextGetExpectCtStateResponseParams _response = new NetworkContextGetExpectCtStateResponseParams();
            _response.state = state;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(31, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateUdpSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public UdpSocketListener listener;
        public InterfaceRequest<UdpSocket> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateUdpSocketParams(int version) {
            super(24, version);
        }

        public NetworkContextCreateUdpSocketParams() {
            this(0);
        }

        public static NetworkContextCreateUdpSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateUdpSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateUdpSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateUdpSocketParams result = new NetworkContextCreateUdpSocketParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                result.listener = (UdpSocketListener) decoder0.readServiceInterface(12, true, UdpSocketListener.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
            encoder0.encode(this.listener, 12, true, UdpSocketListener.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateTcpServerSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int backlog;
        public IpEndPoint localAddr;
        public InterfaceRequest<TcpServerSocket> socket;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpServerSocketParams(int version) {
            super(32, version);
        }

        public NetworkContextCreateTcpServerSocketParams() {
            this(0);
        }

        public static NetworkContextCreateTcpServerSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpServerSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpServerSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpServerSocketParams result = new NetworkContextCreateTcpServerSocketParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.localAddr = IpEndPoint.decode(decoder1);
                result.backlog = decoder0.readInt(16);
                result.socket = decoder0.readInterfaceRequest(20, false);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.localAddr, 8, false);
            encoder0.encode(this.backlog, 16);
            encoder0.encode((InterfaceRequest) this.socket, 20, false);
            encoder0.encode((Struct) this.trafficAnnotation, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextCreateTcpServerSocketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddrOut;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpServerSocketResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextCreateTcpServerSocketResponseParams() {
            this(0);
        }

        public static NetworkContextCreateTcpServerSocketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpServerSocketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpServerSocketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpServerSocketResponseParams result = new NetworkContextCreateTcpServerSocketResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.localAddrOut = IpEndPoint.decode(decoder1);
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
            encoder0.encode((Struct) this.localAddrOut, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpServerSocketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.CreateTcpServerSocketResponse mCallback;

        NetworkContextCreateTcpServerSocketResponseParamsForwardToCallback(NetworkContext.CreateTcpServerSocketResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(33, 2)) {
                    return false;
                }
                NetworkContextCreateTcpServerSocketResponseParams response = NetworkContextCreateTcpServerSocketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.localAddrOut);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpServerSocketResponseParamsProxyToResponder implements NetworkContext.CreateTcpServerSocketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextCreateTcpServerSocketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer result, IpEndPoint localAddrOut) {
            NetworkContextCreateTcpServerSocketResponseParams _response = new NetworkContextCreateTcpServerSocketResponseParams();
            _response.result = result.intValue();
            _response.localAddrOut = localAddrOut;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(33, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateTcpConnectedSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddr;
        public SocketObserver observer;
        public AddressList remoteAddrList;
        public InterfaceRequest<TcpConnectedSocket> socket;
        public TcpConnectedSocketOptions tcpConnectedSocketOptions;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpConnectedSocketParams(int version) {
            super(56, version);
        }

        public NetworkContextCreateTcpConnectedSocketParams() {
            this(0);
        }

        public static NetworkContextCreateTcpConnectedSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpConnectedSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpConnectedSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpConnectedSocketParams result = new NetworkContextCreateTcpConnectedSocketParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.localAddr = IpEndPoint.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.remoteAddrList = AddressList.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.tcpConnectedSocketOptions = TcpConnectedSocketOptions.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder14);
                result.socket = decoder0.readInterfaceRequest(40, false);
                result.observer = (SocketObserver) decoder0.readServiceInterface(44, true, SocketObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.localAddr, 8, true);
            encoder0.encode((Struct) this.remoteAddrList, 16, false);
            encoder0.encode((Struct) this.tcpConnectedSocketOptions, 24, true);
            encoder0.encode((Struct) this.trafficAnnotation, 32, false);
            encoder0.encode((InterfaceRequest) this.socket, 40, false);
            encoder0.encode(this.observer, 44, true, SocketObserver.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextCreateTcpConnectedSocketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddr;
        public IpEndPoint peerAddr;
        public DataPipe.ConsumerHandle receiveStream;
        public int result;
        public DataPipe.ProducerHandle sendStream;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpConnectedSocketResponseParams(int version) {
            super(40, version);
            this.receiveStream = InvalidHandle.INSTANCE;
            this.sendStream = InvalidHandle.INSTANCE;
        }

        public NetworkContextCreateTcpConnectedSocketResponseParams() {
            this(0);
        }

        public static NetworkContextCreateTcpConnectedSocketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpConnectedSocketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpConnectedSocketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpConnectedSocketResponseParams result = new NetworkContextCreateTcpConnectedSocketResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
                result.receiveStream = decoder0.readConsumerHandle(12, true);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.localAddr = IpEndPoint.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, true);
                result.peerAddr = IpEndPoint.decode(decoder12);
                result.sendStream = decoder0.readProducerHandle(32, true);
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
            encoder0.encode((Handle) this.receiveStream, 12, true);
            encoder0.encode((Struct) this.localAddr, 16, true);
            encoder0.encode((Struct) this.peerAddr, 24, true);
            encoder0.encode((Handle) this.sendStream, 32, true);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpConnectedSocketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.CreateTcpConnectedSocketResponse mCallback;

        NetworkContextCreateTcpConnectedSocketResponseParamsForwardToCallback(NetworkContext.CreateTcpConnectedSocketResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(34, 2)) {
                    return false;
                }
                NetworkContextCreateTcpConnectedSocketResponseParams response = NetworkContextCreateTcpConnectedSocketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.localAddr, response.peerAddr, response.receiveStream, response.sendStream);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpConnectedSocketResponseParamsProxyToResponder implements NetworkContext.CreateTcpConnectedSocketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextCreateTcpConnectedSocketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback5
        public void call(Integer result, IpEndPoint localAddr, IpEndPoint peerAddr, DataPipe.ConsumerHandle receiveStream, DataPipe.ProducerHandle sendStream) {
            NetworkContextCreateTcpConnectedSocketResponseParams _response = new NetworkContextCreateTcpConnectedSocketResponseParams();
            _response.result = result.intValue();
            _response.localAddr = localAddr;
            _response.peerAddr = peerAddr;
            _response.receiveStream = receiveStream;
            _response.sendStream = sendStream;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(34, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateTcpBoundSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddr;
        public InterfaceRequest<TcpBoundSocket> socket;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpBoundSocketParams(int version) {
            super(32, version);
        }

        public NetworkContextCreateTcpBoundSocketParams() {
            this(0);
        }

        public static NetworkContextCreateTcpBoundSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpBoundSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpBoundSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpBoundSocketParams result = new NetworkContextCreateTcpBoundSocketParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.localAddr = IpEndPoint.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder12);
                result.socket = decoder0.readInterfaceRequest(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.localAddr, 8, false);
            encoder0.encode((Struct) this.trafficAnnotation, 16, false);
            encoder0.encode((InterfaceRequest) this.socket, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextCreateTcpBoundSocketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddr;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateTcpBoundSocketResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextCreateTcpBoundSocketResponseParams() {
            this(0);
        }

        public static NetworkContextCreateTcpBoundSocketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateTcpBoundSocketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateTcpBoundSocketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateTcpBoundSocketResponseParams result = new NetworkContextCreateTcpBoundSocketResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.localAddr = IpEndPoint.decode(decoder1);
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
            encoder0.encode((Struct) this.localAddr, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpBoundSocketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.CreateTcpBoundSocketResponse mCallback;

        NetworkContextCreateTcpBoundSocketResponseParamsForwardToCallback(NetworkContext.CreateTcpBoundSocketResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(35, 2)) {
                    return false;
                }
                NetworkContextCreateTcpBoundSocketResponseParams response = NetworkContextCreateTcpBoundSocketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.localAddr);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextCreateTcpBoundSocketResponseParamsProxyToResponder implements NetworkContext.CreateTcpBoundSocketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextCreateTcpBoundSocketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer result, IpEndPoint localAddr) {
            NetworkContextCreateTcpBoundSocketResponseParams _response = new NetworkContextCreateTcpBoundSocketResponseParams();
            _response.result = result.intValue();
            _response.localAddr = localAddr;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(35, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateProxyResolvingSocketFactoryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<ProxyResolvingSocketFactory> factory;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateProxyResolvingSocketFactoryParams(int version) {
            super(16, version);
        }

        public NetworkContextCreateProxyResolvingSocketFactoryParams() {
            this(0);
        }

        public static NetworkContextCreateProxyResolvingSocketFactoryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateProxyResolvingSocketFactoryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateProxyResolvingSocketFactoryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateProxyResolvingSocketFactoryParams result = new NetworkContextCreateProxyResolvingSocketFactoryParams(elementsOrVersion);
                result.factory = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.factory, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextLookUpProxyForUrlParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkIsolationKey networkIsolationKey;
        public ProxyLookupClient proxyLookupClient;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextLookUpProxyForUrlParams(int version) {
            super(32, version);
        }

        public NetworkContextLookUpProxyForUrlParams() {
            this(0);
        }

        public static NetworkContextLookUpProxyForUrlParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextLookUpProxyForUrlParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextLookUpProxyForUrlParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextLookUpProxyForUrlParams result = new NetworkContextLookUpProxyForUrlParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                result.proxyLookupClient = (ProxyLookupClient) decoder0.readServiceInterface(24, false, ProxyLookupClient.MANAGER);
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
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            encoder0.encode(this.proxyLookupClient, 24, false, ProxyLookupClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextForceReloadProxyConfigParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextForceReloadProxyConfigParams(int version) {
            super(8, version);
        }

        public NetworkContextForceReloadProxyConfigParams() {
            this(0);
        }

        public static NetworkContextForceReloadProxyConfigParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextForceReloadProxyConfigParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextForceReloadProxyConfigParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextForceReloadProxyConfigParams result = new NetworkContextForceReloadProxyConfigParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextForceReloadProxyConfigResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextForceReloadProxyConfigResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextForceReloadProxyConfigResponseParams() {
            this(0);
        }

        public static NetworkContextForceReloadProxyConfigResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextForceReloadProxyConfigResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextForceReloadProxyConfigResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextForceReloadProxyConfigResponseParams result = new NetworkContextForceReloadProxyConfigResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextForceReloadProxyConfigResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ForceReloadProxyConfigResponse mCallback;

        NetworkContextForceReloadProxyConfigResponseParamsForwardToCallback(NetworkContext.ForceReloadProxyConfigResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(38, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextForceReloadProxyConfigResponseParamsProxyToResponder implements NetworkContext.ForceReloadProxyConfigResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextForceReloadProxyConfigResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextForceReloadProxyConfigResponseParams _response = new NetworkContextForceReloadProxyConfigResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(38, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearBadProxiesCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearBadProxiesCacheParams(int version) {
            super(8, version);
        }

        public NetworkContextClearBadProxiesCacheParams() {
            this(0);
        }

        public static NetworkContextClearBadProxiesCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearBadProxiesCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearBadProxiesCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearBadProxiesCacheParams result = new NetworkContextClearBadProxiesCacheParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextClearBadProxiesCacheResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextClearBadProxiesCacheResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextClearBadProxiesCacheResponseParams() {
            this(0);
        }

        public static NetworkContextClearBadProxiesCacheResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextClearBadProxiesCacheResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextClearBadProxiesCacheResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextClearBadProxiesCacheResponseParams result = new NetworkContextClearBadProxiesCacheResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearBadProxiesCacheResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ClearBadProxiesCacheResponse mCallback;

        NetworkContextClearBadProxiesCacheResponseParamsForwardToCallback(NetworkContext.ClearBadProxiesCacheResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(39, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextClearBadProxiesCacheResponseParamsProxyToResponder implements NetworkContext.ClearBadProxiesCacheResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextClearBadProxiesCacheResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextClearBadProxiesCacheResponseParams _response = new NetworkContextClearBadProxiesCacheResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(39, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateWebSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 112;
        private static final DataHeader[] VERSION_ARRAY;
        public HttpHeader[] additionalHeaders;
        public WebSocketAuthenticationHandler authHandler;
        public WebSocketHandshakeClient handshakeClient;
        public TrustedHeaderClient headerClient;
        public IsolationInfo isolationInfo;
        public int options;
        public Origin origin;
        public int processId;
        public String[] requestedProtocols;
        public SiteForCookies siteForCookies;
        public UnguessableToken throttlingProfileId;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;
        public Url url;
        public UrlLoaderNetworkServiceObserver urlLoaderNetworkObserver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(112, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateWebSocketParams(int version) {
            super(112, version);
        }

        public NetworkContextCreateWebSocketParams() {
            this(0);
        }

        public static NetworkContextCreateWebSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateWebSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateWebSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateWebSocketParams result = new NetworkContextCreateWebSocketParams(elementsOrVersion);
                result.url = Url.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.requestedProtocols = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.requestedProtocols[i1] = decoder1.readString((i1 * 8) + 8, false);
                }
                result.siteForCookies = SiteForCookies.decode(decoder0.readPointer(24, false));
                result.isolationInfo = IsolationInfo.decode(decoder0.readPointer(32, false));
                Decoder decoder12 = decoder0.readPointer(40, false);
                DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
                result.additionalHeaders = new HttpHeader[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder2 = decoder12.readPointer((i12 * 8) + 8, false);
                    result.additionalHeaders[i12] = HttpHeader.decode(decoder2);
                }
                result.processId = decoder0.readInt(48);
                result.options = decoder0.readInt(52);
                result.origin = Origin.decode(decoder0.readPointer(56, false));
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder0.readPointer(64, false));
                result.handshakeClient = (WebSocketHandshakeClient) decoder0.readServiceInterface(72, false, WebSocketHandshakeClient.MANAGER);
                result.urlLoaderNetworkObserver = (UrlLoaderNetworkServiceObserver) decoder0.readServiceInterface(80, true, UrlLoaderNetworkServiceObserver.MANAGER);
                result.authHandler = (WebSocketAuthenticationHandler) decoder0.readServiceInterface(88, true, WebSocketAuthenticationHandler.MANAGER);
                result.headerClient = (TrustedHeaderClient) decoder0.readServiceInterface(96, true, TrustedHeaderClient.MANAGER);
                result.throttlingProfileId = UnguessableToken.decode(decoder0.readPointer(104, true));
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
            String[] strArr = this.requestedProtocols;
            if (strArr == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 16, -1);
                int i0 = 0;
                while (true) {
                    String[] strArr2 = this.requestedProtocols;
                    if (i0 >= strArr2.length) {
                        break;
                    }
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode((Struct) this.siteForCookies, 24, false);
            encoder0.encode((Struct) this.isolationInfo, 32, false);
            HttpHeader[] httpHeaderArr = this.additionalHeaders;
            if (httpHeaderArr == null) {
                encoder0.encodeNullPointer(40, false);
            } else {
                Encoder encoder12 = encoder0.encodePointerArray(httpHeaderArr.length, 40, -1);
                int i02 = 0;
                while (true) {
                    HttpHeader[] httpHeaderArr2 = this.additionalHeaders;
                    if (i02 >= httpHeaderArr2.length) {
                        break;
                    }
                    encoder12.encode((Struct) httpHeaderArr2[i02], (i02 * 8) + 8, false);
                    i02++;
                }
            }
            encoder0.encode(this.processId, 48);
            encoder0.encode(this.options, 52);
            encoder0.encode((Struct) this.origin, 56, false);
            encoder0.encode((Struct) this.trafficAnnotation, 64, false);
            encoder0.encode(this.handshakeClient, 72, false, WebSocketHandshakeClient.MANAGER);
            encoder0.encode(this.urlLoaderNetworkObserver, 80, true, UrlLoaderNetworkServiceObserver.MANAGER);
            encoder0.encode(this.authHandler, 88, true, WebSocketAuthenticationHandler.MANAGER);
            encoder0.encode(this.headerClient, 96, true, TrustedHeaderClient.MANAGER);
            encoder0.encode((Struct) this.throttlingProfileId, 104, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateWebTransportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public WebTransportCertificateFingerprint[] fingerprints;
        public WebTransportHandshakeClient handshakeClient;
        public NetworkIsolationKey networkIsolationKey;
        public Origin origin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateWebTransportParams(int version) {
            super(48, version);
        }

        public NetworkContextCreateWebTransportParams() {
            this(0);
        }

        public static NetworkContextCreateWebTransportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateWebTransportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateWebTransportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateWebTransportParams result = new NetworkContextCreateWebTransportParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.origin = Origin.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                DataHeader si1 = decoder14.readDataHeaderForPointerArray(-1);
                result.fingerprints = new WebTransportCertificateFingerprint[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder14.readPointer((i1 * 8) + 8, false);
                    result.fingerprints[i1] = WebTransportCertificateFingerprint.decode(decoder2);
                }
                result.handshakeClient = (WebTransportHandshakeClient) decoder0.readServiceInterface(40, false, WebTransportHandshakeClient.MANAGER);
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
            encoder0.encode((Struct) this.origin, 16, false);
            encoder0.encode((Struct) this.networkIsolationKey, 24, false);
            WebTransportCertificateFingerprint[] webTransportCertificateFingerprintArr = this.fingerprints;
            if (webTransportCertificateFingerprintArr == null) {
                encoder0.encodeNullPointer(32, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(webTransportCertificateFingerprintArr.length, 32, -1);
                int i0 = 0;
                while (true) {
                    WebTransportCertificateFingerprint[] webTransportCertificateFingerprintArr2 = this.fingerprints;
                    if (i0 >= webTransportCertificateFingerprintArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) webTransportCertificateFingerprintArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode(this.handshakeClient, 40, false,  WebTransportHandshakeClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateNetLogExporterParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetLogExporter> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateNetLogExporterParams(int version) {
            super(16, version);
        }

        public NetworkContextCreateNetLogExporterParams() {
            this(0);
        }

        public static NetworkContextCreateNetLogExporterParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateNetLogExporterParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateNetLogExporterParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateNetLogExporterParams result = new NetworkContextCreateNetLogExporterParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextPreconnectSocketsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean allowCredentials;
        public NetworkIsolationKey networkIsolationKey;
        public int numStreams;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextPreconnectSocketsParams(int version) {
            super(32, version);
        }

        public NetworkContextPreconnectSocketsParams() {
            this(0);
        }

        public static NetworkContextPreconnectSocketsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextPreconnectSocketsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextPreconnectSocketsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextPreconnectSocketsParams result = new NetworkContextPreconnectSocketsParams(elementsOrVersion);
                result.numStreams = decoder0.readInt(8);
                result.allowCredentials = decoder0.readBoolean(12, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.numStreams, 8);
            encoder0.encode(this.allowCredentials, 12, 0);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode((Struct) this.networkIsolationKey, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateP2pSocketManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public P2pTrustedSocketManagerClient client;
        public NetworkIsolationKey networkIsolationKey;
        public InterfaceRequest<P2pSocketManager> socketManager;
        public InterfaceRequest<P2pTrustedSocketManager> trustedSocketManager;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateP2pSocketManagerParams(int version) {
            super(32, version);
        }

        public NetworkContextCreateP2pSocketManagerParams() {
            this(0);
        }

        public static NetworkContextCreateP2pSocketManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateP2pSocketManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateP2pSocketManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateP2pSocketManagerParams result = new NetworkContextCreateP2pSocketManagerParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder1);
                result.client = (P2pTrustedSocketManagerClient) decoder0.readServiceInterface(16, false, P2pTrustedSocketManagerClient.MANAGER);
                result.trustedSocketManager = decoder0.readInterfaceRequest(24, false);
                result.socketManager = decoder0.readInterfaceRequest(28, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.networkIsolationKey, 8, false);
            encoder0.encode( this.client, 16, false,  P2pTrustedSocketManagerClient.MANAGER);
            encoder0.encode((InterfaceRequest) this.trustedSocketManager, 24, false);
            encoder0.encode((InterfaceRequest) this.socketManager, 28, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateMdnsResponderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<MdnsResponder> responderReceiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateMdnsResponderParams(int version) {
            super(16, version);
        }

        public NetworkContextCreateMdnsResponderParams() {
            this(0);
        }

        public static NetworkContextCreateMdnsResponderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateMdnsResponderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateMdnsResponderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateMdnsResponderParams result = new NetworkContextCreateMdnsResponderParams(elementsOrVersion);
                result.responderReceiver = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.responderReceiver, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextResolveHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public HostPortPair host;
        public NetworkIsolationKey networkIsolationKey;
        public ResolveHostParameters optionalParameters;
        public ResolveHostClient responseClient;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextResolveHostParams(int version) {
            super(40, version);
        }

        public NetworkContextResolveHostParams() {
            this(0);
        }

        public static NetworkContextResolveHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextResolveHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextResolveHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextResolveHostParams result = new NetworkContextResolveHostParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.host = HostPortPair.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.optionalParameters = ResolveHostParameters.decode(decoder13);
                result.responseClient = (ResolveHostClient) decoder0.readServiceInterface(32, false, ResolveHostClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.host, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            encoder0.encode((Struct) this.optionalParameters, 24, true);
            encoder0.encode( this.responseClient, 32, false,  ResolveHostClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextCreateHostResolverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public DnsConfigOverrides configOverrides;
        public InterfaceRequest<HostResolver> hostResolver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextCreateHostResolverParams(int version) {
            super(24, version);
        }

        public NetworkContextCreateHostResolverParams() {
            this(0);
        }

        public static NetworkContextCreateHostResolverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextCreateHostResolverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextCreateHostResolverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextCreateHostResolverParams result = new NetworkContextCreateHostResolverParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.configOverrides = DnsConfigOverrides.decode(decoder1);
                result.hostResolver = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.configOverrides, 8, true);
            encoder0.encode((InterfaceRequest) this.hostResolver, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextVerifyCertForSignedExchangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public X509Certificate certificate;
        public NetworkIsolationKey networkIsolationKey;
        public String ocspResponse;
        public String sctList;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextVerifyCertForSignedExchangeParams(int version) {
            super(48, version);
        }

        public NetworkContextVerifyCertForSignedExchangeParams() {
            this(0);
        }

        public static NetworkContextVerifyCertForSignedExchangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextVerifyCertForSignedExchangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextVerifyCertForSignedExchangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextVerifyCertForSignedExchangeParams result = new NetworkContextVerifyCertForSignedExchangeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.certificate = X509Certificate.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder13);
                result.ocspResponse = decoder0.readString(32, false);
                result.sctList = decoder0.readString(40, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.certificate, 8, false);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode((Struct) this.networkIsolationKey, 24, false);
            encoder0.encode(this.ocspResponse, 32, false);
            encoder0.encode(this.sctList, 40, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextVerifyCertForSignedExchangeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public CertVerifyResult cvResult;
        public int errorCode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextVerifyCertForSignedExchangeResponseParams(int version) {
            super(24, version);
        }

        public NetworkContextVerifyCertForSignedExchangeResponseParams() {
            this(0);
        }

        public static NetworkContextVerifyCertForSignedExchangeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextVerifyCertForSignedExchangeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextVerifyCertForSignedExchangeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextVerifyCertForSignedExchangeResponseParams result = new NetworkContextVerifyCertForSignedExchangeResponseParams(elementsOrVersion);
                result.errorCode = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.cvResult = CertVerifyResult.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.errorCode, 8);
            encoder0.encode((Struct) this.cvResult, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextVerifyCertForSignedExchangeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.VerifyCertForSignedExchangeResponse mCallback;

        NetworkContextVerifyCertForSignedExchangeResponseParamsForwardToCallback(NetworkContext.VerifyCertForSignedExchangeResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(48, 2)) {
                    return false;
                }
                NetworkContextVerifyCertForSignedExchangeResponseParams response = NetworkContextVerifyCertForSignedExchangeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.errorCode), response.cvResult);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextVerifyCertForSignedExchangeResponseParamsProxyToResponder implements NetworkContext.VerifyCertForSignedExchangeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextVerifyCertForSignedExchangeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer errorCode, CertVerifyResult cvResult) {
            NetworkContextVerifyCertForSignedExchangeResponseParams _response = new NetworkContextVerifyCertForSignedExchangeResponseParams();
            _response.errorCode = errorCode.intValue();
            _response.cvResult = cvResult;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(48, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddHstsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Time expiry;
        public String host;
        public boolean includeSubdomains;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddHstsParams(int version) {
            super(32, version);
        }

        public NetworkContextAddHstsParams() {
            this(0);
        }

        public static NetworkContextAddHstsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddHstsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddHstsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddHstsParams result = new NetworkContextAddHstsParams(elementsOrVersion);
                result.host = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.expiry = Time.decode(decoder1);
                result.includeSubdomains = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
            encoder0.encode((Struct) this.expiry, 16, false);
            encoder0.encode(this.includeSubdomains, 24, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddHstsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddHstsResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextAddHstsResponseParams() {
            this(0);
        }

        public static NetworkContextAddHstsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddHstsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddHstsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddHstsResponseParams result = new NetworkContextAddHstsResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddHstsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.AddHstsResponse mCallback;

        NetworkContextAddHstsResponseParamsForwardToCallback(NetworkContext.AddHstsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(49, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddHstsResponseParamsProxyToResponder implements NetworkContext.AddHstsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextAddHstsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextAddHstsResponseParams _response = new NetworkContextAddHstsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(49, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextIsHstsActiveForHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String host;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextIsHstsActiveForHostParams(int version) {
            super(16, version);
        }

        public NetworkContextIsHstsActiveForHostParams() {
            this(0);
        }

        public static NetworkContextIsHstsActiveForHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextIsHstsActiveForHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextIsHstsActiveForHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextIsHstsActiveForHostParams result = new NetworkContextIsHstsActiveForHostParams(elementsOrVersion);
                result.host = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextIsHstsActiveForHostResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextIsHstsActiveForHostResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextIsHstsActiveForHostResponseParams() {
            this(0);
        }

        public static NetworkContextIsHstsActiveForHostResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextIsHstsActiveForHostResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextIsHstsActiveForHostResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextIsHstsActiveForHostResponseParams result = new NetworkContextIsHstsActiveForHostResponseParams(elementsOrVersion);
                result.result = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextIsHstsActiveForHostResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.IsHstsActiveForHostResponse mCallback;

        NetworkContextIsHstsActiveForHostResponseParamsForwardToCallback(NetworkContext.IsHstsActiveForHostResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(50, 2)) {
                    return false;
                }
                NetworkContextIsHstsActiveForHostResponseParams response = NetworkContextIsHstsActiveForHostResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextIsHstsActiveForHostResponseParamsProxyToResponder implements NetworkContext.IsHstsActiveForHostResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextIsHstsActiveForHostResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean result) {
            NetworkContextIsHstsActiveForHostResponseParams _response = new NetworkContextIsHstsActiveForHostResponseParams();
            _response.result = result.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(50, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetHstsStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String domain;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetHstsStateParams(int version) {
            super(16, version);
        }

        public NetworkContextGetHstsStateParams() {
            this(0);
        }

        public static NetworkContextGetHstsStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetHstsStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetHstsStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetHstsStateParams result = new NetworkContextGetHstsStateParams(elementsOrVersion);
                result.domain = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.domain, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextGetHstsStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DictionaryValue state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetHstsStateResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextGetHstsStateResponseParams() {
            this(0);
        }

        public static NetworkContextGetHstsStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetHstsStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetHstsStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetHstsStateResponseParams result = new NetworkContextGetHstsStateResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.state = DictionaryValue.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.state, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetHstsStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.GetHstsStateResponse mCallback;

        NetworkContextGetHstsStateResponseParamsForwardToCallback(NetworkContext.GetHstsStateResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(51, 2)) {
                    return false;
                }
                NetworkContextGetHstsStateResponseParams response = NetworkContextGetHstsStateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.state);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextGetHstsStateResponseParamsProxyToResponder implements NetworkContext.GetHstsStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextGetHstsStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(DictionaryValue state) {
            NetworkContextGetHstsStateResponseParams _response = new NetworkContextGetHstsStateResponseParams();
            _response.state = state;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(51, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetCorsOriginAccessListsForOriginParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public CorsOriginPattern[] allowPatterns;
        public CorsOriginPattern[] blockPatterns;
        public Origin sourceOrigin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetCorsOriginAccessListsForOriginParams(int version) {
            super(32, version);
        }

        public NetworkContextSetCorsOriginAccessListsForOriginParams() {
            this(0);
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetCorsOriginAccessListsForOriginParams result = new NetworkContextSetCorsOriginAccessListsForOriginParams(elementsOrVersion);
                result.sourceOrigin = Origin.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.allowPatterns = new CorsOriginPattern[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.allowPatterns[i1] = CorsOriginPattern.decode(decoder2);
                }
                Decoder decoder12 = decoder0.readPointer(24, false);
                DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
                result.blockPatterns = new CorsOriginPattern[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                    result.blockPatterns[i12] = CorsOriginPattern.decode(decoder22);
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
            encoder0.encode((Struct) this.sourceOrigin, 8, false);
            CorsOriginPattern[] corsOriginPatternArr = this.allowPatterns;
            if (corsOriginPatternArr == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(corsOriginPatternArr.length, 16, -1);
                int i0 = 0;
                while (true) {
                    CorsOriginPattern[] corsOriginPatternArr2 = this.allowPatterns;
                    if (i0 >= corsOriginPatternArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) corsOriginPatternArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            CorsOriginPattern[] corsOriginPatternArr3 = this.blockPatterns;
            if (corsOriginPatternArr3 == null) {
                encoder0.encodeNullPointer(24, false);
                return;
            }
            Encoder encoder12 = encoder0.encodePointerArray(corsOriginPatternArr3.length, 24, -1);
            int i02 = 0;
            while (true) {
                CorsOriginPattern[] corsOriginPatternArr4 = this.blockPatterns;
                if (i02 < corsOriginPatternArr4.length) {
                    encoder12.encode((Struct) corsOriginPatternArr4[i02], (i02 * 8) + 8, false);
                    i02++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetCorsOriginAccessListsForOriginResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetCorsOriginAccessListsForOriginResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextSetCorsOriginAccessListsForOriginResponseParams() {
            this(0);
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetCorsOriginAccessListsForOriginResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetCorsOriginAccessListsForOriginResponseParams result = new NetworkContextSetCorsOriginAccessListsForOriginResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSetCorsOriginAccessListsForOriginResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.SetCorsOriginAccessListsForOriginResponse mCallback;

        NetworkContextSetCorsOriginAccessListsForOriginResponseParamsForwardToCallback(NetworkContext.SetCorsOriginAccessListsForOriginResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(52, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSetCorsOriginAccessListsForOriginResponseParamsProxyToResponder implements NetworkContext.SetCorsOriginAccessListsForOriginResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextSetCorsOriginAccessListsForOriginResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextSetCorsOriginAccessListsForOriginResponseParams _response = new NetworkContextSetCorsOriginAccessListsForOriginResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(52, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextDeleteDynamicDataForHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String host;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextDeleteDynamicDataForHostParams(int version) {
            super(16, version);
        }

        public NetworkContextDeleteDynamicDataForHostParams() {
            this(0);
        }

        public static NetworkContextDeleteDynamicDataForHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextDeleteDynamicDataForHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextDeleteDynamicDataForHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextDeleteDynamicDataForHostParams result = new NetworkContextDeleteDynamicDataForHostParams(elementsOrVersion);
                result.host = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextDeleteDynamicDataForHostResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextDeleteDynamicDataForHostResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextDeleteDynamicDataForHostResponseParams() {
            this(0);
        }

        public static NetworkContextDeleteDynamicDataForHostResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextDeleteDynamicDataForHostResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextDeleteDynamicDataForHostResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextDeleteDynamicDataForHostResponseParams result = new NetworkContextDeleteDynamicDataForHostResponseParams(elementsOrVersion);
                result.result = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextDeleteDynamicDataForHostResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.DeleteDynamicDataForHostResponse mCallback;

        NetworkContextDeleteDynamicDataForHostResponseParamsForwardToCallback(NetworkContext.DeleteDynamicDataForHostResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(53, 2)) {
                    return false;
                }
                NetworkContextDeleteDynamicDataForHostResponseParams response = NetworkContextDeleteDynamicDataForHostResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextDeleteDynamicDataForHostResponseParamsProxyToResponder implements NetworkContext.DeleteDynamicDataForHostResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextDeleteDynamicDataForHostResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean result) {
            NetworkContextDeleteDynamicDataForHostResponseParams _response = new NetworkContextDeleteDynamicDataForHostResponseParams();
            _response.result = result.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(53, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean splitAuthCacheByNetworkIsolationKey;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams(int version) {
            super(16, version);
        }

        public NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams() {
            this(0);
        }

        public static NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams result = new NetworkContextSetSplitAuthCacheByNetworkIsolationKeyParams(elementsOrVersion);
                result.splitAuthCacheByNetworkIsolationKey = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.splitAuthCacheByNetworkIsolationKey, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSaveHttpAuthCacheProxyEntriesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSaveHttpAuthCacheProxyEntriesParams(int version) {
            super(8, version);
        }

        public NetworkContextSaveHttpAuthCacheProxyEntriesParams() {
            this(0);
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSaveHttpAuthCacheProxyEntriesParams result = new NetworkContextSaveHttpAuthCacheProxyEntriesParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken cacheKey;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams() {
            this(0);
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams result = new NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.cacheKey = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.cacheKey, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.SaveHttpAuthCacheProxyEntriesResponse mCallback;

        NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsForwardToCallback(NetworkContext.SaveHttpAuthCacheProxyEntriesResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(55, 2)) {
                    return false;
                }
                NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams response = NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.cacheKey);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsProxyToResponder implements NetworkContext.SaveHttpAuthCacheProxyEntriesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextSaveHttpAuthCacheProxyEntriesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UnguessableToken cacheKey) {
            NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams _response = new NetworkContextSaveHttpAuthCacheProxyEntriesResponseParams();
            _response.cacheKey = cacheKey;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(55, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextLoadHttpAuthCacheProxyEntriesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken cacheKey;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextLoadHttpAuthCacheProxyEntriesParams(int version) {
            super(16, version);
        }

        public NetworkContextLoadHttpAuthCacheProxyEntriesParams() {
            this(0);
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextLoadHttpAuthCacheProxyEntriesParams result = new NetworkContextLoadHttpAuthCacheProxyEntriesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.cacheKey = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.cacheKey, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams() {
            this(0);
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams result = new NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.LoadHttpAuthCacheProxyEntriesResponse mCallback;

        NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsForwardToCallback(NetworkContext.LoadHttpAuthCacheProxyEntriesResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(56, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsProxyToResponder implements NetworkContext.LoadHttpAuthCacheProxyEntriesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextLoadHttpAuthCacheProxyEntriesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams _response = new NetworkContextLoadHttpAuthCacheProxyEntriesResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(56, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddAuthCacheEntryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public AuthChallengeInfo challenge;
        public AuthCredentials credentials;
        public NetworkIsolationKey networkIsolationKey;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddAuthCacheEntryParams(int version) {
            super(32, version);
        }

        public NetworkContextAddAuthCacheEntryParams() {
            this(0);
        }

        public static NetworkContextAddAuthCacheEntryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddAuthCacheEntryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddAuthCacheEntryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddAuthCacheEntryParams result = new NetworkContextAddAuthCacheEntryParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.challenge = AuthChallengeInfo.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.credentials = AuthCredentials.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.challenge, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            encoder0.encode((Struct) this.credentials, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddAuthCacheEntryResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddAuthCacheEntryResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextAddAuthCacheEntryResponseParams() {
            this(0);
        }

        public static NetworkContextAddAuthCacheEntryResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddAuthCacheEntryResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddAuthCacheEntryResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddAuthCacheEntryResponseParams result = new NetworkContextAddAuthCacheEntryResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddAuthCacheEntryResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.AddAuthCacheEntryResponse mCallback;

        NetworkContextAddAuthCacheEntryResponseParamsForwardToCallback(NetworkContext.AddAuthCacheEntryResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(57, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddAuthCacheEntryResponseParamsProxyToResponder implements NetworkContext.AddAuthCacheEntryResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextAddAuthCacheEntryResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextAddAuthCacheEntryResponseParams _response = new NetworkContextAddAuthCacheEntryResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(57, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextLookupServerBasicAuthCredentialsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkIsolationKey networkIsolationKey;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextLookupServerBasicAuthCredentialsParams(int version) {
            super(24, version);
        }

        public NetworkContextLookupServerBasicAuthCredentialsParams() {
            this(0);
        }

        public static NetworkContextLookupServerBasicAuthCredentialsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextLookupServerBasicAuthCredentialsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextLookupServerBasicAuthCredentialsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextLookupServerBasicAuthCredentialsParams result = new NetworkContextLookupServerBasicAuthCredentialsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
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
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextLookupServerBasicAuthCredentialsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AuthCredentials credentials;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextLookupServerBasicAuthCredentialsResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextLookupServerBasicAuthCredentialsResponseParams() {
            this(0);
        }

        public static NetworkContextLookupServerBasicAuthCredentialsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextLookupServerBasicAuthCredentialsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextLookupServerBasicAuthCredentialsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextLookupServerBasicAuthCredentialsResponseParams result = new NetworkContextLookupServerBasicAuthCredentialsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.credentials = AuthCredentials.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.credentials, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextLookupServerBasicAuthCredentialsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.LookupServerBasicAuthCredentialsResponse mCallback;

        NetworkContextLookupServerBasicAuthCredentialsResponseParamsForwardToCallback(NetworkContext.LookupServerBasicAuthCredentialsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(58, 2)) {
                    return false;
                }
                NetworkContextLookupServerBasicAuthCredentialsResponseParams response = NetworkContextLookupServerBasicAuthCredentialsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.credentials);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextLookupServerBasicAuthCredentialsResponseParamsProxyToResponder implements NetworkContext.LookupServerBasicAuthCredentialsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextLookupServerBasicAuthCredentialsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(AuthCredentials credentials) {
            NetworkContextLookupServerBasicAuthCredentialsResponseParams _response = new NetworkContextLookupServerBasicAuthCredentialsResponseParams();
            _response.credentials = credentials;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(58, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextEnableStaticKeyPinningForTestingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextEnableStaticKeyPinningForTestingParams(int version) {
            super(8, version);
        }

        public NetworkContextEnableStaticKeyPinningForTestingParams() {
            this(0);
        }

        public static NetworkContextEnableStaticKeyPinningForTestingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextEnableStaticKeyPinningForTestingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextEnableStaticKeyPinningForTestingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextEnableStaticKeyPinningForTestingParams result = new NetworkContextEnableStaticKeyPinningForTestingParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextEnableStaticKeyPinningForTestingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextEnableStaticKeyPinningForTestingResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextEnableStaticKeyPinningForTestingResponseParams() {
            this(0);
        }

        public static NetworkContextEnableStaticKeyPinningForTestingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextEnableStaticKeyPinningForTestingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextEnableStaticKeyPinningForTestingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextEnableStaticKeyPinningForTestingResponseParams result = new NetworkContextEnableStaticKeyPinningForTestingResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextEnableStaticKeyPinningForTestingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.EnableStaticKeyPinningForTestingResponse mCallback;

        NetworkContextEnableStaticKeyPinningForTestingResponseParamsForwardToCallback(NetworkContext.EnableStaticKeyPinningForTestingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(59, 6)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextEnableStaticKeyPinningForTestingResponseParamsProxyToResponder implements NetworkContext.EnableStaticKeyPinningForTestingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextEnableStaticKeyPinningForTestingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextEnableStaticKeyPinningForTestingResponseParams _response = new NetworkContextEnableStaticKeyPinningForTestingResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(59, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextVerifyCertificateForTestingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public X509Certificate certificate;
        public String hostname;
        public String ocspResponse;
        public String sctList;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextVerifyCertificateForTestingParams(int version) {
            super(40, version);
        }

        public NetworkContextVerifyCertificateForTestingParams() {
            this(0);
        }

        public static NetworkContextVerifyCertificateForTestingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextVerifyCertificateForTestingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextVerifyCertificateForTestingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextVerifyCertificateForTestingParams result = new NetworkContextVerifyCertificateForTestingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.certificate = X509Certificate.decode(decoder1);
                result.hostname = decoder0.readString(16, false);
                result.ocspResponse = decoder0.readString(24, false);
                result.sctList = decoder0.readString(32, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.certificate, 8, false);
            encoder0.encode(this.hostname, 16, false);
            encoder0.encode(this.ocspResponse, 24, false);
            encoder0.encode(this.sctList, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkContextVerifyCertificateForTestingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int errorCode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextVerifyCertificateForTestingResponseParams(int version) {
            super(16, version);
        }

        public NetworkContextVerifyCertificateForTestingResponseParams() {
            this(0);
        }

        public static NetworkContextVerifyCertificateForTestingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextVerifyCertificateForTestingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextVerifyCertificateForTestingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextVerifyCertificateForTestingResponseParams result = new NetworkContextVerifyCertificateForTestingResponseParams(elementsOrVersion);
                result.errorCode = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.errorCode, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextVerifyCertificateForTestingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.VerifyCertificateForTestingResponse mCallback;

        NetworkContextVerifyCertificateForTestingResponseParamsForwardToCallback(NetworkContext.VerifyCertificateForTestingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(60, 6)) {
                    return false;
                }
                NetworkContextVerifyCertificateForTestingResponseParams response = NetworkContextVerifyCertificateForTestingResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.errorCode));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextVerifyCertificateForTestingResponseParamsProxyToResponder implements NetworkContext.VerifyCertificateForTestingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextVerifyCertificateForTestingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer errorCode) {
            NetworkContextVerifyCertificateForTestingResponseParams _response = new NetworkContextVerifyCertificateForTestingResponseParams();
            _response.errorCode = errorCode.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(60, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddDomainReliabilityContextForTestingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Url origin;
        public Url uploadUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddDomainReliabilityContextForTestingParams(int version) {
            super(24, version);
        }

        public NetworkContextAddDomainReliabilityContextForTestingParams() {
            this(0);
        }

        public static NetworkContextAddDomainReliabilityContextForTestingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddDomainReliabilityContextForTestingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddDomainReliabilityContextForTestingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddDomainReliabilityContextForTestingParams result = new NetworkContextAddDomainReliabilityContextForTestingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.uploadUrl = Url.decode(decoder12);
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
            encoder0.encode((Struct) this.uploadUrl, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextAddDomainReliabilityContextForTestingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextAddDomainReliabilityContextForTestingResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextAddDomainReliabilityContextForTestingResponseParams() {
            this(0);
        }

        public static NetworkContextAddDomainReliabilityContextForTestingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextAddDomainReliabilityContextForTestingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextAddDomainReliabilityContextForTestingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextAddDomainReliabilityContextForTestingResponseParams result = new NetworkContextAddDomainReliabilityContextForTestingResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddDomainReliabilityContextForTestingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.AddDomainReliabilityContextForTestingResponse mCallback;

        NetworkContextAddDomainReliabilityContextForTestingResponseParamsForwardToCallback(NetworkContext.AddDomainReliabilityContextForTestingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(61, 6)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextAddDomainReliabilityContextForTestingResponseParamsProxyToResponder implements NetworkContext.AddDomainReliabilityContextForTestingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextAddDomainReliabilityContextForTestingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextAddDomainReliabilityContextForTestingResponseParams _response = new NetworkContextAddDomainReliabilityContextForTestingResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(61, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextForceDomainReliabilityUploadsForTestingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextForceDomainReliabilityUploadsForTestingParams(int version) {
            super(8, version);
        }

        public NetworkContextForceDomainReliabilityUploadsForTestingParams() {
            this(0);
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextForceDomainReliabilityUploadsForTestingParams result = new NetworkContextForceDomainReliabilityUploadsForTestingParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextForceDomainReliabilityUploadsForTestingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextForceDomainReliabilityUploadsForTestingResponseParams(int version) {
            super(8, version);
        }

        public NetworkContextForceDomainReliabilityUploadsForTestingResponseParams() {
            this(0);
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextForceDomainReliabilityUploadsForTestingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextForceDomainReliabilityUploadsForTestingResponseParams result = new NetworkContextForceDomainReliabilityUploadsForTestingResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkContext.ForceDomainReliabilityUploadsForTestingResponse mCallback;

        NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsForwardToCallback(NetworkContext.ForceDomainReliabilityUploadsForTestingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(62, 6)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsProxyToResponder implements NetworkContext.ForceDomainReliabilityUploadsForTestingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkContextForceDomainReliabilityUploadsForTestingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkContextForceDomainReliabilityUploadsForTestingResponseParams _response = new NetworkContextForceDomainReliabilityUploadsForTestingResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(62, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextGetOriginPolicyManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<OriginPolicyManager> originPolicyManager;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextGetOriginPolicyManagerParams(int version) {
            super(16, version);
        }

        public NetworkContextGetOriginPolicyManagerParams() {
            this(0);
        }

        public static NetworkContextGetOriginPolicyManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextGetOriginPolicyManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextGetOriginPolicyManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextGetOriginPolicyManagerParams result = new NetworkContextGetOriginPolicyManagerParams(elementsOrVersion);
                result.originPolicyManager = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.originPolicyManager, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkContextSetSctAuditingEnabledParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enabled;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkContextSetSctAuditingEnabledParams(int version) {
            super(16, version);
        }

        public NetworkContextSetSctAuditingEnabledParams() {
            this(0);
        }

        public static NetworkContextSetSctAuditingEnabledParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkContextSetSctAuditingEnabledParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkContextSetSctAuditingEnabledParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkContextSetSctAuditingEnabledParams result = new NetworkContextSetSctAuditingEnabledParams(elementsOrVersion);
                result.enabled = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enabled, 8, 0);
        }
    }
}
