package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface WebDatabase extends Interface {
    public static final Manager<WebDatabase, Proxy> MANAGER = WebDatabase_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebDatabase, Interface.Proxy {
    }

    void closeImmediately(Origin origin, String16 string16);

    void updateSize(Origin origin, String16 string16, long j);
}
