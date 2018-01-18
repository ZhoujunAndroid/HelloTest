package com.example.mylibrary;

import android.os.Build;

/**
 * Created by zhou.jun on 2018/1/16.
 */

public class HelloWord {

    public static String getBuildType() {
        return BuildConfig.DEBUG ? "debug" : "release";
    }
}
