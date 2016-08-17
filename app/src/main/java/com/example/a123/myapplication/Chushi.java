package com.example.a123.myapplication;

import android.app.Application;

import org.xutils.x;

/**
 * Created by 123 on 2016/8/16.
 */
public class Chushi extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
