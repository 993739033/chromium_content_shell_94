package org.chromium.content_public.browser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface ClientDataRequestType {
    public static final int PAYMENT_GET = 4;
    public static final int U2F_REGISTER = 0;
    public static final int U2F_SIGN = 1;
    public static final int WEB_AUTHN_CREATE = 2;
    public static final int WEB_AUTHN_GET = 3;
}
