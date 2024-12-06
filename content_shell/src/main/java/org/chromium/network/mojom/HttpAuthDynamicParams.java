package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class HttpAuthDynamicParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean allowGssapiLibraryLoad;
    public String androidNegotiateAccountType;
    public boolean basicOverHttpEnabled;
    public String delegateAllowlist;
    public boolean delegateByKdcPolicy;
    public boolean enableNegotiatePort;
    public boolean negotiateDisableCnameLookup;
    public boolean ntlmV2Enabled;
    public String serverAllowlist;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private HttpAuthDynamicParams(int version) {
        super(40, version);
        this.delegateByKdcPolicy = false;
        this.negotiateDisableCnameLookup = false;
        this.enableNegotiatePort = false;
        this.ntlmV2Enabled = true;
        this.allowGssapiLibraryLoad = true;
        this.basicOverHttpEnabled = true;
    }

    public HttpAuthDynamicParams() {
        this(0);
    }

    public static HttpAuthDynamicParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static HttpAuthDynamicParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static HttpAuthDynamicParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            HttpAuthDynamicParams result = new HttpAuthDynamicParams(elementsOrVersion);
            result.serverAllowlist = decoder0.readString(8, false);
            result.delegateAllowlist = decoder0.readString(16, false);
            result.delegateByKdcPolicy = decoder0.readBoolean(24, 0);
            result.negotiateDisableCnameLookup = decoder0.readBoolean(24, 1);
            result.enableNegotiatePort = decoder0.readBoolean(24, 2);
            result.ntlmV2Enabled = decoder0.readBoolean(24, 3);
            result.allowGssapiLibraryLoad = decoder0.readBoolean(24, 4);
            result.basicOverHttpEnabled = decoder0.readBoolean(24, 5);
            result.androidNegotiateAccountType = decoder0.readString(32, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.serverAllowlist, 8, false);
        encoder0.encode(this.delegateAllowlist, 16, false);
        encoder0.encode(this.delegateByKdcPolicy, 24, 0);
        encoder0.encode(this.negotiateDisableCnameLookup, 24, 1);
        encoder0.encode(this.enableNegotiatePort, 24, 2);
        encoder0.encode(this.ntlmV2Enabled, 24, 3);
        encoder0.encode(this.allowGssapiLibraryLoad, 24, 4);
        encoder0.encode(this.basicOverHttpEnabled, 24, 5);
        encoder0.encode(this.androidNegotiateAccountType, 32, false);
    }
}
