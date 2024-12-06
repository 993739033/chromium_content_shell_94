package org.chromium.mojo.system.impl;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.mojo.system.MessagePipeHandle;
import org.chromium.mojo.system.ResultAnd;
import org.chromium.mojo.system.impl.CoreImpl;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class CoreImplJni implements CoreImpl.Natives {
    public static final JniStaticTestMocker<CoreImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<CoreImpl.Natives>() { // from class: org.chromium.mojo.system.impl.CoreImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(CoreImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                CoreImpl.Natives unused = CoreImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static CoreImpl.Natives testInstance;

    CoreImplJni() {
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public long getTimeTicksNow(CoreImpl caller) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_getTimeTicksNow(caller);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<CoreImpl.IntegerPair> createMessagePipe(CoreImpl caller, ByteBuffer optionsBuffer) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createMessagePipe(caller, optionsBuffer);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<CoreImpl.IntegerPair> createDataPipe(CoreImpl caller, ByteBuffer optionsBuffer) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createDataPipe(caller, optionsBuffer);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<Integer> createSharedBuffer(CoreImpl caller, ByteBuffer optionsBuffer, long numBytes) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createSharedBuffer(caller, optionsBuffer, numBytes);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int close(CoreImpl caller, int mojoHandle) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_close(caller, mojoHandle);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int queryHandleSignalsState(CoreImpl caller, int mojoHandle, ByteBuffer signalsStateBuffer) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_queryHandleSignalsState(caller, mojoHandle, signalsStateBuffer);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int writeMessage(CoreImpl caller, int mojoHandle, ByteBuffer bytes, int numBytes, ByteBuffer handlesBuffer, int flags) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_writeMessage(caller, mojoHandle, bytes, numBytes, handlesBuffer, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<MessagePipeHandle.ReadMessageResult> readMessage(CoreImpl caller, int mojoHandle, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_readMessage(caller, mojoHandle, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<Integer> readData(CoreImpl caller, int mojoHandle, ByteBuffer elements, int elementsSize, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_readData(caller, mojoHandle, elements, elementsSize, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<ByteBuffer> beginReadData(CoreImpl caller, int mojoHandle, int numBytes, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_beginReadData(caller, mojoHandle, numBytes, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int endReadData(CoreImpl caller, int mojoHandle, int numBytesRead) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_endReadData(caller, mojoHandle, numBytesRead);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<Integer> writeData(CoreImpl caller, int mojoHandle, ByteBuffer elements, int limit, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_writeData(caller, mojoHandle, elements, limit, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<ByteBuffer> beginWriteData(CoreImpl caller, int mojoHandle, int numBytes, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_beginWriteData(caller, mojoHandle, numBytes, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int endWriteData(CoreImpl caller, int mojoHandle, int numBytesWritten) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_endWriteData(caller, mojoHandle, numBytesWritten);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<Integer> duplicate(CoreImpl caller, int mojoHandle, ByteBuffer optionsBuffer) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_duplicate(caller, mojoHandle, optionsBuffer);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public ResultAnd<ByteBuffer> map(CoreImpl caller, int mojoHandle, long offset, long numBytes, int flags) {
        return (ResultAnd) GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_map(caller, mojoHandle, offset, numBytes, flags);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int unmap(CoreImpl caller, ByteBuffer buffer) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_unmap(caller, buffer);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int getNativeBufferOffset(CoreImpl caller, ByteBuffer buffer, int alignment) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_getNativeBufferOffset(caller, buffer, alignment);
    }

    @Override // org.chromium.mojo.system.impl.CoreImpl.Natives
    public int createPlatformHandle(int fd) {
        return GEN_JNI.org_chromium_mojo_system_impl_CoreImpl_createPlatformHandle(fd);
    }

    public static CoreImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CoreImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.CoreImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new CoreImplJni();
    }
}
