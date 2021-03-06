package com.ry.administrator.mvpapp2.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ry.administrator.mvpapp2.util.ReflectUtil;

public abstract class BaseMvpActivity
        <T extends BasePresenter, M extends BaseModel>
        extends BaseActiity {
    protected T mPresenter;
    protected M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = ReflectUtil.getT(this,0);
        mModel = ReflectUtil.getT(this,1);
        mPresenter.onAttach(mModel,this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadData();
    }

    protected abstract void loadData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }
}
