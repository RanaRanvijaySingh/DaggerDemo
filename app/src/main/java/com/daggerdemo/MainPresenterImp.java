package com.daggerdemo;

public class MainPresenterImp implements MainContract.Presenter {
    private final MainContract.View mView;
    private final DummyData data;

    public MainPresenterImp(MainContract.View view, DummyData data) {
        mView = view;
        this.data = data;
    }

    @Override
    public void presentUserName() {
        String name = data.getUserName();
        mView.setUserName(name);
    }
}
