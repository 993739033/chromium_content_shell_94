package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.LocalFrame;
import org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle;
import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.Rect;
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
import org.chromium.mojo_base.mojom.ListValue;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.Value;
import org.chromium.network.mojom.CspViolation;
import org.chromium.network.mojom.SourceLocation;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class LocalFrame_Internal {
    private static final int ADD_INSPECTOR_ISSUE_ORDINAL = 6;
    private static final int ADD_MESSAGE_TO_CONSOLE_ORDINAL = 5;
    private static final int ADVANCE_FOCUS_IN_FORM_ORDINAL = 23;
    private static final int ADVANCE_FOCUS_IN_FRAME_ORDINAL = 22;
    private static final int BEFORE_UNLOAD_ORDINAL = 20;
    private static final int BIND_DEV_TOOLS_AGENT_ORDINAL = 36;
    private static final int BIND_REPORTING_OBSERVER_ORDINAL = 32;
    private static final int CHECK_COMPLETED_ORDINAL = 8;
    private static final int CLEAR_FOCUSED_ELEMENT_ORDINAL = 13;
    private static final int COLLAPSE_ORDINAL = 10;
    private static final int COPY_IMAGE_AT_ORDINAL = 15;
    private static final int DID_UPDATE_FRAME_POLICY_ORDINAL = 25;
    private static final int ENABLE_VIEW_SOURCE_MODE_ORDINAL = 11;
    private static final int EXTRACT_SMART_CLIP_DATA_ORDINAL = 37;
    private static final int FOCUS_ORDINAL = 12;
    private static final int GET_CANONICAL_URL_FOR_SHARING_ORDINAL = 39;
    private static final int GET_RESOURCE_SNAPSHOT_FOR_WEB_BUNDLE_ORDINAL = 14;
    private static final int GET_SAVABLE_RESOURCE_LINKS_ORDINAL = 34;
    private static final int GET_TEXT_SURROUNDING_SELECTION_ORDINAL = 0;
    private static final int HANDLE_RENDERER_DEBUG_URL_ORDINAL = 38;
    private static final int JAVA_SCRIPT_EXECUTE_REQUEST_FOR_TESTS_ORDINAL = 30;
    private static final int JAVA_SCRIPT_EXECUTE_REQUEST_IN_ISOLATED_WORLD_ORDINAL = 31;
    private static final int JAVA_SCRIPT_EXECUTE_REQUEST_ORDINAL = 29;
    private static final int JAVA_SCRIPT_METHOD_EXECUTE_REQUEST_ORDINAL = 28;
    public static final Interface.Manager<LocalFrame, LocalFrame.Proxy> MANAGER = new Interface.Manager<LocalFrame, LocalFrame.Proxy>() { // from class: org.chromium.blink.mojom.LocalFrame_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.LocalFrame";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public LocalFrame.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, LocalFrame impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public LocalFrame[] buildArray(int size) {
            return new LocalFrame[size];
        }
    };
    private static final int MEDIA_PLAYER_ACTION_AT_ORDINAL = 21;
    private static final int MIXED_CONTENT_FOUND_ORDINAL = 35;
    private static final int NOTIFY_USER_ACTIVATION_ORDINAL = 3;
    private static final int NOTIFY_VIRTUAL_KEYBOARD_OVERLAY_RECT_ORDINAL = 4;
    private static final int ON_SCREENS_CHANGE_ORDINAL = 26;
    private static final int POST_MESSAGE_EVENT_ORDINAL = 27;
    private static final int RENDER_FALLBACK_CONTENT_ORDINAL = 18;
    private static final int RENDER_FALLBACK_CONTENT_WITH_RESOURCE_TIMING_ORDINAL = 19;
    private static final int REPORT_BLINK_FEATURE_USAGE_ORDINAL = 17;
    private static final int REPORT_CONTENT_SECURITY_POLICY_VIOLATION_ORDINAL = 24;
    private static final int SAVE_IMAGE_AT_ORDINAL = 16;
    private static final int SEND_INTERVENTION_REPORT_ORDINAL = 1;
    private static final int SET_FRAME_OWNER_PROPERTIES_ORDINAL = 2;
    private static final int STOP_LOADING_ORDINAL = 9;
    private static final int SWAP_IN_IMMEDIATELY_ORDINAL = 7;
    private static final int UPDATE_OPENER_ORDINAL = 33;

    LocalFrame_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements LocalFrame.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void getTextSurroundingSelection(int maxLength, GetTextSurroundingSelectionResponse callback) {
            LocalFrameGetTextSurroundingSelectionParams _message = new LocalFrameGetTextSurroundingSelectionParams();
            _message.maxLength = maxLength;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new LocalFrameGetTextSurroundingSelectionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void sendInterventionReport(String id, String message) {
            LocalFrameSendInterventionReportParams _message = new LocalFrameSendInterventionReportParams();
            _message.id = id;
            _message.message = message;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void setFrameOwnerProperties(FrameOwnerProperties properties) {
            LocalFrameSetFrameOwnerPropertiesParams _message = new LocalFrameSetFrameOwnerPropertiesParams();
            _message.properties = properties;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void notifyUserActivation(int notificationType) {
            LocalFrameNotifyUserActivationParams _message = new LocalFrameNotifyUserActivationParams();
            _message.notificationType = notificationType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void notifyVirtualKeyboardOverlayRect(Rect keyboardRect) {
            LocalFrameNotifyVirtualKeyboardOverlayRectParams _message = new LocalFrameNotifyVirtualKeyboardOverlayRectParams();
            _message.keyboardRect = keyboardRect;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void addMessageToConsole(int level, String message, boolean discardDuplicates) {
            LocalFrameAddMessageToConsoleParams _message = new LocalFrameAddMessageToConsoleParams();
            _message.level = level;
            _message.message = message;
            _message.discardDuplicates = discardDuplicates;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void addInspectorIssue(InspectorIssueInfo info) {
            LocalFrameAddInspectorIssueParams _message = new LocalFrameAddInspectorIssueParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void swapInImmediately() {
            LocalFrameSwapInImmediatelyParams _message = new LocalFrameSwapInImmediatelyParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void checkCompleted() {
            LocalFrameCheckCompletedParams _message = new LocalFrameCheckCompletedParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void stopLoading() {
            LocalFrameStopLoadingParams _message = new LocalFrameStopLoadingParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void collapse(boolean collapsed) {
            LocalFrameCollapseParams _message = new LocalFrameCollapseParams();
            _message.collapsed = collapsed;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void enableViewSourceMode() {
            LocalFrameEnableViewSourceModeParams _message = new LocalFrameEnableViewSourceModeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void focus() {
            LocalFrameFocusParams _message = new LocalFrameFocusParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void clearFocusedElement() {
            LocalFrameClearFocusedElementParams _message = new LocalFrameClearFocusedElementParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void getResourceSnapshotForWebBundle(InterfaceRequest<ResourceSnapshotForWebBundle> receiver) {
            LocalFrameGetResourceSnapshotForWebBundleParams _message = new LocalFrameGetResourceSnapshotForWebBundleParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void copyImageAt(Point windowPoint) {
            LocalFrameCopyImageAtParams _message = new LocalFrameCopyImageAtParams();
            _message.windowPoint = windowPoint;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void saveImageAt(Point windowPoint) {
            LocalFrameSaveImageAtParams _message = new LocalFrameSaveImageAtParams();
            _message.windowPoint = windowPoint;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void reportBlinkFeatureUsage(int[] features) {
            LocalFrameReportBlinkFeatureUsageParams _message = new LocalFrameReportBlinkFeatureUsageParams();
            _message.features = features;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void renderFallbackContent() {
            LocalFrameRenderFallbackContentParams _message = new LocalFrameRenderFallbackContentParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void renderFallbackContentWithResourceTiming(ResourceTimingInfo timing, String serverTimingValue) {
            LocalFrameRenderFallbackContentWithResourceTimingParams _message = new LocalFrameRenderFallbackContentWithResourceTimingParams();
            _message.timing = timing;
            _message.serverTimingValue = serverTimingValue;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void beforeUnload(boolean isReload, BeforeUnloadResponse callback) {
            LocalFrameBeforeUnloadParams _message = new LocalFrameBeforeUnloadParams();
            _message.isReload = isReload;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20, 1, 0L)), new LocalFrameBeforeUnloadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void mediaPlayerActionAt(Point location, MediaPlayerAction action) {
            LocalFrameMediaPlayerActionAtParams _message = new LocalFrameMediaPlayerActionAtParams();
            _message.location = location;
            _message.action = action;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void advanceFocusInFrame(int focusType, RemoteFrameToken sourceFrameToken) {
            LocalFrameAdvanceFocusInFrameParams _message = new LocalFrameAdvanceFocusInFrameParams();
            _message.focusType = focusType;
            _message.sourceFrameToken = sourceFrameToken;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void advanceFocusInForm(int focusType) {
            LocalFrameAdvanceFocusInFormParams _message = new LocalFrameAdvanceFocusInFormParams();
            _message.focusType = focusType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void reportContentSecurityPolicyViolation(CspViolation violation) {
            LocalFrameReportContentSecurityPolicyViolationParams _message = new LocalFrameReportContentSecurityPolicyViolationParams();
            _message.violation = violation;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void didUpdateFramePolicy(FramePolicy framePolicy) {
            LocalFrameDidUpdateFramePolicyParams _message = new LocalFrameDidUpdateFramePolicyParams();
            _message.framePolicy = framePolicy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void onScreensChange() {
            LocalFrameOnScreensChangeParams _message = new LocalFrameOnScreensChangeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(26)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void postMessageEvent(RemoteFrameToken sourceFrameToken, String16 sourceOrigin, String16 targetOrigin, TransferableMessage message) {
            LocalFramePostMessageEventParams _message = new LocalFramePostMessageEventParams();
            _message.sourceFrameToken = sourceFrameToken;
            _message.sourceOrigin = sourceOrigin;
            _message.targetOrigin = targetOrigin;
            _message.message = message;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(27)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void javaScriptMethodExecuteRequest(String16 objectName, String16 methodName, ListValue arguments, boolean wantsResult, JavaScriptMethodExecuteRequestResponse callback) {
            LocalFrameJavaScriptMethodExecuteRequestParams _message = new LocalFrameJavaScriptMethodExecuteRequestParams();
            _message.objectName = objectName;
            _message.methodName = methodName;
            _message.arguments = arguments;
            _message.wantsResult = wantsResult;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(28, 1, 0L)), new LocalFrameJavaScriptMethodExecuteRequestResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void javaScriptExecuteRequest(BigString16 javascript, boolean wantsResult, JavaScriptExecuteRequestResponse callback) {
            LocalFrameJavaScriptExecuteRequestParams _message = new LocalFrameJavaScriptExecuteRequestParams();
            _message.javascript = javascript;
            _message.wantsResult = wantsResult;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(29, 1, 0L)), new LocalFrameJavaScriptExecuteRequestResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void javaScriptExecuteRequestForTests(BigString16 javascript, boolean wantsResult, boolean hasUserGesture, int worldId, JavaScriptExecuteRequestForTestsResponse callback) {
            LocalFrameJavaScriptExecuteRequestForTestsParams _message = new LocalFrameJavaScriptExecuteRequestForTestsParams();
            _message.javascript = javascript;
            _message.wantsResult = wantsResult;
            _message.hasUserGesture = hasUserGesture;
            _message.worldId = worldId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(30, 1, 0L)), new LocalFrameJavaScriptExecuteRequestForTestsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void javaScriptExecuteRequestInIsolatedWorld(BigString16 javascript, boolean wantsResult, int worldId, JavaScriptExecuteRequestInIsolatedWorldResponse callback) {
            LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams _message = new LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams();
            _message.javascript = javascript;
            _message.wantsResult = wantsResult;
            _message.worldId = worldId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(31, 1, 0L)), new LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void bindReportingObserver(InterfaceRequest<ReportingObserver> receiver) {
            LocalFrameBindReportingObserverParams _message = new LocalFrameBindReportingObserverParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(32)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void updateOpener(FrameToken openerFrameToken) {
            LocalFrameUpdateOpenerParams _message = new LocalFrameUpdateOpenerParams();
            _message.openerFrameToken = openerFrameToken;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(33)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void getSavableResourceLinks(GetSavableResourceLinksResponse callback) {
            LocalFrameGetSavableResourceLinksParams _message = new LocalFrameGetSavableResourceLinksParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(34, 1, 0L)), new LocalFrameGetSavableResourceLinksResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void mixedContentFound(Url mainResourceUrl, Url mixedContentUrl, int requestContext, boolean wasAllowed, Url urlBeforeRedirects, boolean hadRedirect, SourceLocation sourceLocation) {
            LocalFrameMixedContentFoundParams _message = new LocalFrameMixedContentFoundParams();
            _message.mainResourceUrl = mainResourceUrl;
            _message.mixedContentUrl = mixedContentUrl;
            _message.requestContext = requestContext;
            _message.wasAllowed = wasAllowed;
            _message.urlBeforeRedirects = urlBeforeRedirects;
            _message.hadRedirect = hadRedirect;
            _message.sourceLocation = sourceLocation;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(35)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void bindDevToolsAgent(AssociatedInterfaceNotSupported agentHost, AssociatedInterfaceRequestNotSupported agent) {
            LocalFrameBindDevToolsAgentParams _message = new LocalFrameBindDevToolsAgentParams();
            _message.agentHost = agentHost;
            _message.agent = agent;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(36)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void extractSmartClipData(Rect rect, ExtractSmartClipDataResponse callback) {
            LocalFrameExtractSmartClipDataParams _message = new LocalFrameExtractSmartClipDataParams();
            _message.rect = rect;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(37, 1, 0L)), new LocalFrameExtractSmartClipDataResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void handleRendererDebugUrl(Url url) {
            LocalFrameHandleRendererDebugUrlParams _message = new LocalFrameHandleRendererDebugUrlParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(38)));
        }

        @Override // org.chromium.blink.mojom.LocalFrame
        public void getCanonicalUrlForSharing(GetCanonicalUrlForSharingResponse callback) {
            LocalFrameGetCanonicalUrlForSharingParams _message = new LocalFrameGetCanonicalUrlForSharingParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(39, 1, 0L)), new LocalFrameGetCanonicalUrlForSharingResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<LocalFrame> {
        Stub(Core core, LocalFrame impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(LocalFrame_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 0:
                    case 20:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 34:
                    case 37:
                    default:
                        return false;
                    case 1:
                        LocalFrameSendInterventionReportParams data = LocalFrameSendInterventionReportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().sendInterventionReport(data.id, data.message);
                        return true;
                    case 2:
                        getImpl().setFrameOwnerProperties(LocalFrameSetFrameOwnerPropertiesParams.deserialize(messageWithHeader.getPayload()).properties);
                        return true;
                    case 3:
                        getImpl().notifyUserActivation(LocalFrameNotifyUserActivationParams.deserialize(messageWithHeader.getPayload()).notificationType);
                        return true;
                    case 4:
                        getImpl().notifyVirtualKeyboardOverlayRect(LocalFrameNotifyVirtualKeyboardOverlayRectParams.deserialize(messageWithHeader.getPayload()).keyboardRect);
                        return true;
                    case 5:
                        LocalFrameAddMessageToConsoleParams data2 = LocalFrameAddMessageToConsoleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addMessageToConsole(data2.level, data2.message, data2.discardDuplicates);
                        return true;
                    case 6:
                        getImpl().addInspectorIssue(LocalFrameAddInspectorIssueParams.deserialize(messageWithHeader.getPayload()).info);
                        return true;
                    case 7:
                        LocalFrameSwapInImmediatelyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().swapInImmediately();
                        return true;
                    case 8:
                        LocalFrameCheckCompletedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().checkCompleted();
                        return true;
                    case 9:
                        LocalFrameStopLoadingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stopLoading();
                        return true;
                    case 10:
                        getImpl().collapse(LocalFrameCollapseParams.deserialize(messageWithHeader.getPayload()).collapsed);
                        return true;
                    case 11:
                        LocalFrameEnableViewSourceModeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enableViewSourceMode();
                        return true;
                    case 12:
                        LocalFrameFocusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().focus();
                        return true;
                    case 13:
                        LocalFrameClearFocusedElementParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearFocusedElement();
                        return true;
                    case 14:
                        getImpl().getResourceSnapshotForWebBundle(LocalFrameGetResourceSnapshotForWebBundleParams.deserialize(messageWithHeader.getPayload()).receiver);
                        return true;
                    case 15:
                        getImpl().copyImageAt(LocalFrameCopyImageAtParams.deserialize(messageWithHeader.getPayload()).windowPoint);
                        return true;
                    case 16:
                        getImpl().saveImageAt(LocalFrameSaveImageAtParams.deserialize(messageWithHeader.getPayload()).windowPoint);
                        return true;
                    case 17:
                        getImpl().reportBlinkFeatureUsage(LocalFrameReportBlinkFeatureUsageParams.deserialize(messageWithHeader.getPayload()).features);
                        return true;
                    case 18:
                        LocalFrameRenderFallbackContentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().renderFallbackContent();
                        return true;
                    case 19:
                        LocalFrameRenderFallbackContentWithResourceTimingParams data3 = LocalFrameRenderFallbackContentWithResourceTimingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().renderFallbackContentWithResourceTiming(data3.timing, data3.serverTimingValue);
                        return true;
                    case 21:
                        LocalFrameMediaPlayerActionAtParams data4 = LocalFrameMediaPlayerActionAtParams.deserialize(messageWithHeader.getPayload());
                        getImpl().mediaPlayerActionAt(data4.location, data4.action);
                        return true;
                    case 22:
                        LocalFrameAdvanceFocusInFrameParams data5 = LocalFrameAdvanceFocusInFrameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().advanceFocusInFrame(data5.focusType, data5.sourceFrameToken);
                        return true;
                    case 23:
                        getImpl().advanceFocusInForm(LocalFrameAdvanceFocusInFormParams.deserialize(messageWithHeader.getPayload()).focusType);
                        return true;
                    case 24:
                        getImpl().reportContentSecurityPolicyViolation(LocalFrameReportContentSecurityPolicyViolationParams.deserialize(messageWithHeader.getPayload()).violation);
                        return true;
                    case 25:
                        getImpl().didUpdateFramePolicy(LocalFrameDidUpdateFramePolicyParams.deserialize(messageWithHeader.getPayload()).framePolicy);
                        return true;
                    case 26:
                        LocalFrameOnScreensChangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onScreensChange();
                        return true;
                    case 27:
                        LocalFramePostMessageEventParams data6 = LocalFramePostMessageEventParams.deserialize(messageWithHeader.getPayload());
                        getImpl().postMessageEvent(data6.sourceFrameToken, data6.sourceOrigin, data6.targetOrigin, data6.message);
                        return true;
                    case 32:
                        getImpl().bindReportingObserver(LocalFrameBindReportingObserverParams.deserialize(messageWithHeader.getPayload()).receiver);
                        return true;
                    case 33:
                        getImpl().updateOpener(LocalFrameUpdateOpenerParams.deserialize(messageWithHeader.getPayload()).openerFrameToken);
                        return true;
                    case 35:
                        LocalFrameMixedContentFoundParams data7 = LocalFrameMixedContentFoundParams.deserialize(messageWithHeader.getPayload());
                        getImpl().mixedContentFound(data7.mainResourceUrl, data7.mixedContentUrl, data7.requestContext, data7.wasAllowed, data7.urlBeforeRedirects, data7.hadRedirect, data7.sourceLocation);
                        return true;
                    case 36:
                        LocalFrameBindDevToolsAgentParams data8 = LocalFrameBindDevToolsAgentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bindDevToolsAgent(data8.agentHost, data8.agent);
                        return true;
                    case 38:
                        getImpl().handleRendererDebugUrl(LocalFrameHandleRendererDebugUrlParams.deserialize(messageWithHeader.getPayload()).url);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), LocalFrame_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        LocalFrameGetTextSurroundingSelectionParams data = LocalFrameGetTextSurroundingSelectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getTextSurroundingSelection(data.maxLength, new LocalFrameGetTextSurroundingSelectionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 20:
                        LocalFrameBeforeUnloadParams data2 = LocalFrameBeforeUnloadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().beforeUnload(data2.isReload, new LocalFrameBeforeUnloadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 28:
                        LocalFrameJavaScriptMethodExecuteRequestParams data3 = LocalFrameJavaScriptMethodExecuteRequestParams.deserialize(messageWithHeader.getPayload());
                        getImpl().javaScriptMethodExecuteRequest(data3.objectName, data3.methodName, data3.arguments, data3.wantsResult, new LocalFrameJavaScriptMethodExecuteRequestResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 29:
                        LocalFrameJavaScriptExecuteRequestParams data4 = LocalFrameJavaScriptExecuteRequestParams.deserialize(messageWithHeader.getPayload());
                        getImpl().javaScriptExecuteRequest(data4.javascript, data4.wantsResult, new LocalFrameJavaScriptExecuteRequestResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 30:
                        LocalFrameJavaScriptExecuteRequestForTestsParams data5 = LocalFrameJavaScriptExecuteRequestForTestsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().javaScriptExecuteRequestForTests(data5.javascript, data5.wantsResult, data5.hasUserGesture, data5.worldId, new LocalFrameJavaScriptExecuteRequestForTestsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 31:
                        LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams data6 = LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams.deserialize(messageWithHeader.getPayload());
                        getImpl().javaScriptExecuteRequestInIsolatedWorld(data6.javascript, data6.wantsResult, data6.worldId, new LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 34:
                        LocalFrameGetSavableResourceLinksParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getSavableResourceLinks(new LocalFrameGetSavableResourceLinksResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 37:
                        LocalFrameExtractSmartClipDataParams data7 = LocalFrameExtractSmartClipDataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().extractSmartClipData(data7.rect, new LocalFrameExtractSmartClipDataResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 39:
                        LocalFrameGetCanonicalUrlForSharingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getCanonicalUrlForSharing(new LocalFrameGetCanonicalUrlForSharingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class LocalFrameGetTextSurroundingSelectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int maxLength;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetTextSurroundingSelectionParams(int version) {
            super(16, version);
        }

        public LocalFrameGetTextSurroundingSelectionParams() {
            this(0);
        }

        public static LocalFrameGetTextSurroundingSelectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetTextSurroundingSelectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetTextSurroundingSelectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetTextSurroundingSelectionParams result = new LocalFrameGetTextSurroundingSelectionParams(elementsOrVersion);
                result.maxLength = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.maxLength, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameGetTextSurroundingSelectionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 content;
        public int endOffset;
        public int startOffset;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetTextSurroundingSelectionResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameGetTextSurroundingSelectionResponseParams() {
            this(0);
        }

        public static LocalFrameGetTextSurroundingSelectionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetTextSurroundingSelectionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetTextSurroundingSelectionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetTextSurroundingSelectionResponseParams result = new LocalFrameGetTextSurroundingSelectionResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.content = String16.decode(decoder1);
                result.startOffset = decoder0.readInt(16);
                result.endOffset = decoder0.readInt(20);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.content, 8, false);
            encoder0.encode(this.startOffset, 16);
            encoder0.encode(this.endOffset, 20);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetTextSurroundingSelectionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.GetTextSurroundingSelectionResponse mCallback;

        LocalFrameGetTextSurroundingSelectionResponseParamsForwardToCallback(LocalFrame.GetTextSurroundingSelectionResponse callback) {
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
                LocalFrameGetTextSurroundingSelectionResponseParams response = LocalFrameGetTextSurroundingSelectionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.content, Integer.valueOf(response.startOffset), Integer.valueOf(response.endOffset));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetTextSurroundingSelectionResponseParamsProxyToResponder implements LocalFrame.GetTextSurroundingSelectionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameGetTextSurroundingSelectionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(String16 content, Integer startOffset, Integer endOffset) {
            LocalFrameGetTextSurroundingSelectionResponseParams _response = new LocalFrameGetTextSurroundingSelectionResponseParams();
            _response.content = content;
            _response.startOffset = startOffset.intValue();
            _response.endOffset = endOffset.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameSendInterventionReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String id;
        public String message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameSendInterventionReportParams(int version) {
            super(24, version);
        }

        public LocalFrameSendInterventionReportParams() {
            this(0);
        }

        public static LocalFrameSendInterventionReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameSendInterventionReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameSendInterventionReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameSendInterventionReportParams result = new LocalFrameSendInterventionReportParams(elementsOrVersion);
                result.id = decoder0.readString(8, false);
                result.message = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.id, 8, false);
            encoder0.encode(this.message, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameSetFrameOwnerPropertiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameOwnerProperties properties;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameSetFrameOwnerPropertiesParams(int version) {
            super(16, version);
        }

        public LocalFrameSetFrameOwnerPropertiesParams() {
            this(0);
        }

        public static LocalFrameSetFrameOwnerPropertiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameSetFrameOwnerPropertiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameSetFrameOwnerPropertiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameSetFrameOwnerPropertiesParams result = new LocalFrameSetFrameOwnerPropertiesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.properties = FrameOwnerProperties.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.properties, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameNotifyUserActivationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int notificationType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameNotifyUserActivationParams(int version) {
            super(16, version);
        }

        public LocalFrameNotifyUserActivationParams() {
            this(0);
        }

        public static LocalFrameNotifyUserActivationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameNotifyUserActivationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameNotifyUserActivationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameNotifyUserActivationParams result = new LocalFrameNotifyUserActivationParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.notificationType = readInt;
                UserActivationNotificationType.validate(readInt);
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
            encoder0.encode(this.notificationType, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameNotifyVirtualKeyboardOverlayRectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect keyboardRect;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameNotifyVirtualKeyboardOverlayRectParams(int version) {
            super(16, version);
        }

        public LocalFrameNotifyVirtualKeyboardOverlayRectParams() {
            this(0);
        }

        public static LocalFrameNotifyVirtualKeyboardOverlayRectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameNotifyVirtualKeyboardOverlayRectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameNotifyVirtualKeyboardOverlayRectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameNotifyVirtualKeyboardOverlayRectParams result = new LocalFrameNotifyVirtualKeyboardOverlayRectParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.keyboardRect = Rect.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.keyboardRect, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameAddMessageToConsoleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean discardDuplicates;
        public int level;
        public String message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameAddMessageToConsoleParams(int version) {
            super(24, version);
        }

        public LocalFrameAddMessageToConsoleParams() {
            this(0);
        }

        public static LocalFrameAddMessageToConsoleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameAddMessageToConsoleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameAddMessageToConsoleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameAddMessageToConsoleParams result = new LocalFrameAddMessageToConsoleParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.level = readInt;
                ConsoleMessageLevel.validate(readInt);
                result.level = ConsoleMessageLevel.toKnownValue(result.level);
                result.discardDuplicates = decoder0.readBoolean(12, 0);
                result.message = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.level, 8);
            encoder0.encode(this.discardDuplicates, 12, 0);
            encoder0.encode(this.message, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameAddInspectorIssueParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InspectorIssueInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameAddInspectorIssueParams(int version) {
            super(16, version);
        }

        public LocalFrameAddInspectorIssueParams() {
            this(0);
        }

        public static LocalFrameAddInspectorIssueParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameAddInspectorIssueParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameAddInspectorIssueParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameAddInspectorIssueParams result = new LocalFrameAddInspectorIssueParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = InspectorIssueInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameSwapInImmediatelyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameSwapInImmediatelyParams(int version) {
            super(8, version);
        }

        public LocalFrameSwapInImmediatelyParams() {
            this(0);
        }

        public static LocalFrameSwapInImmediatelyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameSwapInImmediatelyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameSwapInImmediatelyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameSwapInImmediatelyParams result = new LocalFrameSwapInImmediatelyParams(elementsOrVersion);
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
    static final class LocalFrameCheckCompletedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameCheckCompletedParams(int version) {
            super(8, version);
        }

        public LocalFrameCheckCompletedParams() {
            this(0);
        }

        public static LocalFrameCheckCompletedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameCheckCompletedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameCheckCompletedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameCheckCompletedParams result = new LocalFrameCheckCompletedParams(elementsOrVersion);
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
    static final class LocalFrameStopLoadingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameStopLoadingParams(int version) {
            super(8, version);
        }

        public LocalFrameStopLoadingParams() {
            this(0);
        }

        public static LocalFrameStopLoadingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameStopLoadingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameStopLoadingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameStopLoadingParams result = new LocalFrameStopLoadingParams(elementsOrVersion);
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
    static final class LocalFrameCollapseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean collapsed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameCollapseParams(int version) {
            super(16, version);
        }

        public LocalFrameCollapseParams() {
            this(0);
        }

        public static LocalFrameCollapseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameCollapseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameCollapseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameCollapseParams result = new LocalFrameCollapseParams(elementsOrVersion);
                result.collapsed = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.collapsed, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameEnableViewSourceModeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameEnableViewSourceModeParams(int version) {
            super(8, version);
        }

        public LocalFrameEnableViewSourceModeParams() {
            this(0);
        }

        public static LocalFrameEnableViewSourceModeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameEnableViewSourceModeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameEnableViewSourceModeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameEnableViewSourceModeParams result = new LocalFrameEnableViewSourceModeParams(elementsOrVersion);
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
    static final class LocalFrameFocusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameFocusParams(int version) {
            super(8, version);
        }

        public LocalFrameFocusParams() {
            this(0);
        }

        public static LocalFrameFocusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameFocusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameFocusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameFocusParams result = new LocalFrameFocusParams(elementsOrVersion);
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
    static final class LocalFrameClearFocusedElementParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameClearFocusedElementParams(int version) {
            super(8, version);
        }

        public LocalFrameClearFocusedElementParams() {
            this(0);
        }

        public static LocalFrameClearFocusedElementParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameClearFocusedElementParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameClearFocusedElementParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameClearFocusedElementParams result = new LocalFrameClearFocusedElementParams(elementsOrVersion);
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
    static final class LocalFrameGetResourceSnapshotForWebBundleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<ResourceSnapshotForWebBundle> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetResourceSnapshotForWebBundleParams(int version) {
            super(16, version);
        }

        public LocalFrameGetResourceSnapshotForWebBundleParams() {
            this(0);
        }

        public static LocalFrameGetResourceSnapshotForWebBundleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetResourceSnapshotForWebBundleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetResourceSnapshotForWebBundleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetResourceSnapshotForWebBundleParams result = new LocalFrameGetResourceSnapshotForWebBundleParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameCopyImageAtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Point windowPoint;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameCopyImageAtParams(int version) {
            super(16, version);
        }

        public LocalFrameCopyImageAtParams() {
            this(0);
        }

        public static LocalFrameCopyImageAtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameCopyImageAtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameCopyImageAtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameCopyImageAtParams result = new LocalFrameCopyImageAtParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.windowPoint = Point.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.windowPoint, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameSaveImageAtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Point windowPoint;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameSaveImageAtParams(int version) {
            super(16, version);
        }

        public LocalFrameSaveImageAtParams() {
            this(0);
        }

        public static LocalFrameSaveImageAtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameSaveImageAtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameSaveImageAtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameSaveImageAtParams result = new LocalFrameSaveImageAtParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.windowPoint = Point.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.windowPoint, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameReportBlinkFeatureUsageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int[] features;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameReportBlinkFeatureUsageParams(int version) {
            super(16, version);
        }

        public LocalFrameReportBlinkFeatureUsageParams() {
            this(0);
        }

        public static LocalFrameReportBlinkFeatureUsageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameReportBlinkFeatureUsageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameReportBlinkFeatureUsageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameReportBlinkFeatureUsageParams result = new LocalFrameReportBlinkFeatureUsageParams(elementsOrVersion);
                result.features = decoder0.readInts(8, 0, -1);
                int i1 = 0;
                while (true) {
                    int[] iArr = result.features;
                    if (i1 < iArr.length) {
                        WebFeature.validate(iArr[i1]);
                        i1++;
                    } else {
                        return result;
                    }
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.features, 8, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameRenderFallbackContentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameRenderFallbackContentParams(int version) {
            super(8, version);
        }

        public LocalFrameRenderFallbackContentParams() {
            this(0);
        }

        public static LocalFrameRenderFallbackContentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameRenderFallbackContentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameRenderFallbackContentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameRenderFallbackContentParams result = new LocalFrameRenderFallbackContentParams(elementsOrVersion);
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
    static final class LocalFrameRenderFallbackContentWithResourceTimingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String serverTimingValue;
        public ResourceTimingInfo timing;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameRenderFallbackContentWithResourceTimingParams(int version) {
            super(24, version);
        }

        public LocalFrameRenderFallbackContentWithResourceTimingParams() {
            this(0);
        }

        public static LocalFrameRenderFallbackContentWithResourceTimingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameRenderFallbackContentWithResourceTimingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameRenderFallbackContentWithResourceTimingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameRenderFallbackContentWithResourceTimingParams result = new LocalFrameRenderFallbackContentWithResourceTimingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.timing = ResourceTimingInfo.decode(decoder1);
                result.serverTimingValue = decoder0.readString(16, false);
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
            encoder0.encode(this.serverTimingValue, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameBeforeUnloadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isReload;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameBeforeUnloadParams(int version) {
            super(16, version);
        }

        public LocalFrameBeforeUnloadParams() {
            this(0);
        }

        public static LocalFrameBeforeUnloadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameBeforeUnloadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameBeforeUnloadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameBeforeUnloadParams result = new LocalFrameBeforeUnloadParams(elementsOrVersion);
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
    public static final class LocalFrameBeforeUnloadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeTicks beforeUnloadEndTime;
        public TimeTicks beforeUnloadStartTime;
        public boolean proceed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameBeforeUnloadResponseParams(int version) {
            super(32, version);
        }

        public LocalFrameBeforeUnloadResponseParams() {
            this(0);
        }

        public static LocalFrameBeforeUnloadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameBeforeUnloadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameBeforeUnloadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameBeforeUnloadResponseParams result = new LocalFrameBeforeUnloadResponseParams(elementsOrVersion);
                result.proceed = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.beforeUnloadStartTime = TimeTicks.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.beforeUnloadEndTime = TimeTicks.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.proceed, 8, 0);
            encoder0.encode((Struct) this.beforeUnloadStartTime, 16, false);
            encoder0.encode((Struct) this.beforeUnloadEndTime, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameBeforeUnloadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.BeforeUnloadResponse mCallback;

        LocalFrameBeforeUnloadResponseParamsForwardToCallback(LocalFrame.BeforeUnloadResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(20, 2)) {
                    return false;
                }
                LocalFrameBeforeUnloadResponseParams response = LocalFrameBeforeUnloadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.proceed), response.beforeUnloadStartTime, response.beforeUnloadEndTime);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameBeforeUnloadResponseParamsProxyToResponder implements LocalFrame.BeforeUnloadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameBeforeUnloadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean proceed, TimeTicks beforeUnloadStartTime, TimeTicks beforeUnloadEndTime) {
            LocalFrameBeforeUnloadResponseParams _response = new LocalFrameBeforeUnloadResponseParams();
            _response.proceed = proceed.booleanValue();
            _response.beforeUnloadStartTime = beforeUnloadStartTime;
            _response.beforeUnloadEndTime = beforeUnloadEndTime;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(20, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameMediaPlayerActionAtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaPlayerAction action;
        public Point location;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameMediaPlayerActionAtParams(int version) {
            super(24, version);
        }

        public LocalFrameMediaPlayerActionAtParams() {
            this(0);
        }

        public static LocalFrameMediaPlayerActionAtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameMediaPlayerActionAtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameMediaPlayerActionAtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameMediaPlayerActionAtParams result = new LocalFrameMediaPlayerActionAtParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.location = Point.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.action = MediaPlayerAction.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.location, 8, false);
            encoder0.encode((Struct) this.action, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameAdvanceFocusInFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int focusType;
        public RemoteFrameToken sourceFrameToken;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameAdvanceFocusInFrameParams(int version) {
            super(24, version);
        }

        public LocalFrameAdvanceFocusInFrameParams() {
            this(0);
        }

        public static LocalFrameAdvanceFocusInFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameAdvanceFocusInFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameAdvanceFocusInFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameAdvanceFocusInFrameParams result = new LocalFrameAdvanceFocusInFrameParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.focusType = readInt;
                FocusType.validate(readInt);
                result.focusType = FocusType.toKnownValue(result.focusType);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.sourceFrameToken = RemoteFrameToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.focusType, 8);
            encoder0.encode((Struct) this.sourceFrameToken, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameAdvanceFocusInFormParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int focusType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameAdvanceFocusInFormParams(int version) {
            super(16, version);
        }

        public LocalFrameAdvanceFocusInFormParams() {
            this(0);
        }

        public static LocalFrameAdvanceFocusInFormParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameAdvanceFocusInFormParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameAdvanceFocusInFormParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameAdvanceFocusInFormParams result = new LocalFrameAdvanceFocusInFormParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.focusType = readInt;
                FocusType.validate(readInt);
                result.focusType = FocusType.toKnownValue(result.focusType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.focusType, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameReportContentSecurityPolicyViolationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CspViolation violation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameReportContentSecurityPolicyViolationParams(int version) {
            super(16, version);
        }

        public LocalFrameReportContentSecurityPolicyViolationParams() {
            this(0);
        }

        public static LocalFrameReportContentSecurityPolicyViolationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameReportContentSecurityPolicyViolationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameReportContentSecurityPolicyViolationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameReportContentSecurityPolicyViolationParams result = new LocalFrameReportContentSecurityPolicyViolationParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.violation = CspViolation.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.violation, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameDidUpdateFramePolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FramePolicy framePolicy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameDidUpdateFramePolicyParams(int version) {
            super(16, version);
        }

        public LocalFrameDidUpdateFramePolicyParams() {
            this(0);
        }

        public static LocalFrameDidUpdateFramePolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameDidUpdateFramePolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameDidUpdateFramePolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameDidUpdateFramePolicyParams result = new LocalFrameDidUpdateFramePolicyParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
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
            encoder0.encode((Struct) this.framePolicy, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameOnScreensChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameOnScreensChangeParams(int version) {
            super(8, version);
        }

        public LocalFrameOnScreensChangeParams() {
            this(0);
        }

        public static LocalFrameOnScreensChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameOnScreensChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameOnScreensChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameOnScreensChangeParams result = new LocalFrameOnScreensChangeParams(elementsOrVersion);
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
    static final class LocalFramePostMessageEventParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public TransferableMessage message;
        public RemoteFrameToken sourceFrameToken;
        public String16 sourceOrigin;
        public String16 targetOrigin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFramePostMessageEventParams(int version) {
            super(40, version);
        }

        public LocalFramePostMessageEventParams() {
            this(0);
        }

        public static LocalFramePostMessageEventParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFramePostMessageEventParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFramePostMessageEventParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFramePostMessageEventParams result = new LocalFramePostMessageEventParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.sourceFrameToken = RemoteFrameToken.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.sourceOrigin = String16.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.targetOrigin = String16.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                result.message = TransferableMessage.decode(decoder14);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.sourceFrameToken, 8, true);
            encoder0.encode((Struct) this.sourceOrigin, 16, false);
            encoder0.encode((Struct) this.targetOrigin, 24, false);
            encoder0.encode((Struct) this.message, 32, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameJavaScriptMethodExecuteRequestParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public ListValue arguments;
        public String16 methodName;
        public String16 objectName;
        public boolean wantsResult;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptMethodExecuteRequestParams(int version) {
            super(40, version);
        }

        public LocalFrameJavaScriptMethodExecuteRequestParams() {
            this(0);
        }

        public static LocalFrameJavaScriptMethodExecuteRequestParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptMethodExecuteRequestParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptMethodExecuteRequestParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptMethodExecuteRequestParams result = new LocalFrameJavaScriptMethodExecuteRequestParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.objectName = String16.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.methodName = String16.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.arguments = ListValue.decode(decoder13);
                result.wantsResult = decoder0.readBoolean(32, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.objectName, 8, false);
            encoder0.encode((Struct) this.methodName, 16, false);
            encoder0.encode((Struct) this.arguments, 24, false);
            encoder0.encode(this.wantsResult, 32, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameJavaScriptMethodExecuteRequestResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Value result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptMethodExecuteRequestResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptMethodExecuteRequestResponseParams() {
            this(0);
        }

        public static LocalFrameJavaScriptMethodExecuteRequestResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptMethodExecuteRequestResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptMethodExecuteRequestResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptMethodExecuteRequestResponseParams result = new LocalFrameJavaScriptMethodExecuteRequestResponseParams(elementsOrVersion);
                result.result = Value.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptMethodExecuteRequestResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.JavaScriptMethodExecuteRequestResponse mCallback;

        LocalFrameJavaScriptMethodExecuteRequestResponseParamsForwardToCallback(LocalFrame.JavaScriptMethodExecuteRequestResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(28, 2)) {
                    return false;
                }
                LocalFrameJavaScriptMethodExecuteRequestResponseParams response = LocalFrameJavaScriptMethodExecuteRequestResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptMethodExecuteRequestResponseParamsProxyToResponder implements LocalFrame.JavaScriptMethodExecuteRequestResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameJavaScriptMethodExecuteRequestResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Value result) {
            LocalFrameJavaScriptMethodExecuteRequestResponseParams _response = new LocalFrameJavaScriptMethodExecuteRequestResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(28, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameJavaScriptExecuteRequestParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BigString16 javascript;
        public boolean wantsResult;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestParams result = new LocalFrameJavaScriptExecuteRequestParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.javascript = BigString16.decode(decoder1);
                result.wantsResult = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.javascript, 8, false);
            encoder0.encode(this.wantsResult, 16, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameJavaScriptExecuteRequestResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Value result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestResponseParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestResponseParams result = new LocalFrameJavaScriptExecuteRequestResponseParams(elementsOrVersion);
                result.result = Value.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.JavaScriptExecuteRequestResponse mCallback;

        LocalFrameJavaScriptExecuteRequestResponseParamsForwardToCallback(LocalFrame.JavaScriptExecuteRequestResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(29, 2)) {
                    return false;
                }
                LocalFrameJavaScriptExecuteRequestResponseParams response = LocalFrameJavaScriptExecuteRequestResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestResponseParamsProxyToResponder implements LocalFrame.JavaScriptExecuteRequestResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameJavaScriptExecuteRequestResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Value result) {
            LocalFrameJavaScriptExecuteRequestResponseParams _response = new LocalFrameJavaScriptExecuteRequestResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(29, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameJavaScriptExecuteRequestForTestsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hasUserGesture;
        public BigString16 javascript;
        public boolean wantsResult;
        public int worldId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestForTestsParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestForTestsParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestForTestsParams result = new LocalFrameJavaScriptExecuteRequestForTestsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.javascript = BigString16.decode(decoder1);
                result.wantsResult = decoder0.readBoolean(16, 0);
                result.hasUserGesture = decoder0.readBoolean(16, 1);
                result.worldId = decoder0.readInt(20);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.javascript, 8, false);
            encoder0.encode(this.wantsResult, 16, 0);
            encoder0.encode(this.hasUserGesture, 16, 1);
            encoder0.encode(this.worldId, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameJavaScriptExecuteRequestForTestsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Value result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestForTestsResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestForTestsResponseParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestForTestsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestForTestsResponseParams result = new LocalFrameJavaScriptExecuteRequestForTestsResponseParams(elementsOrVersion);
                result.result = Value.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestForTestsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.JavaScriptExecuteRequestForTestsResponse mCallback;

        LocalFrameJavaScriptExecuteRequestForTestsResponseParamsForwardToCallback(LocalFrame.JavaScriptExecuteRequestForTestsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(30, 2)) {
                    return false;
                }
                LocalFrameJavaScriptExecuteRequestForTestsResponseParams response = LocalFrameJavaScriptExecuteRequestForTestsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestForTestsResponseParamsProxyToResponder implements LocalFrame.JavaScriptExecuteRequestForTestsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameJavaScriptExecuteRequestForTestsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Value result) {
            LocalFrameJavaScriptExecuteRequestForTestsResponseParams _response = new LocalFrameJavaScriptExecuteRequestForTestsResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(30, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BigString16 javascript;
        public boolean wantsResult;
        public int worldId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams result = new LocalFrameJavaScriptExecuteRequestInIsolatedWorldParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.javascript = BigString16.decode(decoder1);
                result.wantsResult = decoder0.readBoolean(16, 0);
                result.worldId = decoder0.readInt(20);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.javascript, 8, false);
            encoder0.encode(this.wantsResult, 16, 0);
            encoder0.encode(this.worldId, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Value result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams(int version) {
            super(24, version);
        }

        public LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams() {
            this(0);
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams result = new LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams(elementsOrVersion);
                result.result = Value.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.JavaScriptExecuteRequestInIsolatedWorldResponse mCallback;

        LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsForwardToCallback(LocalFrame.JavaScriptExecuteRequestInIsolatedWorldResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(31, 2)) {
                    return false;
                }
                LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams response = LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsProxyToResponder implements LocalFrame.JavaScriptExecuteRequestInIsolatedWorldResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Value result) {
            LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams _response = new LocalFrameJavaScriptExecuteRequestInIsolatedWorldResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(31, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameBindReportingObserverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<ReportingObserver> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameBindReportingObserverParams(int version) {
            super(16, version);
        }

        public LocalFrameBindReportingObserverParams() {
            this(0);
        }

        public static LocalFrameBindReportingObserverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameBindReportingObserverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameBindReportingObserverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameBindReportingObserverParams result = new LocalFrameBindReportingObserverParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameUpdateOpenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameToken openerFrameToken;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameUpdateOpenerParams(int version) {
            super(24, version);
        }

        public LocalFrameUpdateOpenerParams() {
            this(0);
        }

        public static LocalFrameUpdateOpenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameUpdateOpenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameUpdateOpenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameUpdateOpenerParams result = new LocalFrameUpdateOpenerParams(elementsOrVersion);
                result.openerFrameToken = FrameToken.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.openerFrameToken, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameGetSavableResourceLinksParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetSavableResourceLinksParams(int version) {
            super(8, version);
        }

        public LocalFrameGetSavableResourceLinksParams() {
            this(0);
        }

        public static LocalFrameGetSavableResourceLinksParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetSavableResourceLinksParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetSavableResourceLinksParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetSavableResourceLinksParams result = new LocalFrameGetSavableResourceLinksParams(elementsOrVersion);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameGetSavableResourceLinksResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public GetSavableResourceLinksReply reply;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetSavableResourceLinksResponseParams(int version) {
            super(16, version);
        }

        public LocalFrameGetSavableResourceLinksResponseParams() {
            this(0);
        }

        public static LocalFrameGetSavableResourceLinksResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetSavableResourceLinksResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetSavableResourceLinksResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetSavableResourceLinksResponseParams result = new LocalFrameGetSavableResourceLinksResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.reply = GetSavableResourceLinksReply.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.reply, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetSavableResourceLinksResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.GetSavableResourceLinksResponse mCallback;

        LocalFrameGetSavableResourceLinksResponseParamsForwardToCallback(LocalFrame.GetSavableResourceLinksResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(34, 2)) {
                    return false;
                }
                LocalFrameGetSavableResourceLinksResponseParams response = LocalFrameGetSavableResourceLinksResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.reply);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetSavableResourceLinksResponseParamsProxyToResponder implements LocalFrame.GetSavableResourceLinksResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameGetSavableResourceLinksResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(GetSavableResourceLinksReply reply) {
            LocalFrameGetSavableResourceLinksResponseParams _response = new LocalFrameGetSavableResourceLinksResponseParams();
            _response.reply = reply;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(34, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameMixedContentFoundParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hadRedirect;
        public Url mainResourceUrl;
        public Url mixedContentUrl;
        public int requestContext;
        public SourceLocation sourceLocation;
        public Url urlBeforeRedirects;
        public boolean wasAllowed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameMixedContentFoundParams(int version) {
            super(48, version);
        }

        public LocalFrameMixedContentFoundParams() {
            this(0);
        }

        public static LocalFrameMixedContentFoundParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameMixedContentFoundParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameMixedContentFoundParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameMixedContentFoundParams result = new LocalFrameMixedContentFoundParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.mainResourceUrl = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.mixedContentUrl = Url.decode(decoder12);
                int readInt = decoder0.readInt(24);
                result.requestContext = readInt;
                RequestContextType.validate(readInt);
                result.requestContext = RequestContextType.toKnownValue(result.requestContext);
                result.wasAllowed = decoder0.readBoolean(28, 0);
                result.hadRedirect = decoder0.readBoolean(28, 1);
                Decoder decoder13 = decoder0.readPointer(32, false);
                result.urlBeforeRedirects = Url.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(40, true);
                result.sourceLocation = SourceLocation.decode(decoder14);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.mainResourceUrl, 8, false);
            encoder0.encode((Struct) this.mixedContentUrl, 16, false);
            encoder0.encode(this.requestContext, 24);
            encoder0.encode(this.wasAllowed, 28, 0);
            encoder0.encode(this.hadRedirect, 28, 1);
            encoder0.encode((Struct) this.urlBeforeRedirects, 32, false);
            encoder0.encode((Struct) this.sourceLocation, 40, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameBindDevToolsAgentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceRequestNotSupported agent;
        public AssociatedInterfaceNotSupported agentHost;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameBindDevToolsAgentParams(int version) {
            super(24, version);
        }

        public LocalFrameBindDevToolsAgentParams() {
            this(0);
        }

        public static LocalFrameBindDevToolsAgentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameBindDevToolsAgentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameBindDevToolsAgentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameBindDevToolsAgentParams result = new LocalFrameBindDevToolsAgentParams(elementsOrVersion);
                result.agentHost = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                result.agent = decoder0.readAssociatedInterfaceRequestNotSupported(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.agentHost, 8, false);
            encoder0.encode(this.agent, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameExtractSmartClipDataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect rect;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameExtractSmartClipDataParams(int version) {
            super(16, version);
        }

        public LocalFrameExtractSmartClipDataParams() {
            this(0);
        }

        public static LocalFrameExtractSmartClipDataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameExtractSmartClipDataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameExtractSmartClipDataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameExtractSmartClipDataParams result = new LocalFrameExtractSmartClipDataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.rect = Rect.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.rect, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameExtractSmartClipDataResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect clipRect;
        public String16 html;
        public String16 text;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameExtractSmartClipDataResponseParams(int version) {
            super(32, version);
        }

        public LocalFrameExtractSmartClipDataResponseParams() {
            this(0);
        }

        public static LocalFrameExtractSmartClipDataResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameExtractSmartClipDataResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameExtractSmartClipDataResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameExtractSmartClipDataResponseParams result = new LocalFrameExtractSmartClipDataResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.text = String16.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.html = String16.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.clipRect = Rect.decode(decoder13);
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
            encoder0.encode((Struct) this.html, 16, false);
            encoder0.encode((Struct) this.clipRect, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameExtractSmartClipDataResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.ExtractSmartClipDataResponse mCallback;

        LocalFrameExtractSmartClipDataResponseParamsForwardToCallback(LocalFrame.ExtractSmartClipDataResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(37, 2)) {
                    return false;
                }
                LocalFrameExtractSmartClipDataResponseParams response = LocalFrameExtractSmartClipDataResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.text, response.html, response.clipRect);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameExtractSmartClipDataResponseParamsProxyToResponder implements LocalFrame.ExtractSmartClipDataResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameExtractSmartClipDataResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(String16 text, String16 html, Rect clipRect) {
            LocalFrameExtractSmartClipDataResponseParams _response = new LocalFrameExtractSmartClipDataResponseParams();
            _response.text = text;
            _response.html = html;
            _response.clipRect = clipRect;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(37, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameHandleRendererDebugUrlParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameHandleRendererDebugUrlParams(int version) {
            super(16, version);
        }

        public LocalFrameHandleRendererDebugUrlParams() {
            this(0);
        }

        public static LocalFrameHandleRendererDebugUrlParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameHandleRendererDebugUrlParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameHandleRendererDebugUrlParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameHandleRendererDebugUrlParams result = new LocalFrameHandleRendererDebugUrlParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
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
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalFrameGetCanonicalUrlForSharingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetCanonicalUrlForSharingParams(int version) {
            super(8, version);
        }

        public LocalFrameGetCanonicalUrlForSharingParams() {
            this(0);
        }

        public static LocalFrameGetCanonicalUrlForSharingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetCanonicalUrlForSharingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetCanonicalUrlForSharingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetCanonicalUrlForSharingParams result = new LocalFrameGetCanonicalUrlForSharingParams(elementsOrVersion);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalFrameGetCanonicalUrlForSharingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url canonicalUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalFrameGetCanonicalUrlForSharingResponseParams(int version) {
            super(16, version);
        }

        public LocalFrameGetCanonicalUrlForSharingResponseParams() {
            this(0);
        }

        public static LocalFrameGetCanonicalUrlForSharingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalFrameGetCanonicalUrlForSharingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalFrameGetCanonicalUrlForSharingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalFrameGetCanonicalUrlForSharingResponseParams result = new LocalFrameGetCanonicalUrlForSharingResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.canonicalUrl = Url.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.canonicalUrl, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetCanonicalUrlForSharingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalFrame.GetCanonicalUrlForSharingResponse mCallback;

        LocalFrameGetCanonicalUrlForSharingResponseParamsForwardToCallback(LocalFrame.GetCanonicalUrlForSharingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(39, 2)) {
                    return false;
                }
                LocalFrameGetCanonicalUrlForSharingResponseParams response = LocalFrameGetCanonicalUrlForSharingResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.canonicalUrl);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalFrameGetCanonicalUrlForSharingResponseParamsProxyToResponder implements LocalFrame.GetCanonicalUrlForSharingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalFrameGetCanonicalUrlForSharingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Url canonicalUrl) {
            LocalFrameGetCanonicalUrlForSharingResponseParams _response = new LocalFrameGetCanonicalUrlForSharingResponseParams();
            _response.canonicalUrl = canonicalUrl;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(39, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
