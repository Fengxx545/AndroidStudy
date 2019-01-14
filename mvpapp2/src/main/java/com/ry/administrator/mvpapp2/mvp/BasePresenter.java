package com.ry.administrator.mvpapp2.mvp;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<M, V> {

    protected M mModel;
    protected WeakReference<V> mView;

    protected void onAttach(M model, V view) {
        mModel = model;
        mView = new WeakReference<V>(view);
    }

    protected V getView() {
        return isViewAttached() ? mView.get() : null;
    }

    protected boolean isViewAttached() {
        return null != mView && null != mView.get();
    }

    protected void onDetach() {
        if (null != mView) {
            mView.clear();
            mView = null;
        }
    }

}
