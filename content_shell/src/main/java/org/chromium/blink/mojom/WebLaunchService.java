package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WebLaunchService extends Interface {
    public static final Manager<WebLaunchService, Proxy> MANAGER = WebLaunchService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebLaunchService, Interface.Proxy {
    }

    void setLaunchFiles(FileSystemAccessEntry[] fileSystemAccessEntryArr);
}
