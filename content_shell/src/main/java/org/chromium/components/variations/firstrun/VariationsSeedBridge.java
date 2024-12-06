package org.chromium.components.variations.firstrun;

import android.util.Base64;
import org.chromium.base.ContextUtils;
import org.chromium.base.metrics.RecordHistogram;
/* loaded from: classes2.dex */
public class VariationsSeedBridge {
    private static final int DEBUG_PREFS_CLEARED = 1;
    private static final int DEBUG_PREFS_CLEARED_NON_EMPTY = 4;
    private static final int DEBUG_PREFS_MAX = 5;
    private static final int DEBUG_PREFS_RETRIEVED_DATA_EMPTY = 2;
    private static final int DEBUG_PREFS_RETRIEVED_DATA_NON_EMPTY = 3;
    private static final int DEBUG_PREFS_STORED = 0;
    protected static final String VARIATIONS_FIRST_RUN_SEED_BASE64 = "variations_seed_base64";
    protected static final String VARIATIONS_FIRST_RUN_SEED_COUNTRY = "variations_seed_country";
    protected static final String VARIATIONS_FIRST_RUN_SEED_DATE = "variations_seed_date_ms";
    protected static final String VARIATIONS_FIRST_RUN_SEED_IS_GZIP_COMPRESSED = "variations_seed_is_gzip_compressed";
    protected static final String VARIATIONS_FIRST_RUN_SEED_NATIVE_STORED = "variations_seed_native_stored";
    protected static final String VARIATIONS_FIRST_RUN_SEED_SIGNATURE = "variations_seed_signature";

    private static void logDebugHistogram(int value) {
        RecordHistogram.recordEnumeratedHistogram("Variations.FirstRunPrefsDebug", value, 5);
    }

    protected static String getVariationsFirstRunSeedPref(String prefName) {
        return ContextUtils.getAppSharedPreferences().getString(prefName, "");
    }

    public static void setVariationsFirstRunSeed(byte[] rawSeed, String signature, String country, long date, boolean isGzipCompressed) {
        ContextUtils.getAppSharedPreferences().edit().putString(VARIATIONS_FIRST_RUN_SEED_BASE64, Base64.encodeToString(rawSeed, 2)).putString(VARIATIONS_FIRST_RUN_SEED_SIGNATURE, signature).putString(VARIATIONS_FIRST_RUN_SEED_COUNTRY, country).putLong(VARIATIONS_FIRST_RUN_SEED_DATE, date).putBoolean(VARIATIONS_FIRST_RUN_SEED_IS_GZIP_COMPRESSED, isGzipCompressed).apply();
        logDebugHistogram(0);
    }

    private static void clearFirstRunPrefs() {
        if (hasJavaPref()) {
            logDebugHistogram(4);
        }
        ContextUtils.getAppSharedPreferences().edit().remove(VARIATIONS_FIRST_RUN_SEED_BASE64).remove(VARIATIONS_FIRST_RUN_SEED_SIGNATURE).remove(VARIATIONS_FIRST_RUN_SEED_COUNTRY).remove(VARIATIONS_FIRST_RUN_SEED_DATE).remove(VARIATIONS_FIRST_RUN_SEED_IS_GZIP_COMPRESSED).apply();
        logDebugHistogram(1);
    }

    public static boolean hasJavaPref() {
        return !ContextUtils.getAppSharedPreferences().getString(VARIATIONS_FIRST_RUN_SEED_BASE64, "").isEmpty();
    }

    public static boolean hasNativePref() {
        return ContextUtils.getAppSharedPreferences().getBoolean(VARIATIONS_FIRST_RUN_SEED_NATIVE_STORED, false);
    }

    private static void markVariationsSeedAsStored() {
        ContextUtils.getAppSharedPreferences().edit().putBoolean(VARIATIONS_FIRST_RUN_SEED_NATIVE_STORED, true).apply();
    }

    private static byte[] getVariationsFirstRunSeedData() {
        int i = 2;
        byte[] data = Base64.decode(getVariationsFirstRunSeedPref(VARIATIONS_FIRST_RUN_SEED_BASE64), 2);
        if (data.length != 0) {
            i = 3;
        }
        logDebugHistogram(i);
        return data;
    }

    private static String getVariationsFirstRunSeedSignature() {
        return getVariationsFirstRunSeedPref(VARIATIONS_FIRST_RUN_SEED_SIGNATURE);
    }

    private static String getVariationsFirstRunSeedCountry() {
        return getVariationsFirstRunSeedPref(VARIATIONS_FIRST_RUN_SEED_COUNTRY);
    }

    private static long getVariationsFirstRunSeedDate() {
        return ContextUtils.getAppSharedPreferences().getLong(VARIATIONS_FIRST_RUN_SEED_DATE, 0L);
    }

    private static boolean getVariationsFirstRunSeedIsGzipCompressed() {
        return ContextUtils.getAppSharedPreferences().getBoolean(VARIATIONS_FIRST_RUN_SEED_IS_GZIP_COMPRESSED, false);
    }
}
