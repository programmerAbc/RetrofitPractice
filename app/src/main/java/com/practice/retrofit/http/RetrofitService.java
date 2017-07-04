package com.practice.retrofit.http;

import com.practice.retrofit.model.request.RequestAreaChange;
import com.practice.retrofit.model.request.RequestBirthdayChange;
import com.practice.retrofit.model.request.RequestBlackListAdd;
import com.practice.retrofit.model.request.RequestBlackListDelete;
import com.practice.retrofit.model.request.RequestCancelOrder;
import com.practice.retrofit.model.request.RequestChangeHeadImage;
import com.practice.retrofit.model.request.RequestCommentRemove;
import com.practice.retrofit.model.request.RequestDanceType;
import com.practice.retrofit.model.request.RequestFollow;
import com.practice.retrofit.model.request.RequestFollowDelete;
import com.practice.retrofit.model.request.RequestLbsUpdate;
import com.practice.retrofit.model.request.RequestLogin;
import com.practice.retrofit.model.request.RequestPay;
import com.practice.retrofit.model.request.RequestQiniuToken;
import com.practice.retrofit.model.request.RequestReigster;
import com.practice.retrofit.model.request.RequestResetPassword;
import com.practice.retrofit.model.request.RequestSexChange;
import com.practice.retrofit.model.request.RequestUserBindByOauth;
import com.practice.retrofit.model.request.RequestUserNameChange;
import com.practice.retrofit.model.request.RequestVerify;
import com.practice.retrofit.model.request.RequestVerifyCode;
import com.practice.retrofit.model.request.RequestWatchDelete;

import java.util.List;
import java.util.Map;

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
    //------------------GET PART----------------------
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

    @GET
    Call<ResponseBody> webPage(@Url String url);

    @GET(ZWURLConfig.region)
    Call<ResponseBody> areaList(@Query("requestJson") String requestRegionJson);

    @GET(ZWURLConfig.ads)
    Call<ResponseBody> broadAds(@Query("typeId") String typeId);

    @GET(ZWURLConfig.androidVersion)
    Call<ResponseBody> checkVersion();

    @GET(ZWURLConfig.comment)
    Call<ResponseBody> commentDatas(@Query("serverCode") String serverCode,
                                    @Query("pageSize") String pageSize,
                                    @Query("page") String page);

    /**
     * @param type 现在值固定为danceType
     */
    @GET(ZWURLConfig.category)
    Call<ResponseBody> danceTypeList(@Query("type") String type);

    @GET(ZWURLConfig.favourite)
    Call<ResponseBody> favouriteIndex();

    /**
     *
     * @param field 如果是根据userId获取用户信息的话，就传入userId值，
     *              如果是根据accId来获取用户信息的话就传入accId值
     * @param value 具体的userId或accId
     * @return
     */
    @GET(ZWURLConfig.user)
    Call<ResponseBody> getUserInfo(@Query("filed") String field, @Query("value") String value);

    @GET(ZWURLConfig.learnScreening)
    Call<ResponseBody> learnSelectionDanceType();

    @GET(ZWURLConfig.oldUser)
    Call<ResponseBody> oldUser(@Query("account") String account, @Query("verify") String verify);

    @GET(ZWURLConfig.orderDetail)
    Call<ResponseBody> orderDetail(@Query("id") String id);

    @GET(ZWURLConfig.order)
    Call<ResponseBody> orderList(@Query("type") String type,
                                 @Query("pageSize") String pageSize,
                                 @Query("page") String page);

    @GET(ZWURLConfig.relateList)
    Call<ResponseBody> relationUserList(@Query("model") String model,
                                        @Query("userId") String userId,
                                        @Query("page") String page,
                                        @Query("pageSize") String pageSize);

    /**
     * @param keyword
     * @param order    排序(0=>综合 1=>时间 2=>热门)
     * @param page
     * @param pageSize
     * @param isPhone  值固定为1
     */
    @GET(ZWURLConfig.search)
    Call<ResponseBody> search(@Query("keyword") String keyword,
                              @Query("order") String order,
                              @Query("page") String page,
                              @Query("pagesize") String pageSize,
                              @Query("isPhone") String isPhone);

    @GET(ZWURLConfig.startSync)
    Call<ResponseBody> startIndex();

    @GET(ZWURLConfig.learnOther)
    Call<ResponseBody> learnOtherTopicList(@Query("userId") String userId,
                                           @Query("page") String page,
                                           @Query("pageSize") String pageSize);

    @GET(ZWURLConfig.mywork)
    Call<ResponseBody> myworkTopicList(@Query("userId") String userId,
                                       @Query("page") String page,
                                       @Query("pageSize") String pageSize);



    @GET(ZWURLConfig.watchRelatedVideoList)
    Call<ResponseBody> videoAboutDatas(@Query("serverCode") String serverCode,
                                       @Query("top") String top);

    //------------------------------POST PART----------------------------------
    @POST(ZWURLConfig.userLogin)
    Call<ResponseBody> login(@Body RequestLogin request);

    @POST(ZWURLConfig.commentAdd)
    Call<ResponseBody> commentAdd(@Body Object o);

    @POST(ZWURLConfig.blacklistAdd)
    Call<ResponseBody> blackListAdd(@Body List<RequestBlackListAdd> list);

    @POST(ZWURLConfig.blacklistRemove)
    Call<ResponseBody> blackListDelete(@Body List<RequestBlackListDelete> list);

    @POST(ZWURLConfig.watchDelete)
    Call<ResponseBody> watchDelete(@Body RequestWatchDelete request);

    @POST(ZWURLConfig.watchAdd)
    Call<ResponseBody> watchAdd(@Body Object o);
    @POST(ZWURLConfig.verifyCode)
    Call<ResponseBody> verifyCode(@Body RequestVerifyCode request);

    @POST(ZWURLConfig.verify)
    Call<ResponseBody> verify(@Body RequestVerify request);
    @POST(ZWURLConfig.reportButtons)
    Call<ResponseBody> reportButton(@Body Object o);

    @POST(ZWURLConfig.reportErrors)
    Call<ResponseBody> reportErrors(@Body Object o);

    @POST(ZWURLConfig.reportMetas)
    Call<ResponseBody> reportPage(@Body Object o);

    @POST(ZWURLConfig.passwordForgot)
    Call<ResponseBody> resetPassword(@Body RequestResetPassword request);
    @POST(ZWURLConfig.pay)
    Call<ResponseBody> pay(@Body RequestPay request);

    @POST(ZWURLConfig.qiniuToken)
    Call<ResponseBody> qiniuToken(@Body List<RequestQiniuToken> list);


    @POST(ZWURLConfig.qiniuTokenUpdate)
    Call<ResponseBody> qiniuTokenUpdate(@Body List<RequestQiniuToken> list);

    @POST(ZWURLConfig.register)
    Call<ResponseBody> register(@Body RequestReigster request);

    @POST(ZWURLConfig.orderCancel)
    Call<ResponseBody> orderCancel(@Body List<RequestCancelOrder> list);

    @POST(ZWURLConfig.likeRemove)
    Call<ResponseBody> likeDelete(@Body Object o);

    @POST(ZWURLConfig.likeAdd)
    Call<ResponseBody> likeInsert(@Body Object o);

    @POST(ZWURLConfig.likeListUserId)
    Call<ResponseBody> likeUserList(@Body Object o);

    @POST(ZWURLConfig.loginByOpenId)
    Call<ResponseBody> loginByOpenId(@Body RequestUserBindByOauth request);

    @POST(ZWURLConfig.userBindByOauth)
    Call<ResponseBody> loginOauth(@Body RequestUserBindByOauth request);

    @POST(ZWURLConfig.logout)
    Call<ResponseBody> logout();

    @POST(ZWURLConfig.startApp)
    Call<ResponseBody> launcher(@Body Map<String, String> map);

    @POST(ZWURLConfig.lbs)
    Call<ResponseBody> lbsUpdate(@Body RequestLbsUpdate request);

    @POST(ZWURLConfig.favouriteAdd)
    Call<ResponseBody> favouriteInsert(Object o);

    @POST(ZWURLConfig.followRemove)
    Call<ResponseBody> followDelete(@Body List<RequestFollowDelete> list);

    @POST(ZWURLConfig.favouriteRemove)
    Call<ResponseBody> favouriteDelete(@Body Object o);

    @POST(ZWURLConfig.follow)
    Call<ResponseBody> follow(@Body List<RequestFollow> list);

    @POST(ZWURLConfig.commentRemove)
    Call<ResponseBody> commentRemove(@Body List<RequestCommentRemove> list);

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
}
