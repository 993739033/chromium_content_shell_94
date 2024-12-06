package org.chromium.device.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Fingerprint extends Interface {
    public static final Manager<Fingerprint, Proxy> MANAGER = Fingerprint_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CancelCurrentEnrollSessionResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DestroyAllRecordsResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface EndCurrentAuthSessionResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface GetRecordsForUserResponse extends Callbacks.Callback1<Map<String, String>> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Fingerprint, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RemoveRecordResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface RequestRecordLabelResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface RequestTypeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetRecordLabelResponse extends Callbacks.Callback1<Boolean> {
    }

    void addFingerprintObserver(FingerprintObserver fingerprintObserver);

    void cancelCurrentEnrollSession(CancelCurrentEnrollSessionResponse cancelCurrentEnrollSessionResponse);

    void destroyAllRecords(DestroyAllRecordsResponse destroyAllRecordsResponse);

    void endCurrentAuthSession(EndCurrentAuthSessionResponse endCurrentAuthSessionResponse);

    void getRecordsForUser(String str, GetRecordsForUserResponse getRecordsForUserResponse);

    void removeRecord(String str, RemoveRecordResponse removeRecordResponse);

    void requestRecordLabel(String str, RequestRecordLabelResponse requestRecordLabelResponse);

    void requestType(RequestTypeResponse requestTypeResponse);

    void setRecordLabel(String str, String str2, SetRecordLabelResponse setRecordLabelResponse);

    void startAuthSession();

    void startEnrollSession(String str, String str2);
}
