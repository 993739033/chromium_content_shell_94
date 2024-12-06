package org.chromium.blink.mojom;

import org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle;
import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.BigString16;
import org.chromium.mojo_base.mojom.ListValue;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.Value;
import org.chromium.network.mojom.CspViolation;
import org.chromium.network.mojom.SourceLocation;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface LocalFrame extends Interface {
    public static final Manager<LocalFrame, Proxy> MANAGER = LocalFrame_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface BeforeUnloadResponse extends Callbacks.Callback3<Boolean, TimeTicks, TimeTicks> {
    }

    /* loaded from: classes2.dex */
    public interface ExtractSmartClipDataResponse extends Callbacks.Callback3<String16, String16, Rect> {
    }

    /* loaded from: classes2.dex */
    public interface GetCanonicalUrlForSharingResponse extends Callbacks.Callback1<Url> {
    }

    /* loaded from: classes2.dex */
    public interface GetSavableResourceLinksResponse extends Callbacks.Callback1<GetSavableResourceLinksReply> {
    }

    /* loaded from: classes2.dex */
    public interface GetTextSurroundingSelectionResponse extends Callbacks.Callback3<String16, Integer, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface JavaScriptExecuteRequestForTestsResponse extends Callbacks.Callback1<Value> {
    }

    /* loaded from: classes2.dex */
    public interface JavaScriptExecuteRequestInIsolatedWorldResponse extends Callbacks.Callback1<Value> {
    }

    /* loaded from: classes2.dex */
    public interface JavaScriptExecuteRequestResponse extends Callbacks.Callback1<Value> {
    }

    /* loaded from: classes2.dex */
    public interface JavaScriptMethodExecuteRequestResponse extends Callbacks.Callback1<Value> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LocalFrame, Interface.Proxy {
    }

    void addInspectorIssue(InspectorIssueInfo inspectorIssueInfo);

    void addMessageToConsole(int i, String str, boolean z);

    void advanceFocusInForm(int i);

    void advanceFocusInFrame(int i, RemoteFrameToken remoteFrameToken);

    void beforeUnload(boolean z, BeforeUnloadResponse beforeUnloadResponse);

    void bindDevToolsAgent(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported);

    void bindReportingObserver(InterfaceRequest<ReportingObserver> interfaceRequest);

    void checkCompleted();

    void clearFocusedElement();

    void collapse(boolean z);

    void copyImageAt(Point point);

    void didUpdateFramePolicy(FramePolicy framePolicy);

    void enableViewSourceMode();

    void extractSmartClipData(Rect rect, ExtractSmartClipDataResponse extractSmartClipDataResponse);

    void focus();

    void getCanonicalUrlForSharing(GetCanonicalUrlForSharingResponse getCanonicalUrlForSharingResponse);

    void getResourceSnapshotForWebBundle(InterfaceRequest<ResourceSnapshotForWebBundle> interfaceRequest);

    void getSavableResourceLinks(GetSavableResourceLinksResponse getSavableResourceLinksResponse);

    void getTextSurroundingSelection(int i, GetTextSurroundingSelectionResponse getTextSurroundingSelectionResponse);

    void handleRendererDebugUrl(Url url);

    void javaScriptExecuteRequest(BigString16 bigString16, boolean z, JavaScriptExecuteRequestResponse javaScriptExecuteRequestResponse);

    void javaScriptExecuteRequestForTests(BigString16 bigString16, boolean z, boolean z2, int i, JavaScriptExecuteRequestForTestsResponse javaScriptExecuteRequestForTestsResponse);

    void javaScriptExecuteRequestInIsolatedWorld(BigString16 bigString16, boolean z, int i, JavaScriptExecuteRequestInIsolatedWorldResponse javaScriptExecuteRequestInIsolatedWorldResponse);

    void javaScriptMethodExecuteRequest(String16 string16, String16 string162, ListValue listValue, boolean z, JavaScriptMethodExecuteRequestResponse javaScriptMethodExecuteRequestResponse);

    void mediaPlayerActionAt(Point point, MediaPlayerAction mediaPlayerAction);

    void mixedContentFound(Url url, Url url2, int i, boolean z, Url url3, boolean z2, SourceLocation sourceLocation);

    void notifyUserActivation(int i);

    void notifyVirtualKeyboardOverlayRect(Rect rect);

    void onScreensChange();

    void postMessageEvent(RemoteFrameToken remoteFrameToken, String16 string16, String16 string162, TransferableMessage transferableMessage);

    void renderFallbackContent();

    void renderFallbackContentWithResourceTiming(ResourceTimingInfo resourceTimingInfo, String str);

    void reportBlinkFeatureUsage(int[] iArr);

    void reportContentSecurityPolicyViolation(CspViolation cspViolation);

    void saveImageAt(Point point);

    void sendInterventionReport(String str, String str2);

    void setFrameOwnerProperties(FrameOwnerProperties frameOwnerProperties);

    void stopLoading();

    void swapInImmediately();

    void updateOpener(FrameToken frameToken);
}
