package org.chromium.media;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface EncryptionScheme {
    public static final int CBCS = 2;
    public static final int CENC = 1;
    public static final int MAX_VALUE = 2;
    public static final int UNENCRYPTED = 0;
}
