package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface NetworkServiceTest extends Interface {
    public static final Manager<NetworkServiceTest, Proxy> MANAGER = NetworkServiceTest_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddRulesResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetEnvironmentVariableValueResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface GetFirstPartySetEntriesCountResponse extends Callbacks.Callback1<Long> {
    }

    /* loaded from: classes2.dex */
    public interface GetLatestMemoryPressureLevelResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetPeerToPeerConnectionsCountChangeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetSctAuditingPendingReportsCountResponse extends Callbacks.Callback1<Long> {
    }

    /* loaded from: classes2.dex */
    public interface LogResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface MockCertVerifierAddResultForCertAndHostResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface MockCertVerifierSetDefaultResultResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkServiceTest, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetAllowNetworkAccessToHostResolutionsResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SetRequireCtResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SetSctAuditingReportCompletionCallbackResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SetSctAuditingRetryDelayResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SetTransportSecurityStateSourceResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SimulateNetworkChangeResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface SimulateNetworkQualityChangeResponse extends Callbacks.Callback0 {
    }

    void activateFieldTrial(String str);

    void addRules(Rule[] ruleArr, AddRulesResponse addRulesResponse);

    void crashOnGetCookieList();

    void crashOnResolveHost(String str);

    void getEnvironmentVariableValue(String str, GetEnvironmentVariableValueResponse getEnvironmentVariableValueResponse);

    void getFirstPartySetEntriesCount(GetFirstPartySetEntriesCountResponse getFirstPartySetEntriesCountResponse);

    void getLatestMemoryPressureLevel(GetLatestMemoryPressureLevelResponse getLatestMemoryPressureLevelResponse);

    void getPeerToPeerConnectionsCountChange(GetPeerToPeerConnectionsCountChangeResponse getPeerToPeerConnectionsCountChangeResponse);

    void getSctAuditingPendingReportsCount(GetSctAuditingPendingReportsCountResponse getSctAuditingPendingReportsCountResponse);

    void log(String str, LogResponse logResponse);

    void mockCertVerifierAddResultForCertAndHost(X509Certificate x509Certificate, String str, CertVerifyResult certVerifyResult, int i, MockCertVerifierAddResultForCertAndHostResponse mockCertVerifierAddResultForCertAndHostResponse);

    void mockCertVerifierSetDefaultResult(int i, MockCertVerifierSetDefaultResultResponse mockCertVerifierSetDefaultResultResponse);

    void setAllowNetworkAccessToHostResolutions(SetAllowNetworkAccessToHostResolutionsResponse setAllowNetworkAccessToHostResolutionsResponse);

    void setRequireCt(int i, SetRequireCtResponse setRequireCtResponse);

    void setSctAuditingReportCompletionCallback(SetSctAuditingReportCompletionCallbackResponse setSctAuditingReportCompletionCallbackResponse);

    void setSctAuditingRetryDelay(TimeDelta timeDelta, SetSctAuditingRetryDelayResponse setSctAuditingRetryDelayResponse);

    void setTransportSecurityStateSource(short s, SetTransportSecurityStateSourceResponse setTransportSecurityStateSourceResponse);

    void simulateCrash();

    void simulateNetworkChange(int i, SimulateNetworkChangeResponse simulateNetworkChangeResponse);

    void simulateNetworkQualityChange(int i, SimulateNetworkQualityChangeResponse simulateNetworkQualityChangeResponse);

    /* loaded from: classes2.dex */
    public static final class RequireCt {
        public static final int DEFAULT = 0;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int REQUIRE = 1;

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

        private RequireCt() {
        }
    }
}
