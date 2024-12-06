package org.chromium.webshare.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ShareService extends Interface {
    public static final Manager<ShareService, Proxy> MANAGER = ShareService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ShareService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ShareResponse extends Callbacks.Callback1<Integer> {
    }

    void share(String str, String str2, Url url, SharedFile[] sharedFileArr, ShareResponse shareResponse);
}
