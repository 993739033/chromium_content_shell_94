package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.WidgetInputHandlerHost;
import org.chromium.cc.mojom.TouchAction;
import org.chromium.gfx.mojom.Range;
import org.chromium.gfx.mojom.Rect;
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
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class WidgetInputHandlerHost_Internal {
    private static final int DID_OVERSCROLL_ORDINAL = 1;
    private static final int DID_START_SCROLLING_VIEWPORT_ORDINAL = 2;
    private static final int IME_CANCEL_COMPOSITION_ORDINAL = 3;
    private static final int IME_COMPOSITION_RANGE_CHANGED_ORDINAL = 4;
    public static final Interface.Manager<WidgetInputHandlerHost, WidgetInputHandlerHost.Proxy> MANAGER = new Interface.Manager<WidgetInputHandlerHost, WidgetInputHandlerHost.Proxy>() { // from class: org.chromium.blink.mojom.WidgetInputHandlerHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.WidgetInputHandlerHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public WidgetInputHandlerHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, WidgetInputHandlerHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WidgetInputHandlerHost[] buildArray(int size) {
            return new WidgetInputHandlerHost[size];
        }
    };
    private static final int REQUEST_MOUSE_LOCK_ORDINAL = 6;
    private static final int SET_MOUSE_CAPTURE_ORDINAL = 5;
    private static final int SET_TOUCH_ACTION_FROM_MAIN_ORDINAL = 0;

    WidgetInputHandlerHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements WidgetInputHandlerHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void setTouchActionFromMain(int touchAction) {
            WidgetInputHandlerHostSetTouchActionFromMainParams _message = new WidgetInputHandlerHostSetTouchActionFromMainParams();
            _message.touchAction = touchAction;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void didOverscroll(DidOverscrollParams params) {
            WidgetInputHandlerHostDidOverscrollParams _message = new WidgetInputHandlerHostDidOverscrollParams();
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void didStartScrollingViewport() {
            WidgetInputHandlerHostDidStartScrollingViewportParams _message = new WidgetInputHandlerHostDidStartScrollingViewportParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void imeCancelComposition() {
            WidgetInputHandlerHostImeCancelCompositionParams _message = new WidgetInputHandlerHostImeCancelCompositionParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void imeCompositionRangeChanged(Range range, Rect[] bounds) {
            WidgetInputHandlerHostImeCompositionRangeChangedParams _message = new WidgetInputHandlerHostImeCompositionRangeChangedParams();
            _message.range = range;
            _message.bounds = bounds;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void setMouseCapture(boolean capture) {
            WidgetInputHandlerHostSetMouseCaptureParams _message = new WidgetInputHandlerHostSetMouseCaptureParams();
            _message.capture = capture;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.WidgetInputHandlerHost
        public void requestMouseLock(boolean fromUserGesture, boolean unadjustedMovement, RequestMouseLockResponse callback) {
            WidgetInputHandlerHostRequestMouseLockParams _message = new WidgetInputHandlerHostRequestMouseLockParams();
            _message.fromUserGesture = fromUserGesture;
            _message.unadjustedMovement = unadjustedMovement;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new WidgetInputHandlerHostRequestMouseLockResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<WidgetInputHandlerHost> {
        Stub(Core core, WidgetInputHandlerHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(WidgetInputHandlerHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        WidgetInputHandlerHostSetTouchActionFromMainParams data = WidgetInputHandlerHostSetTouchActionFromMainParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setTouchActionFromMain(data.touchAction);
                        return true;
                    case 1:
                        WidgetInputHandlerHostDidOverscrollParams data2 = WidgetInputHandlerHostDidOverscrollParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didOverscroll(data2.params);
                        return true;
                    case 2:
                        WidgetInputHandlerHostDidStartScrollingViewportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().didStartScrollingViewport();
                        return true;
                    case 3:
                        WidgetInputHandlerHostImeCancelCompositionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().imeCancelComposition();
                        return true;
                    case 4:
                        WidgetInputHandlerHostImeCompositionRangeChangedParams data3 = WidgetInputHandlerHostImeCompositionRangeChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().imeCompositionRangeChanged(data3.range, data3.bounds);
                        return true;
                    case 5:
                        WidgetInputHandlerHostSetMouseCaptureParams data4 = WidgetInputHandlerHostSetMouseCaptureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setMouseCapture(data4.capture);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), WidgetInputHandlerHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 6:
                        WidgetInputHandlerHostRequestMouseLockParams data = WidgetInputHandlerHostRequestMouseLockParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestMouseLock(data.fromUserGesture, data.unadjustedMovement, new WidgetInputHandlerHostRequestMouseLockResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class WidgetInputHandlerHostSetTouchActionFromMainParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int touchAction;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostSetTouchActionFromMainParams(int version) {
            super(16, version);
        }

        public WidgetInputHandlerHostSetTouchActionFromMainParams() {
            this(0);
        }

        public static WidgetInputHandlerHostSetTouchActionFromMainParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostSetTouchActionFromMainParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostSetTouchActionFromMainParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostSetTouchActionFromMainParams result = new WidgetInputHandlerHostSetTouchActionFromMainParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.touchAction = readInt;
                TouchAction.validate(readInt);
                result.touchAction = TouchAction.toKnownValue(result.touchAction);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.touchAction, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class WidgetInputHandlerHostDidOverscrollParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DidOverscrollParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostDidOverscrollParams(int version) {
            super(16, version);
        }

        public WidgetInputHandlerHostDidOverscrollParams() {
            this(0);
        }

        public static WidgetInputHandlerHostDidOverscrollParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostDidOverscrollParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostDidOverscrollParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostDidOverscrollParams result = new WidgetInputHandlerHostDidOverscrollParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = DidOverscrollParams.decode(decoder1);
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
    static final class WidgetInputHandlerHostDidStartScrollingViewportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostDidStartScrollingViewportParams(int version) {
            super(8, version);
        }

        public WidgetInputHandlerHostDidStartScrollingViewportParams() {
            this(0);
        }

        public static WidgetInputHandlerHostDidStartScrollingViewportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostDidStartScrollingViewportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostDidStartScrollingViewportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostDidStartScrollingViewportParams result = new WidgetInputHandlerHostDidStartScrollingViewportParams(elementsOrVersion);
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
    static final class WidgetInputHandlerHostImeCancelCompositionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostImeCancelCompositionParams(int version) {
            super(8, version);
        }

        public WidgetInputHandlerHostImeCancelCompositionParams() {
            this(0);
        }

        public static WidgetInputHandlerHostImeCancelCompositionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostImeCancelCompositionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostImeCancelCompositionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostImeCancelCompositionParams result = new WidgetInputHandlerHostImeCancelCompositionParams(elementsOrVersion);
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
    static final class WidgetInputHandlerHostImeCompositionRangeChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect[] bounds;
        public Range range;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostImeCompositionRangeChangedParams(int version) {
            super(24, version);
        }

        public WidgetInputHandlerHostImeCompositionRangeChangedParams() {
            this(0);
        }

        public static WidgetInputHandlerHostImeCompositionRangeChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostImeCompositionRangeChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostImeCompositionRangeChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostImeCompositionRangeChangedParams result = new WidgetInputHandlerHostImeCompositionRangeChangedParams(elementsOrVersion);
                result.range = Range.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.bounds = new Rect[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.bounds[i1] = Rect.decode(decoder2);
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
            encoder0.encode((Struct) this.range, 8, false);
            Rect[] rectArr = this.bounds;
            if (rectArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(rectArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                Rect[] rectArr2 = this.bounds;
                if (i0 < rectArr2.length) {
                    encoder1.encode((Struct) rectArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class WidgetInputHandlerHostSetMouseCaptureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean capture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostSetMouseCaptureParams(int version) {
            super(16, version);
        }

        public WidgetInputHandlerHostSetMouseCaptureParams() {
            this(0);
        }

        public static WidgetInputHandlerHostSetMouseCaptureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostSetMouseCaptureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostSetMouseCaptureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostSetMouseCaptureParams result = new WidgetInputHandlerHostSetMouseCaptureParams(elementsOrVersion);
                result.capture = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.capture, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class WidgetInputHandlerHostRequestMouseLockParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean fromUserGesture;
        public boolean unadjustedMovement;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostRequestMouseLockParams(int version) {
            super(16, version);
        }

        public WidgetInputHandlerHostRequestMouseLockParams() {
            this(0);
        }

        public static WidgetInputHandlerHostRequestMouseLockParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostRequestMouseLockParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostRequestMouseLockParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostRequestMouseLockParams result = new WidgetInputHandlerHostRequestMouseLockParams(elementsOrVersion);
                result.fromUserGesture = decoder0.readBoolean(8, 0);
                result.unadjustedMovement = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.fromUserGesture, 8, 0);
            encoder0.encode(this.unadjustedMovement, 8, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class WidgetInputHandlerHostRequestMouseLockResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PointerLockContext context;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WidgetInputHandlerHostRequestMouseLockResponseParams(int version) {
            super(24, version);
        }

        public WidgetInputHandlerHostRequestMouseLockResponseParams() {
            this(0);
        }

        public static WidgetInputHandlerHostRequestMouseLockResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WidgetInputHandlerHostRequestMouseLockResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WidgetInputHandlerHostRequestMouseLockResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WidgetInputHandlerHostRequestMouseLockResponseParams result = new WidgetInputHandlerHostRequestMouseLockResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                PointerLockResult.validate(readInt);
                result.result = PointerLockResult.toKnownValue(result.result);
                result.context = (PointerLockContext) decoder0.readServiceInterface(12, true, PointerLockContext.MANAGER);
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
            encoder0.encode(this.context, 12, true,  PointerLockContext.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class WidgetInputHandlerHostRequestMouseLockResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final WidgetInputHandlerHost.RequestMouseLockResponse mCallback;

        WidgetInputHandlerHostRequestMouseLockResponseParamsForwardToCallback(WidgetInputHandlerHost.RequestMouseLockResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                WidgetInputHandlerHostRequestMouseLockResponseParams response = WidgetInputHandlerHostRequestMouseLockResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.context);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class WidgetInputHandlerHostRequestMouseLockResponseParamsProxyToResponder implements WidgetInputHandlerHost.RequestMouseLockResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        WidgetInputHandlerHostRequestMouseLockResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer result, PointerLockContext context) {
            WidgetInputHandlerHostRequestMouseLockResponseParams _response = new WidgetInputHandlerHostRequestMouseLockResponseParams();
            _response.result = result.intValue();
            _response.context = context;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
