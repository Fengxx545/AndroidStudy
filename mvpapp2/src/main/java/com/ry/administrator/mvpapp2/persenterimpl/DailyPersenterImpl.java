package com.ry.administrator.mvpapp2.persenterimpl;

import com.ry.administrator.mvpapp2.bean.NewsBean;
import com.ry.administrator.mvpapp2.contract.DailyContract;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

public class DailyPersenterImpl extends DailyContract.DailyPersenter {
    @Override
    public void loadData(String url) {
        final DailyContract.DailyView dailyView = getView();
        if (dailyView == null) return;
        dailyView.showLoading();
        mModel.loadDailyData(url, new MvpListener<NewsBean>() {
            @Override
            public void onSuccess(NewsBean result) {
                dailyView.hideLoading();
                dailyView.setData(result);
            }

            @Override
            public void onError(String errorMsg) {
                dailyView.hideLoading();
                dailyView.showError();
            }
        });
    }
}
