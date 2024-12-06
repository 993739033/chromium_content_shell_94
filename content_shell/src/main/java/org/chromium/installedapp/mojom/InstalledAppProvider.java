package org.chromium.installedapp.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface InstalledAppProvider extends Interface {
    public static final Manager<InstalledAppProvider, Proxy> MANAGER = InstalledAppProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FilterInstalledAppsResponse extends Callbacks.Callback1<RelatedApplication[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends InstalledAppProvider, Interface.Proxy {
    }

    void filterInstalledApps(RelatedApplication[] relatedApplicationArr, Url url, FilterInstalledAppsResponse filterInstalledAppsResponse);
}
