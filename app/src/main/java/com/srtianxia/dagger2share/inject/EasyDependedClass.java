package com.srtianxia.dagger2share.inject;

import com.srtianxia.dagger2share.Logger;
import javax.inject.Inject;

/**
 * Created by srtianxia on 2016/10/24.
 */

public class EasyDependedClass {

    //@Inject
    public EasyDependedClass() {
    }


    public void log() {
        Logger.log("EasyDependedClass log");
    }
}
