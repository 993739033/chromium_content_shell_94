package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.FrameWidgetInputHandler;
import org.chromium.gfx.mojom.Point;
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
import org.chromium.mojo_base.mojom.String16;
import org.chromium.ui.mojom.ImeTextSpan;
import org.chromium.ui.mojom.ImeTextSpanType;
/* loaded from: classes2.dex */
class FrameWidgetInputHandler_Internal {
    private static final int ADD_IME_TEXT_SPANS_TO_EXISTING_TEXT_ORDINAL = 0;
    private static final int ADJUST_SELECTION_BY_CHARACTER_OFFSET_ORDINAL = 21;
    private static final int CLEAR_IME_TEXT_SPANS_BY_TYPE_ORDINAL = 1;
    private static final int COLLAPSE_SELECTION_ORDINAL = 17;
    private static final int COPY_ORDINAL = 11;
    private static final int COPY_TO_FIND_PBOARD_ORDINAL = 12;
    private static final int CUT_ORDINAL = 10;
    private static final int DELETE_ORDINAL = 15;
    private static final int DELETE_SURROUNDING_TEXT_IN_CODE_POINTS_ORDINAL = 5;
    private static final int DELETE_SURROUNDING_TEXT_ORDINAL = 4;
    private static final int EXECUTE_EDIT_COMMAND_ORDINAL = 7;
    private static final int EXTEND_SELECTION_AND_DELETE_ORDINAL = 3;
    public static final Interface.Manager<FrameWidgetInputHandler, FrameWidgetInputHandler.Proxy> MANAGER = new Interface.Manager<FrameWidgetInputHandler, FrameWidgetInputHandler.Proxy>() { // from class: org.chromium.blink.mojom.FrameWidgetInputHandler_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.FrameWidgetInputHandler";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public FrameWidgetInputHandler.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, FrameWidgetInputHandler impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public FrameWidgetInputHandler[] buildArray(int size) {
            return new FrameWidgetInputHandler[size];
        }
    };
    private static final int MOVE_CARET_ORDINAL = 25;
    private static final int MOVE_RANGE_SELECTION_EXTENT_ORDINAL = 23;
    private static final int PASTE_AND_MATCH_STYLE_ORDINAL = 14;
    private static final int PASTE_ORDINAL = 13;
    private static final int REDO_ORDINAL = 9;
    private static final int REPLACE_MISSPELLING_ORDINAL = 19;
    private static final int REPLACE_ORDINAL = 18;
    private static final int SCROLL_FOCUSED_EDITABLE_NODE_INTO_RECT_ORDINAL = 24;
    private static final int SELECT_ALL_ORDINAL = 16;
    private static final int SELECT_RANGE_ORDINAL = 20;
    private static final int SELECT_WORD_AROUND_CARET_ORDINAL = 22;
    private static final int SET_COMPOSITION_FROM_EXISTING_TEXT_ORDINAL = 2;
    private static final int SET_EDITABLE_SELECTION_OFFSETS_ORDINAL = 6;
    private static final int UNDO_ORDINAL = 8;

    FrameWidgetInputHandler_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements FrameWidgetInputHandler.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void addImeTextSpansToExistingText(int start, int end, ImeTextSpan[] imeTextSpans) {
            FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams _message = new FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams();
            _message.start = start;
            _message.end = end;
            _message.imeTextSpans = imeTextSpans;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void clearImeTextSpansByType(int start, int end, int type) {
            FrameWidgetInputHandlerClearImeTextSpansByTypeParams _message = new FrameWidgetInputHandlerClearImeTextSpansByTypeParams();
            _message.start = start;
            _message.end = end;
            _message.type = type;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void setCompositionFromExistingText(int start, int end, ImeTextSpan[] imeTextSpans) {
            FrameWidgetInputHandlerSetCompositionFromExistingTextParams _message = new FrameWidgetInputHandlerSetCompositionFromExistingTextParams();
            _message.start = start;
            _message.end = end;
            _message.imeTextSpans = imeTextSpans;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void extendSelectionAndDelete(int before, int after) {
            FrameWidgetInputHandlerExtendSelectionAndDeleteParams _message = new FrameWidgetInputHandlerExtendSelectionAndDeleteParams();
            _message.before = before;
            _message.after = after;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void deleteSurroundingText(int before, int after) {
            FrameWidgetInputHandlerDeleteSurroundingTextParams _message = new FrameWidgetInputHandlerDeleteSurroundingTextParams();
            _message.before = before;
            _message.after = after;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void deleteSurroundingTextInCodePoints(int before, int after) {
            FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams _message = new FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams();
            _message.before = before;
            _message.after = after;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void setEditableSelectionOffsets(int start, int end) {
            FrameWidgetInputHandlerSetEditableSelectionOffsetsParams _message = new FrameWidgetInputHandlerSetEditableSelectionOffsetsParams();
            _message.start = start;
            _message.end = end;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void executeEditCommand(String command, String16 value) {
            FrameWidgetInputHandlerExecuteEditCommandParams _message = new FrameWidgetInputHandlerExecuteEditCommandParams();
            _message.command = command;
            _message.value = value;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void undo() {
            FrameWidgetInputHandlerUndoParams _message = new FrameWidgetInputHandlerUndoParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void redo() {
            FrameWidgetInputHandlerRedoParams _message = new FrameWidgetInputHandlerRedoParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void cut() {
            FrameWidgetInputHandlerCutParams _message = new FrameWidgetInputHandlerCutParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void copy() {
            FrameWidgetInputHandlerCopyParams _message = new FrameWidgetInputHandlerCopyParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void copyToFindPboard() {
            FrameWidgetInputHandlerCopyToFindPboardParams _message = new FrameWidgetInputHandlerCopyToFindPboardParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void paste() {
            FrameWidgetInputHandlerPasteParams _message = new FrameWidgetInputHandlerPasteParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void pasteAndMatchStyle() {
            FrameWidgetInputHandlerPasteAndMatchStyleParams _message = new FrameWidgetInputHandlerPasteAndMatchStyleParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void delete() {
            FrameWidgetInputHandlerDeleteParams _message = new FrameWidgetInputHandlerDeleteParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void selectAll() {
            FrameWidgetInputHandlerSelectAllParams _message = new FrameWidgetInputHandlerSelectAllParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void collapseSelection() {
            FrameWidgetInputHandlerCollapseSelectionParams _message = new FrameWidgetInputHandlerCollapseSelectionParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void replace(String16 word) {
            FrameWidgetInputHandlerReplaceParams _message = new FrameWidgetInputHandlerReplaceParams();
            _message.word = word;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void replaceMisspelling(String16 word) {
            FrameWidgetInputHandlerReplaceMisspellingParams _message = new FrameWidgetInputHandlerReplaceMisspellingParams();
            _message.word = word;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void selectRange(Point base, Point extent) {
            FrameWidgetInputHandlerSelectRangeParams _message = new FrameWidgetInputHandlerSelectRangeParams();
            _message.base = base;
            _message.extent = extent;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(20)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void adjustSelectionByCharacterOffset(int start, int end, int behavior) {
            FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams _message = new FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams();
            _message.start = start;
            _message.end = end;
            _message.behavior = behavior;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(21)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void selectWordAroundCaret(SelectWordAroundCaretResponse callback) {
            FrameWidgetInputHandlerSelectWordAroundCaretParams _message = new FrameWidgetInputHandlerSelectWordAroundCaretParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(22, 1, 0L)), new FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void moveRangeSelectionExtent(Point extent) {
            FrameWidgetInputHandlerMoveRangeSelectionExtentParams _message = new FrameWidgetInputHandlerMoveRangeSelectionExtentParams();
            _message.extent = extent;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(23)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void scrollFocusedEditableNodeIntoRect(Rect rect) {
            FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams _message = new FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams();
            _message.rect = rect;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(24)));
        }

        @Override // org.chromium.blink.mojom.FrameWidgetInputHandler
        public void moveCaret(Point point) {
            FrameWidgetInputHandlerMoveCaretParams _message = new FrameWidgetInputHandlerMoveCaretParams();
            _message.point = point;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(25)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<FrameWidgetInputHandler> {
        Stub(Core core, FrameWidgetInputHandler impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(FrameWidgetInputHandler_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 22:
                    default:
                        return false;
                    case 0:
                        FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams data = FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addImeTextSpansToExistingText(data.start, data.end, data.imeTextSpans);
                        return true;
                    case 1:
                        FrameWidgetInputHandlerClearImeTextSpansByTypeParams data2 = FrameWidgetInputHandlerClearImeTextSpansByTypeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearImeTextSpansByType(data2.start, data2.end, data2.type);
                        return true;
                    case 2:
                        FrameWidgetInputHandlerSetCompositionFromExistingTextParams data3 = FrameWidgetInputHandlerSetCompositionFromExistingTextParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCompositionFromExistingText(data3.start, data3.end, data3.imeTextSpans);
                        return true;
                    case 3:
                        FrameWidgetInputHandlerExtendSelectionAndDeleteParams data4 = FrameWidgetInputHandlerExtendSelectionAndDeleteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().extendSelectionAndDelete(data4.before, data4.after);
                        return true;
                    case 4:
                        FrameWidgetInputHandlerDeleteSurroundingTextParams data5 = FrameWidgetInputHandlerDeleteSurroundingTextParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteSurroundingText(data5.before, data5.after);
                        return true;
                    case 5:
                        FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams data6 = FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteSurroundingTextInCodePoints(data6.before, data6.after);
                        return true;
                    case 6:
                        FrameWidgetInputHandlerSetEditableSelectionOffsetsParams data7 = FrameWidgetInputHandlerSetEditableSelectionOffsetsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setEditableSelectionOffsets(data7.start, data7.end);
                        return true;
                    case 7:
                        FrameWidgetInputHandlerExecuteEditCommandParams data8 = FrameWidgetInputHandlerExecuteEditCommandParams.deserialize(messageWithHeader.getPayload());
                        getImpl().executeEditCommand(data8.command, data8.value);
                        return true;
                    case 8:
                        FrameWidgetInputHandlerUndoParams.deserialize(messageWithHeader.getPayload());
                        getImpl().undo();
                        return true;
                    case 9:
                        FrameWidgetInputHandlerRedoParams.deserialize(messageWithHeader.getPayload());
                        getImpl().redo();
                        return true;
                    case 10:
                        FrameWidgetInputHandlerCutParams.deserialize(messageWithHeader.getPayload());
                        getImpl().cut();
                        return true;
                    case 11:
                        FrameWidgetInputHandlerCopyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().copy();
                        return true;
                    case 12:
                        FrameWidgetInputHandlerCopyToFindPboardParams.deserialize(messageWithHeader.getPayload());
                        getImpl().copyToFindPboard();
                        return true;
                    case 13:
                        FrameWidgetInputHandlerPasteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().paste();
                        return true;
                    case 14:
                        FrameWidgetInputHandlerPasteAndMatchStyleParams.deserialize(messageWithHeader.getPayload());
                        getImpl().pasteAndMatchStyle();
                        return true;
                    case 15:
                        FrameWidgetInputHandlerDeleteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().delete();
                        return true;
                    case 16:
                        FrameWidgetInputHandlerSelectAllParams.deserialize(messageWithHeader.getPayload());
                        getImpl().selectAll();
                        return true;
                    case 17:
                        FrameWidgetInputHandlerCollapseSelectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().collapseSelection();
                        return true;
                    case 18:
                        getImpl().replace(FrameWidgetInputHandlerReplaceParams.deserialize(messageWithHeader.getPayload()).word);
                        return true;
                    case 19:
                        getImpl().replaceMisspelling(FrameWidgetInputHandlerReplaceMisspellingParams.deserialize(messageWithHeader.getPayload()).word);
                        return true;
                    case 20:
                        FrameWidgetInputHandlerSelectRangeParams data9 = FrameWidgetInputHandlerSelectRangeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().selectRange(data9.base, data9.extent);
                        return true;
                    case 21:
                        FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams data10 = FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().adjustSelectionByCharacterOffset(data10.start, data10.end, data10.behavior);
                        return true;
                    case 23:
                        getImpl().moveRangeSelectionExtent(FrameWidgetInputHandlerMoveRangeSelectionExtentParams.deserialize(messageWithHeader.getPayload()).extent);
                        return true;
                    case 24:
                        getImpl().scrollFocusedEditableNodeIntoRect(FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams.deserialize(messageWithHeader.getPayload()).rect);
                        return true;
                    case 25:
                        getImpl().moveCaret(FrameWidgetInputHandlerMoveCaretParams.deserialize(messageWithHeader.getPayload()).point);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), FrameWidgetInputHandler_Internal.MANAGER, messageWithHeader, receiver);
                    case 22:
                        FrameWidgetInputHandlerSelectWordAroundCaretParams.deserialize(messageWithHeader.getPayload());
                        getImpl().selectWordAroundCaret(new FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int end;
        public ImeTextSpan[] imeTextSpans;
        public int start;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams result = new FrameWidgetInputHandlerAddImeTextSpansToExistingTextParams(elementsOrVersion);
                result.start = decoder0.readInt(8);
                result.end = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.imeTextSpans = new ImeTextSpan[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.imeTextSpans[i1] = ImeTextSpan.decode(decoder2);
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
            encoder0.encode(this.start, 8);
            encoder0.encode(this.end, 12);
            ImeTextSpan[] imeTextSpanArr = this.imeTextSpans;
            if (imeTextSpanArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(imeTextSpanArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ImeTextSpan[] imeTextSpanArr2 = this.imeTextSpans;
                if (i0 < imeTextSpanArr2.length) {
                    encoder1.encode((Struct) imeTextSpanArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerClearImeTextSpansByTypeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int end;
        public int start;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerClearImeTextSpansByTypeParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerClearImeTextSpansByTypeParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerClearImeTextSpansByTypeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerClearImeTextSpansByTypeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerClearImeTextSpansByTypeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerClearImeTextSpansByTypeParams result = new FrameWidgetInputHandlerClearImeTextSpansByTypeParams(elementsOrVersion);
                result.start = decoder0.readInt(8);
                result.end = decoder0.readInt(12);
                int readInt = decoder0.readInt(16);
                result.type = readInt;
                ImeTextSpanType.validate(readInt);
                result.type = ImeTextSpanType.toKnownValue(result.type);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.start, 8);
            encoder0.encode(this.end, 12);
            encoder0.encode(this.type, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerSetCompositionFromExistingTextParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int end;
        public ImeTextSpan[] imeTextSpans;
        public int start;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSetCompositionFromExistingTextParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerSetCompositionFromExistingTextParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSetCompositionFromExistingTextParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSetCompositionFromExistingTextParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSetCompositionFromExistingTextParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSetCompositionFromExistingTextParams result = new FrameWidgetInputHandlerSetCompositionFromExistingTextParams(elementsOrVersion);
                result.start = decoder0.readInt(8);
                result.end = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.imeTextSpans = new ImeTextSpan[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.imeTextSpans[i1] = ImeTextSpan.decode(decoder2);
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
            encoder0.encode(this.start, 8);
            encoder0.encode(this.end, 12);
            ImeTextSpan[] imeTextSpanArr = this.imeTextSpans;
            if (imeTextSpanArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(imeTextSpanArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ImeTextSpan[] imeTextSpanArr2 = this.imeTextSpans;
                if (i0 < imeTextSpanArr2.length) {
                    encoder1.encode((Struct) imeTextSpanArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerExtendSelectionAndDeleteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int after;
        public int before;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerExtendSelectionAndDeleteParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerExtendSelectionAndDeleteParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerExtendSelectionAndDeleteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerExtendSelectionAndDeleteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerExtendSelectionAndDeleteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerExtendSelectionAndDeleteParams result = new FrameWidgetInputHandlerExtendSelectionAndDeleteParams(elementsOrVersion);
                result.before = decoder0.readInt(8);
                result.after = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.before, 8);
            encoder0.encode(this.after, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerDeleteSurroundingTextParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int after;
        public int before;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerDeleteSurroundingTextParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerDeleteSurroundingTextParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerDeleteSurroundingTextParams result = new FrameWidgetInputHandlerDeleteSurroundingTextParams(elementsOrVersion);
                result.before = decoder0.readInt(8);
                result.after = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.before, 8);
            encoder0.encode(this.after, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int after;
        public int before;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams result = new FrameWidgetInputHandlerDeleteSurroundingTextInCodePointsParams(elementsOrVersion);
                result.before = decoder0.readInt(8);
                result.after = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.before, 8);
            encoder0.encode(this.after, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerSetEditableSelectionOffsetsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int end;
        public int start;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSetEditableSelectionOffsetsParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerSetEditableSelectionOffsetsParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSetEditableSelectionOffsetsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSetEditableSelectionOffsetsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSetEditableSelectionOffsetsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSetEditableSelectionOffsetsParams result = new FrameWidgetInputHandlerSetEditableSelectionOffsetsParams(elementsOrVersion);
                result.start = decoder0.readInt(8);
                result.end = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.start, 8);
            encoder0.encode(this.end, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerExecuteEditCommandParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String command;
        public String16 value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerExecuteEditCommandParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerExecuteEditCommandParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerExecuteEditCommandParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerExecuteEditCommandParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerExecuteEditCommandParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerExecuteEditCommandParams result = new FrameWidgetInputHandlerExecuteEditCommandParams(elementsOrVersion);
                result.command = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.value = String16.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.command, 8, false);
            encoder0.encode((Struct) this.value, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerUndoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerUndoParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerUndoParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerUndoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerUndoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerUndoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerUndoParams result = new FrameWidgetInputHandlerUndoParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerRedoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerRedoParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerRedoParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerRedoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerRedoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerRedoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerRedoParams result = new FrameWidgetInputHandlerRedoParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerCutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerCutParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerCutParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerCutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerCutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerCutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerCutParams result = new FrameWidgetInputHandlerCutParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerCopyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerCopyParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerCopyParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerCopyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerCopyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerCopyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerCopyParams result = new FrameWidgetInputHandlerCopyParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerCopyToFindPboardParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerCopyToFindPboardParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerCopyToFindPboardParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerCopyToFindPboardParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerCopyToFindPboardParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerCopyToFindPboardParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerCopyToFindPboardParams result = new FrameWidgetInputHandlerCopyToFindPboardParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerPasteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerPasteParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerPasteParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerPasteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerPasteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerPasteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerPasteParams result = new FrameWidgetInputHandlerPasteParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerPasteAndMatchStyleParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerPasteAndMatchStyleParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerPasteAndMatchStyleParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerPasteAndMatchStyleParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerPasteAndMatchStyleParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerPasteAndMatchStyleParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerPasteAndMatchStyleParams result = new FrameWidgetInputHandlerPasteAndMatchStyleParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerDeleteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerDeleteParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerDeleteParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerDeleteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerDeleteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerDeleteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerDeleteParams result = new FrameWidgetInputHandlerDeleteParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerSelectAllParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSelectAllParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerSelectAllParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSelectAllParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSelectAllParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSelectAllParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSelectAllParams result = new FrameWidgetInputHandlerSelectAllParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerCollapseSelectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerCollapseSelectionParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerCollapseSelectionParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerCollapseSelectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerCollapseSelectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerCollapseSelectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerCollapseSelectionParams result = new FrameWidgetInputHandlerCollapseSelectionParams(elementsOrVersion);
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
    static final class FrameWidgetInputHandlerReplaceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 word;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerReplaceParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerReplaceParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerReplaceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerReplaceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerReplaceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerReplaceParams result = new FrameWidgetInputHandlerReplaceParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.word = String16.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.word, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerReplaceMisspellingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String16 word;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerReplaceMisspellingParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerReplaceMisspellingParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerReplaceMisspellingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerReplaceMisspellingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerReplaceMisspellingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerReplaceMisspellingParams result = new FrameWidgetInputHandlerReplaceMisspellingParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.word = String16.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.word, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerSelectRangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Point base;
        public Point extent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSelectRangeParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerSelectRangeParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSelectRangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSelectRangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSelectRangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSelectRangeParams result = new FrameWidgetInputHandlerSelectRangeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.base = Point.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.extent = Point.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.base, 8, false);
            encoder0.encode((Struct) this.extent, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int behavior;
        public int end;
        public int start;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams result = new FrameWidgetInputHandlerAdjustSelectionByCharacterOffsetParams(elementsOrVersion);
                result.start = decoder0.readInt(8);
                result.end = decoder0.readInt(12);
                int readInt = decoder0.readInt(16);
                result.behavior = readInt;
                SelectionMenuBehavior.validate(readInt);
                result.behavior = SelectionMenuBehavior.toKnownValue(result.behavior);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.start, 8);
            encoder0.encode(this.end, 12);
            encoder0.encode(this.behavior, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerSelectWordAroundCaretParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSelectWordAroundCaretParams(int version) {
            super(8, version);
        }

        public FrameWidgetInputHandlerSelectWordAroundCaretParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSelectWordAroundCaretParams result = new FrameWidgetInputHandlerSelectWordAroundCaretParams(elementsOrVersion);
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
    public static final class FrameWidgetInputHandlerSelectWordAroundCaretResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean didSelect;
        public int endAdjust;
        public int startAdjust;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerSelectWordAroundCaretResponseParams(int version) {
            super(24, version);
        }

        public FrameWidgetInputHandlerSelectWordAroundCaretResponseParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerSelectWordAroundCaretResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerSelectWordAroundCaretResponseParams result = new FrameWidgetInputHandlerSelectWordAroundCaretResponseParams(elementsOrVersion);
                result.didSelect = decoder0.readBoolean(8, 0);
                result.startAdjust = decoder0.readInt(12);
                result.endAdjust = decoder0.readInt(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.didSelect, 8, 0);
            encoder0.encode(this.startAdjust, 12);
            encoder0.encode(this.endAdjust, 16);
        }
    }

    /* loaded from: classes2.dex */
    static class FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FrameWidgetInputHandler.SelectWordAroundCaretResponse mCallback;

        FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsForwardToCallback(FrameWidgetInputHandler.SelectWordAroundCaretResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(22, 2)) {
                    return false;
                }
                FrameWidgetInputHandlerSelectWordAroundCaretResponseParams response = FrameWidgetInputHandlerSelectWordAroundCaretResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.didSelect), Integer.valueOf(response.startAdjust), Integer.valueOf(response.endAdjust));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsProxyToResponder implements FrameWidgetInputHandler.SelectWordAroundCaretResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FrameWidgetInputHandlerSelectWordAroundCaretResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean didSelect, Integer startAdjust, Integer endAdjust) {
            FrameWidgetInputHandlerSelectWordAroundCaretResponseParams _response = new FrameWidgetInputHandlerSelectWordAroundCaretResponseParams();
            _response.didSelect = didSelect.booleanValue();
            _response.startAdjust = startAdjust.intValue();
            _response.endAdjust = endAdjust.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(22, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerMoveRangeSelectionExtentParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Point extent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerMoveRangeSelectionExtentParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerMoveRangeSelectionExtentParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerMoveRangeSelectionExtentParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerMoveRangeSelectionExtentParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerMoveRangeSelectionExtentParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerMoveRangeSelectionExtentParams result = new FrameWidgetInputHandlerMoveRangeSelectionExtentParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.extent = Point.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.extent, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Rect rect;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams result = new FrameWidgetInputHandlerScrollFocusedEditableNodeIntoRectParams(elementsOrVersion);
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

    /* loaded from: classes2.dex */
    static final class FrameWidgetInputHandlerMoveCaretParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Point point;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FrameWidgetInputHandlerMoveCaretParams(int version) {
            super(16, version);
        }

        public FrameWidgetInputHandlerMoveCaretParams() {
            this(0);
        }

        public static FrameWidgetInputHandlerMoveCaretParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FrameWidgetInputHandlerMoveCaretParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FrameWidgetInputHandlerMoveCaretParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FrameWidgetInputHandlerMoveCaretParams result = new FrameWidgetInputHandlerMoveCaretParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.point = Point.decode(decoder1);
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
        }
    }
}
