package org.chromium.blink.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.mojo_base.mojom.BigString;
import org.chromium.mojo_base.mojom.BigString16;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.skia.mojom.BitmapN32;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ClipboardHost extends Interface {
    public static final Manager<ClipboardHost, Proxy> MANAGER = ClipboardHost_Internal.MANAGER;
    public static final int MAX_DATA_SIZE = 1073741824;
    public static final int MAX_FORMAT_SIZE = 1024;

    /* loaded from: classes2.dex */
    public interface GetSequenceNumberResponse extends Callbacks.Callback1<ClipboardSequenceNumberToken> {
    }

    /* loaded from: classes2.dex */
    public interface IsFormatAvailableResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ClipboardHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadAvailableCustomAndStandardFormatsResponse extends Callbacks.Callback1<String16[]> {
    }

    /* loaded from: classes2.dex */
    public interface ReadAvailableTypesResponse extends Callbacks.Callback1<String16[]> {
    }

    /* loaded from: classes2.dex */
    public interface ReadCustomDataResponse extends Callbacks.Callback1<BigString16> {
    }

    /* loaded from: classes2.dex */
    public interface ReadFilesResponse extends Callbacks.Callback1<ClipboardFiles> {
    }

    /* loaded from: classes2.dex */
    public interface ReadHtmlResponse extends Callbacks.Callback4<BigString16, Url, Integer, Integer> {
    }

    /* loaded from: classes2.dex */
    public interface ReadImageResponse extends Callbacks.Callback1<BitmapN32> {
    }

    /* loaded from: classes2.dex */
    public interface ReadPngResponse extends Callbacks.Callback1<BigBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface ReadRtfResponse extends Callbacks.Callback1<BigString> {
    }

    /* loaded from: classes2.dex */
    public interface ReadSvgResponse extends Callbacks.Callback1<BigString16> {
    }

    /* loaded from: classes2.dex */
    public interface ReadTextResponse extends Callbacks.Callback1<BigString16> {
    }

    /* loaded from: classes2.dex */
    public interface ReadUnsanitizedCustomFormatResponse extends Callbacks.Callback1<BigBuffer> {
    }

    void commitWrite();

    void getSequenceNumber(int i, GetSequenceNumberResponse getSequenceNumberResponse);

    void isFormatAvailable(int i, int i2, IsFormatAvailableResponse isFormatAvailableResponse);

    void readAvailableCustomAndStandardFormats(ReadAvailableCustomAndStandardFormatsResponse readAvailableCustomAndStandardFormatsResponse);

    void readAvailableTypes(int i, ReadAvailableTypesResponse readAvailableTypesResponse);

    void readCustomData(int i, String16 string16, ReadCustomDataResponse readCustomDataResponse);

    void readFiles(int i, ReadFilesResponse readFilesResponse);

    void readHtml(int i, ReadHtmlResponse readHtmlResponse);

    void readImage(int i, ReadImageResponse readImageResponse);

    void readPng(int i, ReadPngResponse readPngResponse);

    void readRtf(int i, ReadRtfResponse readRtfResponse);

    void readSvg(int i, ReadSvgResponse readSvgResponse);

    void readText(int i, ReadTextResponse readTextResponse);

    void readUnsanitizedCustomFormat(String16 string16, ReadUnsanitizedCustomFormatResponse readUnsanitizedCustomFormatResponse);

    void writeBookmark(String str, String16 string16);

    void writeCustomData(Map<String16, BigString16> map);

    void writeHtml(BigString16 bigString16, Url url);

    void writeImage(BitmapN32 bitmapN32);

    void writeSmartPasteMarker();

    void writeSvg(BigString16 bigString16);

    void writeText(BigString16 bigString16);

    void writeUnsanitizedCustomFormat(String16 string16, BigBuffer bigBuffer);
}
