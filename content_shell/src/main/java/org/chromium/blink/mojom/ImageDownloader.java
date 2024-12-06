package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.skia.mojom.BitmapN32;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ImageDownloader extends Interface {
    public static final Manager<ImageDownloader, Proxy> MANAGER = ImageDownloader_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DownloadImageResponse extends Callbacks.Callback3<Integer, BitmapN32[], Size[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ImageDownloader, Interface.Proxy {
    }

    void downloadImage(Url url, boolean z, int i, int i2, boolean z2, DownloadImageResponse downloadImageResponse);
}
