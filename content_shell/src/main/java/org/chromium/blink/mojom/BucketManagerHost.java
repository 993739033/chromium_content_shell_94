package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BucketManagerHost extends Interface {
    public static final Manager<BucketManagerHost, Proxy> MANAGER = BucketManagerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteBucketResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface KeysResponse extends Callbacks.Callback2<String[], Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface OpenBucketResponse extends Callbacks.Callback1<BucketHost> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BucketManagerHost, Interface.Proxy {
    }

    void deleteBucket(String str, DeleteBucketResponse deleteBucketResponse);

    void keys(KeysResponse keysResponse);

    void openBucket(String str, BucketPolicies bucketPolicies, OpenBucketResponse openBucketResponse);
}
