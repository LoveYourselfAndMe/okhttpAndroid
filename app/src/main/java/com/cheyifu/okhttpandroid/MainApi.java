package com.cheyifu.okhttpandroid;


import com.cheyifu.okhttpandroid.bean.BaseBean;
import com.cheyifu.okhttpandroid.net.BaseHttpCallbackAdapter;
import com.cheyifu.okhttpandroid.net.BuildBaseApi;
import com.cheyifu.okhttpandroid.net.RequestExecutor;

import java.util.Map;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/3/13.
 */
public class MainApi {
    public static MainApi mDefult;
    public static MainApi getmDefult(){
        if (null==mDefult) {
            mDefult=new MainApi();

        }
        return mDefult;
    }
    //loging
    public RequestExecutor<BaseBean> login(Map<String,String> map , final BaseHttpCallbackAdapter<BaseBean> callback){
        Call<BaseBean> authCode = BuildBaseApi.getAPIService().login(map);
        return new RequestExecutor<BaseBean>(authCode,callback).call();
    }
}
