package org.chromium.content_public.browser.bluetooth_scanning;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface Event {
    public static final int ALLOW = 0;
    public static final int BLOCK = 1;
    public static final int CANCELED = 2;
}
