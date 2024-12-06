package org.chromium.components.viz.service.gl;

import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.MainDex;
@MainDex
/* loaded from: classes2.dex */
abstract class ThrowUncaughtException {
    ThrowUncaughtException() {
    }

    private static void post() {
        ThreadUtils.postOnUiThread(new Runnable() { // from class: org.chromium.components.viz.service.gl.ThrowUncaughtException.1
            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException("Intentional exception not caught by JNI");
            }
        });
    }
}
