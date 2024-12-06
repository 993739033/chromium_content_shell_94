package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Range;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.BigString16;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.ContentSecurityPolicy;
import org.chromium.skia.mojom.SkColor;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface LocalFrameHost extends Interface {
    public static final Manager<LocalFrameHost, Proxy> MANAGER = LocalFrameHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnterFullscreenResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LocalFrameHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RunBeforeUnloadConfirmResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface RunModalAlertDialogResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface RunModalConfirmDialogResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface RunModalPromptDialogResponse extends Callbacks.Callback2<Boolean, String16> {
    }

    void bubbleLogicalScrollInParentFrame(int i, int i2);

    void capturePaintPreviewOfSubframe(Rect rect, UnguessableToken unguessableToken);

    void createNewPopupWidget(AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported2, AssociatedInterfaceNotSupported associatedInterfaceNotSupported);

    void detach();

    void didAccessInitialDocument();

    void didAddMessageToConsole(int i, BigString16 bigString16, int i2, String16 string16, BigString16 bigString162);

    void didBlockNavigation(Url url, Url url2, int i);

    void didCallFocus();

    void didChangeActiveSchedulerTrackedFeatures(long j);

    void didChangeBackgroundColor(SkColor skColor, boolean z);

    void didChangeFrameOwnerProperties(FrameToken frameToken, FrameOwnerProperties frameOwnerProperties);

    void didChangeFramePolicy(FrameToken frameToken, FramePolicy framePolicy);

    void didChangeIframeAttributes(FrameToken frameToken, ContentSecurityPolicy contentSecurityPolicy, boolean z);

    void didChangeLoadProgress(double d);

    void didChangeOpener(LocalFrameToken localFrameToken);

    void didChangeThemeColor(SkColor skColor);

    void didContainInsecureFormAction();

    void didDisplayInsecureContent();

    void didFailLoadWithError(Url url, int i);

    void didFinishDocumentLoad();

    void didFinishLoad(Url url);

    void didFocusFrame();

    void didLoadResourceFromMemoryCache(Url url, String str, String str2, int i);

    void didUpdatePreferredColorScheme(int i);

    void dispatchLoad();

    void documentAvailableInMainFrame(boolean z);

    void documentOnLoadCompleted();

    void downloadUrl(DownloadUrlParams downloadUrlParams);

    void enforceInsecureNavigationsSet(int[] iArr);

    void enforceInsecureRequestPolicy(int i);

    void enterFullscreen(FullscreenOptions fullscreenOptions, EnterFullscreenResponse enterFullscreenResponse);

    void exitFullscreen();

    void focusedElementChanged(boolean z, Rect rect, int i);

    void forwardResourceTimingToParent(ResourceTimingInfo resourceTimingInfo);

    void frameSizeChanged(Size size);

    void fullscreenStateChanged(boolean z, FullscreenOptions fullscreenOptions);

    void getKeepAliveHandleFactory(InterfaceRequest<KeepAliveHandleFactory> interfaceRequest);

    void goToEntryAtOffset(int i, boolean z);

    void hadStickyUserActivationBeforeNavigationChanged(boolean z);

    void handleAccessibilityFindInPageResult(FindInPageResultAxParams findInPageResultAxParams);

    void handleAccessibilityFindInPageTermination();

    void navigateToAppHistoryKey(String str, boolean z);

    void registerProtocolHandler(String str, Url url, boolean z);

    void runBeforeUnloadConfirm(boolean z, RunBeforeUnloadConfirmResponse runBeforeUnloadConfirmResponse);

    void runModalAlertDialog(String16 string16, boolean z, RunModalAlertDialogResponse runModalAlertDialogResponse);

    void runModalConfirmDialog(String16 string16, boolean z, RunModalConfirmDialogResponse runModalConfirmDialogResponse);

    void runModalPromptDialog(String16 string16, String16 string162, boolean z, RunModalPromptDialogResponse runModalPromptDialogResponse);

    void scrollRectToVisibleInParentFrame(Rect rect, ScrollIntoViewParams scrollIntoViewParams);

    void setModalCloseListener(ModalCloseListener modalCloseListener);

    void setNeedsOcclusionTracking(boolean z);

    void setVirtualKeyboardOverlayPolicy(boolean z);

    void showContextMenu(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, UntrustworthyContextMenuParams untrustworthyContextMenuParams);

    void showPopupMenu(PopupMenuClient popupMenuClient, Rect rect, int i, double d, int i2, MenuItem[] menuItemArr, boolean z, boolean z2);

    void suddenTerminationDisablerChanged(boolean z, int i);

    void textSelectionChanged(BigString16 bigString16, int i, Range range);

    void unregisterProtocolHandler(String str, Url url, boolean z);

    void updateFaviconUrl(FaviconUrl[] faviconUrlArr);

    void updateTitle(String16 string16, int i);

    void updateUserActivationState(int i, int i2);

    void visibilityChanged(int i);
}
