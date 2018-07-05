package com.daggerdemo.di;


import com.daggerdemo.DaggerApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = AndroidInjectionModule.class)
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(DaggerApplication application);

        AppComponent build();
    }

    void inject(DaggerApplication application);
}
