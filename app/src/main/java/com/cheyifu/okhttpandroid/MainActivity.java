package com.cheyifu.okhttpandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cheyifu.okhttpandroid.bean.BaseBean;
import com.cheyifu.okhttpandroid.net.BaseHttpCallbackAdapter;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //访问网络用法
        HashMap<String,String> map=new HashMap<>();
        map.put("token", "");
        MainApi.getmDefult().login(map, new BaseHttpCallbackAdapter<BaseBean>() {
            @Override
            public void completed(BaseBean response) {

            }

            @Override
            public void failure(Throwable throwable) {

            }
        });

    }
}
