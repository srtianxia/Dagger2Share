package com.srtianxia.dagger2share.architecture.di.module;

import android.app.Activity;
import com.srtianxia.dagger2share.architecture.annotation.PerActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by srtianxia on 2016/10/27.
 */
@Module
public class ActivityModule {
    private Activity mActivity;


    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @PerActivity @Provides Activity provideActivity() {
        return mActivity;
    }


}
