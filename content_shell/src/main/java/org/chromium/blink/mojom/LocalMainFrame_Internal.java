package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.LocalMainFrame;
import org.chromium.cc.mojom.BrowserControlsState;
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
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.network.mojom.CoopAccessReportType;
import org.chromium.network.mojom.CrossOriginOpenerPolicyReporter;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class LocalMainFrame_Internal {
    private static final int ANIMATE_DOUBLE_TAP_ZOOM_ORDINAL = 0;
    private static final int CLOSE_PAGE_ORDINAL = 2;
    private static final int ENABLE_PREFERRED_SIZE_CHANGED_MODE_ORDINAL = 5;
    private static final int FORWARD_MESSAGE_FROM_HOST_ORDINAL = 9;
    private static final int INSTALL_COOP_ACCESS_MONITOR_ORDINAL = 7;
    public static final Interface.Manager<LocalMainFrame, LocalMainFrame.Proxy> MANAGER = new Interface.Manager<LocalMainFrame, LocalMainFrame.Proxy>() { // from class: org.chromium.blink.mojom.LocalMainFrame_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.LocalMainFrame";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public LocalMainFrame.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, LocalMainFrame impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public LocalMainFrame[] buildArray(int size) {
            return new LocalMainFrame[size];
        }
    };
    private static final int ON_PORTAL_ACTIVATED_ORDINAL = 8;
    private static final int PLUGIN_ACTION_AT_ORDINAL = 3;
    private static final int SET_INITIAL_FOCUS_ORDINAL = 4;
    private static final int SET_SCALE_FACTOR_ORDINAL = 1;
    private static final int UPDATE_BROWSER_CONTROLS_STATE_ORDINAL = 10;
    private static final int ZOOM_TO_FIND_IN_PAGE_RECT_ORDINAL = 6;

    LocalMainFrame_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements LocalMainFrame.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void animateDoubleTapZoom(Point point, Rect rect) {
            LocalMainFrameAnimateDoubleTapZoomParams _message = new LocalMainFrameAnimateDoubleTapZoomParams();
            _message.point = point;
            _message.rect = rect;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void setScaleFactor(float scale) {
            LocalMainFrameSetScaleFactorParams _message = new LocalMainFrameSetScaleFactorParams();
            _message.scale = scale;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void closePage(ClosePageResponse callback) {
            LocalMainFrameClosePageParams _message = new LocalMainFrameClosePageParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new LocalMainFrameClosePageResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void pluginActionAt(Point location, int action) {
            LocalMainFramePluginActionAtParams _message = new LocalMainFramePluginActionAtParams();
            _message.location = location;
            _message.action = action;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void setInitialFocus(boolean reverse) {
            LocalMainFrameSetInitialFocusParams _message = new LocalMainFrameSetInitialFocusParams();
            _message.reverse = reverse;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void enablePreferredSizeChangedMode() {
            LocalMainFrameEnablePreferredSizeChangedModeParams _message = new LocalMainFrameEnablePreferredSizeChangedModeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void zoomToFindInPageRect(Rect rectInRootFrame) {
            LocalMainFrameZoomToFindInPageRectParams _message = new LocalMainFrameZoomToFindInPageRectParams();
            _message.rectInRootFrame = rectInRootFrame;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void installCoopAccessMonitor(int reportType, FrameToken accessedWindow, CrossOriginOpenerPolicyReporter reporter, boolean endpointDefined, String reportedWindowUrl) {
            LocalMainFrameInstallCoopAccessMonitorParams _message = new LocalMainFrameInstallCoopAccessMonitorParams();
            _message.reportType = reportType;
            _message.accessedWindow = accessedWindow;
            _message.reporter = reporter;
            _message.endpointDefined = endpointDefined;
            _message.reportedWindowUrl = reportedWindowUrl;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void onPortalActivated(PortalToken portalToken, AssociatedInterfaceNotSupported portal, AssociatedInterfaceRequestNotSupported portalClient, TransferableMessage data, long traceId, OnPortalActivatedResponse callback) {
            LocalMainFrameOnPortalActivatedParams _message = new LocalMainFrameOnPortalActivatedParams();
            _message.portalToken = portalToken;
            _message.portal = portal;
            _message.portalClient = portalClient;
            _message.data = data;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new LocalMainFrameOnPortalActivatedResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void forwardMessageFromHost(TransferableMessage message, Origin sourceOrigin) {
            LocalMainFrameForwardMessageFromHostParams _message = new LocalMainFrameForwardMessageFromHostParams();
            _message.message = message;
            _message.sourceOrigin = sourceOrigin;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.blink.mojom.LocalMainFrame
        public void updateBrowserControlsState(int constraints, int current, boolean animate) {
            LocalMainFrameUpdateBrowserControlsStateParams _message = new LocalMainFrameUpdateBrowserControlsStateParams();
            _message.constraints = constraints;
            _message.current = current;
            _message.animate = animate;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<LocalMainFrame> {
        Stub(Core core, LocalMainFrame impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(LocalMainFrame_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 2:
                    case 8:
                    default:
                        return false;
                    case 0:
                        LocalMainFrameAnimateDoubleTapZoomParams data = LocalMainFrameAnimateDoubleTapZoomParams.deserialize(messageWithHeader.getPayload());
                        getImpl().animateDoubleTapZoom(data.point, data.rect);
                        return true;
                    case 1:
                        getImpl().setScaleFactor(LocalMainFrameSetScaleFactorParams.deserialize(messageWithHeader.getPayload()).scale);
                        return true;
                    case 3:
                        LocalMainFramePluginActionAtParams data2 = LocalMainFramePluginActionAtParams.deserialize(messageWithHeader.getPayload());
                        getImpl().pluginActionAt(data2.location, data2.action);
                        return true;
                    case 4:
                        getImpl().setInitialFocus(LocalMainFrameSetInitialFocusParams.deserialize(messageWithHeader.getPayload()).reverse);
                        return true;
                    case 5:
                        LocalMainFrameEnablePreferredSizeChangedModeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enablePreferredSizeChangedMode();
                        return true;
                    case 6:
                        getImpl().zoomToFindInPageRect(LocalMainFrameZoomToFindInPageRectParams.deserialize(messageWithHeader.getPayload()).rectInRootFrame);
                        return true;
                    case 7:
                        LocalMainFrameInstallCoopAccessMonitorParams data3 = LocalMainFrameInstallCoopAccessMonitorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().installCoopAccessMonitor(data3.reportType, data3.accessedWindow, data3.reporter, data3.endpointDefined, data3.reportedWindowUrl);
                        return true;
                    case 9:
                        LocalMainFrameForwardMessageFromHostParams data4 = LocalMainFrameForwardMessageFromHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().forwardMessageFromHost(data4.message, data4.sourceOrigin);
                        return true;
                    case 10:
                        LocalMainFrameUpdateBrowserControlsStateParams data5 = LocalMainFrameUpdateBrowserControlsStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateBrowserControlsState(data5.constraints, data5.current, data5.animate);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), LocalMainFrame_Internal.MANAGER, messageWithHeader, receiver);
                    case 2:
                        LocalMainFrameClosePageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().closePage(new LocalMainFrameClosePageResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        LocalMainFrameOnPortalActivatedParams data = LocalMainFrameOnPortalActivatedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onPortalActivated(data.portalToken, data.portal, data.portalClient, data.data, data.traceId, new LocalMainFrameOnPortalActivatedResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class LocalMainFrameAnimateDoubleTapZoomParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Point point;
        public Rect rect;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameAnimateDoubleTapZoomParams(int version) {
            super(24, version);
        }

        public LocalMainFrameAnimateDoubleTapZoomParams() {
            this(0);
        }

        public static LocalMainFrameAnimateDoubleTapZoomParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameAnimateDoubleTapZoomParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameAnimateDoubleTapZoomParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameAnimateDoubleTapZoomParams result = new LocalMainFrameAnimateDoubleTapZoomParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.point = Point.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.rect = Rect.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.point, 8, false);
            encoder0.encode((Struct) this.rect, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameSetScaleFactorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public float scale;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameSetScaleFactorParams(int version) {
            super(16, version);
        }

        public LocalMainFrameSetScaleFactorParams() {
            this(0);
        }

        public static LocalMainFrameSetScaleFactorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameSetScaleFactorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameSetScaleFactorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameSetScaleFactorParams result = new LocalMainFrameSetScaleFactorParams(elementsOrVersion);
                result.scale = decoder0.readFloat(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.scale, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameClosePageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameClosePageParams(int version) {
            super(8, version);
        }

        public LocalMainFrameClosePageParams() {
            this(0);
        }

        public static LocalMainFrameClosePageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameClosePageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameClosePageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameClosePageParams result = new LocalMainFrameClosePageParams(elementsOrVersion);
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
    static final class LocalMainFrameClosePageResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameClosePageResponseParams(int version) {
            super(8, version);
        }

        public LocalMainFrameClosePageResponseParams() {
            this(0);
        }

        public static LocalMainFrameClosePageResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameClosePageResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameClosePageResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameClosePageResponseParams result = new LocalMainFrameClosePageResponseParams(elementsOrVersion);
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
    static class LocalMainFrameClosePageResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalMainFrame.ClosePageResponse mCallback;

        LocalMainFrameClosePageResponseParamsForwardToCallback(LocalMainFrame.ClosePageResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
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
    static class LocalMainFrameClosePageResponseParamsProxyToResponder implements LocalMainFrame.ClosePageResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalMainFrameClosePageResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            LocalMainFrameClosePageResponseParams _response = new LocalMainFrameClosePageResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFramePluginActionAtParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int action;
        public Point location;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFramePluginActionAtParams(int version) {
            super(24, version);
        }

        public LocalMainFramePluginActionAtParams() {
            this(0);
        }

        public static LocalMainFramePluginActionAtParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFramePluginActionAtParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFramePluginActionAtParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFramePluginActionAtParams result = new LocalMainFramePluginActionAtParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.location = Point.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.action = readInt;
                PluginActionType.validate(readInt);
                result.action = PluginActionType.toKnownValue(result.action);
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
            encoder0.encode(this.action, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameSetInitialFocusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean reverse;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameSetInitialFocusParams(int version) {
            super(16, version);
        }

        public LocalMainFrameSetInitialFocusParams() {
            this(0);
        }

        public static LocalMainFrameSetInitialFocusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameSetInitialFocusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameSetInitialFocusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameSetInitialFocusParams result = new LocalMainFrameSetInitialFocusParams(elementsOrVersion);
                result.reverse = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reverse, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameEnablePreferredSizeChangedModeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameEnablePreferredSizeChangedModeParams(int version) {
            super(8, version);
        }

        public LocalMainFrameEnablePreferredSizeChangedModeParams() {
            this(0);
        }

        public static LocalMainFrameEnablePreferredSizeChangedModeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameEnablePreferredSizeChangedModeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameEnablePreferredSizeChangedModeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameEnablePreferredSizeChangedModeParams result = new LocalMainFrameEnablePreferredSizeChangedModeParams(elementsOrVersion);
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
    static final class LocalMainFrameZoomToFindInPageRectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect rectInRootFrame;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameZoomToFindInPageRectParams(int version) {
            super(16, version);
        }

        public LocalMainFrameZoomToFindInPageRectParams() {
            this(0);
        }

        public static LocalMainFrameZoomToFindInPageRectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameZoomToFindInPageRectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameZoomToFindInPageRectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameZoomToFindInPageRectParams result = new LocalMainFrameZoomToFindInPageRectParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.rectInRootFrame = Rect.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.rectInRootFrame, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameInstallCoopAccessMonitorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public FrameToken accessedWindow;
        public boolean endpointDefined;
        public int reportType;
        public String reportedWindowUrl;
        public CrossOriginOpenerPolicyReporter reporter;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameInstallCoopAccessMonitorParams(int version) {
            super(48, version);
        }

        public LocalMainFrameInstallCoopAccessMonitorParams() {
            this(0);
        }

        public static LocalMainFrameInstallCoopAccessMonitorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameInstallCoopAccessMonitorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameInstallCoopAccessMonitorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameInstallCoopAccessMonitorParams result = new LocalMainFrameInstallCoopAccessMonitorParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.reportType = readInt;
                CoopAccessReportType.validate(readInt);
                result.reportType = CoopAccessReportType.toKnownValue(result.reportType);
                result.endpointDefined = decoder0.readBoolean(12, 0);
                result.accessedWindow = FrameToken.decode(decoder0, 16);
                result.reporter = (CrossOriginOpenerPolicyReporter) decoder0.readServiceInterface(32, false, CrossOriginOpenerPolicyReporter.MANAGER);
                result.reportedWindowUrl = decoder0.readString(40, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reportType, 8);
            encoder0.encode(this.endpointDefined, 12, 0);
            encoder0.encode((Union) this.accessedWindow, 16, false);
            encoder0.encode(this.reporter, 32, false,  CrossOriginOpenerPolicyReporter.MANAGER);
            encoder0.encode(this.reportedWindowUrl, 40, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameOnPortalActivatedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public TransferableMessage data;
        public AssociatedInterfaceNotSupported portal;
        public AssociatedInterfaceRequestNotSupported portalClient;
        public PortalToken portalToken;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameOnPortalActivatedParams(int version) {
            super(48, version);
        }

        public LocalMainFrameOnPortalActivatedParams() {
            this(0);
        }

        public static LocalMainFrameOnPortalActivatedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameOnPortalActivatedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameOnPortalActivatedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameOnPortalActivatedParams result = new LocalMainFrameOnPortalActivatedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.portalToken = PortalToken.decode(decoder1);
                result.portal = decoder0.readAssociatedServiceInterfaceNotSupported(16, false);
                result.portalClient = decoder0.readAssociatedInterfaceRequestNotSupported(24, false);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.data = TransferableMessage.decode(decoder12);
                result.traceId = decoder0.readLong(40);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.portalToken, 8, false);
            encoder0.encode(this.portal, 16, false);
            encoder0.encode(this.portalClient, 24, false);
            encoder0.encode((Struct) this.data, 32, false);
            encoder0.encode(this.traceId, 40);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalMainFrameOnPortalActivatedResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameOnPortalActivatedResponseParams(int version) {
            super(16, version);
        }

        public LocalMainFrameOnPortalActivatedResponseParams() {
            this(0);
        }

        public static LocalMainFrameOnPortalActivatedResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameOnPortalActivatedResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameOnPortalActivatedResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameOnPortalActivatedResponseParams result = new LocalMainFrameOnPortalActivatedResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                PortalActivateResult.validate(readInt);
                result.result = PortalActivateResult.toKnownValue(result.result);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalMainFrameOnPortalActivatedResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalMainFrame.OnPortalActivatedResponse mCallback;

        LocalMainFrameOnPortalActivatedResponseParamsForwardToCallback(LocalMainFrame.OnPortalActivatedResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 2)) {
                    return false;
                }
                LocalMainFrameOnPortalActivatedResponseParams response = LocalMainFrameOnPortalActivatedResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalMainFrameOnPortalActivatedResponseParamsProxyToResponder implements LocalMainFrame.OnPortalActivatedResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalMainFrameOnPortalActivatedResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            LocalMainFrameOnPortalActivatedResponseParams _response = new LocalMainFrameOnPortalActivatedResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameForwardMessageFromHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public TransferableMessage message;
        public Origin sourceOrigin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameForwardMessageFromHostParams(int version) {
            super(24, version);
        }

        public LocalMainFrameForwardMessageFromHostParams() {
            this(0);
        }

        public static LocalMainFrameForwardMessageFromHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameForwardMessageFromHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameForwardMessageFromHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameForwardMessageFromHostParams result = new LocalMainFrameForwardMessageFromHostParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.message = TransferableMessage.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.sourceOrigin = Origin.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.message, 8, false);
            encoder0.encode((Struct) this.sourceOrigin, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class LocalMainFrameUpdateBrowserControlsStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean animate;
        public int constraints;
        public int current;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalMainFrameUpdateBrowserControlsStateParams(int version) {
            super(24, version);
        }

        public LocalMainFrameUpdateBrowserControlsStateParams() {
            this(0);
        }

        public static LocalMainFrameUpdateBrowserControlsStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalMainFrameUpdateBrowserControlsStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalMainFrameUpdateBrowserControlsStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalMainFrameUpdateBrowserControlsStateParams result = new LocalMainFrameUpdateBrowserControlsStateParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.constraints = readInt;
                BrowserControlsState.validate(readInt);
                result.constraints = BrowserControlsState.toKnownValue(result.constraints);
                int readInt2 = decoder0.readInt(12);
                result.current = readInt2;
                BrowserControlsState.validate(readInt2);
                result.current = BrowserControlsState.toKnownValue(result.current);
                result.animate = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.constraints, 8);
            encoder0.encode(this.current, 12);
            encoder0.encode(this.animate, 16, 0);
        }
    }
}
