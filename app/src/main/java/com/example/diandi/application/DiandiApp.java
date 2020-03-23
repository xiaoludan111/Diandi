package com.example.diandi.application;

import android.app.Application;

import com.hjq.toast.ToastUtils;

public class DiandiApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.init(this);
    }
}
