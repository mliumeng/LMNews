package com.moppomobi.lopscoop.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.moppomobi.corelibrary.base.CoreBaseActivity;

/**
 * ****************************************************
 * 项目名：LopScoop
 * 创建时间：2017/6/15
 * 创建人：刘蒙
 * 功能：
 * *****************************************************
 */

abstract class BaseActivity extends CoreBaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutRes());
        initData();
        initView();
        initEvent();
    }

    protected abstract int setLayoutRes();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initEvent();


}
