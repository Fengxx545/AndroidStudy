package com.study.zhaory.materialdesignstudy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ZhaoRY on 2018/12/11.
 */

public class ToolBarActivity extends AppCompatActivity {


    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_test);

        initView();

    }

    private void initView() {
        mToolBar = findViewById(R.id.toolbar);
        // 该属性必须在setSupportActionBar之前 调用


// App Logo
        mToolBar.setLogo(R.mipmap.ic_launcher_round);
// Title
        mToolBar.setTitle("My Title");
// Sub Title
        mToolBar.setSubtitle("Sub title");

        setSupportActionBar(mToolBar);

        // Navigation Icon 要設定在 setSupoortActionBar 才有作用
        // 否則會出現 back button
//        mToolBar.setNavigationIcon(R.mipmap.ic_launcher);
        //设置上之后可以在label左边加上一个图像icon
        mToolBar.setTitleTextColor(getResources().getColor(android.R.color.holo_red_dark));
        //可以单独设置title的文本的颜色


        //显示返回按钮
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);//左侧添加一个默认的返回图标
            actionBar.setHomeButtonEnabled(true); //设置返回键可用
        }
    }


    /**
     * 创建menu布局
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    /**
     * toolbar menu 的点击事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case android.R.id.home:{
                Toast.makeText(this, "返回按钮", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.backup: {
                Toast.makeText(this, "backup", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.delete: {
                startActivity(new Intent(this,SettingsActivity.class));
                Toast.makeText(this, "delete", Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.settings: {
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,TabedActivity.class));
            }
            break;
        }
        return true;
    }
}
