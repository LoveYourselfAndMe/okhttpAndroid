package com.cheyifu.okhttpandroid.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;


public class BaseApplication extends Application {
    private static Context context;
    private static Handler handler;
    public static BaseApplication myApplication;

    public static BaseApplication getInstance() {
        if (myApplication == null) {
            myApplication = new BaseApplication();
        }
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        handler = new Handler();


    }


    public static Context getContext() {
        return context;
    }

    /**
     * 获取handler
     *
     * @return
     */
    public static Handler getMainHandler() {
        return handler;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        MultiDex.install(this);
    }
//    /**
//     * 当前是否是Debug模式
//     *
//     * @return
//     */
//    public static  boolean isDebug() {
////        return BuildConfig.DEVELOPER_MODE;
//        return true;
//    }
}
