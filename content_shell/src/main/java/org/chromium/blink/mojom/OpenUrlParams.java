package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.network.mojom.SourceLocation;
import org.chromium.network.mojom.UrlRequestBody;
import org.chromium.ui.mojom.WindowOpenDisposition;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class OpenUrlParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 120;
    private static final DataHeader[] VERSION_ARRAY;
    public BlobUrlToken blobUrlToken;
    public int disposition;
    public NavigationDownloadPolicy downloadPolicy;
    public String extraHeaders;
    public String hrefTranslate;
    public Impression impression;
    public LocalFrameToken initiatorFrameToken;
    public Origin initiatorOrigin;
    public PolicyContainerHostKeepAliveHandle initiatorPolicyContainerKeepAliveHandle;
    public UrlRequestBody postBody;
    public Referrer referrer;
    public boolean shouldReplaceCurrentEntry;
    public SourceLocation sourceLocation;
    public int triggeringEventInfo;
    public Url url;
    public boolean userGesture;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(120, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private OpenUrlParams(int version) {
        super(120, version);
    }

    public OpenUrlParams() {
        this(0);
    }

    public static OpenUrlParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static OpenUrlParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static OpenUrlParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            OpenUrlParams result = new OpenUrlParams(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.url = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.initiatorOrigin = Origin.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, true);
            result.initiatorFrameToken = LocalFrameToken.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, true);
            result.postBody = UrlRequestBody.decode(decoder14);
            result.extraHeaders = decoder0.readString(40, false);
            Decoder decoder15 = decoder0.readPointer(48, false);
            result.referrer = Referrer.decode(decoder15);
            int readInt = decoder0.readInt(56);
            result.disposition = readInt;
            WindowOpenDisposition.validate(readInt);
            result.disposition = WindowOpenDisposition.toKnownValue(result.disposition);
            result.shouldReplaceCurrentEntry = decoder0.readBoolean(60, 0);
            result.userGesture = decoder0.readBoolean(60, 1);
            int readInt2 = decoder0.readInt(64);
            result.triggeringEventInfo = readInt2;
            TriggeringEventInfo.validate(readInt2);
            result.triggeringEventInfo = TriggeringEventInfo.toKnownValue(result.triggeringEventInfo);
            result.blobUrlToken = (BlobUrlToken) decoder0.readServiceInterface(68, true, BlobUrlToken.MANAGER);
            result.hrefTranslate = decoder0.readString(80, false);
            Decoder decoder16 = decoder0.readPointer(88, true);
            result.impression = Impression.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(96, false);
            result.downloadPolicy = NavigationDownloadPolicy.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(104, false);
            result.sourceLocation = SourceLocation.decode(decoder18);
            result.initiatorPolicyContainerKeepAliveHandle = (PolicyContainerHostKeepAliveHandle) decoder0.readServiceInterface(112, true, PolicyContainerHostKeepAliveHandle.MANAGER);
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
        encoder0.encode((Struct) this.initiatorOrigin, 16, false);
        encoder0.encode((Struct) this.initiatorFrameToken, 24, true);
        encoder0.encode((Struct) this.postBody, 32, true);
        encoder0.encode(this.extraHeaders, 40, false);
        encoder0.encode((Struct) this.referrer, 48, false);
        encoder0.encode(this.disposition, 56);
        encoder0.encode(this.shouldReplaceCurrentEntry, 60, 0);
        encoder0.encode(this.userGesture, 60, 1);
        encoder0.encode(this.triggeringEventInfo, 64);
        encoder0.encode(this.blobUrlToken, 68, true,  BlobUrlToken.MANAGER);
        encoder0.encode(this.hrefTranslate, 80, false);
        encoder0.encode((Struct) this.impression, 88, true);
        encoder0.encode((Struct) this.downloadPolicy, 96, false);
        encoder0.encode((Struct) this.sourceLocation, 104, false);
        encoder0.encode(this.initiatorPolicyContainerKeepAliveHandle, 112, true,  PolicyContainerHostKeepAliveHandle.MANAGER);
    }
}
