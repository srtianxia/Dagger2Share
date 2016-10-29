package com.srtianxia.dagger2share;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.srtianxia.dagger2share.architecture.view.ArchitectureDemoActivity;
import com.srtianxia.dagger2share.module.ActivityModule;
import com.srtianxia.dagger2share.module.DaggerActivityComponent;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements Presenter.IView{

    //@Inject
    //EasyClass mEasyClass;
    Toolbar toolbar;
    FloatingActionButton fab;


    @Inject
    Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);
        new Activity_ViewBinding(this);
        setSupportActionBar(toolbar);
        DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build().inject(this);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mEasyClass.log();
                //mEasyClass.logDepended();
                mPresenter.function();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void intent(View v) {
        startActivity(new Intent(this, ArchitectureDemoActivity.class));
    }
}
