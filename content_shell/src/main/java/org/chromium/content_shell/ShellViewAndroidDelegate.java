package org.chromium.content_shell;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import org.chromium.ui.base.ViewAndroidDelegate;
/* loaded from: classes2.dex */
public class ShellViewAndroidDelegate extends ViewAndroidDelegate {
    private OnCursorUpdateHelper mOnCursorUpdateHelper;

    /* loaded from: classes2.dex */
    public interface OnCursorUpdateHelper {
        void notifyCalled(int i);
    }

    public ShellViewAndroidDelegate(ViewGroup containerView) {
        super(containerView);
    }

    public void setOnCursorUpdateHelper(OnCursorUpdateHelper helper) {
        this.mOnCursorUpdateHelper = helper;
    }

    public OnCursorUpdateHelper getOnCursorUpdateHelper() {
        return this.mOnCursorUpdateHelper;
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public void onCursorChangedToCustom(Bitmap customCursorBitmap, int hotspotX, int hotspotY) {
        super.onCursorChangedToCustom(customCursorBitmap, hotspotX, hotspotY);
        OnCursorUpdateHelper onCursorUpdateHelper = this.mOnCursorUpdateHelper;
        if (onCursorUpdateHelper != null) {
            onCursorUpdateHelper.notifyCalled(45);
        }
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public void onCursorChanged(int cursorType) {
        super.onCursorChanged(cursorType);
        OnCursorUpdateHelper onCursorUpdateHelper = this.mOnCursorUpdateHelper;
        if (onCursorUpdateHelper != null) {
            onCursorUpdateHelper.notifyCalled(cursorType);
        }
    }
}
