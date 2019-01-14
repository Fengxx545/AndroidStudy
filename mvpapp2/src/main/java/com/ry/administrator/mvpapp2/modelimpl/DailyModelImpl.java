package com.ry.administrator.mvpapp2.modelimpl;

import com.ry.administrator.mvpapp2.bean.NewsBean;
import com.ry.administrator.mvpapp2.contract.DailyContract;
import com.ry.administrator.mvpapp2.http.NetListener;
import com.ry.administrator.mvpapp2.http.RequestManager;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

public class DailyModelImpl implements DailyContract.DailyModel {
    @Override
    public void loadDailyData(String url, final MvpListener<NewsBean> listener) {
        RequestManager.getInstance().sendGet(url, NewsBean.class, new NetListener<NewsBean>() {
            @Override
            public void onSuccess(NewsBean result) {
                listener.onSuccess(result);
            }

            @Override
            public void onError(String msg) {
                listener.onError(msg);
            }
        });
    }
}
