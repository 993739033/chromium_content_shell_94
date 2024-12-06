package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CdmFactory extends Interface {
    public static final Manager<CdmFactory, Proxy> MANAGER = CdmFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateCdmResponse extends Callbacks.Callback3<ContentDecryptionModule, CdmContext, String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CdmFactory, Interface.Proxy {
    }

    void createCdm(String str, CdmConfig cdmConfig, CreateCdmResponse createCdmResponse);
}
