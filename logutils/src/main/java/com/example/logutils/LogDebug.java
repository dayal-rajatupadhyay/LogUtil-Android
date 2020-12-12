package com.example.logutils;

import android.util.Log;

/**
 * Created by rajatu@dayalgroup.hq on 12/12/20
 */
public class LogDebug {

    private static String TAG = LogDebug.class.getName();
    public static void d(String message)
    {
        Log.d(TAG,message);
    }
}
