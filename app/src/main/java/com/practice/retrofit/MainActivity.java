package com.practice.retrofit;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.practice.retrofit.http.HttpCacheWrapper;
import com.practice.retrofit.http.RetrofitService;
import com.practice.retrofit.model.request.RequestLogin;
import com.practice.retrofit.model.resp.RespLogin;
import com.practice.retrofit.util.GsonUtil;
import com.practice.retrofit.util.PermissionUtil;
import com.practice.retrofit.util.PrefUtil;
import com.practice.retrofit.util.RetrofitUtil;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<ResponseBody> {
    public static final String TAG = MainActivity.class.getSimpleName();
    RetrofitService rs;
    RespLogin respLogin = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        PermissionUtil.requestPermission(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_PHONE_STATE});
        rs = RetrofitUtil.getService();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode) {
            case PermissionUtil.REUQEST_PERMISSION_CODE:
                String[] deniedPermissions = PermissionUtil.handleRequestPermissionResult(permissions, grantResults);
                if (deniedPermissions != null) {
                    PermissionUtil.requestPermission(this, deniedPermissions);
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                break;
        }
    }


    @OnClick({R.id.watchDatas, R.id.learnDatas, R.id.watchDetail, R.id.studyDetail, R.id.watchSpecialDatas, R.id.watchSelectionDanceType, R.id.watchCounts, R.id.TestWebPage, R.id.arealist, R.id.broadAds, R.id.checkVersion, R.id.commentDatas, R.id.danceTypeList, R.id.favouriteIndex, R.id.getUserInfo, R.id.learnSelectionDanceType, R.id.oldUser, R.id.orderDetail, R.id.orderList, R.id.relationUserList, R.id.search, R.id.startIndex, R.id.learnOtherTopicList, R.id.myworkTopicList, R.id.videoAboutDatas, R.id.login, R.id.commentAdd, R.id.blackListAdd, R.id.blackListDelete, R.id.watchDelete, R.id.watchAdd, R.id.verifyCode, R.id.verify, R.id.reportButton, R.id.reportErrors, R.id.reportPage, R.id.resetPassword, R.id.pay, R.id.qiniuToken, R.id.qiniuTokenUpdate, R.id.register, R.id.orderCancel, R.id.likeDelete, R.id.likeInsert, R.id.likeUserList, R.id.loginByOpenId, R.id.loginOauth, R.id.logout, R.id.launcher, R.id.lbsUpdate, R.id.favouriteInsert, R.id.followDelete, R.id.favouriteDelete, R.id.follow, R.id.commentRemove, R.id.changeBirthday, R.id.changeCity, R.id.changeDanceType, R.id.changeheadImage, R.id.changeSex, R.id.changeUserName})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.watchDatas:
                Call<ResponseBody> call = rs.watchDatas("Hot", "15", "1", "", "", "", "", "", "", "", "");
                HttpCacheWrapper.enqueueWithCache(call, this, true, true, true);
                break;
            case R.id.learnDatas:
                RetrofitUtil.getService(3).learnDatas("Hot", "15", "1", "", "", "", "", "", "", "", "").enqueue(this);
                break;
            case R.id.watchDetail:
                rs.watchDetail("0", "1107564").enqueue(this);
                break;
            case R.id.studyDetail:
                rs.learnDetail("1", "100").enqueue(this);
                break;
            case R.id.watchSpecialDatas:
                rs.watchSpecialDatas("15", "1").enqueue(this);
                break;
            case R.id.watchSelectionDanceType:
                rs.watchSelectionDanceType().enqueue(this);
                break;
            case R.id.watchCounts:
                rs.watchCounts().enqueue(this);
                break;
            case R.id.TestWebPage:
                rs.webPage("http://www.hao123.com").enqueue(this);
                break;
            case R.id.arealist:
                rs.areaList("Nanjing").enqueue(this);
                break;
            case R.id.broadAds:
                rs.broadAds("0").enqueue(this);
                break;
            case R.id.checkVersion:
                rs.checkVersion().enqueue(this);
                break;
            case R.id.commentDatas:
                rs.commentDatas("10", "15", "1").enqueue(this);
                break;
            case R.id.danceTypeList:
                rs.danceTypeList("1").enqueue(this);
                break;
            case R.id.favouriteIndex:
                rs.favouriteIndex().enqueue(this);
                break;
            case R.id.getUserInfo:
                Log.e(TAG, "getUserInfo userId=" + respLogin.getData().getUserId());
                Log.e(TAG, "getUserInfo accId=" + respLogin.getData().getAccId());
                rs.getUserInfo("userId", respLogin.getData().getUserId()).enqueue(this);
                break;
            case R.id.learnSelectionDanceType:
                rs.learnSelectionDanceType().enqueue(this);
                break;
            case R.id.oldUser:
                rs.oldUser("asdf", "123").enqueue(this);
                break;
            case R.id.orderDetail:
                rs.orderDetail("123").enqueue(this);
                break;
            case R.id.orderList:
                rs.orderList("asdf", "15", "1").enqueue(this);
                break;
            case R.id.relationUserList:
                rs.relationUserList("", "", "1", "15").enqueue(this);
                break;
            case R.id.search:
                rs.search("广场舞", "0", "1", "15", "1").enqueue(this);
                break;
            case R.id.startIndex:
                rs.startIndex().enqueue(this);
                break;
            case R.id.learnOtherTopicList:
                rs.learnOtherTopicList("", "1", "15").enqueue(this);
                break;
            case R.id.myworkTopicList:
                rs.myworkTopicList("", "1", "15").enqueue(this);
                break;
            case R.id.videoAboutDatas:
                rs.videoAboutDatas("", "").enqueue(this);
                break;
            case R.id.login:
                final RequestLogin requestLogin = new RequestLogin();
                requestLogin.setAccount("18502565821");
                requestLogin.setPassword("123456");
                rs.login(requestLogin).enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String loginResponse = response.body().string();
                            Log.e(TAG, "login response:" + loginResponse);
                            respLogin = GsonUtil.getGson().fromJson(loginResponse, RespLogin.class);
                            PrefUtil.setSession(respLogin.getData().getSession());
                            PrefUtil.setSessionAccessToken(respLogin.getData().getAccessToken());
                        } catch (IOException e) {
                            Log.e(TAG, "onResponse:" + Log.getStackTraceString(e));
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e(TAG, "onFailure:" + Log.getStackTraceString(t));
                    }
                });
                break;
            case R.id.commentAdd:
                rs.commentAdd(null).enqueue(this);
                break;
            case R.id.blackListAdd:
                rs.blackListAdd(null).enqueue(this);
                break;
            case R.id.blackListDelete:
                rs.blackListAdd(null).enqueue(this);
                break;
            case R.id.watchDelete:
                rs.watchDelete(null).enqueue(this);
                break;
            case R.id.watchAdd:
                rs.watchAdd(null).enqueue(this);
                break;
            case R.id.verifyCode:
                rs.verifyCode(null).enqueue(this);
                break;
            case R.id.verify:
                rs.verify(null).enqueue(this);
                break;
            case R.id.reportButton:
                rs.reportButton(null).enqueue(this);
                break;
            case R.id.reportErrors:
                rs.reportErrors(null).enqueue(this);
                break;
            case R.id.reportPage:
                rs.reportPage(null).enqueue(this);
                break;
            case R.id.resetPassword:
                rs.resetPassword(null).enqueue(this);
                break;
            case R.id.pay:
                rs.pay(null).enqueue(this);
                break;
            case R.id.qiniuToken:
                rs.qiniuToken(null).enqueue(this);
                break;
            case R.id.qiniuTokenUpdate:
                rs.qiniuTokenUpdate(null).enqueue(this);
                break;
            case R.id.register:
                rs.register(null).enqueue(this);
                break;
            case R.id.orderCancel:
                rs.orderCancel(null).enqueue(this);
                break;
            case R.id.likeDelete:
                rs.likeDelete(null).enqueue(this);
                break;
            case R.id.likeInsert:
                rs.likeInsert(null).enqueue(this);
                break;
            case R.id.likeUserList:
                rs.likeUserList(null).enqueue(this);
                break;
            case R.id.loginByOpenId:
                rs.loginByOpenId(null).enqueue(this);
                break;
            case R.id.loginOauth:
                rs.loginOauth(null).enqueue(this);
                break;
            case R.id.logout:
                PrefUtil.setSession("");
                PrefUtil.setSessionAccessToken("");
                respLogin = null;
                rs.logout().enqueue(this);
                break;
            case R.id.launcher:
                rs.launcher(null).enqueue(this);
                break;
            case R.id.lbsUpdate:
                rs.lbsUpdate(null).enqueue(this);
                break;
            case R.id.favouriteInsert:
                rs.favouriteInsert(null).enqueue(this);
                break;
            case R.id.followDelete:
                rs.followDelete(null).enqueue(this);
                break;
            case R.id.favouriteDelete:
                rs.favouriteDelete(null).enqueue(this);
                break;
            case R.id.follow:
                rs.follow(null).enqueue(this);
                break;
            case R.id.commentRemove:
                rs.commentRemove(null).enqueue(this);
                break;
            case R.id.changeBirthday:
                rs.changeBirthday(null).enqueue(this);
                break;
            case R.id.changeCity:
                rs.changeCity(null).enqueue(this);
                break;
            case R.id.changeDanceType:
                rs.changeDanceType(null).enqueue(this);
                break;
            case R.id.changeheadImage:
                rs.changeheadImage(null).enqueue(this);
                break;
            case R.id.changeSex:
                rs.changeSex(null).enqueue(this);
                break;
            case R.id.changeUserName:
                rs.changeUserName(null).enqueue(this);
                break;
        }
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        try {
            Log.e(TAG, "onResponse:" + response.body().string());
        } catch (Exception e) {
            Log.e(TAG, "onResponse:" + Log.getStackTraceString(e));
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        Log.e(TAG, "onFailure:" + Log.getStackTraceString(t));
    }
}
