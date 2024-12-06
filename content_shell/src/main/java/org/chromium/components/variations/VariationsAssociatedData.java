package org.chromium.components.variations;

import java.util.HashMap;
import org.chromium.base.annotations.JNINamespace;
@JNINamespace("variations::android")
/* loaded from: classes2.dex */
public final class VariationsAssociatedData {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        String getFeedbackVariations();

        String getGoogleAppVariations();

        String getVariationParamValue(String str, String str2);
    }

    private VariationsAssociatedData() {
    }

    public static String getVariationParamValue(String trialName, String paramName) {
        return VariationsAssociatedDataJni.get().getVariationParamValue(trialName, paramName);
    }

    public static HashMap<String, String> getFeedbackMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chrome Variations", VariationsAssociatedDataJni.get().getFeedbackVariations());
        return map;
    }

    public static String getGoogleAppVariations() {
        String variations = VariationsAssociatedDataJni.get().getGoogleAppVariations();
        return variations;
    }
}
