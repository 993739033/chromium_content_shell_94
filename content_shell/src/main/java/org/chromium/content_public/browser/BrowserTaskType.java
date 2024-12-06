package org.chromium.content_public.browser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface BrowserTaskType {
    public static final int BOOTSTRAP = 1;
    public static final int BROWSER_TASK_TYPE_LAST = 4;
    public static final int DEFAULT = 0;
    public static final int PRECONNECT = 2;
    public static final int USER_INPUT = 3;
}
