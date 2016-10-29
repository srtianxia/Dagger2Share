package com.srtianxia.dagger2share.architecture.di.component;

import android.app.Activity;
import com.srtianxia.dagger2share.architecture.annotation.PerActivity;
import com.srtianxia.dagger2share.architecture.di.module.ActivityModule;
import com.srtianxia.dagger2share.architecture.di.module.ArchitectureModule;
import dagger.Component;

/**
 * Created by srtianxia on 2016/10/27.
 */
@PerActivity
@Component(dependencies = { AppComponent.class }, modules = { ActivityModule.class, ArchitectureModule.class })
public interface ActivityComponent {
    Activity activity();
}
