package com.practice.retrofit.http;

import android.content.Context;
import android.util.Log;

import com.practice.retrofit.cache.HttpCache;
import com.practice.retrofit.util.DeviceUtils;

import java.nio.charset.Charset;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by xiachao on 2017/7/4.
 */

public class HttpCacheLayer {
    public static final String TAG = HttpCacheLayer.class.getSimpleName();
    private static Context context;

    public static void init(Context context) {
        HttpCacheLayer.context = context;
    }

    public static void enqueueWithCache(final Call<ResponseBody> call, final Callback<ResponseBody> callBack, final boolean backRequest, final boolean cacheResult, final boolean fromCache) {
        final HttpCache httpCache = new HttpCache(context);
        String requestUrl = call.request().url().toString();
        httpCache.setCacheKey(requestUrl);
        final Callback<ResponseBody> innerCallback = new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.e(TAG, "onResponse: get response from web");
                try {
                    String responseBodyStr = response.body().string();
                    if (cacheResult) {
                        Log.e(TAG, "onResponse:cacheResult enabled,caching result");
                        httpCache.cacheResult(responseBodyStr.getBytes("UTF-8"));
                    }
                    callBack.onResponse(call, createResponseFromString(responseBodyStr));
                } catch (Exception e) {
                    Log.e(TAG, "onResponse:" + Log.getStackTraceString(e));
                    callBack.onFailure(call, e);
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e(TAG, "onFailure:request web failed");
                callBack.onFailure(call, t);
            }
        };

        if (!fromCache && DeviceUtils.isNetworkAvailable(context)) {
            Log.e(TAG, "fromCache disabled and network available, request web");
            call.enqueue(innerCallback);
            return;
        }

        httpCache.setCallback(new HttpCache.CacheCallback() {
            @Override
            public void onCache(byte[] data) {
                if (null != data) {
                    Log.e(TAG, "get data from local cache");
                    String responseBodyString = new String(data, Charset.forName("UTF-8"));
                    Response<ResponseBody> response = createResponseFromString(responseBodyString);
                    callBack.onResponse(call, response);
                    if (backRequest && DeviceUtils.isNetworkAvailable(context)) {
                        Log.e(TAG, "backRequest enabled and network available, request web");
                        call.enqueue(innerCallback);
                    }
                } else {
                    Log.e(TAG, "can not find cache request web");
                    call.enqueue(innerCallback);
                }
            }
        });
        httpCache.execute();
    }

    private static Response<ResponseBody> createResponseFromString(String str) {
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), str);
        return Response.success(responseBody);
    }
}
