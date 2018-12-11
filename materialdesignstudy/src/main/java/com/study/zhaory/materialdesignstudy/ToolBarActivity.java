package com.study.zhaory.materialdesignstudy;

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
        setSupportActionBar(mToolBar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_launcher);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.backup:{
                Toast.makeText(this,"backup",Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.delete:{
                Toast.makeText(this,"delete",Toast.LENGTH_SHORT).show();
            }
            break;
            case R.id.settings:{
                Toast.makeText(this,"settings",Toast.LENGTH_SHORT).show();
            }
            break;
        }
        return true;
    }
}
