package com.ry.administrator.mvpapp2.util;

import android.widget.Toast;

import com.ry.administrator.mvpapp2.MyApp;

public class ToastUtil {
    private static Toast toast;
    public static void showToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(MyApp.getInstance(), text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }
}
