package com.practice.retrofit.cache;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class HttpCache {
    private final String TAG = "HttpCache";
    private static final String CACHE_DIR_PATH = Environment.getExternalStorageDirectory() + File.separator + "AiyigeHttpCache/";
    private long cacheDuration = 24 * 60 * 60 * 1000;
    private Context context;
    private Cache cache;
    private String key;
    private Handler handler;
    private CacheCallback callback;

    // 是否运行缓存过期
    private boolean isAllowExpired = false;

    private static final int CPU_COUNT = Runtime.getRuntime()
            .availableProcessors();

    private static final ExecutorService executor = Executors
            .newCachedThreadPool(new ThreadFactory() {
                private final AtomicInteger count = new AtomicInteger(1);

                public Thread newThread(Runnable r) {
                    return new Thread(r, "BaseHttpProcessor #"
                            + count.getAndIncrement());
                }
            });

    public HttpCache(Context context) {
        this.context = context;
        handler = new Handler(context.getMainLooper());
    }

    public void setCacheKey(String key) {
        this.key = key;
    }

    public void setCallback(CacheCallback callback) {
        this.callback = callback;
    }

    public void setAllowExpired(boolean allow) {
        isAllowExpired = allow;
    }

    public void execute() {
        executor.execute(new GetCacheTask());
    }


    protected synchronized Cache getCache() {
        if (cache == null) {
            File cacheDir = new File(CACHE_DIR_PATH);
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            cache = new DiskCache(cacheDir, 128 * 1024 * 1024);
            cache.initialize();
        }
        return cache;
    }

    private byte[] getFromCache() {
        Cache cache = getCache();
        if (null == cache) {
            return null;
        }
        Entry entry = cache.get(key);
        if (null == entry) {
            return null;
        }
        if (isAllowExpired && entry.isExpired()) {
            cache.remove(key);
            return null;
        }

        if (entry.getBody() != null
                && entry.getBody().length > 0) {
            Log.i(TAG, "find cache:" + key);
            return entry.getBody();
        }
        return null;
    }

    public void cacheResult(byte[] data) {
        Cache cache = getCache();
        if (cache != null) {
            executor.execute(new SetCacheTask(data));
        }
    }

    private class GetCacheTask implements Runnable {

        @Override
        public void run() {
            Log.d("--wk--", "GetCacheTask is running ..." + key);
            final byte[] data = getFromCache();
            handler.post(new Runnable() {
                @Override
                public void run() {
                    if (null != callback) {
                        callback.onCache(data);
                    }
                }
            });
        }
    }

    private class SetCacheTask implements Runnable {
        private byte[] data;

        public SetCacheTask(byte[] data) {
            this.data = data;
        }

        @Override
        public void run() {
            Entry entry = new Entry(key, data);
            entry.setDate(System.currentTimeMillis());
            entry.setDuration(cacheDuration);
            Cache cache = getCache();
            cache.put(key, entry);
        }
    }

    public interface CacheCallback {
        void onCache(byte[] data);
    }
}
