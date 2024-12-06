package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
/* loaded from: classes2.dex */
public interface FontAccessManager extends Interface {
    public static final Manager<FontAccessManager, Proxy> MANAGER = FontAccessManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChooseLocalFontsResponse extends Callbacks.Callback2<Integer, FontMetadata[]> {
    }

    /* loaded from: classes2.dex */
    public interface EnumerateLocalFontsResponse extends Callbacks.Callback2<Integer, ReadOnlySharedMemoryRegion> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FontAccessManager, Interface.Proxy {
    }

    void chooseLocalFonts(String[] strArr, ChooseLocalFontsResponse chooseLocalFontsResponse);

    void enumerateLocalFonts(EnumerateLocalFontsResponse enumerateLocalFontsResponse);
}
