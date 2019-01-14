package com.ry.administrator.mvpapp2.view.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ry.administrator.mvpapp2.R;
import com.ry.administrator.mvpapp2.bean.LoginBean;
import com.ry.administrator.mvpapp2.constant.Api;
import com.ry.administrator.mvpapp2.contract.LoginContract;
import com.ry.administrator.mvpapp2.modelimpl.LoginModelImpl;
import com.ry.administrator.mvpapp2.mvp.BaseMvpActivity;
import com.ry.administrator.mvpapp2.persenterimpl.LoginpersenterImpl;

import java.util.HashMap;

public class LoginActivity extends BaseMvpActivity<LoginpersenterImpl, LoginModelImpl>
        implements LoginContract.LoginView, View.OnClickListener {

    private Button loginBtn;
    private EditText phoneEt;
    private EditText pwEt;

    @Override
    public void jump() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void saveData(LoginBean bean) {

    }

    @Override
    protected void loadData() {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        loginBtn = findViewById(R.id.login_btn);
        phoneEt = findViewById(R.id.phone_et);
        pwEt = findViewById(R.id.pw_et);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        HashMap<String, String> map = new HashMap<>();
        map.put("pw", pwEt.getText().toString());
        map.put("phone", phoneEt.getText().toString());
        map.put("v", "Android:3.2.1");
        mPresenter.loadData(Api.Login, map);
    }
}
