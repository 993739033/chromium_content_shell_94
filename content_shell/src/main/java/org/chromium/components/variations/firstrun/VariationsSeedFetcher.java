package org.chromium.components.variations.firstrun;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Date;
import org.chromium.base.CommandLine;
import org.chromium.base.ContextUtils;
import org.chromium.base.FileUtils;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.metrics.RecordHistogram;
import org.chromium.build.BuildConfig;
import org.chromium.components.variations.VariationsSwitches;
/* loaded from: classes2.dex */
public class VariationsSeedFetcher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int READ_TIMEOUT = 3000;
    private static final int REQUEST_TIMEOUT = 1000;
    private static final int SEED_FETCH_RESULT_INVALID_DATE_HEADER = -4;
    private static final int SEED_FETCH_RESULT_IOEXCEPTION = -1;
    private static final int SEED_FETCH_RESULT_TIMEOUT = -2;
    private static final int SEED_FETCH_RESULT_UNKNOWN_HOST_EXCEPTION = -3;
    private static final String TAG = "VariationsSeedFetch";
    static final String VARIATIONS_INITIALIZED_PREF = "variations_initialized";
    private static final String VARIATIONS_SERVER_URL = "https://clientservices.googleapis.com/chrome-variations/seed?osname=";
    private static VariationsSeedFetcher sInstance;
    private static final Object sLock = new Object();

    /* loaded from: classes2.dex */
    public static class SeedFetchInfo {
        public int seedFetchResult;
        public SeedInfo seedInfo;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface VariationsPlatform {
        public static final int ANDROID = 0;
        public static final int ANDROID_WEBVIEW = 1;
    }

    public static VariationsSeedFetcher get() {
        VariationsSeedFetcher variationsSeedFetcher;
        synchronized (sLock) {
            if (sInstance == null) {
                sInstance = new VariationsSeedFetcher();
            }
            variationsSeedFetcher = sInstance;
        }
        return variationsSeedFetcher;
    }

    public static void setVariationsSeedFetcherForTesting(VariationsSeedFetcher fetcher) {
        sInstance = fetcher;
    }

    protected HttpURLConnection getServerConnection(int platform, String restrictMode, String milestone, String channel) throws MalformedURLException, IOException {
        String urlString = getConnectionString(platform, restrictMode, milestone, channel);
        URL url = new URL(urlString);
        return (HttpURLConnection) url.openConnection();
    }

    protected String getConnectionString(int platform, String restrictMode, String milestone, String channel) {
        String urlString;
        switch (platform) {
            case 0:
                urlString = VARIATIONS_SERVER_URL + "android";
                break;
            case 1:
                urlString = VARIATIONS_SERVER_URL + "android_webview";
                break;
            default:
                throw new AssertionError();
        }
        if (restrictMode != null && !restrictMode.isEmpty()) {
            urlString = urlString + "&restrict=" + restrictMode;
        }
        if (milestone != null && !milestone.isEmpty()) {
            urlString = urlString + "&milestone=" + milestone;
        }
        String forcedChannel = CommandLine.getInstance().getSwitchValue(VariationsSwitches.FAKE_VARIATIONS_CHANNEL);
        if (forcedChannel != null) {
            channel = forcedChannel;
        }
        if (channel != null && !channel.isEmpty()) {
            return urlString + "&channel=" + channel;
        }
        return urlString;
    }

    /* loaded from: classes2.dex */
    public static class SeedInfo {
        public String country;
        public long date;
        public boolean isGzipCompressed;
        public byte[] seedData;
        public String signature;

        public String toString() {
            if (BuildConfig.ENABLE_ASSERTS) {
                return "SeedInfo{signature=\"" + this.signature + "\" country=\"" + this.country + "\" date=\"" + this.date + " isGzipCompressed=" + this.isGzipCompressed + " seedData=" + Arrays.toString(this.seedData);
            }
            return super.toString();
        }
    }

    public void fetchSeed(String restrictMode, String milestone, String channel) {
        if (ThreadUtils.runningOnUiThread()) {
            throw new AssertionError();
        }
        synchronized (sLock) {
            SharedPreferences prefs = ContextUtils.getAppSharedPreferences();
            if (!prefs.getBoolean(VARIATIONS_INITIALIZED_PREF, false) && !VariationsSeedBridge.hasNativePref()) {
                SeedFetchInfo fetchInfo = downloadContent(0, restrictMode, milestone, channel);
                if (fetchInfo.seedInfo != null) {
                    SeedInfo info = fetchInfo.seedInfo;
                    VariationsSeedBridge.setVariationsFirstRunSeed(info.seedData, info.signature, info.country, info.date, info.isGzipCompressed);
                }
                prefs.edit().putBoolean(VARIATIONS_INITIALIZED_PREF, true).apply();
            }
        }
    }

    private void recordFetchResultOrCode(int resultOrCode) {
        RecordHistogram.recordSparseHistogram("Variations.FirstRun.SeedFetchResult", resultOrCode);
    }

    private void recordSeedFetchTime(long timeDeltaMillis) {
        Log.i(TAG, "Fetched first run seed in " + timeDeltaMillis + " ms", new Object[0]);
        RecordHistogram.recordTimesHistogram("Variations.FirstRun.SeedFetchTime", timeDeltaMillis);
    }

    private void recordSeedConnectTime(long timeDeltaMillis) {
        RecordHistogram.recordTimesHistogram("Variations.FirstRun.SeedConnectTime", timeDeltaMillis);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
        if (0 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
        if (0 == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
        if (r4 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SeedFetchInfo downloadContent(int platform, String restrictMode, String milestone, String channel) {
        SeedFetchInfo fetchInfo = new SeedFetchInfo();
        HttpURLConnection connection = null;
        try {
            try {
                try {
                    try {
                        long startTimeMillis = SystemClock.elapsedRealtime();
                        connection = getServerConnection(platform, restrictMode, milestone, channel);
                        connection.setReadTimeout(3000);
                        connection.setConnectTimeout(1000);
                        connection.setDoInput(true);
                        connection.setRequestProperty("A-IM", "gzip");
                        connection.connect();
                        int responseCode = connection.getResponseCode();
                        fetchInfo.seedFetchResult = responseCode;
                        if (responseCode != 200) {
                            String errorMsg = "Non-OK response code = " + responseCode;
                            Log.w(TAG, errorMsg, new Object[0]);
                            throw new IOException(errorMsg);
                        }
                        recordSeedConnectTime(SystemClock.elapsedRealtime() - startTimeMillis);
                        SeedInfo seedInfo = new SeedInfo();
                        seedInfo.seedData = getRawSeed(connection);
                        seedInfo.signature = getHeaderFieldOrEmpty(connection, "X-Seed-Signature");
                        seedInfo.country = getHeaderFieldOrEmpty(connection, "X-Country");
                        seedInfo.date = new Date().getTime();
                        seedInfo.isGzipCompressed = getHeaderFieldOrEmpty(connection, "IM").equals("gzip");
                        recordSeedFetchTime(SystemClock.elapsedRealtime() - startTimeMillis);
                        fetchInfo.seedInfo = seedInfo;
                    } catch (SocketTimeoutException e) {
                        fetchInfo.seedFetchResult = -2;
                        Log.w(TAG, "SocketTimeoutException timeout when fetching variations seed.", e);
                    }
                } catch (UnknownHostException e2) {
                    fetchInfo.seedFetchResult = -3;
                    Log.w(TAG, "UnknownHostException unknown host when fetching variations seed.", e2);
                    if (0 != 0) {
                        connection.disconnect();
                    }
                    recordFetchResultOrCode(fetchInfo.seedFetchResult);
                    return fetchInfo;
                }
            } catch (IOException e3) {
                fetchInfo.seedFetchResult = -1;
                Log.w(TAG, "IOException when fetching variations seed.", e3);
                if (0 != 0) {
                    connection.disconnect();
                }
                recordFetchResultOrCode(fetchInfo.seedFetchResult);
                return fetchInfo;
            }
        } catch (Throwable th) {
        }
        return fetchInfo;
    }

    private String getHeaderFieldOrEmpty(HttpURLConnection connection, String name) {
        String headerField = connection.getHeaderField(name);
        if (headerField == null) {
            return "";
        }
        return headerField.trim();
    }

    private byte[] getRawSeed(HttpURLConnection connection) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = connection.getInputStream();
            return FileUtils.readStream(inputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
