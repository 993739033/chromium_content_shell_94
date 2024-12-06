package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
/* loaded from: classes2.dex */
public interface FontUniqueNameLookup extends Interface {
    public static final Manager<FontUniqueNameLookup, Proxy> MANAGER = FontUniqueNameLookup_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetUniqueNameLookupTableIfAvailableResponse extends Callbacks.Callback2<Boolean, ReadOnlySharedMemoryRegion> {
    }

    /* loaded from: classes2.dex */
    public interface GetUniqueNameLookupTableResponse extends Callbacks.Callback1<ReadOnlySharedMemoryRegion> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FontUniqueNameLookup, Interface.Proxy {
    }

    void getUniqueNameLookupTable(GetUniqueNameLookupTableResponse getUniqueNameLookupTableResponse);

    void getUniqueNameLookupTableIfAvailable(GetUniqueNameLookupTableIfAvailableResponse getUniqueNameLookupTableIfAvailableResponse);
}
