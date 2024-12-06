package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.ui.mojom.ImeTextSpan;
/* loaded from: classes2.dex */
public interface FrameWidgetInputHandler extends Interface {
    public static final Manager<FrameWidgetInputHandler, Proxy> MANAGER = FrameWidgetInputHandler_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameWidgetInputHandler, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SelectWordAroundCaretResponse extends Callbacks.Callback3<Boolean, Integer, Integer> {
    }

    void addImeTextSpansToExistingText(int i, int i2, ImeTextSpan[] imeTextSpanArr);

    void adjustSelectionByCharacterOffset(int i, int i2, int i3);

    void clearImeTextSpansByType(int i, int i2, int i3);

    void collapseSelection();

    void copy();

    void copyToFindPboard();

    void cut();

    void delete();

    void deleteSurroundingText(int i, int i2);

    void deleteSurroundingTextInCodePoints(int i, int i2);

    void executeEditCommand(String str, String16 string16);

    void extendSelectionAndDelete(int i, int i2);

    void moveCaret(Point point);

    void moveRangeSelectionExtent(Point point);

    void paste();

    void pasteAndMatchStyle();

    void redo();

    void replace(String16 string16);

    void replaceMisspelling(String16 string16);

    void scrollFocusedEditableNodeIntoRect(Rect rect);

    void selectAll();

    void selectRange(Point point, Point point2);

    void selectWordAroundCaret(SelectWordAroundCaretResponse selectWordAroundCaretResponse);

    void setCompositionFromExistingText(int i, int i2, ImeTextSpan[] imeTextSpanArr);

    void setEditableSelectionOffsets(int i, int i2);

    void undo();
}
