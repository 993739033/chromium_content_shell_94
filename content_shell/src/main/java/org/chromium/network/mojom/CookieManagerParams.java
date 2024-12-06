package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.content_settings.mojom.ContentSettingPatternSource;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class CookieManagerParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean allowFileSchemeCookies;
    public boolean blockThirdPartyCookies;
    public int cookieAccessDelegateType;
    public String[] matchingSchemeCookiesAllowedSchemes;
    public String[] secureOriginCookiesAllowedSchemes;
    public ContentSettingPatternSource[] settings;
    public ContentSettingPatternSource[] settingsForLegacyCookieAccess;
    public ContentSettingPatternSource[] settingsForStorageAccess;
    public String[] thirdPartyCookiesAllowedSchemes;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CookieManagerParams(int version) {
        super(64, version);
        this.blockThirdPartyCookies = false;
        this.allowFileSchemeCookies = false;
        this.cookieAccessDelegateType = 0;
    }

    public CookieManagerParams() {
        this(0);
    }

    public static CookieManagerParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CookieManagerParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CookieManagerParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CookieManagerParams result = new CookieManagerParams(elementsOrVersion);
            result.blockThirdPartyCookies = decoder0.readBoolean(8, 0);
            result.allowFileSchemeCookies = decoder0.readBoolean(8, 1);
            int readInt = decoder0.readInt(12);
            result.cookieAccessDelegateType = readInt;
            CookieAccessDelegateType.validate(readInt);
            result.cookieAccessDelegateType = CookieAccessDelegateType.toKnownValue(result.cookieAccessDelegateType);
            Decoder decoder1 = decoder0.readPointer(16, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.settings = new ContentSettingPatternSource[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.settings[i1] = ContentSettingPatternSource.decode(decoder2);
            }
            Decoder decoder12 = decoder0.readPointer(24, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.secureOriginCookiesAllowedSchemes = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.secureOriginCookiesAllowedSchemes[i12] = decoder12.readString((i12 * 8) + 8, false);
            }
            Decoder decoder13 = decoder0.readPointer(32, false);
            DataHeader si13 = decoder13.readDataHeaderForPointerArray(-1);
            result.matchingSchemeCookiesAllowedSchemes = new String[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.matchingSchemeCookiesAllowedSchemes[i13] = decoder13.readString((i13 * 8) + 8, false);
            }
            Decoder decoder14 = decoder0.readPointer(40, false);
            DataHeader si14 = decoder14.readDataHeaderForPointerArray(-1);
            result.thirdPartyCookiesAllowedSchemes = new String[si14.elementsOrVersion];
            for (int i14 = 0; i14 < si14.elementsOrVersion; i14++) {
                result.thirdPartyCookiesAllowedSchemes[i14] = decoder14.readString((i14 * 8) + 8, false);
            }
            Decoder decoder15 = decoder0.readPointer(48, false);
            DataHeader si15 = decoder15.readDataHeaderForPointerArray(-1);
            result.settingsForLegacyCookieAccess = new ContentSettingPatternSource[si15.elementsOrVersion];
            for (int i15 = 0; i15 < si15.elementsOrVersion; i15++) {
                Decoder decoder22 = decoder15.readPointer((i15 * 8) + 8, false);
                result.settingsForLegacyCookieAccess[i15] = ContentSettingPatternSource.decode(decoder22);
            }
            Decoder decoder16 = decoder0.readPointer(56, false);
            DataHeader si16 = decoder16.readDataHeaderForPointerArray(-1);
            result.settingsForStorageAccess = new ContentSettingPatternSource[si16.elementsOrVersion];
            for (int i16 = 0; i16 < si16.elementsOrVersion; i16++) {
                Decoder decoder23 = decoder16.readPointer((i16 * 8) + 8, false);
                result.settingsForStorageAccess[i16] = ContentSettingPatternSource.decode(decoder23);
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
        encoder0.encode(this.blockThirdPartyCookies, 8, 0);
        encoder0.encode(this.allowFileSchemeCookies, 8, 1);
        encoder0.encode(this.cookieAccessDelegateType, 12);
        ContentSettingPatternSource[] contentSettingPatternSourceArr = this.settings;
        if (contentSettingPatternSourceArr == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(contentSettingPatternSourceArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ContentSettingPatternSource[] contentSettingPatternSourceArr2 = this.settings;
                if (i0 >= contentSettingPatternSourceArr2.length) {
                    break;
                }
                encoder1.encode((Struct) contentSettingPatternSourceArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        String[] strArr = this.secureOriginCookiesAllowedSchemes;
        if (strArr == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr.length, 24, -1);
            int i02 = 0;
            while (true) {
                String[] strArr2 = this.secureOriginCookiesAllowedSchemes;
                if (i02 >= strArr2.length) {
                    break;
                }
                encoder12.encode(strArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        String[] strArr3 = this.matchingSchemeCookiesAllowedSchemes;
        if (strArr3 == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(strArr3.length, 32, -1);
            int i03 = 0;
            while (true) {
                String[] strArr4 = this.matchingSchemeCookiesAllowedSchemes;
                if (i03 >= strArr4.length) {
                    break;
                }
                encoder13.encode(strArr4[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        String[] strArr5 = this.thirdPartyCookiesAllowedSchemes;
        if (strArr5 == null) {
            encoder0.encodeNullPointer(40, false);
        } else {
            Encoder encoder14 = encoder0.encodePointerArray(strArr5.length, 40, -1);
            int i04 = 0;
            while (true) {
                String[] strArr6 = this.thirdPartyCookiesAllowedSchemes;
                if (i04 >= strArr6.length) {
                    break;
                }
                encoder14.encode(strArr6[i04], (i04 * 8) + 8, false);
                i04++;
            }
        }
        ContentSettingPatternSource[] contentSettingPatternSourceArr3 = this.settingsForLegacyCookieAccess;
        if (contentSettingPatternSourceArr3 == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            Encoder encoder15 = encoder0.encodePointerArray(contentSettingPatternSourceArr3.length, 48, -1);
            int i05 = 0;
            while (true) {
                ContentSettingPatternSource[] contentSettingPatternSourceArr4 = this.settingsForLegacyCookieAccess;
                if (i05 >= contentSettingPatternSourceArr4.length) {
                    break;
                }
                encoder15.encode((Struct) contentSettingPatternSourceArr4[i05], (i05 * 8) + 8, false);
                i05++;
            }
        }
        ContentSettingPatternSource[] contentSettingPatternSourceArr5 = this.settingsForStorageAccess;
        if (contentSettingPatternSourceArr5 == null) {
            encoder0.encodeNullPointer(56, false);
            return;
        }
        Encoder encoder16 = encoder0.encodePointerArray(contentSettingPatternSourceArr5.length, 56, -1);
        int i06 = 0;
        while (true) {
            ContentSettingPatternSource[] contentSettingPatternSourceArr6 = this.settingsForStorageAccess;
            if (i06 < contentSettingPatternSourceArr6.length) {
                encoder16.encode((Struct) contentSettingPatternSourceArr6[i06], (i06 * 8) + 8, false);
                i06++;
            } else {
                return;
            }
        }
    }
}
