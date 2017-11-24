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

/**
 * Package: com.hzh.lazy.fragment.sample.fragment
 * FileName: ShoppingCartFragment
 * Date: on 2017/11/24  上午11:48
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class ShoppingCartFragment extends ExtendLazyFragment {
    private String position;

    @Override
    protected View onLazyCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shopping_cart, container, false);
    }

    @Override
    protected void onLazyViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        position = arguments.getString(MainActivity.KEY_BUNDLE_POSITION);
    }

    @Override
    public void onFindViews(View mRootView) {
        TextView tip = mRootView.findViewById(R.id.tip);
        tip.setText("ShoppingCartFragment position" + position);
    }

    @Override
    protected void onFragmentVisible() {
        super.onFragmentVisible();
    }

    @Override
    protected void onFragmentInvisible() {
        super.onFragmentInvisible();
    }
}
