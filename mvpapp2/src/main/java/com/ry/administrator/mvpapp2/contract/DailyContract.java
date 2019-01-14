package com.ry.administrator.mvpapp2.contract;

import com.ry.administrator.mvpapp2.bean.NewsBean;
import com.ry.administrator.mvpapp2.mvp.BaseModel;
import com.ry.administrator.mvpapp2.mvp.BasePresenter;
import com.ry.administrator.mvpapp2.mvp.BaseView;
import com.ry.administrator.mvpapp2.mvp.MvpListener;

public interface DailyContract {

    interface DailyModel extends BaseModel{
        void loadDailyData(String url, MvpListener<NewsBean> listener);
    }

    interface DailyView extends BaseView{
        void setData(NewsBean newsBean);
    }

    abstract class DailyPersenter extends BasePresenter<DailyModel,DailyView>{
        protected abstract void loadData(String url);
    }


}
