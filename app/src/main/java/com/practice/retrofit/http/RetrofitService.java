package com.practice.retrofit.http;

import com.practice.retrofit.model.request.RequestAreaChange;
import com.practice.retrofit.model.request.RequestBirthdayChange;
import com.practice.retrofit.model.request.RequestBlackListAdd;
import com.practice.retrofit.model.request.RequestBlackListDelete;
import com.practice.retrofit.model.request.RequestChangeHeadImage;
import com.practice.retrofit.model.request.RequestCommentRemove;
import com.practice.retrofit.model.request.RequestDanceType;
import com.practice.retrofit.model.request.RequestLogin;
import com.practice.retrofit.model.request.RequestSexChange;
import com.practice.retrofit.model.request.RequestUserNameChange;
import com.practice.retrofit.model.request.RequestWatchDelete;

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
    Call<ResponseBody> watchDelete(@Body RequestWatchDelete request);

    @POST(ZWURLConfig.watchAdd)
    Call<ResponseBody> watchAdd(@Body Object o);

    @GET
    Call<ResponseBody> webPage(@Url String url);

    @POST(ZWURLConfig.userLogin)
    Call<ResponseBody> userLogin(@Body RequestLogin request);

    @GET(ZWURLConfig.region)
    Call<ResponseBody> areaList(@Query("requestJson") String requestRegionJson);

    @POST(ZWURLConfig.blacklistAdd)
    Call<ResponseBody> blackListAdd(@Body List<RequestBlackListAdd> list);

    @POST(ZWURLConfig.blacklistRemove)
    Call<ResponseBody> blackListDelete(@Body List<RequestBlackListDelete> list);

    @GET(ZWURLConfig.ads)
    Call<ResponseBody> broadAds(@Query("typeId") String typeId);

    @POST(ZWURLConfig.birthday)
    Call<ResponseBody> changeBirthday(@Body RequestBirthdayChange request);

    @POST(ZWURLConfig.address)
    Call<ResponseBody> changeCity(@Body RequestAreaChange request);

    @POST(ZWURLConfig.danceType)
    Call<ResponseBody> changeDanceType(@Body List<RequestDanceType> danceTypeList);

    @POST(ZWURLConfig.avatar)
    Call<ResponseBody> changeheadImage(@Body RequestChangeHeadImage request);

    @POST(ZWURLConfig.sex)
    Call<ResponseBody> changeSex(@Body RequestSexChange request);

    @POST(ZWURLConfig.userName)
    Call<ResponseBody> changeUserName(@Body RequestUserNameChange request);

    @GET(ZWURLConfig.androidVersion)
    Call<ResponseBody> checkVersion();

    @POST(ZWURLConfig.commentAdd)
    Call<ResponseBody> commentAdd(@Body Object o);

    @GET(ZWURLConfig.comment)
    Call<ResponseBody> commentDatas(@Query("serverCode") String serverCode,
                                    @Query("pageSize") String pageSize,
                                    @Query("page") String page);

    @POST(ZWURLConfig.commentRemove)
    Call<ResponseBody> commentREmote(@Body List<RequestCommentRemove> list);

    @GET(ZWURLConfig.category)
    Call<ResponseBody> danceTypeList(@Query("type") String type);//现在type的值固定为danceType

    @POST(ZWURLConfig.favouriteRemove)
    Call<ResponseBody> favouriteDelete(@Body Object o);

}
