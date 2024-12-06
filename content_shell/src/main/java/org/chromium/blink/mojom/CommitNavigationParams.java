package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.UrlRequestRedirectInfo;
import org.chromium.network.mojom.UrlResponseHead;
import org.chromium.network.mojom.WebClientHintsType;
import org.chromium.network.mojom.WebSandboxFlags;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class CommitNavigationParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 240;
    private static final DataHeader[] VERSION_ARRAY;
    public AppHistoryEntry[] appHistoryBackEntries;
    public AppHistoryEntry[] appHistoryForwardEntries;
    public UnguessableToken appcacheHostId;
    public boolean canLoadLocalResources;
    public int currentHistoryListLength;
    public int currentHistoryListOffset;
    public String dataUrlAsString;
    public long documentUkmSourceId;
    public Url[] earlyHintsPreloadedResources;
    public int[] enabledClientHints;
    public String[] forceEnabledOriginTrials;
    public FramePolicy framePolicy;
    public int httpResponseCode;
    public boolean intendedAsNewEntry;
    public boolean isBrowserInitiated;
    public boolean isCrossSiteCrossBrowsingContextGroup;
    public boolean isOverridingUserAgent;
    public boolean isViewSource;
    public int navEntryId;
    public NavigationTiming navigationTiming;
    public UnguessableToken navigationToken;
    public OldPageInfo oldPageInfo;
    public boolean originAgentCluster;
    public Origin originToCommit;
    public String originalMethod;
    public Url originalUrl;
    public String pageState;
    public int pendingHistoryListOffset;
    public String postContentType;
    public PrefetchedSignedExchangeInfo[] prefetchedSignedExchanges;
    public UrlRequestRedirectInfo[] redirectInfos;
    public UrlResponseHead[] redirectResponse;
    public Url[] redirects;
    public int sandboxFlags;
    public boolean shouldClearHistoryList;
    public StorageKey storageKey;
    public Map<String, Boolean> subframeUniqueNames;
    public int wasActivated;
    public boolean wasDiscarded;
    public Url webBundleClaimedUrl;
    public Url webBundlePhysicalUrl;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(240, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CommitNavigationParams(int version) {
        super(240, version);
        this.sandboxFlags = -1;
        this.isOverridingUserAgent = false;
        this.canLoadLocalResources = false;
        this.navEntryId = 0;
        this.intendedAsNewEntry = false;
        this.pendingHistoryListOffset = -1;
        this.currentHistoryListOffset = -1;
        this.currentHistoryListLength = 0;
        this.wasDiscarded = false;
        this.isViewSource = false;
        this.shouldClearHistoryList = false;
        this.wasActivated = 0;
        this.isBrowserInitiated = false;
        this.originAgentCluster = false;
        this.isCrossSiteCrossBrowsingContextGroup = false;
        this.httpResponseCode = -1;
    }

    public CommitNavigationParams() {
        this(0);
    }

    public static CommitNavigationParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CommitNavigationParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CommitNavigationParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CommitNavigationParams result = new CommitNavigationParams(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, true);
            result.originToCommit = Origin.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.storageKey = StorageKey.decode(decoder12);
            int readInt = decoder0.readInt(24);
            result.sandboxFlags = readInt;
            WebSandboxFlags.validate(readInt);
            result.sandboxFlags = WebSandboxFlags.toKnownValue(result.sandboxFlags);
            result.isOverridingUserAgent = decoder0.readBoolean(28, 0);
            result.canLoadLocalResources = decoder0.readBoolean(28, 1);
            result.intendedAsNewEntry = decoder0.readBoolean(28, 2);
            result.wasDiscarded = decoder0.readBoolean(28, 3);
            result.isViewSource = decoder0.readBoolean(28, 4);
            result.shouldClearHistoryList = decoder0.readBoolean(28, 5);
            result.isBrowserInitiated = decoder0.readBoolean(28, 6);
            result.originAgentCluster = decoder0.readBoolean(28, 7);
            result.isCrossSiteCrossBrowsingContextGroup = decoder0.readBoolean(29, 0);
            Decoder decoder13 = decoder0.readPointer(32, false);
            DataHeader si1 = decoder13.readDataHeaderForPointerArray(-1);
            result.redirects = new Url[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.redirects[i1] = Url.decode(decoder13.readPointer((i1 * 8) + 8, false));
            }
            Decoder decoder14 = decoder0.readPointer(40, false);
            DataHeader si12 = decoder14.readDataHeaderForPointerArray(-1);
            result.redirectResponse = new UrlResponseHead[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.redirectResponse[i12] = UrlResponseHead.decode(decoder14.readPointer((i12 * 8) + 8, false));
            }
            Decoder decoder15 = decoder0.readPointer(48, false);
            DataHeader si13 = decoder15.readDataHeaderForPointerArray(-1);
            result.redirectInfos = new UrlRequestRedirectInfo[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.redirectInfos[i13] = UrlRequestRedirectInfo.decode(decoder15.readPointer((i13 * 8) + 8, false));
            }
            result.postContentType = decoder0.readString(56, false);
            Decoder decoder16 = decoder0.readPointer(64, false);
            result.originalUrl = Url.decode(decoder16);
            result.originalMethod = decoder0.readString(72, false);
            result.pageState = decoder0.readString(80, false);
            result.navEntryId = decoder0.readInt(88);
            result.pendingHistoryListOffset = decoder0.readInt(92);
            Decoder decoder17 = decoder0.readPointer(96, false);
            decoder17.readDataHeaderForMap();
            Decoder decoder2 = decoder17.readPointer(8, false);
            DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
            String[] keys0 = new String[si2.elementsOrVersion];
            for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                keys0[i2] = decoder2.readString((i2 * 8) + 8, false);
            }
            boolean[] values0 = decoder17.readBooleans(16, 0, keys0.length);
            result.subframeUniqueNames = new HashMap();
            for (int index0 = 0; index0 < keys0.length; index0++) {
                result.subframeUniqueNames.put(keys0[index0], Boolean.valueOf(values0[index0]));
            }
            result.currentHistoryListOffset = decoder0.readInt(104);
            result.currentHistoryListLength = decoder0.readInt(108);
            Decoder decoder18 = decoder0.readPointer(112, false);
            result.navigationTiming = NavigationTiming.decode(decoder18);
            Decoder decoder19 = decoder0.readPointer(120, true);
            result.appcacheHostId = UnguessableToken.decode(decoder19);
            int readInt2 = decoder0.readInt(128);
            result.wasActivated = readInt2;
            WasActivatedOption.validate(readInt2);
            result.wasActivated = WasActivatedOption.toKnownValue(result.wasActivated);
            result.httpResponseCode = decoder0.readInt(132);
            Decoder decoder110 = decoder0.readPointer(136, false);
            result.navigationToken = UnguessableToken.decode(decoder110);
            Decoder decoder111 = decoder0.readPointer(144, false);
            DataHeader si14 = decoder111.readDataHeaderForPointerArray(-1);
            result.prefetchedSignedExchanges = new PrefetchedSignedExchangeInfo[si14.elementsOrVersion];
            for (int i14 = 0; i14 < si14.elementsOrVersion; i14++) {
                result.prefetchedSignedExchanges[i14] = PrefetchedSignedExchangeInfo.decode(decoder111.readPointer((i14 * 8) + 8, false));
            }
            result.dataUrlAsString = decoder0.readString(152, false);
            Decoder decoder112 = decoder0.readPointer(160, false);
            result.webBundlePhysicalUrl = Url.decode(decoder112);
            Decoder decoder113 = decoder0.readPointer(168, false);
            result.webBundleClaimedUrl = Url.decode(decoder113);
            result.documentUkmSourceId = decoder0.readLong(176);
            Decoder decoder114 = decoder0.readPointer(184, false);
            result.framePolicy = FramePolicy.decode(decoder114);
            Decoder decoder115 = decoder0.readPointer(192, false);
            DataHeader si15 = decoder115.readDataHeaderForPointerArray(-1);
            result.forceEnabledOriginTrials = new String[si15.elementsOrVersion];
            for (int i15 = 0; i15 < si15.elementsOrVersion; i15++) {
                result.forceEnabledOriginTrials[i15] = decoder115.readString((i15 * 8) + 8, false);
            }
            result.enabledClientHints = decoder0.readInts(200, 0, -1);
            int i16 = 0;
            while (true) {
                int[] iArr = result.enabledClientHints;
                if (i16 >= iArr.length) {
                    break;
                }
                WebClientHintsType.validate(iArr[i16]);
                i16++;
            }
            Decoder decoder116 = decoder0.readPointer(CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, true);
            result.oldPageInfo = OldPageInfo.decode(decoder116);
            Decoder decoder117 = decoder0.readPointer(216, false);
            DataHeader si16 = decoder117.readDataHeaderForPointerArray(-1);
            result.appHistoryBackEntries = new AppHistoryEntry[si16.elementsOrVersion];
            for (int i17 = 0; i17 < si16.elementsOrVersion; i17++) {
                result.appHistoryBackEntries[i17] = AppHistoryEntry.decode(decoder117.readPointer((i17 * 8) + 8, false));
            }
            Decoder decoder118 = decoder0.readPointer(CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, false);
            DataHeader si17 = decoder118.readDataHeaderForPointerArray(-1);
            result.appHistoryForwardEntries = new AppHistoryEntry[si17.elementsOrVersion];
            for (int i18 = 0; i18 < si17.elementsOrVersion; i18++) {
                result.appHistoryForwardEntries[i18] = AppHistoryEntry.decode(decoder118.readPointer((i18 * 8) + 8, false));
            }
            Decoder decoder119 = decoder0.readPointer(232, false);
            DataHeader si18 = decoder119.readDataHeaderForPointerArray(-1);
            result.earlyHintsPreloadedResources = new Url[si18.elementsOrVersion];
            for (int i19 = 0; i19 < si18.elementsOrVersion; i19++) {
                result.earlyHintsPreloadedResources[i19] = Url.decode(decoder119.readPointer((i19 * 8) + 8, false));
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
        encoder0.encode((Struct) this.originToCommit, 8, true);
        encoder0.encode((Struct) this.storageKey, 16, false);
        encoder0.encode(this.sandboxFlags, 24);
        encoder0.encode(this.isOverridingUserAgent, 28, 0);
        encoder0.encode(this.canLoadLocalResources, 28, 1);
        encoder0.encode(this.intendedAsNewEntry, 28, 2);
        encoder0.encode(this.wasDiscarded, 28, 3);
        encoder0.encode(this.isViewSource, 28, 4);
        encoder0.encode(this.shouldClearHistoryList, 28, 5);
        encoder0.encode(this.isBrowserInitiated, 28, 6);
        encoder0.encode(this.originAgentCluster, 28, 7);
        encoder0.encode(this.isCrossSiteCrossBrowsingContextGroup, 29, 0);
        Url[] urlArr = this.redirects;
        if (urlArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(urlArr.length, 32, -1);
            int i0 = 0;
            while (true) {
                Url[] urlArr2 = this.redirects;
                if (i0 >= urlArr2.length) {
                    break;
                }
                encoder1.encode((Struct) urlArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        UrlResponseHead[] urlResponseHeadArr = this.redirectResponse;
        if (urlResponseHeadArr == null) {
            encoder0.encodeNullPointer(40, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(urlResponseHeadArr.length, 40, -1);
            int i02 = 0;
            while (true) {
                UrlResponseHead[] urlResponseHeadArr2 = this.redirectResponse;
                if (i02 >= urlResponseHeadArr2.length) {
                    break;
                }
                encoder12.encode((Struct) urlResponseHeadArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        UrlRequestRedirectInfo[] urlRequestRedirectInfoArr = this.redirectInfos;
        if (urlRequestRedirectInfoArr == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(urlRequestRedirectInfoArr.length, 48, -1);
            int i03 = 0;
            while (true) {
                UrlRequestRedirectInfo[] urlRequestRedirectInfoArr2 = this.redirectInfos;
                if (i03 >= urlRequestRedirectInfoArr2.length) {
                    break;
                }
                encoder13.encode((Struct) urlRequestRedirectInfoArr2[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode(this.postContentType, 56, false);
        encoder0.encode((Struct) this.originalUrl, 64, false);
        encoder0.encode(this.originalMethod, 72, false);
        encoder0.encode(this.pageState, 80, false);
        encoder0.encode(this.navEntryId, 88);
        encoder0.encode(this.pendingHistoryListOffset, 92);
        if (this.subframeUniqueNames == null) {
            encoder0.encodeNullPointer(96, false);
        } else {
            Encoder encoder14 = encoder0.encoderForMap(96);
            int size0 = this.subframeUniqueNames.size();
            String[] keys0 = new String[size0];
            boolean[] values0 = new boolean[size0];
            int index0 = 0;
            for (Map.Entry<String, Boolean> entry0 : this.subframeUniqueNames.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue().booleanValue();
                index0++;
            }
            Encoder encoder2 = encoder14.encodePointerArray(keys0.length, 8, -1);
            for (int i1 = 0; i1 < keys0.length; i1++) {
                encoder2.encode(keys0[i1], (i1 * 8) + 8, false);
            }
            encoder14.encode(values0, 16, 0, -1);
        }
        encoder0.encode(this.currentHistoryListOffset, 104);
        encoder0.encode(this.currentHistoryListLength, 108);
        encoder0.encode((Struct) this.navigationTiming, 112, false);
        encoder0.encode((Struct) this.appcacheHostId, 120, true);
        encoder0.encode(this.wasActivated, 128);
        encoder0.encode(this.httpResponseCode, 132);
        encoder0.encode((Struct) this.navigationToken, 136, false);
        PrefetchedSignedExchangeInfo[] prefetchedSignedExchangeInfoArr = this.prefetchedSignedExchanges;
        if (prefetchedSignedExchangeInfoArr == null) {
            encoder0.encodeNullPointer(144, false);
        } else {
            Encoder encoder15 = encoder0.encodePointerArray(prefetchedSignedExchangeInfoArr.length, 144, -1);
            int i04 = 0;
            while (true) {
                PrefetchedSignedExchangeInfo[] prefetchedSignedExchangeInfoArr2 = this.prefetchedSignedExchanges;
                if (i04 >= prefetchedSignedExchangeInfoArr2.length) {
                    break;
                }
                encoder15.encode((Struct) prefetchedSignedExchangeInfoArr2[i04], (i04 * 8) + 8, false);
                i04++;
            }
        }
        encoder0.encode(this.dataUrlAsString, 152, false);
        encoder0.encode((Struct) this.webBundlePhysicalUrl, 160, false);
        encoder0.encode((Struct) this.webBundleClaimedUrl, 168, false);
        encoder0.encode(this.documentUkmSourceId, 176);
        encoder0.encode((Struct) this.framePolicy, 184, false);
        String[] strArr = this.forceEnabledOriginTrials;
        if (strArr == null) {
            encoder0.encodeNullPointer(192, false);
        } else {
            Encoder encoder16 = encoder0.encodePointerArray(strArr.length, 192, -1);
            int i05 = 0;
            while (true) {
                String[] strArr2 = this.forceEnabledOriginTrials;
                if (i05 >= strArr2.length) {
                    break;
                }
                encoder16.encode(strArr2[i05], (i05 * 8) + 8, false);
                i05++;
            }
        }
        encoder0.encode(this.enabledClientHints, 200, 0, -1);
        encoder0.encode((Struct) this.oldPageInfo, CssSampleId.WEBKIT_BOX_ORDINAL_GROUP, true);
        AppHistoryEntry[] appHistoryEntryArr = this.appHistoryBackEntries;
        if (appHistoryEntryArr == null) {
            encoder0.encodeNullPointer(216, false);
        } else {
            Encoder encoder17 = encoder0.encodePointerArray(appHistoryEntryArr.length, 216, -1);
            int i06 = 0;
            while (true) {
                AppHistoryEntry[] appHistoryEntryArr2 = this.appHistoryBackEntries;
                if (i06 >= appHistoryEntryArr2.length) {
                    break;
                }
                encoder17.encode((Struct) appHistoryEntryArr2[i06], (i06 * 8) + 8, false);
                i06++;
            }
        }
        AppHistoryEntry[] appHistoryEntryArr3 = this.appHistoryForwardEntries;
        if (appHistoryEntryArr3 == null) {
            encoder0.encodeNullPointer(CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, false);
        } else {
            Encoder encoder18 = encoder0.encodePointerArray(appHistoryEntryArr3.length, CssSampleId.ALIAS_WEBKIT_COLUMN_RULE_WIDTH, -1);
            int i07 = 0;
            while (true) {
                AppHistoryEntry[] appHistoryEntryArr4 = this.appHistoryForwardEntries;
                if (i07 >= appHistoryEntryArr4.length) {
                    break;
                }
                encoder18.encode((Struct) appHistoryEntryArr4[i07], (i07 * 8) + 8, false);
                i07++;
            }
        }
        Url[] urlArr3 = this.earlyHintsPreloadedResources;
        if (urlArr3 == null) {
            encoder0.encodeNullPointer(232, false);
            return;
        }
        Encoder encoder19 = encoder0.encodePointerArray(urlArr3.length, 232, -1);
        int i08 = 0;
        while (true) {
            Url[] urlArr4 = this.earlyHintsPreloadedResources;
            if (i08 < urlArr4.length) {
                encoder19.encode((Struct) urlArr4[i08], (i08 * 8) + 8, false);
                i08++;
            } else {
                return;
            }
        }
    }
}
