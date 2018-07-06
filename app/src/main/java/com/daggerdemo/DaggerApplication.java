package com.daggerdemo;

import android.app.Activity;
import android.app.Application;

import com.daggerdemo.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

//Step 2: Implements HasActivityInjector
public class DaggerApplication extends Application implements HasActivityInjector {

    //Step 2: Instance of AndroidInjector
    @Inject
    DispatchingAndroidInjector<Activity> androidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        //Step2: Call the inject function after you build the project.
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    //Step 2: Provide implementation for HasActivityInjector
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}
