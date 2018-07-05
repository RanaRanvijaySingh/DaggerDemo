package com.daggerdemo;

public class MainPresenterImp implements MainContract.Presenter {
    private final MainContract.View mView;
    private final DummyData mData;

    public MainPresenterImp(MainContract.View view, DummyData data) {
        mView = view;
        mData = data;
    }

    @Override
    public void presentUserName() {
        String name = mData.getUserName();
        mView.setUserName(name);
    }
}
