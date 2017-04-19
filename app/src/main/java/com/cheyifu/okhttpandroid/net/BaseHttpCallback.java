package com.cheyifu.okhttpandroid.net;

public interface BaseHttpCallback<T> {

    void onCompleted(T response, int httpCode, String httpMessage);

    void onFailure(Throwable throwable);
}
