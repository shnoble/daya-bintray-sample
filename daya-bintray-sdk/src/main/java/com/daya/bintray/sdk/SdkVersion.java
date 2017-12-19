package com.daya.bintray.sdk;

import android.os.Build;

/**
 * Created by shhong on 2017. 12. 15..
 */

public class SdkVersion {
    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static void setVersion(@NonNull String version) {

    }
}
