package org.chromium.content.browser;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ClientDataJsonImpl;
/* loaded from: classes2.dex */
public class ClientDataJsonImplJni implements ClientDataJsonImpl.Natives {
    public static final JniStaticTestMocker<ClientDataJsonImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<ClientDataJsonImpl.Natives>() { // from class: org.chromium.content.browser.ClientDataJsonImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ClientDataJsonImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ClientDataJsonImpl.Natives unused = ClientDataJsonImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ClientDataJsonImpl.Natives testInstance;

    @Override // org.chromium.content.browser.ClientDataJsonImpl.Natives
    public String buildClientDataJson(int clientDataRequestType, String callerOrigin, byte[] challenge, boolean isCrossOrigin, ByteBuffer optionsByteBuffer, String relyingPartyId, String topOrigin) {
        return GEN_JNI.org_chromium_content_browser_ClientDataJsonImpl_buildClientDataJson(clientDataRequestType, callerOrigin, challenge, isCrossOrigin, optionsByteBuffer, relyingPartyId, topOrigin);
    }

    public static ClientDataJsonImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ClientDataJsonImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ClientDataJsonImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ClientDataJsonImplJni();
    }
}
