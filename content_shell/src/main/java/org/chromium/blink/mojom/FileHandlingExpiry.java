package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public interface FileHandlingExpiry extends Interface {
    public static final Manager<FileHandlingExpiry, Proxy> MANAGER = FileHandlingExpiry_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FileHandlingExpiry, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestOriginTrialExpiryTimeResponse extends Callbacks.Callback1<Time> {
    }

    void requestOriginTrialExpiryTime(RequestOriginTrialExpiryTimeResponse requestOriginTrialExpiryTimeResponse);
}
