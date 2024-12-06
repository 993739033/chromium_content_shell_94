package org.chromium;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import org.chromium.IsReadyToPayServiceCallback;
/* loaded from: classes.dex */
public interface IsReadyToPayService extends IInterface {
    public static final String DESCRIPTOR = "org.chromium.IsReadyToPayService";

    void isReadyToPay(IsReadyToPayServiceCallback isReadyToPayServiceCallback) throws RemoteException;

    /* loaded from: classes.dex */
    public static class Default implements IsReadyToPayService {
        @Override // org.chromium.IsReadyToPayService
        public void isReadyToPay(IsReadyToPayServiceCallback callback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IsReadyToPayService {
        static final int TRANSACTION_isReadyToPay = 1;

        public Stub() {
            attachInterface(this, IsReadyToPayService.DESCRIPTOR);
        }

        public static IsReadyToPayService asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IsReadyToPayService.DESCRIPTOR);
            if (iin != null && (iin instanceof IsReadyToPayService)) {
                return (IsReadyToPayService) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch (code) {
                case 1598968902:
                    reply.writeString(IsReadyToPayService.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            data.enforceInterface(IsReadyToPayService.DESCRIPTOR);
                            IsReadyToPayServiceCallback _arg0 = IsReadyToPayServiceCallback.Stub.asInterface(data.readStrongBinder());
                            isReadyToPay(_arg0);
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IsReadyToPayService {
            public static IsReadyToPayService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IsReadyToPayService.DESCRIPTOR;
            }

            @Override // org.chromium.IsReadyToPayService
            public void isReadyToPay(IsReadyToPayServiceCallback callback) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IsReadyToPayService.DESCRIPTOR);
                    _data.writeStrongBinder(callback != null ? callback.asBinder() : null);
                    boolean _status = this.mRemote.transact(1, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().isReadyToPay(callback);
                    }
                } finally {
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IsReadyToPayService impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IsReadyToPayService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
