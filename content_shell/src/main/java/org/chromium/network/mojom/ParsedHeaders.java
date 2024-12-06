package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public final class ParsedHeaders extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 112;
    private static final DataHeader[] VERSION_ARRAY;
    public int[] acceptCh;
    public TimeDelta acceptChLifetime;
    public AllowCspFromHeaderValue allowCspFrom;
    public boolean bfcacheOptInUnload;
    public ContentSecurityPolicy[] contentSecurityPolicy;
    public int[] criticalCh;
    public CrossOriginEmbedderPolicy crossOriginEmbedderPolicy;
    public CrossOriginOpenerPolicy crossOriginOpenerPolicy;
    public LinkHeader[] linkHeaders;
    public boolean originAgentCluster;
    public Map<String, String> reportingEndpoints;
    public TimingAllowOrigin timingAllowOrigin;
    public int xfo;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(112, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ParsedHeaders(int version) {
        super(112, version);
        this.originAgentCluster = false;
        this.xfo = 0;
        this.bfcacheOptInUnload = false;
    }

    public ParsedHeaders() {
        this(0);
    }

    public static ParsedHeaders deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ParsedHeaders deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ParsedHeaders decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ParsedHeaders result = new ParsedHeaders(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.contentSecurityPolicy = new ContentSecurityPolicy[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.contentSecurityPolicy[i1] = ContentSecurityPolicy.decode(decoder1.readPointer((i1 * 8) + 8, false));
            }
            result.allowCspFrom = AllowCspFromHeaderValue.decode(decoder0, 16);
            result.crossOriginEmbedderPolicy = CrossOriginEmbedderPolicy.decode(decoder0.readPointer(32, false));
            result.crossOriginOpenerPolicy = CrossOriginOpenerPolicy.decode(decoder0.readPointer(40, false));
            result.originAgentCluster = decoder0.readBoolean(48, 0);
            result.bfcacheOptInUnload = decoder0.readBoolean(48, 1);
            int readInt = decoder0.readInt(52);
            result.xfo = readInt;
            XFrameOptionsValue.validate(readInt);
            result.xfo = XFrameOptionsValue.toKnownValue(result.xfo);
            int[] readInts = decoder0.readInts(56, 1, -1);
            result.acceptCh = readInts;
            if (readInts != null) {
                int i12 = 0;
                while (true) {
                    int[] iArr = result.acceptCh;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    WebClientHintsType.validate(iArr[i12]);
                    i12++;
                }
            }
            result.acceptChLifetime = TimeDelta.decode(decoder0.readPointer(64, false));
            int[] readInts2 = decoder0.readInts(72, 1, -1);
            result.criticalCh = readInts2;
            if (readInts2 != null) {
                int i13 = 0;
                while (true) {
                    int[] iArr2 = result.criticalCh;
                    if (i13 >= iArr2.length) {
                        break;
                    }
                    WebClientHintsType.validate(iArr2[i13]);
                    i13++;
                }
            }
            Decoder decoder12 = decoder0.readPointer(80, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.linkHeaders = new LinkHeader[si12.elementsOrVersion];
            for (int i14 = 0; i14 < si12.elementsOrVersion; i14++) {
                result.linkHeaders[i14] = LinkHeader.decode(decoder12.readPointer((i14 * 8) + 8, false));
            }
            result.timingAllowOrigin = TimingAllowOrigin.decode(decoder0, 88);
            Decoder decoder13 = decoder0.readPointer(104, true);
            if (decoder13 == null) {
                result.reportingEndpoints = null;
            } else {
                decoder13.readDataHeaderForMap();
                Decoder decoder2 = decoder13.readPointer(8, false);
                DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
                String[] keys0 = new String[si2.elementsOrVersion];
                for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                    keys0[i2] = decoder2.readString((i2 * 8) + 8, false);
                }
                Decoder decoder22 = decoder13.readPointer(16, false);
                DataHeader si22 = decoder22.readDataHeaderForPointerArray(keys0.length);
                String[] values0 = new String[si22.elementsOrVersion];
                for (int i22 = 0; i22 < si22.elementsOrVersion; i22++) {
                    values0[i22] = decoder22.readString((i22 * 8) + 8, false);
                }
                result.reportingEndpoints = new HashMap();
                for (int index0 = 0; index0 < keys0.length; index0++) {
                    result.reportingEndpoints.put(keys0[index0], values0[index0]);
                }
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
        ContentSecurityPolicy[] contentSecurityPolicyArr = this.contentSecurityPolicy;
        if (contentSecurityPolicyArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(contentSecurityPolicyArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                ContentSecurityPolicy[] contentSecurityPolicyArr2 = this.contentSecurityPolicy;
                if (i0 >= contentSecurityPolicyArr2.length) {
                    break;
                }
                encoder1.encode((Struct) contentSecurityPolicyArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode((Union) this.allowCspFrom, 16, true);
        encoder0.encode((Struct) this.crossOriginEmbedderPolicy, 32, false);
        encoder0.encode((Struct) this.crossOriginOpenerPolicy, 40, false);
        encoder0.encode(this.originAgentCluster, 48, 0);
        encoder0.encode(this.bfcacheOptInUnload, 48, 1);
        encoder0.encode(this.xfo, 52);
        encoder0.encode(this.acceptCh, 56, 1, -1);
        encoder0.encode((Struct) this.acceptChLifetime, 64, false);
        encoder0.encode(this.criticalCh, 72, 1, -1);
        LinkHeader[] linkHeaderArr = this.linkHeaders;
        if (linkHeaderArr == null) {
            encoder0.encodeNullPointer(80, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(linkHeaderArr.length, 80, -1);
            int i02 = 0;
            while (true) {
                LinkHeader[] linkHeaderArr2 = this.linkHeaders;
                if (i02 >= linkHeaderArr2.length) {
                    break;
                }
                encoder12.encode((Struct) linkHeaderArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode((Union) this.timingAllowOrigin, 88, true);
        if (this.reportingEndpoints == null) {
            encoder0.encodeNullPointer(104, true);
            return;
        }
        Encoder encoder13 = encoder0.encoderForMap(104);
        int size0 = this.reportingEndpoints.size();
        String[] keys0 = new String[size0];
        String[] values0 = new String[size0];
        int index0 = 0;
        for (Map.Entry<String, String> entry0 : this.reportingEndpoints.entrySet()) {
            keys0[index0] = entry0.getKey();
            values0[index0] = entry0.getValue();
            index0++;
        }
        Encoder encoder2 = encoder13.encodePointerArray(keys0.length, 8, -1);
        for (int i1 = 0; i1 < keys0.length; i1++) {
            encoder2.encode(keys0[i1], (i1 * 8) + 8, false);
        }
        Encoder encoder22 = encoder13.encodePointerArray(values0.length, 16, -1);
        for (int i12 = 0; i12 < values0.length; i12++) {
            encoder22.encode(values0[i12], (i12 * 8) + 8, false);
        }
    }
}
