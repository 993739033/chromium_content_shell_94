/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.base.process_launcher;
public interface IChildProcessService extends android.os.IInterface
{
  /** Default implementation for IChildProcessService. */
  public static class Default implements IChildProcessService
  {
    // |clazz| identifies the ClassLoader of the caller.
    // On the first call to this method, the service will record the calling PID
    // and |clazz| and return true. Subsequent calls will only return true if the
    // calling PID and |clazz| matches the recorded values.
    @Override public boolean bindToCaller(String clazz) throws android.os.RemoteException
    {
      return false;
    }
    // Sets up the initial IPC channel.
    @Override public void setupConnection(android.os.Bundle args, IParentProcess parentProcess, java.util.List<android.os.IBinder> clientInterfaces) throws android.os.RemoteException
    {
    }
    // Forcefully kills the child process.
    @Override public void forceKill() throws android.os.RemoteException
    {
    }
    // Notifies about memory pressure. The argument is MemoryPressureLevel enum.
    @Override public void onMemoryPressure(int pressure) throws android.os.RemoteException
    {
    }
    // Dumps the stack for the child process without crashing it.
    @Override public void dumpProcessStack() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IChildProcessService
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.base.process_launcher.IChildProcessService interface,
     * generating a proxy if needed.
     */
    public static IChildProcessService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IChildProcessService))) {
        return ((IChildProcessService)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_bindToCaller:
        {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          boolean _result = this.bindToCaller(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_setupConnection:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          IParentProcess _arg1;
          _arg1 = IParentProcess.Stub.asInterface(data.readStrongBinder());
          java.util.List<android.os.IBinder> _arg2;
          _arg2 = data.createBinderArrayList();
          this.setupConnection(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_forceKill:
        {
          data.enforceInterface(descriptor);
          this.forceKill();
          return true;
        }
        case TRANSACTION_onMemoryPressure:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onMemoryPressure(_arg0);
          return true;
        }
        case TRANSACTION_dumpProcessStack:
        {
          data.enforceInterface(descriptor);
          this.dumpProcessStack();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IChildProcessService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      // |clazz| identifies the ClassLoader of the caller.
      // On the first call to this method, the service will record the calling PID
      // and |clazz| and return true. Subsequent calls will only return true if the
      // calling PID and |clazz| matches the recorded values.
      @Override public boolean bindToCaller(String clazz) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(clazz);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindToCaller, _data, _reply, 0);
          if (!_status) {
            if (getDefaultImpl() != null) {
              return getDefaultImpl().bindToCaller(clazz);
            }
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Sets up the initial IPC channel.
      @Override public void setupConnection(android.os.Bundle args, IParentProcess parentProcess, java.util.List<android.os.IBinder> clientInterfaces) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((args!=null)) {
            _data.writeInt(1);
            args.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((parentProcess!=null))?(parentProcess.asBinder()):(null)));
          _data.writeBinderList(clientInterfaces);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setupConnection, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().setupConnection(args, parentProcess, clientInterfaces);
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      // Forcefully kills the child process.
      @Override public void forceKill() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_forceKill, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().forceKill();
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      // Notifies about memory pressure. The argument is MemoryPressureLevel enum.
      @Override public void onMemoryPressure(int pressure) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pressure);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onMemoryPressure, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().onMemoryPressure(pressure);
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      // Dumps the stack for the child process without crashing it.
      @Override public void dumpProcessStack() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dumpProcessStack, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            if (getDefaultImpl() != null) {
              getDefaultImpl().dumpProcessStack();
              return;
            }
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static IChildProcessService sDefaultImpl;
    }
    static final int TRANSACTION_bindToCaller = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setupConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_forceKill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onMemoryPressure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_dumpProcessStack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    public static boolean setDefaultImpl(IChildProcessService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static IChildProcessService getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public static final String DESCRIPTOR = "org.chromium.base.process_launcher.IChildProcessService";
  // |clazz| identifies the ClassLoader of the caller.
  // On the first call to this method, the service will record the calling PID
  // and |clazz| and return true. Subsequent calls will only return true if the
  // calling PID and |clazz| matches the recorded values.
  public boolean bindToCaller(String clazz) throws android.os.RemoteException;
  // Sets up the initial IPC channel.
  public void setupConnection(android.os.Bundle args, IParentProcess parentProcess, java.util.List<android.os.IBinder> clientInterfaces) throws android.os.RemoteException;
  // Forcefully kills the child process.
  public void forceKill() throws android.os.RemoteException;
  // Notifies about memory pressure. The argument is MemoryPressureLevel enum.
  public void onMemoryPressure(int pressure) throws android.os.RemoteException;
  // Dumps the stack for the child process without crashing it.
  public void dumpProcessStack() throws android.os.RemoteException;
}
