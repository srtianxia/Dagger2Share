package com.srtianxia.dagger2share.architecture.di.component;

import android.content.Context;
import com.srtianxia.dagger2share.architecture.di.module.AppModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by srtianxia on 2016/10/27.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context context();
}
