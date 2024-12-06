package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface RestrictedInterestGroupStore extends Interface {
    public static final Manager<RestrictedInterestGroupStore, Proxy> MANAGER = RestrictedInterestGroupStore_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RestrictedInterestGroupStore, Interface.Proxy {
    }

    void joinInterestGroup(InterestGroup interestGroup);

    void leaveInterestGroup(Origin origin, String str);

    void updateAdInterestGroups();
}
