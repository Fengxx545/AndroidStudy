package com.study.zhaory.androidstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private boolean isInflate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewStub viewStub = findViewById(R.id.view_stub);
        View include = findViewById(R.id.include);
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                isInflate = true;
            }
        });
        include.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isInflate) {//如果没有填充则执行inflate操作
//                    View view = viewStub.inflate();
                    viewStub.inflate();
                    //ViewStub调用inflate()方法后,ViewStub被替换为以inflateId为Id的视图。网络上很多博客都提到了这句话，但在代码示例中并没有如下这句。实际运行中导致使用text时报空指针错误。
                    View view = findViewById(R.id.viewstub_column_inflated);
                    //初始化ViewStub的layout里面的控件
                    TextView mTv = view.findViewById(R.id.title_stub);
                    mTv.setOnClickListener(this);
                    Toast.makeText(MainActivity.this,"第一次添加",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"已经添加过了",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
