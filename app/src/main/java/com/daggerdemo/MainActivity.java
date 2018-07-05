package com.daggerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private TextView mTextViewName;
    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewName = findViewById(R.id.textViewName);
        mPresenter = new MainPresenterImp(this, new DummyData());
        mPresenter.presentUserName();
    }

    @Override
    public void setUserName(String name) {
        mTextViewName.setText(name);
    }
}
