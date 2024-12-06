package org.chromium.media;

import org.chromium.base.Callback;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.MainDex;
@JNINamespace("media")
@MainDex
/* loaded from: classes2.dex */
class MediaDrmStorageBridge {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long INVALID_NATIVE_MEDIA_DRM_STORAGE_BRIDGE = -1;
    private long mNativeMediaDrmStorageBridge;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void onClearInfo(long j, MediaDrmStorageBridge mediaDrmStorageBridge, byte[] bArr, Callback<Boolean> callback);

        void onLoadInfo(long j, MediaDrmStorageBridge mediaDrmStorageBridge, byte[] bArr, Callback<PersistentInfo> callback);

        void onProvisioned(long j, MediaDrmStorageBridge mediaDrmStorageBridge, Callback<Boolean> callback);

        void onSaveInfo(long j, MediaDrmStorageBridge mediaDrmStorageBridge, PersistentInfo persistentInfo, Callback<Boolean> callback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PersistentInfo {
        private final byte[] mEmeId;
        private final byte[] mKeySetId;
        private final int mKeyType;
        private final String mMimeType;

        private static PersistentInfo create(byte[] emeId, byte[] keySetId, String mime, int keyType) {
            return new PersistentInfo(emeId, keySetId, mime, keyType);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PersistentInfo(byte[] emeId, byte[] keySetId, String mime, int keyType) {
            this.mEmeId = emeId;
            this.mKeySetId = keySetId;
            this.mMimeType = mime;
            this.mKeyType = keyType;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public byte[] emeId() {
            return this.mEmeId;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public byte[] keySetId() {
            return this.mKeySetId;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String mimeType() {
            return this.mMimeType;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int keyType() {
            return this.mKeyType;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaDrmStorageBridge(long nativeMediaDrmStorageBridge) {
        this.mNativeMediaDrmStorageBridge = nativeMediaDrmStorageBridge;
        if (!isNativeMediaDrmStorageValid()) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onProvisioned(Callback<Boolean> cb) {
        if (isNativeMediaDrmStorageValid()) {
            MediaDrmStorageBridgeJni.get().onProvisioned(this.mNativeMediaDrmStorageBridge, this, cb);
        } else {
            cb.onResult(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadInfo(byte[] emeId, Callback<PersistentInfo> cb) {
        if (isNativeMediaDrmStorageValid()) {
            MediaDrmStorageBridgeJni.get().onLoadInfo(this.mNativeMediaDrmStorageBridge, this, emeId, cb);
        } else {
            cb.onResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveInfo(PersistentInfo info, Callback<Boolean> cb) {
        if (isNativeMediaDrmStorageValid()) {
            MediaDrmStorageBridgeJni.get().onSaveInfo(this.mNativeMediaDrmStorageBridge, this, info, cb);
        } else {
            cb.onResult(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearInfo(byte[] emeId, Callback<Boolean> cb) {
        if (isNativeMediaDrmStorageValid()) {
            MediaDrmStorageBridgeJni.get().onClearInfo(this.mNativeMediaDrmStorageBridge, this, emeId, cb);
        } else {
            cb.onResult(true);
        }
    }

    private boolean isNativeMediaDrmStorageValid() {
        return this.mNativeMediaDrmStorageBridge != -1;
    }
}
