package com.practice.retrofit.http;

/**
 * Created by usera on 2017/7/2.
 */

public class ZWURLConfig {
    public static final boolean debugFree = false;

    /***
     * 线上:true
     * 线下:false
     */
    public final static boolean isOnline = true;

    public final static String ONLINE_URL = "https://apix.dance365.com/";//线上地址

    //private final static String OFFLINE_URL = "http://apix.d.dev.wudao.com/";//老的线下地址
    public final static String OFFLINE_URL = "http://apix.wudaodance.com/";//新线下地址

    public final static String URL = isOnline ? ONLINE_URL : OFFLINE_URL;

    public static final String addFans = "my/addFans"; // #41: 加入fans
    public static final String address = "user/address"; // #59: 修改城市
    public static final String ads = "start/ads"; // #23: 获取广告
    public static final String androidVersion = "android/version"; // #66: 安卓版本
    public static final String avatar = "user/avatar"; // #43: 修改头像
    public static final String birthday = "user/birthday"; // #56: 修改生日
    public static final String blacklistAdd = "blacklist/add"; // #40: 加入黑名单
    public static final String blacklistRemove = "blacklist/remove"; // #51: 移除黑名单
    public static final String category = "category/index"; // #27: 获取分类
    public static final String comment = "comment/index"; // #32: 获取主题的评论
    public static final String commentAdd = "comment/add"; // #30: 添加评论
    public static final String commentRemove = "comment/remove"; // #33: 删除评论
    public static final String createByMobile = "login/createByMobile"; // #81: 创建手机账号
    public static final String danceType = "user/danceType"; // #60: 修改舞种
    public static final String fanRemove = "fan/remove"; // #42: 移除fan
    public static final String fans = "relation/fans"; // #29: fans列表
    public static final String favourite = "favourite/index"; // #6: 收藏夹列表
    public static final String favouriteAdd = "favourite/add"; // #7: 添加收藏
    public static final String favouriteRemove = "favourite/remove"; // #9: 删除收藏
    public static final String flash_report = "report/index"; // #80: 闪退报告
    public static final String follow = "follow/add"; // #36: 添加关注
    public static final String followRemove = "follow/remove"; // #37: 取消关注
    public static final String friends = "relation/friends"; // #34: 好友列表
    public static final String lbs = "lbs/update"; // #20: LBS地理位置同步
    public static final String learn = "learn/index"; // #67: 学列表
    public static final String learnOther = "learn/other"; // #71: 他的课程
    public static final String learnScreening = "learn/screening"; // #76: 学筛选
    public static final String likeAdd = "like/add"; // #10: 点赞
    public static final String likeListUserId = "like/listUserId"; // #15: 点赞用户列表
    public static final String likeRemove = "like/remove"; // #11: 取消点赞
    public static final String loginByOpenId = "login/loginByOpenId"; // #49: 第三方账户登录
    public static final String logout = "user/logout"; // #26: 用户退出
    public static final String mallIndex = isOnline ? "http://mall.dance365.com" : "http://mall.wudaodance.com"; // #75: 商域HTML5地址
    public static final String myComment = "my/myComment"; // #31: 获取用户的主题
    public static final String mywork = "watch/my"; // #65: 我的作品
    public static final String oldUser = "user/oldbind"; // #79: 老用户绑定
    public static final String order = "order/index"; // #28: 用户订单列表
    public static final String orderCancel = "order/cancel"; // #69: 取消订单
    public static final String orderDetail = "order/detail"; // #64: 订单详情
    public static final String passwordChange = "user/passwordChange"; // #62: 修改密码
    public static final String passwordForgot = "user/forgotPassword"; // #25: 忘记密码
    public static final String pay = "pay"; // #70: 接入支付
    public static final String qiniuCdn = "qiniu/cdn"; // #18: 刷新七牛CDN
    public static final String qiniuToken = "qiniu/token"; // #16: 获取七牛上传Token
    public static final String qiniuTokenUpdate = "qiniu/tokenupdate"; // #17: 刷新七牛上传Token
    public static final String region = "region/index"; // #50: 省市区
    public static final String register = "user/registerByMobile"; // #24: 用户注册
    public static final String relateList = "relation/list"; // #35: 关系列表
    public static final String reportButtons = "report/buttons"; // #14: 提交按钮数据收集报告
    public static final String reportErrors = "report/errors"; // #12: 提交APP闪退等错误报告
    public static final String reportIndex = "http://www.wudaodance.com/datas/report"; // #74: 举报入口
    public static final String reportMetas = "report/metas"; // #13: 提交数据埋点收集报告
    public static final String sex = "user/sex"; // #44: 修改性别
    public static final String share = "share"; // #63: 分享到第三方平台地址
    public static final String share_app = "http://www.wuzhe.com/"; // #78: 分享中舞网APP给好友时使用该链接地址
    public static final String special = "special/index"; // #77: 专题
    public static final String startApp = "start/index"; // #1: 开机启动页
    public static final String startSync = "start/sync"; // #8: 开机读同步记录
    public static final String studyDetail = "learn/detail"; // #68: 学详情
    public static final String test = "test/DefaultAvatar"; // #72: test
    public static final String testData = "test/data"; // #19: 测试/数据缓存
    public static final String user = "user/info"; // #48: 用户名信息
    public static final String userBindByOauth = "login/bind"; // #21: 第三方账户绑定
    public static final String userLogin = "login/index"; // #2: 账号登陆
    public static final String userLoginByOauth = "login/oauth"; // #3: 微信微博qq登陆
    public static final String userName = "user/userName"; // #57: 修改用户名
    public static final String userReport = "my/myReport"; // #39: 举报
    public static final String verify = "user/verify"; // #61: 验证验证码
    public static final String verifyCode = "user/verifycode"; // #22: 发送验证码
    public static final String watch = "watch/index"; // #45: 看列表
    public static final String watchAdd = "watch/add"; // #46: 添加看
    public static final String watchDelete = "watch/delete"; // #47: 删除看
    public static final String watchDetail = "watch/detail"; // #52: 看详情
    public static final String watchRelatedVideoList = "watch/relatedVideoList"; // #54: 相关列表
    public static final String watchScreening = "watch/screening"; // #73: 看筛选
    public static final String worksCount = "my/worksCount"; // #53: 看统计信息
    public static final String search = "search/index"; // #84: 站内搜索
    public static final String myStudyUrl = "http://my.dance365.com/mymanage/attendance"; // 我的学习


}
