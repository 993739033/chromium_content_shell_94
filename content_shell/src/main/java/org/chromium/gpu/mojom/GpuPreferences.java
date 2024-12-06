package org.chromium.gpu.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.BufferUsageAndFormat;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class GpuPreferences extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 80;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean compileShaderAlwaysSucceeds;
    public boolean disableAcceleratedVideoDecode;
    public boolean disableAcceleratedVideoEncode;
    public boolean disableBiplanarGpuMemoryBuffersForVideoFrames;
    public boolean disableGlErrorLimit;
    public boolean disableGlslTranslator;
    public boolean disableGpuProgramCache;
    public boolean disableGpuShaderDiskCache;
    public boolean disableGpuWatchdog;
    public boolean disableOopRasterization;
    public boolean disableShaderNameHashing;
    public boolean disableSoftwareRasterizer;
    public boolean disableVulkanFallbackToGlForTesting;
    public boolean disableVulkanSurface;
    public String[] disabledDawnFeaturesList;
    public boolean enableAndroidSurfaceControl;
    public int enableDawnBackendValidation;
    public boolean enableGpuBenchmarkingExtension;
    public boolean enableGpuBlockedTimeMetric;
    public boolean enableGpuCommandLogging;
    public boolean enableGpuDebugging;
    public boolean enableGpuDriverDebugLogging;
    public boolean enableGpuServiceLogging;
    public boolean enableGpuServiceLoggingGpu;
    public boolean enableGpuServiceTracing;
    public boolean enableLowLatencyDxva;
    public boolean enableMediaFoundationVeaOnWindows7;
    public boolean enableMetal;
    public boolean enableNativeGpuMemoryBuffers;
    public boolean enableNv12DxgiVideo;
    public boolean enableOopRasterization;
    public boolean enableOopRasterizationDdl;
    public boolean enablePerfDataCollection;
    public boolean enableThreadedTextureMailboxes;
    public boolean enableVulkanProtectedMemory;
    public boolean enableWebgpu;
    public boolean enableWebgpuSpirv;
    public boolean enableZeroCopyDxgiVideo;
    public String[] enabledDawnFeaturesList;
    public boolean enforceGlMinimums;
    public int forceGpuMemAvailableBytes;
    public int forceGpuMemDiscardableLimitBytes;
    public int forceMaxTextureSize;
    public boolean forceWebgpuCompat;
    public boolean glShaderIntermOutput;
    public int gpuProgramCacheSize;
    public boolean gpuSandboxStartEarly;
    public boolean gpuStartupDialog;
    public int grContextType;
    public boolean ignoreGpuBlocklist;
    public boolean logGpuControlListDecisions;
    public BufferUsageAndFormat[] textureTargetExceptionList;
    public boolean usePassthroughCmdDecoder;
    public int useVulkan;
    public int vulkanHeapMemoryLimit;
    public int vulkanSyncCpuMemoryLimit;
    public boolean watchdogStartsBackgrounded;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(80, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private GpuPreferences(int version) {
        super(80, version);
    }

    public GpuPreferences() {
        this(0);
    }

    public static GpuPreferences deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static GpuPreferences deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static GpuPreferences decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            GpuPreferences result = new GpuPreferences(elementsOrVersion);
            result.disableAcceleratedVideoDecode = decoder0.readBoolean(8, 0);
            result.disableAcceleratedVideoEncode = decoder0.readBoolean(8, 1);
            result.gpuStartupDialog = decoder0.readBoolean(8, 2);
            result.disableGpuWatchdog = decoder0.readBoolean(8, 3);
            result.gpuSandboxStartEarly = decoder0.readBoolean(8, 4);
            result.enableLowLatencyDxva = decoder0.readBoolean(8, 5);
            result.enableZeroCopyDxgiVideo = decoder0.readBoolean(8, 6);
            result.enableNv12DxgiVideo = decoder0.readBoolean(8, 7);
            result.enableMediaFoundationVeaOnWindows7 = decoder0.readBoolean(9, 0);
            result.disableSoftwareRasterizer = decoder0.readBoolean(9, 1);
            result.logGpuControlListDecisions = decoder0.readBoolean(9, 2);
            result.compileShaderAlwaysSucceeds = decoder0.readBoolean(9, 3);
            result.disableGlErrorLimit = decoder0.readBoolean(9, 4);
            result.disableGlslTranslator = decoder0.readBoolean(9, 5);
            result.disableShaderNameHashing = decoder0.readBoolean(9, 6);
            result.enableGpuCommandLogging = decoder0.readBoolean(9, 7);
            result.enableGpuDebugging = decoder0.readBoolean(10, 0);
            result.enableGpuServiceLoggingGpu = decoder0.readBoolean(10, 1);
            result.enableGpuDriverDebugLogging = decoder0.readBoolean(10, 2);
            result.disableGpuProgramCache = decoder0.readBoolean(10, 3);
            result.enforceGlMinimums = decoder0.readBoolean(10, 4);
            result.disableGpuShaderDiskCache = decoder0.readBoolean(10, 5);
            result.enableThreadedTextureMailboxes = decoder0.readBoolean(10, 6);
            result.glShaderIntermOutput = decoder0.readBoolean(10, 7);
            result.enableAndroidSurfaceControl = decoder0.readBoolean(11, 0);
            result.enableGpuServiceLogging = decoder0.readBoolean(11, 1);
            result.enableGpuServiceTracing = decoder0.readBoolean(11, 2);
            result.usePassthroughCmdDecoder = decoder0.readBoolean(11, 3);
            result.disableBiplanarGpuMemoryBuffersForVideoFrames = decoder0.readBoolean(11, 4);
            result.ignoreGpuBlocklist = decoder0.readBoolean(11, 5);
            result.enableOopRasterization = decoder0.readBoolean(11, 6);
            result.disableOopRasterization = decoder0.readBoolean(11, 7);
            result.forceGpuMemAvailableBytes = decoder0.readInt(12);
            result.forceGpuMemDiscardableLimitBytes = decoder0.readInt(16);
            result.forceMaxTextureSize = decoder0.readInt(20);
            result.gpuProgramCacheSize = decoder0.readInt(24);
            result.enableOopRasterizationDdl = decoder0.readBoolean(28, 0);
            result.watchdogStartsBackgrounded = decoder0.readBoolean(28, 1);
            result.enableVulkanProtectedMemory = decoder0.readBoolean(28, 2);
            result.disableVulkanSurface = decoder0.readBoolean(28, 3);
            result.disableVulkanFallbackToGlForTesting = decoder0.readBoolean(28, 4);
            result.enableMetal = decoder0.readBoolean(28, 5);
            result.enableGpuBenchmarkingExtension = decoder0.readBoolean(28, 6);
            result.enableWebgpu = decoder0.readBoolean(28, 7);
            result.enableWebgpuSpirv = decoder0.readBoolean(29, 0);
            result.forceWebgpuCompat = decoder0.readBoolean(29, 1);
            result.enableGpuBlockedTimeMetric = decoder0.readBoolean(29, 2);
            result.enablePerfDataCollection = decoder0.readBoolean(29, 3);
            result.enableNativeGpuMemoryBuffers = decoder0.readBoolean(29, 4);
            Decoder decoder1 = decoder0.readPointer(32, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.textureTargetExceptionList = new BufferUsageAndFormat[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.textureTargetExceptionList[i1] = BufferUsageAndFormat.decode(decoder2);
            }
            int readInt = decoder0.readInt(40);
            result.grContextType = readInt;
            GrContextType.validate(readInt);
            result.grContextType = GrContextType.toKnownValue(result.grContextType);
            int readInt2 = decoder0.readInt(44);
            result.useVulkan = readInt2;
            VulkanImplementationName.validate(readInt2);
            result.useVulkan = VulkanImplementationName.toKnownValue(result.useVulkan);
            result.vulkanHeapMemoryLimit = decoder0.readInt(48);
            result.vulkanSyncCpuMemoryLimit = decoder0.readInt(52);
            int readInt3 = decoder0.readInt(56);
            result.enableDawnBackendValidation = readInt3;
            DawnBackendValidationLevel.validate(readInt3);
            result.enableDawnBackendValidation = DawnBackendValidationLevel.toKnownValue(result.enableDawnBackendValidation);
            Decoder decoder12 = decoder0.readPointer(64, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.enabledDawnFeaturesList = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.enabledDawnFeaturesList[i12] = decoder12.readString((i12 * 8) + 8, false);
            }
            Decoder decoder13 = decoder0.readPointer(72, false);
            DataHeader si13 = decoder13.readDataHeaderForPointerArray(-1);
            result.disabledDawnFeaturesList = new String[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.disabledDawnFeaturesList[i13] = decoder13.readString((i13 * 8) + 8, false);
            }
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.disableAcceleratedVideoDecode, 8, 0);
        encoder0.encode(this.disableAcceleratedVideoEncode, 8, 1);
        encoder0.encode(this.gpuStartupDialog, 8, 2);
        encoder0.encode(this.disableGpuWatchdog, 8, 3);
        encoder0.encode(this.gpuSandboxStartEarly, 8, 4);
        encoder0.encode(this.enableLowLatencyDxva, 8, 5);
        encoder0.encode(this.enableZeroCopyDxgiVideo, 8, 6);
        encoder0.encode(this.enableNv12DxgiVideo, 8, 7);
        encoder0.encode(this.enableMediaFoundationVeaOnWindows7, 9, 0);
        encoder0.encode(this.disableSoftwareRasterizer, 9, 1);
        encoder0.encode(this.logGpuControlListDecisions, 9, 2);
        encoder0.encode(this.compileShaderAlwaysSucceeds, 9, 3);
        encoder0.encode(this.disableGlErrorLimit, 9, 4);
        encoder0.encode(this.disableGlslTranslator, 9, 5);
        encoder0.encode(this.disableShaderNameHashing, 9, 6);
        encoder0.encode(this.enableGpuCommandLogging, 9, 7);
        encoder0.encode(this.enableGpuDebugging, 10, 0);
        encoder0.encode(this.enableGpuServiceLoggingGpu, 10, 1);
        encoder0.encode(this.enableGpuDriverDebugLogging, 10, 2);
        encoder0.encode(this.disableGpuProgramCache, 10, 3);
        encoder0.encode(this.enforceGlMinimums, 10, 4);
        encoder0.encode(this.disableGpuShaderDiskCache, 10, 5);
        encoder0.encode(this.enableThreadedTextureMailboxes, 10, 6);
        encoder0.encode(this.glShaderIntermOutput, 10, 7);
        encoder0.encode(this.enableAndroidSurfaceControl, 11, 0);
        encoder0.encode(this.enableGpuServiceLogging, 11, 1);
        encoder0.encode(this.enableGpuServiceTracing, 11, 2);
        encoder0.encode(this.usePassthroughCmdDecoder, 11, 3);
        encoder0.encode(this.disableBiplanarGpuMemoryBuffersForVideoFrames, 11, 4);
        encoder0.encode(this.ignoreGpuBlocklist, 11, 5);
        encoder0.encode(this.enableOopRasterization, 11, 6);
        encoder0.encode(this.disableOopRasterization, 11, 7);
        encoder0.encode(this.forceGpuMemAvailableBytes, 12);
        encoder0.encode(this.forceGpuMemDiscardableLimitBytes, 16);
        encoder0.encode(this.forceMaxTextureSize, 20);
        encoder0.encode(this.gpuProgramCacheSize, 24);
        encoder0.encode(this.enableOopRasterizationDdl, 28, 0);
        encoder0.encode(this.watchdogStartsBackgrounded, 28, 1);
        encoder0.encode(this.enableVulkanProtectedMemory, 28, 2);
        encoder0.encode(this.disableVulkanSurface, 28, 3);
        encoder0.encode(this.disableVulkanFallbackToGlForTesting, 28, 4);
        encoder0.encode(this.enableMetal, 28, 5);
        encoder0.encode(this.enableGpuBenchmarkingExtension, 28, 6);
        encoder0.encode(this.enableWebgpu, 28, 7);
        encoder0.encode(this.enableWebgpuSpirv, 29, 0);
        encoder0.encode(this.forceWebgpuCompat, 29, 1);
        encoder0.encode(this.enableGpuBlockedTimeMetric, 29, 2);
        encoder0.encode(this.enablePerfDataCollection, 29, 3);
        encoder0.encode(this.enableNativeGpuMemoryBuffers, 29, 4);
        BufferUsageAndFormat[] bufferUsageAndFormatArr = this.textureTargetExceptionList;
        if (bufferUsageAndFormatArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(bufferUsageAndFormatArr.length, 32, -1);
            int i0 = 0;
            while (true) {
                BufferUsageAndFormat[] bufferUsageAndFormatArr2 = this.textureTargetExceptionList;
                if (i0 >= bufferUsageAndFormatArr2.length) {
                    break;
                }
                encoder1.encode((Struct) bufferUsageAndFormatArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.grContextType, 40);
        encoder0.encode(this.useVulkan, 44);
        encoder0.encode(this.vulkanHeapMemoryLimit, 48);
        encoder0.encode(this.vulkanSyncCpuMemoryLimit, 52);
        encoder0.encode(this.enableDawnBackendValidation, 56);
        String[] strArr = this.enabledDawnFeaturesList;
        if (strArr == null) {
            encoder0.encodeNullPointer(64, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr.length, 64, -1);
            int i02 = 0;
            while (true) {
                String[] strArr2 = this.enabledDawnFeaturesList;
                if (i02 >= strArr2.length) {
                    break;
                }
                encoder12.encode(strArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        String[] strArr3 = this.disabledDawnFeaturesList;
        if (strArr3 == null) {
            encoder0.encodeNullPointer(72, false);
            return;
        }
        Encoder encoder13 = encoder0.encodePointerArray(strArr3.length, 72, -1);
        int i03 = 0;
        while (true) {
            String[] strArr4 = this.disabledDawnFeaturesList;
            if (i03 < strArr4.length) {
                encoder13.encode(strArr4[i03], (i03 * 8) + 8, false);
                i03++;
            } else {
                return;
            }
        }
    }
}
