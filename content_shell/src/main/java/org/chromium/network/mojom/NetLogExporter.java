package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.DictionaryValue;
import org.chromium.mojo_base.mojom.File;
/* loaded from: classes2.dex */
public interface NetLogExporter extends Interface {
    public static final Manager<NetLogExporter, Proxy> MANAGER = NetLogExporter_Internal.MANAGER;
    public static final long UNLIMITED_FILE_SIZE = -1;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetLogExporter, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StartResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface StopResponse extends Callbacks.Callback1<Integer> {
    }

    void start(File file, DictionaryValue dictionaryValue, int i, long j, StartResponse startResponse);

    void stop(DictionaryValue dictionaryValue, StopResponse stopResponse);
}
