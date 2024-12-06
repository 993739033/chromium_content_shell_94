package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FileSystemAccessDirectoryEntriesListener extends Interface {
    public static final Manager<FileSystemAccessDirectoryEntriesListener, Proxy> MANAGER = FileSystemAccessDirectoryEntriesListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FileSystemAccessDirectoryEntriesListener, Interface.Proxy {
    }

    void didReadDirectory(FileSystemAccessError fileSystemAccessError, FileSystemAccessEntry[] fileSystemAccessEntryArr, boolean z);
}
