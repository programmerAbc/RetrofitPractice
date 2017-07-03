package com.practice.retrofit;

import android.app.Application;
import android.content.Context;

import java.lang.ref.WeakReference;

/**
 * Created by usera on 2017/7/2.
 */

public class MyApplication extends Application {
    private static WeakReference<Context> contextWeakReference = null;

    @Override
    public void onCreate() {
        super.onCreate();
        contextWeakReference = new WeakReference<Context>(getApplicationContext());

    }

    public static Context getContext() {
        if (contextWeakReference != null) {
            return contextWeakReference.get();
        } else {
            return null;
        }
    }
}
