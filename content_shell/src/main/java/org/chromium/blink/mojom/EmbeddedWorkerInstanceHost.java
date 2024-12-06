package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.String16;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface EmbeddedWorkerInstanceHost extends Interface {
    public static final Manager<EmbeddedWorkerInstanceHost, Proxy> MANAGER = EmbeddedWorkerInstanceHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends EmbeddedWorkerInstanceHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestTerminationResponse extends Callbacks.Callback1<Boolean> {
    }

    void countFeature(int i);

    void onReadyForInspection(DevToolsAgent devToolsAgent, InterfaceRequest<DevToolsAgentHost> interfaceRequest);

    void onReportConsoleMessage(int i, int i2, String16 string16, int i3, Url url);

    void onReportException(String16 string16, int i, int i2, Url url);

    void onScriptEvaluationStart();

    void onScriptLoaded();

    void onStarted(int i, boolean z, int i2, EmbeddedWorkerStartTiming embeddedWorkerStartTiming);

    void onStopped();

    void requestTermination(RequestTerminationResponse requestTerminationResponse);
}
