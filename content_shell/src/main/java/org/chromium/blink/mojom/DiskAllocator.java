package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DiskAllocator extends Interface {
    public static final Manager<DiskAllocator, Proxy> MANAGER = DiskAllocator_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DiskAllocator, Interface.Proxy {
    }

    void provideTemporaryFile(org.chromium.mojo_base.mojom.File file);
}
