package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AudioStreamFactory extends Interface {
    public static final Manager<AudioStreamFactory, Proxy> MANAGER = AudioStreamFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateInputStreamResponse extends Callbacks.Callback3<ReadOnlyAudioDataPipe, Boolean, UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface CreateLoopbackStreamResponse extends Callbacks.Callback1<ReadOnlyAudioDataPipe> {
    }

    /* loaded from: classes2.dex */
    public interface CreateOutputStreamResponse extends Callbacks.Callback1<ReadWriteAudioDataPipe> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AudioStreamFactory, Interface.Proxy {
    }

    void associateInputAndOutputForAec(UnguessableToken unguessableToken, String str);

    void bindMuter(AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, UnguessableToken unguessableToken);

    void createInputStream(InterfaceRequest<AudioInputStream> interfaceRequest, AudioInputStreamClient audioInputStreamClient, AudioInputStreamObserver audioInputStreamObserver, AudioLog audioLog, String str, AudioParameters audioParameters, int i, boolean z, ReadOnlySharedMemoryRegion readOnlySharedMemoryRegion, CreateInputStreamResponse createInputStreamResponse);

    void createLoopbackStream(InterfaceRequest<AudioInputStream> interfaceRequest, AudioInputStreamClient audioInputStreamClient, AudioInputStreamObserver audioInputStreamObserver, AudioParameters audioParameters, int i, UnguessableToken unguessableToken, CreateLoopbackStreamResponse createLoopbackStreamResponse);

    void createOutputStream(InterfaceRequest<AudioOutputStream> interfaceRequest, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AudioLog audioLog, String str, AudioParameters audioParameters, UnguessableToken unguessableToken, CreateOutputStreamResponse createOutputStreamResponse);
}
