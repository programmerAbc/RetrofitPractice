package com.practice.retrofit.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by usera on 2017/7/2.
 */

public class PrefUtil {
    public static final String PREF_KEY_SESSION = "PREF_KEY_SESSION";
    public static final String PREF_KEY_SESSION_ACCESS_TOKEN = "PREF_KEY_SESSION_ACCESS_TOKEN";

    private static SharedPreferences preferences = null;

    public static void init(Context context) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setSession(String session) {
        preferences.edit().putString(PREF_KEY_SESSION, session).apply();
    }

    public static String getSession() {
        return preferences.getString(PREF_KEY_SESSION, "");
    }

    public static void setSessionAccessToken(String sessionAccessToken) {
        preferences.edit().putString(PREF_KEY_SESSION_ACCESS_TOKEN, sessionAccessToken).apply();
    }

    public static String getSessionAccessToken() {
        return preferences.getString(PREF_KEY_SESSION_ACCESS_TOKEN, "");
    }
}
