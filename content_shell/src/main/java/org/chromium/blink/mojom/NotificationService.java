package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NotificationService extends Interface {
    public static final Manager<NotificationService, Proxy> MANAGER = NotificationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DisplayPersistentNotificationResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetNotificationsResponse extends Callbacks.Callback2<String[], NotificationData[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetPermissionStatusResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NotificationService, Interface.Proxy {
    }

    void closeNonPersistentNotification(String str);

    void closePersistentNotification(String str);

    void displayNonPersistentNotification(String str, NotificationData notificationData, NotificationResources notificationResources, NonPersistentNotificationListener nonPersistentNotificationListener);

    void displayPersistentNotification(long j, NotificationData notificationData, NotificationResources notificationResources, DisplayPersistentNotificationResponse displayPersistentNotificationResponse);

    void getNotifications(long j, String str, boolean z, GetNotificationsResponse getNotificationsResponse);

    void getPermissionStatus(GetPermissionStatusResponse getPermissionStatusResponse);
}
