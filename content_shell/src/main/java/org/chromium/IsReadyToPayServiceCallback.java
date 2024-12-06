package org.chromium;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes.dex */
public interface IsReadyToPayServiceCallback extends IInterface {
    public static final String DESCRIPTOR = "org.chromium.IsReadyToPayServiceCallback";

    void handleIsReadyToPay(boolean z) throws RemoteException;

    /* loaded from: classes.dex */
    public static class Default implements IsReadyToPayServiceCallback {
        @Override // org.chromium.IsReadyToPayServiceCallback
        public void handleIsReadyToPay(boolean isReadyToPay) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IsReadyToPayServiceCallback {
        static final int TRANSACTION_handleIsReadyToPay = 1;

        public Stub() {
            attachInterface(this, IsReadyToPayServiceCallback.DESCRIPTOR);
        }

        public static IsReadyToPayServiceCallback asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IsReadyToPayServiceCallback.DESCRIPTOR);
            if (iin != null && (iin instanceof IsReadyToPayServiceCallback)) {
                return (IsReadyToPayServiceCallback) iin;
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
                    reply.writeString(IsReadyToPayServiceCallback.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            data.enforceInterface(IsReadyToPayServiceCallback.DESCRIPTOR);
                            boolean _arg0 = data.readInt() != 0;
                            handleIsReadyToPay(_arg0);
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IsReadyToPayServiceCallback {
            public static IsReadyToPayServiceCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IsReadyToPayServiceCallback.DESCRIPTOR;
            }

            @Override // org.chromium.IsReadyToPayServiceCallback
            public void handleIsReadyToPay(boolean isReadyToPay) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IsReadyToPayServiceCallback.DESCRIPTOR);
                    _data.writeInt(isReadyToPay ? 1 : 0);
                    boolean _status = this.mRemote.transact(1, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().handleIsReadyToPay(isReadyToPay);
                    }
                } finally {
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IsReadyToPayServiceCallback impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IsReadyToPayServiceCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
