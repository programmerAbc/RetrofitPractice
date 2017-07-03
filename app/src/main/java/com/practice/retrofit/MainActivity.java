package com.practice.retrofit;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.practice.retrofit.model.request.RequestLogin;
import com.practice.retrofit.util.PermissionUtil;
import com.practice.retrofit.util.RetrofitUtil;

import java.io.IOException;

import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        PermissionUtil.requestPermission(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE});
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

    @OnClick({R.id.watchCounts,R.id.userLogin, R.id.TestWebPage, R.id.watchDatas, R.id.learnDatas, R.id.watchDetail, R.id.studyDetail, R.id.watchSpecialDatas, R.id.watchSelectionDanceType})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.userLogin:
                RetrofitUtil.getService().userLogin(new RequestLogin("18502565821", "123456")).enqueue(new Callback<ResponseBody>() {
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
                });
                break;
            case R.id.watchDatas:
                RetrofitUtil.getService().watchDatas("Hot", "15", "1", "", "", "", "", "", "", "", "").enqueue(new Callback<ResponseBody>() {
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
                });
                break;
            case R.id.learnDatas:
                RetrofitUtil.getService().learnDatas("Hot", "15", "1", "", "", "", "", "", "", "", "").enqueue(new Callback<ResponseBody>() {
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
                });
                break;
            case R.id.watchDetail:
                RetrofitUtil.getService().watchDetail("0", "1107564").enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.e(TAG, "onResponse:" + response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e(TAG, "onFailure:" + Log.getStackTraceString(t));
                    }
                });
                break;
            case R.id.studyDetail:
                RetrofitUtil.getService().learnDetail("1", "100").enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.e(TAG, "onResponse:" + response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e(TAG, "onFailure:" + Log.getStackTraceString(t));
                    }
                });
                break;
            case R.id.watchSpecialDatas:
                RetrofitUtil.getService().watchSpecialDatas("15", "1").enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.e(TAG, "onResponse:" + response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e(TAG, "onFailure:" + Log.getStackTraceString(t));
                    }
                });
                break;
            case R.id.watchSelectionDanceType:
                RetrofitUtil.getService().watchSelectionDanceType().enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.e(TAG, "onResponse:" + response.body().string());
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
            case R.id.TestWebPage:
                RetrofitUtil.getService().webPage("http://www.hao123.com").enqueue(new Callback<ResponseBody>() {
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
                });
                break;
        }
    }

}
