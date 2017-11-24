package com.hzh.lazy.fragment.inter;

import android.view.View;

/**
 * Package: com.hzh.lazy.fragment.inter
 * FileName: FragmentCallback
 * Date: on 2017/11/24  上午11:05
 * Auther: zihe
 * Descirbe: Fragment相关操作
 * Email: hezihao@linghit.com
 */

public interface FragmentOperationCallback {
    /**
     * 查找View的操作
     *
     * @param mRootView Fragment的View视图
     */
    void onFindViews(View mRootView);
}
