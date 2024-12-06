package org.chromium.content.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;
import org.chromium.base.UnguessableToken;
/* loaded from: classes2.dex */
public interface IGpuProcessCallback extends IInterface {
    public static final String DESCRIPTOR = "org.chromium.content.common.IGpuProcessCallback";

    void forwardSurfaceForSurfaceRequest(UnguessableToken unguessableToken, Surface surface) throws RemoteException;

    SurfaceWrapper getViewSurface(int i) throws RemoteException;

    /* loaded from: classes2.dex */
    public static class Default implements IGpuProcessCallback {
        @Override // org.chromium.content.common.IGpuProcessCallback
        public void forwardSurfaceForSurfaceRequest(UnguessableToken requestToken, Surface surface) throws RemoteException {
        }

        @Override // org.chromium.content.common.IGpuProcessCallback
        public SurfaceWrapper getViewSurface(int surfaceId) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IGpuProcessCallback {
        static final int TRANSACTION_forwardSurfaceForSurfaceRequest = 1;
        static final int TRANSACTION_getViewSurface = 2;

        public Stub() {
            attachInterface(this, IGpuProcessCallback.DESCRIPTOR);
        }

        public static IGpuProcessCallback asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(IGpuProcessCallback.DESCRIPTOR);
            if (iin != null && (iin instanceof IGpuProcessCallback)) {
                return (IGpuProcessCallback) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            UnguessableToken _arg0;
            Surface _arg1;
            switch (code) {
                case 1598968902:
                    reply.writeString(IGpuProcessCallback.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            data.enforceInterface(IGpuProcessCallback.DESCRIPTOR);
                            if (data.readInt() != 0) {
                                _arg0 = UnguessableToken.CREATOR.createFromParcel(data);
                            } else {
                                _arg0 = null;
                            }
                            if (data.readInt() != 0) {
                                _arg1 = (Surface) Surface.CREATOR.createFromParcel(data);
                            } else {
                                _arg1 = null;
                            }
                            forwardSurfaceForSurfaceRequest(_arg0, _arg1);
                            return true;
                        case 2:
                            data.enforceInterface(IGpuProcessCallback.DESCRIPTOR);
                            int _arg02 = data.readInt();
                            SurfaceWrapper _result = getViewSurface(_arg02);
                            reply.writeNoException();
                            if (_result != null) {
                                reply.writeInt(1);
                                _result.writeToParcel(reply, 1);
                            } else {
                                reply.writeInt(0);
                            }
                            return true;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements IGpuProcessCallback {
            public static IGpuProcessCallback sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IGpuProcessCallback.DESCRIPTOR;
            }

            @Override // org.chromium.content.common.IGpuProcessCallback
            public void forwardSurfaceForSurfaceRequest(UnguessableToken requestToken, Surface surface) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IGpuProcessCallback.DESCRIPTOR);
                    if (requestToken != null) {
                        _data.writeInt(1);
                        requestToken.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    if (surface != null) {
                        _data.writeInt(1);
                        surface.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    boolean _status = this.mRemote.transact(1, _data, null, 1);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().forwardSurfaceForSurfaceRequest(requestToken, surface);
                    }
                } finally {
                    _data.recycle();
                }
            }

            @Override // org.chromium.content.common.IGpuProcessCallback
            public SurfaceWrapper getViewSurface(int surfaceId) throws RemoteException {
                SurfaceWrapper _result;
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(IGpuProcessCallback.DESCRIPTOR);
                    _data.writeInt(surfaceId);
                    boolean _status = this.mRemote.transact(2, _data, _reply, 0);
                    if (!_status && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getViewSurface(surfaceId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = SurfaceWrapper.CREATOR.createFromParcel(_reply);
                    } else {
                        _result = null;
                    }
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IGpuProcessCallback impl) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (impl != null) {
                Proxy.sDefaultImpl = impl;
                return true;
            }
            return false;
        }

        public static IGpuProcessCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
