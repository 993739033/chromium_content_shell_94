package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PaymentCredential extends Interface {
    public static final Manager<PaymentCredential, Proxy> MANAGER = PaymentCredential_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DownloadIconAndShowUserPromptResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface HideUserPromptResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PaymentCredential, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StorePaymentCredentialAndHideUserPromptResponse extends Callbacks.Callback1<Integer> {
    }

    void downloadIconAndShowUserPrompt(PaymentCredentialInstrument paymentCredentialInstrument, DownloadIconAndShowUserPromptResponse downloadIconAndShowUserPromptResponse);

    void hideUserPrompt(HideUserPromptResponse hideUserPromptResponse);

    void storePaymentCredentialAndHideUserPrompt(PaymentCredentialInstrument paymentCredentialInstrument, byte[] bArr, String str, StorePaymentCredentialAndHideUserPromptResponse storePaymentCredentialAndHideUserPromptResponse);
}
