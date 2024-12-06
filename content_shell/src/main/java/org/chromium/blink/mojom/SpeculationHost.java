package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SpeculationHost extends Interface {
    public static final Manager<SpeculationHost, Proxy> MANAGER = SpeculationHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SpeculationHost, Interface.Proxy {
    }

    void updateSpeculationCandidates(SpeculationCandidate[] speculationCandidateArr);
}
