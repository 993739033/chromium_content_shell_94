package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface OomIntervention extends Interface {
    public static final Manager<OomIntervention, Proxy> MANAGER = OomIntervention_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends OomIntervention, Interface.Proxy {
    }

    void startDetection(OomInterventionHost oomInterventionHost, DetectionArgs detectionArgs, boolean z, boolean z2, boolean z3);
}
