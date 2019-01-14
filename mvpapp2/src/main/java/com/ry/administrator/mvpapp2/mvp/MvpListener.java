package com.ry.administrator.mvpapp2.mvp;

public interface MvpListener<T> {
    void onSuccess(T result);
    void onError(String errorMsg);
}
