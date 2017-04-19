package com.cheyifu.okhttpandroid.net;



import com.cheyifu.okhttpandroid.bean.BaseBean;
import com.cheyifu.okhttpandroid.global.Constants;
import com.cheyifu.okhttpandroid.bean.LoginBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/2/20.
 */
public interface APIService {

    /**
     * 登录
     * @param map
     * @return
     */
    @Headers("Cache-Control: public, max-age=3600")
    @FormUrlEncoded
    @POST(Constants.LONGING)//访问的地址
    Call<BaseBean> login(@FieldMap Map<String, String> map);



}
