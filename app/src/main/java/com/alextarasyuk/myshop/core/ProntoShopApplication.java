package com.alextarasyuk.myshop.core;

import android.app.Application;
import android.content.SharedPreferences;

import com.alextarasyuk.myshop.core.dagger.AppComponent;
import com.alextarasyuk.myshop.core.dagger.AppModule;
import com.alextarasyuk.myshop.core.dagger.DaggerAppComponent;
import com.squareup.otto.Bus;

/**
 * Created by Alex on 4/08/2018.
 */
public class ProntoShopApplication extends Application {
    private Bus bus;
    public Bus getBus()
    {
        return bus;
    }


    private SharedPreferences sharedPreferences;

    private static ProntoShopApplication instance = new ProntoShopApplication();
    private static AppComponent appComponent;

    public static ProntoShopApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance.bus = new Bus();
        getAppComponent();
    }

    public AppComponent getAppComponent() {
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }












}
