package com.srtianxia.dagger2share;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;

/**
 * Created by srtianxia on 2016/10/24.
 * 模拟ButterKnife的绑定过程
 * apt只能自动生成，调用还是要手动，一般都是通过反射生成实例，因为默认生成的类不在原包中
 */

public class Activity_ViewBinding<T extends MainActivity> {

    public Activity_ViewBinding(T target) {
        target.toolbar = (Toolbar) target.getWindow().getDecorView().findViewById(R.id.toolbar);
        target.fab = (FloatingActionButton) target.getWindow()
            .getDecorView()
            .findViewById(R.id.fab);
    }
}
