package com.xzy.myapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.xzy.myapplication.R;

/**
 * Created by wufulin on 10/8/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutId();

    protected <T extends View> T bindViewId(int resId) {
        return (T)findViewById(resId);
    }

    protected void setSupportActionBar() {
        mToolBar = bindViewId(R.id.toolbar);
        if(mToolBar != null) {
            setSupportActionBar(mToolBar);
        }
    }

    protected void setActionBarIcon(int resId) {
        if(mToolBar != null) {
            mToolBar.setNavigationIcon(resId);
        }
    }
}
