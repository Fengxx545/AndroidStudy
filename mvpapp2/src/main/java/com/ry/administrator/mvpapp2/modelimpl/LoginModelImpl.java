package com.ry.administrator.mvpapp2.modelimpl;

import com.ry.administrator.mvpapp2.bean.LoginBean;
import com.ry.administrator.mvpapp2.contract.LoginContract;
import com.ry.administrator.mvpapp2.http.NetListener;
import com.ry.administrator.mvpapp2.http.RequestManager;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

import java.util.HashMap;

public class LoginModelImpl implements LoginContract.LoginModel {
    @Override
    public void login(String url, HashMap map, final MvpListener<LoginBean> listener) {
        RequestManager.getInstance().sendPost(url, LoginBean.class, map, new NetListener<LoginBean>() {
            @Override
            public void onSuccess(LoginBean result) {
                listener.onSuccess(result);
                saveData();
            }

            @Override
            public void onError(String msg) {
                listener.onError(msg);
            }
        });
    }

    private void saveData() {

    }
}
