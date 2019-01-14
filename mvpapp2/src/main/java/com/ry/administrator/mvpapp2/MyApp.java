package com.ry.administrator.mvpapp2;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.ry.administrator.mvpapp2.http.RequestManager;

public class MyApp extends Application {
    private static MyApp instance;

    public static MyApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RequestManager.getInstance().init(this);
    }
}
