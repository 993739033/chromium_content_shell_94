package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyFile;
/* loaded from: classes2.dex */
public interface AndroidFontLookup extends Interface {
    public static final Manager<AndroidFontLookup, Proxy> MANAGER = AndroidFontLookup_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetUniqueNameLookupTableResponse extends Callbacks.Callback1<String[]> {
    }

    /* loaded from: classes2.dex */
    public interface MatchLocalFontByUniqueNameResponse extends Callbacks.Callback1<ReadOnlyFile> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AndroidFontLookup, Interface.Proxy {
    }

    void getUniqueNameLookupTable(GetUniqueNameLookupTableResponse getUniqueNameLookupTableResponse);

    void matchLocalFontByUniqueName(String str, MatchLocalFontByUniqueNameResponse matchLocalFontByUniqueNameResponse);
}
