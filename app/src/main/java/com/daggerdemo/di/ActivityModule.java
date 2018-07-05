package com.daggerdemo.di;

import com.daggerdemo.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Provides activities to inject dependencies into
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity buildMainActivity();
}
