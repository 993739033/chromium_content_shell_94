package org.chromium.content.browser.framehost;

import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.framehost.RenderFrameHostImpl;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.GURL;
import org.chromium.url.Origin;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RenderFrameHostImplJni implements RenderFrameHostImpl.Natives {
    public static final JniStaticTestMocker<RenderFrameHostImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<RenderFrameHostImpl.Natives>() { // from class: org.chromium.content.browser.framehost.RenderFrameHostImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(RenderFrameHostImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                RenderFrameHostImpl.Natives unused = RenderFrameHostImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static RenderFrameHostImpl.Natives testInstance;

    RenderFrameHostImplJni() {
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public GURL getLastCommittedURL(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return (GURL) GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedURL(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public Origin getLastCommittedOrigin(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return (Origin) GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedOrigin(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public void getCanonicalUrlForSharing(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, Callback<GURL> callback) {
        GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getCanonicalUrlForSharing(nativeRenderFrameHostAndroid, caller, callback);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public boolean isFeatureEnabled(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, int feature) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isFeatureEnabled(nativeRenderFrameHostAndroid, caller, feature);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public UnguessableToken getAndroidOverlayRoutingToken(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return (UnguessableToken) GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getAndroidOverlayRoutingToken(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public void notifyUserActivation(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_notifyUserActivation(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public boolean signalModalCloseWatcherIfActive(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_signalModalCloseWatcherIfActive(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public boolean isRenderFrameCreated(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isRenderFrameCreated(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public void getInterfaceToRendererFrame(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, String interfacename, int messagePipeRawHandle) {
        GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getInterfaceToRendererFrame(nativeRenderFrameHostAndroid, caller, interfacename, messagePipeRawHandle);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public void terminateRendererDueToBadMessage(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, int reason) {
        GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_terminateRendererDueToBadMessage(nativeRenderFrameHostAndroid, caller, reason);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public boolean isProcessBlocked(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_isProcessBlocked(nativeRenderFrameHostAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public RenderFrameHost.WebAuthSecurityChecksResults performGetAssertionWebAuthSecurityChecks(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, String relyingPartyId, Origin effectiveOrigin) {
        return (RenderFrameHost.WebAuthSecurityChecksResults) GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_performGetAssertionWebAuthSecurityChecks(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public int performMakeCredentialWebAuthSecurityChecks(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller, String relyingPartyId, Origin effectiveOrigin, boolean isPaymentCredentialCreation) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_performMakeCredentialWebAuthSecurityChecks(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin, isPaymentCredentialCreation);
    }

    @Override // org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives
    public int getLifecycleState(long nativeRenderFrameHostAndroid, RenderFrameHostImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_RenderFrameHostImpl_getLifecycleState(nativeRenderFrameHostAndroid, caller);
    }

    public static RenderFrameHostImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            RenderFrameHostImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.RenderFrameHostImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new RenderFrameHostImplJni();
    }
}
