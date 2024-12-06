package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface PresentationService extends Interface {
    public static final Manager<PresentationService, Proxy> MANAGER = PresentationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PresentationService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReconnectPresentationResponse extends Callbacks.Callback2<PresentationConnectionResult, PresentationError> {
    }

    /* loaded from: classes2.dex */
    public interface StartPresentationResponse extends Callbacks.Callback2<PresentationConnectionResult, PresentationError> {
    }

    void closeConnection(Url url, String str);

    void listenForScreenAvailability(Url url);

    void reconnectPresentation(Url[] urlArr, String str, ReconnectPresentationResponse reconnectPresentationResponse);

    void setController(PresentationController presentationController);

    void setDefaultPresentationUrls(Url[] urlArr);

    void setReceiver(PresentationReceiver presentationReceiver);

    void startPresentation(Url[] urlArr, StartPresentationResponse startPresentationResponse);

    void stopListeningForScreenAvailability(Url url);

    void terminate(Url url, String str);
}
