package org.chromium.android.support;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import java.util.List;
/* loaded from: classes.dex */
public class PackageManagerWrapper extends PackageManager {
    private PackageManager mWrapped;

    public PackageManagerWrapper(PackageManager wrapped) {
        this.mWrapped = wrapped;
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public void addPackageToPreferred(String packageName) {
        this.mWrapped.addPackageToPreferred(packageName);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermission(PermissionInfo info) {
        return this.mWrapped.addPermission(info);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermissionAsync(PermissionInfo info) {
        return this.mWrapped.addPermissionAsync(info);
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public void addPreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) {
        this.mWrapped.addPreferredActivity(filter, match, set, activity);
    }

    @Override // android.content.pm.PackageManager
    public String[] canonicalToCurrentPackageNames(String[] names) {
        return this.mWrapped.canonicalToCurrentPackageNames(names);
    }

    @Override // android.content.pm.PackageManager
    public int checkPermission(String permName, String pkgName) {
        return this.mWrapped.checkPermission(permName, pkgName);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(String pkg1, String pkg2) {
        return this.mWrapped.checkSignatures(pkg1, pkg2);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(int uid1, int uid2) {
        return this.mWrapped.checkSignatures(uid1, uid2);
    }

    @Override // android.content.pm.PackageManager
    public void clearInstantAppCookie() {
        this.mWrapped.clearInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    public String[] currentToCanonicalPackageNames(String[] names) {
        return this.mWrapped.currentToCanonicalPackageNames(names);
    }

    @Override // android.content.pm.PackageManager
    public ActivityInfo getActivityInfo(ComponentName component, int flags) throws NameNotFoundException {
        return this.mWrapped.getActivityInfo(component, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<PermissionGroupInfo> getAllPermissionGroups(int flags) {
        return this.mWrapped.getAllPermissionGroups(flags);
    }

    @Override // android.content.pm.PackageManager
    public ApplicationInfo getApplicationInfo(String packageName, int flags) throws NameNotFoundException {
        return this.mWrapped.getApplicationInfo(packageName, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getInstalledPackages(int flags) {
        return this.mWrapped.getInstalledPackages(flags);
    }

    @Override // android.content.pm.PackageManager
    public Intent getLaunchIntentForPackage(String packageName) {
        return this.mWrapped.getLaunchIntentForPackage(packageName);
    }

    @Override // android.content.pm.PackageManager
    public Intent getLeanbackLaunchIntentForPackage(String packageName) {
        return this.mWrapped.getLeanbackLaunchIntentForPackage(packageName);
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(String packageName) throws NameNotFoundException {
        return this.mWrapped.getPackageGids(packageName);
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(String packageName, int flags) throws NameNotFoundException {
        return this.mWrapped.getPackageGids(packageName, flags);
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(String packageName, int flags) throws NameNotFoundException {
        return this.mWrapped.getPackageInfo(packageName, flags);
    }

    @Override // android.content.pm.PackageManager
    public int getPackageUid(String packageName, int flags) throws NameNotFoundException {
        return this.mWrapped.getPackageUid(packageName, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getPackagesHoldingPermissions(String[] permissions, int flags) {
        return this.mWrapped.getPackagesHoldingPermissions(permissions, flags);
    }

    @Override // android.content.pm.PackageManager
    public PermissionGroupInfo getPermissionGroupInfo(String name, int flags) throws NameNotFoundException {
        return this.mWrapped.getPermissionGroupInfo(name, flags);
    }

    @Override // android.content.pm.PackageManager
    public PermissionInfo getPermissionInfo(String name, int flags) throws NameNotFoundException {
        return this.mWrapped.getPermissionInfo(name, flags);
    }

    @Override // android.content.pm.PackageManager
    public ProviderInfo getProviderInfo(ComponentName component, int flags) throws NameNotFoundException {
        return this.mWrapped.getProviderInfo(component, flags);
    }

    @Override // android.content.pm.PackageManager
    public ActivityInfo getReceiverInfo(ComponentName component, int flags) throws NameNotFoundException {
        return this.mWrapped.getReceiverInfo(component, flags);
    }

    @Override // android.content.pm.PackageManager
    public ServiceInfo getServiceInfo(ComponentName component, int flags) throws NameNotFoundException {
        return this.mWrapped.getServiceInfo(component, flags);
    }

    @Override // android.content.pm.PackageManager
    public boolean isPermissionRevokedByPolicy(String permName, String pkgName) {
        return this.mWrapped.isPermissionRevokedByPolicy(permName, pkgName);
    }

    @Override // android.content.pm.PackageManager
    public List<PermissionInfo> queryPermissionsByGroup(String group, int flags) throws NameNotFoundException {
        return this.mWrapped.queryPermissionsByGroup(group, flags);
    }

    @Override // android.content.pm.PackageManager
    public void removePermission(String name) {
        this.mWrapped.removePermission(name);
    }

    @Override // android.content.pm.PackageManager
    public String[] getPackagesForUid(int uid) {
        return this.mWrapped.getPackagesForUid(uid);
    }

    @Override // android.content.pm.PackageManager
    public String getNameForUid(int uid) {
        return this.mWrapped.getNameForUid(uid);
    }

    @Override // android.content.pm.PackageManager
    public List<ApplicationInfo> getInstalledApplications(int flags) {
        return this.mWrapped.getInstalledApplications(flags);
    }

    @Override // android.content.pm.PackageManager
    public String[] getSystemSharedLibraryNames() {
        return this.mWrapped.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    public FeatureInfo[] getSystemAvailableFeatures() {
        return this.mWrapped.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(String name) {
        return this.mWrapped.hasSystemFeature(name);
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(String name, int version) {
        return this.mWrapped.hasSystemFeature(name, version);
    }

    @Override // android.content.pm.PackageManager
    public ResolveInfo resolveActivity(Intent intent, int flags) {
        return this.mWrapped.resolveActivity(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentActivities(Intent intent, int flags) {
        return this.mWrapped.queryIntentActivities(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentActivityOptions(ComponentName caller, Intent[] specifics, Intent intent, int flags) {
        return this.mWrapped.queryIntentActivityOptions(caller, specifics, intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags) {
        return this.mWrapped.queryBroadcastReceivers(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public ResolveInfo resolveService(Intent intent, int flags) {
        return this.mWrapped.resolveService(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentServices(Intent intent, int flags) {
        return this.mWrapped.queryIntentServices(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ResolveInfo> queryIntentContentProviders(Intent intent, int flags) {
        return this.mWrapped.queryIntentContentProviders(intent, flags);
    }

    @Override // android.content.pm.PackageManager
    public ProviderInfo resolveContentProvider(String name, int flags) {
        return this.mWrapped.resolveContentProvider(name, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<ProviderInfo> queryContentProviders(String processName, int uid, int flags) {
        return this.mWrapped.queryContentProviders(processName, uid, flags);
    }

    @Override // android.content.pm.PackageManager
    public InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags) throws NameNotFoundException {
        return this.mWrapped.getInstrumentationInfo(className, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<InstrumentationInfo> queryInstrumentation(String targetPackage, int flags) {
        return this.mWrapped.queryInstrumentation(targetPackage, flags);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo) {
        return this.mWrapped.getDrawable(packageName, resid, appInfo);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityIcon(ComponentName activityName) throws NameNotFoundException {
        return this.mWrapped.getActivityIcon(activityName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityIcon(Intent intent) throws NameNotFoundException {
        return this.mWrapped.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityBanner(ComponentName activityName) throws NameNotFoundException {
        return this.mWrapped.getActivityBanner(activityName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityBanner(Intent intent) throws NameNotFoundException {
        return this.mWrapped.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getDefaultActivityIcon() {
        return this.mWrapped.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationIcon(ApplicationInfo info) {
        return this.mWrapped.getApplicationIcon(info);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationIcon(String packageName) throws NameNotFoundException {
        return this.mWrapped.getApplicationIcon(packageName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationBanner(ApplicationInfo info) {
        return this.mWrapped.getApplicationBanner(info);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationBanner(String packageName) throws NameNotFoundException {
        return this.mWrapped.getApplicationBanner(packageName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityLogo(ComponentName activityName) throws NameNotFoundException {
        return this.mWrapped.getActivityLogo(activityName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getActivityLogo(Intent intent) throws NameNotFoundException {
        return this.mWrapped.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationLogo(ApplicationInfo info) {
        return this.mWrapped.getApplicationLogo(info);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getApplicationLogo(String packageName) throws NameNotFoundException {
        return this.mWrapped.getApplicationLogo(packageName);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getUserBadgedIcon(Drawable icon, UserHandle user) {
        return this.mWrapped.getUserBadgedIcon(icon, user);
    }

    @Override // android.content.pm.PackageManager
    public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle user, Rect badgeLocation, int badgeDensity) {
        return this.mWrapped.getUserBadgedDrawableForDensity(drawable, user, badgeLocation, badgeDensity);
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getUserBadgedLabel(CharSequence label, UserHandle user) {
        return this.mWrapped.getUserBadgedLabel(label, user);
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo) {
        return this.mWrapped.getText(packageName, resid, appInfo);
    }

    @Override // android.content.pm.PackageManager
    public XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo) {
        return this.mWrapped.getXml(packageName, resid, appInfo);
    }

    @Override // android.content.pm.PackageManager
    public CharSequence getApplicationLabel(ApplicationInfo info) {
        return this.mWrapped.getApplicationLabel(info);
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForActivity(ComponentName activityName) throws NameNotFoundException {
        return this.mWrapped.getResourcesForActivity(activityName);
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForApplication(ApplicationInfo app) throws NameNotFoundException {
        return this.mWrapped.getResourcesForApplication(app);
    }

    @Override // android.content.pm.PackageManager
    public Resources getResourcesForApplication(String appPackageName) throws NameNotFoundException {
        return this.mWrapped.getResourcesForApplication(appPackageName);
    }

    @Override // android.content.pm.PackageManager
    public void verifyPendingInstall(int id, int verificationCode) {
        this.mWrapped.verifyPendingInstall(id, verificationCode);
    }

    @Override // android.content.pm.PackageManager
    public void extendVerificationTimeout(int id, int verificationCodeAtTimeout, long millisecondsToDelay) {
        this.mWrapped.extendVerificationTimeout(id, verificationCodeAtTimeout, millisecondsToDelay);
    }

    @Override // android.content.pm.PackageManager
    public void setInstallerPackageName(String targetPackage, String installerPackageName) {
        this.mWrapped.setInstallerPackageName(targetPackage, installerPackageName);
    }

    @Override // android.content.pm.PackageManager
    public String getInstallerPackageName(String packageName) {
        return this.mWrapped.getInstallerPackageName(packageName);
    }

    @Override // android.content.pm.PackageManager
    @Deprecated
    public void removePackageFromPreferred(String packageName) {
        this.mWrapped.removePackageFromPreferred(packageName);
    }

    @Override // android.content.pm.PackageManager
    public List<PackageInfo> getPreferredPackages(int flags) {
        return this.mWrapped.getPreferredPackages(flags);
    }

    @Override // android.content.pm.PackageManager
    public void clearPackagePreferredActivities(String packageName) {
        this.mWrapped.clearPackagePreferredActivities(packageName);
    }

    @Override // android.content.pm.PackageManager
    public int getPreferredActivities(List<IntentFilter> outFilters, List<ComponentName> outActivities, String packageName) {
        return this.mWrapped.getPreferredActivities(outFilters, outActivities, packageName);
    }

    @Override // android.content.pm.PackageManager
    public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) {
        this.mWrapped.setComponentEnabledSetting(componentName, newState, flags);
    }

    @Override // android.content.pm.PackageManager
    public int getComponentEnabledSetting(ComponentName componentName) {
        return this.mWrapped.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationEnabledSetting(String packageName, int newState, int flags) {
        this.mWrapped.setApplicationEnabledSetting(packageName, newState, flags);
    }

    @Override // android.content.pm.PackageManager
    public int getApplicationEnabledSetting(String packageName) {
        return this.mWrapped.getApplicationEnabledSetting(packageName);
    }

    @Override // android.content.pm.PackageManager
    public boolean isSafeMode() {
        return this.mWrapped.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    public PackageInstaller getPackageInstaller() {
        return this.mWrapped.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    public boolean canRequestPackageInstalls() {
        return this.mWrapped.canRequestPackageInstalls();
    }

    @Override // android.content.pm.PackageManager
    public ChangedPackages getChangedPackages(int sequenceNumber) {
        return this.mWrapped.getChangedPackages(sequenceNumber);
    }

    @Override // android.content.pm.PackageManager
    public byte[] getInstantAppCookie() {
        return this.mWrapped.getInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    public int getInstantAppCookieMaxBytes() {
        return this.mWrapped.getInstantAppCookieMaxBytes();
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(VersionedPackage versionedPackage, int flags) throws NameNotFoundException {
        return this.mWrapped.getPackageInfo(versionedPackage, flags);
    }

    @Override // android.content.pm.PackageManager
    public List<SharedLibraryInfo> getSharedLibraries(int flags) {
        return this.mWrapped.getSharedLibraries(flags);
    }

    @Override // android.content.pm.PackageManager
    public boolean isInstantApp() {
        return this.mWrapped.isInstantApp();
    }

    @Override // android.content.pm.PackageManager
    public boolean isInstantApp(String packageName) {
        return this.mWrapped.isInstantApp(packageName);
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationCategoryHint(String packageName, int categoryHint) {
        this.mWrapped.setApplicationCategoryHint(packageName, categoryHint);
    }

    @Override // android.content.pm.PackageManager
    public void updateInstantAppCookie(byte[] cookie) {
        this.mWrapped.updateInstantAppCookie(cookie);
    }
}
