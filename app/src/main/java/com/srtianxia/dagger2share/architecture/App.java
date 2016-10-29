package com.srtianxia.dagger2share.architecture;

import android.app.Application;
import com.srtianxia.dagger2share.architecture.di.component.AppComponent;
import com.srtianxia.dagger2share.architecture.di.component.DaggerAppComponent;
import com.srtianxia.dagger2share.architecture.di.module.AppModule;

/**
 * Created by srtianxia on 2016/10/27.
 */

public class App extends Application {
    private AppComponent mAppComponent;


    @Override public void onCreate() {
        super.onCreate();
        initDagger2Inject();
    }


    private void initDagger2Inject() {
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
