package org.chromium.content_public.browser.test;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.base.annotations.JNINamespace;
@JNINamespace("content")
/* loaded from: classes2.dex */
public class NestedSystemMessageHandler {
    private static final int QUIT_MESSAGE = 10;
    private static final Handler sHandler = new Handler();

    private NestedSystemMessageHandler() {
    }

//    private static boolean dispatchOneMessage() {
//        try {
//            LooperUtils.runSingleNestedLooperTask();
//            return true;
//        } catch (IllegalAccessException | IllegalArgumentException | SecurityException | InvocationTargetException e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

    private static void postQuitMessage() {
        Handler handler = sHandler;
        handler.sendMessage(handler.obtainMessage(10));
    }
}
