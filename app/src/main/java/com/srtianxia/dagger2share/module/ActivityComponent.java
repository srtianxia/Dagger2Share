package com.srtianxia.dagger2share.module;

import com.srtianxia.dagger2share.MainActivity;
import dagger.Component;

/**
 * Created by srtianxia on 2016/10/26.
 */
@Component(modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
