package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface TextFragmentReceiver extends Interface {
    public static final Manager<TextFragmentReceiver, Proxy> MANAGER = TextFragmentReceiver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ExtractFirstFragmentRectResponse extends Callbacks.Callback1<Rect> {
    }

    /* loaded from: classes2.dex */
    public interface ExtractTextFragmentsMatchesResponse extends Callbacks.Callback1<String[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetExistingSelectorsResponse extends Callbacks.Callback1<String[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends TextFragmentReceiver, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestSelectorResponse extends Callbacks.Callback1<String> {
    }

    void cancel();

    void extractFirstFragmentRect(ExtractFirstFragmentRectResponse extractFirstFragmentRectResponse);

    void extractTextFragmentsMatches(ExtractTextFragmentsMatchesResponse extractTextFragmentsMatchesResponse);

    void getExistingSelectors(GetExistingSelectorsResponse getExistingSelectorsResponse);

    void removeFragments();

    void requestSelector(RequestSelectorResponse requestSelectorResponse);
}
