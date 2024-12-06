package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.ApplicationState;
import org.chromium.mojo_base.mojom.DictionaryValue;
import org.chromium.mojo_base.mojom.File;
import org.chromium.mojo_base.mojom.MemoryPressureLevel;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.network.mojom.NetworkService;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class NetworkService_Internal {
    private static final int ADD_ALLOWED_REQUEST_INITIATOR_FOR_PLUGIN_ORDINAL = 17;
    private static final int ATTACH_NET_LOG_PROXY_ORDINAL = 2;
    private static final int BIND_TEST_INTERFACE_ORDINAL = 29;
    private static final int CLEAR_SCT_AUDITING_CACHE_ORDINAL = 24;
    private static final int CONFIGURE_HTTP_AUTH_PREFS_ORDINAL = 8;
    private static final int CONFIGURE_SCT_AUDITING_ORDINAL = 25;
    private static final int CONFIGURE_STUB_HOST_RESOLVER_ORDINAL = 5;
    private static final int CREATE_NETWORK_CONTEXT_ORDINAL = 4;
    private static final int DISABLE_QUIC_ORDINAL = 6;
    private static final int DUMP_WITHOUT_CRASHING_ORDINAL = 28;
    private static final int GET_DNS_CONFIG_CHANGE_MANAGER_ORDINAL = 13;
    private static final int GET_NETWORK_CHANGE_MANAGER_ORDINAL = 11;
    private static final int GET_NETWORK_LIST_ORDINAL = 14;
    private static final int GET_NETWORK_QUALITY_ESTIMATOR_MANAGER_ORDINAL = 12;
    public static final Interface.Manager<NetworkService, NetworkService.Proxy> MANAGER = new Interface.Manager<NetworkService, NetworkService.Proxy>() { // from class: org.chromium.network.mojom.NetworkService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.NetworkService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NetworkService impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkService[] buildArray(int size) {
            return new NetworkService[size];
        }
    };
    private static final int ON_APPLICATION_STATE_CHANGE_ORDINAL = 21;
    private static final int ON_CERT_DB_CHANGED_ORDINAL = 16;
    private static final int ON_MEMORY_PRESSURE_ORDINAL = 19;
    private static final int ON_PEER_TO_PEER_CONNECTIONS_COUNT_CHANGE_ORDINAL = 20;
    private static final int PARSE_HEADERS_ORDINAL = 32;
    private static final int REMOVE_SECURITY_EXCEPTIONS_FOR_PLUGIN_ORDINAL = 18;
    private static final int SET_CT_ENFORCEMENT_ENABLED_ORDINAL = 27;
    private static final int SET_ENVIRONMENT_ORDINAL = 22;
    private static final int SET_EXPLICITLY_ALLOWED_PORTS_ORDINAL = 31;
    private static final int SET_FIRST_PARTY_SETS_ORDINAL = 30;
    private static final int SET_MAX_CONNECTIONS_PER_PROXY_ORDINAL = 10;
    private static final int SET_PARAMS_ORDINAL = 0;
    private static final int SET_RAW_HEADERS_ACCESS_ORDINAL = 9;
    private static final int SET_SSL_KEY_LOG_FILE_ORDINAL = 3;
    private static final int SET_TRUST_TOKEN_KEY_COMMITMENTS_ORDINAL = 23;
    private static final int SET_UP_HTTP_AUTH_ORDINAL = 7;
    private static final int START_NET_LOG_ORDINAL = 1;
    private static final int UPDATE_CRL_SET_ORDINAL = 15;
    private static final int UPDATE_CT_LOG_LIST_ORDINAL = 26;

    NetworkService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NetworkService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setParams(NetworkServiceParams params) {
            NetworkServiceSetParamsParams _message = new NetworkServiceSetParamsParams();
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void startNetLog(File file, int captureMode, DictionaryValue constants) {
            NetworkServiceStartNetLogParams _message = new NetworkServiceStartNetLogParams();
            _message.file = file;
            _message.captureMode = captureMode;
            _message.constants = constants;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void attachNetLogProxy(NetLogProxySource proxySource, InterfaceRequest<NetLogProxySink> proxySink) {
            NetworkServiceAttachNetLogProxyParams _message = new NetworkServiceAttachNetLogProxyParams();
            _message.proxySource = proxySource;
            _message.proxySink = proxySink;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setSslKeyLogFile(File file) {
            NetworkServiceSetSslKeyLogFileParams _message = new NetworkServiceSetSslKeyLogFileParams();
            _message.file = file;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void createNetworkContext(InterfaceRequest<NetworkContext> context, NetworkContextParams params) {
            NetworkServiceCreateNetworkContextParams _message = new NetworkServiceCreateNetworkContextParams();
            _message.context = context;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void configureStubHostResolver(boolean insecureDnsClientEnabled, int secureDnsMode, DnsOverHttpsServer[] dnsOverHttpsServers, boolean additionalDnsTypesEnabled) {
            NetworkServiceConfigureStubHostResolverParams _message = new NetworkServiceConfigureStubHostResolverParams();
            _message.insecureDnsClientEnabled = insecureDnsClientEnabled;
            _message.secureDnsMode = secureDnsMode;
            _message.dnsOverHttpsServers = dnsOverHttpsServers;
            _message.additionalDnsTypesEnabled = additionalDnsTypesEnabled;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void disableQuic() {
            NetworkServiceDisableQuicParams _message = new NetworkServiceDisableQuicParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setUpHttpAuth(HttpAuthStaticParams httpAuthStaticParams) {
            NetworkServiceSetUpHttpAuthParams _message = new NetworkServiceSetUpHttpAuthParams();
            _message.httpAuthStaticParams = httpAuthStaticParams;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void configureHttpAuthPrefs(HttpAuthDynamicParams httpAuthDynamicParams) {
            NetworkServiceConfigureHttpAuthPrefsParams _message = new NetworkServiceConfigureHttpAuthPrefsParams();
            _message.httpAuthDynamicParams = httpAuthDynamicParams;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setRawHeadersAccess(int processId, Origin[] origins) {
            NetworkServiceSetRawHeadersAccessParams _message = new NetworkServiceSetRawHeadersAccessParams();
            _message.processId = processId;
            _message.origins = origins;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setMaxConnectionsPerProxy(int maxConnections) {
            NetworkServiceSetMaxConnectionsPerProxyParams _message = new NetworkServiceSetMaxConnectionsPerProxyParams();
            _message.maxConnections = maxConnections;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void getNetworkChangeManager(InterfaceRequest<NetworkChangeManager> networkChangeManager) {
            NetworkServiceGetNetworkChangeManagerParams _message = new NetworkServiceGetNetworkChangeManagerParams();
            _message.networkChangeManager = networkChangeManager;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void getNetworkQualityEstimatorManager(InterfaceRequest<NetworkQualityEstimatorManager> receiver) {
            NetworkServiceGetNetworkQualityEstimatorManagerParams _message = new NetworkServiceGetNetworkQualityEstimatorManagerParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void getDnsConfigChangeManager(InterfaceRequest<DnsConfigChangeManager> receiver) {
            NetworkServiceGetDnsConfigChangeManagerParams _message = new NetworkServiceGetDnsConfigChangeManagerParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void getNetworkList(int policy, GetNetworkListResponse callback) {
            NetworkServiceGetNetworkListParams _message = new NetworkServiceGetNetworkListParams();
            _message.policy = policy;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14, 1, 0L)), new NetworkServiceGetNetworkListResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void updateCrlSet(ReadOnlyBuffer crlSet, UpdateCrlSetResponse callback) {
            NetworkServiceUpdateCrlSetParams _message = new NetworkServiceUpdateCrlSetParams();
            _message.crlSet = crlSet;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15, 1, 0L)), new NetworkServiceUpdateCrlSetResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void onCertDbChanged() {
            NetworkServiceOnCertDbChangedParams _message = new NetworkServiceOnCertDbChangedParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void addAllowedRequestInitiatorForPlugin(int processId, Origin allowedRequestInitiator) {
            NetworkServiceAddAllowedRequestInitiatorForPluginParams _message = new NetworkServiceAddAllowedRequestInitiatorForPluginParams();
            _message.processId = processId;
            _message.allowedRequestInitiator = allowedRequestInitiator;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void removeSecurityExceptionsForPlugin(int processId) {
            NetworkServiceRemoveSecurityExceptionsForPluginParams _message = new NetworkServiceRemoveSecurityExceptionsForPluginParams();
            _message.processId = processId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void onMemoryPressure(int memoryPressureLevel) {
            NetworkServiceOnMemoryPressureParams _message = new NetworkServiceOnMemoryPressureParams();
            _message.memoryPressureLevel = memoryPressureLevel;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void onPeerToPeerConnectionsCountChange(int count) {
            NetworkServiceOnPeerToPeerConnectionsCountChangeParams _message = new NetworkServiceOnPeerToPeerConnectionsCountChangeParams();
            _message.count = count;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void onApplicationStateChange(int state) {
            NetworkServiceOnApplicationStateChangeParams _message = new NetworkServiceOnApplicationStateChangeParams();
            _message.state = state;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setEnvironment(EnvironmentVariable[] environment) {
            NetworkServiceSetEnvironmentParams _message = new NetworkServiceSetEnvironmentParams();
            _message.environment = environment;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setTrustTokenKeyCommitments(String rawCommitments, SetTrustTokenKeyCommitmentsResponse callback) {
            NetworkServiceSetTrustTokenKeyCommitmentsParams _message = new NetworkServiceSetTrustTokenKeyCommitmentsParams();
            _message.rawCommitments = rawCommitments;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23, 1, 0L)), new NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void clearSctAuditingCache() {
            NetworkServiceClearSctAuditingCacheParams _message = new NetworkServiceClearSctAuditingCacheParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void configureSctAuditing(boolean enabled, double samplingRate, Url reportUri, MutableNetworkTrafficAnnotationTag trafficAnnotation, UrlLoaderFactory factory) {
            NetworkServiceConfigureSctAuditingParams _message = new NetworkServiceConfigureSctAuditingParams();
            _message.enabled = enabled;
            _message.samplingRate = samplingRate;
            _message.reportUri = reportUri;
            _message.trafficAnnotation = trafficAnnotation;
            _message.factory = factory;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void updateCtLogList(CtLogInfo[] logList, Time updateTime) {
            NetworkServiceUpdateCtLogListParams _message = new NetworkServiceUpdateCtLogListParams();
            _message.logList = logList;
            _message.updateTime = updateTime;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(26)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setCtEnforcementEnabled(boolean enabled) {
            NetworkServiceSetCtEnforcementEnabledParams _message = new NetworkServiceSetCtEnforcementEnabledParams();
            _message.enabled = enabled;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(27)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void dumpWithoutCrashing(Time dumpRequestTime) {
            NetworkServiceDumpWithoutCrashingParams _message = new NetworkServiceDumpWithoutCrashingParams();
            _message.dumpRequestTime = dumpRequestTime;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(28)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void bindTestInterface(InterfaceRequest<NetworkServiceTest> receiver) {
            NetworkServiceBindTestInterfaceParams _message = new NetworkServiceBindTestInterfaceParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(29)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setFirstPartySets(String rawSets) {
            NetworkServiceSetFirstPartySetsParams _message = new NetworkServiceSetFirstPartySetsParams();
            _message.rawSets = rawSets;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(30)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void setExplicitlyAllowedPorts(short[] ports) {
            NetworkServiceSetExplicitlyAllowedPortsParams _message = new NetworkServiceSetExplicitlyAllowedPortsParams();
            _message.ports = ports;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(31)));
        }

        @Override // org.chromium.network.mojom.NetworkService
        public void parseHeaders(Url url, HttpResponseHeaders headers, ParseHeadersResponse callback) {
            NetworkServiceParseHeadersParams _message = new NetworkServiceParseHeadersParams();
            _message.url = url;
            _message.headers = headers;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(32, 1, 0L)), new NetworkServiceParseHeadersResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NetworkService> {
        Stub(Core core, NetworkService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NetworkService_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 14:
                    case 15:
                    case 23:
                    default:
                        return false;
                    case 0:
                        getImpl().setParams(NetworkServiceSetParamsParams.deserialize(messageWithHeader.getPayload()).params);
                        return true;
                    case 1:
                        NetworkServiceStartNetLogParams data = NetworkServiceStartNetLogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startNetLog(data.file, data.captureMode, data.constants);
                        return true;
                    case 2:
                        NetworkServiceAttachNetLogProxyParams data2 = NetworkServiceAttachNetLogProxyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().attachNetLogProxy(data2.proxySource, data2.proxySink);
                        return true;
                    case 3:
                        NetworkServiceSetSslKeyLogFileParams data3 = NetworkServiceSetSslKeyLogFileParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSslKeyLogFile(data3.file);
                        return true;
                    case 4:
                        NetworkServiceCreateNetworkContextParams data4 = NetworkServiceCreateNetworkContextParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createNetworkContext(data4.context, data4.params);
                        return true;
                    case 5:
                        NetworkServiceConfigureStubHostResolverParams data5 = NetworkServiceConfigureStubHostResolverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().configureStubHostResolver(data5.insecureDnsClientEnabled, data5.secureDnsMode, data5.dnsOverHttpsServers, data5.additionalDnsTypesEnabled);
                        return true;
                    case 6:
                        NetworkServiceDisableQuicParams.deserialize(messageWithHeader.getPayload());
                        getImpl().disableQuic();
                        return true;
                    case 7:
                        NetworkServiceSetUpHttpAuthParams data6 = NetworkServiceSetUpHttpAuthParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setUpHttpAuth(data6.httpAuthStaticParams);
                        return true;
                    case 8:
                        NetworkServiceConfigureHttpAuthPrefsParams data7 = NetworkServiceConfigureHttpAuthPrefsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().configureHttpAuthPrefs(data7.httpAuthDynamicParams);
                        return true;
                    case 9:
                        NetworkServiceSetRawHeadersAccessParams data8 = NetworkServiceSetRawHeadersAccessParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setRawHeadersAccess(data8.processId, data8.origins);
                        return true;
                    case 10:
                        NetworkServiceSetMaxConnectionsPerProxyParams data9 = NetworkServiceSetMaxConnectionsPerProxyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setMaxConnectionsPerProxy(data9.maxConnections);
                        return true;
                    case 11:
                        NetworkServiceGetNetworkChangeManagerParams data10 = NetworkServiceGetNetworkChangeManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getNetworkChangeManager(data10.networkChangeManager);
                        return true;
                    case 12:
                        NetworkServiceGetNetworkQualityEstimatorManagerParams data11 = NetworkServiceGetNetworkQualityEstimatorManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getNetworkQualityEstimatorManager(data11.receiver);
                        return true;
                    case 13:
                        NetworkServiceGetDnsConfigChangeManagerParams data12 = NetworkServiceGetDnsConfigChangeManagerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDnsConfigChangeManager(data12.receiver);
                        return true;
                    case 16:
                        NetworkServiceOnCertDbChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onCertDbChanged();
                        return true;
                    case 17:
                        NetworkServiceAddAllowedRequestInitiatorForPluginParams data13 = NetworkServiceAddAllowedRequestInitiatorForPluginParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addAllowedRequestInitiatorForPlugin(data13.processId, data13.allowedRequestInitiator);
                        return true;
                    case 18:
                        NetworkServiceRemoveSecurityExceptionsForPluginParams data14 = NetworkServiceRemoveSecurityExceptionsForPluginParams.deserialize(messageWithHeader.getPayload());
                        getImpl().removeSecurityExceptionsForPlugin(data14.processId);
                        return true;
                    case 19:
                        NetworkServiceOnMemoryPressureParams data15 = NetworkServiceOnMemoryPressureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMemoryPressure(data15.memoryPressureLevel);
                        return true;
                    case 20:
                        NetworkServiceOnPeerToPeerConnectionsCountChangeParams data16 = NetworkServiceOnPeerToPeerConnectionsCountChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onPeerToPeerConnectionsCountChange(data16.count);
                        return true;
                    case 21:
                        NetworkServiceOnApplicationStateChangeParams data17 = NetworkServiceOnApplicationStateChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onApplicationStateChange(data17.state);
                        return true;
                    case 22:
                        NetworkServiceSetEnvironmentParams data18 = NetworkServiceSetEnvironmentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setEnvironment(data18.environment);
                        return true;
                    case 24:
                        NetworkServiceClearSctAuditingCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearSctAuditingCache();
                        return true;
                    case 25:
                        NetworkServiceConfigureSctAuditingParams data19 = NetworkServiceConfigureSctAuditingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().configureSctAuditing(data19.enabled, data19.samplingRate, data19.reportUri, data19.trafficAnnotation, data19.factory);
                        return true;
                    case 26:
                        NetworkServiceUpdateCtLogListParams data20 = NetworkServiceUpdateCtLogListParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateCtLogList(data20.logList, data20.updateTime);
                        return true;
                    case 27:
                        NetworkServiceSetCtEnforcementEnabledParams data21 = NetworkServiceSetCtEnforcementEnabledParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCtEnforcementEnabled(data21.enabled);
                        return true;
                    case 28:
                        NetworkServiceDumpWithoutCrashingParams data22 = NetworkServiceDumpWithoutCrashingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dumpWithoutCrashing(data22.dumpRequestTime);
                        return true;
                    case 29:
                        NetworkServiceBindTestInterfaceParams data23 = NetworkServiceBindTestInterfaceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bindTestInterface(data23.receiver);
                        return true;
                    case 30:
                        NetworkServiceSetFirstPartySetsParams data24 = NetworkServiceSetFirstPartySetsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setFirstPartySets(data24.rawSets);
                        return true;
                    case 31:
                        NetworkServiceSetExplicitlyAllowedPortsParams data25 = NetworkServiceSetExplicitlyAllowedPortsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setExplicitlyAllowedPorts(data25.ports);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NetworkService_Internal.MANAGER, messageWithHeader, receiver);
                    case 14:
                        NetworkServiceGetNetworkListParams data = NetworkServiceGetNetworkListParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getNetworkList(data.policy, new NetworkServiceGetNetworkListResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 15:
                        NetworkServiceUpdateCrlSetParams data2 = NetworkServiceUpdateCrlSetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateCrlSet(data2.crlSet, new NetworkServiceUpdateCrlSetResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 23:
                        NetworkServiceSetTrustTokenKeyCommitmentsParams data3 = NetworkServiceSetTrustTokenKeyCommitmentsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setTrustTokenKeyCommitments(data3.rawCommitments, new NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 32:
                        NetworkServiceParseHeadersParams data4 = NetworkServiceParseHeadersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().parseHeaders(data4.url, data4.headers, new NetworkServiceParseHeadersResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class NetworkServiceSetParamsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkServiceParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetParamsParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetParamsParams() {
            this(0);
        }

        public static NetworkServiceSetParamsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetParamsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetParamsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetParamsParams result = new NetworkServiceSetParamsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = NetworkServiceParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceStartNetLogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int captureMode;
        public DictionaryValue constants;
        public File file;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceStartNetLogParams(int version) {
            super(32, version);
        }

        public NetworkServiceStartNetLogParams() {
            this(0);
        }

        public static NetworkServiceStartNetLogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceStartNetLogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceStartNetLogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceStartNetLogParams result = new NetworkServiceStartNetLogParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.file = File.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.captureMode = readInt;
                NetLogCaptureMode.validate(readInt);
                result.captureMode = NetLogCaptureMode.toKnownValue(result.captureMode);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.constants = DictionaryValue.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.file, 8, false);
            encoder0.encode(this.captureMode, 16);
            encoder0.encode((Struct) this.constants, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceAttachNetLogProxyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetLogProxySink> proxySink;
        public NetLogProxySource proxySource;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceAttachNetLogProxyParams(int version) {
            super(24, version);
        }

        public NetworkServiceAttachNetLogProxyParams() {
            this(0);
        }

        public static NetworkServiceAttachNetLogProxyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceAttachNetLogProxyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceAttachNetLogProxyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceAttachNetLogProxyParams result = new NetworkServiceAttachNetLogProxyParams(elementsOrVersion);
                result.proxySource = (NetLogProxySource) decoder0.readServiceInterface(8, false, NetLogProxySource.MANAGER);
                result.proxySink = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.proxySource, 8, false,  NetLogProxySource.MANAGER);
            encoder0.encode((InterfaceRequest) this.proxySink, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetSslKeyLogFileParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public File file;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetSslKeyLogFileParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetSslKeyLogFileParams() {
            this(0);
        }

        public static NetworkServiceSetSslKeyLogFileParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetSslKeyLogFileParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetSslKeyLogFileParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetSslKeyLogFileParams result = new NetworkServiceSetSslKeyLogFileParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.file = File.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.file, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceCreateNetworkContextParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetworkContext> context;
        public NetworkContextParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceCreateNetworkContextParams(int version) {
            super(24, version);
        }

        public NetworkServiceCreateNetworkContextParams() {
            this(0);
        }

        public static NetworkServiceCreateNetworkContextParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceCreateNetworkContextParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceCreateNetworkContextParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceCreateNetworkContextParams result = new NetworkServiceCreateNetworkContextParams(elementsOrVersion);
                result.context = decoder0.readInterfaceRequest(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.params = NetworkContextParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.context, 8, false);
            encoder0.encode((Struct) this.params, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceConfigureStubHostResolverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean additionalDnsTypesEnabled;
        public DnsOverHttpsServer[] dnsOverHttpsServers;
        public boolean insecureDnsClientEnabled;
        public int secureDnsMode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceConfigureStubHostResolverParams(int version) {
            super(24, version);
        }

        public NetworkServiceConfigureStubHostResolverParams() {
            this(0);
        }

        public static NetworkServiceConfigureStubHostResolverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceConfigureStubHostResolverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceConfigureStubHostResolverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceConfigureStubHostResolverParams result = new NetworkServiceConfigureStubHostResolverParams(elementsOrVersion);
                result.insecureDnsClientEnabled = decoder0.readBoolean(8, 0);
                result.additionalDnsTypesEnabled = decoder0.readBoolean(8, 1);
                int readInt = decoder0.readInt(12);
                result.secureDnsMode = readInt;
                SecureDnsMode.validate(readInt);
                result.secureDnsMode = SecureDnsMode.toKnownValue(result.secureDnsMode);
                Decoder decoder1 = decoder0.readPointer(16, true);
                if (decoder1 == null) {
                    result.dnsOverHttpsServers = null;
                } else {
                    DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                    result.dnsOverHttpsServers = new DnsOverHttpsServer[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                        Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                        result.dnsOverHttpsServers[i1] = DnsOverHttpsServer.decode(decoder2);
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
            encoder0.encode(this.insecureDnsClientEnabled, 8, 0);
            encoder0.encode(this.additionalDnsTypesEnabled, 8, 1);
            encoder0.encode(this.secureDnsMode, 12);
            DnsOverHttpsServer[] dnsOverHttpsServerArr = this.dnsOverHttpsServers;
            if (dnsOverHttpsServerArr == null) {
                encoder0.encodeNullPointer(16, true);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(dnsOverHttpsServerArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                DnsOverHttpsServer[] dnsOverHttpsServerArr2 = this.dnsOverHttpsServers;
                if (i0 < dnsOverHttpsServerArr2.length) {
                    encoder1.encode((Struct) dnsOverHttpsServerArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceDisableQuicParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceDisableQuicParams(int version) {
            super(8, version);
        }

        public NetworkServiceDisableQuicParams() {
            this(0);
        }

        public static NetworkServiceDisableQuicParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceDisableQuicParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceDisableQuicParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceDisableQuicParams result = new NetworkServiceDisableQuicParams(elementsOrVersion);
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
    static final class NetworkServiceSetUpHttpAuthParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HttpAuthStaticParams httpAuthStaticParams;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetUpHttpAuthParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetUpHttpAuthParams() {
            this(0);
        }

        public static NetworkServiceSetUpHttpAuthParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetUpHttpAuthParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetUpHttpAuthParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetUpHttpAuthParams result = new NetworkServiceSetUpHttpAuthParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.httpAuthStaticParams = HttpAuthStaticParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.httpAuthStaticParams, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceConfigureHttpAuthPrefsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HttpAuthDynamicParams httpAuthDynamicParams;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceConfigureHttpAuthPrefsParams(int version) {
            super(16, version);
        }

        public NetworkServiceConfigureHttpAuthPrefsParams() {
            this(0);
        }

        public static NetworkServiceConfigureHttpAuthPrefsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceConfigureHttpAuthPrefsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceConfigureHttpAuthPrefsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceConfigureHttpAuthPrefsParams result = new NetworkServiceConfigureHttpAuthPrefsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.httpAuthDynamicParams = HttpAuthDynamicParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.httpAuthDynamicParams, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetRawHeadersAccessParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin[] origins;
        public int processId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetRawHeadersAccessParams(int version) {
            super(24, version);
        }

        public NetworkServiceSetRawHeadersAccessParams() {
            this(0);
        }

        public static NetworkServiceSetRawHeadersAccessParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetRawHeadersAccessParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetRawHeadersAccessParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetRawHeadersAccessParams result = new NetworkServiceSetRawHeadersAccessParams(elementsOrVersion);
                result.processId = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
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
            encoder0.encode(this.processId, 8);
            Origin[] originArr = this.origins;
            if (originArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(originArr.length, 16, -1);
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
    static final class NetworkServiceSetMaxConnectionsPerProxyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int maxConnections;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetMaxConnectionsPerProxyParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetMaxConnectionsPerProxyParams() {
            this(0);
        }

        public static NetworkServiceSetMaxConnectionsPerProxyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetMaxConnectionsPerProxyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetMaxConnectionsPerProxyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetMaxConnectionsPerProxyParams result = new NetworkServiceSetMaxConnectionsPerProxyParams(elementsOrVersion);
                result.maxConnections = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.maxConnections, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceGetNetworkChangeManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetworkChangeManager> networkChangeManager;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceGetNetworkChangeManagerParams(int version) {
            super(16, version);
        }

        public NetworkServiceGetNetworkChangeManagerParams() {
            this(0);
        }

        public static NetworkServiceGetNetworkChangeManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceGetNetworkChangeManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceGetNetworkChangeManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceGetNetworkChangeManagerParams result = new NetworkServiceGetNetworkChangeManagerParams(elementsOrVersion);
                result.networkChangeManager = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.networkChangeManager, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceGetNetworkQualityEstimatorManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetworkQualityEstimatorManager> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceGetNetworkQualityEstimatorManagerParams(int version) {
            super(16, version);
        }

        public NetworkServiceGetNetworkQualityEstimatorManagerParams() {
            this(0);
        }

        public static NetworkServiceGetNetworkQualityEstimatorManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceGetNetworkQualityEstimatorManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceGetNetworkQualityEstimatorManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceGetNetworkQualityEstimatorManagerParams result = new NetworkServiceGetNetworkQualityEstimatorManagerParams(elementsOrVersion);
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
    static final class NetworkServiceGetDnsConfigChangeManagerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<DnsConfigChangeManager> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceGetDnsConfigChangeManagerParams(int version) {
            super(16, version);
        }

        public NetworkServiceGetDnsConfigChangeManagerParams() {
            this(0);
        }

        public static NetworkServiceGetDnsConfigChangeManagerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceGetDnsConfigChangeManagerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceGetDnsConfigChangeManagerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceGetDnsConfigChangeManagerParams result = new NetworkServiceGetDnsConfigChangeManagerParams(elementsOrVersion);
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
    static final class NetworkServiceGetNetworkListParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int policy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceGetNetworkListParams(int version) {
            super(16, version);
        }

        public NetworkServiceGetNetworkListParams() {
            this(0);
        }

        public static NetworkServiceGetNetworkListParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceGetNetworkListParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceGetNetworkListParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceGetNetworkListParams result = new NetworkServiceGetNetworkListParams(elementsOrVersion);
                result.policy = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.policy, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkServiceGetNetworkListResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkInterface[] networks;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceGetNetworkListResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceGetNetworkListResponseParams() {
            this(0);
        }

        public static NetworkServiceGetNetworkListResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceGetNetworkListResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceGetNetworkListResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceGetNetworkListResponseParams result = new NetworkServiceGetNetworkListResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                if (decoder1 == null) {
                    result.networks = null;
                } else {
                    DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                    result.networks = new NetworkInterface[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                        Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                        result.networks[i1] = NetworkInterface.decode(decoder2);
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
            NetworkInterface[] networkInterfaceArr = this.networks;
            if (networkInterfaceArr == null) {
                encoder0.encodeNullPointer(8, true);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(networkInterfaceArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                NetworkInterface[] networkInterfaceArr2 = this.networks;
                if (i0 < networkInterfaceArr2.length) {
                    encoder1.encode((Struct) networkInterfaceArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceGetNetworkListResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkService.GetNetworkListResponse mCallback;

        NetworkServiceGetNetworkListResponseParamsForwardToCallback(NetworkService.GetNetworkListResponse callback) {
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
                NetworkServiceGetNetworkListResponseParams response = NetworkServiceGetNetworkListResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.networks);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceGetNetworkListResponseParamsProxyToResponder implements NetworkService.GetNetworkListResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceGetNetworkListResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(NetworkInterface[] networks) {
            NetworkServiceGetNetworkListResponseParams _response = new NetworkServiceGetNetworkListResponseParams();
            _response.networks = networks;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(14, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceUpdateCrlSetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer crlSet;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceUpdateCrlSetParams(int version) {
            super(16, version);
        }

        public NetworkServiceUpdateCrlSetParams() {
            this(0);
        }

        public static NetworkServiceUpdateCrlSetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceUpdateCrlSetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceUpdateCrlSetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceUpdateCrlSetParams result = new NetworkServiceUpdateCrlSetParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.crlSet = ReadOnlyBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.crlSet, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceUpdateCrlSetResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceUpdateCrlSetResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceUpdateCrlSetResponseParams() {
            this(0);
        }

        public static NetworkServiceUpdateCrlSetResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceUpdateCrlSetResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceUpdateCrlSetResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceUpdateCrlSetResponseParams result = new NetworkServiceUpdateCrlSetResponseParams(elementsOrVersion);
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
    static class NetworkServiceUpdateCrlSetResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkService.UpdateCrlSetResponse mCallback;

        NetworkServiceUpdateCrlSetResponseParamsForwardToCallback(NetworkService.UpdateCrlSetResponse callback) {
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
    static class NetworkServiceUpdateCrlSetResponseParamsProxyToResponder implements NetworkService.UpdateCrlSetResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceUpdateCrlSetResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceUpdateCrlSetResponseParams _response = new NetworkServiceUpdateCrlSetResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(15, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceOnCertDbChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceOnCertDbChangedParams(int version) {
            super(8, version);
        }

        public NetworkServiceOnCertDbChangedParams() {
            this(0);
        }

        public static NetworkServiceOnCertDbChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceOnCertDbChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceOnCertDbChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceOnCertDbChangedParams result = new NetworkServiceOnCertDbChangedParams(elementsOrVersion);
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
    static final class NetworkServiceAddAllowedRequestInitiatorForPluginParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin allowedRequestInitiator;
        public int processId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceAddAllowedRequestInitiatorForPluginParams(int version) {
            super(24, version);
        }

        public NetworkServiceAddAllowedRequestInitiatorForPluginParams() {
            this(0);
        }

        public static NetworkServiceAddAllowedRequestInitiatorForPluginParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceAddAllowedRequestInitiatorForPluginParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceAddAllowedRequestInitiatorForPluginParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceAddAllowedRequestInitiatorForPluginParams result = new NetworkServiceAddAllowedRequestInitiatorForPluginParams(elementsOrVersion);
                result.processId = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.allowedRequestInitiator = Origin.decode(decoder1);
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
            encoder0.encode((Struct) this.allowedRequestInitiator, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceRemoveSecurityExceptionsForPluginParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int processId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceRemoveSecurityExceptionsForPluginParams(int version) {
            super(16, version);
        }

        public NetworkServiceRemoveSecurityExceptionsForPluginParams() {
            this(0);
        }

        public static NetworkServiceRemoveSecurityExceptionsForPluginParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceRemoveSecurityExceptionsForPluginParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceRemoveSecurityExceptionsForPluginParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceRemoveSecurityExceptionsForPluginParams result = new NetworkServiceRemoveSecurityExceptionsForPluginParams(elementsOrVersion);
                result.processId = decoder0.readInt(8);
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
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceOnMemoryPressureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int memoryPressureLevel;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceOnMemoryPressureParams(int version) {
            super(16, version);
        }

        public NetworkServiceOnMemoryPressureParams() {
            this(0);
        }

        public static NetworkServiceOnMemoryPressureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceOnMemoryPressureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceOnMemoryPressureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceOnMemoryPressureParams result = new NetworkServiceOnMemoryPressureParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.memoryPressureLevel = readInt;
                MemoryPressureLevel.validate(readInt);
                result.memoryPressureLevel = MemoryPressureLevel.toKnownValue(result.memoryPressureLevel);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.memoryPressureLevel, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceOnPeerToPeerConnectionsCountChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int count;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceOnPeerToPeerConnectionsCountChangeParams(int version) {
            super(16, version);
        }

        public NetworkServiceOnPeerToPeerConnectionsCountChangeParams() {
            this(0);
        }

        public static NetworkServiceOnPeerToPeerConnectionsCountChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceOnPeerToPeerConnectionsCountChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceOnPeerToPeerConnectionsCountChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceOnPeerToPeerConnectionsCountChangeParams result = new NetworkServiceOnPeerToPeerConnectionsCountChangeParams(elementsOrVersion);
                result.count = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.count, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceOnApplicationStateChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceOnApplicationStateChangeParams(int version) {
            super(16, version);
        }

        public NetworkServiceOnApplicationStateChangeParams() {
            this(0);
        }

        public static NetworkServiceOnApplicationStateChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceOnApplicationStateChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceOnApplicationStateChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceOnApplicationStateChangeParams result = new NetworkServiceOnApplicationStateChangeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.state = readInt;
                ApplicationState.validate(readInt);
                result.state = ApplicationState.toKnownValue(result.state);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.state, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetEnvironmentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public EnvironmentVariable[] environment;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetEnvironmentParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetEnvironmentParams() {
            this(0);
        }

        public static NetworkServiceSetEnvironmentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetEnvironmentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetEnvironmentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetEnvironmentParams result = new NetworkServiceSetEnvironmentParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.environment = new EnvironmentVariable[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.environment[i1] = EnvironmentVariable.decode(decoder2);
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
            EnvironmentVariable[] environmentVariableArr = this.environment;
            if (environmentVariableArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(environmentVariableArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                EnvironmentVariable[] environmentVariableArr2 = this.environment;
                if (i0 < environmentVariableArr2.length) {
                    encoder1.encode((Struct) environmentVariableArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetTrustTokenKeyCommitmentsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String rawCommitments;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetTrustTokenKeyCommitmentsParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetTrustTokenKeyCommitmentsParams() {
            this(0);
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetTrustTokenKeyCommitmentsParams result = new NetworkServiceSetTrustTokenKeyCommitmentsParams(elementsOrVersion);
                result.rawCommitments = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.rawCommitments, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetTrustTokenKeyCommitmentsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetTrustTokenKeyCommitmentsResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceSetTrustTokenKeyCommitmentsResponseParams() {
            this(0);
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetTrustTokenKeyCommitmentsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetTrustTokenKeyCommitmentsResponseParams result = new NetworkServiceSetTrustTokenKeyCommitmentsResponseParams(elementsOrVersion);
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
    static class NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkService.SetTrustTokenKeyCommitmentsResponse mCallback;

        NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsForwardToCallback(NetworkService.SetTrustTokenKeyCommitmentsResponse callback) {
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
    static class NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsProxyToResponder implements NetworkService.SetTrustTokenKeyCommitmentsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceSetTrustTokenKeyCommitmentsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceSetTrustTokenKeyCommitmentsResponseParams _response = new NetworkServiceSetTrustTokenKeyCommitmentsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(23, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceClearSctAuditingCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceClearSctAuditingCacheParams(int version) {
            super(8, version);
        }

        public NetworkServiceClearSctAuditingCacheParams() {
            this(0);
        }

        public static NetworkServiceClearSctAuditingCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceClearSctAuditingCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceClearSctAuditingCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceClearSctAuditingCacheParams result = new NetworkServiceClearSctAuditingCacheParams(elementsOrVersion);
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
    static final class NetworkServiceConfigureSctAuditingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enabled;
        public UrlLoaderFactory factory;
        public Url reportUri;
        public double samplingRate;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceConfigureSctAuditingParams(int version) {
            super(48, version);
        }

        public NetworkServiceConfigureSctAuditingParams() {
            this(0);
        }

        public static NetworkServiceConfigureSctAuditingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceConfigureSctAuditingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceConfigureSctAuditingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceConfigureSctAuditingParams result = new NetworkServiceConfigureSctAuditingParams(elementsOrVersion);
                result.enabled = decoder0.readBoolean(8, 0);
                result.samplingRate = decoder0.readDouble(16);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.reportUri = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder12);
                result.factory = (UrlLoaderFactory) decoder0.readServiceInterface(40, false, UrlLoaderFactory.MANAGER);
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
            encoder0.encode(this.samplingRate, 16);
            encoder0.encode((Struct) this.reportUri, 24, false);
            encoder0.encode((Struct) this.trafficAnnotation, 32, false);
            encoder0.encode(this.factory, 40, false,UrlLoaderFactory.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceUpdateCtLogListParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public CtLogInfo[] logList;
        public Time updateTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceUpdateCtLogListParams(int version) {
            super(24, version);
        }

        public NetworkServiceUpdateCtLogListParams() {
            this(0);
        }

        public static NetworkServiceUpdateCtLogListParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceUpdateCtLogListParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceUpdateCtLogListParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceUpdateCtLogListParams result = new NetworkServiceUpdateCtLogListParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.logList = new CtLogInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.logList[i1] = CtLogInfo.decode(decoder2);
                }
                result.updateTime = Time.decode(decoder0.readPointer(16, false));
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            CtLogInfo[] ctLogInfoArr = this.logList;
            if (ctLogInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(ctLogInfoArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    CtLogInfo[] ctLogInfoArr2 = this.logList;
                    if (i0 >= ctLogInfoArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) ctLogInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode((Struct) this.updateTime, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetCtEnforcementEnabledParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enabled;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetCtEnforcementEnabledParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetCtEnforcementEnabledParams() {
            this(0);
        }

        public static NetworkServiceSetCtEnforcementEnabledParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetCtEnforcementEnabledParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetCtEnforcementEnabledParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetCtEnforcementEnabledParams result = new NetworkServiceSetCtEnforcementEnabledParams(elementsOrVersion);
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

    /* loaded from: classes2.dex */
    static final class NetworkServiceDumpWithoutCrashingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Time dumpRequestTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceDumpWithoutCrashingParams(int version) {
            super(16, version);
        }

        public NetworkServiceDumpWithoutCrashingParams() {
            this(0);
        }

        public static NetworkServiceDumpWithoutCrashingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceDumpWithoutCrashingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceDumpWithoutCrashingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceDumpWithoutCrashingParams result = new NetworkServiceDumpWithoutCrashingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.dumpRequestTime = Time.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.dumpRequestTime, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceBindTestInterfaceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<NetworkServiceTest> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceBindTestInterfaceParams(int version) {
            super(16, version);
        }

        public NetworkServiceBindTestInterfaceParams() {
            this(0);
        }

        public static NetworkServiceBindTestInterfaceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceBindTestInterfaceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceBindTestInterfaceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceBindTestInterfaceParams result = new NetworkServiceBindTestInterfaceParams(elementsOrVersion);
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
    static final class NetworkServiceSetFirstPartySetsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String rawSets;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetFirstPartySetsParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetFirstPartySetsParams() {
            this(0);
        }

        public static NetworkServiceSetFirstPartySetsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetFirstPartySetsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetFirstPartySetsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetFirstPartySetsParams result = new NetworkServiceSetFirstPartySetsParams(elementsOrVersion);
                result.rawSets = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.rawSets, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceSetExplicitlyAllowedPortsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public short[] ports;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceSetExplicitlyAllowedPortsParams(int version) {
            super(16, version);
        }

        public NetworkServiceSetExplicitlyAllowedPortsParams() {
            this(0);
        }

        public static NetworkServiceSetExplicitlyAllowedPortsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceSetExplicitlyAllowedPortsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceSetExplicitlyAllowedPortsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceSetExplicitlyAllowedPortsParams result = new NetworkServiceSetExplicitlyAllowedPortsParams(elementsOrVersion);
                result.ports = decoder0.readShorts(8, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.ports, 8, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceParseHeadersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public HttpResponseHeaders headers;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceParseHeadersParams(int version) {
            super(24, version);
        }

        public NetworkServiceParseHeadersParams() {
            this(0);
        }

        public static NetworkServiceParseHeadersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceParseHeadersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceParseHeadersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceParseHeadersParams result = new NetworkServiceParseHeadersParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.headers = HttpResponseHeaders.decode(decoder12);
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
            encoder0.encode((Struct) this.headers, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkServiceParseHeadersResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ParsedHeaders parsedHeaders;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceParseHeadersResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceParseHeadersResponseParams() {
            this(0);
        }

        public static NetworkServiceParseHeadersResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceParseHeadersResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceParseHeadersResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceParseHeadersResponseParams result = new NetworkServiceParseHeadersResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.parsedHeaders = ParsedHeaders.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.parsedHeaders, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceParseHeadersResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkService.ParseHeadersResponse mCallback;

        NetworkServiceParseHeadersResponseParamsForwardToCallback(NetworkService.ParseHeadersResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(32, 2)) {
                    return false;
                }
                NetworkServiceParseHeadersResponseParams response = NetworkServiceParseHeadersResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.parsedHeaders);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceParseHeadersResponseParamsProxyToResponder implements NetworkService.ParseHeadersResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceParseHeadersResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(ParsedHeaders parsedHeaders) {
            NetworkServiceParseHeadersResponseParams _response = new NetworkServiceParseHeadersResponseParams();
            _response.parsedHeaders = parsedHeaders;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(32, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
