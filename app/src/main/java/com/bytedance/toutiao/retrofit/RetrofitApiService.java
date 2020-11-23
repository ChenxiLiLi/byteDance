package com.bytedance.toutiao.retrofit;

import com.bytedance.toutiao.bean.MessageCommentModel;
import com.bytedance.toutiao.bean.MsgFocusModel;
import com.bytedance.toutiao.bean.NewsModel;
import com.bytedance.toutiao.bean.SearchCityModel;
import com.bytedance.toutiao.bean.SearchFriendModel;
import com.bytedance.toutiao.bean.SearchHotModel;
import com.bytedance.toutiao.bean.User;
import com.bytedance.toutiao.bean.VideoModel;
import com.bytedance.toutiao.bean.basebean.ResponseModel;

import java.util.HashMap;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Data : 2020/10/29
 * Time : 15:36
 * Author : 刘朝阳
 */
public interface RetrofitApiService {

    @POST("mock/7451/byte/dance/v1.0/base/login")
    @FormUrlEncoded
    Observable<ResponseModel<User>> login(@FieldMap HashMap<String, String> map);

    @POST("mock/7451/byte/dance/v1.0/base/register")
    @FormUrlEncoded
    Observable<ResponseModel<User>> register(@FieldMap HashMap<String, String> map);

    @GET("mock/7451/byte/dance/v1.0/getRecommentVideos")
    Observable<ResponseModel<List<VideoModel>>> getRecommentVideos();

    @GET("mock/7451/byte/dance/v1.0/home/news/list")
    Observable<ResponseModel<List<NewsModel>>> listNews(@Query("type") String type);

    @GET("mock/7451/byte/dance/v1.0/home/news/detail/{id}")
    Observable<ResponseModel<NewsModel>> newsDetail(@Path("id") String id);

    //信息界面评论列表
    @GET("mock/7451/byte/dance/v1.0/message/comment/items")
    Observable<ResponseModel<List<MessageCommentModel>>> getMsgComments();

    //信息界面关注列表
    @GET("mock/7451/byte/dance/v1.0/message/focus/items")
    Observable<ResponseModel<List<MsgFocusModel>>> getMsgFocus();

    //搜索界面热搜榜列表
    @GET("mock/7451/byte/dance/v1.0/search/hot/items")
    Observable<ResponseModel<List<SearchHotModel>>> getSearchHot();

    //搜索界面同城榜列表
    @GET("mock/7451/byte/dance/v1.0/search/city/items")
    Observable<ResponseModel<List<SearchCityModel>>> getSearchCity();

    //搜索界面好友榜列表
    @GET("mock/7451/byte/dance/v1.0/search/friend/items")
    Observable<ResponseModel<List<SearchFriendModel>>> getSearchFriend();

}
