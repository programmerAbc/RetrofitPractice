package com.practice.retrofit.http;

import com.practice.retrofit.model.request.RequestBlackListAdd;
import com.practice.retrofit.model.request.RequestBlackListDelete;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by usera on 2017/7/2.
 */

public interface RetrofitService {
    @GET(ZWURLConfig.watch)
    Call<ResponseBody> watchDatas(@Query("type") String type,
                                  @Query("pageSize") String pageSize,
                                  @Query("page") String page,
                                  @Query("dancetype") String dancetype,
                                  @Query("danceway") String danceway,
                                  @Query("difficulty_level") String difficultyLevel,
                                  @Query("goal") String goal,
                                  @Query("modality") String modality,
                                  @Query("gender_group") String genderGroup,
                                  @Query("person") String person,
                                  @Query("resource") String resource);

    @GET(ZWURLConfig.learn)
    Call<ResponseBody> learnDatas(@Query("type") String type,
                                  @Query("pageSize") String pageSize,
                                  @Query("page") String page,
                                  @Query("dancetype") String dancetype,
                                  @Query("danceway") String danceway,
                                  @Query("difficulty_level") String difficultyLevel,
                                  @Query("goal") String goal,
                                  @Query("modality") String modality,
                                  @Query("gender_group") String genderGroup,
                                  @Query("person") String person,
                                  @Query("resource") String resource);

    @GET(ZWURLConfig.watchDetail)
    Call<ResponseBody> watchDetail(@Query("typeId") String typeId,
                                   @Query("id") String id);

    @GET(ZWURLConfig.studyDetail)
    Call<ResponseBody> learnDetail(@Query("typeId") String typeId,
                                   @Query("id") String id);

    @GET(ZWURLConfig.special)
    Call<ResponseBody> watchSpecialDatas(@Query("pageSize") String pageSize,
                                         @Query("page") String page);

    @GET(ZWURLConfig.watchScreening)
    Call<ResponseBody> watchSelectionDanceType();

    @GET(ZWURLConfig.worksCount)
    Call<ResponseBody> watchCounts();

    @POST(ZWURLConfig.watchDelete)
    Call<ResponseBody> watchDelete(@Body Object o);

    @POST(ZWURLConfig.watchAdd)
    Call<ResponseBody> watchAdd(@Body Object o);

    @GET
    Call<ResponseBody> webPage(@Url String url);

    @POST(ZWURLConfig.userLogin)
    Call<ResponseBody> userLogin(@Body Object o);

    @GET(ZWURLConfig.region)
    Call<ResponseBody> areaList(@Query("requestJson") String requestRegionJson);

    @POST(ZWURLConfig.blacklistAdd)
    Call<ResponseBody> blackListAdd(@Body List<RequestBlackListAdd> list);

    @POST(ZWURLConfig.blacklistRemove)
    Call<ResponseBody> blackListDelete(@Body List<RequestBlackListDelete> list);

    @GET(ZWURLConfig.ads)
    Call<ResponseBody> broadAds(@Query("typeId") String typeId);


}
