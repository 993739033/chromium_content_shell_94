package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.RemoteFrame;
import org.chromium.cc.mojom.RenderFrameMetadata;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.WebSandboxFlags;
import org.chromium.ui.mojom.ScrollGranularity;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.viz.mojom.FrameSinkId;
/* loaded from: classes2.dex */
class RemoteFrame_Internal {
    private static final int ADD_RESOURCE_TIMING_FROM_CHILD_ORDINAL = 18;
    private static final int BUBBLE_LOGICAL_SCROLL_ORDINAL = 12;
    private static final int CHILD_PROCESS_GONE_ORDINAL = 31;
    private static final int COLLAPSE_ORDINAL = 9;
    private static final int DETACH_AND_DISPOSE_ORDINAL = 26;
    private static final int DID_SET_FRAME_POLICY_HEADERS_ORDINAL = 23;
    private static final int DID_START_LOADING_ORDINAL = 20;
    private static final int DID_STOP_LOADING_ORDINAL = 21;
    private static final int DID_UPDATE_FRAME_POLICY_ORDINAL = 24;
    private static final int DID_UPDATE_VISUAL_PROPERTIES_ORDINAL = 29;
    private static final int DISABLE_AUTO_RESIZE_ORDINAL = 28;
    private static final int DISPATCH_LOAD_EVENT_FOR_FRAME_OWNER_ORDINAL = 7;
    private static final int ENABLE_AUTO_RESIZE_ORDINAL = 27;
    private static final int ENFORCE_INSECURE_NAVIGATIONS_SET_ORDINAL = 1;
    private static final int ENFORCE_INSECURE_REQUEST_POLICY_ORDINAL = 3;
    private static final int FOCUS_ORDINAL = 10;
    private static final int INTRINSIC_SIZING_INFO_OF_CHILD_CHANGED_ORDINAL = 22;
    public static final Interface.Manager<RemoteFrame, RemoteFrame.Proxy> MANAGER = new Interface.Manager<RemoteFrame, RemoteFrame.Proxy>() { // from class: org.chromium.blink.mojom.RemoteFrame_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.RemoteFrame";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public RemoteFrame.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RemoteFrame impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RemoteFrame[] buildArray(int size) {
            return new RemoteFrame[size];
        }
    };
    private static final int RENDER_FALLBACK_CONTENT_ORDINAL = 16;
    private static final int RENDER_FALLBACK_CONTENT_WITH_RESOURCE_TIMING_ORDINAL = 17;
    private static final int SCROLL_RECT_TO_VISIBLE_ORDINAL = 19;
    private static final int SET_EMBEDDING_TOKEN_ORDINAL = 14;
    private static final int SET_FRAME_OWNER_PROPERTIES_ORDINAL = 2;
    private static final int SET_FRAME_SINK_ID_ORDINAL = 30;
    private static final int SET_HAD_STICKY_USER_ACTIVATION_BEFORE_NAVIGATION_ORDINAL = 11;
    private static final int SET_NEEDS_OCCLUSION_TRACKING_ORDINAL = 8;
    private static final int SET_PAGE_FOCUS_ORDINAL = 15;
    private static final int SET_REPLICATED_IS_AD_SUBFRAME_ORDINAL = 5;
    private static final int SET_REPLICATED_NAME_ORDINAL = 6;
    private static final int SET_REPLICATED_ORIGIN_ORDINAL = 4;
    private static final int UPDATE_OPENER_ORDINAL = 25;
    private static final int UPDATE_USER_ACTIVATION_STATE_ORDINAL = 13;
    private static final int WILL_ENTER_FULLSCREEN_ORDINAL = 0;

    RemoteFrame_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RemoteFrame.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void willEnterFullscreen(FullscreenOptions options) {
            RemoteFrameWillEnterFullscreenParams _message = new RemoteFrameWillEnterFullscreenParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void enforceInsecureNavigationsSet(int[] set) {
            RemoteFrameEnforceInsecureNavigationsSetParams _message = new RemoteFrameEnforceInsecureNavigationsSetParams();
            _message.set = set;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setFrameOwnerProperties(FrameOwnerProperties properties) {
            RemoteFrameSetFrameOwnerPropertiesParams _message = new RemoteFrameSetFrameOwnerPropertiesParams();
            _message.properties = properties;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void enforceInsecureRequestPolicy(int policy) {
            RemoteFrameEnforceInsecureRequestPolicyParams _message = new RemoteFrameEnforceInsecureRequestPolicyParams();
            _message.policy = policy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setReplicatedOrigin(Origin origin, boolean isPotentiallyTrustworthyUniqueOrigin) {
            RemoteFrameSetReplicatedOriginParams _message = new RemoteFrameSetReplicatedOriginParams();
            _message.origin = origin;
            _message.isPotentiallyTrustworthyUniqueOrigin = isPotentiallyTrustworthyUniqueOrigin;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setReplicatedIsAdSubframe(boolean isAdSubframe) {
            RemoteFrameSetReplicatedIsAdSubframeParams _message = new RemoteFrameSetReplicatedIsAdSubframeParams();
            _message.isAdSubframe = isAdSubframe;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setReplicatedName(String name, String uniqueName) {
            RemoteFrameSetReplicatedNameParams _message = new RemoteFrameSetReplicatedNameParams();
            _message.name = name;
            _message.uniqueName = uniqueName;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void dispatchLoadEventForFrameOwner() {
            RemoteFrameDispatchLoadEventForFrameOwnerParams _message = new RemoteFrameDispatchLoadEventForFrameOwnerParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setNeedsOcclusionTracking(boolean needsTracking) {
            RemoteFrameSetNeedsOcclusionTrackingParams _message = new RemoteFrameSetNeedsOcclusionTrackingParams();
            _message.needsTracking = needsTracking;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void collapse(boolean collapsed) {
            RemoteFrameCollapseParams _message = new RemoteFrameCollapseParams();
            _message.collapsed = collapsed;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void focus() {
            RemoteFrameFocusParams _message = new RemoteFrameFocusParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setHadStickyUserActivationBeforeNavigation(boolean hasGesture) {
            RemoteFrameSetHadStickyUserActivationBeforeNavigationParams _message = new RemoteFrameSetHadStickyUserActivationBeforeNavigationParams();
            _message.hasGesture = hasGesture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void bubbleLogicalScroll(int direction, int granularity) {
            RemoteFrameBubbleLogicalScrollParams _message = new RemoteFrameBubbleLogicalScrollParams();
            _message.direction = direction;
            _message.granularity = granularity;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void updateUserActivationState(int stateUpdateType, int notificationType) {
            RemoteFrameUpdateUserActivationStateParams _message = new RemoteFrameUpdateUserActivationStateParams();
            _message.stateUpdateType = stateUpdateType;
            _message.notificationType = notificationType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setEmbeddingToken(UnguessableToken embeddingToken) {
            RemoteFrameSetEmbeddingTokenParams _message = new RemoteFrameSetEmbeddingTokenParams();
            _message.embeddingToken = embeddingToken;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setPageFocus(boolean isFocused) {
            RemoteFrameSetPageFocusParams _message = new RemoteFrameSetPageFocusParams();
            _message.isFocused = isFocused;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void renderFallbackContent() {
            RemoteFrameRenderFallbackContentParams _message = new RemoteFrameRenderFallbackContentParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void renderFallbackContentWithResourceTiming(ResourceTimingInfo timing, String serverTimingValue) {
            RemoteFrameRenderFallbackContentWithResourceTimingParams _message = new RemoteFrameRenderFallbackContentWithResourceTimingParams();
            _message.timing = timing;
            _message.serverTimingValue = serverTimingValue;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void addResourceTimingFromChild(ResourceTimingInfo timing) {
            RemoteFrameAddResourceTimingFromChildParams _message = new RemoteFrameAddResourceTimingFromChildParams();
            _message.timing = timing;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void scrollRectToVisible(Rect rect, ScrollIntoViewParams params) {
            RemoteFrameScrollRectToVisibleParams _message = new RemoteFrameScrollRectToVisibleParams();
            _message.rect = rect;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void didStartLoading() {
            RemoteFrameDidStartLoadingParams _message = new RemoteFrameDidStartLoadingParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void didStopLoading() {
            RemoteFrameDidStopLoadingParams _message = new RemoteFrameDidStopLoadingParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void intrinsicSizingInfoOfChildChanged(IntrinsicSizingInfo sizingInfo) {
            RemoteFrameIntrinsicSizingInfoOfChildChangedParams _message = new RemoteFrameIntrinsicSizingInfoOfChildChangedParams();
            _message.sizingInfo = sizingInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void didSetFramePolicyHeaders(int sandboxFlags, ParsedPermissionsPolicyDeclaration[] parsedPermissionsPolicy) {
            RemoteFrameDidSetFramePolicyHeadersParams _message = new RemoteFrameDidSetFramePolicyHeadersParams();
            _message.sandboxFlags = sandboxFlags;
            _message.parsedPermissionsPolicy = parsedPermissionsPolicy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void didUpdateFramePolicy(FramePolicy framePolicy) {
            RemoteFrameDidUpdateFramePolicyParams _message = new RemoteFrameDidUpdateFramePolicyParams();
            _message.framePolicy = framePolicy;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void updateOpener(FrameToken openerFrameToken) {
            RemoteFrameUpdateOpenerParams _message = new RemoteFrameUpdateOpenerParams();
            _message.openerFrameToken = openerFrameToken;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void detachAndDispose() {
            RemoteFrameDetachAndDisposeParams _message = new RemoteFrameDetachAndDisposeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(26)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void enableAutoResize(Size minSize, Size maxSize) {
            RemoteFrameEnableAutoResizeParams _message = new RemoteFrameEnableAutoResizeParams();
            _message.minSize = minSize;
            _message.maxSize = maxSize;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(27)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void disableAutoResize() {
            RemoteFrameDisableAutoResizeParams _message = new RemoteFrameDisableAutoResizeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(28)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void didUpdateVisualProperties(RenderFrameMetadata metadata) {
            RemoteFrameDidUpdateVisualPropertiesParams _message = new RemoteFrameDidUpdateVisualPropertiesParams();
            _message.metadata = metadata;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(29)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void setFrameSinkId(FrameSinkId frameSinkId) {
            RemoteFrameSetFrameSinkIdParams _message = new RemoteFrameSetFrameSinkIdParams();
            _message.frameSinkId = frameSinkId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(30)));
        }

        @Override // org.chromium.blink.mojom.RemoteFrame
        public void childProcessGone() {
            RemoteFrameChildProcessGoneParams _message = new RemoteFrameChildProcessGoneParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(31)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RemoteFrame> {
        Stub(Core core, RemoteFrame impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RemoteFrame_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        RemoteFrameWillEnterFullscreenParams data = RemoteFrameWillEnterFullscreenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().willEnterFullscreen(data.options);
                        return true;
                    case 1:
                        RemoteFrameEnforceInsecureNavigationsSetParams data2 = RemoteFrameEnforceInsecureNavigationsSetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enforceInsecureNavigationsSet(data2.set);
                        return true;
                    case 2:
                        RemoteFrameSetFrameOwnerPropertiesParams data3 = RemoteFrameSetFrameOwnerPropertiesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setFrameOwnerProperties(data3.properties);
                        return true;
                    case 3:
                        RemoteFrameEnforceInsecureRequestPolicyParams data4 = RemoteFrameEnforceInsecureRequestPolicyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enforceInsecureRequestPolicy(data4.policy);
                        return true;
                    case 4:
                        RemoteFrameSetReplicatedOriginParams data5 = RemoteFrameSetReplicatedOriginParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setReplicatedOrigin(data5.origin, data5.isPotentiallyTrustworthyUniqueOrigin);
                        return true;
                    case 5:
                        RemoteFrameSetReplicatedIsAdSubframeParams data6 = RemoteFrameSetReplicatedIsAdSubframeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setReplicatedIsAdSubframe(data6.isAdSubframe);
                        return true;
                    case 6:
                        RemoteFrameSetReplicatedNameParams data7 = RemoteFrameSetReplicatedNameParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setReplicatedName(data7.name, data7.uniqueName);
                        return true;
                    case 7:
                        RemoteFrameDispatchLoadEventForFrameOwnerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().dispatchLoadEventForFrameOwner();
                        return true;
                    case 8:
                        RemoteFrameSetNeedsOcclusionTrackingParams data8 = RemoteFrameSetNeedsOcclusionTrackingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setNeedsOcclusionTracking(data8.needsTracking);
                        return true;
                    case 9:
                        RemoteFrameCollapseParams data9 = RemoteFrameCollapseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().collapse(data9.collapsed);
                        return true;
                    case 10:
                        RemoteFrameFocusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().focus();
                        return true;
                    case 11:
                        RemoteFrameSetHadStickyUserActivationBeforeNavigationParams data10 = RemoteFrameSetHadStickyUserActivationBeforeNavigationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setHadStickyUserActivationBeforeNavigation(data10.hasGesture);
                        return true;
                    case 12:
                        RemoteFrameBubbleLogicalScrollParams data11 = RemoteFrameBubbleLogicalScrollParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bubbleLogicalScroll(data11.direction, data11.granularity);
                        return true;
                    case 13:
                        RemoteFrameUpdateUserActivationStateParams data12 = RemoteFrameUpdateUserActivationStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateUserActivationState(data12.stateUpdateType, data12.notificationType);
                        return true;
                    case 14:
                        RemoteFrameSetEmbeddingTokenParams data13 = RemoteFrameSetEmbeddingTokenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setEmbeddingToken(data13.embeddingToken);
                        return true;
                    case 15:
                        RemoteFrameSetPageFocusParams data14 = RemoteFrameSetPageFocusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setPageFocus(data14.isFocused);
                        return true;
                    case 16:
                        RemoteFrameRenderFallbackContentParams.deserialize(messageWithHeader.getPayload());
                        getImpl().renderFallbackContent();
                        return true;
                    case 17:
                        RemoteFrameRenderFallbackContentWithResourceTimingParams data15 = RemoteFrameRenderFallbackContentWithResourceTimingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().renderFallbackContentWithResourceTiming(data15.timing, data15.serverTimingValue);
                        return true;
                    case 18:
                        RemoteFrameAddResourceTimingFromChildParams data16 = RemoteFrameAddResourceTimingFromChildParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addResourceTimingFromChild(data16.timing);
                        return true;
                    case 19:
                        RemoteFrameScrollRectToVisibleParams data17 = RemoteFrameScrollRectToVisibleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().scrollRectToVisible(data17.rect, data17.params);
                        return true;
                    case 20:
                        RemoteFrameDidStartLoadingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didStartLoading();
                        return true;
                    case 21:
                        RemoteFrameDidStopLoadingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didStopLoading();
                        return true;
                    case 22:
                        RemoteFrameIntrinsicSizingInfoOfChildChangedParams data18 = RemoteFrameIntrinsicSizingInfoOfChildChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().intrinsicSizingInfoOfChildChanged(data18.sizingInfo);
                        return true;
                    case 23:
                        RemoteFrameDidSetFramePolicyHeadersParams data19 = RemoteFrameDidSetFramePolicyHeadersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didSetFramePolicyHeaders(data19.sandboxFlags, data19.parsedPermissionsPolicy);
                        return true;
                    case 24:
                        RemoteFrameDidUpdateFramePolicyParams data20 = RemoteFrameDidUpdateFramePolicyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didUpdateFramePolicy(data20.framePolicy);
                        return true;
                    case 25:
                        RemoteFrameUpdateOpenerParams data21 = RemoteFrameUpdateOpenerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateOpener(data21.openerFrameToken);
                        return true;
                    case 26:
                        RemoteFrameDetachAndDisposeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().detachAndDispose();
                        return true;
                    case 27:
                        RemoteFrameEnableAutoResizeParams data22 = RemoteFrameEnableAutoResizeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enableAutoResize(data22.minSize, data22.maxSize);
                        return true;
                    case 28:
                        RemoteFrameDisableAutoResizeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().disableAutoResize();
                        return true;
                    case 29:
                        RemoteFrameDidUpdateVisualPropertiesParams data23 = RemoteFrameDidUpdateVisualPropertiesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didUpdateVisualProperties(data23.metadata);
                        return true;
                    case 30:
                        RemoteFrameSetFrameSinkIdParams data24 = RemoteFrameSetFrameSinkIdParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setFrameSinkId(data24.frameSinkId);
                        return true;
                    case 31:
                        RemoteFrameChildProcessGoneParams.deserialize(messageWithHeader.getPayload());
                        getImpl().childProcessGone();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RemoteFrame_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class RemoteFrameWillEnterFullscreenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FullscreenOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameWillEnterFullscreenParams(int version) {
            super(16, version);
        }

        public RemoteFrameWillEnterFullscreenParams() {
            this(0);
        }

        public static RemoteFrameWillEnterFullscreenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameWillEnterFullscreenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameWillEnterFullscreenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameWillEnterFullscreenParams result = new RemoteFrameWillEnterFullscreenParams(elementsOrVersion);
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

    /* loaded from: classes2.dex */
    static final class RemoteFrameEnforceInsecureNavigationsSetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int[] set;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameEnforceInsecureNavigationsSetParams(int version) {
            super(16, version);
        }

        public RemoteFrameEnforceInsecureNavigationsSetParams() {
            this(0);
        }

        public static RemoteFrameEnforceInsecureNavigationsSetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameEnforceInsecureNavigationsSetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameEnforceInsecureNavigationsSetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameEnforceInsecureNavigationsSetParams result = new RemoteFrameEnforceInsecureNavigationsSetParams(elementsOrVersion);
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
    static final class RemoteFrameSetFrameOwnerPropertiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameOwnerProperties properties;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetFrameOwnerPropertiesParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetFrameOwnerPropertiesParams() {
            this(0);
        }

        public static RemoteFrameSetFrameOwnerPropertiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetFrameOwnerPropertiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetFrameOwnerPropertiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetFrameOwnerPropertiesParams result = new RemoteFrameSetFrameOwnerPropertiesParams(elementsOrVersion);
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
    static final class RemoteFrameEnforceInsecureRequestPolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int policy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameEnforceInsecureRequestPolicyParams(int version) {
            super(16, version);
        }

        public RemoteFrameEnforceInsecureRequestPolicyParams() {
            this(0);
        }

        public static RemoteFrameEnforceInsecureRequestPolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameEnforceInsecureRequestPolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameEnforceInsecureRequestPolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameEnforceInsecureRequestPolicyParams result = new RemoteFrameEnforceInsecureRequestPolicyParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.policy = readInt;
                InsecureRequestPolicy.validate(readInt);
                result.policy = InsecureRequestPolicy.toKnownValue(result.policy);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.policy, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetReplicatedOriginParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isPotentiallyTrustworthyUniqueOrigin;
        public Origin origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetReplicatedOriginParams(int version) {
            super(24, version);
        }

        public RemoteFrameSetReplicatedOriginParams() {
            this(0);
        }

        public static RemoteFrameSetReplicatedOriginParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetReplicatedOriginParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetReplicatedOriginParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetReplicatedOriginParams result = new RemoteFrameSetReplicatedOriginParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                result.isPotentiallyTrustworthyUniqueOrigin = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
            encoder0.encode(this.isPotentiallyTrustworthyUniqueOrigin, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetReplicatedIsAdSubframeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isAdSubframe;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetReplicatedIsAdSubframeParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetReplicatedIsAdSubframeParams() {
            this(0);
        }

        public static RemoteFrameSetReplicatedIsAdSubframeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetReplicatedIsAdSubframeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetReplicatedIsAdSubframeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetReplicatedIsAdSubframeParams result = new RemoteFrameSetReplicatedIsAdSubframeParams(elementsOrVersion);
                result.isAdSubframe = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isAdSubframe, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetReplicatedNameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;
        public String uniqueName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetReplicatedNameParams(int version) {
            super(24, version);
        }

        public RemoteFrameSetReplicatedNameParams() {
            this(0);
        }

        public static RemoteFrameSetReplicatedNameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetReplicatedNameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetReplicatedNameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetReplicatedNameParams result = new RemoteFrameSetReplicatedNameParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                result.uniqueName = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
            encoder0.encode(this.uniqueName, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameDispatchLoadEventForFrameOwnerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDispatchLoadEventForFrameOwnerParams(int version) {
            super(8, version);
        }

        public RemoteFrameDispatchLoadEventForFrameOwnerParams() {
            this(0);
        }

        public static RemoteFrameDispatchLoadEventForFrameOwnerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDispatchLoadEventForFrameOwnerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDispatchLoadEventForFrameOwnerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDispatchLoadEventForFrameOwnerParams result = new RemoteFrameDispatchLoadEventForFrameOwnerParams(elementsOrVersion);
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
    static final class RemoteFrameSetNeedsOcclusionTrackingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean needsTracking;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetNeedsOcclusionTrackingParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetNeedsOcclusionTrackingParams() {
            this(0);
        }

        public static RemoteFrameSetNeedsOcclusionTrackingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetNeedsOcclusionTrackingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetNeedsOcclusionTrackingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetNeedsOcclusionTrackingParams result = new RemoteFrameSetNeedsOcclusionTrackingParams(elementsOrVersion);
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
    static final class RemoteFrameCollapseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean collapsed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameCollapseParams(int version) {
            super(16, version);
        }

        public RemoteFrameCollapseParams() {
            this(0);
        }

        public static RemoteFrameCollapseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameCollapseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameCollapseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameCollapseParams result = new RemoteFrameCollapseParams(elementsOrVersion);
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
    static final class RemoteFrameFocusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameFocusParams(int version) {
            super(8, version);
        }

        public RemoteFrameFocusParams() {
            this(0);
        }

        public static RemoteFrameFocusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameFocusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameFocusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameFocusParams result = new RemoteFrameFocusParams(elementsOrVersion);
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
    static final class RemoteFrameSetHadStickyUserActivationBeforeNavigationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean hasGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetHadStickyUserActivationBeforeNavigationParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetHadStickyUserActivationBeforeNavigationParams() {
            this(0);
        }

        public static RemoteFrameSetHadStickyUserActivationBeforeNavigationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetHadStickyUserActivationBeforeNavigationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetHadStickyUserActivationBeforeNavigationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetHadStickyUserActivationBeforeNavigationParams result = new RemoteFrameSetHadStickyUserActivationBeforeNavigationParams(elementsOrVersion);
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
    static final class RemoteFrameBubbleLogicalScrollParams extends Struct {
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

        private RemoteFrameBubbleLogicalScrollParams(int version) {
            super(16, version);
        }

        public RemoteFrameBubbleLogicalScrollParams() {
            this(0);
        }

        public static RemoteFrameBubbleLogicalScrollParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameBubbleLogicalScrollParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameBubbleLogicalScrollParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameBubbleLogicalScrollParams result = new RemoteFrameBubbleLogicalScrollParams(elementsOrVersion);
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
    static final class RemoteFrameUpdateUserActivationStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int notificationType;
        public int stateUpdateType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameUpdateUserActivationStateParams(int version) {
            super(16, version);
        }

        public RemoteFrameUpdateUserActivationStateParams() {
            this(0);
        }

        public static RemoteFrameUpdateUserActivationStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameUpdateUserActivationStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameUpdateUserActivationStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameUpdateUserActivationStateParams result = new RemoteFrameUpdateUserActivationStateParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.stateUpdateType = readInt;
                UserActivationUpdateType.validate(readInt);
                result.stateUpdateType = UserActivationUpdateType.toKnownValue(result.stateUpdateType);
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
            encoder0.encode(this.stateUpdateType, 8);
            encoder0.encode(this.notificationType, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetEmbeddingTokenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken embeddingToken;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetEmbeddingTokenParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetEmbeddingTokenParams() {
            this(0);
        }

        public static RemoteFrameSetEmbeddingTokenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetEmbeddingTokenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetEmbeddingTokenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetEmbeddingTokenParams result = new RemoteFrameSetEmbeddingTokenParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.embeddingToken = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.embeddingToken, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetPageFocusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isFocused;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetPageFocusParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetPageFocusParams() {
            this(0);
        }

        public static RemoteFrameSetPageFocusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetPageFocusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetPageFocusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetPageFocusParams result = new RemoteFrameSetPageFocusParams(elementsOrVersion);
                result.isFocused = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isFocused, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameRenderFallbackContentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameRenderFallbackContentParams(int version) {
            super(8, version);
        }

        public RemoteFrameRenderFallbackContentParams() {
            this(0);
        }

        public static RemoteFrameRenderFallbackContentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameRenderFallbackContentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameRenderFallbackContentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameRenderFallbackContentParams result = new RemoteFrameRenderFallbackContentParams(elementsOrVersion);
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
    static final class RemoteFrameRenderFallbackContentWithResourceTimingParams extends Struct {
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

        private RemoteFrameRenderFallbackContentWithResourceTimingParams(int version) {
            super(24, version);
        }

        public RemoteFrameRenderFallbackContentWithResourceTimingParams() {
            this(0);
        }

        public static RemoteFrameRenderFallbackContentWithResourceTimingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameRenderFallbackContentWithResourceTimingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameRenderFallbackContentWithResourceTimingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameRenderFallbackContentWithResourceTimingParams result = new RemoteFrameRenderFallbackContentWithResourceTimingParams(elementsOrVersion);
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
    static final class RemoteFrameAddResourceTimingFromChildParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ResourceTimingInfo timing;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameAddResourceTimingFromChildParams(int version) {
            super(16, version);
        }

        public RemoteFrameAddResourceTimingFromChildParams() {
            this(0);
        }

        public static RemoteFrameAddResourceTimingFromChildParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameAddResourceTimingFromChildParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameAddResourceTimingFromChildParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameAddResourceTimingFromChildParams result = new RemoteFrameAddResourceTimingFromChildParams(elementsOrVersion);
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
    static final class RemoteFrameScrollRectToVisibleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ScrollIntoViewParams params;
        public Rect rect;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameScrollRectToVisibleParams(int version) {
            super(24, version);
        }

        public RemoteFrameScrollRectToVisibleParams() {
            this(0);
        }

        public static RemoteFrameScrollRectToVisibleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameScrollRectToVisibleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameScrollRectToVisibleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameScrollRectToVisibleParams result = new RemoteFrameScrollRectToVisibleParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.rect = Rect.decode(decoder1);
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
            encoder0.encode((Struct) this.rect, 8, false);
            encoder0.encode((Struct) this.params, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameDidStartLoadingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDidStartLoadingParams(int version) {
            super(8, version);
        }

        public RemoteFrameDidStartLoadingParams() {
            this(0);
        }

        public static RemoteFrameDidStartLoadingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDidStartLoadingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDidStartLoadingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDidStartLoadingParams result = new RemoteFrameDidStartLoadingParams(elementsOrVersion);
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
    static final class RemoteFrameDidStopLoadingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDidStopLoadingParams(int version) {
            super(8, version);
        }

        public RemoteFrameDidStopLoadingParams() {
            this(0);
        }

        public static RemoteFrameDidStopLoadingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDidStopLoadingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDidStopLoadingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDidStopLoadingParams result = new RemoteFrameDidStopLoadingParams(elementsOrVersion);
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
    static final class RemoteFrameIntrinsicSizingInfoOfChildChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public IntrinsicSizingInfo sizingInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameIntrinsicSizingInfoOfChildChangedParams(int version) {
            super(16, version);
        }

        public RemoteFrameIntrinsicSizingInfoOfChildChangedParams() {
            this(0);
        }

        public static RemoteFrameIntrinsicSizingInfoOfChildChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameIntrinsicSizingInfoOfChildChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameIntrinsicSizingInfoOfChildChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameIntrinsicSizingInfoOfChildChangedParams result = new RemoteFrameIntrinsicSizingInfoOfChildChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.sizingInfo = IntrinsicSizingInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.sizingInfo, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameDidSetFramePolicyHeadersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ParsedPermissionsPolicyDeclaration[] parsedPermissionsPolicy;
        public int sandboxFlags;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDidSetFramePolicyHeadersParams(int version) {
            super(24, version);
        }

        public RemoteFrameDidSetFramePolicyHeadersParams() {
            this(0);
        }

        public static RemoteFrameDidSetFramePolicyHeadersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDidSetFramePolicyHeadersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDidSetFramePolicyHeadersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDidSetFramePolicyHeadersParams result = new RemoteFrameDidSetFramePolicyHeadersParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.sandboxFlags = readInt;
                WebSandboxFlags.validate(readInt);
                result.sandboxFlags = WebSandboxFlags.toKnownValue(result.sandboxFlags);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.parsedPermissionsPolicy = new ParsedPermissionsPolicyDeclaration[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.parsedPermissionsPolicy[i1] = ParsedPermissionsPolicyDeclaration.decode(decoder2);
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
            encoder0.encode(this.sandboxFlags, 8);
            ParsedPermissionsPolicyDeclaration[] parsedPermissionsPolicyDeclarationArr = this.parsedPermissionsPolicy;
            if (parsedPermissionsPolicyDeclarationArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(parsedPermissionsPolicyDeclarationArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ParsedPermissionsPolicyDeclaration[] parsedPermissionsPolicyDeclarationArr2 = this.parsedPermissionsPolicy;
                if (i0 < parsedPermissionsPolicyDeclarationArr2.length) {
                    encoder1.encode((Struct) parsedPermissionsPolicyDeclarationArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameDidUpdateFramePolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FramePolicy framePolicy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDidUpdateFramePolicyParams(int version) {
            super(16, version);
        }

        public RemoteFrameDidUpdateFramePolicyParams() {
            this(0);
        }

        public static RemoteFrameDidUpdateFramePolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDidUpdateFramePolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDidUpdateFramePolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDidUpdateFramePolicyParams result = new RemoteFrameDidUpdateFramePolicyParams(elementsOrVersion);
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
    static final class RemoteFrameUpdateOpenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameToken openerFrameToken;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameUpdateOpenerParams(int version) {
            super(24, version);
        }

        public RemoteFrameUpdateOpenerParams() {
            this(0);
        }

        public static RemoteFrameUpdateOpenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameUpdateOpenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameUpdateOpenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameUpdateOpenerParams result = new RemoteFrameUpdateOpenerParams(elementsOrVersion);
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
    static final class RemoteFrameDetachAndDisposeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDetachAndDisposeParams(int version) {
            super(8, version);
        }

        public RemoteFrameDetachAndDisposeParams() {
            this(0);
        }

        public static RemoteFrameDetachAndDisposeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDetachAndDisposeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDetachAndDisposeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDetachAndDisposeParams result = new RemoteFrameDetachAndDisposeParams(elementsOrVersion);
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
    static final class RemoteFrameEnableAutoResizeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Size maxSize;
        public Size minSize;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameEnableAutoResizeParams(int version) {
            super(24, version);
        }

        public RemoteFrameEnableAutoResizeParams() {
            this(0);
        }

        public static RemoteFrameEnableAutoResizeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameEnableAutoResizeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameEnableAutoResizeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameEnableAutoResizeParams result = new RemoteFrameEnableAutoResizeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.minSize = Size.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.maxSize = Size.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.minSize, 8, false);
            encoder0.encode((Struct) this.maxSize, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameDisableAutoResizeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDisableAutoResizeParams(int version) {
            super(8, version);
        }

        public RemoteFrameDisableAutoResizeParams() {
            this(0);
        }

        public static RemoteFrameDisableAutoResizeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDisableAutoResizeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDisableAutoResizeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDisableAutoResizeParams result = new RemoteFrameDisableAutoResizeParams(elementsOrVersion);
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
    static final class RemoteFrameDidUpdateVisualPropertiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public RenderFrameMetadata metadata;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameDidUpdateVisualPropertiesParams(int version) {
            super(16, version);
        }

        public RemoteFrameDidUpdateVisualPropertiesParams() {
            this(0);
        }

        public static RemoteFrameDidUpdateVisualPropertiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameDidUpdateVisualPropertiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameDidUpdateVisualPropertiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameDidUpdateVisualPropertiesParams result = new RemoteFrameDidUpdateVisualPropertiesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.metadata = RenderFrameMetadata.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.metadata, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameSetFrameSinkIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameSinkId frameSinkId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameSetFrameSinkIdParams(int version) {
            super(16, version);
        }

        public RemoteFrameSetFrameSinkIdParams() {
            this(0);
        }

        public static RemoteFrameSetFrameSinkIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameSetFrameSinkIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameSetFrameSinkIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameSetFrameSinkIdParams result = new RemoteFrameSetFrameSinkIdParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.frameSinkId = FrameSinkId.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.frameSinkId, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RemoteFrameChildProcessGoneParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RemoteFrameChildProcessGoneParams(int version) {
            super(8, version);
        }

        public RemoteFrameChildProcessGoneParams() {
            this(0);
        }

        public static RemoteFrameChildProcessGoneParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RemoteFrameChildProcessGoneParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RemoteFrameChildProcessGoneParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RemoteFrameChildProcessGoneParams result = new RemoteFrameChildProcessGoneParams(elementsOrVersion);
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
}
