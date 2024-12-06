package org.chromium.device.gamepad;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.gamepad.GamepadList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class GamepadListJni implements GamepadList.Natives {
    public static final JniStaticTestMocker<GamepadList.Natives> TEST_HOOKS = new JniStaticTestMocker<GamepadList.Natives>() { // from class: org.chromium.device.gamepad.GamepadListJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(GamepadList.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                GamepadList.Natives unused = GamepadListJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static GamepadList.Natives testInstance;

    GamepadListJni() {
    }

    @Override // org.chromium.device.gamepad.GamepadList.Natives
    public void setGamepadData(GamepadList caller, long webGamepadsPtr, int index, boolean mapping, boolean connected, String devicename, int vendorId, int productId, long timestamp, float[] axes, float[] buttons, int buttonsLength) {
        GEN_JNI.org_chromium_device_gamepad_GamepadList_setGamepadData(caller, webGamepadsPtr, index, mapping, connected, devicename, vendorId, productId, timestamp, axes, buttons, buttonsLength);
    }

    public static GamepadList.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            GamepadList.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.gamepad.GamepadList.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new GamepadListJni();
    }
}
