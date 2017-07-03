package com.practice.retrofit.http;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by usera on 2017/7/2.
 */

public class AiyigeCacheInterceptor implements Interceptor {
    public static final String TAG = AiyigeCacheInterceptor.class.getSimpleName();

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        switch (request.method()) {
            case "GET": {
                request = request.newBuilder()
                        .header("Cache-Control", "max-age=600")
                        .build();

                return chain.proceed(request).newBuilder()
                        .header("Cache-Control", "max-age=600")
                        .build();
            }
            case "POST": {
                request = request.newBuilder()
                        .header("Cache-Control", "no-store")
                        .build();
                return chain.proceed(request).newBuilder()
                        .header("Cache-Control", "no-store")
                        .build();
            }
            default: {
                return chain.proceed(request);
            }
        }

    }
}
