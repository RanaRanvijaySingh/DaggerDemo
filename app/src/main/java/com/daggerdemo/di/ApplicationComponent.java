package com.daggerdemo.di;

import com.daggerdemo.DaggerApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * A dagger component whose lifetime is the life of the application.
 * <p>
 * Created by bharat.dodeja on 06/12/17.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityModule.class})
public interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(DaggerApplication application);

        ApplicationComponent build();
    }

    void inject(DaggerApplication application);
}
