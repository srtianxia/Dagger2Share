package com.srtianxia.dagger2share.architecture.di.module;

import android.content.Context;
import com.srtianxia.dagger2share.architecture.App;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by srtianxia on 2016/10/27.
 */
@Module
public class AppModule {
    private App mApp;
    public AppModule(App app) {
        this.mApp = app;
    }

    @Provides @Singleton Context provideApplicationContext() {
        return mApp.getApplicationContext();
    }
}
