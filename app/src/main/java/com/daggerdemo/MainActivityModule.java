package com.daggerdemo;

import dagger.Module;
import dagger.Provides;

//Step 3: Create MainActivityModule

/**
 * Class to provide objects to MainActivity class.
 */
@Module
public class MainActivityModule {

    @Provides
    MainContract.View provideView(MainActivity view) {
        return view;
    }

    @Provides
    DummyData providesDummyData() {
        return new DummyData();
    }

    @Provides
    MainContract.Presenter providePresenter(MainContract.View view, DummyData data) {
        return new MainPresenterImp(view, data);
    }
}
