package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BadgeService extends Interface {
    public static final Manager<BadgeService, Proxy> MANAGER = BadgeService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BadgeService, Interface.Proxy {
    }

    void clearBadge();

    void setBadge(BadgeValue badgeValue);
}
