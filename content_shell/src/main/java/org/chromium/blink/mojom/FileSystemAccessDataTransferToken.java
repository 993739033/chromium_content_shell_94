package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface FileSystemAccessDataTransferToken extends Interface {
    public static final Manager<FileSystemAccessDataTransferToken, Proxy> MANAGER = FileSystemAccessDataTransferToken_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetInternalIdResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessDataTransferToken, Interface.Proxy {
    }

    void clone(InterfaceRequest<FileSystemAccessDataTransferToken> interfaceRequest);

    void getInternalId(GetInternalIdResponse getInternalIdResponse);
}
