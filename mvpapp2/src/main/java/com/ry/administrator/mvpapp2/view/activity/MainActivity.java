package com.ry.administrator.mvpapp2.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.ry.administrator.mvpapp2.R;
import com.ry.administrator.mvpapp2.adpter.DailyAdapter;
import com.ry.administrator.mvpapp2.bean.NewsBean;
import com.ry.administrator.mvpapp2.constant.Api;
import com.ry.administrator.mvpapp2.contract.DailyContract;
import com.ry.administrator.mvpapp2.modelimpl.DailyModelImpl;
import com.ry.administrator.mvpapp2.mvp.BaseMvpActivity;
import com.ry.administrator.mvpapp2.persenterimpl.DailyPersenterImpl;

import java.util.List;


public class MainActivity extends BaseMvpActivity<DailyPersenterImpl, DailyModelImpl>
        implements DailyContract.DailyView {

    private RecyclerView mRv;
    private DailyAdapter mAdapter;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mRv = findViewById(R.id.rv);
        mAdapter = new DailyAdapter(this);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setHasFixedSize(true);
        mRv.setAdapter(mAdapter);

    }

    @Override
    protected void loadData() {
        mPresenter.loadData(Api.Daily_history + "20181122");
    }

    @Override
    public void setData(NewsBean newsBean) {
        List<NewsBean.StoriesBean> list = newsBean.getStories();
        mAdapter.setBeanList(list);
    }
}
