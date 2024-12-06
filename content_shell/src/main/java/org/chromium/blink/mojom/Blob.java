package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.network.mojom.DataPipeGetter;
import org.chromium.network.mojom.HttpRequestHeaders;
import org.chromium.network.mojom.UrlLoader;
import org.chromium.network.mojom.UrlLoaderClient;
/* loaded from: classes2.dex */
public interface Blob extends Interface {
    public static final Manager<Blob, Proxy> MANAGER = Blob_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CaptureSnapshotResponse extends Callbacks.Callback2<Long, Time> {
    }

    /* loaded from: classes2.dex */
    public interface GetInternalUuidResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Blob, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadSideDataResponse extends Callbacks.Callback1<BigBuffer> {
    }

    void asDataPipeGetter(InterfaceRequest<DataPipeGetter> interfaceRequest);

    void captureSnapshot(CaptureSnapshotResponse captureSnapshotResponse);

    void clone(InterfaceRequest<Blob> interfaceRequest);

    void getInternalUuid(GetInternalUuidResponse getInternalUuidResponse);

    void load(InterfaceRequest<UrlLoader> interfaceRequest, String str, HttpRequestHeaders httpRequestHeaders, UrlLoaderClient urlLoaderClient);

    void readAll(DataPipe.ProducerHandle producerHandle, BlobReaderClient blobReaderClient);

    void readRange(long j, long j2, DataPipe.ProducerHandle producerHandle, BlobReaderClient blobReaderClient);

    void readSideData(ReadSideDataResponse readSideDataResponse);
}
