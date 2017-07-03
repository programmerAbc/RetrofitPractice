package com.practice.retrofit.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.practice.retrofit.BuildConfig;
import com.practice.retrofit.MyApplication;
import com.practice.retrofit.http.AiyigeCacheInterceptor;
import com.practice.retrofit.http.AiyigeHeaderInterceptor;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;
import com.zhy.http.okhttp.https.HttpsUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by usera on 2017/7/2.
 */

public class OkHttpUtil {
    public static final String TAG = OkHttpUtil.class.getSimpleName();
    private static OkHttpClient client = null;
    private static final String CACHE_DIR_PATH = Environment.getExternalStorageDirectory() + File.separator + "AiyigeHttpCache" + File.separator;
    private static final int CACHE_SIZE = 100 * 1024 * 1024; // 100 MB


    public static OkHttpClient getOkHttpClient() {
        if (client == null) {
            AiyigeHeaderInterceptor aiyigeHeaderInterceptor = new AiyigeHeaderInterceptor();
            AiyigeCacheInterceptor aiyigeCacheInterceptor = new AiyigeCacheInterceptor();
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
            File cacheDir = new File(CACHE_DIR_PATH);
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(MyApplication.getContext()));
            InputStream[] certInputStream = new InputStream[1];
            try {
                certInputStream[0] = MyApplication.getContext().getAssets().open("dance365com.cer");
            } catch (IOException e) {
                Log.e(TAG, "getOkHttpClient:" + Log.getStackTraceString(e));
                return null;
            }
            HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(certInputStream, null, null);
            client = new OkHttpClient.Builder()
                    .retryOnConnectionFailure(true)
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .cookieJar(cookieJar)
                    .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                    .cache(new Cache(cacheDir, CACHE_SIZE))
                    .addInterceptor(aiyigeHeaderInterceptor)
                    .addInterceptor(loggingInterceptor)
                    .addInterceptor(aiyigeCacheInterceptor)
                    .build();
        }
        return client;
    }
}
