package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface StorageArea extends Interface {
    public static final Manager<StorageArea, Proxy> MANAGER = StorageArea_Internal.MANAGER;
    public static final int PER_STORAGE_AREA_OVER_QUOTA_ALLOWANCE = 102400;
    public static final int PER_STORAGE_AREA_QUOTA = 10485760;

    /* loaded from: classes2.dex */
    public interface DeleteAllResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllResponse extends Callbacks.Callback1<KeyValue[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetResponse extends Callbacks.Callback2<Boolean, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends StorageArea, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface PutResponse extends Callbacks.Callback1<Boolean> {
    }

    void addObserver(StorageAreaObserver storageAreaObserver);

    void delete(byte[] bArr, byte[] bArr2, String str, DeleteResponse deleteResponse);

    void deleteAll(String str, StorageAreaObserver storageAreaObserver, DeleteAllResponse deleteAllResponse);

    void get(byte[] bArr, GetResponse getResponse);

    void getAll(StorageAreaObserver storageAreaObserver, GetAllResponse getAllResponse);

    void put(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, PutResponse putResponse);
}
