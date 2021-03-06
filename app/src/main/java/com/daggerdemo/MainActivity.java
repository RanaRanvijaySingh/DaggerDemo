package com.daggerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView mTextViewName;
    //Step 3: Inject presenter
    @Inject
    MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewName = findViewById(R.id.textViewName);
        mPresenter.presentUserName();
    }

    @Override
    public void setUserName(String name) {
        mTextViewName.setText(name);
    }
}
