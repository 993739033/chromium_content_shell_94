package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.LocalFrameHost;
import org.chromium.gfx.mojom.Range;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.BigString16;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.TextDirection;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.ContentSecurityPolicy;
import org.chromium.network.mojom.RequestDestination;
import org.chromium.skia.mojom.SkColor;
import org.chromium.ui.mojom.ScrollGranularity;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class LocalFrameHost_Internal {
    private static final int BUBBLE_LOGICAL_SCROLL_IN_PARENT_FRAME_ORDINAL = 22;
    private static final int CAPTURE_PAINT_PREVIEW_OF_SUBFRAME_ORDINAL = 53;
    private static final int CREATE_NEW_POPUP_WIDGET_ORDINAL = 46;
    private static final int DETACH_ORDINAL = 55;
    private static final int DID_ACCESS_INITIAL_DOCUMENT_ORDINAL = 23;
    private static final int DID_ADD_MESSAGE_TO_CONSOLE_ORDINAL = 57;
    private static final int DID_BLOCK_NAVIGATION_ORDINAL = 24;
    private static final int DID_CALL_FOCUS_ORDINAL = 15;
    private static final int DID_CHANGE_ACTIVE_SCHEDULER_TRACKED_FEATURES_ORDINAL = 18;
    private static final int DID_CHANGE_BACKGROUND_COLOR_ORDINAL = 12;
    private static final int DID_CHANGE_FRAME_OWNER_PROPERTIES_ORDINAL = 49;
    private static final int DID_CHANGE_FRAME_POLICY_ORDINAL = 51;
    private static final int DID_CHANGE_IFRAME_ATTRIBUTES_ORDINAL = 52;
    private static final int DID_CHANGE_LOAD_PROGRESS_ORDINAL = 25;
    private static final int DID_CHANGE_OPENER_ORDINAL = 50;
    private static final int DID_CHANGE_THEME_COLOR_ORDINAL = 11;
    private static final int DID_CONTAIN_INSECURE_FORM_ACTION_ORDINAL = 6;
    private static final int DID_DISPLAY_INSECURE_CONTENT_ORDINAL = 5;
    private static final int DID_FAIL_LOAD_WITH_ERROR_ORDINAL = 13;
    private static final int DID_FINISH_DOCUMENT_LOAD_ORDINAL = 36;
    private static final int DID_FINISH_LOAD_ORDINAL = 26;
    private static final int DID_FOCUS_FRAME_ORDINAL = 14;
    private static final int DID_LOAD_RESOURCE_FROM_MEMORY_CACHE_ORDINAL = 48;
    private static final int DID_UPDATE_PREFERRED_COLOR_SCHEME_ORDINAL = 59;
    private static final int DISPATCH_LOAD_ORDINAL = 27;
    private static final int DOCUMENT_AVAILABLE_IN_MAIN_FRAME_ORDINAL = 7;
    private static final int DOCUMENT_ON_LOAD_COMPLETED_ORDINAL = 34;
    private static final int DOWNLOAD_URL_ORDINAL = 42;
    private static final int ENFORCE_INSECURE_NAVIGATIONS_SET_ORDINAL = 17;
    private static final int ENFORCE_INSECURE_REQUEST_POLICY_ORDINAL = 16;
    private static final int ENTER_FULLSCREEN_ORDINAL = 0;
    private static final int EXIT_FULLSCREEN_ORDINAL = 1;
    private static final int FOCUSED_ELEMENT_CHANGED_ORDINAL = 43;
    private static final int FORWARD_RESOURCE_TIMING_TO_PARENT_ORDINAL = 35;
    private static final int FRAME_SIZE_CHANGED_ORDINAL = 58;
    private static final int FULLSCREEN_STATE_CHANGED_ORDINAL = 2;
    private static final int GET_KEEP_ALIVE_HANDLE_FACTORY_ORDINAL = 56;
    private static final int GO_TO_ENTRY_AT_OFFSET_ORDINAL = 28;
    private static final int HAD_STICKY_USER_ACTIVATION_BEFORE_NAVIGATION_CHANGED_ORDINAL = 20;
    private static final int HANDLE_ACCESSIBILITY_FIND_IN_PAGE_RESULT_ORDINAL = 32;
    private static final int HANDLE_ACCESSIBILITY_FIND_IN_PAGE_TERMINATION_ORDINAL = 33;
    public static final Interface.Manager<LocalFrameHost, LocalFrameHost.Proxy> MANAGER = new Interface.Manager<LocalFrameHost, LocalFrameHost.Proxy>() { // from class: org.chromium.blink.mojom.LocalFrameHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.LocalFrameHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public LocalFrameHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, LocalFrameHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public LocalFrameHost[] buildArray(int size) {
            return new LocalFrameHost[size];
        }
    };
    private static final int NAVIGATE_TO_APP_HISTORY_KEY_ORDINAL = 29;
    private static final int REGISTER_PROTOCOL_HANDLER_ORDINAL = 3;
    private static final int RUN_BEFORE_UNLOAD_CONFIRM_ORDINAL = 40;
    private static final int RUN_MODAL_ALERT_DIALOG_ORDINAL = 37;
    private static final int RUN_MODAL_CONFIRM_DIALOG_ORDINAL = 38;
    private static final int RUN_MODAL_PROMPT_DIALOG_ORDINAL = 39;
    private static final int SCROLL_RECT_TO_VISIBLE_IN_PARENT_FRAME_ORDINAL = 21;
    private static final int SET_MODAL_CLOSE_LISTENER_ORDINAL = 54;
    private static final int SET_NEEDS_OCCLUSION_TRACKING_ORDINAL = 8;
    private static final int SET_VIRTUAL_KEYBOARD_OVERLAY_POLICY_ORDINAL = 9;
    private static final int SHOW_CONTEXT_MENU_ORDINAL = 47;
    private static final int SHOW_POPUP_MENU_ORDINAL = 45;
    private static final int SUDDEN_TERMINATION_DISABLER_CHANGED_ORDINAL = 19;
    private static final int TEXT_SELECTION_CHANGED_ORDINAL = 44;
    private static final int UNREGISTER_PROTOCOL_HANDLER_ORDINAL = 4;
    private static final int UPDATE_FAVICON_URL_ORDINAL = 41;
    private static final int UPDATE_TITLE_ORDINAL = 30;
    private static final int UPDATE_USER_ACTIVATION_STATE_ORDINAL = 31;
    private static final int VISIBILITY_CHANGED_ORDINAL = 10;

    LocalFrameHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements LocalFrameHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void enterFullscreen(FullscreenOptions options, EnterFullscreenResponse callback) {
            LocalFrameHostEnterFullscreenParams _message = new LocalFrameHostEnterFullscreenParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new LocalFrameHostEnterFullscreenResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void exitFullscreen() {
            LocalFrameHostExitFullscreenParams _message = new LocalFrameHostExitFullscreenParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void fullscreenStateChanged(boolean isFullscreen, FullscreenOptions options) {
            LocalFrameHostFullscreenStateChangedParams _message = new LocalFrameHostFullscreenStateChangedParams();
            _message.isFullscreen = isFullscreen;
            _message.options = options;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void registerProtocolHandler(String scheme, Url url, boolean userGesture) {
            LocalFrameHostRegisterProtocolHandlerParams _message = new LocalFrameHostRegisterProtocolHandlerParams();
            _message.scheme = scheme;
            _message.url = url;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void unregisterProtocolHandler(String scheme, Url url, boolean userGesture) {
            LocalFrameHostUnregisterProtocolHandlerParams _message = new LocalFrameHostUnregisterProtocolHandlerParams();
            _message.scheme = scheme;
            _message.url = url;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didDisplayInsecureContent() {
            LocalFrameHostDidDisplayInsecureContentParams _message = new LocalFrameHostDidDisplayInsecureContentParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didContainInsecureFormAction() {
            LocalFrameHostDidContainInsecureFormActionParams _message = new LocalFrameHostDidContainInsecureFormActionParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void documentAvailableInMainFrame(boolean usesTemporaryZoomLevel) {
            LocalFrameHostDocumentAvailableInMainFrameParams _message = new LocalFrameHostDocumentAvailableInMainFrameParams();
            _message.usesTemporaryZoomLevel = usesTemporaryZoomLevel;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void setNeedsOcclusionTracking(boolean needsTracking) {
            LocalFrameHostSetNeedsOcclusionTrackingParams _message = new LocalFrameHostSetNeedsOcclusionTrackingParams();
            _message.needsTracking = needsTracking;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void setVirtualKeyboardOverlayPolicy(boolean vkOverlaysContent) {
            LocalFrameHostSetVirtualKeyboardOverlayPolicyParams _message = new LocalFrameHostSetVirtualKeyboardOverlayPolicyParams();
            _message.vkOverlaysContent = vkOverlaysContent;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void visibilityChanged(int visibility) {
            LocalFrameHostVisibilityChangedParams _message = new LocalFrameHostVisibilityChangedParams();
            _message.visibility = visibility;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeThemeColor(SkColor themeColor) {
            LocalFrameHostDidChangeThemeColorParams _message = new LocalFrameHostDidChangeThemeColorParams();
            _message.themeColor = themeColor;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeBackgroundColor(SkColor backgroundColor, boolean colorAdjust) {
            LocalFrameHostDidChangeBackgroundColorParams _message = new LocalFrameHostDidChangeBackgroundColorParams();
            _message.backgroundColor = backgroundColor;
            _message.colorAdjust = colorAdjust;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didFailLoadWithError(Url url, int errorCode) {
            LocalFrameHostDidFailLoadWithErrorParams _message = new LocalFrameHostDidFailLoadWithErrorParams();
            _message.url = url;
            _message.errorCode = errorCode;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didFocusFrame() {
            LocalFrameHostDidFocusFrameParams _message = new LocalFrameHostDidFocusFrameParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didCallFocus() {
            LocalFrameHostDidCallFocusParams _message = new LocalFrameHostDidCallFocusParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void enforceInsecureRequestPolicy(int policyBitmap) {
            LocalFrameHostEnforceInsecureRequestPolicyParams _message = new LocalFrameHostEnforceInsecureRequestPolicyParams();
            _message.policyBitmap = policyBitmap;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void enforceInsecureNavigationsSet(int[] set) {
            LocalFrameHostEnforceInsecureNavigationsSetParams _message = new LocalFrameHostEnforceInsecureNavigationsSetParams();
            _message.set = set;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeActiveSchedulerTrackedFeatures(long featuresMask) {
            LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams _message = new LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams();
            _message.featuresMask = featuresMask;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void suddenTerminationDisablerChanged(boolean present, int disablerType) {
            LocalFrameHostSuddenTerminationDisablerChangedParams _message = new LocalFrameHostSuddenTerminationDisablerChangedParams();
            _message.present = present;
            _message.disablerType = disablerType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void hadStickyUserActivationBeforeNavigationChanged(boolean hasGesture) {
            LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams _message = new LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams();
            _message.hasGesture = hasGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void scrollRectToVisibleInParentFrame(Rect rectToScroll, ScrollIntoViewParams params) {
            LocalFrameHostScrollRectToVisibleInParentFrameParams _message = new LocalFrameHostScrollRectToVisibleInParentFrameParams();
            _message.rectToScroll = rectToScroll;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void bubbleLogicalScrollInParentFrame(int direction, int granularity) {
            LocalFrameHostBubbleLogicalScrollInParentFrameParams _message = new LocalFrameHostBubbleLogicalScrollInParentFrameParams();
            _message.direction = direction;
            _message.granularity = granularity;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didAccessInitialDocument() {
            LocalFrameHostDidAccessInitialDocumentParams _message = new LocalFrameHostDidAccessInitialDocumentParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didBlockNavigation(Url blockedUrl, Url initiatorUrl, int reason) {
            LocalFrameHostDidBlockNavigationParams _message = new LocalFrameHostDidBlockNavigationParams();
            _message.blockedUrl = blockedUrl;
            _message.initiatorUrl = initiatorUrl;
            _message.reason = reason;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeLoadProgress(double loadProgress) {
            LocalFrameHostDidChangeLoadProgressParams _message = new LocalFrameHostDidChangeLoadProgressParams();
            _message.loadProgress = loadProgress;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didFinishLoad(Url validatedUrl) {
            LocalFrameHostDidFinishLoadParams _message = new LocalFrameHostDidFinishLoadParams();
            _message.validatedUrl = validatedUrl;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(26)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void dispatchLoad() {
            LocalFrameHostDispatchLoadParams _message = new LocalFrameHostDispatchLoadParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(27)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void goToEntryAtOffset(int offset, boolean hasUserGesture) {
            LocalFrameHostGoToEntryAtOffsetParams _message = new LocalFrameHostGoToEntryAtOffsetParams();
            _message.offset = offset;
            _message.hasUserGesture = hasUserGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(28)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void navigateToAppHistoryKey(String key, boolean hasUserGesture) {
            LocalFrameHostNavigateToAppHistoryKeyParams _message = new LocalFrameHostNavigateToAppHistoryKeyParams();
            _message.key = key;
            _message.hasUserGesture = hasUserGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(29)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void updateTitle(String16 title, int titleDirection) {
            LocalFrameHostUpdateTitleParams _message = new LocalFrameHostUpdateTitleParams();
            _message.title = title;
            _message.titleDirection = titleDirection;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(30)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void updateUserActivationState(int updateType, int notificationType) {
            LocalFrameHostUpdateUserActivationStateParams _message = new LocalFrameHostUpdateUserActivationStateParams();
            _message.updateType = updateType;
            _message.notificationType = notificationType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(31)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void handleAccessibilityFindInPageResult(FindInPageResultAxParams params) {
            LocalFrameHostHandleAccessibilityFindInPageResultParams _message = new LocalFrameHostHandleAccessibilityFindInPageResultParams();
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(32)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void handleAccessibilityFindInPageTermination() {
            LocalFrameHostHandleAccessibilityFindInPageTerminationParams _message = new LocalFrameHostHandleAccessibilityFindInPageTerminationParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(33)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void documentOnLoadCompleted() {
            LocalFrameHostDocumentOnLoadCompletedParams _message = new LocalFrameHostDocumentOnLoadCompletedParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(34)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void forwardResourceTimingToParent(ResourceTimingInfo timing) {
            LocalFrameHostForwardResourceTimingToParentParams _message = new LocalFrameHostForwardResourceTimingToParentParams();
            _message.timing = timing;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(35)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didFinishDocumentLoad() {
            LocalFrameHostDidFinishDocumentLoadParams _message = new LocalFrameHostDidFinishDocumentLoadParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(36)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void runModalAlertDialog(String16 alertMessage, boolean disableThirdPartySubframeSuppresion, RunModalAlertDialogResponse callback) {
            LocalFrameHostRunModalAlertDialogParams _message = new LocalFrameHostRunModalAlertDialogParams();
            _message.alertMessage = alertMessage;
            _message.disableThirdPartySubframeSuppresion = disableThirdPartySubframeSuppresion;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(37, 1, 0L)), new LocalFrameHostRunModalAlertDialogResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void runModalConfirmDialog(String16 alertMessage, boolean disableThirdPartySubframeSuppresion, RunModalConfirmDialogResponse callback) {
            LocalFrameHostRunModalConfirmDialogParams _message = new LocalFrameHostRunModalConfirmDialogParams();
            _message.alertMessage = alertMessage;
            _message.disableThirdPartySubframeSuppresion = disableThirdPartySubframeSuppresion;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(38, 1, 0L)), new LocalFrameHostRunModalConfirmDialogResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void runModalPromptDialog(String16 alertMessage, String16 defaultValue, boolean disableThirdPartySubframeSuppresion, RunModalPromptDialogResponse callback) {
            LocalFrameHostRunModalPromptDialogParams _message = new LocalFrameHostRunModalPromptDialogParams();
            _message.alertMessage = alertMessage;
            _message.defaultValue = defaultValue;
            _message.disableThirdPartySubframeSuppresion = disableThirdPartySubframeSuppresion;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(39, 1, 0L)), new LocalFrameHostRunModalPromptDialogResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void runBeforeUnloadConfirm(boolean isReload, RunBeforeUnloadConfirmResponse callback) {
            LocalFrameHostRunBeforeUnloadConfirmParams _message = new LocalFrameHostRunBeforeUnloadConfirmParams();
            _message.isReload = isReload;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(40, 1, 0L)), new LocalFrameHostRunBeforeUnloadConfirmResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void updateFaviconUrl(FaviconUrl[] faviconUrls) {
            LocalFrameHostUpdateFaviconUrlParams _message = new LocalFrameHostUpdateFaviconUrlParams();
            _message.faviconUrls = faviconUrls;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(41)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void downloadUrl(DownloadUrlParams params) {
            LocalFrameHostDownloadUrlParams _message = new LocalFrameHostDownloadUrlParams();
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(42)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void focusedElementChanged(boolean isEditableElement, Rect boundsInFrameWidget, int focusType) {
            LocalFrameHostFocusedElementChangedParams _message = new LocalFrameHostFocusedElementChangedParams();
            _message.isEditableElement = isEditableElement;
            _message.boundsInFrameWidget = boundsInFrameWidget;
            _message.focusType = focusType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(43)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void textSelectionChanged(BigString16 text, int offset, Range range) {
            LocalFrameHostTextSelectionChangedParams _message = new LocalFrameHostTextSelectionChangedParams();
            _message.text = text;
            _message.offset = offset;
            _message.range = range;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(44)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void showPopupMenu(PopupMenuClient popupClient, Rect bounds, int itemHeight, double fontSize, int selectedItem, MenuItem[] menuItems, boolean rightAligned, boolean allowMultipleSelection) {
            LocalFrameHostShowPopupMenuParams _message = new LocalFrameHostShowPopupMenuParams();
            _message.popupClient = popupClient;
            _message.bounds = bounds;
            _message.itemHeight = itemHeight;
            _message.fontSize = fontSize;
            _message.selectedItem = selectedItem;
            _message.menuItems = menuItems;
            _message.rightAligned = rightAligned;
            _message.allowMultipleSelection = allowMultipleSelection;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(45)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void createNewPopupWidget(AssociatedInterfaceRequestNotSupported popupHost, AssociatedInterfaceRequestNotSupported blinkWidgetHost, AssociatedInterfaceNotSupported blinkWidget) {
            LocalFrameHostCreateNewPopupWidgetParams _message = new LocalFrameHostCreateNewPopupWidgetParams();
            _message.popupHost = popupHost;
            _message.blinkWidgetHost = blinkWidgetHost;
            _message.blinkWidget = blinkWidget;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(46)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void showContextMenu(AssociatedInterfaceNotSupported client, UntrustworthyContextMenuParams params) {
            LocalFrameHostShowContextMenuParams _message = new LocalFrameHostShowContextMenuParams();
            _message.client = client;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(47)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didLoadResourceFromMemoryCache(Url url, String httpMethod, String mimeType, int requestDestination) {
            LocalFrameHostDidLoadResourceFromMemoryCacheParams _message = new LocalFrameHostDidLoadResourceFromMemoryCacheParams();
            _message.url = url;
            _message.httpMethod = httpMethod;
            _message.mimeType = mimeType;
            _message.requestDestination = requestDestination;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(48)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeFrameOwnerProperties(FrameToken childFrameToken, FrameOwnerProperties frameOwnerProperties) {
            LocalFrameHostDidChangeFrameOwnerPropertiesParams _message = new LocalFrameHostDidChangeFrameOwnerPropertiesParams();
            _message.childFrameToken = childFrameToken;
            _message.frameOwnerProperties = frameOwnerProperties;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(49)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeOpener(LocalFrameToken openerFrame) {
            LocalFrameHostDidChangeOpenerParams _message = new LocalFrameHostDidChangeOpenerParams();
            _message.openerFrame = openerFrame;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(50)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeFramePolicy(FrameToken childFrameToken, FramePolicy framePolicy) {
            LocalFrameHostDidChangeFramePolicyParams _message = new LocalFrameHostDidChangeFramePolicyParams();
            _message.childFrameToken = childFrameToken;
            _message.framePolicy = framePolicy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(51)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didChangeIframeAttributes(FrameToken childFrameToken, ContentSecurityPolicy parsedCspAttribute, boolean anonymous) {
            LocalFrameHostDidChangeIframeAttributesParams _message = new LocalFrameHostDidChangeIframeAttributesParams();
            _message.childFrameToken = childFrameToken;
            _message.parsedCspAttribute = parsedCspAttribute;
            _message.anonymous = anonymous;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(52)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void capturePaintPreviewOfSubframe(Rect clipRect, UnguessableToken guid) {
            LocalFrameHostCapturePaintPreviewOfSubframeParams _message = new LocalFrameHostCapturePaintPreviewOfSubframeParams();
            _message.clipRect = clipRect;
            _message.guid = guid;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(53)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void setModalCloseListener(ModalCloseListener listener) {
            LocalFrameHostSetModalCloseListenerParams _message = new LocalFrameHostSetModalCloseListenerParams();
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(54)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void detach() {
            LocalFrameHostDetachParams _message = new LocalFrameHostDetachParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(55)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void getKeepAliveHandleFactory(InterfaceRequest<KeepAliveHandleFactory> factory) {
            LocalFrameHostGetKeepAliveHandleFactoryParams _message = new LocalFrameHostGetKeepAliveHandleFactoryParams();
            _message.factory = factory;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(56)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didAddMessageToConsole(int logLevel, BigString16 msg, int lineNumber, String16 sourceId, BigString16 untrustedStackTrace) {
            LocalFrameHostDidAddMessageToConsoleParams _message = new LocalFrameHostDidAddMessageToConsoleParams();
            _message.logLevel = logLevel;
            _message.msg = msg;
            _message.lineNumber = lineNumber;
            _message.sourceId = sourceId;
            _message.untrustedStackTrace = untrustedStackTrace;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(57)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void frameSizeChanged(Size size) {
            LocalFrameHostFrameSizeChangedParams _message = new LocalFrameHostFrameSizeChangedParams();
            _message.size = size;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(58)));
        }

        @Override // org.chromium.blink.mojom.LocalFrameHost
        public void didUpdatePreferredColorScheme(int preferredColorScheme) {
            LocalFrameHostDidUpdatePreferredColorSchemeParams _message = new LocalFrameHostDidUpdatePreferredColorSchemeParams();
            _message.preferredColorScheme = preferredColorScheme;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(59)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<LocalFrameHost> {
        Stub(Core core, LocalFrameHost impl) {
            super(core, impl);
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 0;
                if (header.hasFlag(4)) {
                    flags = 0 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -2:
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(LocalFrameHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 0:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    default:
                        return false;
                    case 1:
                        LocalFrameHostExitFullscreenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().exitFullscreen();
                        return true;
                    case 2:
                        LocalFrameHostFullscreenStateChangedParams data = LocalFrameHostFullscreenStateChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().fullscreenStateChanged(data.isFullscreen, data.options);
                        return true;
                    case 3:
                        LocalFrameHostRegisterProtocolHandlerParams data2 = LocalFrameHostRegisterProtocolHandlerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().registerProtocolHandler(data2.scheme, data2.url, data2.userGesture);
                        return true;
                    case 4:
                        LocalFrameHostUnregisterProtocolHandlerParams data3 = LocalFrameHostUnregisterProtocolHandlerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().unregisterProtocolHandler(data3.scheme, data3.url, data3.userGesture);
                        return true;
                    case 5:
                        LocalFrameHostDidDisplayInsecureContentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didDisplayInsecureContent();
                        return true;
                    case 6:
                        LocalFrameHostDidContainInsecureFormActionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didContainInsecureFormAction();
                        return true;
                    case 7:
                        getImpl().documentAvailableInMainFrame(LocalFrameHostDocumentAvailableInMainFrameParams.deserialize(messageWithHeader.getPayload()).usesTemporaryZoomLevel);
                        return true;
                    case 8:
                        getImpl().setNeedsOcclusionTracking(LocalFrameHostSetNeedsOcclusionTrackingParams.deserialize(messageWithHeader.getPayload()).needsTracking);
                        return true;
                    case 9:
                        getImpl().setVirtualKeyboardOverlayPolicy(LocalFrameHostSetVirtualKeyboardOverlayPolicyParams.deserialize(messageWithHeader.getPayload()).vkOverlaysContent);
                        return true;
                    case 10:
                        getImpl().visibilityChanged(LocalFrameHostVisibilityChangedParams.deserialize(messageWithHeader.getPayload()).visibility);
                        return true;
                    case 11:
                        getImpl().didChangeThemeColor(LocalFrameHostDidChangeThemeColorParams.deserialize(messageWithHeader.getPayload()).themeColor);
                        return true;
                    case 12:
                        LocalFrameHostDidChangeBackgroundColorParams data4 = LocalFrameHostDidChangeBackgroundColorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didChangeBackgroundColor(data4.backgroundColor, data4.colorAdjust);
                        return true;
                    case 13:
                        LocalFrameHostDidFailLoadWithErrorParams data5 = LocalFrameHostDidFailLoadWithErrorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didFailLoadWithError(data5.url, data5.errorCode);
                        return true;
                    case 14:
                        LocalFrameHostDidFocusFrameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didFocusFrame();
                        return true;
                    case 15:
                        LocalFrameHostDidCallFocusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didCallFocus();
                        return true;
                    case 16:
                        getImpl().enforceInsecureRequestPolicy(LocalFrameHostEnforceInsecureRequestPolicyParams.deserialize(messageWithHeader.getPayload()).policyBitmap);
                        return true;
                    case 17:
                        getImpl().enforceInsecureNavigationsSet(LocalFrameHostEnforceInsecureNavigationsSetParams.deserialize(messageWithHeader.getPayload()).set);
                        return true;
                    case 18:
                        getImpl().didChangeActiveSchedulerTrackedFeatures(LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams.deserialize(messageWithHeader.getPayload()).featuresMask);
                        return true;
                    case 19:
                        LocalFrameHostSuddenTerminationDisablerChangedParams data6 = LocalFrameHostSuddenTerminationDisablerChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().suddenTerminationDisablerChanged(data6.present, data6.disablerType);
                        return true;
                    case 20:
                        getImpl().hadStickyUserActivationBeforeNavigationChanged(LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams.deserialize(messageWithHeader.getPayload()).hasGesture);
                        return true;
                    case 21:
                        LocalFrameHostScrollRectToVisibleInParentFrameParams data7 = LocalFrameHostScrollRectToVisibleInParentFrameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().scrollRectToVisibleInParentFrame(data7.rectToScroll, data7.params);
                        return true;
                    case 22:
                        LocalFrameHostBubbleLogicalScrollInParentFrameParams data8 = LocalFrameHostBubbleLogicalScrollInParentFrameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bubbleLogicalScrollInParentFrame(data8.direction, data8.granularity);
                        return true;
                    case 23:
                        LocalFrameHostDidAccessInitialDocumentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didAccessInitialDocument();
                        return true;
                    case 24:
                        LocalFrameHostDidBlockNavigationParams data9 = LocalFrameHostDidBlockNavigationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didBlockNavigation(data9.blockedUrl, data9.initiatorUrl, data9.reason);
                        return true;
                    case 25:
                        getImpl().didChangeLoadProgress(LocalFrameHostDidChangeLoadProgressParams.deserialize(messageWithHeader.getPayload()).loadProgress);
                        return true;
                    case 26:
                        getImpl().didFinishLoad(LocalFrameHostDidFinishLoadParams.deserialize(messageWithHeader.getPayload()).validatedUrl);
                        return true;
                    case 27:
                        LocalFrameHostDispatchLoadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchLoad();
                        return true;
                    case 28:
                        LocalFrameHostGoToEntryAtOffsetParams data10 = LocalFrameHostGoToEntryAtOffsetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().goToEntryAtOffset(data10.offset, data10.hasUserGesture);
                        return true;
                    case 29:
                        LocalFrameHostNavigateToAppHistoryKeyParams data11 = LocalFrameHostNavigateToAppHistoryKeyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().navigateToAppHistoryKey(data11.key, data11.hasUserGesture);
                        return true;
                    case 30:
                        LocalFrameHostUpdateTitleParams data12 = LocalFrameHostUpdateTitleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateTitle(data12.title, data12.titleDirection);
                        return true;
                    case 31:
                        LocalFrameHostUpdateUserActivationStateParams data13 = LocalFrameHostUpdateUserActivationStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateUserActivationState(data13.updateType, data13.notificationType);
                        return true;
                    case 32:
                        getImpl().handleAccessibilityFindInPageResult(LocalFrameHostHandleAccessibilityFindInPageResultParams.deserialize(messageWithHeader.getPayload()).params);
                        return true;
                    case 33:
                        LocalFrameHostHandleAccessibilityFindInPageTerminationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().handleAccessibilityFindInPageTermination();
                        return true;
                    case 34:
                        LocalFrameHostDocumentOnLoadCompletedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().documentOnLoadCompleted();
                        return true;
                    case 35:
                        getImpl().forwardResourceTimingToParent(LocalFrameHostForwardResourceTimingToParentParams.deserialize(messageWithHeader.getPayload()).timing);
                        return true;
                    case 36:
                        LocalFrameHostDidFinishDocumentLoadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didFinishDocumentLoad();
                        return true;
                    case 41:
                        getImpl().updateFaviconUrl(LocalFrameHostUpdateFaviconUrlParams.deserialize(messageWithHeader.getPayload()).faviconUrls);
                        return true;
                    case 42:
                        getImpl().downloadUrl(LocalFrameHostDownloadUrlParams.deserialize(messageWithHeader.getPayload()).params);
                        return true;
                    case 43:
                        LocalFrameHostFocusedElementChangedParams data14 = LocalFrameHostFocusedElementChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().focusedElementChanged(data14.isEditableElement, data14.boundsInFrameWidget, data14.focusType);
                        return true;
                    case 44:
                        LocalFrameHostTextSelectionChangedParams data15 = LocalFrameHostTextSelectionChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().textSelectionChanged(data15.text, data15.offset, data15.range);
                        return true;
                    case 45:
                        LocalFrameHostShowPopupMenuParams data16 = LocalFrameHostShowPopupMenuParams.deserialize(messageWithHeader.getPayload());
                        getImpl().showPopupMenu(data16.popupClient, data16.bounds, data16.itemHeight, data16.fontSize, data16.selectedItem, data16.menuItems, data16.rightAligned, data16.allowMultipleSelection);
                        return true;
                    case 46:
                        LocalFrameHostCreateNewPopupWidgetParams data17 = LocalFrameHostCreateNewPopupWidgetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createNewPopupWidget(data17.popupHost, data17.blinkWidgetHost, data17.blinkWidget);
                        return true;
                    case 47:
                        LocalFrameHostShowContextMenuParams data18 = LocalFrameHostShowContextMenuParams.deserialize(messageWithHeader.getPayload());
                        getImpl().showContextMenu(data18.client, data18.params);
                        return true;
                    case 48:
                        LocalFrameHostDidLoadResourceFromMemoryCacheParams data19 = LocalFrameHostDidLoadResourceFromMemoryCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didLoadResourceFromMemoryCache(data19.url, data19.httpMethod, data19.mimeType, data19.requestDestination);
                        return true;
                    case 49:
                        LocalFrameHostDidChangeFrameOwnerPropertiesParams data20 = LocalFrameHostDidChangeFrameOwnerPropertiesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didChangeFrameOwnerProperties(data20.childFrameToken, data20.frameOwnerProperties);
                        return true;
                    case 50:
                        getImpl().didChangeOpener(LocalFrameHostDidChangeOpenerParams.deserialize(messageWithHeader.getPayload()).openerFrame);
                        return true;
                    case 51:
                        LocalFrameHostDidChangeFramePolicyParams data21 = LocalFrameHostDidChangeFramePolicyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didChangeFramePolicy(data21.childFrameToken, data21.framePolicy);
                        return true;
                    case 52:
                        LocalFrameHostDidChangeIframeAttributesParams data22 = LocalFrameHostDidChangeIframeAttributesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didChangeIframeAttributes(data22.childFrameToken, data22.parsedCspAttribute, data22.anonymous);
                        return true;
                    case 53:
                        LocalFrameHostCapturePaintPreviewOfSubframeParams data23 = LocalFrameHostCapturePaintPreviewOfSubframeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().capturePaintPreviewOfSubframe(data23.clipRect, data23.guid);
                        return true;
                    case 54:
                        getImpl().setModalCloseListener(LocalFrameHostSetModalCloseListenerParams.deserialize(messageWithHeader.getPayload()).listener);
                        return true;
                    case 55:
                        LocalFrameHostDetachParams.deserialize(messageWithHeader.getPayload());
                        getImpl().detach();
                        return true;
                    case 56:
                        getImpl().getKeepAliveHandleFactory(LocalFrameHostGetKeepAliveHandleFactoryParams.deserialize(messageWithHeader.getPayload()).factory);
                        return true;
                    case 57:
                        LocalFrameHostDidAddMessageToConsoleParams data24 = LocalFrameHostDidAddMessageToConsoleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didAddMessageToConsole(data24.logLevel, data24.msg, data24.lineNumber, data24.sourceId, data24.untrustedStackTrace);
                        return true;
                    case 58:
                        getImpl().frameSizeChanged(LocalFrameHostFrameSizeChangedParams.deserialize(messageWithHeader.getPayload()).size);
                        return true;
                    case 59:
                        getImpl().didUpdatePreferredColorScheme(LocalFrameHostDidUpdatePreferredColorSchemeParams.deserialize(messageWithHeader.getPayload()).preferredColorScheme);
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override // org.chromium.mojo.bindings.MessageReceiverWithResponder
        public boolean acceptWithResponder(Message message, MessageReceiver receiver) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 1;
                if (header.hasFlag(4)) {
                    flags = 1 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -1:
                        return InterfaceControlMessagesHelper.handleRun(getCore(), LocalFrameHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().enterFullscreen(LocalFrameHostEnterFullscreenParams.deserialize(messageWithHeader.getPayload()).options, new LocalFrameHostEnterFullscreenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 37:
                        LocalFrameHostRunModalAlertDialogParams data = LocalFrameHostRunModalAlertDialogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().runModalAlertDialog(data.alertMessage, data.disableThirdPartySubframeSuppresion, new LocalFrameHostRunModalAlertDialogResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 38:
                        LocalFrameHostRunModalConfirmDialogParams data2 = LocalFrameHostRunModalConfirmDialogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().runModalConfirmDialog(data2.alertMessage, data2.disableThirdPartySubframeSuppresion, new LocalFrameHostRunModalConfirmDialogResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 39:
                        LocalFrameHostRunModalPromptDialogParams data3 = LocalFrameHostRunModalPromptDialogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().runModalPromptDialog(data3.alertMessage, data3.defaultValue, data3.disableThirdPartySubframeSuppresion, new LocalFrameHostRunModalPromptDialogResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 40:
                        LocalFrameHostRunBeforeUnloadConfirmParams data4 = LocalFrameHostRunBeforeUnloadConfirmParams.deserialize(messageWithHeader.getPayload());
                        getImpl().runBeforeUnloadConfirm(data4.isReload, new LocalFrameHostRunBeforeUnloadConfirmResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    default:
                        return false;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostEnterFullscreenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FullscreenOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostEnterFullscreenParams(int version) {
            super(16, version);
        }

        public LocalFrameHostEnterFullscreenParams() {
            this(0);
        }

        public static LocalFrameHostEnterFullscreenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostEnterFullscreenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostEnterFullscreenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostEnterFullscreenParams result = new LocalFrameHostEnterFullscreenParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.options = FullscreenOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.options, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameHostEnterFullscreenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean granted;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostEnterFullscreenResponseParams(int version) {
            super(16, version);
        }

        public LocalFrameHostEnterFullscreenResponseParams() {
            this(0);
        }

        public static LocalFrameHostEnterFullscreenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostEnterFullscreenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostEnterFullscreenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostEnterFullscreenResponseParams result = new LocalFrameHostEnterFullscreenResponseParams(elementsOrVersion);
                result.granted = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.granted, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostEnterFullscreenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrameHost.EnterFullscreenResponse mCallback;

        LocalFrameHostEnterFullscreenResponseParamsForwardToCallback(LocalFrameHost.EnterFullscreenResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 2)) {
                    return false;
                }
                LocalFrameHostEnterFullscreenResponseParams response = LocalFrameHostEnterFullscreenResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.granted));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostEnterFullscreenResponseParamsProxyToResponder implements LocalFrameHost.EnterFullscreenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameHostEnterFullscreenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean granted) {
            LocalFrameHostEnterFullscreenResponseParams _response = new LocalFrameHostEnterFullscreenResponseParams();
            _response.granted = granted.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostExitFullscreenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostExitFullscreenParams(int version) {
            super(8, version);
        }

        public LocalFrameHostExitFullscreenParams() {
            this(0);
        }

        public static LocalFrameHostExitFullscreenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostExitFullscreenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostExitFullscreenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostExitFullscreenParams result = new LocalFrameHostExitFullscreenParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostFullscreenStateChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isFullscreen;
        public FullscreenOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostFullscreenStateChangedParams(int version) {
            super(24, version);
        }

        public LocalFrameHostFullscreenStateChangedParams() {
            this(0);
        }

        public static LocalFrameHostFullscreenStateChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostFullscreenStateChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostFullscreenStateChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostFullscreenStateChangedParams result = new LocalFrameHostFullscreenStateChangedParams(elementsOrVersion);
                result.isFullscreen = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.options = FullscreenOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isFullscreen, 8, 0);
            encoder0.encode((Struct) this.options, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRegisterProtocolHandlerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String scheme;
        public Url url;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRegisterProtocolHandlerParams(int version) {
            super(32, version);
        }

        public LocalFrameHostRegisterProtocolHandlerParams() {
            this(0);
        }

        public static LocalFrameHostRegisterProtocolHandlerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRegisterProtocolHandlerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRegisterProtocolHandlerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRegisterProtocolHandlerParams result = new LocalFrameHostRegisterProtocolHandlerParams(elementsOrVersion);
                result.scheme = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder1);
                result.userGesture = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.scheme, 8, false);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode(this.userGesture, 24, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostUnregisterProtocolHandlerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String scheme;
        public Url url;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostUnregisterProtocolHandlerParams(int version) {
            super(32, version);
        }

        public LocalFrameHostUnregisterProtocolHandlerParams() {
            this(0);
        }

        public static LocalFrameHostUnregisterProtocolHandlerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostUnregisterProtocolHandlerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostUnregisterProtocolHandlerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostUnregisterProtocolHandlerParams result = new LocalFrameHostUnregisterProtocolHandlerParams(elementsOrVersion);
                result.scheme = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder1);
                result.userGesture = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.scheme, 8, false);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode(this.userGesture, 24, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidDisplayInsecureContentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidDisplayInsecureContentParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidDisplayInsecureContentParams() {
            this(0);
        }

        public static LocalFrameHostDidDisplayInsecureContentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidDisplayInsecureContentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidDisplayInsecureContentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidDisplayInsecureContentParams result = new LocalFrameHostDidDisplayInsecureContentParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidContainInsecureFormActionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidContainInsecureFormActionParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidContainInsecureFormActionParams() {
            this(0);
        }

        public static LocalFrameHostDidContainInsecureFormActionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidContainInsecureFormActionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidContainInsecureFormActionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidContainInsecureFormActionParams result = new LocalFrameHostDidContainInsecureFormActionParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDocumentAvailableInMainFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean usesTemporaryZoomLevel;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDocumentAvailableInMainFrameParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDocumentAvailableInMainFrameParams() {
            this(0);
        }

        public static LocalFrameHostDocumentAvailableInMainFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDocumentAvailableInMainFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDocumentAvailableInMainFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDocumentAvailableInMainFrameParams result = new LocalFrameHostDocumentAvailableInMainFrameParams(elementsOrVersion);
                result.usesTemporaryZoomLevel = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.usesTemporaryZoomLevel, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostSetNeedsOcclusionTrackingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean needsTracking;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostSetNeedsOcclusionTrackingParams(int version) {
            super(16, version);
        }

        public LocalFrameHostSetNeedsOcclusionTrackingParams() {
            this(0);
        }

        public static LocalFrameHostSetNeedsOcclusionTrackingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostSetNeedsOcclusionTrackingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostSetNeedsOcclusionTrackingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostSetNeedsOcclusionTrackingParams result = new LocalFrameHostSetNeedsOcclusionTrackingParams(elementsOrVersion);
                result.needsTracking = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.needsTracking, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostSetVirtualKeyboardOverlayPolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean vkOverlaysContent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostSetVirtualKeyboardOverlayPolicyParams(int version) {
            super(16, version);
        }

        public LocalFrameHostSetVirtualKeyboardOverlayPolicyParams() {
            this(0);
        }

        public static LocalFrameHostSetVirtualKeyboardOverlayPolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostSetVirtualKeyboardOverlayPolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostSetVirtualKeyboardOverlayPolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostSetVirtualKeyboardOverlayPolicyParams result = new LocalFrameHostSetVirtualKeyboardOverlayPolicyParams(elementsOrVersion);
                result.vkOverlaysContent = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.vkOverlaysContent, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostVisibilityChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int visibility;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostVisibilityChangedParams(int version) {
            super(16, version);
        }

        public LocalFrameHostVisibilityChangedParams() {
            this(0);
        }

        public static LocalFrameHostVisibilityChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostVisibilityChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostVisibilityChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostVisibilityChangedParams result = new LocalFrameHostVisibilityChangedParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.visibility = readInt;
                FrameVisibility.validate(readInt);
                result.visibility = FrameVisibility.toKnownValue(result.visibility);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.visibility, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeThemeColorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SkColor themeColor;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeThemeColorParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidChangeThemeColorParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeThemeColorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeThemeColorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeThemeColorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeThemeColorParams result = new LocalFrameHostDidChangeThemeColorParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.themeColor = SkColor.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.themeColor, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeBackgroundColorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public SkColor backgroundColor;
        public boolean colorAdjust;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeBackgroundColorParams(int version) {
            super(24, version);
        }

        public LocalFrameHostDidChangeBackgroundColorParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeBackgroundColorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeBackgroundColorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeBackgroundColorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeBackgroundColorParams result = new LocalFrameHostDidChangeBackgroundColorParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.backgroundColor = SkColor.decode(decoder1);
                result.colorAdjust = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.backgroundColor, 8, false);
            encoder0.encode(this.colorAdjust, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidFailLoadWithErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int errorCode;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidFailLoadWithErrorParams(int version) {
            super(24, version);
        }

        public LocalFrameHostDidFailLoadWithErrorParams() {
            this(0);
        }

        public static LocalFrameHostDidFailLoadWithErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidFailLoadWithErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidFailLoadWithErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidFailLoadWithErrorParams result = new LocalFrameHostDidFailLoadWithErrorParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.errorCode = decoder0.readInt(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.url, 8, false);
            encoder0.encode(this.errorCode, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidFocusFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidFocusFrameParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidFocusFrameParams() {
            this(0);
        }

        public static LocalFrameHostDidFocusFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidFocusFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidFocusFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidFocusFrameParams result = new LocalFrameHostDidFocusFrameParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidCallFocusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidCallFocusParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidCallFocusParams() {
            this(0);
        }

        public static LocalFrameHostDidCallFocusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidCallFocusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidCallFocusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidCallFocusParams result = new LocalFrameHostDidCallFocusParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostEnforceInsecureRequestPolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int policyBitmap;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostEnforceInsecureRequestPolicyParams(int version) {
            super(16, version);
        }

        public LocalFrameHostEnforceInsecureRequestPolicyParams() {
            this(0);
        }

        public static LocalFrameHostEnforceInsecureRequestPolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostEnforceInsecureRequestPolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostEnforceInsecureRequestPolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostEnforceInsecureRequestPolicyParams result = new LocalFrameHostEnforceInsecureRequestPolicyParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.policyBitmap = readInt;
                InsecureRequestPolicy.validate(readInt);
                result.policyBitmap = InsecureRequestPolicy.toKnownValue(result.policyBitmap);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.policyBitmap, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostEnforceInsecureNavigationsSetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int[] set;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostEnforceInsecureNavigationsSetParams(int version) {
            super(16, version);
        }

        public LocalFrameHostEnforceInsecureNavigationsSetParams() {
            this(0);
        }

        public static LocalFrameHostEnforceInsecureNavigationsSetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostEnforceInsecureNavigationsSetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostEnforceInsecureNavigationsSetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostEnforceInsecureNavigationsSetParams result = new LocalFrameHostEnforceInsecureNavigationsSetParams(elementsOrVersion);
                result.set = decoder0.readInts(8, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.set, 8, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long featuresMask;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams result = new LocalFrameHostDidChangeActiveSchedulerTrackedFeaturesParams(elementsOrVersion);
                result.featuresMask = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.featuresMask, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostSuddenTerminationDisablerChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int disablerType;
        public boolean present;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostSuddenTerminationDisablerChangedParams(int version) {
            super(16, version);
        }

        public LocalFrameHostSuddenTerminationDisablerChangedParams() {
            this(0);
        }

        public static LocalFrameHostSuddenTerminationDisablerChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostSuddenTerminationDisablerChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostSuddenTerminationDisablerChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostSuddenTerminationDisablerChangedParams result = new LocalFrameHostSuddenTerminationDisablerChangedParams(elementsOrVersion);
                result.present = decoder0.readBoolean(8, 0);
                int readInt = decoder0.readInt(12);
                result.disablerType = readInt;
                SuddenTerminationDisablerType.validate(readInt);
                result.disablerType = SuddenTerminationDisablerType.toKnownValue(result.disablerType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.present, 8, 0);
            encoder0.encode(this.disablerType, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hasGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams(int version) {
            super(16, version);
        }

        public LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams() {
            this(0);
        }

        public static LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams result = new LocalFrameHostHadStickyUserActivationBeforeNavigationChangedParams(elementsOrVersion);
                result.hasGesture = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.hasGesture, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostScrollRectToVisibleInParentFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ScrollIntoViewParams params;
        public Rect rectToScroll;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostScrollRectToVisibleInParentFrameParams(int version) {
            super(24, version);
        }

        public LocalFrameHostScrollRectToVisibleInParentFrameParams() {
            this(0);
        }

        public static LocalFrameHostScrollRectToVisibleInParentFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostScrollRectToVisibleInParentFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostScrollRectToVisibleInParentFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostScrollRectToVisibleInParentFrameParams result = new LocalFrameHostScrollRectToVisibleInParentFrameParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.rectToScroll = Rect.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.params = ScrollIntoViewParams.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.rectToScroll, 8, false);
            encoder0.encode((Struct) this.params, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostBubbleLogicalScrollInParentFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int direction;
        public int granularity;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostBubbleLogicalScrollInParentFrameParams(int version) {
            super(16, version);
        }

        public LocalFrameHostBubbleLogicalScrollInParentFrameParams() {
            this(0);
        }

        public static LocalFrameHostBubbleLogicalScrollInParentFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostBubbleLogicalScrollInParentFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostBubbleLogicalScrollInParentFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostBubbleLogicalScrollInParentFrameParams result = new LocalFrameHostBubbleLogicalScrollInParentFrameParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.direction = readInt;
                ScrollDirection.validate(readInt);
                result.direction = ScrollDirection.toKnownValue(result.direction);
                int readInt2 = decoder0.readInt(12);
                result.granularity = readInt2;
                ScrollGranularity.validate(readInt2);
                result.granularity = ScrollGranularity.toKnownValue(result.granularity);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.direction, 8);
            encoder0.encode(this.granularity, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidAccessInitialDocumentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidAccessInitialDocumentParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidAccessInitialDocumentParams() {
            this(0);
        }

        public static LocalFrameHostDidAccessInitialDocumentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidAccessInitialDocumentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidAccessInitialDocumentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidAccessInitialDocumentParams result = new LocalFrameHostDidAccessInitialDocumentParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidBlockNavigationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Url blockedUrl;
        public Url initiatorUrl;
        public int reason;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidBlockNavigationParams(int version) {
            super(32, version);
        }

        public LocalFrameHostDidBlockNavigationParams() {
            this(0);
        }

        public static LocalFrameHostDidBlockNavigationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidBlockNavigationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidBlockNavigationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidBlockNavigationParams result = new LocalFrameHostDidBlockNavigationParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.blockedUrl = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.initiatorUrl = Url.decode(decoder12);
                int readInt = decoder0.readInt(24);
                result.reason = readInt;
                NavigationBlockedReason.validate(readInt);
                result.reason = NavigationBlockedReason.toKnownValue(result.reason);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.blockedUrl, 8, false);
            encoder0.encode((Struct) this.initiatorUrl, 16, false);
            encoder0.encode(this.reason, 24);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeLoadProgressParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public double loadProgress;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeLoadProgressParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidChangeLoadProgressParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeLoadProgressParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeLoadProgressParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeLoadProgressParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeLoadProgressParams result = new LocalFrameHostDidChangeLoadProgressParams(elementsOrVersion);
                result.loadProgress = decoder0.readDouble(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.loadProgress, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidFinishLoadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url validatedUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidFinishLoadParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidFinishLoadParams() {
            this(0);
        }

        public static LocalFrameHostDidFinishLoadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidFinishLoadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidFinishLoadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidFinishLoadParams result = new LocalFrameHostDidFinishLoadParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.validatedUrl = Url.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.validatedUrl, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDispatchLoadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDispatchLoadParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDispatchLoadParams() {
            this(0);
        }

        public static LocalFrameHostDispatchLoadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDispatchLoadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDispatchLoadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDispatchLoadParams result = new LocalFrameHostDispatchLoadParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostGoToEntryAtOffsetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hasUserGesture;
        public int offset;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostGoToEntryAtOffsetParams(int version) {
            super(16, version);
        }

        public LocalFrameHostGoToEntryAtOffsetParams() {
            this(0);
        }

        public static LocalFrameHostGoToEntryAtOffsetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostGoToEntryAtOffsetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostGoToEntryAtOffsetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostGoToEntryAtOffsetParams result = new LocalFrameHostGoToEntryAtOffsetParams(elementsOrVersion);
                result.offset = decoder0.readInt(8);
                result.hasUserGesture = decoder0.readBoolean(12, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.offset, 8);
            encoder0.encode(this.hasUserGesture, 12, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostNavigateToAppHistoryKeyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hasUserGesture;
        public String key;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostNavigateToAppHistoryKeyParams(int version) {
            super(24, version);
        }

        public LocalFrameHostNavigateToAppHistoryKeyParams() {
            this(0);
        }

        public static LocalFrameHostNavigateToAppHistoryKeyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostNavigateToAppHistoryKeyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostNavigateToAppHistoryKeyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostNavigateToAppHistoryKeyParams result = new LocalFrameHostNavigateToAppHistoryKeyParams(elementsOrVersion);
                result.key = decoder0.readString(8, false);
                result.hasUserGesture = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.key, 8, false);
            encoder0.encode(this.hasUserGesture, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostUpdateTitleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 title;
        public int titleDirection;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostUpdateTitleParams(int version) {
            super(24, version);
        }

        public LocalFrameHostUpdateTitleParams() {
            this(0);
        }

        public static LocalFrameHostUpdateTitleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostUpdateTitleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostUpdateTitleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostUpdateTitleParams result = new LocalFrameHostUpdateTitleParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.title = String16.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.titleDirection = readInt;
                TextDirection.validate(readInt);
                result.titleDirection = TextDirection.toKnownValue(result.titleDirection);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.title, 8, true);
            encoder0.encode(this.titleDirection, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostUpdateUserActivationStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int notificationType;
        public int updateType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostUpdateUserActivationStateParams(int version) {
            super(16, version);
        }

        public LocalFrameHostUpdateUserActivationStateParams() {
            this(0);
        }

        public static LocalFrameHostUpdateUserActivationStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostUpdateUserActivationStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostUpdateUserActivationStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostUpdateUserActivationStateParams result = new LocalFrameHostUpdateUserActivationStateParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.updateType = readInt;
                UserActivationUpdateType.validate(readInt);
                result.updateType = UserActivationUpdateType.toKnownValue(result.updateType);
                int readInt2 = decoder0.readInt(12);
                result.notificationType = readInt2;
                UserActivationNotificationType.validate(readInt2);
                result.notificationType = UserActivationNotificationType.toKnownValue(result.notificationType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.updateType, 8);
            encoder0.encode(this.notificationType, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostHandleAccessibilityFindInPageResultParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FindInPageResultAxParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostHandleAccessibilityFindInPageResultParams(int version) {
            super(16, version);
        }

        public LocalFrameHostHandleAccessibilityFindInPageResultParams() {
            this(0);
        }

        public static LocalFrameHostHandleAccessibilityFindInPageResultParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostHandleAccessibilityFindInPageResultParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostHandleAccessibilityFindInPageResultParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostHandleAccessibilityFindInPageResultParams result = new LocalFrameHostHandleAccessibilityFindInPageResultParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = FindInPageResultAxParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostHandleAccessibilityFindInPageTerminationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostHandleAccessibilityFindInPageTerminationParams(int version) {
            super(8, version);
        }

        public LocalFrameHostHandleAccessibilityFindInPageTerminationParams() {
            this(0);
        }

        public static LocalFrameHostHandleAccessibilityFindInPageTerminationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostHandleAccessibilityFindInPageTerminationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostHandleAccessibilityFindInPageTerminationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostHandleAccessibilityFindInPageTerminationParams result = new LocalFrameHostHandleAccessibilityFindInPageTerminationParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDocumentOnLoadCompletedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDocumentOnLoadCompletedParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDocumentOnLoadCompletedParams() {
            this(0);
        }

        public static LocalFrameHostDocumentOnLoadCompletedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDocumentOnLoadCompletedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDocumentOnLoadCompletedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDocumentOnLoadCompletedParams result = new LocalFrameHostDocumentOnLoadCompletedParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostForwardResourceTimingToParentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ResourceTimingInfo timing;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostForwardResourceTimingToParentParams(int version) {
            super(16, version);
        }

        public LocalFrameHostForwardResourceTimingToParentParams() {
            this(0);
        }

        public static LocalFrameHostForwardResourceTimingToParentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostForwardResourceTimingToParentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostForwardResourceTimingToParentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostForwardResourceTimingToParentParams result = new LocalFrameHostForwardResourceTimingToParentParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.timing = ResourceTimingInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.timing, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidFinishDocumentLoadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidFinishDocumentLoadParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDidFinishDocumentLoadParams() {
            this(0);
        }

        public static LocalFrameHostDidFinishDocumentLoadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidFinishDocumentLoadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidFinishDocumentLoadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidFinishDocumentLoadParams result = new LocalFrameHostDidFinishDocumentLoadParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRunModalAlertDialogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 alertMessage;
        public boolean disableThirdPartySubframeSuppresion;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalAlertDialogParams(int version) {
            super(24, version);
        }

        public LocalFrameHostRunModalAlertDialogParams() {
            this(0);
        }

        public static LocalFrameHostRunModalAlertDialogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalAlertDialogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalAlertDialogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalAlertDialogParams result = new LocalFrameHostRunModalAlertDialogParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.alertMessage = String16.decode(decoder1);
                result.disableThirdPartySubframeSuppresion = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.alertMessage, 8, false);
            encoder0.encode(this.disableThirdPartySubframeSuppresion, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRunModalAlertDialogResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalAlertDialogResponseParams(int version) {
            super(8, version);
        }

        public LocalFrameHostRunModalAlertDialogResponseParams() {
            this(0);
        }

        public static LocalFrameHostRunModalAlertDialogResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalAlertDialogResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalAlertDialogResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalAlertDialogResponseParams result = new LocalFrameHostRunModalAlertDialogResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalAlertDialogResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrameHost.RunModalAlertDialogResponse mCallback;

        LocalFrameHostRunModalAlertDialogResponseParamsForwardToCallback(LocalFrameHost.RunModalAlertDialogResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(37, 6)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalAlertDialogResponseParamsProxyToResponder implements LocalFrameHost.RunModalAlertDialogResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameHostRunModalAlertDialogResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            LocalFrameHostRunModalAlertDialogResponseParams _response = new LocalFrameHostRunModalAlertDialogResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(37, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRunModalConfirmDialogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 alertMessage;
        public boolean disableThirdPartySubframeSuppresion;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalConfirmDialogParams(int version) {
            super(24, version);
        }

        public LocalFrameHostRunModalConfirmDialogParams() {
            this(0);
        }

        public static LocalFrameHostRunModalConfirmDialogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalConfirmDialogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalConfirmDialogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalConfirmDialogParams result = new LocalFrameHostRunModalConfirmDialogParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.alertMessage = String16.decode(decoder1);
                result.disableThirdPartySubframeSuppresion = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.alertMessage, 8, false);
            encoder0.encode(this.disableThirdPartySubframeSuppresion, 16, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameHostRunModalConfirmDialogResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalConfirmDialogResponseParams(int version) {
            super(16, version);
        }

        public LocalFrameHostRunModalConfirmDialogResponseParams() {
            this(0);
        }

        public static LocalFrameHostRunModalConfirmDialogResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalConfirmDialogResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalConfirmDialogResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalConfirmDialogResponseParams result = new LocalFrameHostRunModalConfirmDialogResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalConfirmDialogResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrameHost.RunModalConfirmDialogResponse mCallback;

        LocalFrameHostRunModalConfirmDialogResponseParamsForwardToCallback(LocalFrameHost.RunModalConfirmDialogResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(38, 6)) {
                    return false;
                }
                LocalFrameHostRunModalConfirmDialogResponseParams response = LocalFrameHostRunModalConfirmDialogResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalConfirmDialogResponseParamsProxyToResponder implements LocalFrameHost.RunModalConfirmDialogResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameHostRunModalConfirmDialogResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            LocalFrameHostRunModalConfirmDialogResponseParams _response = new LocalFrameHostRunModalConfirmDialogResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(38, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRunModalPromptDialogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 alertMessage;
        public String16 defaultValue;
        public boolean disableThirdPartySubframeSuppresion;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalPromptDialogParams(int version) {
            super(32, version);
        }

        public LocalFrameHostRunModalPromptDialogParams() {
            this(0);
        }

        public static LocalFrameHostRunModalPromptDialogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalPromptDialogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalPromptDialogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalPromptDialogParams result = new LocalFrameHostRunModalPromptDialogParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.alertMessage = String16.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.defaultValue = String16.decode(decoder12);
                result.disableThirdPartySubframeSuppresion = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.alertMessage, 8, false);
            encoder0.encode((Struct) this.defaultValue, 16, false);
            encoder0.encode(this.disableThirdPartySubframeSuppresion, 24, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameHostRunModalPromptDialogResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 result;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunModalPromptDialogResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameHostRunModalPromptDialogResponseParams() {
            this(0);
        }

        public static LocalFrameHostRunModalPromptDialogResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunModalPromptDialogResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunModalPromptDialogResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunModalPromptDialogResponseParams result = new LocalFrameHostRunModalPromptDialogResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.result = String16.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
            encoder0.encode((Struct) this.result, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalPromptDialogResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrameHost.RunModalPromptDialogResponse mCallback;

        LocalFrameHostRunModalPromptDialogResponseParamsForwardToCallback(LocalFrameHost.RunModalPromptDialogResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(39, 6)) {
                    return false;
                }
                LocalFrameHostRunModalPromptDialogResponseParams response = LocalFrameHostRunModalPromptDialogResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunModalPromptDialogResponseParamsProxyToResponder implements LocalFrameHost.RunModalPromptDialogResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameHostRunModalPromptDialogResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean success, String16 result) {
            LocalFrameHostRunModalPromptDialogResponseParams _response = new LocalFrameHostRunModalPromptDialogResponseParams();
            _response.success = success.booleanValue();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(39, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostRunBeforeUnloadConfirmParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isReload;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunBeforeUnloadConfirmParams(int version) {
            super(16, version);
        }

        public LocalFrameHostRunBeforeUnloadConfirmParams() {
            this(0);
        }

        public static LocalFrameHostRunBeforeUnloadConfirmParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunBeforeUnloadConfirmParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunBeforeUnloadConfirmParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunBeforeUnloadConfirmParams result = new LocalFrameHostRunBeforeUnloadConfirmParams(elementsOrVersion);
                result.isReload = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isReload, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameHostRunBeforeUnloadConfirmResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostRunBeforeUnloadConfirmResponseParams(int version) {
            super(16, version);
        }

        public LocalFrameHostRunBeforeUnloadConfirmResponseParams() {
            this(0);
        }

        public static LocalFrameHostRunBeforeUnloadConfirmResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostRunBeforeUnloadConfirmResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostRunBeforeUnloadConfirmResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostRunBeforeUnloadConfirmResponseParams result = new LocalFrameHostRunBeforeUnloadConfirmResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunBeforeUnloadConfirmResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrameHost.RunBeforeUnloadConfirmResponse mCallback;

        LocalFrameHostRunBeforeUnloadConfirmResponseParamsForwardToCallback(LocalFrameHost.RunBeforeUnloadConfirmResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(40, 6)) {
                    return false;
                }
                LocalFrameHostRunBeforeUnloadConfirmResponseParams response = LocalFrameHostRunBeforeUnloadConfirmResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameHostRunBeforeUnloadConfirmResponseParamsProxyToResponder implements LocalFrameHost.RunBeforeUnloadConfirmResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameHostRunBeforeUnloadConfirmResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            LocalFrameHostRunBeforeUnloadConfirmResponseParams _response = new LocalFrameHostRunBeforeUnloadConfirmResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(40, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostUpdateFaviconUrlParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FaviconUrl[] faviconUrls;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostUpdateFaviconUrlParams(int version) {
            super(16, version);
        }

        public LocalFrameHostUpdateFaviconUrlParams() {
            this(0);
        }

        public static LocalFrameHostUpdateFaviconUrlParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostUpdateFaviconUrlParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostUpdateFaviconUrlParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostUpdateFaviconUrlParams result = new LocalFrameHostUpdateFaviconUrlParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.faviconUrls = new FaviconUrl[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.faviconUrls[i1] = FaviconUrl.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            FaviconUrl[] faviconUrlArr = this.faviconUrls;
            if (faviconUrlArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(faviconUrlArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                FaviconUrl[] faviconUrlArr2 = this.faviconUrls;
                if (i0 < faviconUrlArr2.length) {
                    encoder1.encode((Struct) faviconUrlArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDownloadUrlParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DownloadUrlParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDownloadUrlParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDownloadUrlParams() {
            this(0);
        }

        public static LocalFrameHostDownloadUrlParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDownloadUrlParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDownloadUrlParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDownloadUrlParams result = new LocalFrameHostDownloadUrlParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = DownloadUrlParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostFocusedElementChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect boundsInFrameWidget;
        public int focusType;
        public boolean isEditableElement;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostFocusedElementChangedParams(int version) {
            super(24, version);
        }

        public LocalFrameHostFocusedElementChangedParams() {
            this(0);
        }

        public static LocalFrameHostFocusedElementChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostFocusedElementChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostFocusedElementChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostFocusedElementChangedParams result = new LocalFrameHostFocusedElementChangedParams(elementsOrVersion);
                result.isEditableElement = decoder0.readBoolean(8, 0);
                int readInt = decoder0.readInt(12);
                result.focusType = readInt;
                FocusType.validate(readInt);
                result.focusType = FocusType.toKnownValue(result.focusType);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.boundsInFrameWidget = Rect.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isEditableElement, 8, 0);
            encoder0.encode(this.focusType, 12);
            encoder0.encode((Struct) this.boundsInFrameWidget, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostTextSelectionChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int offset;
        public Range range;
        public BigString16 text;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostTextSelectionChangedParams(int version) {
            super(32, version);
        }

        public LocalFrameHostTextSelectionChangedParams() {
            this(0);
        }

        public static LocalFrameHostTextSelectionChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostTextSelectionChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostTextSelectionChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostTextSelectionChangedParams result = new LocalFrameHostTextSelectionChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.text = BigString16.decode(decoder1);
                result.offset = decoder0.readInt(16);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.range = Range.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.text, 8, false);
            encoder0.encode(this.offset, 16);
            encoder0.encode((Struct) this.range, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostShowPopupMenuParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean allowMultipleSelection;
        public Rect bounds;
        public double fontSize;
        public int itemHeight;
        public MenuItem[] menuItems;
        public PopupMenuClient popupClient;
        public boolean rightAligned;
        public int selectedItem;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostShowPopupMenuParams(int version) {
            super(56, version);
        }

        public LocalFrameHostShowPopupMenuParams() {
            this(0);
        }

        public static LocalFrameHostShowPopupMenuParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostShowPopupMenuParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostShowPopupMenuParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostShowPopupMenuParams result = new LocalFrameHostShowPopupMenuParams(elementsOrVersion);
                result.popupClient = (PopupMenuClient) decoder0.readServiceInterface(8, false, PopupMenuClient.MANAGER);
                result.bounds = Rect.decode(decoder0.readPointer(16, false));
                result.itemHeight = decoder0.readInt(24);
                result.selectedItem = decoder0.readInt(28);
                result.fontSize = decoder0.readDouble(32);
                Decoder decoder1 = decoder0.readPointer(40, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.menuItems = new MenuItem[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.menuItems[i1] = MenuItem.decode(decoder2);
                }
                result.rightAligned = decoder0.readBoolean(48, 0);
                result.allowMultipleSelection = decoder0.readBoolean(48, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.popupClient, 8, false,  PopupMenuClient.MANAGER);
            encoder0.encode((Struct) this.bounds, 16, false);
            encoder0.encode(this.itemHeight, 24);
            encoder0.encode(this.selectedItem, 28);
            encoder0.encode(this.fontSize, 32);
            MenuItem[] menuItemArr = this.menuItems;
            if (menuItemArr == null) {
                encoder0.encodeNullPointer(40, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(menuItemArr.length, 40, -1);
                int i0 = 0;
                while (true) {
                    MenuItem[] menuItemArr2 = this.menuItems;
                    if (i0 >= menuItemArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) menuItemArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode(this.rightAligned, 48, 0);
            encoder0.encode(this.allowMultipleSelection, 48, 1);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostCreateNewPopupWidgetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported blinkWidget;
        public AssociatedInterfaceRequestNotSupported blinkWidgetHost;
        public AssociatedInterfaceRequestNotSupported popupHost;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostCreateNewPopupWidgetParams(int version) {
            super(24, version);
        }

        public LocalFrameHostCreateNewPopupWidgetParams() {
            this(0);
        }

        public static LocalFrameHostCreateNewPopupWidgetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostCreateNewPopupWidgetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostCreateNewPopupWidgetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostCreateNewPopupWidgetParams result = new LocalFrameHostCreateNewPopupWidgetParams(elementsOrVersion);
                result.popupHost = decoder0.readAssociatedInterfaceRequestNotSupported(8, false);
                result.blinkWidgetHost = decoder0.readAssociatedInterfaceRequestNotSupported(12, false);
                result.blinkWidget = decoder0.readAssociatedServiceInterfaceNotSupported(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.popupHost, 8, false);
            encoder0.encode(this.blinkWidgetHost, 12, false);
            encoder0.encode(this.blinkWidget, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostShowContextMenuParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported client;
        public UntrustworthyContextMenuParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostShowContextMenuParams(int version) {
            super(24, version);
        }

        public LocalFrameHostShowContextMenuParams() {
            this(0);
        }

        public static LocalFrameHostShowContextMenuParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostShowContextMenuParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostShowContextMenuParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostShowContextMenuParams result = new LocalFrameHostShowContextMenuParams(elementsOrVersion);
                result.client = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.params = UntrustworthyContextMenuParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.client, 8, false);
            encoder0.encode((Struct) this.params, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidLoadResourceFromMemoryCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String httpMethod;
        public String mimeType;
        public int requestDestination;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidLoadResourceFromMemoryCacheParams(int version) {
            super(40, version);
        }

        public LocalFrameHostDidLoadResourceFromMemoryCacheParams() {
            this(0);
        }

        public static LocalFrameHostDidLoadResourceFromMemoryCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidLoadResourceFromMemoryCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidLoadResourceFromMemoryCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidLoadResourceFromMemoryCacheParams result = new LocalFrameHostDidLoadResourceFromMemoryCacheParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.httpMethod = decoder0.readString(16, false);
                result.mimeType = decoder0.readString(24, false);
                int readInt = decoder0.readInt(32);
                result.requestDestination = readInt;
                RequestDestination.validate(readInt);
                result.requestDestination = RequestDestination.toKnownValue(result.requestDestination);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.url, 8, false);
            encoder0.encode(this.httpMethod, 16, false);
            encoder0.encode(this.mimeType, 24, false);
            encoder0.encode(this.requestDestination, 32);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeFrameOwnerPropertiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameToken childFrameToken;
        public FrameOwnerProperties frameOwnerProperties;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeFrameOwnerPropertiesParams(int version) {
            super(32, version);
        }

        public LocalFrameHostDidChangeFrameOwnerPropertiesParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeFrameOwnerPropertiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeFrameOwnerPropertiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeFrameOwnerPropertiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeFrameOwnerPropertiesParams result = new LocalFrameHostDidChangeFrameOwnerPropertiesParams(elementsOrVersion);
                result.childFrameToken = FrameToken.decode(decoder0, 8);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.frameOwnerProperties = FrameOwnerProperties.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.childFrameToken, 8, false);
            encoder0.encode((Struct) this.frameOwnerProperties, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeOpenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public LocalFrameToken openerFrame;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeOpenerParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidChangeOpenerParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeOpenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeOpenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeOpenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeOpenerParams result = new LocalFrameHostDidChangeOpenerParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.openerFrame = LocalFrameToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.openerFrame, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeFramePolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameToken childFrameToken;
        public FramePolicy framePolicy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeFramePolicyParams(int version) {
            super(32, version);
        }

        public LocalFrameHostDidChangeFramePolicyParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeFramePolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeFramePolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeFramePolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeFramePolicyParams result = new LocalFrameHostDidChangeFramePolicyParams(elementsOrVersion);
                result.childFrameToken = FrameToken.decode(decoder0, 8);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.framePolicy = FramePolicy.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.childFrameToken, 8, false);
            encoder0.encode((Struct) this.framePolicy, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidChangeIframeAttributesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean anonymous;
        public FrameToken childFrameToken;
        public ContentSecurityPolicy parsedCspAttribute;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidChangeIframeAttributesParams(int version) {
            super(40, version);
        }

        public LocalFrameHostDidChangeIframeAttributesParams() {
            this(0);
        }

        public static LocalFrameHostDidChangeIframeAttributesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidChangeIframeAttributesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidChangeIframeAttributesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidChangeIframeAttributesParams result = new LocalFrameHostDidChangeIframeAttributesParams(elementsOrVersion);
                result.childFrameToken = FrameToken.decode(decoder0, 8);
                Decoder decoder1 = decoder0.readPointer(24, true);
                result.parsedCspAttribute = ContentSecurityPolicy.decode(decoder1);
                result.anonymous = decoder0.readBoolean(32, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.childFrameToken, 8, false);
            encoder0.encode((Struct) this.parsedCspAttribute, 24, true);
            encoder0.encode(this.anonymous, 32, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostCapturePaintPreviewOfSubframeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect clipRect;
        public UnguessableToken guid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostCapturePaintPreviewOfSubframeParams(int version) {
            super(24, version);
        }

        public LocalFrameHostCapturePaintPreviewOfSubframeParams() {
            this(0);
        }

        public static LocalFrameHostCapturePaintPreviewOfSubframeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostCapturePaintPreviewOfSubframeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostCapturePaintPreviewOfSubframeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostCapturePaintPreviewOfSubframeParams result = new LocalFrameHostCapturePaintPreviewOfSubframeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.clipRect = Rect.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.guid = UnguessableToken.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.clipRect, 8, false);
            encoder0.encode((Struct) this.guid, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostSetModalCloseListenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ModalCloseListener listener;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostSetModalCloseListenerParams(int version) {
            super(16, version);
        }

        public LocalFrameHostSetModalCloseListenerParams() {
            this(0);
        }

        public static LocalFrameHostSetModalCloseListenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostSetModalCloseListenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostSetModalCloseListenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostSetModalCloseListenerParams result = new LocalFrameHostSetModalCloseListenerParams(elementsOrVersion);
                result.listener = (ModalCloseListener) decoder0.readServiceInterface(8, false, ModalCloseListener.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.listener, 8, false,  ModalCloseListener.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDetachParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDetachParams(int version) {
            super(8, version);
        }

        public LocalFrameHostDetachParams() {
            this(0);
        }

        public static LocalFrameHostDetachParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDetachParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDetachParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDetachParams result = new LocalFrameHostDetachParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostGetKeepAliveHandleFactoryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<KeepAliveHandleFactory> factory;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostGetKeepAliveHandleFactoryParams(int version) {
            super(16, version);
        }

        public LocalFrameHostGetKeepAliveHandleFactoryParams() {
            this(0);
        }

        public static LocalFrameHostGetKeepAliveHandleFactoryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostGetKeepAliveHandleFactoryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostGetKeepAliveHandleFactoryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostGetKeepAliveHandleFactoryParams result = new LocalFrameHostGetKeepAliveHandleFactoryParams(elementsOrVersion);
                result.factory = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.factory, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidAddMessageToConsoleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public int lineNumber;
        public int logLevel;
        public BigString16 msg;
        public String16 sourceId;
        public BigString16 untrustedStackTrace;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidAddMessageToConsoleParams(int version) {
            super(40, version);
        }

        public LocalFrameHostDidAddMessageToConsoleParams() {
            this(0);
        }

        public static LocalFrameHostDidAddMessageToConsoleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidAddMessageToConsoleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidAddMessageToConsoleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidAddMessageToConsoleParams result = new LocalFrameHostDidAddMessageToConsoleParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.logLevel = readInt;
                ConsoleMessageLevel.validate(readInt);
                result.logLevel = ConsoleMessageLevel.toKnownValue(result.logLevel);
                result.lineNumber = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.msg = BigString16.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, true);
                result.sourceId = String16.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(32, true);
                result.untrustedStackTrace = BigString16.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.logLevel, 8);
            encoder0.encode(this.lineNumber, 12);
            encoder0.encode((Struct) this.msg, 16, false);
            encoder0.encode((Struct) this.sourceId, 24, true);
            encoder0.encode((Struct) this.untrustedStackTrace, 32, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostFrameSizeChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Size size;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostFrameSizeChangedParams(int version) {
            super(16, version);
        }

        public LocalFrameHostFrameSizeChangedParams() {
            this(0);
        }

        public static LocalFrameHostFrameSizeChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostFrameSizeChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostFrameSizeChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostFrameSizeChangedParams result = new LocalFrameHostFrameSizeChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.size = Size.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.size, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHostDidUpdatePreferredColorSchemeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int preferredColorScheme;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHostDidUpdatePreferredColorSchemeParams(int version) {
            super(16, version);
        }

        public LocalFrameHostDidUpdatePreferredColorSchemeParams() {
            this(0);
        }

        public static LocalFrameHostDidUpdatePreferredColorSchemeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHostDidUpdatePreferredColorSchemeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHostDidUpdatePreferredColorSchemeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHostDidUpdatePreferredColorSchemeParams result = new LocalFrameHostDidUpdatePreferredColorSchemeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.preferredColorScheme = readInt;
                PreferredColorScheme.validate(readInt);
                result.preferredColorScheme = PreferredColorScheme.toKnownValue(result.preferredColorScheme);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.preferredColorScheme, 8);
        }
    }
}
