package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ContentSecurityNotifier extends Interface {
    public static final Manager<ContentSecurityNotifier, Proxy> MANAGER = ContentSecurityNotifier_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ContentSecurityNotifier, Interface.Proxy {
    }

    void notifyContentWithCertificateErrorsDisplayed();

    void notifyContentWithCertificateErrorsRan();

    void notifyInsecureContentRan(Url url, Url url2);
}
