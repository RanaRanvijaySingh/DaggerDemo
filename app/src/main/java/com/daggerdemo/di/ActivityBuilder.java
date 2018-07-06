package com.daggerdemo.di;

import com.daggerdemo.MainActivity;
import com.daggerdemo.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//Step 3: Create ActivityBuilder
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity buildMainActivity();
}
