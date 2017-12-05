package com.hzh.lazy.fragment.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hzh.lazy.fragment.ExtendLazyFragment;
import com.hzh.lazy.fragment.sample.MainActivity;
import com.hzh.lazy.fragment.sample.R;
import com.hzh.logger.L;

/**
 * Package: com.hzh.lazy.fragment.sample.fragment
 * FileName: HomeFragment
 * Date: on 2017/11/24  上午11:11
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class HomeFragment extends ExtendLazyFragment {
    private String position;
    private TextView tip;

    @Override
    public View onInflaterRootView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    protected void onLazyViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        position = arguments.getString(MainActivity.KEY_BUNDLE_POSITION);
    }

    @Override
    public void onFindViews(View mRootView) {
        tip = (TextView) mRootView.findViewById(R.id.tip);
    }

    @Override
    public void onBindContent() {
        tip.setText("HomeFragment position" + position);
    }

    @Override
    protected void onFragmentVisible() {
        super.onFragmentVisible();
        L.d("Home onFragmentVisible...");
    }

    @Override
    protected void onFragmentInvisible() {
        super.onFragmentInvisible();
        L.d("Home onFragmentInvisible");
    }
}
