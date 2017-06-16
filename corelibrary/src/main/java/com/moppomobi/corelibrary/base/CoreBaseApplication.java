package com.moppomobi.corelibrary.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.moppomobi.corelibrary.utils.CrashUtils;
import com.moppomobi.corelibrary.utils.SPUtils;
import com.moppomobi.corelibrary.utils.Utils;

/**
 * ****************************************************
 * 项目名：LopScoop
 * 创建时间：2017/6/16
 * 创建人：刘蒙
 * 功能：
 * *****************************************************
 */

public abstract class CoreBaseApplication extends Application {
    private static CoreBaseApplication app;

    public static Context getAppContext() {
        return app;
    }

    public static Resources getAppResources() {
        return app.getResources();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;
        SPUtils.init(this);
        Utils.init(this);
        CrashUtils.getInstance().init();
    }
}
