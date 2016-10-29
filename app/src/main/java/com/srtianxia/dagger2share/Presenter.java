package com.srtianxia.dagger2share;

import javax.inject.Inject;

/**
 * Created by srtianxia on 2016/10/24.
 */

public class Presenter {
    private IView mView;

    //@Inject
    public Presenter(IView mView) {
        this.mView = mView;
    }

    public void function () {
        Logger.log("function  ------------> ");
    }


    public interface IView {

    }
}
