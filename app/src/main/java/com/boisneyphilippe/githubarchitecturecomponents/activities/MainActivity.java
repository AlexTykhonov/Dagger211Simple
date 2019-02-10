package com.boisneyphilippe.githubarchitecturecomponents.activities;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.boisneyphilippe.githubarchitecturecomponents.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity {
    // используем имя с Гитхаба
    private static String USER_LOGIN = "JakeWharton";
    @Inject
    SharedPreferences sharedPreferences;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// конфигурируем Даггер через вызов АндроидИнджекшен метода инджект на текущую активити
        this.configureDagger();
        System.out.println(sharedPreferences);
    }



    private void configureDagger(){
        AndroidInjection.inject(this);
    }
}
