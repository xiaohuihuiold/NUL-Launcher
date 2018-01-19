package com.xhh.launcher.custom.app;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;
import com.xhh.launcher.custom.handler.CrashHandler;

import java.util.Map;

/**
 * Created by nameh on 2018/1/17 0017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());

        CrashReport.initCrashReport(getApplicationContext(), "33d4a58eb9", true);
    }
}
