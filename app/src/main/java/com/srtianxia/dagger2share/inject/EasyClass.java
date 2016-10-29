package com.srtianxia.dagger2share.inject;

import com.srtianxia.dagger2share.Logger;
import javax.inject.Inject;

/**
 * Created by srtianxia on 2016/10/24.
 */

public class EasyClass {
    //@Inject
    EasyDependedClass dependedClass;

    //@Inject
    public EasyClass() {

    }

    public void log() {
        Logger.log("inject success");
    }

    public void logDepended() {
        dependedClass.log();
    }
}
