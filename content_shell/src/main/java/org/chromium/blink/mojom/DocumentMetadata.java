package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DocumentMetadata extends Interface {
    public static final Manager<DocumentMetadata, Proxy> MANAGER = DocumentMetadata_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetEntitiesResponse extends Callbacks.Callback1<WebPage> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DocumentMetadata, Interface.Proxy {
    }

    void getEntities(GetEntitiesResponse getEntitiesResponse);
}
