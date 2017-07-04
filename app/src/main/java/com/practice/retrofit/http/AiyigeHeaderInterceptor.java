package com.practice.retrofit.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

import com.practice.retrofit.MyApplication;
import com.practice.retrofit.util.DeviceUtils;
import com.practice.retrofit.util.MD5Utils;
import com.practice.retrofit.util.PrefUtil;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by usera on 2017/7/2.
 */

public class AiyigeHeaderInterceptor implements Interceptor {
    private static final String TAG = AiyigeHeaderInterceptor.class.getSimpleName();
    private static final String secretKey = "fda368e6488df47ddca5e970d35d31a4";// Header秘钥
    private static final String signAccesstoken = "SIGN-ACCESSTOKEN";
    private static final String signDevice = "SIGN-DEVICE";// 设备名称/品牌  Samsung iPhone
    private static final String signDeviceCode = "SIGN-DEVICE-CODE";// 设备唯一码
    private static final String signDeviceType = "SIGN-DEVICE-TYPE";// 设备型号 Note3 或 6S
    private static final String signLanguage = "SIGN-LANGUAGE";// 语言
    private static final String signOs = "SIGN-OS";//ANDROID  或  IOS
    private static final String signOsVersion = "SIGN-OS-VERSION";//操作系统版本
    private static final String signSession = "SIGN-SESSION";//单点登陆信息
    private static final String signTimestamp = "SIGN-TIMESTAMP";//api请求发送时间
    private static final String signVersion = "SIGN-VERSION";//app版本号
    private static final String signSignature = "SIGN-SIGNATURE";//加密算法获得的


    @Override
    public Response intercept(Chain chain) throws IOException {
        String signOsValue = "Android";
        String signDeviceValue = Build.BRAND;
        if (isChineseChar(signDeviceValue)) {
            signDeviceValue = gbEncoding(signDeviceValue);
        }
        String signDeviceCodeValue = "";
        try {
            signDeviceCodeValue = DeviceUtils.getIMeiString(MyApplication.getContext());
        } catch (Exception e) {
            Log.e(TAG, "intercept:" + Log.getStackTraceString(e));
        }
        String signDeviceTypeValue = Build.MODEL;
        if (isChineseChar(signDeviceTypeValue)) {
            signDeviceTypeValue = gbEncoding(signDeviceTypeValue);
            signDeviceCodeValue = signDeviceTypeValue.trim();
        }
        String signLanguageValue = "";
        try {
            signLanguageValue = MyApplication.getContext().getResources().getConfiguration().locale.getCountry();
        } catch (Exception e) {
            Log.e(TAG, "intercept:" + Log.getStackTraceString(e));
        }
        String signVersionValue = "";
        try {
            signVersionValue = getCurrentVersion(MyApplication.getContext());
        } catch (Exception e) {
            Log.e(TAG, "intercept:" + Log.getStackTraceString(e));
        }
        String signTimestampValue = String.valueOf(System.currentTimeMillis() / 1000);
        String signSignatureValue = signAccesstoken + "=" + PrefUtil.getSessionAccessToken()
                + "&" + signDevice + "=" + signDeviceValue
                + "&" + signDeviceCode + "=" + signDeviceCodeValue
                + "&" + signDeviceType + "=" + signDeviceTypeValue
                + "&" + signLanguage + "=" + signLanguageValue
                + "&" + signOs + "=" + signOsValue
                + "&" + signOsVersion + "=" + Build.VERSION.RELEASE
                + "&" + signSession + "=" + PrefUtil.getSession()
                + "&" + signTimestamp + "=" + signTimestampValue
                + "&" + signVersion + "=" + signVersionValue
                + "&" + secretKey;
        signSignatureValue = MD5Utils.getMD5String(signSignatureValue);

        Request request = chain.request().newBuilder()
                .addHeader(signAccesstoken, PrefUtil.getSessionAccessToken())
                .addHeader(signDevice, signDeviceValue)
                .addHeader(signDeviceCode, signDeviceCodeValue)
                .addHeader(signDeviceType, signDeviceTypeValue)
                .addHeader(signLanguage, signLanguageValue)
                .addHeader(signOs, signOsValue)
                .addHeader(signOsVersion, Build.VERSION.RELEASE)
                .addHeader(signSession, PrefUtil.getSession())
                .addHeader(signTimestamp, signTimestampValue)
                .addHeader(signVersion, signVersionValue)
                .addHeader(signSignature, signSignatureValue)
                .build();
        Response response = chain.proceed(request);
        return response;
    }

    public static String gbEncoding(final String gbString) {
        char[] utfBytes = gbString.toCharArray();
        String unicodeBytes = "";
        for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {
            String hexB = Integer.toHexString(utfBytes[byteIndex]);
            if (hexB.length() <= 2) {
                hexB = "00" + hexB;
            }
            unicodeBytes = unicodeBytes + "\\u" + hexB;
        }
        return unicodeBytes;
    }

    public static boolean isChineseChar(String str) {
        boolean temp = false;
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            temp = true;
        }
        return temp;
    }

    public static String getCurrentVersion(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            String version = packInfo.versionName;
            return version;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
