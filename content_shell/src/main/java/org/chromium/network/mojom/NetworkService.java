package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.DictionaryValue;
import org.chromium.mojo_base.mojom.File;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface NetworkService extends Interface {
    public static final Manager<NetworkService, Proxy> MANAGER = NetworkService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetNetworkListResponse extends Callbacks.Callback1<NetworkInterface[]> {
    }

    /* loaded from: classes2.dex */
    public interface ParseHeadersResponse extends Callbacks.Callback1<ParsedHeaders> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetTrustTokenKeyCommitmentsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface UpdateCrlSetResponse extends Callbacks.Callback0 {
    }

    void addAllowedRequestInitiatorForPlugin(int i, Origin origin);

    void attachNetLogProxy(NetLogProxySource netLogProxySource, InterfaceRequest<NetLogProxySink> interfaceRequest);

    void bindTestInterface(InterfaceRequest<NetworkServiceTest> interfaceRequest);

    void clearSctAuditingCache();

    void configureHttpAuthPrefs(HttpAuthDynamicParams httpAuthDynamicParams);

    void configureSctAuditing(boolean z, double d, Url url, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, UrlLoaderFactory urlLoaderFactory);

    void configureStubHostResolver(boolean z, int i, DnsOverHttpsServer[] dnsOverHttpsServerArr, boolean z2);

    void createNetworkContext(InterfaceRequest<NetworkContext> interfaceRequest, NetworkContextParams networkContextParams);

    void disableQuic();

    void dumpWithoutCrashing(Time time);

    void getDnsConfigChangeManager(InterfaceRequest<DnsConfigChangeManager> interfaceRequest);

    void getNetworkChangeManager(InterfaceRequest<NetworkChangeManager> interfaceRequest);

    void getNetworkList(int i, GetNetworkListResponse getNetworkListResponse);

    void getNetworkQualityEstimatorManager(InterfaceRequest<NetworkQualityEstimatorManager> interfaceRequest);

    void onApplicationStateChange(int i);

    void onCertDbChanged();

    void onMemoryPressure(int i);

    void onPeerToPeerConnectionsCountChange(int i);

    void parseHeaders(Url url, HttpResponseHeaders httpResponseHeaders, ParseHeadersResponse parseHeadersResponse);

    void removeSecurityExceptionsForPlugin(int i);

    void setCtEnforcementEnabled(boolean z);

    void setEnvironment(EnvironmentVariable[] environmentVariableArr);

    void setExplicitlyAllowedPorts(short[] sArr);

    void setFirstPartySets(String str);

    void setMaxConnectionsPerProxy(int i);

    void setParams(NetworkServiceParams networkServiceParams);

    void setRawHeadersAccess(int i, Origin[] originArr);

    void setSslKeyLogFile(File file);

    void setTrustTokenKeyCommitments(String str, SetTrustTokenKeyCommitmentsResponse setTrustTokenKeyCommitmentsResponse);

    void setUpHttpAuth(HttpAuthStaticParams httpAuthStaticParams);

    void startNetLog(File file, int i, DictionaryValue dictionaryValue);

    void updateCrlSet(ReadOnlyBuffer readOnlyBuffer, UpdateCrlSetResponse updateCrlSetResponse);

    void updateCtLogList(CtLogInfo[] ctLogInfoArr, Time time);
}
