package org.chromium.content_shell_apk;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public interface IChildProcessTest extends IInterface {
    public static final String DESCRIPTOR = "org.chromium.content_shell_apk.IChildProcessTest";

    void onBeforeMain(String[] strArr) throws RemoteException;

    void onConnectionSetup(boolean z, Bundle bundle, Bundle bundle2) throws RemoteException;

    void onLoadNativeLibrary(boolean z) throws RemoteException;

    void onRunMain() throws RemoteException;

    /* loaded from: classes2.dex */
    public static class Default implements IChildProcessTest {
        @Override // org.chromium.content_shell_apk.IChildProcessTest
        public void onConnectionSetup(boolean serviceCreatedCalled, Bundle serviceBundle, Bundle connectionBundle) throws RemoteException {
        }

        @Override // org.chromium.content_shell_apk.IChildProcessTest
        public void onLoadNativeLibrary(boolean loadedSuccessfully) throws RemoteException {
        }

        @Override // org.chromium.content_shell_apk.IChildProcessTest
        public void onBeforeMain(String[] commandLine) throws RemoteException {
        }

        @Override // org.chromium.content_shell_apk.IChildProcessTest
        public void onRunMain() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IChildProcessTest {
        static final int TRANSACTION_onBeforeMain = 3;
        static final int TRANSACTION_onConnectionSetup = 1;
        static final int TRANSACTION_onLoadNativeLibrary = 2;
        static final int TRANSACTION_onRunMain = 4;

        public Stub() {
            attachInterface(this, IChildProcessTest.DESCRIPTOR);
        }

        public static IChildProcessTest asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IChildProcessTest.DESCRIPTOR);
            if (iin != null && (iin instanceof IChildProcessTest)) {
                return (IChildProcessTest) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            boolean _arg0;
            Bundle _arg1;
            Bundle _arg2;
            switch (code) {
                case 1598968902:
                    reply.writeString(IChildProcessTest.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            data.enforceInterface(IChildProcessTest.DESCRIPTOR);
                            _arg0 = data.readInt() != 0;
                            if (data.readInt() != 0) {
                                _arg1 = (Bundle) Bundle.CREATOR.createFromParcel(data);
                            } else {
                                _arg1 = null;
                            }
                            if (data.readInt() != 0) {
                                _arg2 = (Bundle) Bundle.CREATOR.createFromParcel(data);
                            } else {
                                _arg2 = null;
                            }
                            onConnectionSetup(_arg0, _arg1, _arg2);
                            return true;
                        case 2:
                            data.enforceInterface(IChildProcessTest.DESCRIPTOR);
                            _arg0 = data.readInt() != 0;
                            onLoadNativeLibrary(_arg0);
                            return true;
                        case 3:
                            data.enforceInterface(IChildProcessTest.DESCRIPTOR);
                            onBeforeMain(data.createStringArray());
                            return true;
                        case 4:
                            data.enforceInterface(IChildProcessTest.DESCRIPTOR);
                            onRunMain();
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements IChildProcessTest {
            public static IChildProcessTest sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IChildProcessTest.DESCRIPTOR;
            }

            @Override // org.chromium.content_shell_apk.IChildProcessTest
            public void onConnectionSetup(boolean serviceCreatedCalled, Bundle serviceBundle, Bundle connectionBundle) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IChildProcessTest.DESCRIPTOR);
                    _data.writeInt(serviceCreatedCalled ? 1 : 0);
                    if (serviceBundle != null) {
                        _data.writeInt(1);
                        serviceBundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    if (connectionBundle != null) {
                        _data.writeInt(1);
                        connectionBundle.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    boolean _status = this.mRemote.transact(1, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onConnectionSetup(serviceCreatedCalled, serviceBundle, connectionBundle);
                    }
                } finally {
                    _data.recycle();
                }
            }

            @Override // org.chromium.content_shell_apk.IChildProcessTest
            public void onLoadNativeLibrary(boolean loadedSuccessfully) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IChildProcessTest.DESCRIPTOR);
                    _data.writeInt(loadedSuccessfully ? 1 : 0);
                    boolean _status = this.mRemote.transact(2, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onLoadNativeLibrary(loadedSuccessfully);
                    }
                } finally {
                    _data.recycle();
                }
            }

            @Override // org.chromium.content_shell_apk.IChildProcessTest
            public void onBeforeMain(String[] commandLine) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IChildProcessTest.DESCRIPTOR);
                    _data.writeStringArray(commandLine);
                    boolean _status = this.mRemote.transact(3, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onBeforeMain(commandLine);
                    }
                } finally {
                    _data.recycle();
                }
            }

            @Override // org.chromium.content_shell_apk.IChildProcessTest
            public void onRunMain() throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IChildProcessTest.DESCRIPTOR);
                    boolean _status = this.mRemote.transact(4, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onRunMain();
                    }
                } finally {
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IChildProcessTest impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IChildProcessTest getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
