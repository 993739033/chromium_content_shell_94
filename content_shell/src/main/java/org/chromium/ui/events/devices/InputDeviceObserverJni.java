package org.chromium.ui.events.devices;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.events.devices.InputDeviceObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class InputDeviceObserverJni implements InputDeviceObserver.Natives {
    public static final JniStaticTestMocker<InputDeviceObserver.Natives> TEST_HOOKS = new JniStaticTestMocker<InputDeviceObserver.Natives>() { // from class: org.chromium.ui.events.devices.InputDeviceObserverJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(InputDeviceObserver.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                InputDeviceObserver.Natives unused = InputDeviceObserverJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static InputDeviceObserver.Natives testInstance;

    InputDeviceObserverJni() {
    }

    @Override // org.chromium.ui.events.devices.InputDeviceObserver.Natives
    public void inputConfigurationChanged(InputDeviceObserver caller) {
        GEN_JNI.org_chromium_ui_events_devices_InputDeviceObserver_inputConfigurationChanged(caller);
    }

    public static InputDeviceObserver.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            InputDeviceObserver.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.events.devices.InputDeviceObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new InputDeviceObserverJni();
    }
}
