package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.ImageDownloader;
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
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.skia.mojom.BitmapN32;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class ImageDownloader_Internal {
    private static final int DOWNLOAD_IMAGE_ORDINAL = 0;
    public static final Interface.Manager<ImageDownloader, ImageDownloader.Proxy> MANAGER = new Interface.Manager<ImageDownloader, ImageDownloader.Proxy>() { // from class: org.chromium.blink.mojom.ImageDownloader_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.ImageDownloader";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ImageDownloader.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ImageDownloader impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ImageDownloader[] buildArray(int size) {
            return new ImageDownloader[size];
        }
    };

    ImageDownloader_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ImageDownloader.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.ImageDownloader
        public void downloadImage(Url url, boolean isFavicon, int preferredSize, int maxBitmapSize, boolean bypassCache, DownloadImageResponse callback) {
            ImageDownloaderDownloadImageParams _message = new ImageDownloaderDownloadImageParams();
            _message.url = url;
            _message.isFavicon = isFavicon;
            _message.preferredSize = preferredSize;
            _message.maxBitmapSize = maxBitmapSize;
            _message.bypassCache = bypassCache;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new ImageDownloaderDownloadImageResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ImageDownloader> {
        Stub(Core core, ImageDownloader impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ImageDownloader_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ImageDownloader_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        ImageDownloaderDownloadImageParams data = ImageDownloaderDownloadImageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().downloadImage(data.url, data.isFavicon, data.preferredSize, data.maxBitmapSize, data.bypassCache, new ImageDownloaderDownloadImageResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class ImageDownloaderDownloadImageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean bypassCache;
        public boolean isFavicon;
        public int maxBitmapSize;
        public int preferredSize;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ImageDownloaderDownloadImageParams(int version) {
            super(32, version);
        }

        public ImageDownloaderDownloadImageParams() {
            this(0);
        }

        public static ImageDownloaderDownloadImageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ImageDownloaderDownloadImageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ImageDownloaderDownloadImageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ImageDownloaderDownloadImageParams result = new ImageDownloaderDownloadImageParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.isFavicon = decoder0.readBoolean(16, 0);
                result.bypassCache = decoder0.readBoolean(16, 1);
                result.preferredSize = decoder0.readInt(20);
                result.maxBitmapSize = decoder0.readInt(24);
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
            encoder0.encode(this.isFavicon, 16, 0);
            encoder0.encode(this.bypassCache, 16, 1);
            encoder0.encode(this.preferredSize, 20);
            encoder0.encode(this.maxBitmapSize, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ImageDownloaderDownloadImageResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int httpStatusCode;
        public BitmapN32[] images;
        public Size[] originalImageSizes;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ImageDownloaderDownloadImageResponseParams(int version) {
            super(32, version);
        }

        public ImageDownloaderDownloadImageResponseParams() {
            this(0);
        }

        public static ImageDownloaderDownloadImageResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ImageDownloaderDownloadImageResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ImageDownloaderDownloadImageResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ImageDownloaderDownloadImageResponseParams result = new ImageDownloaderDownloadImageResponseParams(elementsOrVersion);
                result.httpStatusCode = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.images = new BitmapN32[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.images[i1] = BitmapN32.decode(decoder2);
                }
                Decoder decoder12 = decoder0.readPointer(24, false);
                DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
                result.originalImageSizes = new Size[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                    result.originalImageSizes[i12] = Size.decode(decoder22);
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
            encoder0.encode(this.httpStatusCode, 8);
            BitmapN32[] bitmapN32Arr = this.images;
            if (bitmapN32Arr == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(bitmapN32Arr.length, 16, -1);
                int i0 = 0;
                while (true) {
                    BitmapN32[] bitmapN32Arr2 = this.images;
                    if (i0 >= bitmapN32Arr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) bitmapN32Arr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            Size[] sizeArr = this.originalImageSizes;
            if (sizeArr == null) {
                encoder0.encodeNullPointer(24, false);
                return;
            }
            Encoder encoder12 = encoder0.encodePointerArray(sizeArr.length, 24, -1);
            int i02 = 0;
            while (true) {
                Size[] sizeArr2 = this.originalImageSizes;
                if (i02 < sizeArr2.length) {
                    encoder12.encode((Struct) sizeArr2[i02], (i02 * 8) + 8, false);
                    i02++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ImageDownloaderDownloadImageResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ImageDownloader.DownloadImageResponse mCallback;

        ImageDownloaderDownloadImageResponseParamsForwardToCallback(ImageDownloader.DownloadImageResponse callback) {
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
                ImageDownloaderDownloadImageResponseParams response = ImageDownloaderDownloadImageResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.httpStatusCode), response.images, response.originalImageSizes);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ImageDownloaderDownloadImageResponseParamsProxyToResponder implements ImageDownloader.DownloadImageResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ImageDownloaderDownloadImageResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Integer httpStatusCode, BitmapN32[] images, Size[] originalImageSizes) {
            ImageDownloaderDownloadImageResponseParams _response = new ImageDownloaderDownloadImageResponseParams();
            _response.httpStatusCode = httpStatusCode.intValue();
            _response.images = images;
            _response.originalImageSizes = originalImageSizes;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
