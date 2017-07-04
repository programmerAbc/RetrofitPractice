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

public class HttpCacheWrapper implements Callback<ResponseBody>, HttpCache.CacheCallback {
    public static final String TAG = HttpCacheWrapper.class.getSimpleName();

    boolean backRequest;
    boolean fromCache;
    boolean cacheResult;
    Call<ResponseBody> call;
    Callback<ResponseBody> callback;
    HttpCache httpCache;
    Context context;

    public HttpCacheWrapper(Builder builder) {
        backRequest = builder.backRequest;
        fromCache = builder.fromCache;
        cacheResult = builder.cacheResult;
        call = builder.call;
        callback = builder.callback;
        context = builder.context;
        httpCache = new HttpCache(context);
        httpCache.setCacheKey(call.request().url().toString());
        httpCache.setCallback(this);
    }

    public void enqueue() {
        if (!fromCache && DeviceUtils.isNetworkAvailable(context)) {
            Log.e(TAG, "fromCache disabled and network available, request web");
            call.enqueue(this);
            return;
        }
        httpCache.execute();
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        Log.e(TAG, "onResponse: get response from web");
        try {
            String responseBodyStr = response.body().string();
            if (cacheResult) {
                Log.e(TAG, "onResponse:cacheResult enabled,caching result");
                httpCache.cacheResult(responseBodyStr.getBytes("UTF-8"));
            }
            callback.onResponse(call, createResponseFromString(responseBodyStr));
        } catch (Exception e) {
            Log.e(TAG, "onResponse:" + Log.getStackTraceString(e));
            callback.onFailure(call, e);
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        Log.e(TAG, "onFailure:request web failed");
        callback.onFailure(call, t);
    }

    @Override
    public void onCache(byte[] data) {
        if (null != data) {
            Log.e(TAG, "get data from local cache");
            String responseBodyString = new String(data, Charset.forName("UTF-8"));
            Response<ResponseBody> response = createResponseFromString(responseBodyString);
            callback.onResponse(call, response);
            if (backRequest && DeviceUtils.isNetworkAvailable(context)) {
                Log.e(TAG, "backRequest enabled and network available, request web");
                call.enqueue(this);
            }
        } else {
            Log.e(TAG, "can not find cache request web");
            call.enqueue(this);
        }
    }

    private Response<ResponseBody> createResponseFromString(String str) {
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), str);
        return Response.success(responseBody);
    }

    public static Builder with(Context context) {
        return new Builder().with(context);
    }

    public static class Builder {
        public boolean backRequest;
        public boolean fromCache;
        public boolean cacheResult;
        public Call<ResponseBody> call;
        public Callback<ResponseBody> callback;
        public Context context;

        public Builder() {
            backRequest = false;
            fromCache = false;
            cacheResult = false;
            call = null;
            callback = null;
            context = null;
        }

        public Builder with(Context context) {
            this.context = context;
            return this;
        }

        public Builder enableBackRequest(boolean value) {
            backRequest = value;
            return this;
        }

        public Builder enableFromCache(boolean value) {
            fromCache = value;
            return this;
        }

        public Builder enableCacheResult(boolean value) {
            cacheResult = value;
            return this;
        }

        public Builder call(Call<ResponseBody> call) {
            this.call = call;
            return this;
        }

        public HttpCacheWrapper enqueue(Callback<ResponseBody> callback) {
            this.callback = callback;
            HttpCacheWrapper wrapper = new HttpCacheWrapper(this);
            wrapper.enqueue();
            return wrapper;
        }
    }
}

