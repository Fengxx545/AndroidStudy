package com.ry.administrator.mvpapp2.http;

public interface NetListener<T> {
    void onSuccess(T result);

    void onError(String msg);

}
