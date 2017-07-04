package com.practice.retrofit.util;

import android.util.Pair;

import com.practice.retrofit.http.RetrofitService;
import com.practice.retrofit.http.ZWURLConfig;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by usera on 2017/7/2.
 */

public class RetrofitUtil {
    private static Map<Integer, Pair<Retrofit, RetrofitService>> map = new HashMap<>();
    public static int DEFAULT_TIMEOUT_S = 10;

    public static RetrofitService getService(int timeoutS) {
        RetrofitService service = map.get(timeoutS).second;
        if (service == null) {
            OkHttpClient client = OkHttpUtil.createOkHttpClient(timeoutS);
            if (client == null) return null;
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ZWURLConfig.isOnline ? ZWURLConfig.ONLINE_URL : ZWURLConfig.OFFLINE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(RetrofitService.class);
            map.put(timeoutS, new Pair<Retrofit, RetrofitService>(retrofit, service));
        }
        return service;
    }

    public static RetrofitService getService() {
        return getService(DEFAULT_TIMEOUT_S);
    }
}
