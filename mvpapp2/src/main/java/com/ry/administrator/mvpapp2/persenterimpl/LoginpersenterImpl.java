package com.ry.administrator.mvpapp2.persenterimpl;

import com.ry.administrator.mvpapp2.bean.LoginBean;
import com.ry.administrator.mvpapp2.contract.DailyContract;
import com.ry.administrator.mvpapp2.contract.LoginContract;
import com.ry.administrator.mvpapp2.mvp.BasePresenter;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

import java.util.HashMap;

public class LoginpersenterImpl extends LoginContract.LoginPresenter {
    @Override
    public void loadData(String url, HashMap map) {
        final LoginContract.LoginView loginView = getView();
        if (loginView == null) return;
        loginView.showLoading();
        mModel.login(url, map, new MvpListener<LoginBean>() {
            @Override
            public void onSuccess(LoginBean result) {
                loginView.hideLoading();
                loginView.saveData(result);
                loginView.jump();
            }

            @Override
            public void onError(String errorMsg) {
                loginView.hideLoading();
                loginView.showError();
            }
        });
    }
}
