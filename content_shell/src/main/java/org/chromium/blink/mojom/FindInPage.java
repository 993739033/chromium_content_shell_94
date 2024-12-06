package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.PointF;
import org.chromium.gfx.mojom.RectF;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FindInPage extends Interface {
    public static final Manager<FindInPage, Proxy> MANAGER = FindInPage_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FindMatchRectsResponse extends Callbacks.Callback3<Integer, RectF[], RectF> {
    }

    /* loaded from: classes2.dex */
    public interface GetNearestFindResultResponse extends Callbacks.Callback1<Float> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FindInPage, Interface.Proxy {
    }

    void activateNearestFindResult(int i, PointF pointF);

    void clearActiveFindMatch();

    void find(int i, String str, FindOptions findOptions);

    void findMatchRects(int i, FindMatchRectsResponse findMatchRectsResponse);

    void getNearestFindResult(PointF pointF, GetNearestFindResultResponse getNearestFindResultResponse);

    void setClient(FindInPageClient findInPageClient);

    void stopFinding(int i);
}
