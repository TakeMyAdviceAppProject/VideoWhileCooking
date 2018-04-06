package com.example.lightdance.jcvideoplayerdemo.page.howtocook;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lightdance.jcvideoplayerdemo.R;

public class CookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);
        CookPresenter presenter = new CookPresenter(new CookFragment());
        CookFragment fragment = (CookFragment) presenter.getView();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.container_cook , fragment);
        transaction.commit();
    }
}
