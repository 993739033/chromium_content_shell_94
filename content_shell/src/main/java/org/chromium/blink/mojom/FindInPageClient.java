package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FindInPageClient extends Interface {
    public static final Manager<FindInPageClient, Proxy> MANAGER = FindInPageClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FindInPageClient, Interface.Proxy {
    }

    void setActiveMatch(int i, Rect rect, int i2, int i3);

    void setNumberOfMatches(int i, int i2, int i3);
}
