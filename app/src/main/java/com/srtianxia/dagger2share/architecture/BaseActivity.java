package com.srtianxia.dagger2share.architecture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.srtianxia.dagger2share.architecture.di.component.AppComponent;

/**
 * Created by srtianxia on 2016/10/27.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        ButterKnife.bind(this);
    }


    public abstract int getLayoutRes();

    protected AppComponent getApplicationComponent() {
        return ((App) getApplication()).getAppComponent();
    }
}
