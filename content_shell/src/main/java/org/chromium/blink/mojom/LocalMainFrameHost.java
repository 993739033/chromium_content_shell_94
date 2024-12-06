package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface LocalMainFrameHost extends Interface {
    public static final Manager<LocalMainFrameHost, Proxy> MANAGER = LocalMainFrameHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends LocalMainFrameHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetWindowRectResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ShowCreatedWindowResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface UpdateTargetUrlResponse extends Callbacks.Callback0 {
    }

    void contentsPreferredSizeChanged(Size size);

    void didFirstVisuallyNonEmptyPaint();

    void focusPage();

    void requestClose();

    void scaleFactorChanged(float f);

    void setWindowRect(Rect rect, SetWindowRectResponse setWindowRectResponse);

    void showCreatedWindow(LocalFrameToken localFrameToken, int i, Rect rect, boolean z, ShowCreatedWindowResponse showCreatedWindowResponse);

    void takeFocus(boolean z);

    void textAutosizerPageInfoChanged(TextAutosizerPageInfo textAutosizerPageInfo);

    void updateTargetUrl(Url url, UpdateTargetUrlResponse updateTargetUrlResponse);
}
