package com.dingtao.exceptionhandlerdemo;

import android.app.Application;
import android.content.Context;

/**
 * @author dingtao
 * @date 2018/12/5 15:36
 * qq:1940870847
 */
public class EHApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
