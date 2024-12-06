package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ContentDecryptionModuleClient extends Interface {
    public static final Manager<ContentDecryptionModuleClient, Proxy> MANAGER = ContentDecryptionModuleClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ContentDecryptionModuleClient, Interface.Proxy {
    }

    void onSessionClosed(String str, int i);

    void onSessionExpirationUpdate(String str, double d);

    void onSessionKeysChange(String str, boolean z, CdmKeyInformation[] cdmKeyInformationArr);

    void onSessionMessage(String str, int i, byte[] bArr);
}
