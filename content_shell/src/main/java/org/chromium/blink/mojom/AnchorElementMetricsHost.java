package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AnchorElementMetricsHost extends Interface {
    public static final Manager<AnchorElementMetricsHost, Proxy> MANAGER = AnchorElementMetricsHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AnchorElementMetricsHost, Interface.Proxy {
    }

    void reportAnchorElementClick(AnchorElementClick anchorElementClick);

    void reportAnchorElementsEnteredViewport(AnchorElementEnteredViewport[] anchorElementEnteredViewportArr);

    void reportNewAnchorElements(AnchorElementMetrics[] anchorElementMetricsArr);
}
