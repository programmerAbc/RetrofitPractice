package com.practice.retrofit.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by usera on 2017/7/2.
 */

public class PrefUtil {
    private static SharedPreferences preferences=null;
    public static void init(Context context){
        preferences= PreferenceManager.getDefaultSharedPreferences(context);
    }


}
