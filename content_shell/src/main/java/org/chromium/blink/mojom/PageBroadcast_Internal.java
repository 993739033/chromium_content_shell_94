package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PageBroadcast;
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
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.skia.mojom.SkColor;
/* loaded from: classes2.dex */
class PageBroadcast_Internal {
    private static final int ACTIVATE_PRERENDERED_PAGE_ORDINAL = 2;
    private static final int AUDIO_STATE_CHANGED_ORDINAL = 1;
    public static final Interface.Manager<PageBroadcast, PageBroadcast.Proxy> MANAGER = new Interface.Manager<PageBroadcast, PageBroadcast.Proxy>() { // from class: org.chromium.blink.mojom.PageBroadcast_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PageBroadcast";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PageBroadcast.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PageBroadcast impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PageBroadcast[] buildArray(int size) {
            return new PageBroadcast[size];
        }
    };
    private static final int SET_HISTORY_OFFSET_AND_LENGTH_ORDINAL = 6;
    private static final int SET_INSIDE_PORTAL_ORDINAL = 3;
    private static final int SET_PAGE_BASE_BACKGROUND_COLOR_ORDINAL = 7;
    private static final int SET_PAGE_LIFECYCLE_STATE_ORDINAL = 0;
    private static final int UPDATE_RENDERER_PREFERENCES_ORDINAL = 5;
    private static final int UPDATE_WEB_PREFERENCES_ORDINAL = 4;

    PageBroadcast_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PageBroadcast.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void setPageLifecycleState(PageLifecycleState state, PageRestoreParams pageRestoreParams, SetPageLifecycleStateResponse callback) {
            PageBroadcastSetPageLifecycleStateParams _message = new PageBroadcastSetPageLifecycleStateParams();
            _message.state = state;
            _message.pageRestoreParams = pageRestoreParams;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void audioStateChanged(boolean isAudioPlaying) {
            PageBroadcastAudioStateChangedParams _message = new PageBroadcastAudioStateChangedParams();
            _message.isAudioPlaying = isAudioPlaying;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void activatePrerenderedPage(TimeTicks activationStart, ActivatePrerenderedPageResponse callback) {
            PageBroadcastActivatePrerenderedPageParams _message = new PageBroadcastActivatePrerenderedPageParams();
            _message.activationStart = activationStart;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new PageBroadcastActivatePrerenderedPageResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void setInsidePortal(boolean isInsidePortal) {
            PageBroadcastSetInsidePortalParams _message = new PageBroadcastSetInsidePortalParams();
            _message.isInsidePortal = isInsidePortal;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void updateWebPreferences(WebPreferences preferences) {
            PageBroadcastUpdateWebPreferencesParams _message = new PageBroadcastUpdateWebPreferencesParams();
            _message.preferences = preferences;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void updateRendererPreferences(RendererPreferences preferences) {
            PageBroadcastUpdateRendererPreferencesParams _message = new PageBroadcastUpdateRendererPreferencesParams();
            _message.preferences = preferences;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void setHistoryOffsetAndLength(int offset, int length) {
            PageBroadcastSetHistoryOffsetAndLengthParams _message = new PageBroadcastSetHistoryOffsetAndLengthParams();
            _message.offset = offset;
            _message.length = length;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.PageBroadcast
        public void setPageBaseBackgroundColor(SkColor color) {
            PageBroadcastSetPageBaseBackgroundColorParams _message = new PageBroadcastSetPageBaseBackgroundColorParams();
            _message.color = color;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PageBroadcast> {
        Stub(Core core, PageBroadcast impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PageBroadcast_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 0:
                    case 2:
                    default:
                        return false;
                    case 1:
                        PageBroadcastAudioStateChangedParams data = PageBroadcastAudioStateChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().audioStateChanged(data.isAudioPlaying);
                        return true;
                    case 3:
                        PageBroadcastSetInsidePortalParams data2 = PageBroadcastSetInsidePortalParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setInsidePortal(data2.isInsidePortal);
                        return true;
                    case 4:
                        PageBroadcastUpdateWebPreferencesParams data3 = PageBroadcastUpdateWebPreferencesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateWebPreferences(data3.preferences);
                        return true;
                    case 5:
                        PageBroadcastUpdateRendererPreferencesParams data4 = PageBroadcastUpdateRendererPreferencesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateRendererPreferences(data4.preferences);
                        return true;
                    case 6:
                        PageBroadcastSetHistoryOffsetAndLengthParams data5 = PageBroadcastSetHistoryOffsetAndLengthParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setHistoryOffsetAndLength(data5.offset, data5.length);
                        return true;
                    case 7:
                        PageBroadcastSetPageBaseBackgroundColorParams data6 = PageBroadcastSetPageBaseBackgroundColorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setPageBaseBackgroundColor(data6.color);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PageBroadcast_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        PageBroadcastSetPageLifecycleStateParams data = PageBroadcastSetPageLifecycleStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setPageLifecycleState(data.state, data.pageRestoreParams, new PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                    default:
                        return false;
                    case 2:
                        getImpl().activatePrerenderedPage(PageBroadcastActivatePrerenderedPageParams.deserialize(messageWithHeader.getPayload()).activationStart, new PageBroadcastActivatePrerenderedPageResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastSetPageLifecycleStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PageRestoreParams pageRestoreParams;
        public PageLifecycleState state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastSetPageLifecycleStateParams(int version) {
            super(24, version);
        }

        public PageBroadcastSetPageLifecycleStateParams() {
            this(0);
        }

        public static PageBroadcastSetPageLifecycleStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastSetPageLifecycleStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastSetPageLifecycleStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastSetPageLifecycleStateParams result = new PageBroadcastSetPageLifecycleStateParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.state = PageLifecycleState.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, true);
                result.pageRestoreParams = PageRestoreParams.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.state, 8, false);
            encoder0.encode((Struct) this.pageRestoreParams, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastSetPageLifecycleStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastSetPageLifecycleStateResponseParams(int version) {
            super(8, version);
        }

        public PageBroadcastSetPageLifecycleStateResponseParams() {
            this(0);
        }

        public static PageBroadcastSetPageLifecycleStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastSetPageLifecycleStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastSetPageLifecycleStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastSetPageLifecycleStateResponseParams result = new PageBroadcastSetPageLifecycleStateResponseParams(elementsOrVersion);
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
    static class PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PageBroadcast.SetPageLifecycleStateResponse mCallback;

        PageBroadcastSetPageLifecycleStateResponseParamsForwardToCallback(PageBroadcast.SetPageLifecycleStateResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder implements PageBroadcast.SetPageLifecycleStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PageBroadcastSetPageLifecycleStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            PageBroadcastSetPageLifecycleStateResponseParams _response = new PageBroadcastSetPageLifecycleStateResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastAudioStateChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isAudioPlaying;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastAudioStateChangedParams(int version) {
            super(16, version);
        }

        public PageBroadcastAudioStateChangedParams() {
            this(0);
        }

        public static PageBroadcastAudioStateChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastAudioStateChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastAudioStateChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastAudioStateChangedParams result = new PageBroadcastAudioStateChangedParams(elementsOrVersion);
                result.isAudioPlaying = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isAudioPlaying, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastActivatePrerenderedPageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeTicks activationStart;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastActivatePrerenderedPageParams(int version) {
            super(16, version);
        }

        public PageBroadcastActivatePrerenderedPageParams() {
            this(0);
        }

        public static PageBroadcastActivatePrerenderedPageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastActivatePrerenderedPageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastActivatePrerenderedPageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastActivatePrerenderedPageParams result = new PageBroadcastActivatePrerenderedPageParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.activationStart = TimeTicks.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.activationStart, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastActivatePrerenderedPageResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastActivatePrerenderedPageResponseParams(int version) {
            super(8, version);
        }

        public PageBroadcastActivatePrerenderedPageResponseParams() {
            this(0);
        }

        public static PageBroadcastActivatePrerenderedPageResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastActivatePrerenderedPageResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastActivatePrerenderedPageResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastActivatePrerenderedPageResponseParams result = new PageBroadcastActivatePrerenderedPageResponseParams(elementsOrVersion);
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
    static class PageBroadcastActivatePrerenderedPageResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PageBroadcast.ActivatePrerenderedPageResponse mCallback;

        PageBroadcastActivatePrerenderedPageResponseParamsForwardToCallback(PageBroadcast.ActivatePrerenderedPageResponse callback) {
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
    static class PageBroadcastActivatePrerenderedPageResponseParamsProxyToResponder implements PageBroadcast.ActivatePrerenderedPageResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PageBroadcastActivatePrerenderedPageResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            PageBroadcastActivatePrerenderedPageResponseParams _response = new PageBroadcastActivatePrerenderedPageResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastSetInsidePortalParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isInsidePortal;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastSetInsidePortalParams(int version) {
            super(16, version);
        }

        public PageBroadcastSetInsidePortalParams() {
            this(0);
        }

        public static PageBroadcastSetInsidePortalParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastSetInsidePortalParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastSetInsidePortalParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastSetInsidePortalParams result = new PageBroadcastSetInsidePortalParams(elementsOrVersion);
                result.isInsidePortal = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isInsidePortal, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastUpdateWebPreferencesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public WebPreferences preferences;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastUpdateWebPreferencesParams(int version) {
            super(16, version);
        }

        public PageBroadcastUpdateWebPreferencesParams() {
            this(0);
        }

        public static PageBroadcastUpdateWebPreferencesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastUpdateWebPreferencesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastUpdateWebPreferencesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastUpdateWebPreferencesParams result = new PageBroadcastUpdateWebPreferencesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.preferences = WebPreferences.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.preferences, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastUpdateRendererPreferencesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public RendererPreferences preferences;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastUpdateRendererPreferencesParams(int version) {
            super(16, version);
        }

        public PageBroadcastUpdateRendererPreferencesParams() {
            this(0);
        }

        public static PageBroadcastUpdateRendererPreferencesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastUpdateRendererPreferencesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastUpdateRendererPreferencesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastUpdateRendererPreferencesParams result = new PageBroadcastUpdateRendererPreferencesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.preferences = RendererPreferences.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.preferences, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastSetHistoryOffsetAndLengthParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int length;
        public int offset;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastSetHistoryOffsetAndLengthParams(int version) {
            super(16, version);
        }

        public PageBroadcastSetHistoryOffsetAndLengthParams() {
            this(0);
        }

        public static PageBroadcastSetHistoryOffsetAndLengthParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastSetHistoryOffsetAndLengthParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastSetHistoryOffsetAndLengthParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastSetHistoryOffsetAndLengthParams result = new PageBroadcastSetHistoryOffsetAndLengthParams(elementsOrVersion);
                result.offset = decoder0.readInt(8);
                result.length = decoder0.readInt(12);
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
            encoder0.encode(this.length, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class PageBroadcastSetPageBaseBackgroundColorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SkColor color;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PageBroadcastSetPageBaseBackgroundColorParams(int version) {
            super(16, version);
        }

        public PageBroadcastSetPageBaseBackgroundColorParams() {
            this(0);
        }

        public static PageBroadcastSetPageBaseBackgroundColorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PageBroadcastSetPageBaseBackgroundColorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PageBroadcastSetPageBaseBackgroundColorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PageBroadcastSetPageBaseBackgroundColorParams result = new PageBroadcastSetPageBaseBackgroundColorParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.color = SkColor.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.color, 8, true);
        }
    }
}
