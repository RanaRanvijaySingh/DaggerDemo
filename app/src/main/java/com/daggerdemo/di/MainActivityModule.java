package com.daggerdemo.di;

import com.daggerdemo.DummyData;
import com.daggerdemo.MainActivity;
import com.daggerdemo.MainContract;
import com.daggerdemo.MainPresenterImp;

import dagger.Module;
import dagger.Provides;

/**
 * Provides dependencies for MainActivity
 */
@Module
public class MainActivityModule {

    @Provides
    MainContract.View provideView(MainActivity view) {
        return view;
    }

    @Provides
    DummyData provideDummyData() {
        return new DummyData();
    }

    @Provides
    MainContract.Presenter provideMainPresenter(MainContract.View view, DummyData data) {
        return new MainPresenterImp(view, data);
    }
}
