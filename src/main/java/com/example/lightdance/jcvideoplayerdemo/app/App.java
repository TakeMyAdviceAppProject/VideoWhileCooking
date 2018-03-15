package com.example.lightdance.jcvideoplayerdemo.app;

import android.app.Application;

/**
 * 自定义的App类，用于进行全局初始化工作，如保存一些全局的和一些上下文都要用到的变量和方法之类
 * @author LightDance
 * @date 2018/2/6.
 */

public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance(){
        return instance;
    }

}
