package com.srtianxia.dagger2share.module;

import com.srtianxia.dagger2share.Presenter;
import dagger.Module;
import dagger.Provides;

/**
 * Created by srtianxia on 2016/10/24.
 */
@Module
public class ActivityModule {

    Presenter.IView mView;


    public ActivityModule(Presenter.IView mView) {
        this.mView = mView;
    }
    //
    //@Provides
    //Presenter.IView provideView() {
    //    return mView;
    //}

    @Provides
    Presenter providePresenter() {
        return new Presenter(mView);
    }
}
