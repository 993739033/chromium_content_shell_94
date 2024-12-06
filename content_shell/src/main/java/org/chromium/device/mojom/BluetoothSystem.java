package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BluetoothSystem extends Interface {
    public static final Manager<BluetoothSystem, Proxy> MANAGER = BluetoothSystem_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetAvailableDevicesResponse extends Callbacks.Callback1<BluetoothDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetScanStateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface GetStateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BluetoothSystem, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetPoweredResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface StartScanResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface StopScanResponse extends Callbacks.Callback1<Integer> {
    }

    void getAvailableDevices(GetAvailableDevicesResponse getAvailableDevicesResponse);

    void getScanState(GetScanStateResponse getScanStateResponse);

    void getState(GetStateResponse getStateResponse);

    void setPowered(boolean z, SetPoweredResponse setPoweredResponse);

    void startScan(StartScanResponse startScanResponse);

    void stopScan(StopScanResponse stopScanResponse);

    /* loaded from: classes2.dex */
    public static final class State {
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 4;
        public static final int MIN_VALUE = 0;
        public static final int POWERED_OFF = 2;
        public static final int POWERED_ON = 4;
        public static final int TRANSITIONING = 3;
        public static final int UNAVAILABLE = 1;
        public static final int UNSUPPORTED = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 4;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private State() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class SetPoweredResult {
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int FAILED_IN_PROGRESS = 3;
        public static final int FAILED_UNKNOWN_REASON = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 3;
        public static final int MIN_VALUE = 0;
        public static final int SUCCESS = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 3;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private SetPoweredResult() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class ScanState {
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int NOT_SCANNING = 0;
        public static final int SCANNING = 2;
        public static final int TRANSITIONING = 1;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private ScanState() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class StartScanResult {
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int FAILED_UNKNOWN_REASON = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int SUCCESS = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private StartScanResult() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class StopScanResult {
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int FAILED_UNKNOWN_REASON = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int SUCCESS = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private StopScanResult() {
        }
    }
}
