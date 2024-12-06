package org.chromium.media;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64InputStream;
import android.view.Surface;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.StreamUtil;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.task.AsyncTask;
@JNINamespace("media")
/* loaded from: classes2.dex */
public class MediaPlayerBridge {
    private static final String TAG = "media";
    private LoadDataUriTask mLoadDataUriTask;
    private long mNativeMediaPlayerBridge;
    private MediaPlayer mPlayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void onDidSetDataUriDataSource(long j, MediaPlayerBridge mediaPlayerBridge, boolean z);
    }

    private static MediaPlayerBridge create(long nativeMediaPlayerBridge) {
        return new MediaPlayerBridge(nativeMediaPlayerBridge);
    }

    protected MediaPlayerBridge(long nativeMediaPlayerBridge) {
        this.mNativeMediaPlayerBridge = nativeMediaPlayerBridge;
    }

    protected MediaPlayerBridge() {
    }

    protected void destroy() {
        cancelLoadDataUriTask();
        this.mNativeMediaPlayerBridge = 0L;
    }

    protected MediaPlayer getLocalPlayer() {
        if (this.mPlayer == null) {
            this.mPlayer = new MediaPlayer();
        }
        return this.mPlayer;
    }

    protected void setSurface(Surface surface) {
        getLocalPlayer().setSurface(surface);
    }

    protected void setPlaybackRate(double speed) {
        if (Build.VERSION.SDK_INT <= 22) {
            return;
        }
        Log.w(TAG, "Unexpectedly setting playback speed to 0.", new Object[0]);
        try {
            MediaPlayer player = getLocalPlayer();
            player.setPlaybackParams(player.getPlaybackParams().setSpeed((float) speed));
        } catch (IllegalArgumentException iae) {
            Log.e(TAG, "Unable to set playback rate", iae);
        } catch (IllegalStateException ise) {
            Log.e(TAG, "Unable to set playback rate", ise);
        }
    }

    protected boolean prepareAsync() {
        try {
            getLocalPlayer().prepareAsync();
            return true;
        } catch (IllegalStateException ise) {
            Log.e(TAG, "Unable to prepare MediaPlayer.", ise);
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Unable to prepare MediaPlayer.", e);
            return false;
        }
    }

    protected boolean isPlaying() {
        return getLocalPlayer().isPlaying();
    }

    protected int getCurrentPosition() {
        return getLocalPlayer().getCurrentPosition();
    }

    protected int getDuration() {
        return getLocalPlayer().getDuration();
    }

    protected void release() {
        cancelLoadDataUriTask();
        getLocalPlayer().release();
    }

    protected void setVolume(double volume) {
        getLocalPlayer().setVolume((float) volume, (float) volume);
    }

    protected void start() {
        getLocalPlayer().start();
    }

    protected void pause() {
        getLocalPlayer().pause();
    }

    protected void seekTo(int msec) throws IllegalStateException {
        getLocalPlayer().seekTo(msec);
    }

    protected boolean setDataSource(String url, String cookies, String userAgent, boolean hideUrlLog) {
        Uri uri = Uri.parse(url);
        HashMap<String, String> headersMap = new HashMap<>();
        if (hideUrlLog) {
            headersMap.put("x-hide-urls-from-log", "true");
        }
        if (!TextUtils.isEmpty(cookies)) {
            headersMap.put(HttpHeaders.COOKIE, cookies);
        }
        if (!TextUtils.isEmpty(userAgent)) {
            headersMap.put(HttpHeaders.USER_AGENT, userAgent);
        }
        headersMap.put("android-allow-cross-domain-redirect", "0");
        try {
            getLocalPlayer().setDataSource(ContextUtils.getApplicationContext(), uri, headersMap);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean setDataSourceFromFd(int fd, long offset, long length) {
        try {
            ParcelFileDescriptor parcelFd = ParcelFileDescriptor.adoptFd(fd);
            getLocalPlayer().setDataSource(parcelFd.getFileDescriptor(), offset, length);
            parcelFd.close();
            return true;
        } catch (IOException e) {
            Log.e(TAG, "Failed to set data source from file descriptor: " + e, new Object[0]);
            return false;
        }
    }

    protected boolean setDataUriDataSource(String url) {
        int headerStop;
        cancelLoadDataUriTask();
        if (url.startsWith("data:") && (headerStop = url.indexOf(44)) != -1) {
            String header = url.substring(0, headerStop);
            String data = url.substring(headerStop + 1);
            String headerContent = header.substring(5);
            String[] headerInfo = headerContent.split(";");
            if (headerInfo.length == 2 && "base64".equals(headerInfo[1])) {
                LoadDataUriTask loadDataUriTask = new LoadDataUriTask(data);
                this.mLoadDataUriTask = loadDataUriTask;
                loadDataUriTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class LoadDataUriTask extends AsyncTask<Boolean> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final String mData;
        private File mTempFile;

        public LoadDataUriTask(String data) {
            this.mData = data;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.base.task.AsyncTask
        public Boolean doInBackground() {
            FileOutputStream fos = null;
            try {
                this.mTempFile = File.createTempFile("decoded", "mediadata");
                fos = new FileOutputStream(this.mTempFile);
                InputStream stream = new ByteArrayInputStream(ApiCompatibilityUtils.getBytesUtf8(this.mData));
                Base64InputStream decoder = new Base64InputStream(stream, 0);
                byte[] buffer = new byte[1024];
                while (true) {
                    int len = decoder.read(buffer);
                    if (len == -1) {
                        decoder.close();
                        return true;
                    }
                    fos.write(buffer, 0, len);
                }
            } catch (IOException e) {
                return false;
            } finally {
                StreamUtil.closeQuietly(fos);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.base.task.AsyncTask
        public void onPostExecute(Boolean result) {
            if (isCancelled()) {
                deleteFile();
                return;
            }
            if (result.booleanValue()) {
                try {
                    MediaPlayerBridge.this.getLocalPlayer().setDataSource(ContextUtils.getApplicationContext(), Uri.fromFile(this.mTempFile));
                } catch (IOException e) {
                    result = false;
                }
            }
            deleteFile();
            if (MediaPlayerBridge.this.mNativeMediaPlayerBridge == 0) {
                throw new AssertionError();
            }
            MediaPlayerBridgeJni.get().onDidSetDataUriDataSource(MediaPlayerBridge.this.mNativeMediaPlayerBridge, MediaPlayerBridge.this, result.booleanValue());
        }

        private void deleteFile() {
            File file = this.mTempFile;
            if (file != null && !file.delete()) {
                Log.e(MediaPlayerBridge.TAG, "Failed to delete temporary file: " + this.mTempFile, new Object[0]);
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnCompletionListener(MediaPlayer.OnCompletionListener listener) {
        getLocalPlayer().setOnCompletionListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnErrorListener(MediaPlayer.OnErrorListener listener) {
        getLocalPlayer().setOnErrorListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener listener) {
        getLocalPlayer().setOnPreparedListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener listener) {
        getLocalPlayer().setOnVideoSizeChangedListener(listener);
    }

    /* loaded from: classes2.dex */
    protected static class AllowedOperations {
        private final boolean mCanSeekBackward;
        private final boolean mCanSeekForward;

        public AllowedOperations(boolean canSeekForward, boolean canSeekBackward) {
            this.mCanSeekForward = canSeekForward;
            this.mCanSeekBackward = canSeekBackward;
        }

        private boolean canSeekForward() {
            return this.mCanSeekForward;
        }

        private boolean canSeekBackward() {
            return this.mCanSeekBackward;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cc, code lost:
        if (((java.lang.Boolean) r9.invoke(r6, java.lang.Integer.valueOf(r12))).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ba A[Catch: NoSuchFieldException -> 0x00d1, IllegalAccessException -> 0x00e9, InvocationTargetException -> 0x0101, NoSuchMethodException -> 0x0119, TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x00e9, NoSuchFieldException -> 0x00d1, NoSuchMethodException -> 0x0119, InvocationTargetException -> 0x0101, blocks: (B:3:0x0009, B:5:0x0036, B:7:0x008d, B:12:0x00a5, B:14:0x00ba), top: B:29:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AllowedOperations getAllowedOperations() {
        boolean z;
        MediaPlayer player = getLocalPlayer();
        boolean canSeekForward = true;
        boolean canSeekBackward = true;
        boolean z2 = false;
        try {
            Method getMetadata = player.getClass().getDeclaredMethod("getMetadata", Boolean.TYPE, Boolean.TYPE);
            getMetadata.setAccessible(true);
            Object data = getMetadata.invoke(player, false, false);
            if (data != null) {
                Class<?> metadataClass = data.getClass();
                Method hasMethod = metadataClass.getDeclaredMethod("has", Integer.TYPE);
                Method getBooleanMethod = metadataClass.getDeclaredMethod("getBoolean", Integer.TYPE);
                int seekForward = ((Integer) metadataClass.getField("SEEK_FORWARD_AVAILABLE").get(null)).intValue();
                int seekBackward = ((Integer) metadataClass.getField("SEEK_BACKWARD_AVAILABLE").get(null)).intValue();
                hasMethod.setAccessible(true);
                getBooleanMethod.setAccessible(true);
                if (((Boolean) hasMethod.invoke(data, Integer.valueOf(seekForward))).booleanValue() && !((Boolean) getBooleanMethod.invoke(data, Integer.valueOf(seekForward))).booleanValue()) {
                    z = false;
                    canSeekForward = z;
                    if (((Boolean) hasMethod.invoke(data, Integer.valueOf(seekBackward))).booleanValue()) {
                    }
                    z2 = true;
                    canSeekBackward = z2;
                }
                z = true;
                canSeekForward = z;
                if (((Boolean) hasMethod.invoke(data, Integer.valueOf(seekBackward))).booleanValue()) {
                }
                z2 = true;
                canSeekBackward = z2;
            }
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Cannot access metadata: " + e, new Object[0]);
        } catch (NoSuchFieldException e2) {
            Log.e(TAG, "Cannot find matching fields in Metadata class: " + e2, new Object[0]);
        } catch (NoSuchMethodException e3) {
            Log.e(TAG, "Cannot find getMetadata() method: " + e3, new Object[0]);
        } catch (InvocationTargetException e4) {
            Log.e(TAG, "Cannot invoke MediaPlayer.getMetadata() method: " + e4, new Object[0]);
        }
        return new AllowedOperations(canSeekForward, canSeekBackward);
    }

    private void cancelLoadDataUriTask() {
        LoadDataUriTask loadDataUriTask = this.mLoadDataUriTask;
        if (loadDataUriTask != null) {
            loadDataUriTask.cancel(true);
            this.mLoadDataUriTask = null;
        }
    }
}
