package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.DateTimeChooser;
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
class DateTimeChooser_Internal {
    public static final Interface.Manager<DateTimeChooser, DateTimeChooser.Proxy> MANAGER = new Interface.Manager<DateTimeChooser, DateTimeChooser.Proxy>() { // from class: org.chromium.blink.mojom.DateTimeChooser_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.DateTimeChooser";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DateTimeChooser.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DateTimeChooser impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DateTimeChooser[] buildArray(int size) {
            return new DateTimeChooser[size];
        }
    };
    private static final int OPEN_DATE_TIME_DIALOG_ORDINAL = 0;

    DateTimeChooser_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DateTimeChooser.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.DateTimeChooser
        public void openDateTimeDialog(DateTimeDialogValue value, OpenDateTimeDialogResponse callback) {
            DateTimeChooserOpenDateTimeDialogParams _message = new DateTimeChooserOpenDateTimeDialogParams();
            _message.value = value;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new DateTimeChooserOpenDateTimeDialogResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DateTimeChooser> {
        Stub(Core core, DateTimeChooser impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DateTimeChooser_Internal.MANAGER, messageWithHeader);
                    default:
                        return false;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DateTimeChooser_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        DateTimeChooserOpenDateTimeDialogParams data = DateTimeChooserOpenDateTimeDialogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openDateTimeDialog(data.value, new DateTimeChooserOpenDateTimeDialogResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class DateTimeChooserOpenDateTimeDialogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DateTimeDialogValue value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DateTimeChooserOpenDateTimeDialogParams(int version) {
            super(16, version);
        }

        public DateTimeChooserOpenDateTimeDialogParams() {
            this(0);
        }

        public static DateTimeChooserOpenDateTimeDialogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DateTimeChooserOpenDateTimeDialogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DateTimeChooserOpenDateTimeDialogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DateTimeChooserOpenDateTimeDialogParams result = new DateTimeChooserOpenDateTimeDialogParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.value = DateTimeDialogValue.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.value, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DateTimeChooserOpenDateTimeDialogResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public double dialogValue;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DateTimeChooserOpenDateTimeDialogResponseParams(int version) {
            super(24, version);
        }

        public DateTimeChooserOpenDateTimeDialogResponseParams() {
            this(0);
        }

        public static DateTimeChooserOpenDateTimeDialogResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DateTimeChooserOpenDateTimeDialogResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DateTimeChooserOpenDateTimeDialogResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DateTimeChooserOpenDateTimeDialogResponseParams result = new DateTimeChooserOpenDateTimeDialogResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.dialogValue = decoder0.readDouble(16);
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
            encoder0.encode(this.dialogValue, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class DateTimeChooserOpenDateTimeDialogResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DateTimeChooser.OpenDateTimeDialogResponse mCallback;

        DateTimeChooserOpenDateTimeDialogResponseParamsForwardToCallback(DateTimeChooser.OpenDateTimeDialogResponse callback) {
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
                DateTimeChooserOpenDateTimeDialogResponseParams response = DateTimeChooserOpenDateTimeDialogResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), Double.valueOf(response.dialogValue));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DateTimeChooserOpenDateTimeDialogResponseParamsProxyToResponder implements DateTimeChooser.OpenDateTimeDialogResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DateTimeChooserOpenDateTimeDialogResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean success, Double dialogValue) {
            DateTimeChooserOpenDateTimeDialogResponseParams _response = new DateTimeChooserOpenDateTimeDialogResponseParams();
            _response.success = success.booleanValue();
            _response.dialogValue = dialogValue.doubleValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
