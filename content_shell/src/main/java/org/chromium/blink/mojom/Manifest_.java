package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.ScreenOrientationLockType;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class Manifest_ extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 176;
    private static final DataHeader[] VERSION_ARRAY;
    public int backgroundColor;
    public int captureLinks;
    public String16 description;
    public int display;
    public int[] displayOverride;
    public ManifestFileHandler[] fileHandlers;
    public String16 gcmSenderId;
    public boolean hasBackgroundColor;
    public boolean hasThemeColor;
    public ManifestImageResource[] icons;
    public String16 id;
    public boolean isolatedStorage;
    public ManifestLaunchHandler launchHandler;
    public String16 name;
    public ManifestNoteTaking noteTaking;
    public int orientation;
    public boolean preferRelatedApplications;
    public ManifestProtocolHandler[] protocolHandlers;
    public ManifestRelatedApplication[] relatedApplications;
    public Url scope;
    public ManifestImageResource[] screenshots;
    public ManifestShareTarget shareTarget;
    public String16 shortName;
    public ManifestShortcutItem[] shortcuts;
    public Url startUrl;
    public int themeColor;
    public ManifestUrlHandler[] urlHandlers;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(176, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Manifest_(int version) {
        super(176, version);
    }

    public Manifest_() {
        this(0);
    }

    public static Manifest_ deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Manifest_ deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Manifest_ decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Manifest_ result = new Manifest_(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, true);
            result.name = String16.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.shortName = String16.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, true);
            result.description = String16.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, true);
            result.id = String16.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(40, false);
            result.startUrl = Url.decode(decoder15);
            int readInt = decoder0.readInt(48);
            result.display = readInt;
            DisplayMode.validate(readInt);
            result.display = DisplayMode.toKnownValue(result.display);
            int readInt2 = decoder0.readInt(52);
            result.orientation = readInt2;
            ScreenOrientationLockType.validate(readInt2);
            result.orientation = ScreenOrientationLockType.toKnownValue(result.orientation);
            result.displayOverride = decoder0.readInts(56, 0, -1);
            int i1 = 0;
            while (true) {
                int[] iArr = result.displayOverride;
                if (i1 >= iArr.length) {
                    break;
                }
                DisplayMode.validate(iArr[i1]);
                i1++;
            }
            Decoder decoder16 = decoder0.readPointer(64, false);
            DataHeader si1 = decoder16.readDataHeaderForPointerArray(-1);
            result.icons = new ManifestImageResource[si1.elementsOrVersion];
            for (int i12 = 0; i12 < si1.elementsOrVersion; i12++) {
                Decoder decoder2 = decoder16.readPointer((i12 * 8) + 8, false);
                result.icons[i12] = ManifestImageResource.decode(decoder2);
            }
            Decoder decoder17 = decoder0.readPointer(72, false);
            DataHeader si12 = decoder17.readDataHeaderForPointerArray(-1);
            result.screenshots = new ManifestImageResource[si12.elementsOrVersion];
            for (int i13 = 0; i13 < si12.elementsOrVersion; i13++) {
                Decoder decoder22 = decoder17.readPointer((i13 * 8) + 8, false);
                result.screenshots[i13] = ManifestImageResource.decode(decoder22);
            }
            Decoder decoder18 = decoder0.readPointer(80, false);
            DataHeader si13 = decoder18.readDataHeaderForPointerArray(-1);
            result.shortcuts = new ManifestShortcutItem[si13.elementsOrVersion];
            for (int i14 = 0; i14 < si13.elementsOrVersion; i14++) {
                Decoder decoder23 = decoder18.readPointer((i14 * 8) + 8, false);
                result.shortcuts[i14] = ManifestShortcutItem.decode(decoder23);
            }
            Decoder decoder19 = decoder0.readPointer(88, true);
            result.shareTarget = ManifestShareTarget.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(96, false);
            DataHeader si14 = decoder110.readDataHeaderForPointerArray(-1);
            result.fileHandlers = new ManifestFileHandler[si14.elementsOrVersion];
            for (int i15 = 0; i15 < si14.elementsOrVersion; i15++) {
                Decoder decoder24 = decoder110.readPointer((i15 * 8) + 8, false);
                result.fileHandlers[i15] = ManifestFileHandler.decode(decoder24);
            }
            Decoder decoder111 = decoder0.readPointer(104, false);
            DataHeader si15 = decoder111.readDataHeaderForPointerArray(-1);
            result.protocolHandlers = new ManifestProtocolHandler[si15.elementsOrVersion];
            for (int i16 = 0; i16 < si15.elementsOrVersion; i16++) {
                Decoder decoder25 = decoder111.readPointer((i16 * 8) + 8, false);
                result.protocolHandlers[i16] = ManifestProtocolHandler.decode(decoder25);
            }
            Decoder decoder112 = decoder0.readPointer(112, false);
            DataHeader si16 = decoder112.readDataHeaderForPointerArray(-1);
            result.urlHandlers = new ManifestUrlHandler[si16.elementsOrVersion];
            for (int i17 = 0; i17 < si16.elementsOrVersion; i17++) {
                Decoder decoder26 = decoder112.readPointer((i17 * 8) + 8, false);
                result.urlHandlers[i17] = ManifestUrlHandler.decode(decoder26);
            }
            Decoder decoder113 = decoder0.readPointer(120, true);
            result.noteTaking = ManifestNoteTaking.decode(decoder113);
            Decoder decoder114 = decoder0.readPointer(128, false);
            DataHeader si17 = decoder114.readDataHeaderForPointerArray(-1);
            result.relatedApplications = new ManifestRelatedApplication[si17.elementsOrVersion];
            for (int i18 = 0; i18 < si17.elementsOrVersion; i18++) {
                Decoder decoder27 = decoder114.readPointer((i18 * 8) + 8, false);
                result.relatedApplications[i18] = ManifestRelatedApplication.decode(decoder27);
            }
            result.preferRelatedApplications = decoder0.readBoolean(136, 0);
            result.hasThemeColor = decoder0.readBoolean(136, 1);
            result.hasBackgroundColor = decoder0.readBoolean(136, 2);
            result.isolatedStorage = decoder0.readBoolean(136, 3);
            result.themeColor = decoder0.readInt(140);
            result.backgroundColor = decoder0.readInt(144);
            int readInt3 = decoder0.readInt(WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT);
            result.captureLinks = readInt3;
            CaptureLinks.validate(readInt3);
            result.captureLinks = CaptureLinks.toKnownValue(result.captureLinks);
            Decoder decoder115 = decoder0.readPointer(152, true);
            result.gcmSenderId = String16.decode(decoder115);
            Decoder decoder116 = decoder0.readPointer(160, false);
            result.scope = Url.decode(decoder116);
            Decoder decoder117 = decoder0.readPointer(168, true);
            result.launchHandler = ManifestLaunchHandler.decode(decoder117);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.name, 8, true);
        encoder0.encode((Struct) this.shortName, 16, true);
        encoder0.encode((Struct) this.description, 24, true);
        encoder0.encode((Struct) this.id, 32, true);
        encoder0.encode((Struct) this.startUrl, 40, false);
        encoder0.encode(this.display, 48);
        encoder0.encode(this.orientation, 52);
        encoder0.encode(this.displayOverride, 56, 0, -1);
        ManifestImageResource[] manifestImageResourceArr = this.icons;
        if (manifestImageResourceArr == null) {
            encoder0.encodeNullPointer(64, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(manifestImageResourceArr.length, 64, -1);
            int i0 = 0;
            while (true) {
                ManifestImageResource[] manifestImageResourceArr2 = this.icons;
                if (i0 >= manifestImageResourceArr2.length) {
                    break;
                }
                encoder1.encode((Struct) manifestImageResourceArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        ManifestImageResource[] manifestImageResourceArr3 = this.screenshots;
        if (manifestImageResourceArr3 == null) {
            encoder0.encodeNullPointer(72, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(manifestImageResourceArr3.length, 72, -1);
            int i02 = 0;
            while (true) {
                ManifestImageResource[] manifestImageResourceArr4 = this.screenshots;
                if (i02 >= manifestImageResourceArr4.length) {
                    break;
                }
                encoder12.encode((Struct) manifestImageResourceArr4[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        ManifestShortcutItem[] manifestShortcutItemArr = this.shortcuts;
        if (manifestShortcutItemArr == null) {
            encoder0.encodeNullPointer(80, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(manifestShortcutItemArr.length, 80, -1);
            int i03 = 0;
            while (true) {
                ManifestShortcutItem[] manifestShortcutItemArr2 = this.shortcuts;
                if (i03 >= manifestShortcutItemArr2.length) {
                    break;
                }
                encoder13.encode((Struct) manifestShortcutItemArr2[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode((Struct) this.shareTarget, 88, true);
        ManifestFileHandler[] manifestFileHandlerArr = this.fileHandlers;
        if (manifestFileHandlerArr == null) {
            encoder0.encodeNullPointer(96, false);
        } else {
            Encoder encoder14 = encoder0.encodePointerArray(manifestFileHandlerArr.length, 96, -1);
            int i04 = 0;
            while (true) {
                ManifestFileHandler[] manifestFileHandlerArr2 = this.fileHandlers;
                if (i04 >= manifestFileHandlerArr2.length) {
                    break;
                }
                encoder14.encode((Struct) manifestFileHandlerArr2[i04], (i04 * 8) + 8, false);
                i04++;
            }
        }
        ManifestProtocolHandler[] manifestProtocolHandlerArr = this.protocolHandlers;
        if (manifestProtocolHandlerArr == null) {
            encoder0.encodeNullPointer(104, false);
        } else {
            Encoder encoder15 = encoder0.encodePointerArray(manifestProtocolHandlerArr.length, 104, -1);
            int i05 = 0;
            while (true) {
                ManifestProtocolHandler[] manifestProtocolHandlerArr2 = this.protocolHandlers;
                if (i05 >= manifestProtocolHandlerArr2.length) {
                    break;
                }
                encoder15.encode((Struct) manifestProtocolHandlerArr2[i05], (i05 * 8) + 8, false);
                i05++;
            }
        }
        ManifestUrlHandler[] manifestUrlHandlerArr = this.urlHandlers;
        if (manifestUrlHandlerArr == null) {
            encoder0.encodeNullPointer(112, false);
        } else {
            Encoder encoder16 = encoder0.encodePointerArray(manifestUrlHandlerArr.length, 112, -1);
            int i06 = 0;
            while (true) {
                ManifestUrlHandler[] manifestUrlHandlerArr2 = this.urlHandlers;
                if (i06 >= manifestUrlHandlerArr2.length) {
                    break;
                }
                encoder16.encode((Struct) manifestUrlHandlerArr2[i06], (i06 * 8) + 8, false);
                i06++;
            }
        }
        encoder0.encode((Struct) this.noteTaking, 120, true);
        ManifestRelatedApplication[] manifestRelatedApplicationArr = this.relatedApplications;
        if (manifestRelatedApplicationArr == null) {
            encoder0.encodeNullPointer(128, false);
        } else {
            Encoder encoder17 = encoder0.encodePointerArray(manifestRelatedApplicationArr.length, 128, -1);
            int i07 = 0;
            while (true) {
                ManifestRelatedApplication[] manifestRelatedApplicationArr2 = this.relatedApplications;
                if (i07 >= manifestRelatedApplicationArr2.length) {
                    break;
                }
                encoder17.encode((Struct) manifestRelatedApplicationArr2[i07], (i07 * 8) + 8, false);
                i07++;
            }
        }
        encoder0.encode(this.preferRelatedApplications, 136, 0);
        encoder0.encode(this.hasThemeColor, 136, 1);
        encoder0.encode(this.hasBackgroundColor, 136, 2);
        encoder0.encode(this.isolatedStorage, 136, 3);
        encoder0.encode(this.themeColor, 140);
        encoder0.encode(this.backgroundColor, 144);
        encoder0.encode(this.captureLinks, WebFeature.DOM_CHARACTER_DATA_MODIFIED_EVENT);
        encoder0.encode((Struct) this.gcmSenderId, 152, true);
        encoder0.encode((Struct) this.scope, 160, false);
        encoder0.encode((Struct) this.launchHandler, 168, true);
    }
}
