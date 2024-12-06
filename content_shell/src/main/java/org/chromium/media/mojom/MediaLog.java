package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaLog extends Interface {
    public static final Manager<MediaLog, Proxy> MANAGER = MediaLog_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaLog, Interface.Proxy {
    }

    void addLogRecord(MediaLogRecord mediaLogRecord);
}
