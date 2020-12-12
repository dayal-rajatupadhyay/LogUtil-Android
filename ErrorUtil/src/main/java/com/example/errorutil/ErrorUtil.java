package com.example.errorutil;

import android.util.Log;

/**
 * Created by rajatu@dayalgroup.hq on 12/12/20
 */
public class ErrorUtil {

    private static String TAG = ErrorUtil.class.getName();
    public static void e(String message)
    {
        Log.e(TAG,message);
    }

}
