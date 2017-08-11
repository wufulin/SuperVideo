package com.xzy.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{

    private List<View> mViewList;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initView();
        initViewPager();
    }

    private void initViewPager() {
        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        MyPagerAdapter adapter = new MyPagerAdapter(mViewList, this);
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(this);
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(this);
        mViewList = new ArrayList<>();
        mViewList.add(inflater.inflate(R.layout.guide_one_layout, null));
        mViewList.add(inflater.inflate(R.layout.guide_two_layout, null));
        mViewList.add(inflater.inflate(R.layout.guide_three_layout, null));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    class MyPagerAdapter extends PagerAdapter {

        private List<View> mImageViewList;
        private Context mContext;

        public MyPagerAdapter(List<View> list, Context context) {
            super();
            mImageViewList = list;
            mContext = context;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            if(mImageViewList != null && mImageViewList.size() >= 0) {
                View view = mImageViewList.get(position);
                container.addView(view);
                return view;
            }
            return null;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            if(mImageViewList != null && mImageViewList.size() >= 0){
                container.removeView(mImageViewList.get(position));
            }
        }

        @Override
        public int getCount() {
            if(mImageViewList != null) {
                return mImageViewList.size();
            }
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
