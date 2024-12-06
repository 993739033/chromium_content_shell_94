package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface FileSystemAccessTransferToken extends Interface {
    public static final Manager<FileSystemAccessTransferToken, Proxy> MANAGER = FileSystemAccessTransferToken_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetInternalIdResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessTransferToken, Interface.Proxy {
    }

    void clone(InterfaceRequest<FileSystemAccessTransferToken> interfaceRequest);

    void getInternalId(GetInternalIdResponse getInternalIdResponse);
}
