package com.practice.retrofit.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by xiachao on 2017/7/4.
 */

public class GsonUtil {
    private static Gson gson = null;

    public static Gson getGson() {
        if (gson == null) {
            gson = new GsonBuilder().create();
        }
        return gson;
    }
}
