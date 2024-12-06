package org.chromium.components.crash;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.chromium.base.ThreadUtils;
/* loaded from: classes2.dex */
public class CrashKeys {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String[] KEYS = {"loaded_dynamic_module", "active_dynamic_module", "application_status", "installed_modules", "emulated_modules", "dynamic_module_dex_name", "partner_customization_config"};
    private boolean mFlushed;
    private final AtomicReferenceArray<String> mValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void set(CrashKeys crashKeys, int i, String str);
    }

    /* loaded from: classes2.dex */
    private static class Holder {
        static final CrashKeys INSTANCE = new CrashKeys();

        private Holder() {
        }
    }

    private CrashKeys() {
        String[] strArr = KEYS;
        this.mValues = new AtomicReferenceArray<>(strArr.length);
        if (7 != strArr.length) {
            throw new AssertionError();
        }
    }

    public static CrashKeys getInstance() {
        return Holder.INSTANCE;
    }

    public static String getKey(int keyIndex) {
        return KEYS[keyIndex];
    }

    public AtomicReferenceArray<String> getValues() {
        if (this.mFlushed) {
            throw new AssertionError();
        }
        return this.mValues;
    }

    public void set(int keyIndex, String value) {
        ThreadUtils.assertOnUiThread();
        if (this.mFlushed) {
            CrashKeysJni.get().set(this, keyIndex, value);
        } else {
            this.mValues.set(keyIndex, value);
        }
    }

    public void flushToNative() {
        ThreadUtils.assertOnUiThread();
        if (this.mFlushed) {
            throw new AssertionError();
        }
        for (int i = 0; i < this.mValues.length(); i++) {
            CrashKeysJni.get().set(this, i, this.mValues.getAndSet(i, null));
        }
        this.mFlushed = true;
    }
}
