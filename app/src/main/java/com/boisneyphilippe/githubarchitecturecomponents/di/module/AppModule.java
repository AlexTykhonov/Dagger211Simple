package com.boisneyphilippe.githubarchitecturecomponents.di.module;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Philippe on 02/03/2018.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    public Context providesContext(Application application){
        return application;

    }

    @Provides
    @Singleton
    public SharedPreferences providesSharedPreferences(Context context)
    { return PreferenceManager.getDefaultSharedPreferences(context);

    }
}
