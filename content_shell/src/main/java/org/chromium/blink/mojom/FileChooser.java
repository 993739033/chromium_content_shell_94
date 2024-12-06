package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.FilePath;
/* loaded from: classes2.dex */
public interface FileChooser extends Interface {
    public static final Manager<FileChooser, Proxy> MANAGER = FileChooser_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnumerateChosenDirectoryResponse extends Callbacks.Callback1<FileChooserResult> {
    }

    /* loaded from: classes2.dex */
    public interface OpenFileChooserResponse extends Callbacks.Callback1<FileChooserResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends FileChooser, Interface.Proxy {
    }

    void enumerateChosenDirectory(FilePath filePath, EnumerateChosenDirectoryResponse enumerateChosenDirectoryResponse);

    void openFileChooser(FileChooserParams fileChooserParams, OpenFileChooserResponse openFileChooserResponse);
}
