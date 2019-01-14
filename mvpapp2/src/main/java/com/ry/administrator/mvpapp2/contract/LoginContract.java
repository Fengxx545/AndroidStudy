package com.ry.administrator.mvpapp2.contract;

import com.ry.administrator.mvpapp2.bean.LoginBean;
import com.ry.administrator.mvpapp2.mvp.BaseModel;
import com.ry.administrator.mvpapp2.mvp.BasePresenter;
import com.ry.administrator.mvpapp2.mvp.BaseView;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

import java.util.HashMap;

public interface LoginContract {
    interface LoginModel extends BaseModel {
        void login(String url, HashMap map, MvpListener<LoginBean> listener);
    }

    interface LoginView extends BaseView {
        void jump();

        void saveData(LoginBean bean);
    }

    abstract class LoginPresenter extends BasePresenter<LoginModel, LoginView> {
        public abstract void loadData(String url, HashMap map);
    }

}
