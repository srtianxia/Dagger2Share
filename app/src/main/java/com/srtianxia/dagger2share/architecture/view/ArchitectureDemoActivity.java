package com.srtianxia.dagger2share.architecture.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import com.srtianxia.dagger2share.R;
import com.srtianxia.dagger2share.architecture.BaseActivity;
import com.srtianxia.dagger2share.architecture.di.component.ArchitectureActivityComponent;
import com.srtianxia.dagger2share.architecture.di.component.DaggerArchitectureActivityComponent;
import com.srtianxia.dagger2share.architecture.di.module.ActivityModule;

/**
 * Created by srtianxia on 2016/10/27.
 */

public class ArchitectureDemoActivity extends BaseActivity {

    @BindView(R.id.tv_info) TextView tvInfo;
    @BindView(R.id.btn_load_info) Button btnLoadInfo;

    private ArchitectureActivityComponent mComponent;

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mComponent = DaggerArchitectureActivityComponent.builder()
            .appComponent(getApplicationComponent())
            .activityModule(new ActivityModule(this))
            .build();
    }


    @Override public int getLayoutRes() {
        return R.layout.activity_architecture;
    }



    public ArchitectureActivityComponent getArchitectureActivityComponent() {
        return mComponent;
    }

    public void changeText(View v) {

    }
}