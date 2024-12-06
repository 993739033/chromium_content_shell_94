package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface MediaDrmStorage extends Interface {
    public static final Manager<MediaDrmStorage, Proxy> MANAGER = MediaDrmStorage_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback2<Boolean, UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface LoadPersistentSessionResponse extends Callbacks.Callback1<SessionData> {
    }

    /* loaded from: classes2.dex */
    public interface OnProvisionedResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaDrmStorage, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemovePersistentSessionResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SavePersistentSessionResponse extends Callbacks.Callback1<Boolean> {
    }

    void initialize(InitializeResponse initializeResponse);

    void loadPersistentSession(String str, LoadPersistentSessionResponse loadPersistentSessionResponse);

    void onProvisioned(OnProvisionedResponse onProvisionedResponse);

    void removePersistentSession(String str, RemovePersistentSessionResponse removePersistentSessionResponse);

    void savePersistentSession(String str, SessionData sessionData, SavePersistentSessionResponse savePersistentSessionResponse);
}
