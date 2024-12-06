package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface MediaStreamDispatcherHost extends Interface {
    public static final Manager<MediaStreamDispatcherHost, Proxy> MANAGER = MediaStreamDispatcherHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GenerateStreamResponse extends Callbacks.Callback5<Integer, String, MediaStreamDevice[], MediaStreamDevice[], Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface OpenDeviceResponse extends Callbacks.Callback3<Boolean, String, MediaStreamDevice> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaStreamDispatcherHost, Interface.Proxy {
    }

    void cancelRequest(int i);

    void closeDevice(String str);

    void generateStream(int i, StreamControls streamControls, boolean z, StreamSelectionInfo streamSelectionInfo, GenerateStreamResponse generateStreamResponse);

    void onStreamStarted(String str);

    void openDevice(int i, String str, int i2, OpenDeviceResponse openDeviceResponse);

    void setCapturingLinkSecured(UnguessableToken unguessableToken, int i, boolean z);

    void stopStreamDevice(String str, UnguessableToken unguessableToken);
}
