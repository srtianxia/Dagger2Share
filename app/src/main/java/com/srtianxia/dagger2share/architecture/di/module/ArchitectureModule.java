package com.srtianxia.dagger2share.architecture.di.module;

import com.srtianxia.dagger2share.architecture.annotation.PerActivity;
import com.srtianxia.dagger2share.architecture.entity.DataEntity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by srtianxia on 2016/10/27.
 */
@Module
public class ArchitectureModule {
    @PerActivity @Provides DataEntity provideData() {
        return new DataEntity("data ------------ >  ");
    }
}
