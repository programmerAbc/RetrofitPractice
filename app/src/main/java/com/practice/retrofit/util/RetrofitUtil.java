package com.practice.retrofit.util;

import com.practice.retrofit.http.RetrofitService;
import com.practice.retrofit.http.ZWURLConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by usera on 2017/7/2.
 */

public class RetrofitUtil {
    private static Retrofit retrofit = null;
    private static RetrofitService service = null;

    private static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ZWURLConfig.isOnline ? ZWURLConfig.ONLINE_URL : ZWURLConfig.OFFLINE_URL)
                    .client(OkHttpUtil.getOkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static RetrofitService getService() {
        if (service == null) {
            service = getRetrofit().create(RetrofitService.class);
        }
        return service;
    }
}
