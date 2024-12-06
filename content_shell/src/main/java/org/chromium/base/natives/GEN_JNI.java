package org.chromium.base.natives;

import J.N;
/* loaded from: classes.dex */
public class GEN_JNI {
  public static final boolean REQUIRE_MOCK = false;
  public static final boolean TESTING_ENABLED = false;

  public static void org_chromium_base_ApplicationStatus_onApplicationStateChange(int newState) {
    N.MiAkQ_SU(newState);
  }

  public static void org_chromium_base_CommandLine_init(String[] args) {
    N.MDkrKi31(args);
  }

  public static boolean org_chromium_base_CommandLine_hasSwitch(String switchString) {
    return N.MsCvypjU(switchString);
  }

  public static String org_chromium_base_CommandLine_getSwitchValue(String switchString) {
    return N.MZJ2lrZY(switchString);
  }

  public static String[] org_chromium_base_CommandLine_getSwitchesFlattened() {
    return N.MHzche6O();
  }

  public static void org_chromium_base_CommandLine_appendSwitch(String switchString) {
    N.M5K_ewhl(switchString);
  }

  public static void org_chromium_base_CommandLine_appendSwitchWithValue(String switchString, String value) {
    N.MUoYiNbY(switchString, value);
  }

  public static void org_chromium_base_CommandLine_appendSwitchesAndArguments(String[] array) {
    N.MPquHBNa(array);
  }

  public static void org_chromium_base_CommandLine_removeSwitch(String switchString) {
    N.M1cMYXGO(switchString);
  }

  public static int org_chromium_base_CpuFeatures_getCoreCount() {
    return N.MOiBJ1qS();
  }

  public static long org_chromium_base_CpuFeatures_getCpuFeatures() {
    return N.ML0T8q1U();
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
    N.MrWG2uUW(name, timeNanos, threadId, threadMillis);
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
    N.MmyrhqXB(name, timeNanos, threadId, threadMillis);
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
    N.M7UXCmoq(name, timeNanos, threadId, threadMillis);
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
    N.MRlw2LEn(name, timeNanos, threadId, threadMillis);
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(String name, long id, long timestamp) {
    N.M_Gv8TwM(name, id, timestamp);
  }

  public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(String name, long id, long timestamp) {
    N.MrKsqeCD(name, id, timestamp);
  }

  public static boolean org_chromium_base_FeatureList_isInitialized() {
    return N.MFTJCvBh();
  }

  public static boolean org_chromium_base_Features_isEnabled(long featurePointer) {
    return N.MRiRQ_Ey(featurePointer);
  }

  public static boolean org_chromium_base_Features_getFieldTrialParamByFeatureAsBoolean(long featurePointer, String paramName, boolean defaultValue) {
    return N.M8R55Xut(featurePointer, paramName, defaultValue);
  }

  public static String org_chromium_base_FieldTrialList_findFullName(String trialName) {
    return N.MdC43qwX(trialName);
  }

  public static boolean org_chromium_base_FieldTrialList_trialExists(String trialName) {
    return N.Mmqqda9c(trialName);
  }

  public static String org_chromium_base_FieldTrialList_getVariationParameter(String trialName, String parameterKey) {
    return N.MZWMOP4I(trialName, parameterKey);
  }

  public static void org_chromium_base_FieldTrialList_logActiveTrials() {
    N.MHz6Fn06();
  }

  public static boolean org_chromium_base_FieldTrialList_createFieldTrial(String trialName, String groupName) {
    return N.MGqzwlIM(trialName, groupName);
  }

  public static boolean org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(String fileName, byte[] data) {
    return N.MsOKBrZ5(fileName, data);
  }

  public static void org_chromium_base_JavaExceptionReporter_reportJavaException(boolean crashAfterReport, Throwable e) {
    N.MLlibBXh(crashAfterReport, e);
  }

  public static void org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(String stackTrace) {
    N.MmS4zlEt(stackTrace);
  }

  public static void org_chromium_base_JavaHandlerThread_initializeThread(long nativeJavaHandlerThread, long nativeEvent) {
    N.MJcct7gJ(nativeJavaHandlerThread, nativeEvent);
  }

  public static void org_chromium_base_JavaHandlerThread_onLooperStopped(long nativeJavaHandlerThread) {
    N.MYwg$x8E(nativeJavaHandlerThread);
  }

  public static void org_chromium_base_MemoryPressureListener_onMemoryPressure(int pressure) {
    N.MZJzyjAa(pressure);
  }

  public static void org_chromium_base_PathService_override(int what, String path) {
    N.M6H_IiaF(what, path);
  }

  public static void org_chromium_base_PowerMonitor_onBatteryChargingChanged() {
    N.MCImhGql();
  }

  public static void org_chromium_base_SysUtils_logPageFaultCountToTracing() {
    N.MOXOasS5();
  }

  public static long org_chromium_base_TimeUtils_getTimeTicksNowUs() {
    return N.MklbOJun();
  }

  public static void org_chromium_base_TraceEvent_registerEnabledObserver() {
    N.MFFzPOVw();
  }

  public static void org_chromium_base_TraceEvent_startATrace(String categoryFilter) {
    N.MRN$Vid3(categoryFilter);
  }

  public static void org_chromium_base_TraceEvent_stopATrace() {
    N.MOgCa3d$();
  }

  public static void org_chromium_base_TraceEvent_setupATraceStartupTrace(String categoryFilter) {
    N.MlFM5bdC(categoryFilter);
  }

  public static void org_chromium_base_TraceEvent_instant(String name, String arg) {
    N.ML40H8ed(name, arg);
  }

  public static void org_chromium_base_TraceEvent_begin(String name, String arg) {
    N.M9XfPu17(name, arg);
  }

  public static void org_chromium_base_TraceEvent_end(String name, String arg) {
    N.Mw73xTww(name, arg);
  }

  public static void org_chromium_base_TraceEvent_beginToplevel(String target) {
    N.M_y76mct(target);
  }

  public static void org_chromium_base_TraceEvent_endToplevel(String target) {
    N.MLJecZJ9(target);
  }

  public static void org_chromium_base_TraceEvent_startAsync(String name, long id) {
    N.MHopMqLX(name, id);
  }

  public static void org_chromium_base_TraceEvent_finishAsync(String name, long id) {
    N.MffNhCLU(name, id);
  }

  public static void org_chromium_base_jank_1tracker_JankMetricUMARecorder_recordJankMetrics(String scenarioName, long[] durationsNs, long[] jankBurstsNs, int missedFrames) {
    N.MJ46uzUz(scenarioName, durationsNs, jankBurstsNs, missedFrames);
  }

  public static boolean org_chromium_base_library_1loader_LibraryLoader_libraryLoaded(int processType) {
    return N.M81WqFvs(processType);
  }

  public static void org_chromium_base_library_1loader_LibraryLoader_registerNonMainDexJni() {
    N.MIOj213u();
  }

  public static void org_chromium_base_library_1loader_LibraryPrefetcher_forkAndPrefetchNativeLibrary() {
    N.MUjpxN8d();
  }

  public static int org_chromium_base_library_1loader_LibraryPrefetcher_percentageOfResidentNativeLibraryCode() {
    return N.MdFgVRJJ();
  }

  public static void org_chromium_base_library_1loader_LibraryPrefetcher_periodicallyCollectResidency() {
    N.MLXZo1U6();
  }

  public static long org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(String name, long nativeHint, boolean sample) {
    return N.MtKTTHie(name, nativeHint, sample);
  }

  public static long org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets) {
    return N.MILRV9Ch(name, nativeHint, sample, min, max, numBuckets);
  }

  public static long org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(String name, long nativeHint, int sample, int min, int max, int numBuckets) {
    return N.M$oMD214(name, nativeHint, sample, min, max, numBuckets);
  }

  public static long org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(String name, long nativeHint, int sample) {
    return N.Mk1ai9mx(name, nativeHint, sample);
  }

  public static void org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(String name, long millisSinceEvent) {
    N.MTDsfZGe(name, millisSinceEvent);
  }

  public static int org_chromium_base_metrics_RecordHistogram_getHistogramValueCountForTesting(String name, int sample) {
    return N.M1gJHszj(name, sample);
  }

  public static int org_chromium_base_metrics_RecordHistogram_getHistogramTotalCountForTesting(String name) {
    return N.M4mrObfZ(name);
  }

  public static void org_chromium_base_metrics_RecordHistogram_forgetHistogramForTesting(String name) {
    N.MxVTgTny(name);
  }

  public static long org_chromium_base_metrics_RecordUserAction_addActionCallbackForTesting(Object callback) {
    return N.MH0bOwlk(callback);
  }

  public static void org_chromium_base_metrics_RecordUserAction_removeActionCallbackForTesting(long callbackId) {
    N.MJl0LdjQ(callbackId);
  }

  public static String org_chromium_base_metrics_StatisticsRecorderAndroid_toJson(int verbosityLevel) {
    return N.MvO$oy3r(verbosityLevel);
  }

  public static void org_chromium_base_process_1launcher_ChildProcessService_registerFileDescriptors(String[] keys, int[] id, int[] fd, long[] offset, long[] size) {
    N.Ma6rsNQO(keys, id, fd, offset, size);
  }

  public static void org_chromium_base_process_1launcher_ChildProcessService_exitChildProcess() {
    N.McvJWQ0j();
  }

  public static void org_chromium_base_process_1launcher_ChildProcessService_dumpProcessStack() {
    N.M6Y7Jzgj();
  }

  public static void org_chromium_base_task_PostTask_postDelayedTask(int priority, boolean mayBlock, boolean useThreadPool, byte extensionId, byte[] extensionData, Object task, long delay, String runnableClassName) {
    N.MTILOhAQ(priority, mayBlock, useThreadPool, extensionId, extensionData, task, delay, runnableClassName);
  }

  public static long org_chromium_base_task_TaskRunnerImpl_init(int taskRunnerType, int priority, boolean mayBlock, boolean useThreadPool, byte extensionId, byte[] extensionData) {
    return N.M5_IQXaH(taskRunnerType, priority, mayBlock, useThreadPool, extensionId, extensionData);
  }

  public static void org_chromium_base_task_TaskRunnerImpl_destroy(long nativeTaskRunnerAndroid) {
    N.MERCiIV8(nativeTaskRunnerAndroid);
  }

  public static void org_chromium_base_task_TaskRunnerImpl_postDelayedTask(long nativeTaskRunnerAndroid, Object task, long delay, String runnableClassName) {
    N.MGnQU$47(nativeTaskRunnerAndroid, task, delay, runnableClassName);
  }

  public static boolean org_chromium_base_task_TaskRunnerImpl_belongsToCurrentThread(long nativeTaskRunnerAndroid) {
    return N.MdFi6sVQ(nativeTaskRunnerAndroid);
  }

  public static boolean org_chromium_base_test_ReachedCodeProfiler_isReachedCodeProfilerEnabled() {
    return N.MAvd5yDU();
  }

  public static boolean org_chromium_base_test_ReachedCodeProfiler_isReachedCodeProfilerSupported() {
    return N.MbYaLxm7();
  }

  public static void org_chromium_base_test_task_ThreadPoolTestHelpers_enableThreadPoolExecutionForTesting() {
    N.Mf8BmU2z();
  }

  public static void org_chromium_base_test_task_ThreadPoolTestHelpers_disableThreadPoolExecutionForTesting() {
    N.MBDE8BZX();
  }

  public static void org_chromium_components_crash_CrashKeys_set(Object caller, int key, String value) {
    N.Mk$gnuuz(caller, key, value);
  }

  public static int org_chromium_components_download_DownloadCollectionBridge_getExpirationDurationInDays() {
    return N.M7rZ5uJE();
  }

  public static long org_chromium_components_embedder_1support_view_ContentViewRenderView_init(Object caller, Object rootWindow) {
    return N.MGnYpjUQ(caller, rootWindow);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_destroy(long nativeContentViewRenderView, Object caller) {
    N.MTwjIV_e(nativeContentViewRenderView, caller);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_setCurrentWebContents(long nativeContentViewRenderView, Object caller, Object webContents) {
    N.MVaqBcNY(nativeContentViewRenderView, caller, webContents);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_onPhysicalBackingSizeChanged(long nativeContentViewRenderView, Object caller, Object webContents, int width, int height) {
    N.M719LIHN(nativeContentViewRenderView, caller, webContents, width, height);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceCreated(long nativeContentViewRenderView, Object caller) {
    N.MHtpxjbd(nativeContentViewRenderView, caller);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceDestroyed(long nativeContentViewRenderView, Object caller) {
    N.MABd50C6(nativeContentViewRenderView, caller);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceChanged(long nativeContentViewRenderView, Object caller, int format, int width, int height, Object surface) {
    N.MS0NVCmv(nativeContentViewRenderView, caller, format, width, height, surface);
  }

  public static void org_chromium_components_embedder_1support_view_ContentViewRenderView_setOverlayVideoMode(long nativeContentViewRenderView, Object caller, boolean enabled) {
    N.MPNypfRc(nativeContentViewRenderView, caller, enabled);
  }

  public static Object org_chromium_components_url_1formatter_UrlFormatter_fixupUrl(String url) {
    return N.Ml2KxI$W(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitScheme(String url) {
    return N.M25QTkfm(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitHTTPScheme(String url) {
    return N.MWAcU8Kr(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(String url) {
    return N.MeroQv$e(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemePathAndTrivialSubdomains(Object url) {
    return N.MpICpYBr(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitUsernamePassword(String url) {
    return N.M52RypMk(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForCopy(String url) {
    return N.MWcP3rTG(url);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatUrlForSecurityDisplay(Object url, int schemeDisplay) {
    return N.MN7bz_Mm(url, schemeDisplay);
  }

  public static String org_chromium_components_url_1formatter_UrlFormatter_formatStringUrlForSecurityDisplay(String url, int schemeDisplay) {
    return N.MR6Af3ZS(url, schemeDisplay);
  }

  public static String org_chromium_components_variations_VariationsAssociatedData_getVariationParamValue(String trialName, String paramName) {
    return N.MOVY9QtZ(trialName, paramName);
  }

  public static String org_chromium_components_variations_VariationsAssociatedData_getFeedbackVariations() {
    return N.Mkq2qJev();
  }

  public static String org_chromium_components_variations_VariationsAssociatedData_getGoogleAppVariations() {
    return N.M_cRNcHs();
  }

  public static void org_chromium_components_viz_service_frame_1sinks_ExternalBeginFrameSourceAndroid_onVSync(long nativeExternalBeginFrameSourceAndroid, Object caller, long vsyncTimeMicros, long vsyncPeriodMicros) {
    N.Mhc_M_H$(nativeExternalBeginFrameSourceAndroid, caller, vsyncTimeMicros, vsyncPeriodMicros);
  }

  public static void org_chromium_content_app_ContentChildProcessServiceDelegate_initChildProcess(Object caller, int cpuCount, long cpuFeatures) {
    N.MBlO3kR9(caller, cpuCount, cpuFeatures);
  }

  public static void org_chromium_content_app_ContentChildProcessServiceDelegate_initMemoryPressureListener() {
    N.M8I$ZbIR();
  }

  public static void org_chromium_content_app_ContentChildProcessServiceDelegate_retrieveFileDescriptorsIdsToKeys(Object caller) {
    N.M0zXFFiu(caller);
  }

  public static int org_chromium_content_app_ContentMain_start(boolean startMinimalBrowser) {
    return N.M1Y_XVCN(startMinimalBrowser);
  }

  public static String org_chromium_content_browser_AppWebMessagePort_decodeStringMessage(byte[] encodedData) {
    return N.MWL_OG7s(encodedData);
  }

  public static byte[] org_chromium_content_browser_AppWebMessagePort_encodeStringMessage(String message) {
    return N.Mk6SEKCp(message);
  }

  public static long[] org_chromium_content_browser_AppWebMessagePortDescriptor_createPair() {
    return N.MZ2WfWkn();
  }

  public static long org_chromium_content_browser_AppWebMessagePortDescriptor_create(int nativeHandle, long idLow, long idHigh, long sequenceNumber) {
    return N.MsjrrfZt(nativeHandle, idLow, idHigh, sequenceNumber);
  }

  public static int org_chromium_content_browser_AppWebMessagePortDescriptor_takeHandleToEntangle(long blinkMessagePortDescriptor) {
    return N.MbOQIpGw(blinkMessagePortDescriptor);
  }

  public static void org_chromium_content_browser_AppWebMessagePortDescriptor_giveDisentangledHandle(long blinkMessagePortDescriptor, int nativeHandle) {
    N.MylsTJ$B(blinkMessagePortDescriptor, nativeHandle);
  }

  public static void org_chromium_content_browser_AppWebMessagePortDescriptor_onConnectionError(long blinkMessagePortDescriptor) {
    N.MpISG4bN(blinkMessagePortDescriptor);
  }

  public static long[] org_chromium_content_browser_AppWebMessagePortDescriptor_passSerialized(long blinkMessagePortDescriptor) {
    return N.MJJP$CQY(blinkMessagePortDescriptor);
  }

  public static void org_chromium_content_browser_AppWebMessagePortDescriptor_closeAndDestroy(long blinkMessagePortDescriptor) {
    N.MWkkqfl2(blinkMessagePortDescriptor);
  }

  public static void org_chromium_content_browser_AppWebMessagePortDescriptor_disentangleCloseAndDestroy(long blinkMessagePortDescriptor) {
    N.MgnCh9Wp(blinkMessagePortDescriptor);
  }

  public static void org_chromium_content_browser_AttributionReporterImpl_reportAttributionForCurrentNavigation(Object webContents, String sourcePackageName, String sourceEventId, String destination, String reportTo, long expiry) {
    N.MSZ4hdZ5(webContents, sourcePackageName, sourceEventId, destination, reportTo, expiry);
  }

  public static void org_chromium_content_browser_AudioFocusDelegate_onSuspend(long nativeAudioFocusDelegateAndroid, Object caller) {
    N.MUFA7yj7(nativeAudioFocusDelegateAndroid, caller);
  }

  public static void org_chromium_content_browser_AudioFocusDelegate_onResume(long nativeAudioFocusDelegateAndroid, Object caller) {
    N.MqbF3KiE(nativeAudioFocusDelegateAndroid, caller);
  }

  public static void org_chromium_content_browser_AudioFocusDelegate_onStartDucking(long nativeAudioFocusDelegateAndroid, Object caller) {
    N.My_SIOp6(nativeAudioFocusDelegateAndroid, caller);
  }

  public static void org_chromium_content_browser_AudioFocusDelegate_onStopDucking(long nativeAudioFocusDelegateAndroid, Object caller) {
    N.MeoE5HbI(nativeAudioFocusDelegateAndroid, caller);
  }

  public static void org_chromium_content_browser_AudioFocusDelegate_recordSessionDuck(long nativeAudioFocusDelegateAndroid, Object caller) {
    N.Mn3dG6eh(nativeAudioFocusDelegateAndroid, caller);
  }

  public static void org_chromium_content_browser_BackgroundSyncNetworkObserver_notifyConnectionTypeChanged(long nativePtr, Object caller, int newConnectionType) {
    N.MJIG3QvD(nativePtr, caller, newConnectionType);
  }

  public static void org_chromium_content_browser_BrowserStartupControllerImpl_setCommandLineFlags(boolean singleProcess) {
    N.MwoPtAzD(singleProcess);
  }

  public static void org_chromium_content_browser_BrowserStartupControllerImpl_flushStartupTasks() {
    N.M9iLjy6T();
  }

  public static void org_chromium_content_browser_ChildProcessLauncherHelperImpl_onChildProcessStarted(long nativeChildProcessLauncherHelper, int pid) {
    N.MXR$KaDS(nativeChildProcessLauncherHelper, pid);
  }

  public static void org_chromium_content_browser_ChildProcessLauncherHelperImpl_setTerminationInfo(long termiantionInfoPtr, int bindingState, boolean killedByUs, boolean cleanExit, boolean exceptionDuringInit, int reverseRank) {
    N.MJcoZ9pW(termiantionInfoPtr, bindingState, killedByUs, cleanExit, exceptionDuringInit, reverseRank);
  }

  public static boolean org_chromium_content_browser_ChildProcessLauncherHelperImpl_serviceGroupImportanceEnabled() {
    return N.MyYLH6Fg();
  }

  public static String org_chromium_content_browser_ClientDataJsonImpl_buildClientDataJson(int clientDataRequestType, String callerOrigin, byte[] challenge, boolean isCrossOrigin, Object optionsByteBuffer, String relyingPartyId, String topOrigin) {
    return N.M_2Rd_$Y(clientDataRequestType, callerOrigin, challenge, isCrossOrigin, optionsByteBuffer, relyingPartyId, topOrigin);
  }

  public static void org_chromium_content_browser_ContactsDialogHost_addContact(long nativeContactsProviderAndroid, String[] names, String[] emails, String[] tel, Object[] addresses, Object[] icons) {
    N.MS9BZrW0(nativeContactsProviderAndroid, names, emails, tel, addresses, icons);
  }

  public static void org_chromium_content_browser_ContactsDialogHost_endContactsList(long nativeContactsProviderAndroid, int percentageShared, int propertiesRequested) {
    N.MwwTaBAE(nativeContactsProviderAndroid, percentageShared, propertiesRequested);
  }

  public static void org_chromium_content_browser_ContactsDialogHost_endWithPermissionDenied(long nativeContactsProviderAndroid) {
    N.MOM50EIZ(nativeContactsProviderAndroid);
  }

  public static boolean org_chromium_content_browser_ContentFeatureListImpl_isEnabled(String featureName) {
    return N.Mudil8Bg(featureName);
  }

  public static long org_chromium_content_browser_ContentUiEventHandler_init(Object caller, Object webContents) {
    return N.MXL6itCa(caller, webContents);
  }

  public static void org_chromium_content_browser_ContentUiEventHandler_sendMouseWheelEvent(long nativeContentUiEventHandler, Object caller, long timeMs, float x, float y, float ticksX, float ticksY) {
    N.MifdK0lh(nativeContentUiEventHandler, caller, timeMs, x, y, ticksX, ticksY);
  }

  public static void org_chromium_content_browser_ContentUiEventHandler_sendMouseEvent(long nativeContentUiEventHandler, Object caller, long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation, float tilt, int changedButton, int buttonState, int metaState, int toolType) {
    N.MjyjK8Gd(nativeContentUiEventHandler, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  public static void org_chromium_content_browser_ContentUiEventHandler_sendScrollEvent(long nativeContentUiEventHandler, Object caller, long timeMs, float deltaX, float deltaY) {
    N.M_1sgTVt(nativeContentUiEventHandler, caller, timeMs, deltaX, deltaY);
  }

  public static void org_chromium_content_browser_ContentUiEventHandler_cancelFling(long nativeContentUiEventHandler, Object caller, long timeMs) {
    N.MW$k83qi(nativeContentUiEventHandler, caller, timeMs);
  }

  public static void org_chromium_content_browser_ContentViewStaticsImpl_setWebKitSharedTimersSuspended(boolean suspend) {
    N.M556jcRe(suspend);
  }

  public static long org_chromium_content_browser_GestureListenerManagerImpl_init(Object caller, Object webContents) {
    return N.MefCIE9S(caller, webContents);
  }

  public static void org_chromium_content_browser_GestureListenerManagerImpl_resetGestureDetection(long nativeGestureListenerManager, Object caller) {
    N.MMR0DKoy(nativeGestureListenerManager, caller);
  }

  public static void org_chromium_content_browser_GestureListenerManagerImpl_setDoubleTapSupportEnabled(long nativeGestureListenerManager, Object caller, boolean enabled) {
    N.MrZmTSS9(nativeGestureListenerManager, caller, enabled);
  }

  public static void org_chromium_content_browser_GestureListenerManagerImpl_setMultiTouchZoomSupportEnabled(long nativeGestureListenerManager, Object caller, boolean enabled) {
    N.M6a5zchR(nativeGestureListenerManager, caller, enabled);
  }

  public static void org_chromium_content_browser_GestureListenerManagerImpl_setHasListenersAttached(long nativeGestureListenerManager, boolean hasListeners) {
    N.M9FEGIKH(nativeGestureListenerManager, hasListeners);
  }

  public static void org_chromium_content_browser_GpuProcessCallback_completeScopedSurfaceRequest(Object requestToken, Object surface) {
    N.M$O7xE3y(requestToken, surface);
  }

  public static Object org_chromium_content_browser_GpuProcessCallback_getViewSurface(int surfaceId) {
    return N.Mm9rCM0m(surfaceId);
  }

  public static long org_chromium_content_browser_JavascriptInjectorImpl_init(Object caller, Object webContents, Object retainedObjects) {
    return N.MaMB25XA(caller, webContents, retainedObjects);
  }

  public static void org_chromium_content_browser_JavascriptInjectorImpl_setAllowInspection(long nativeJavascriptInjector, Object caller, boolean allow) {
    N.M9VsdpoI(nativeJavascriptInjector, caller, allow);
  }

  public static void org_chromium_content_browser_JavascriptInjectorImpl_addInterface(long nativeJavascriptInjector, Object caller, Object object, String name, Class requiredAnnotation) {
    N.Mpa5DCUY(nativeJavascriptInjector, caller, object, name, requiredAnnotation);
  }

  public static void org_chromium_content_browser_JavascriptInjectorImpl_removeInterface(long nativeJavascriptInjector, Object caller, String name) {
    N.M5J62vXh(nativeJavascriptInjector, caller, name);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_resume(long nativeMediaSessionAndroid, Object caller) {
    N.MlezJYnz(nativeMediaSessionAndroid, caller);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_suspend(long nativeMediaSessionAndroid, Object caller) {
    N.M5LC9gX$(nativeMediaSessionAndroid, caller);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_stop(long nativeMediaSessionAndroid, Object caller) {
    N.MW5s36cs(nativeMediaSessionAndroid, caller);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_seek(long nativeMediaSessionAndroid, Object caller, long millis) {
    N.My_T5ZML(nativeMediaSessionAndroid, caller, millis);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_seekTo(long nativeMediaSessionAndroid, Object caller, long millis) {
    N.MK7btVfc(nativeMediaSessionAndroid, caller, millis);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_didReceiveAction(long nativeMediaSessionAndroid, Object caller, int action) {
    N.MAqRqyJa(nativeMediaSessionAndroid, caller, action);
  }

  public static void org_chromium_content_browser_MediaSessionImpl_requestSystemAudioFocus(long nativeMediaSessionAndroid, Object caller) {
    N.MdnoDrDw(nativeMediaSessionAndroid, caller);
  }

  public static Object org_chromium_content_browser_MediaSessionImpl_getMediaSessionFromWebContents(Object contents) {
    return N.Mtun$qW8(contents);
  }

  public static boolean org_chromium_content_browser_RenderWidgetHostViewImpl_isReady(long nativeRenderWidgetHostViewAndroid, Object caller) {
    return N.MZn2HluM(nativeRenderWidgetHostViewAndroid, caller);
  }

  public static int org_chromium_content_browser_RenderWidgetHostViewImpl_getBackgroundColor(long nativeRenderWidgetHostViewAndroid, Object caller) {
    return N.MRWsmoin(nativeRenderWidgetHostViewAndroid, caller);
  }

  public static void org_chromium_content_browser_RenderWidgetHostViewImpl_dismissTextHandles(long nativeRenderWidgetHostViewAndroid, Object caller) {
    N.MQWja$xA(nativeRenderWidgetHostViewAndroid, caller);
  }

  public static void org_chromium_content_browser_RenderWidgetHostViewImpl_showContextMenuAtTouchHandle(long nativeRenderWidgetHostViewAndroid, Object caller, int x, int y) {
    N.McU85DFE(nativeRenderWidgetHostViewAndroid, caller, x, y);
  }

  public static void org_chromium_content_browser_RenderWidgetHostViewImpl_onViewportInsetBottomChanged(long nativeRenderWidgetHostViewAndroid, Object caller) {
    N.Myd8R_Wn(nativeRenderWidgetHostViewAndroid, caller);
  }

  public static void org_chromium_content_browser_RenderWidgetHostViewImpl_writeContentBitmapToDiskAsync(long nativeRenderWidgetHostViewAndroid, Object caller, int width, int height, String path, Object callback) {
    N.Mjmv7RJS(nativeRenderWidgetHostViewAndroid, caller, width, height, path, callback);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onAudioStart(long nativeSpeechRecognizerImplAndroid, Object caller) {
    N.MdhaXGcn(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onSoundStart(long nativeSpeechRecognizerImplAndroid, Object caller) {
    N.M2Nl8ID9(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onSoundEnd(long nativeSpeechRecognizerImplAndroid, Object caller) {
    N.MFB2QCbe(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onAudioEnd(long nativeSpeechRecognizerImplAndroid, Object caller) {
    N.M2TRi32V(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionResults(long nativeSpeechRecognizerImplAndroid, Object caller, String[] results, float[] scores, boolean provisional) {
    N.MnkvkoGY(nativeSpeechRecognizerImplAndroid, caller, results, scores, provisional);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionError(long nativeSpeechRecognizerImplAndroid, Object caller, int error) {
    N.MUf_fHKN(nativeSpeechRecognizerImplAndroid, caller, error);
  }

  public static void org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionEnd(long nativeSpeechRecognizerImplAndroid, Object caller) {
    N.MmgQYR9M(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static long org_chromium_content_browser_TracingControllerAndroidImpl_init(Object caller) {
    return N.MWlLnA$6(caller);
  }

  public static void org_chromium_content_browser_TracingControllerAndroidImpl_destroy(long nativeTracingControllerAndroid, Object caller) {
    N.MLYQdwUF(nativeTracingControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_TracingControllerAndroidImpl_startTracing(long nativeTracingControllerAndroid, Object caller, String categories, String traceOptions, boolean useProtobuf) {
    return N.MZYMIGWv(nativeTracingControllerAndroid, caller, categories, traceOptions, useProtobuf);
  }

  public static void org_chromium_content_browser_TracingControllerAndroidImpl_stopTracing(long nativeTracingControllerAndroid, Object caller, String filename, boolean compressFile, boolean useProtobuf, Object callback) {
    N.M$HKWu8q(nativeTracingControllerAndroid, caller, filename, compressFile, useProtobuf, callback);
  }

  public static boolean org_chromium_content_browser_TracingControllerAndroidImpl_getKnownCategoriesAsync(long nativeTracingControllerAndroid, Object caller, Object callback) {
    return N.MdRNuqnW(nativeTracingControllerAndroid, caller, callback);
  }

  public static String org_chromium_content_browser_TracingControllerAndroidImpl_getDefaultCategories(Object caller) {
    return N.My9pNx9O(caller);
  }

  public static boolean org_chromium_content_browser_TracingControllerAndroidImpl_getTraceBufferUsageAsync(long nativeTracingControllerAndroid, Object caller, Object callback) {
    return N.MkLMghix(nativeTracingControllerAndroid, caller, callback);
  }

  public static void org_chromium_content_browser_TtsPlatformImpl_voicesChanged(long nativeTtsPlatformImplAndroid) {
    N.MpJkwIUo(nativeTtsPlatformImplAndroid);
  }

  public static void org_chromium_content_browser_TtsPlatformImpl_onEndEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    N.M47GdBO5(nativeTtsPlatformImplAndroid, utteranceId);
  }

  public static void org_chromium_content_browser_TtsPlatformImpl_onStartEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    N.M2$X0reE(nativeTtsPlatformImplAndroid, utteranceId);
  }

  public static void org_chromium_content_browser_TtsPlatformImpl_onErrorEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    N.M1Kw17GB(nativeTtsPlatformImplAndroid, utteranceId);
  }

  public static void org_chromium_content_browser_accessibility_BrowserAccessibilityState_onAnimatorDurationScaleChanged() {
    N.MAa7bxOG();
  }

  public static long org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_init(Object caller, Object webContents) {
    return N.MjYAnP1s(caller, webContents);
  }

  public static long org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_initWithAXTree(Object caller, long axTreePtr) {
    return N.M_XV3Nwg(caller, axTreePtr);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_deleteEarly(long nativeWebContentsAccessibilityAndroid) {
    N.MxGfnb$m(nativeWebContentsAccessibilityAndroid);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDisplayed(long nativeWebContentsAccessibilityAndroid, Object caller) {
    N.MMiqVowe(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onAutofillPopupDismissed(long nativeWebContentsAccessibilityAndroid, Object caller) {
    N.MdET073e(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getIdForElementAfterElementHostingAutofillPopup(long nativeWebContentsAccessibilityAndroid, Object caller) {
    return N.Mk31b3DX(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getRootId(long nativeWebContentsAccessibilityAndroid, Object caller) {
    return N.MI8pU34f(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isNodeValid(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MTBNGzHX(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isAutofillPopupNode(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.M5uHFthk(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEditableText(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MCMbXu4W(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isFocused(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.M8UuMlLD(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionStart(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MnVi6Frs(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getEditableTextSelectionEnd(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.Mxt_kc4Q(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static int[] org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getAbsolutePositionForNode(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MihzIy2h(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_updateCachedAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid, Object caller, Object info, int id) {
    return N.MZ7sDynr(nativeWebContentsAccessibilityAndroid, caller, info, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityNodeInfo(long nativeWebContentsAccessibilityAndroid, Object caller, Object info, int id) {
    return N.MJGtghd9(nativeWebContentsAccessibilityAndroid, caller, info, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_populateAccessibilityEvent(long nativeWebContentsAccessibilityAndroid, Object caller, Object event, int id, int eventType) {
    return N.M2E1dEU9(nativeWebContentsAccessibilityAndroid, caller, event, id, eventType);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_click(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    N.MM4OAOXm(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_focus(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    N.MG_OiJKg(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_blur(long nativeWebContentsAccessibilityAndroid, Object caller) {
    N.MNm00fYN(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scrollToMakeNodeVisible(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    N.MB302_MP(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_findElementType(long nativeWebContentsAccessibilityAndroid, Object caller, int startId, String elementType, boolean forwards, boolean canWrapToLastElement) {
    return N.MavOU0SM(nativeWebContentsAccessibilityAndroid, caller, startId, elementType, forwards, canWrapToLastElement);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setTextFieldValue(long nativeWebContentsAccessibilityAndroid, Object caller, int id, String newValue) {
    N.MEJD7Boi(nativeWebContentsAccessibilityAndroid, caller, id, newValue);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setSelection(long nativeWebContentsAccessibilityAndroid, Object caller, int id, int start, int end) {
    N.MVuu0R4P(nativeWebContentsAccessibilityAndroid, caller, id, start, end);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_nextAtGranularity(long nativeWebContentsAccessibilityAndroid, Object caller, int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
    return N.McKjfBnu(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_previousAtGranularity(long nativeWebContentsAccessibilityAndroid, Object caller, int selectionGranularity, boolean extendSelection, int id, int cursorIndex) {
    return N.M3suD0ji(nativeWebContentsAccessibilityAndroid, caller, selectionGranularity, extendSelection, id, cursorIndex);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_adjustSlider(long nativeWebContentsAccessibilityAndroid, Object caller, int id, boolean increment) {
    return N.MLjXc4lw(nativeWebContentsAccessibilityAndroid, caller, id, increment);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_moveAccessibilityFocus(long nativeWebContentsAccessibilityAndroid, Object caller, int oldId, int newId) {
    N.MPQKLw45(nativeWebContentsAccessibilityAndroid, caller, oldId, newId);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isSlider(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MkaakTGI(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_scroll(long nativeWebContentsAccessibilityAndroid, Object caller, int id, int direction, boolean pageScroll) {
    return N.MNch0m9c(nativeWebContentsAccessibilityAndroid, caller, id, direction, pageScroll);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setRangeValue(long nativeWebContentsAccessibilityAndroid, Object caller, int id, float value) {
    return N.MfTAAcu8(nativeWebContentsAccessibilityAndroid, caller, id, value);
  }

  public static String org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getSupportedHtmlElementTypes(long nativeWebContentsAccessibilityAndroid, Object caller) {
    return N.MPyIoFYC(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_showContextMenu(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    N.MOikWIf9(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_isEnabled(long nativeWebContentsAccessibilityAndroid, Object caller) {
    return N.Mr9fGid2(nativeWebContentsAccessibilityAndroid, caller);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_enable(long nativeWebContentsAccessibilityAndroid, Object caller, boolean screenReaderMode) {
    N.Mg$cuhZc(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setAXMode(long nativeWebContentsAccessibilityAndroid, Object caller, boolean screenReaderMode) {
    N.ME1Wl4ca(nativeWebContentsAccessibilityAndroid, caller, screenReaderMode);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_areInlineTextBoxesLoaded(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MZcfOSQW(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_loadInlineTextBoxes(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    N.M2WbOJ7$(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static int[] org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getCharacterBoundingBoxes(long nativeWebContentsAccessibilityAndroid, Object caller, int id, int start, int len) {
    return N.MVBiMGvZ(nativeWebContentsAccessibilityAndroid, caller, id, start, len);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getTextLength(long nativeWebContentsAccessibilityAndroid, Object caller, int id) {
    return N.MhMiVz6m(nativeWebContentsAccessibilityAndroid, caller, id);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_addSpellingErrorForTesting(long nativeWebContentsAccessibilityAndroid, Object caller, int id, int startOffset, int endOffset) {
    N.MzygGmQh(nativeWebContentsAccessibilityAndroid, caller, id, startOffset, endOffset);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid, Object caller, int maxEvents) {
    N.MjtR1x1L(nativeWebContentsAccessibilityAndroid, caller, maxEvents);
  }

  public static int org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_getMaxContentChangedEventsToFireForTesting(long nativeWebContentsAccessibilityAndroid) {
    return N.MoCCC$f_(nativeWebContentsAccessibilityAndroid);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_signalEndOfTestForTesting(long nativeWebContentsAccessibilityAndroid) {
    N.MUpC4hCb(nativeWebContentsAccessibilityAndroid);
  }

  public static void org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_setIsRunningAsWebView(long nativeWebContentsAccessibilityAndroid, Object caller, boolean isWebView) {
    N.MdwxDenk(nativeWebContentsAccessibilityAndroid, caller, isWebView);
  }

  public static boolean org_chromium_content_browser_accessibility_WebContentsAccessibilityImpl_onHoverEventNoRenderer(long nativeWebContentsAccessibilityAndroid, Object caller, float x, float y) {
    return N.Mx2ry6ai(nativeWebContentsAccessibilityAndroid, caller, x, y);
  }

  public static long org_chromium_content_browser_accessibility_captioning_CaptioningController_init(Object caller, Object webContents) {
    return N.MX95jWaj(caller, webContents);
  }

  public static void org_chromium_content_browser_accessibility_captioning_CaptioningController_setTextTrackSettings(long nativeCaptioningController, Object caller, boolean textTracksEnabled, String textTrackBackgroundColor, String textTrackFontFamily, String textTrackFontStyle, String textTrackFontVariant, String textTrackTextColor, String textTrackTextShadow, String textTrackTextSize) {
    N.MM3_AH7F(nativeCaptioningController, caller, textTracksEnabled, textTrackBackgroundColor, textTrackFontFamily, textTrackFontStyle, textTrackFontVariant, textTrackTextColor, textTrackTextShadow, textTrackTextSize);
  }

  public static long org_chromium_content_browser_androidoverlay_DialogOverlayImpl_init(Object caller, long high, long low, boolean isPowerEfficient) {
    return N.MqPi0d6D(caller, high, low, isPowerEfficient);
  }

  public static void org_chromium_content_browser_androidoverlay_DialogOverlayImpl_completeInit(long nativeDialogOverlayImpl, Object caller) {
    N.MQAm7B7f(nativeDialogOverlayImpl, caller);
  }

  public static void org_chromium_content_browser_androidoverlay_DialogOverlayImpl_destroy(long nativeDialogOverlayImpl, Object caller) {
    N.MJj9v_ba(nativeDialogOverlayImpl, caller);
  }

  public static void org_chromium_content_browser_androidoverlay_DialogOverlayImpl_getCompositorOffset(long nativeDialogOverlayImpl, Object caller, Object rect) {
    N.MAd6qeVr(nativeDialogOverlayImpl, caller, rect);
  }

  public static int org_chromium_content_browser_androidoverlay_DialogOverlayImpl_registerSurface(Object surface) {
    return N.MpcpmTlm(surface);
  }

  public static void org_chromium_content_browser_androidoverlay_DialogOverlayImpl_unregisterSurface(int surfaceId) {
    N.M1e4GdYZ(surfaceId);
  }

  public static Object org_chromium_content_browser_androidoverlay_DialogOverlayImpl_lookupSurfaceForTesting(int surfaceId) {
    return N.MzUgOpRk(surfaceId);
  }

  public static void org_chromium_content_browser_androidoverlay_DialogOverlayImpl_notifyDestroyedSynchronously(int messagePipeHandle) {
    N.MFq0hOYg(messagePipeHandle);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_canGoBack(long nativeNavigationControllerAndroid, Object caller) {
    return N.MgAw5sIR(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_canGoForward(long nativeNavigationControllerAndroid, Object caller) {
    return N.MCUxt83x(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_isInitialNavigation(long nativeNavigationControllerAndroid, Object caller) {
    return N.MEOFE6aD(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_loadIfNecessary(long nativeNavigationControllerAndroid, Object caller) {
    N.MWJb9aa$(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_needsReload(long nativeNavigationControllerAndroid, Object caller) {
    return N.MsUTH_HQ(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_setNeedsReload(long nativeNavigationControllerAndroid, Object caller) {
    N.MQgIP2q9(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_canGoToOffset(long nativeNavigationControllerAndroid, Object caller, int offset) {
    return N.M4jjW0jG(nativeNavigationControllerAndroid, caller, offset);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_goBack(long nativeNavigationControllerAndroid, Object caller) {
    N.Mdhd0AR3(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_goForward(long nativeNavigationControllerAndroid, Object caller) {
    N.MEEEhNfT(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_goToOffset(long nativeNavigationControllerAndroid, Object caller, int offset) {
    N.ML_uBbdi(nativeNavigationControllerAndroid, caller, offset);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_goToNavigationIndex(long nativeNavigationControllerAndroid, Object caller, int index) {
    N.MuxwAbEo(nativeNavigationControllerAndroid, caller, index);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_cancelPendingReload(long nativeNavigationControllerAndroid, Object caller) {
    N.MNF4lMMb(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_continuePendingReload(long nativeNavigationControllerAndroid, Object caller) {
    N.Mp5SLq_N(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_reload(long nativeNavigationControllerAndroid, Object caller, boolean checkForRepost) {
    N.M81h$w2r(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_reloadBypassingCache(long nativeNavigationControllerAndroid, Object caller, boolean checkForRepost) {
    N.My0bMgld(nativeNavigationControllerAndroid, caller, checkForRepost);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_loadUrl(long nativeNavigationControllerAndroid, Object caller, String url, int loadUrlType, int transitionType, String referrerUrl, int referrerPolicy, int uaOverrideOption, String extraHeaders, Object postData, String baseUrlForDataUrl, String virtualUrlForDataUrl, String dataUrlAsString, boolean canLoadLocalResources, boolean isRendererInitiated, boolean shouldReplaceCurrentEntry, Object initiatorOrigin, boolean hasUserGesture, boolean shouldClearHistoryList, long inputStart, String sourcePackageName, String attributionSourceEventId, String attributionDestination, String attributionReportTo, long attributionExpiry) {
    N.MAqmDh4t(nativeNavigationControllerAndroid, caller, url, loadUrlType, transitionType, referrerUrl, referrerPolicy, uaOverrideOption, extraHeaders, postData, baseUrlForDataUrl, virtualUrlForDataUrl, dataUrlAsString, canLoadLocalResources, isRendererInitiated, shouldReplaceCurrentEntry, initiatorOrigin, hasUserGesture, shouldClearHistoryList, inputStart, sourcePackageName, attributionSourceEventId, attributionDestination, attributionReportTo, attributionExpiry);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_clearHistory(long nativeNavigationControllerAndroid, Object caller) {
    N.MK2ttcH1(nativeNavigationControllerAndroid, caller);
  }

  public static int org_chromium_content_browser_framehost_NavigationControllerImpl_getNavigationHistory(long nativeNavigationControllerAndroid, Object caller, Object history) {
    return N.MUZRDUOx(nativeNavigationControllerAndroid, caller, history);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_getDirectedNavigationHistory(long nativeNavigationControllerAndroid, Object caller, Object history, boolean isForward, int itemLimit) {
    N.Mx5VuK3_(nativeNavigationControllerAndroid, caller, history, isForward, itemLimit);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_clearSslPreferences(long nativeNavigationControllerAndroid, Object caller) {
    N.MpKIKzer(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_getUseDesktopUserAgent(long nativeNavigationControllerAndroid, Object caller) {
    return N.MCIN9$qH(nativeNavigationControllerAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_setUseDesktopUserAgent(long nativeNavigationControllerAndroid, Object caller, boolean override, boolean reloadOnChange) {
    N.MrilyCK6(nativeNavigationControllerAndroid, caller, override, reloadOnChange);
  }

  public static Object org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryAtIndex(long nativeNavigationControllerAndroid, Object caller, int index) {
    return N.MLcS2$Fy(nativeNavigationControllerAndroid, caller, index);
  }

  public static Object org_chromium_content_browser_framehost_NavigationControllerImpl_getVisibleEntry(long nativeNavigationControllerAndroid, Object caller) {
    return N.MHqMy8sY(nativeNavigationControllerAndroid, caller);
  }

  public static Object org_chromium_content_browser_framehost_NavigationControllerImpl_getPendingEntry(long nativeNavigationControllerAndroid, Object caller) {
    return N.Mgxh2WfC(nativeNavigationControllerAndroid, caller);
  }

  public static int org_chromium_content_browser_framehost_NavigationControllerImpl_getLastCommittedEntryIndex(long nativeNavigationControllerAndroid, Object caller) {
    return N.Mil0WqAo(nativeNavigationControllerAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_removeEntryAtIndex(long nativeNavigationControllerAndroid, Object caller, int index) {
    return N.MVbDeBRx(nativeNavigationControllerAndroid, caller, index);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_pruneForwardEntries(long nativeNavigationControllerAndroid, Object caller) {
    N.M2mQucXv(nativeNavigationControllerAndroid, caller);
  }

  public static String org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryExtraData(long nativeNavigationControllerAndroid, Object caller, int index, String key) {
    return N.McQE1GI8(nativeNavigationControllerAndroid, caller, index, key);
  }

  public static void org_chromium_content_browser_framehost_NavigationControllerImpl_setEntryExtraData(long nativeNavigationControllerAndroid, Object caller, int index, String key, String value) {
    N.Mw19wBW8(nativeNavigationControllerAndroid, caller, index, key, value);
  }

  public static boolean org_chromium_content_browser_framehost_NavigationControllerImpl_isEntryMarkedToBeSkipped(long nativeNavigationControllerAndroid, Object caller, int index) {
    return N.MVjP87pN(nativeNavigationControllerAndroid, caller, index);
  }

  public static Object org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedURL(long nativeRenderFrameHostAndroid, Object caller) {
    return N.MBg$jIAu(nativeRenderFrameHostAndroid, caller);
  }

  public static Object org_chromium_content_browser_framehost_RenderFrameHostImpl_getLastCommittedOrigin(long nativeRenderFrameHostAndroid, Object caller) {
    return N.Mcdslkop(nativeRenderFrameHostAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_RenderFrameHostImpl_getCanonicalUrlForSharing(long nativeRenderFrameHostAndroid, Object caller, Object callback) {
    N.MUV0o0vB(nativeRenderFrameHostAndroid, caller, callback);
  }

  public static boolean org_chromium_content_browser_framehost_RenderFrameHostImpl_isFeatureEnabled(long nativeRenderFrameHostAndroid, Object caller, int feature) {
    return N.MqDsGZSU(nativeRenderFrameHostAndroid, caller, feature);
  }

  public static Object org_chromium_content_browser_framehost_RenderFrameHostImpl_getAndroidOverlayRoutingToken(long nativeRenderFrameHostAndroid, Object caller) {
    return N.MJDViTxW(nativeRenderFrameHostAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_RenderFrameHostImpl_notifyUserActivation(long nativeRenderFrameHostAndroid, Object caller) {
    N.M$j92GA1(nativeRenderFrameHostAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_RenderFrameHostImpl_signalModalCloseWatcherIfActive(long nativeRenderFrameHostAndroid, Object caller) {
    return N.M3ps4Vah(nativeRenderFrameHostAndroid, caller);
  }

  public static boolean org_chromium_content_browser_framehost_RenderFrameHostImpl_isRenderFrameCreated(long nativeRenderFrameHostAndroid, Object caller) {
    return N.MhaRMzRy(nativeRenderFrameHostAndroid, caller);
  }

  public static void org_chromium_content_browser_framehost_RenderFrameHostImpl_getInterfaceToRendererFrame(long nativeRenderFrameHostAndroid, Object caller, String interfacename, int messagePipeRawHandle) {
    N.MXQk8pKb(nativeRenderFrameHostAndroid, caller, interfacename, messagePipeRawHandle);
  }

  public static void org_chromium_content_browser_framehost_RenderFrameHostImpl_terminateRendererDueToBadMessage(long nativeRenderFrameHostAndroid, Object caller, int reason) {
    N.MnlCu9CQ(nativeRenderFrameHostAndroid, caller, reason);
  }

  public static boolean org_chromium_content_browser_framehost_RenderFrameHostImpl_isProcessBlocked(long nativeRenderFrameHostAndroid, Object caller) {
    return N.M6cbowZq(nativeRenderFrameHostAndroid, caller);
  }

  public static Object org_chromium_content_browser_framehost_RenderFrameHostImpl_performGetAssertionWebAuthSecurityChecks(long nativeRenderFrameHostAndroid, Object caller, String relyingPartyId, Object effectiveOrigin) {
    return N.M5dgGNo$(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin);
  }

  public static int org_chromium_content_browser_framehost_RenderFrameHostImpl_performMakeCredentialWebAuthSecurityChecks(long nativeRenderFrameHostAndroid, Object caller, String relyingPartyId, Object effectiveOrigin, boolean isPaymentCredentialCreation) {
    return N.M2ouq_qG(nativeRenderFrameHostAndroid, caller, relyingPartyId, effectiveOrigin, isPaymentCredentialCreation);
  }

  public static int org_chromium_content_browser_framehost_RenderFrameHostImpl_getLifecycleState(long nativeRenderFrameHostAndroid, Object caller) {
    return N.MhJEceAt(nativeRenderFrameHostAndroid, caller);
  }

  public static void org_chromium_content_browser_input_DateTimeChooserAndroid_replaceDateTime(long nativeDateTimeChooserAndroid, Object caller, double dialogValue) {
    N.MgUhdCLo(nativeDateTimeChooserAndroid, caller, dialogValue);
  }

  public static void org_chromium_content_browser_input_DateTimeChooserAndroid_cancelDialog(long nativeDateTimeChooserAndroid, Object caller) {
    N.MCtaZNwj(nativeDateTimeChooserAndroid, caller);
  }

  public static long org_chromium_content_browser_input_ImeAdapterImpl_init(Object caller, Object webContents) {
    return N.MhbsQh1H(caller, webContents);
  }

  public static boolean org_chromium_content_browser_input_ImeAdapterImpl_sendKeyEvent(long nativeImeAdapterAndroid, Object caller, Object event, int type, int modifiers, long timestampMs, int keyCode, int scanCode, boolean isSystemKey, int unicodeChar) {
    return N.M1qwlrOP(nativeImeAdapterAndroid, caller, event, type, modifiers, timestampMs, keyCode, scanCode, isSystemKey, unicodeChar);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_appendUnderlineSpan(long spanPtr, int start, int end) {
    N.MFfRzF$Z(spanPtr, start, end);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_appendBackgroundColorSpan(long spanPtr, int start, int end, int backgroundColor) {
    N.MqqhDONa(spanPtr, start, end, backgroundColor);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_appendSuggestionSpan(long spanPtr, int start, int end, boolean isMisspelling, boolean removeOnFinishComposing, int underlineColor, int suggestionHighlightColor, String[] suggestions) {
    N.M$b45Vvn(spanPtr, start, end, isMisspelling, removeOnFinishComposing, underlineColor, suggestionHighlightColor, suggestions);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_setComposingText(long nativeImeAdapterAndroid, Object caller, Object text, String textStr, int newCursorPosition) {
    N.Mlslst_P(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_commitText(long nativeImeAdapterAndroid, Object caller, Object text, String textStr, int newCursorPosition) {
    N.Mb6t43di(nativeImeAdapterAndroid, caller, text, textStr, newCursorPosition);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_finishComposingText(long nativeImeAdapterAndroid, Object caller) {
    N.M_V5g5ie(nativeImeAdapterAndroid, caller);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_setEditableSelectionOffsets(long nativeImeAdapterAndroid, Object caller, int start, int end) {
    N.MmtjCblb(nativeImeAdapterAndroid, caller, start, end);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_setComposingRegion(long nativeImeAdapterAndroid, Object caller, int start, int end) {
    N.M8ty0WHb(nativeImeAdapterAndroid, caller, start, end);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingText(long nativeImeAdapterAndroid, Object caller, int before, int after) {
    N.M26GCjn5(nativeImeAdapterAndroid, caller, before, after);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_deleteSurroundingTextInCodePoints(long nativeImeAdapterAndroid, Object caller, int before, int after) {
    N.Mvb046o_(nativeImeAdapterAndroid, caller, before, after);
  }

  public static boolean org_chromium_content_browser_input_ImeAdapterImpl_requestTextInputStateUpdate(long nativeImeAdapterAndroid, Object caller) {
    return N.M7o5Xhhi(nativeImeAdapterAndroid, caller);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_requestCursorUpdate(long nativeImeAdapterAndroid, Object caller, boolean immediateRequest, boolean monitorRequest) {
    N.MdwW1P2L(nativeImeAdapterAndroid, caller, immediateRequest, monitorRequest);
  }

  public static void org_chromium_content_browser_input_ImeAdapterImpl_advanceFocusInForm(long nativeImeAdapterAndroid, Object caller, int focusType) {
    N.Mm_z91JF(nativeImeAdapterAndroid, caller, focusType);
  }

  public static void org_chromium_content_browser_input_SelectPopup_selectMenuItems(long nativeSelectPopup, Object caller, long nativeSelectPopupSourceFrame, int[] indices) {
    N.ME0LgXse(nativeSelectPopup, caller, nativeSelectPopupSourceFrame, indices);
  }

  public static void org_chromium_content_browser_input_TextSuggestionHost_applySpellCheckSuggestion(long nativeTextSuggestionHostAndroid, Object caller, String suggestion) {
    N.M7RnYR2r(nativeTextSuggestionHostAndroid, caller, suggestion);
  }

  public static void org_chromium_content_browser_input_TextSuggestionHost_applyTextSuggestion(long nativeTextSuggestionHostAndroid, Object caller, int markerTag, int suggestionIndex) {
    N.MIADbBhq(nativeTextSuggestionHostAndroid, caller, markerTag, suggestionIndex);
  }

  public static void org_chromium_content_browser_input_TextSuggestionHost_deleteActiveSuggestionRange(long nativeTextSuggestionHostAndroid, Object caller) {
    N.MCBTtv2g(nativeTextSuggestionHostAndroid, caller);
  }

  public static void org_chromium_content_browser_input_TextSuggestionHost_onNewWordAddedToDictionary(long nativeTextSuggestionHostAndroid, Object caller, String word) {
    N.MpJ8AQhr(nativeTextSuggestionHostAndroid, caller, word);
  }

  public static void org_chromium_content_browser_input_TextSuggestionHost_onSuggestionMenuClosed(long nativeTextSuggestionHostAndroid, Object caller) {
    N.MnvYa0QF(nativeTextSuggestionHostAndroid, caller);
  }

  public static long org_chromium_content_browser_selection_SelectionPopupControllerImpl_init(Object caller, Object webContents) {
    return N.MJHXNa8U(caller, webContents);
  }

  public static void org_chromium_content_browser_selection_SelectionPopupControllerImpl_setTextHandlesTemporarilyHidden(long nativeSelectionPopupController, Object caller, boolean hidden) {
    N.M01adZlM(nativeSelectionPopupController, caller, hidden);
  }

  public static long org_chromium_content_browser_selection_SmartSelectionClient_init(Object caller, Object webContents) {
    return N.MFA_dMJC(caller, webContents);
  }

  public static void org_chromium_content_browser_selection_SmartSelectionClient_requestSurroundingText(long nativeSmartSelectionClient, Object caller, int numExtraCharacters, int callbackData) {
    N.M2GZ6ZNR(nativeSmartSelectionClient, caller, numExtraCharacters, callbackData);
  }

  public static void org_chromium_content_browser_selection_SmartSelectionClient_cancelAllRequests(long nativeSmartSelectionClient, Object caller) {
    N.MVHq2mA2(nativeSmartSelectionClient, caller);
  }

  public static void org_chromium_content_browser_sms_SmsProviderGms_onReceive(long nativeSmsProviderGms, String sms, int backend) {
    N.MDAxNisW(nativeSmsProviderGms, sms, backend);
  }

  public static void org_chromium_content_browser_sms_SmsProviderGms_onTimeout(long nativeSmsProviderGms) {
    N.Mz9c1Rem(nativeSmsProviderGms);
  }

  public static void org_chromium_content_browser_sms_SmsProviderGms_onCancel(long nativeSmsProviderGms) {
    N.MqHdTL15(nativeSmsProviderGms);
  }

  public static void org_chromium_content_browser_sms_SmsProviderGms_onNotAvailable(long nativeSmsProviderGms) {
    N.M$UJTj5O(nativeSmsProviderGms);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_destroyWebContents(long webContentsAndroidPtr) {
    N.MxxzO9Pe(webContentsAndroidPtr);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_fromNativePtr(long webContentsAndroidPtr) {
    return N.M$eaBDjM(webContentsAndroidPtr);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_clearNativeReference(long nativeWebContentsAndroid, Object caller) {
    N.M0iG1Oc2(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getTopLevelNativeWindow(long nativeWebContentsAndroid, Object caller) {
    return N.MunY3e38(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setTopLevelNativeWindow(long nativeWebContentsAndroid, Object caller, Object windowAndroid) {
    N.MOKG_Wbb(nativeWebContentsAndroid, caller, windowAndroid);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getMainFrame(long nativeWebContentsAndroid, Object caller) {
    return N.MjidYpBx(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getFocusedFrame(long nativeWebContentsAndroid, Object caller) {
    return N.MT2cFaRc(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getRenderFrameHostFromId(long nativeWebContentsAndroid, int renderProcessId, int renderFrameId) {
    return N.MZAK3_Tx(nativeWebContentsAndroid, renderProcessId, renderFrameId);
  }

  public static Object[] org_chromium_content_browser_webcontents_WebContentsImpl_getAllRenderFrameHosts(long nativeWebContentsAndroid, Object caller) {
    return N.MEpC20hN(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getRenderWidgetHostView(long nativeWebContentsAndroid, Object caller) {
    return N.Mj9slq6o(nativeWebContentsAndroid, caller);
  }

  public static Object[] org_chromium_content_browser_webcontents_WebContentsImpl_getInnerWebContents(long nativeWebContentsAndroid, Object caller) {
    return N.MJSe_z5C(nativeWebContentsAndroid, caller);
  }

  public static int org_chromium_content_browser_webcontents_WebContentsImpl_getVisibility(long nativeWebContentsAndroid) {
    return N.MOzDgqoz(nativeWebContentsAndroid);
  }

  public static String org_chromium_content_browser_webcontents_WebContentsImpl_getTitle(long nativeWebContentsAndroid, Object caller) {
    return N.M7OgjMU8(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getVisibleURL(long nativeWebContentsAndroid, Object caller) {
    return N.M8927Uaf(nativeWebContentsAndroid, caller);
  }

  public static String org_chromium_content_browser_webcontents_WebContentsImpl_getEncoding(long nativeWebContentsAndroid, Object caller) {
    return N.M4pZ82rG(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isLoading(long nativeWebContentsAndroid, Object caller) {
    return N.MtSTkEp2(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isLoadingToDifferentDocument(long nativeWebContentsAndroid, Object caller) {
    return N.M93b11tE(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_dispatchBeforeUnload(long nativeWebContentsAndroid, Object caller, boolean autoCancel) {
    N.M6R_ShZs(nativeWebContentsAndroid, caller, autoCancel);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_stop(long nativeWebContentsAndroid, Object caller) {
    N.M$$25N5$(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_cut(long nativeWebContentsAndroid, Object caller) {
    N.MhIiCaN7(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_copy(long nativeWebContentsAndroid, Object caller) {
    N.MpfMxfut(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_paste(long nativeWebContentsAndroid, Object caller) {
    N.MYRJ_nNk(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_pasteAsPlainText(long nativeWebContentsAndroid, Object caller) {
    N.MdSkKRWg(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_replace(long nativeWebContentsAndroid, Object caller, String word) {
    N.MevqfbP8(nativeWebContentsAndroid, caller, word);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_selectAll(long nativeWebContentsAndroid, Object caller) {
    N.MNvj1u1S(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_collapseSelection(long nativeWebContentsAndroid, Object caller) {
    N.MDK_KK0z(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_onHide(long nativeWebContentsAndroid, Object caller) {
    N.MHNkuuGQ(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_onShow(long nativeWebContentsAndroid, Object caller) {
    N.MtakfqIH(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setImportance(long nativeWebContentsAndroid, Object caller, int importance) {
    N.MkBVGSRs(nativeWebContentsAndroid, caller, importance);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_suspendAllMediaPlayers(long nativeWebContentsAndroid, Object caller) {
    N.MSOsA4Ii(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setAudioMuted(long nativeWebContentsAndroid, Object caller, boolean mute) {
    N.M4fkbrQM(nativeWebContentsAndroid, caller, mute);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_focusLocationBarByDefault(long nativeWebContentsAndroid, Object caller) {
    return N.MkIL2bW9(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isFullscreenForCurrentTab(long nativeWebContentsAndroid, Object caller) {
    return N.M2hIwGoV(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_exitFullscreen(long nativeWebContentsAndroid, Object caller) {
    N.M6c69Eq5(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_scrollFocusedEditableNodeIntoView(long nativeWebContentsAndroid, Object caller) {
    N.MgbVQff0(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_selectWordAroundCaret(long nativeWebContentsAndroid, Object caller) {
    N.MlfwWHGJ(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_adjustSelectionByCharacterOffset(long nativeWebContentsAndroid, Object caller, int startAdjust, int endAdjust, boolean showSelectionMenu) {
    N.MjgOFo_o(nativeWebContentsAndroid, caller, startAdjust, endAdjust, showSelectionMenu);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getLastCommittedURL(long nativeWebContentsAndroid, Object caller) {
    return N.MrqMRJsG(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isIncognito(long nativeWebContentsAndroid, Object caller) {
    return N.MZbfAARG(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_resumeLoadingCreatedWebContents(long nativeWebContentsAndroid, Object caller) {
    N.MQnLkNkP(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScript(long nativeWebContentsAndroid, Object caller, String script, Object callback) {
    N.M0uS2SDH(nativeWebContentsAndroid, caller, script, callback);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScriptForTests(long nativeWebContentsAndroid, Object caller, String script, Object callback) {
    N.MPoHZQTR(nativeWebContentsAndroid, caller, script, callback);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_addMessageToDevToolsConsole(long nativeWebContentsAndroid, Object caller, int level, String message) {
    N.MseJ7A4a(nativeWebContentsAndroid, caller, level, message);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_postMessageToMainFrame(long nativeWebContentsAndroid, Object caller, String message, String sourceOrigin, String targetOrigin, Object[] ports) {
    N.MZFXk0el(nativeWebContentsAndroid, caller, message, sourceOrigin, targetOrigin, ports);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_hasAccessedInitialDocument(long nativeWebContentsAndroid, Object caller) {
    return N.M6It8dra(nativeWebContentsAndroid, caller);
  }

  public static int org_chromium_content_browser_webcontents_WebContentsImpl_getThemeColor(long nativeWebContentsAndroid, Object caller) {
    return N.MGZCJ6jO(nativeWebContentsAndroid, caller);
  }

  public static float org_chromium_content_browser_webcontents_WebContentsImpl_getLoadProgress(long nativeWebContentsAndroid, Object caller) {
    return N.MoQgY_pw(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_requestSmartClipExtract(long nativeWebContentsAndroid, Object caller, Object callback, int x, int y, int width, int height) {
    N.MHF1rPTW(nativeWebContentsAndroid, caller, callback, x, y, width, height);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_requestAccessibilitySnapshot(long nativeWebContentsAndroid, Object viewStructureRoot, Object viewStructureBuilder, Object doneCallback) {
    N.M16eLpU9(nativeWebContentsAndroid, viewStructureRoot, viewStructureBuilder, doneCallback);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setOverscrollRefreshHandler(long nativeWebContentsAndroid, Object caller, Object nativeOverscrollRefreshHandler) {
    N.MTTB8znA(nativeWebContentsAndroid, caller, nativeOverscrollRefreshHandler);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setSpatialNavigationDisabled(long nativeWebContentsAndroid, Object caller, boolean disabled) {
    N.MjBPqNgx(nativeWebContentsAndroid, caller, disabled);
  }

  public static int org_chromium_content_browser_webcontents_WebContentsImpl_downloadImage(long nativeWebContentsAndroid, Object caller, Object url, boolean isFavicon, int maxBitmapSize, boolean bypassCache, Object callback) {
    return N.Mi3V1mlO(nativeWebContentsAndroid, caller, url, isFavicon, maxBitmapSize, bypassCache, callback);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setHasPersistentVideo(long nativeWebContentsAndroid, Object caller, boolean value) {
    N.M12SiBFk(nativeWebContentsAndroid, caller, value);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_hasActiveEffectivelyFullscreenVideo(long nativeWebContentsAndroid, Object caller) {
    return N.MZao1OQG(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isPictureInPictureAllowedForFullscreenVideo(long nativeWebContentsAndroid, Object caller) {
    return N.MS0xMYL9(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getFullscreenVideoSize(long nativeWebContentsAndroid, Object caller) {
    return N.MN9JdEk5(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setSize(long nativeWebContentsAndroid, Object caller, int width, int height) {
    N.M7tTrJ_X(nativeWebContentsAndroid, caller, width, height);
  }

  public static int org_chromium_content_browser_webcontents_WebContentsImpl_getWidth(long nativeWebContentsAndroid, Object caller) {
    return N.MB0i5_ri(nativeWebContentsAndroid, caller);
  }

  public static int org_chromium_content_browser_webcontents_WebContentsImpl_getHeight(long nativeWebContentsAndroid, Object caller) {
    return N.MRVeP4Wk(nativeWebContentsAndroid, caller);
  }

  public static Object org_chromium_content_browser_webcontents_WebContentsImpl_getOrCreateEventForwarder(long nativeWebContentsAndroid, Object caller) {
    return N.MJJFrmZs(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setViewAndroidDelegate(long nativeWebContentsAndroid, Object caller, Object viewDelegate) {
    N.MgyWdCWB(nativeWebContentsAndroid, caller, viewDelegate);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_sendOrientationChangeEvent(long nativeWebContentsAndroid, Object caller, int orientation) {
    N.MlztHl3v(nativeWebContentsAndroid, caller, orientation);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_onScaleFactorChanged(long nativeWebContentsAndroid, Object caller) {
    N.MqhGkzSt(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setFocus(long nativeWebContentsAndroid, Object caller, boolean focused) {
    N.M9QxNoTJ(nativeWebContentsAndroid, caller, focused);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_setDisplayCutoutSafeArea(long nativeWebContentsAndroid, Object caller, int top, int left, int bottom, int right) {
    N.MtjP03pj(nativeWebContentsAndroid, caller, top, left, bottom, right);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_notifyRendererPreferenceUpdate(long nativeWebContentsAndroid, Object caller) {
    N.Mzsx8Sk2(nativeWebContentsAndroid, caller);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsImpl_notifyBrowserControlsHeightChanged(long nativeWebContentsAndroid, Object caller) {
    N.MgcGzQax(nativeWebContentsAndroid, caller);
  }

  public static boolean org_chromium_content_browser_webcontents_WebContentsImpl_isBeingDestroyed(long nativeWebContentsAndroid, Object caller) {
    return N.M5A4vDoy(nativeWebContentsAndroid, caller);
  }

  public static long org_chromium_content_browser_webcontents_WebContentsObserverProxy_init(Object caller, Object webContents) {
    return N.MTpUzW91(caller, webContents);
  }

  public static void org_chromium_content_browser_webcontents_WebContentsObserverProxy_destroy(long nativeWebContentsObserverProxy, Object caller) {
    N.M7giG0Ri(nativeWebContentsObserverProxy, caller);
  }

  public static boolean org_chromium_content_1public_browser_LoadUrlParams_isDataScheme(String url) {
    return N.MWH2gOYe(url);
  }

  public static void org_chromium_content_1public_browser_NavigationHandle_setRequestHeader(long nativeNavigationHandleProxy, String headerName, String headerValue) {
    N.MACALLtV(nativeNavigationHandleProxy, headerName, headerValue);
  }

  public static void org_chromium_content_1public_browser_NavigationHandle_removeRequestHeader(long nativeNavigationHandleProxy, String headerName) {
    N.Mo7byNs$(nativeNavigationHandleProxy, headerName);
  }

  public static byte[] org_chromium_content_1public_common_ResourceRequestBody_createResourceRequestBodyFromBytes(byte[] httpBody) {
    return N.MugoAW_d(httpBody);
  }

  public static boolean org_chromium_content_1public_common_UseZoomForDSFPolicy_isUseZoomForDSFEnabled() {
    return N.MbmAQ8fm();
  }

  public static void org_chromium_content_1shell_Shell_closeShell(long shellPtr) {
    N.MA$VlWhf(shellPtr);
  }

  public static void org_chromium_content_1shell_ShellManager_init(Object shellManagerInstance) {
    N.MjcemmYH(shellManagerInstance);
  }

  public static void org_chromium_content_1shell_ShellManager_launchShell(String url) {
    N.M$q6PJ5w(url);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothAdapter_onScanFailed(long nativeBluetoothAdapterAndroid, Object caller) {
    N.Mq3WoOFf(nativeBluetoothAdapterAndroid, caller);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothAdapter_createOrUpdateDeviceOnScan(long nativeBluetoothAdapterAndroid, Object caller, String address, Object deviceWrapper, String localName, int rssi, String[] advertisedUuids, int txPower, String[] serviceDataKeys, Object[] serviceDataValues, int[] manufacturerDataKeys, Object[] manufacturerDataValues, int advertiseFlags) {
    N.MOuw3NGo(nativeBluetoothAdapterAndroid, caller, address, deviceWrapper, localName, rssi, advertisedUuids, txPower, serviceDataKeys, serviceDataValues, manufacturerDataKeys, manufacturerDataValues, advertiseFlags);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothAdapter_onAdapterStateChanged(long nativeBluetoothAdapterAndroid, Object caller, boolean powered) {
    N.MGGbKqrZ(nativeBluetoothAdapterAndroid, caller, powered);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothDevice_onConnectionStateChange(long nativeBluetoothDeviceAndroid, Object caller, int status, boolean connected) {
    N.MmnW7gQC(nativeBluetoothDeviceAndroid, caller, status, connected);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothDevice_createGattRemoteService(long nativeBluetoothDeviceAndroid, Object caller, String instanceId, Object serviceWrapper) {
    N.MAoRk69U(nativeBluetoothDeviceAndroid, caller, instanceId, serviceWrapper);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothDevice_onGattServicesDiscovered(long nativeBluetoothDeviceAndroid, Object caller) {
    N.M9HSgyay(nativeBluetoothDeviceAndroid, caller);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onChanged(long nativeBluetoothRemoteGattCharacteristicAndroid, Object caller, byte[] value) {
    N.MZCKcdTH(nativeBluetoothRemoteGattCharacteristicAndroid, caller, value);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onRead(long nativeBluetoothRemoteGattCharacteristicAndroid, Object caller, int status, byte[] value) {
    N.Mn9Gzi$d(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status, value);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onWrite(long nativeBluetoothRemoteGattCharacteristicAndroid, Object caller, int status) {
    N.M3TCxDs5(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_createGattRemoteDescriptor(long nativeBluetoothRemoteGattCharacteristicAndroid, Object caller, String instanceId, Object descriptorWrapper, Object chromeBluetoothDevice) {
    N.MkqvrLoV(nativeBluetoothRemoteGattCharacteristicAndroid, caller, instanceId, descriptorWrapper, chromeBluetoothDevice);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onRead(long nativeBluetoothRemoteGattDescriptorAndroid, Object caller, int status, byte[] value) {
    N.MaKNZo8k(nativeBluetoothRemoteGattDescriptorAndroid, caller, status, value);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onWrite(long nativeBluetoothRemoteGattDescriptorAndroid, Object caller, int status) {
    N.M4SmPJiR(nativeBluetoothRemoteGattDescriptorAndroid, caller, status);
  }

  public static void org_chromium_device_bluetooth_ChromeBluetoothRemoteGattService_createGattRemoteCharacteristic(long nativeBluetoothRemoteGattServiceAndroid, Object caller, String instanceId, Object characteristicWrapper, Object chromeBluetoothDevice) {
    N.MM2CqKoK(nativeBluetoothRemoteGattServiceAndroid, caller, instanceId, characteristicWrapper, chromeBluetoothDevice);
  }

  public static void org_chromium_device_gamepad_GamepadList_setGamepadData(Object caller, long webGamepadsPtr, int index, boolean mapping, boolean connected, String devicename, int vendorId, int productId, long timestamp, float[] axes, float[] buttons, int buttonsLength) {
    N.MOkngxPY(caller, webGamepadsPtr, index, mapping, connected, devicename, vendorId, productId, timestamp, axes, buttons, buttonsLength);
  }

  public static void org_chromium_device_geolocation_LocationProviderAdapter_newLocationAvailable(double latitude, double longitude, double timeStamp, boolean hasAltitude, double altitude, boolean hasAccuracy, double accuracy, boolean hasHeading, double heading, boolean hasSpeed, double speed) {
    N.MvJnRjJi(latitude, longitude, timeStamp, hasAltitude, altitude, hasAccuracy, accuracy, hasHeading, heading, hasSpeed, speed);
  }

  public static void org_chromium_device_geolocation_LocationProviderAdapter_newErrorAvailable(String message) {
    N.M8Iz7Ptw(message);
  }

  public static void org_chromium_device_sensors_PlatformSensor_notifyPlatformSensorError(long nativePlatformSensorAndroid, Object caller) {
    N.MrHXg7he(nativePlatformSensorAndroid, caller);
  }

  public static void org_chromium_device_sensors_PlatformSensor_updatePlatformSensorReading(long nativePlatformSensorAndroid, Object caller, double timestamp, double value1, double value2, double value3, double value4) {
    N.Mb4JvlL7(nativePlatformSensorAndroid, caller, timestamp, value1, value2, value3, value4);
  }

  public static void org_chromium_device_time_1zone_1monitor_TimeZoneMonitor_timeZoneChangedFromJava(long nativeTimeZoneMonitorAndroid, Object caller) {
    N.MjxIGcDd(nativeTimeZoneMonitorAndroid, caller);
  }

  public static void org_chromium_device_usb_ChromeUsbService_deviceAttached(long nativeUsbServiceAndroid, Object caller, Object device) {
    N.MNmyS$Xi(nativeUsbServiceAndroid, caller, device);
  }

  public static void org_chromium_device_usb_ChromeUsbService_deviceDetached(long nativeUsbServiceAndroid, Object caller, int deviceId) {
    N.MrBuy2sN(nativeUsbServiceAndroid, caller, deviceId);
  }

  public static void org_chromium_device_usb_ChromeUsbService_devicePermissionRequestComplete(long nativeUsbServiceAndroid, Object caller, int deviceId, boolean granted) {
    N.MDvFAfgT(nativeUsbServiceAndroid, caller, deviceId, granted);
  }

  public static void org_chromium_media_AudioManagerAndroid_setMute(long nativeAudioManagerAndroid, Object caller, boolean muted) {
    N.MCgftn_d(nativeAudioManagerAndroid, caller, muted);
  }

  public static Object org_chromium_media_AudioTrackOutputStream_onMoreData(long nativeAudioTrackOutputStream, Object caller, Object audioData, long delayInFrames) {
    return N.MEPH2V3G(nativeAudioTrackOutputStream, caller, audioData, delayInFrames);
  }

  public static void org_chromium_media_AudioTrackOutputStream_onError(long nativeAudioTrackOutputStream, Object caller) {
    N.Mr6$Ko2f(nativeAudioTrackOutputStream, caller);
  }

  public static long org_chromium_media_AudioTrackOutputStream_getAddress(long nativeAudioTrackOutputStream, Object caller, Object byteBuffer) {
    return N.MMQ1O_vA(nativeAudioTrackOutputStream, caller, byteBuffer);
  }

  public static int org_chromium_media_HdrMetadata_primaries(long nativeJniHdrMetadata, Object caller) {
    return N.M6EY_9Mw(nativeJniHdrMetadata, caller);
  }

  public static int org_chromium_media_HdrMetadata_colorTransfer(long nativeJniHdrMetadata, Object caller) {
    return N.Myx2EYmS(nativeJniHdrMetadata, caller);
  }

  public static int org_chromium_media_HdrMetadata_range(long nativeJniHdrMetadata, Object caller) {
    return N.MGKRBsYQ(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryRChromaticityX(long nativeJniHdrMetadata, Object caller) {
    return N.Mc0wiJ8$(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryRChromaticityY(long nativeJniHdrMetadata, Object caller) {
    return N.MYP0SLZ2(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryGChromaticityX(long nativeJniHdrMetadata, Object caller) {
    return N.MRQrYl4t(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryGChromaticityY(long nativeJniHdrMetadata, Object caller) {
    return N.MtgfnGGz(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryBChromaticityX(long nativeJniHdrMetadata, Object caller) {
    return N.McEG$Qxu(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_primaryBChromaticityY(long nativeJniHdrMetadata, Object caller) {
    return N.MU6WBitK(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_whitePointChromaticityX(long nativeJniHdrMetadata, Object caller) {
    return N.M8pzdQ$h(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_whitePointChromaticityY(long nativeJniHdrMetadata, Object caller) {
    return N.MXbY07SE(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_maxColorVolumeLuminance(long nativeJniHdrMetadata, Object caller) {
    return N.MGZajSAq(nativeJniHdrMetadata, caller);
  }

  public static float org_chromium_media_HdrMetadata_minColorVolumeLuminance(long nativeJniHdrMetadata, Object caller) {
    return N.MQY9Ofp7(nativeJniHdrMetadata, caller);
  }

  public static int org_chromium_media_HdrMetadata_maxContentLuminance(long nativeJniHdrMetadata, Object caller) {
    return N.MMmvZ$nS(nativeJniHdrMetadata, caller);
  }

  public static int org_chromium_media_HdrMetadata_maxFrameAverageLuminance(long nativeJniHdrMetadata, Object caller) {
    return N.MzRCryEE(nativeJniHdrMetadata, caller);
  }

  public static void org_chromium_media_MediaCodecBridge_onBuffersAvailable(long nativeMediaCodecBridge, Object caller) {
    N.MNqjfk23(nativeMediaCodecBridge, caller);
  }

  public static void org_chromium_media_MediaDrmBridge_onMediaCryptoReady(long nativeMediaDrmBridge, Object caller, Object mediaCrypto) {
    N.MV9yuwVC(nativeMediaDrmBridge, caller, mediaCrypto);
  }

  public static void org_chromium_media_MediaDrmBridge_onProvisionRequest(long nativeMediaDrmBridge, Object caller, String defaultUrl, byte[] requestData) {
    N.MmhSkOYV(nativeMediaDrmBridge, caller, defaultUrl, requestData);
  }

  public static void org_chromium_media_MediaDrmBridge_onProvisioningComplete(long nativeMediaDrmBridge, Object caller, boolean success) {
    N.MAaklmRW(nativeMediaDrmBridge, caller, success);
  }

  public static void org_chromium_media_MediaDrmBridge_onPromiseResolved(long nativeMediaDrmBridge, Object caller, long promiseId) {
    N.MOzXytse(nativeMediaDrmBridge, caller, promiseId);
  }

  public static void org_chromium_media_MediaDrmBridge_onPromiseResolvedWithSession(long nativeMediaDrmBridge, Object caller, long promiseId, byte[] emeSessionId) {
    N.MtWWjNjU(nativeMediaDrmBridge, caller, promiseId, emeSessionId);
  }

  public static void org_chromium_media_MediaDrmBridge_onPromiseRejected(long nativeMediaDrmBridge, Object caller, long promiseId, String errorMessage) {
    N.M2P7BQ98(nativeMediaDrmBridge, caller, promiseId, errorMessage);
  }

  public static void org_chromium_media_MediaDrmBridge_onSessionMessage(long nativeMediaDrmBridge, Object caller, byte[] emeSessionId, int requestType, byte[] message) {
    N.Mf7HZHqV(nativeMediaDrmBridge, caller, emeSessionId, requestType, message);
  }

  public static void org_chromium_media_MediaDrmBridge_onSessionClosed(long nativeMediaDrmBridge, Object caller, byte[] emeSessionId) {
    N.MulYy5b7(nativeMediaDrmBridge, caller, emeSessionId);
  }

  public static void org_chromium_media_MediaDrmBridge_onSessionKeysChange(long nativeMediaDrmBridge, Object caller, byte[] emeSessionId, Object[] keysInfo, boolean hasAdditionalUsableKey, boolean isKeyRelease) {
    N.Mk8V79M2(nativeMediaDrmBridge, caller, emeSessionId, keysInfo, hasAdditionalUsableKey, isKeyRelease);
  }

  public static void org_chromium_media_MediaDrmBridge_onSessionExpirationUpdate(long nativeMediaDrmBridge, Object caller, byte[] emeSessionId, long expirationTime) {
    N.MFLUFEZc(nativeMediaDrmBridge, caller, emeSessionId, expirationTime);
  }

  public static void org_chromium_media_MediaDrmStorageBridge_onProvisioned(long nativeMediaDrmStorageBridge, Object caller, Object cb) {
    N.ME6vNmlv(nativeMediaDrmStorageBridge, caller, cb);
  }

  public static void org_chromium_media_MediaDrmStorageBridge_onLoadInfo(long nativeMediaDrmStorageBridge, Object caller, byte[] sessionId, Object cb) {
    N.Mmi_qOX8(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  public static void org_chromium_media_MediaDrmStorageBridge_onSaveInfo(long nativeMediaDrmStorageBridge, Object caller, Object info, Object cb) {
    N.MeALR1v2(nativeMediaDrmStorageBridge, caller, info, cb);
  }

  public static void org_chromium_media_MediaDrmStorageBridge_onClearInfo(long nativeMediaDrmStorageBridge, Object caller, byte[] sessionId, Object cb) {
    N.MYa_y6Dg(nativeMediaDrmStorageBridge, caller, sessionId, cb);
  }

  public static void org_chromium_media_MediaPlayerBridge_onDidSetDataUriDataSource(long nativeMediaPlayerBridge, Object caller, boolean success) {
    N.Mo4Rd8TE(nativeMediaPlayerBridge, caller, success);
  }

  public static void org_chromium_media_MediaPlayerListener_onMediaError(long nativeMediaPlayerListener, Object caller, int errorType) {
    N.Myj2LnkZ(nativeMediaPlayerListener, caller, errorType);
  }

  public static void org_chromium_media_MediaPlayerListener_onVideoSizeChanged(long nativeMediaPlayerListener, Object caller, int width, int height) {
    N.Mfq$ZJpW(nativeMediaPlayerListener, caller, width, height);
  }

  public static void org_chromium_media_MediaPlayerListener_onMediaPrepared(long nativeMediaPlayerListener, Object caller) {
    N.MQTompEl(nativeMediaPlayerListener, caller);
  }

  public static void org_chromium_media_MediaPlayerListener_onPlaybackComplete(long nativeMediaPlayerListener, Object caller) {
    N.MX$D6jYE(nativeMediaPlayerListener, caller);
  }

  public static void org_chromium_media_MediaServerCrashListener_onMediaServerCrashDetected(long nativeMediaServerCrashListener, Object caller, boolean watchdogNeedsRelease) {
    N.Mm$QSrAo(nativeMediaServerCrashListener, caller, watchdogNeedsRelease);
  }

  public static void org_chromium_media_ScreenCapture_onRGBAFrameAvailable(long nativeScreenCaptureMachineAndroid, Object caller, Object buf, int rowStride, int left, int top, int width, int height, long timestamp) {
    N.MjDBp6op(nativeScreenCaptureMachineAndroid, caller, buf, rowStride, left, top, width, height, timestamp);
  }

  public static void org_chromium_media_ScreenCapture_onI420FrameAvailable(long nativeScreenCaptureMachineAndroid, Object caller, Object yBuffer, int yStride, Object uBuffer, Object vBuffer, int uvRowStride, int uvPixelStride, int left, int top, int width, int height, long timestamp) {
    N.MgLL$kUF(nativeScreenCaptureMachineAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, left, top, width, height, timestamp);
  }

  public static void org_chromium_media_ScreenCapture_onActivityResult(long nativeScreenCaptureMachineAndroid, Object caller, boolean result) {
    N.M2auslLM(nativeScreenCaptureMachineAndroid, caller, result);
  }

  public static void org_chromium_media_ScreenCapture_onOrientationChange(long nativeScreenCaptureMachineAndroid, Object caller, int rotation) {
    N.Ml8UDaFX(nativeScreenCaptureMachineAndroid, caller, rotation);
  }

  public static void org_chromium_media_VideoCapture_onFrameAvailable(long nativeVideoCaptureDeviceAndroid, Object caller, byte[] data, int length, int rotation) {
    N.Mq5gIPzl(nativeVideoCaptureDeviceAndroid, caller, data, length, rotation);
  }

  public static void org_chromium_media_VideoCapture_onI420FrameAvailable(long nativeVideoCaptureDeviceAndroid, Object caller, Object yBuffer, int yStride, Object uBuffer, Object vBuffer, int uvRowStride, int uvPixelStride, int width, int height, int rotation, long timestamp) {
    N.MlTacwJQ(nativeVideoCaptureDeviceAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, width, height, rotation, timestamp);
  }

  public static void org_chromium_media_VideoCapture_onError(long nativeVideoCaptureDeviceAndroid, Object caller, int androidVideoCaptureError, String message) {
    N.MhmwjISE(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureError, message);
  }

  public static void org_chromium_media_VideoCapture_onFrameDropped(long nativeVideoCaptureDeviceAndroid, Object caller, int androidVideoCaptureFrameDropReason) {
    N.M651cEC1(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureFrameDropReason);
  }

  public static void org_chromium_media_VideoCapture_onGetPhotoCapabilitiesReply(long nativeVideoCaptureDeviceAndroid, Object caller, long callbackId, Object result) {
    N.MumkJZ3e(nativeVideoCaptureDeviceAndroid, caller, callbackId, result);
  }

  public static void org_chromium_media_VideoCapture_onPhotoTaken(long nativeVideoCaptureDeviceAndroid, Object caller, long callbackId, byte[] data) {
    N.MdZBZ$ST(nativeVideoCaptureDeviceAndroid, caller, callbackId, data);
  }

  public static void org_chromium_media_VideoCapture_onStarted(long nativeVideoCaptureDeviceAndroid, Object caller) {
    N.MPaf3s5k(nativeVideoCaptureDeviceAndroid, caller);
  }

  public static void org_chromium_media_VideoCapture_dCheckCurrentlyOnIncomingTaskRunner(long nativeVideoCaptureDeviceAndroid, Object caller) {
    N.Mqw5545M(nativeVideoCaptureDeviceAndroid, caller);
  }

  public static void org_chromium_midi_MidiInputPortAndroid_onData(long nativeMidiInputPortAndroid, byte[] bs, int offset, int count, long timestamp) {
    N.MzDIdqgH(nativeMidiInputPortAndroid, bs, offset, count, timestamp);
  }

  public static void org_chromium_midi_MidiManagerAndroid_onInitialized(long nativeMidiManagerAndroid, Object[] devices) {
    N.M3znzcE9(nativeMidiManagerAndroid, devices);
  }

  public static void org_chromium_midi_MidiManagerAndroid_onInitializationFailed(long nativeMidiManagerAndroid) {
    N.MfmZ2$zu(nativeMidiManagerAndroid);
  }

  public static void org_chromium_midi_MidiManagerAndroid_onAttached(long nativeMidiManagerAndroid, Object device) {
    N.MEOWUhL5(nativeMidiManagerAndroid, device);
  }

  public static void org_chromium_midi_MidiManagerAndroid_onDetached(long nativeMidiManagerAndroid, Object device) {
    N.Md3XPFG5(nativeMidiManagerAndroid, device);
  }

  public static void org_chromium_midi_UsbMidiDeviceAndroid_onData(long nativeUsbMidiDeviceAndroid, int endpointNumber, byte[] data) {
    N.MNGB4bj1(nativeUsbMidiDeviceAndroid, endpointNumber, data);
  }

  public static void org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceRequestDone(long nativeUsbMidiDeviceFactoryAndroid, Object[] devices) {
    N.MrVQrlMA(nativeUsbMidiDeviceFactoryAndroid, devices);
  }

  public static void org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceAttached(long nativeUsbMidiDeviceFactoryAndroid, Object device) {
    N.MGbhHafy(nativeUsbMidiDeviceFactoryAndroid, device);
  }

  public static void org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceDetached(long nativeUsbMidiDeviceFactoryAndroid, int index) {
    N.MQPqHj_p(nativeUsbMidiDeviceFactoryAndroid, index);
  }

  public static long org_chromium_mojo_system_impl_BaseRunLoop_createBaseRunLoop(Object caller) {
    return N.MOJ55i7J(caller);
  }

  public static void org_chromium_mojo_system_impl_BaseRunLoop_run(Object caller) {
    N.MWXT8JHC(caller);
  }

  public static void org_chromium_mojo_system_impl_BaseRunLoop_runUntilIdle(Object caller) {
    N.MeWGVAnX(caller);
  }

  public static void org_chromium_mojo_system_impl_BaseRunLoop_quit(Object caller) {
    N.MvPYY0Pk(caller);
  }

  public static void org_chromium_mojo_system_impl_BaseRunLoop_postDelayedTask(Object caller, long runLoopID, Object runnable, long delay) {
    N.Mg$AGbqU(caller, runLoopID, runnable, delay);
  }

  public static void org_chromium_mojo_system_impl_BaseRunLoop_deleteMessageLoop(Object caller, long runLoopID) {
    N.MEexSuCr(caller, runLoopID);
  }

  public static long org_chromium_mojo_system_impl_CoreImpl_getTimeTicksNow(Object caller) {
    return N.M48BvrvK(caller);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_createMessagePipe(Object caller, Object optionsBuffer) {
    return N.MZhgS7uU(caller, optionsBuffer);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_createDataPipe(Object caller, Object optionsBuffer) {
    return N.MhNaf1lV(caller, optionsBuffer);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_createSharedBuffer(Object caller, Object optionsBuffer, long numBytes) {
    return N.MZ0nRPS0(caller, optionsBuffer, numBytes);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_close(Object caller, int mojoHandle) {
    return N.MLQe1QEw(caller, mojoHandle);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_queryHandleSignalsState(Object caller, int mojoHandle, Object signalsStateBuffer) {
    return N.MJr0GcyT(caller, mojoHandle, signalsStateBuffer);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_writeMessage(Object caller, int mojoHandle, Object bytes, int numBytes, Object handlesBuffer, int flags) {
    return N.Mkun8eIV(caller, mojoHandle, bytes, numBytes, handlesBuffer, flags);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_readMessage(Object caller, int mojoHandle, int flags) {
    return N.MEHdfwD0(caller, mojoHandle, flags);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_readData(Object caller, int mojoHandle, Object elements, int elementsSize, int flags) {
    return N.MBDORBtR(caller, mojoHandle, elements, elementsSize, flags);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_beginReadData(Object caller, int mojoHandle, int numBytes, int flags) {
    return N.M_DxS0Vi(caller, mojoHandle, numBytes, flags);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_endReadData(Object caller, int mojoHandle, int numBytesRead) {
    return N.MC3EsLAG(caller, mojoHandle, numBytesRead);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_writeData(Object caller, int mojoHandle, Object elements, int limit, int flags) {
    return N.Mra2dnT9(caller, mojoHandle, elements, limit, flags);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_beginWriteData(Object caller, int mojoHandle, int numBytes, int flags) {
    return N.M100xOXT(caller, mojoHandle, numBytes, flags);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_endWriteData(Object caller, int mojoHandle, int numBytesWritten) {
    return N.MBed1sI2(caller, mojoHandle, numBytesWritten);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_duplicate(Object caller, int mojoHandle, Object optionsBuffer) {
    return N.M6nJbV6M(caller, mojoHandle, optionsBuffer);
  }

  public static Object org_chromium_mojo_system_impl_CoreImpl_map(Object caller, int mojoHandle, long offset, long numBytes, int flags) {
    return N.Mm6zKFIo(caller, mojoHandle, offset, numBytes, flags);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_unmap(Object caller, Object buffer) {
    return N.MC_p8PYl(caller, buffer);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_getNativeBufferOffset(Object caller, Object buffer, int alignment) {
    return N.MBIRtXF8(caller, buffer, alignment);
  }

  public static int org_chromium_mojo_system_impl_CoreImpl_createPlatformHandle(int fd) {
    return N.MDMdj6cc(fd);
  }

  public static long org_chromium_mojo_system_impl_WatcherImpl_createWatcher(Object caller) {
    return N.MXGgOw9k(caller);
  }

  public static int org_chromium_mojo_system_impl_WatcherImpl_start(Object caller, long implPtr, int mojoHandle, int flags) {
    return N.MOmBVeTt(caller, implPtr, mojoHandle, flags);
  }

  public static void org_chromium_mojo_system_impl_WatcherImpl_cancel(Object caller, long implPtr) {
    N.MPTT407x(caller, implPtr);
  }

  public static void org_chromium_mojo_system_impl_WatcherImpl_delete(Object caller, long implPtr) {
    N.Mi32vqDA(caller, implPtr);
  }

  public static String org_chromium_net_GURLUtils_getOrigin(String url) {
    return N.MpCt7siL(url);
  }

  public static void org_chromium_net_HttpNegotiateAuthenticator_setResult(long nativeJavaNegotiateResultWrapper, Object caller, int status, String authToken) {
    N.M0s8NeYn(nativeJavaNegotiateResultWrapper, caller, status, authToken);
  }

  public static boolean org_chromium_net_HttpUtil_isAllowedHeader(String headerName, String headerValue) {
    return N.MorcXgQd(headerName, headerValue);
  }

  public static void org_chromium_net_NetworkActivationRequest_notifyAvailable(long nativeNetworkActivationRequest, long netId) {
    N.MJRUHS0T(nativeNetworkActivationRequest, netId);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(long nativePtr, Object caller, int newConnectionType, long defaultNetId) {
    N.MbPIImnU(nativePtr, caller, newConnectionType, defaultNetId);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyMaxBandwidthChanged(long nativePtr, Object caller, int subType) {
    N.Mt26m31j(nativePtr, caller, subType);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(long nativePtr, Object caller, long netId, int connectionType) {
    N.MBT1i5cd(nativePtr, caller, netId, connectionType);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(long nativePtr, Object caller, long netId) {
    N.MiJIMrTb(nativePtr, caller, netId);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(long nativePtr, Object caller, long netId) {
    N.MDpuHJTB(nativePtr, caller, netId);
  }

  public static void org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(long nativePtr, Object caller, long[] activeNetIds) {
    N.MpF$179U(nativePtr, caller, activeNetIds);
  }

  public static void org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(long nativePtr, Object caller, String host, int port, String pacUrl, String[] exclusionList) {
    N.MyoFZt$2(nativePtr, caller, host, port, pacUrl, exclusionList);
  }

  public static void org_chromium_net_ProxyChangeListener_proxySettingsChanged(long nativePtr, Object caller) {
    N.MCIk73GZ(nativePtr, caller);
  }

  public static void org_chromium_net_X509Util_notifyKeyChainChanged() {
    N.MGVAvp19();
  }

  public static void org_chromium_ui_base_Clipboard_onPrimaryClipChanged(long nativeClipboardAndroid, Object caller) {
    N.M3YqItLq(nativeClipboardAndroid, caller);
  }

  public static void org_chromium_ui_base_Clipboard_onPrimaryClipTimestampInvalidated(long nativeClipboardAndroid, Object caller, long timestamp) {
    N.MWrNP8sy(nativeClipboardAndroid, caller, timestamp);
  }

  public static long org_chromium_ui_base_Clipboard_getLastModifiedTimeToJavaTime(long nativeClipboardAndroid) {
    return N.MN49cYVC(nativeClipboardAndroid);
  }

  public static Object org_chromium_ui_base_EventForwarder_getJavaWindowAndroid(long nativeEventForwarder, Object caller) {
    return N.M4_mlka_(nativeEventForwarder, caller);
  }

  public static boolean org_chromium_ui_base_EventForwarder_onTouchEvent(long nativeEventForwarder, Object caller, Object event, long timeMs, int action, int pointerCount, int historySize, int actionIndex, float x0, float y0, float x1, float y1, int pointerId0, int pointerId1, float touchMajor0, float touchMajor1, float touchMinor0, float touchMinor1, float orientation0, float orientation1, float tilt0, float tilt1, float rawX, float rawY, int androidToolType0, int androidToolType1, int gestureClassification, int androidButtonState, int androidMetaState, boolean isTouchHandleEvent) {
    return N.Mcw1yi1C(nativeEventForwarder, caller, event, timeMs, action, pointerCount, historySize, actionIndex, x0, y0, x1, y1, pointerId0, pointerId1, touchMajor0, touchMajor1, touchMinor0, touchMinor1, orientation0, orientation1, tilt0, tilt1, rawX, rawY, androidToolType0, androidToolType1, gestureClassification, androidButtonState, androidMetaState, isTouchHandleEvent);
  }

  public static void org_chromium_ui_base_EventForwarder_onMouseEvent(long nativeEventForwarder, Object caller, long timeMs, int action, float x, float y, int pointerId, float pressure, float orientation, float tilt, int changedButton, int buttonState, int metaState, int toolType) {
    N.M$2oj6EQ(nativeEventForwarder, caller, timeMs, action, x, y, pointerId, pressure, orientation, tilt, changedButton, buttonState, metaState, toolType);
  }

  public static void org_chromium_ui_base_EventForwarder_onDragEvent(long nativeEventForwarder, Object caller, int action, int x, int y, int screenX, int screenY, String[] mimeTypes, String content) {
    N.MZ1ZkPta(nativeEventForwarder, caller, action, x, y, screenX, screenY, mimeTypes, content);
  }

  public static boolean org_chromium_ui_base_EventForwarder_onGestureEvent(long nativeEventForwarder, Object caller, int type, long timeMs, float delta) {
    return N.MtyC4Bd2(nativeEventForwarder, caller, type, timeMs, delta);
  }

  public static boolean org_chromium_ui_base_EventForwarder_onGenericMotionEvent(long nativeEventForwarder, Object caller, Object event, long timeMs) {
    return N.MvdB06Zi(nativeEventForwarder, caller, event, timeMs);
  }

  public static boolean org_chromium_ui_base_EventForwarder_onKeyUp(long nativeEventForwarder, Object caller, Object event, int keyCode) {
    return N.MRbfSEI1(nativeEventForwarder, caller, event, keyCode);
  }

  public static boolean org_chromium_ui_base_EventForwarder_dispatchKeyEvent(long nativeEventForwarder, Object caller, Object event) {
    return N.MZE$0qqv(nativeEventForwarder, caller, event);
  }

  public static void org_chromium_ui_base_EventForwarder_scrollBy(long nativeEventForwarder, Object caller, float deltaX, float deltaY) {
    N.MMwH$VBb(nativeEventForwarder, caller, deltaX, deltaY);
  }

  public static void org_chromium_ui_base_EventForwarder_scrollTo(long nativeEventForwarder, Object caller, float x, float y) {
    N.M6lTZ5w8(nativeEventForwarder, caller, x, y);
  }

  public static void org_chromium_ui_base_EventForwarder_doubleTap(long nativeEventForwarder, Object caller, long timeMs, int x, int y) {
    N.MNnWXapV(nativeEventForwarder, caller, timeMs, x, y);
  }

  public static void org_chromium_ui_base_EventForwarder_startFling(long nativeEventForwarder, Object caller, long timeMs, float velocityX, float velocityY, boolean syntheticScroll, boolean preventBoosting) {
    N.MT1C98PL(nativeEventForwarder, caller, timeMs, velocityX, velocityY, syntheticScroll, preventBoosting);
  }

  public static void org_chromium_ui_base_EventForwarder_cancelFling(long nativeEventForwarder, Object caller, long timeMs, boolean preventBoosting) {
    N.MSvJWvYj(nativeEventForwarder, caller, timeMs, preventBoosting);
  }

  public static int org_chromium_ui_base_LocalizationUtils_getFirstStrongCharacterDirection(String string) {
    return N.MKiziH$q(string);
  }

  public static String org_chromium_ui_base_LocalizationUtils_getNativeUiLocale() {
    return N.MqGtfAYA();
  }

  public static void org_chromium_ui_base_SelectFileDialog_onFileSelected(long nativeSelectFileDialogImpl, Object caller, String filePath, String displayName) {
    N.MBeWYy2V(nativeSelectFileDialogImpl, caller, filePath, displayName);
  }

  public static void org_chromium_ui_base_SelectFileDialog_onMultipleFilesSelected(long nativeSelectFileDialogImpl, Object caller, String[] filePathArray, String[] displayNameArray) {
    N.Mx1807vz(nativeSelectFileDialogImpl, caller, filePathArray, displayNameArray);
  }

  public static void org_chromium_ui_base_SelectFileDialog_onFileNotSelected(long nativeSelectFileDialogImpl, Object caller) {
    N.MGVJOCWv(nativeSelectFileDialogImpl, caller);
  }

  public static void org_chromium_ui_base_SelectFileDialog_onContactsSelected(long nativeSelectFileDialogImpl, Object caller, String contacts) {
    N.MXucAq1Y(nativeSelectFileDialogImpl, caller, contacts);
  }

  public static long org_chromium_ui_base_WindowAndroid_init(Object caller, int displayId, float scrollFactor, boolean windowIsWideColorGamut) {
    return N.MFjTMMS_(caller, displayId, scrollFactor, windowIsWideColorGamut);
  }

  public static void org_chromium_ui_base_WindowAndroid_onVisibilityChanged(long nativeWindowAndroid, Object caller, boolean visible) {
    N.MrnNdVRa(nativeWindowAndroid, caller, visible);
  }

  public static void org_chromium_ui_base_WindowAndroid_onActivityStopped(long nativeWindowAndroid, Object caller) {
    N.MMLuxHp6(nativeWindowAndroid, caller);
  }

  public static void org_chromium_ui_base_WindowAndroid_onActivityStarted(long nativeWindowAndroid, Object caller) {
    N.MbyUPhMo(nativeWindowAndroid, caller);
  }

  public static void org_chromium_ui_base_WindowAndroid_setVSyncPaused(long nativeWindowAndroid, Object caller, boolean paused) {
    N.MotttR54(nativeWindowAndroid, caller, paused);
  }

  public static void org_chromium_ui_base_WindowAndroid_onUpdateRefreshRate(long nativeWindowAndroid, Object caller, float refreshRate) {
    N.MWNjxKcW(nativeWindowAndroid, caller, refreshRate);
  }

  public static void org_chromium_ui_base_WindowAndroid_destroy(long nativeWindowAndroid, Object caller) {
    N.MV00Qksi(nativeWindowAndroid, caller);
  }

  public static void org_chromium_ui_base_WindowAndroid_onSupportedRefreshRatesUpdated(long nativeWindowAndroid, Object caller, float[] supportedRefreshRates) {
    N.MTDQeb$o(nativeWindowAndroid, caller, supportedRefreshRates);
  }

  public static void org_chromium_ui_display_DisplayAndroidManager_updateDisplay(long nativeDisplayAndroidManager, Object caller, int sdkDisplayId, int width, int height, float dipScale, int rotationDegrees, int bitsPerPixel, int bitsPerComponent, boolean isWideColorGamut) {
    N.M2$ANfTC(nativeDisplayAndroidManager, caller, sdkDisplayId, width, height, dipScale, rotationDegrees, bitsPerPixel, bitsPerComponent, isWideColorGamut);
  }

  public static void org_chromium_ui_display_DisplayAndroidManager_removeDisplay(long nativeDisplayAndroidManager, Object caller, int sdkDisplayId) {
    N.MyzQIqd_(nativeDisplayAndroidManager, caller, sdkDisplayId);
  }

  public static void org_chromium_ui_display_DisplayAndroidManager_setPrimaryDisplayId(long nativeDisplayAndroidManager, Object caller, int sdkDisplayId) {
    N.MdOwtyr6(nativeDisplayAndroidManager, caller, sdkDisplayId);
  }

  public static void org_chromium_ui_events_devices_InputDeviceObserver_inputConfigurationChanged(Object caller) {
    N.MGCvz8lp(caller);
  }

  public static void org_chromium_ui_gfx_ViewConfigurationHelper_updateSharedViewConfiguration(Object caller, float maximumFlingVelocity, float minimumFlingVelocity, float touchSlop, float doubleTapSlop, float minScalingSpan) {
    N.MtrEpb2R(caller, maximumFlingVelocity, minimumFlingVelocity, touchSlop, doubleTapSlop, minScalingSpan);
  }

  public static void org_chromium_ui_gl_SurfaceTextureListener_frameAvailable(long nativeSurfaceTextureListener, Object caller) {
    N.MRbPfCZQ(nativeSurfaceTextureListener, caller);
  }

  public static void org_chromium_ui_gl_SurfaceTextureListener_destroy(long nativeSurfaceTextureListener, Object caller) {
    N.MUH2vhAN(nativeSurfaceTextureListener, caller);
  }

  public static long org_chromium_ui_resources_ResourceFactory_createBitmapResource() {
    return N.MKzrMxwv();
  }

  public static long org_chromium_ui_resources_ResourceFactory_createNinePatchBitmapResource(int paddingLeft, int paddingTop, int paddingRight, int paddingBottom, int apertureLeft, int apertureTop, int apertureRight, int apertureBottom) {
    return N.MNZCYawX(paddingLeft, paddingTop, paddingRight, paddingBottom, apertureLeft, apertureTop, apertureRight, apertureBottom);
  }

  public static void org_chromium_ui_resources_ResourceManager_onResourceReady(long nativeResourceManagerImpl, Object caller, int resType, int resId, Object bitmap, int width, int height, long nativeResource) {
    N.MM7E4tBk(nativeResourceManagerImpl, caller, resType, resId, bitmap, width, height, nativeResource);
  }

  public static void org_chromium_ui_resources_ResourceManager_removeResource(long nativeResourceManagerImpl, Object caller, int resType, int resId) {
    N.MxwZmAzJ(nativeResourceManagerImpl, caller, resType, resId);
  }

  public static void org_chromium_ui_resources_ResourceManager_clearTintedResourceCache(long nativeResourceManagerImpl, Object caller) {
    N.MnAVuP1v(nativeResourceManagerImpl, caller);
  }

  public static void org_chromium_url_GURL_init(String uri, Object target) {
    N.MWBVWQ0I(uri, target);
  }

  public static void org_chromium_url_GURL_getOrigin(String spec, boolean isValid, long nativeParsed, Object target) {
    N.MNBd3mFA(spec, isValid, nativeParsed, target);
  }

  public static boolean org_chromium_url_GURL_domainIs(String spec, boolean isValid, long nativeParsed, String domain) {
    return N.MstQ1QcZ(spec, isValid, nativeParsed, domain);
  }

  public static long org_chromium_url_GURL_createNative(String spec, boolean isValid, long nativeParsed) {
    return N.MnPIH$$1(spec, isValid, nativeParsed);
  }

  public static long org_chromium_url_Parsed_createNative(int schemeBegin, int schemeLength, int usernameBegin, int usernameLength, int passwordBegin, int passwordLength, int hostBegin, int hostLength, int portBegin, int portLength, int pathBegin, int pathLength, int queryBegin, int queryLength, int refBegin, int refLength, boolean potentiallyDanglingMarkup, long innerUrl) {
    return N.MsTyiXfW(schemeBegin, schemeLength, usernameBegin, usernameLength, passwordBegin, passwordLength, hostBegin, hostLength, portBegin, portLength, pathBegin, pathLength, queryBegin, queryLength, refBegin, refLength, potentiallyDanglingMarkup, innerUrl);
  }
}
