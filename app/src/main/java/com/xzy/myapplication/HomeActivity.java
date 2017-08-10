package com.xzy.myapplication;

import android.os.Bundle;

import com.xzy.myapplication.base.BaseActivity;

public class HomeActivity extends BaseActivity {

    @Override
    protected void initData() {
        //TODO
    }

    @Override
    protected void initView() {
        setSupportActionBar();
        setActionBarIcon(R.drawable.ic_drawer_home);
        setTitle("首页");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }
}
