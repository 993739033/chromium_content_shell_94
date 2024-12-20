package org.chromium.media;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface AndroidVideoCaptureError {
    public static final int ANDROID_API_1_CAMERA_ERROR_CALLBACK_RECEIVED = 68;
    public static final int ANDROID_API_2_CAMERA_DEVICE_ERROR_RECEIVED = 69;
    public static final int ANDROID_API_2_CAPTURE_SESSION_CONFIGURE_FAILED = 70;
    public static final int ANDROID_API_2_ERROR_CONFIGURING_CAMERA = 114;
    public static final int ANDROID_API_2_ERROR_RESTARTING_PREVIEW = 73;
    public static final int ANDROID_API_2_IMAGE_READER_SIZE_DID_NOT_MATCH_IMAGE_SIZE = 72;
    public static final int ANDROID_API_2_IMAGE_READER_UNEXPECTED_IMAGE_FORMAT = 71;
}
