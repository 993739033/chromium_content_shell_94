package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.MemoryPressureLevel;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.network.mojom.NetworkServiceTest;
/* loaded from: classes2.dex */
class NetworkServiceTest_Internal {
    private static final int ACTIVATE_FIELD_TRIAL_ORDINAL = 15;
    private static final int ADD_RULES_ORDINAL = 0;
    private static final int CRASH_ON_GET_COOKIE_LIST_ORDINAL = 10;
    private static final int CRASH_ON_RESOLVE_HOST_ORDINAL = 9;
    private static final int GET_ENVIRONMENT_VARIABLE_VALUE_ORDINAL = 13;
    private static final int GET_FIRST_PARTY_SET_ENTRIES_COUNT_ORDINAL = 16;
    private static final int GET_LATEST_MEMORY_PRESSURE_LEVEL_ORDINAL = 11;
    private static final int GET_PEER_TO_PEER_CONNECTIONS_COUNT_CHANGE_ORDINAL = 12;
    private static final int GET_SCT_AUDITING_PENDING_REPORTS_COUNT_ORDINAL = 18;
    private static final int LOG_ORDINAL = 14;
    public static final Interface.Manager<NetworkServiceTest, NetworkServiceTest.Proxy> MANAGER = new Interface.Manager<NetworkServiceTest, NetworkServiceTest.Proxy>() { // from class: org.chromium.network.mojom.NetworkServiceTest_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.NetworkServiceTest";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkServiceTest.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NetworkServiceTest impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetworkServiceTest[] buildArray(int size) {
            return new NetworkServiceTest[size];
        }
    };
    private static final int MOCK_CERT_VERIFIER_ADD_RESULT_FOR_CERT_AND_HOST_ORDINAL = 5;
    private static final int MOCK_CERT_VERIFIER_SET_DEFAULT_RESULT_ORDINAL = 4;
    private static final int SET_ALLOW_NETWORK_ACCESS_TO_HOST_RESOLUTIONS_ORDINAL = 8;
    private static final int SET_REQUIRE_CT_ORDINAL = 6;
    private static final int SET_SCT_AUDITING_REPORT_COMPLETION_CALLBACK_ORDINAL = 19;
    private static final int SET_SCT_AUDITING_RETRY_DELAY_ORDINAL = 17;
    private static final int SET_TRANSPORT_SECURITY_STATE_SOURCE_ORDINAL = 7;
    private static final int SIMULATE_CRASH_ORDINAL = 3;
    private static final int SIMULATE_NETWORK_CHANGE_ORDINAL = 1;
    private static final int SIMULATE_NETWORK_QUALITY_CHANGE_ORDINAL = 2;

    NetworkServiceTest_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NetworkServiceTest.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void addRules(Rule[] rules, AddRulesResponse callback) {
            NetworkServiceTestAddRulesParams _message = new NetworkServiceTestAddRulesParams();
            _message.rules = rules;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new NetworkServiceTestAddRulesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void simulateNetworkChange(int type, SimulateNetworkChangeResponse callback) {
            NetworkServiceTestSimulateNetworkChangeParams _message = new NetworkServiceTestSimulateNetworkChangeParams();
            _message.type = type;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new NetworkServiceTestSimulateNetworkChangeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void simulateNetworkQualityChange(int type, SimulateNetworkQualityChangeResponse callback) {
            NetworkServiceTestSimulateNetworkQualityChangeParams _message = new NetworkServiceTestSimulateNetworkQualityChangeParams();
            _message.type = type;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new NetworkServiceTestSimulateNetworkQualityChangeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void simulateCrash() {
            NetworkServiceTestSimulateCrashParams _message = new NetworkServiceTestSimulateCrashParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void mockCertVerifierSetDefaultResult(int defaultResult, MockCertVerifierSetDefaultResultResponse callback) {
            NetworkServiceTestMockCertVerifierSetDefaultResultParams _message = new NetworkServiceTestMockCertVerifierSetDefaultResultParams();
            _message.defaultResult = defaultResult;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void mockCertVerifierAddResultForCertAndHost(X509Certificate cert, String hostPattern, CertVerifyResult verifyResult, int rv, MockCertVerifierAddResultForCertAndHostResponse callback) {
            NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams _message = new NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams();
            _message.cert = cert;
            _message.hostPattern = hostPattern;
            _message.verifyResult = verifyResult;
            _message.rv = rv;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void setRequireCt(int required, SetRequireCtResponse callback) {
            NetworkServiceTestSetRequireCtParams _message = new NetworkServiceTestSetRequireCtParams();
            _message.required = required;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new NetworkServiceTestSetRequireCtResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void setTransportSecurityStateSource(short reportingPort, SetTransportSecurityStateSourceResponse callback) {
            NetworkServiceTestSetTransportSecurityStateSourceParams _message = new NetworkServiceTestSetTransportSecurityStateSourceParams();
            _message.reportingPort = reportingPort;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new NetworkServiceTestSetTransportSecurityStateSourceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void setAllowNetworkAccessToHostResolutions(SetAllowNetworkAccessToHostResolutionsResponse callback) {
            NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams _message = new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void crashOnResolveHost(String host) {
            NetworkServiceTestCrashOnResolveHostParams _message = new NetworkServiceTestCrashOnResolveHostParams();
            _message.host = host;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void crashOnGetCookieList() {
            NetworkServiceTestCrashOnGetCookieListParams _message = new NetworkServiceTestCrashOnGetCookieListParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void getLatestMemoryPressureLevel(GetLatestMemoryPressureLevelResponse callback) {
            NetworkServiceTestGetLatestMemoryPressureLevelParams _message = new NetworkServiceTestGetLatestMemoryPressureLevelParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11, 1, 0L)), new NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void getPeerToPeerConnectionsCountChange(GetPeerToPeerConnectionsCountChangeResponse callback) {
            NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams _message = new NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12, 1, 0L)), new NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void getEnvironmentVariableValue(String name, GetEnvironmentVariableValueResponse callback) {
            NetworkServiceTestGetEnvironmentVariableValueParams _message = new NetworkServiceTestGetEnvironmentVariableValueParams();
            _message.name = name;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13, 1, 0L)), new NetworkServiceTestGetEnvironmentVariableValueResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void log(String message, LogResponse callback) {
            NetworkServiceTestLogParams _message = new NetworkServiceTestLogParams();
            _message.message = message;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14, 1, 0L)), new NetworkServiceTestLogResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void activateFieldTrial(String fieldTrialName) {
            NetworkServiceTestActivateFieldTrialParams _message = new NetworkServiceTestActivateFieldTrialParams();
            _message.fieldTrialName = fieldTrialName;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void getFirstPartySetEntriesCount(GetFirstPartySetEntriesCountResponse callback) {
            NetworkServiceTestGetFirstPartySetEntriesCountParams _message = new NetworkServiceTestGetFirstPartySetEntriesCountParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16, 1, 0L)), new NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void setSctAuditingRetryDelay(TimeDelta delay, SetSctAuditingRetryDelayResponse callback) {
            NetworkServiceTestSetSctAuditingRetryDelayParams _message = new NetworkServiceTestSetSctAuditingRetryDelayParams();
            _message.delay = delay;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17, 1, 0L)), new NetworkServiceTestSetSctAuditingRetryDelayResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void getSctAuditingPendingReportsCount(GetSctAuditingPendingReportsCountResponse callback) {
            NetworkServiceTestGetSctAuditingPendingReportsCountParams _message = new NetworkServiceTestGetSctAuditingPendingReportsCountParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18, 1, 0L)), new NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.NetworkServiceTest
        public void setSctAuditingReportCompletionCallback(SetSctAuditingReportCompletionCallbackResponse callback) {
            NetworkServiceTestSetSctAuditingReportCompletionCallbackParams _message = new NetworkServiceTestSetSctAuditingReportCompletionCallbackParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19, 1, 0L)), new NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NetworkServiceTest> {
        Stub(Core core, NetworkServiceTest impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NetworkServiceTest_Internal.MANAGER, messageWithHeader);
                    case 3:
                        NetworkServiceTestSimulateCrashParams.deserialize(messageWithHeader.getPayload());
                        getImpl().simulateCrash();
                        return true;
                    case 9:
                        NetworkServiceTestCrashOnResolveHostParams data = NetworkServiceTestCrashOnResolveHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().crashOnResolveHost(data.host);
                        return true;
                    case 10:
                        NetworkServiceTestCrashOnGetCookieListParams.deserialize(messageWithHeader.getPayload());
                        getImpl().crashOnGetCookieList();
                        return true;
                    case 15:
                        NetworkServiceTestActivateFieldTrialParams data2 = NetworkServiceTestActivateFieldTrialParams.deserialize(messageWithHeader.getPayload());
                        getImpl().activateFieldTrial(data2.fieldTrialName);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NetworkServiceTest_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        NetworkServiceTestAddRulesParams data = NetworkServiceTestAddRulesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addRules(data.rules, new NetworkServiceTestAddRulesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        NetworkServiceTestSimulateNetworkChangeParams data2 = NetworkServiceTestSimulateNetworkChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().simulateNetworkChange(data2.type, new NetworkServiceTestSimulateNetworkChangeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        NetworkServiceTestSimulateNetworkQualityChangeParams data3 = NetworkServiceTestSimulateNetworkQualityChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().simulateNetworkQualityChange(data3.type, new NetworkServiceTestSimulateNetworkQualityChangeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                    case 9:
                    case 10:
                    case 15:
                    default:
                        return false;
                    case 4:
                        NetworkServiceTestMockCertVerifierSetDefaultResultParams data4 = NetworkServiceTestMockCertVerifierSetDefaultResultParams.deserialize(messageWithHeader.getPayload());
                        getImpl().mockCertVerifierSetDefaultResult(data4.defaultResult, new NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams data5 = NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().mockCertVerifierAddResultForCertAndHost(data5.cert, data5.hostPattern, data5.verifyResult, data5.rv, new NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        NetworkServiceTestSetRequireCtParams data6 = NetworkServiceTestSetRequireCtParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setRequireCt(data6.required, new NetworkServiceTestSetRequireCtResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        NetworkServiceTestSetTransportSecurityStateSourceParams data7 = NetworkServiceTestSetTransportSecurityStateSourceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setTransportSecurityStateSource(data7.reportingPort, new NetworkServiceTestSetTransportSecurityStateSourceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setAllowNetworkAccessToHostResolutions(new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 11:
                        NetworkServiceTestGetLatestMemoryPressureLevelParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getLatestMemoryPressureLevel(new NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 12:
                        NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPeerToPeerConnectionsCountChange(new NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 13:
                        NetworkServiceTestGetEnvironmentVariableValueParams data8 = NetworkServiceTestGetEnvironmentVariableValueParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getEnvironmentVariableValue(data8.name, new NetworkServiceTestGetEnvironmentVariableValueResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 14:
                        NetworkServiceTestLogParams data9 = NetworkServiceTestLogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().log(data9.message, new NetworkServiceTestLogResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 16:
                        NetworkServiceTestGetFirstPartySetEntriesCountParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getFirstPartySetEntriesCount(new NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 17:
                        NetworkServiceTestSetSctAuditingRetryDelayParams data10 = NetworkServiceTestSetSctAuditingRetryDelayParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSctAuditingRetryDelay(data10.delay, new NetworkServiceTestSetSctAuditingRetryDelayResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 18:
                        NetworkServiceTestGetSctAuditingPendingReportsCountParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getSctAuditingPendingReportsCount(new NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 19:
                        NetworkServiceTestSetSctAuditingReportCompletionCallbackParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setSctAuditingReportCompletionCallback(new NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestAddRulesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Rule[] rules;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestAddRulesParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestAddRulesParams() {
            this(0);
        }

        public static NetworkServiceTestAddRulesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestAddRulesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestAddRulesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestAddRulesParams result = new NetworkServiceTestAddRulesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.rules = new Rule[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.rules[i1] = Rule.decode(decoder2);
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
            Rule[] ruleArr = this.rules;
            if (ruleArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(ruleArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                Rule[] ruleArr2 = this.rules;
                if (i0 < ruleArr2.length) {
                    encoder1.encode((Struct) ruleArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestAddRulesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestAddRulesResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestAddRulesResponseParams() {
            this(0);
        }

        public static NetworkServiceTestAddRulesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestAddRulesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestAddRulesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestAddRulesResponseParams result = new NetworkServiceTestAddRulesResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestAddRulesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.AddRulesResponse mCallback;

        NetworkServiceTestAddRulesResponseParamsForwardToCallback(NetworkServiceTest.AddRulesResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 6)) {
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
    static class NetworkServiceTestAddRulesResponseParamsProxyToResponder implements NetworkServiceTest.AddRulesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestAddRulesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestAddRulesResponseParams _response = new NetworkServiceTestAddRulesResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSimulateNetworkChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSimulateNetworkChangeParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestSimulateNetworkChangeParams() {
            this(0);
        }

        public static NetworkServiceTestSimulateNetworkChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSimulateNetworkChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSimulateNetworkChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSimulateNetworkChangeParams result = new NetworkServiceTestSimulateNetworkChangeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.type = readInt;
                ConnectionType.validate(readInt);
                result.type = ConnectionType.toKnownValue(result.type);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.type, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSimulateNetworkChangeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSimulateNetworkChangeResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSimulateNetworkChangeResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSimulateNetworkChangeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSimulateNetworkChangeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSimulateNetworkChangeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSimulateNetworkChangeResponseParams result = new NetworkServiceTestSimulateNetworkChangeResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSimulateNetworkChangeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SimulateNetworkChangeResponse mCallback;

        NetworkServiceTestSimulateNetworkChangeResponseParamsForwardToCallback(NetworkServiceTest.SimulateNetworkChangeResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 2)) {
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
    static class NetworkServiceTestSimulateNetworkChangeResponseParamsProxyToResponder implements NetworkServiceTest.SimulateNetworkChangeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSimulateNetworkChangeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSimulateNetworkChangeResponseParams _response = new NetworkServiceTestSimulateNetworkChangeResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSimulateNetworkQualityChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSimulateNetworkQualityChangeParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestSimulateNetworkQualityChangeParams() {
            this(0);
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSimulateNetworkQualityChangeParams result = new NetworkServiceTestSimulateNetworkQualityChangeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.type = readInt;
                EffectiveConnectionType.validate(readInt);
                result.type = EffectiveConnectionType.toKnownValue(result.type);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.type, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSimulateNetworkQualityChangeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSimulateNetworkQualityChangeResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSimulateNetworkQualityChangeResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSimulateNetworkQualityChangeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSimulateNetworkQualityChangeResponseParams result = new NetworkServiceTestSimulateNetworkQualityChangeResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSimulateNetworkQualityChangeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SimulateNetworkQualityChangeResponse mCallback;

        NetworkServiceTestSimulateNetworkQualityChangeResponseParamsForwardToCallback(NetworkServiceTest.SimulateNetworkQualityChangeResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
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
    static class NetworkServiceTestSimulateNetworkQualityChangeResponseParamsProxyToResponder implements NetworkServiceTest.SimulateNetworkQualityChangeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSimulateNetworkQualityChangeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSimulateNetworkQualityChangeResponseParams _response = new NetworkServiceTestSimulateNetworkQualityChangeResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSimulateCrashParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSimulateCrashParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSimulateCrashParams() {
            this(0);
        }

        public static NetworkServiceTestSimulateCrashParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSimulateCrashParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSimulateCrashParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSimulateCrashParams result = new NetworkServiceTestSimulateCrashParams(elementsOrVersion);
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
    static final class NetworkServiceTestMockCertVerifierSetDefaultResultParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int defaultResult;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestMockCertVerifierSetDefaultResultParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestMockCertVerifierSetDefaultResultParams() {
            this(0);
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestMockCertVerifierSetDefaultResultParams result = new NetworkServiceTestMockCertVerifierSetDefaultResultParams(elementsOrVersion);
                result.defaultResult = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.defaultResult, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams() {
            this(0);
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams result = new NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.MockCertVerifierSetDefaultResultResponse mCallback;

        NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsForwardToCallback(NetworkServiceTest.MockCertVerifierSetDefaultResultResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 6)) {
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
    static class NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsProxyToResponder implements NetworkServiceTest.MockCertVerifierSetDefaultResultResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestMockCertVerifierSetDefaultResultResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams _response = new NetworkServiceTestMockCertVerifierSetDefaultResultResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public X509Certificate cert;
        public String hostPattern;
        public int rv;
        public CertVerifyResult verifyResult;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams(int version) {
            super(40, version);
        }

        public NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams() {
            this(0);
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams result = new NetworkServiceTestMockCertVerifierAddResultForCertAndHostParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.cert = X509Certificate.decode(decoder1);
                result.hostPattern = decoder0.readString(16, false);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.verifyResult = CertVerifyResult.decode(decoder12);
                result.rv = decoder0.readInt(32);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.cert, 8, false);
            encoder0.encode(this.hostPattern, 16, false);
            encoder0.encode((Struct) this.verifyResult, 24, false);
            encoder0.encode(this.rv, 32);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams() {
            this(0);
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams result = new NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.MockCertVerifierAddResultForCertAndHostResponse mCallback;

        NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsForwardToCallback(NetworkServiceTest.MockCertVerifierAddResultForCertAndHostResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 6)) {
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
    static class NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsProxyToResponder implements NetworkServiceTest.MockCertVerifierAddResultForCertAndHostResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams _response = new NetworkServiceTestMockCertVerifierAddResultForCertAndHostResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetRequireCtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int required;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetRequireCtParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestSetRequireCtParams() {
            this(0);
        }

        public static NetworkServiceTestSetRequireCtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetRequireCtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetRequireCtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetRequireCtParams result = new NetworkServiceTestSetRequireCtParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.required = readInt;
                NetworkServiceTest.RequireCt.validate(readInt);
                result.required = NetworkServiceTest.RequireCt.toKnownValue(result.required);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.required, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetRequireCtResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetRequireCtResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetRequireCtResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSetRequireCtResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetRequireCtResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetRequireCtResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetRequireCtResponseParams result = new NetworkServiceTestSetRequireCtResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSetRequireCtResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SetRequireCtResponse mCallback;

        NetworkServiceTestSetRequireCtResponseParamsForwardToCallback(NetworkServiceTest.SetRequireCtResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 6)) {
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
    static class NetworkServiceTestSetRequireCtResponseParamsProxyToResponder implements NetworkServiceTest.SetRequireCtResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSetRequireCtResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSetRequireCtResponseParams _response = new NetworkServiceTestSetRequireCtResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetTransportSecurityStateSourceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public short reportingPort;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetTransportSecurityStateSourceParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestSetTransportSecurityStateSourceParams() {
            this(0);
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetTransportSecurityStateSourceParams result = new NetworkServiceTestSetTransportSecurityStateSourceParams(elementsOrVersion);
                result.reportingPort = decoder0.readShort(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reportingPort, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetTransportSecurityStateSourceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetTransportSecurityStateSourceResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetTransportSecurityStateSourceResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetTransportSecurityStateSourceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetTransportSecurityStateSourceResponseParams result = new NetworkServiceTestSetTransportSecurityStateSourceResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSetTransportSecurityStateSourceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SetTransportSecurityStateSourceResponse mCallback;

        NetworkServiceTestSetTransportSecurityStateSourceResponseParamsForwardToCallback(NetworkServiceTest.SetTransportSecurityStateSourceResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 6)) {
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
    static class NetworkServiceTestSetTransportSecurityStateSourceResponseParamsProxyToResponder implements NetworkServiceTest.SetTransportSecurityStateSourceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSetTransportSecurityStateSourceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSetTransportSecurityStateSourceResponseParams _response = new NetworkServiceTestSetTransportSecurityStateSourceResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams() {
            this(0);
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams result = new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsParams(elementsOrVersion);
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
    static final class NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams result = new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SetAllowNetworkAccessToHostResolutionsResponse mCallback;

        NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsForwardToCallback(NetworkServiceTest.SetAllowNetworkAccessToHostResolutionsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 6)) {
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
    static class NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsProxyToResponder implements NetworkServiceTest.SetAllowNetworkAccessToHostResolutionsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams _response = new NetworkServiceTestSetAllowNetworkAccessToHostResolutionsResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestCrashOnResolveHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String host;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestCrashOnResolveHostParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestCrashOnResolveHostParams() {
            this(0);
        }

        public static NetworkServiceTestCrashOnResolveHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestCrashOnResolveHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestCrashOnResolveHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestCrashOnResolveHostParams result = new NetworkServiceTestCrashOnResolveHostParams(elementsOrVersion);
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

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestCrashOnGetCookieListParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestCrashOnGetCookieListParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestCrashOnGetCookieListParams() {
            this(0);
        }

        public static NetworkServiceTestCrashOnGetCookieListParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestCrashOnGetCookieListParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestCrashOnGetCookieListParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestCrashOnGetCookieListParams result = new NetworkServiceTestCrashOnGetCookieListParams(elementsOrVersion);
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
    static final class NetworkServiceTestGetLatestMemoryPressureLevelParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetLatestMemoryPressureLevelParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestGetLatestMemoryPressureLevelParams() {
            this(0);
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetLatestMemoryPressureLevelParams result = new NetworkServiceTestGetLatestMemoryPressureLevelParams(elementsOrVersion);
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
    public static final class NetworkServiceTestGetLatestMemoryPressureLevelResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int memoryPressureLevel;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetLatestMemoryPressureLevelResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetLatestMemoryPressureLevelResponseParams() {
            this(0);
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetLatestMemoryPressureLevelResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetLatestMemoryPressureLevelResponseParams result = new NetworkServiceTestGetLatestMemoryPressureLevelResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.GetLatestMemoryPressureLevelResponse mCallback;

        NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsForwardToCallback(NetworkServiceTest.GetLatestMemoryPressureLevelResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(11, 6)) {
                    return false;
                }
                NetworkServiceTestGetLatestMemoryPressureLevelResponseParams response = NetworkServiceTestGetLatestMemoryPressureLevelResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.memoryPressureLevel));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsProxyToResponder implements NetworkServiceTest.GetLatestMemoryPressureLevelResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestGetLatestMemoryPressureLevelResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer memoryPressureLevel) {
            NetworkServiceTestGetLatestMemoryPressureLevelResponseParams _response = new NetworkServiceTestGetLatestMemoryPressureLevelResponseParams();
            _response.memoryPressureLevel = memoryPressureLevel.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(11, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams() {
            this(0);
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams result = new NetworkServiceTestGetPeerToPeerConnectionsCountChangeParams(elementsOrVersion);
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
    public static final class NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int connectionCount;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams() {
            this(0);
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams result = new NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams(elementsOrVersion);
                result.connectionCount = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.connectionCount, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.GetPeerToPeerConnectionsCountChangeResponse mCallback;

        NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsForwardToCallback(NetworkServiceTest.GetPeerToPeerConnectionsCountChangeResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(12, 6)) {
                    return false;
                }
                NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams response = NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.connectionCount));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsProxyToResponder implements NetworkServiceTest.GetPeerToPeerConnectionsCountChangeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer connectionCount) {
            NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams _response = new NetworkServiceTestGetPeerToPeerConnectionsCountChangeResponseParams();
            _response.connectionCount = connectionCount.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(12, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestGetEnvironmentVariableValueParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetEnvironmentVariableValueParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetEnvironmentVariableValueParams() {
            this(0);
        }

        public static NetworkServiceTestGetEnvironmentVariableValueParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetEnvironmentVariableValueParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetEnvironmentVariableValueParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetEnvironmentVariableValueParams result = new NetworkServiceTestGetEnvironmentVariableValueParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NetworkServiceTestGetEnvironmentVariableValueResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetEnvironmentVariableValueResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetEnvironmentVariableValueResponseParams() {
            this(0);
        }

        public static NetworkServiceTestGetEnvironmentVariableValueResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetEnvironmentVariableValueResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetEnvironmentVariableValueResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetEnvironmentVariableValueResponseParams result = new NetworkServiceTestGetEnvironmentVariableValueResponseParams(elementsOrVersion);
                result.value = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.value, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetEnvironmentVariableValueResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.GetEnvironmentVariableValueResponse mCallback;

        NetworkServiceTestGetEnvironmentVariableValueResponseParamsForwardToCallback(NetworkServiceTest.GetEnvironmentVariableValueResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(13, 6)) {
                    return false;
                }
                NetworkServiceTestGetEnvironmentVariableValueResponseParams response = NetworkServiceTestGetEnvironmentVariableValueResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.value);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetEnvironmentVariableValueResponseParamsProxyToResponder implements NetworkServiceTest.GetEnvironmentVariableValueResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestGetEnvironmentVariableValueResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(String value) {
            NetworkServiceTestGetEnvironmentVariableValueResponseParams _response = new NetworkServiceTestGetEnvironmentVariableValueResponseParams();
            _response.value = value;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(13, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestLogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestLogParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestLogParams() {
            this(0);
        }

        public static NetworkServiceTestLogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestLogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestLogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestLogParams result = new NetworkServiceTestLogParams(elementsOrVersion);
                result.message = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.message, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestLogResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestLogResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestLogResponseParams() {
            this(0);
        }

        public static NetworkServiceTestLogResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestLogResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestLogResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestLogResponseParams result = new NetworkServiceTestLogResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestLogResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.LogResponse mCallback;

        NetworkServiceTestLogResponseParamsForwardToCallback(NetworkServiceTest.LogResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(14, 6)) {
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
    static class NetworkServiceTestLogResponseParamsProxyToResponder implements NetworkServiceTest.LogResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestLogResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestLogResponseParams _response = new NetworkServiceTestLogResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(14, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestActivateFieldTrialParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String fieldTrialName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestActivateFieldTrialParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestActivateFieldTrialParams() {
            this(0);
        }

        public static NetworkServiceTestActivateFieldTrialParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestActivateFieldTrialParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestActivateFieldTrialParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestActivateFieldTrialParams result = new NetworkServiceTestActivateFieldTrialParams(elementsOrVersion);
                result.fieldTrialName = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.fieldTrialName, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestGetFirstPartySetEntriesCountParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetFirstPartySetEntriesCountParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestGetFirstPartySetEntriesCountParams() {
            this(0);
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetFirstPartySetEntriesCountParams result = new NetworkServiceTestGetFirstPartySetEntriesCountParams(elementsOrVersion);
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
    public static final class NetworkServiceTestGetFirstPartySetEntriesCountResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long entries;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetFirstPartySetEntriesCountResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetFirstPartySetEntriesCountResponseParams() {
            this(0);
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetFirstPartySetEntriesCountResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetFirstPartySetEntriesCountResponseParams result = new NetworkServiceTestGetFirstPartySetEntriesCountResponseParams(elementsOrVersion);
                result.entries = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.entries, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.GetFirstPartySetEntriesCountResponse mCallback;

        NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsForwardToCallback(NetworkServiceTest.GetFirstPartySetEntriesCountResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(16, 6)) {
                    return false;
                }
                NetworkServiceTestGetFirstPartySetEntriesCountResponseParams response = NetworkServiceTestGetFirstPartySetEntriesCountResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Long.valueOf(response.entries));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsProxyToResponder implements NetworkServiceTest.GetFirstPartySetEntriesCountResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestGetFirstPartySetEntriesCountResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Long entries) {
            NetworkServiceTestGetFirstPartySetEntriesCountResponseParams _response = new NetworkServiceTestGetFirstPartySetEntriesCountResponseParams();
            _response.entries = entries.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(16, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetSctAuditingRetryDelayParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta delay;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetSctAuditingRetryDelayParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestSetSctAuditingRetryDelayParams() {
            this(0);
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetSctAuditingRetryDelayParams result = new NetworkServiceTestSetSctAuditingRetryDelayParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.delay = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.delay, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetSctAuditingRetryDelayResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetSctAuditingRetryDelayResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetSctAuditingRetryDelayResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetSctAuditingRetryDelayResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetSctAuditingRetryDelayResponseParams result = new NetworkServiceTestSetSctAuditingRetryDelayResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSetSctAuditingRetryDelayResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SetSctAuditingRetryDelayResponse mCallback;

        NetworkServiceTestSetSctAuditingRetryDelayResponseParamsForwardToCallback(NetworkServiceTest.SetSctAuditingRetryDelayResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(17, 6)) {
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
    static class NetworkServiceTestSetSctAuditingRetryDelayResponseParamsProxyToResponder implements NetworkServiceTest.SetSctAuditingRetryDelayResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSetSctAuditingRetryDelayResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSetSctAuditingRetryDelayResponseParams _response = new NetworkServiceTestSetSctAuditingRetryDelayResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(17, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestGetSctAuditingPendingReportsCountParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetSctAuditingPendingReportsCountParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestGetSctAuditingPendingReportsCountParams() {
            this(0);
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetSctAuditingPendingReportsCountParams result = new NetworkServiceTestGetSctAuditingPendingReportsCountParams(elementsOrVersion);
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
    public static final class NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long reports;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams(int version) {
            super(16, version);
        }

        public NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams() {
            this(0);
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams result = new NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams(elementsOrVersion);
                result.reports = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reports, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.GetSctAuditingPendingReportsCountResponse mCallback;

        NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsForwardToCallback(NetworkServiceTest.GetSctAuditingPendingReportsCountResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(18, 6)) {
                    return false;
                }
                NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams response = NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Long.valueOf(response.reports));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsProxyToResponder implements NetworkServiceTest.GetSctAuditingPendingReportsCountResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestGetSctAuditingPendingReportsCountResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Long reports) {
            NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams _response = new NetworkServiceTestGetSctAuditingPendingReportsCountResponseParams();
            _response.reports = reports.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(18, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class NetworkServiceTestSetSctAuditingReportCompletionCallbackParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetSctAuditingReportCompletionCallbackParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetSctAuditingReportCompletionCallbackParams() {
            this(0);
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetSctAuditingReportCompletionCallbackParams result = new NetworkServiceTestSetSctAuditingReportCompletionCallbackParams(elementsOrVersion);
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
    static final class NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams(int version) {
            super(8, version);
        }

        public NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams() {
            this(0);
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams result = new NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams(elementsOrVersion);
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
    static class NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final NetworkServiceTest.SetSctAuditingReportCompletionCallbackResponse mCallback;

        NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsForwardToCallback(NetworkServiceTest.SetSctAuditingReportCompletionCallbackResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsProxyToResponder implements NetworkServiceTest.SetSctAuditingReportCompletionCallbackResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams _response = new NetworkServiceTestSetSctAuditingReportCompletionCallbackResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(19, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
