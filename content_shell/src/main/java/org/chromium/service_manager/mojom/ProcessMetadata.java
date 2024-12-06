package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ProcessId;
/* loaded from: classes2.dex */
public interface ProcessMetadata extends Interface {
    public static final Manager<ProcessMetadata, Proxy> MANAGER = ProcessMetadata_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProcessMetadata, Interface.Proxy {
    }

    void setPid(ProcessId processId);
}
