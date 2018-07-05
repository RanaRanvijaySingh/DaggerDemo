package com.daggerdemo;

public interface MainContract {
    interface View {

        void setUserName(String name);
    }

    interface Presenter {

        void presentUserName();
    }
}
