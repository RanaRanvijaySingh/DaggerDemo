package com.daggerdemo.di;


import com.daggerdemo.DaggerApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

//Step 2: Create interface AppComponent

/**
 * This interface is implemented by Dagger when you build the project.
 * The name of the class with be with "Dagger" prefix and the "InterfaceName".
 * eg. for this interface generated class will be: "DaggerAppComponent"
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        //Step 3: Add activity builder
        ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(DaggerApplication application);

        AppComponent build();
    }

    void inject(DaggerApplication application);
}
