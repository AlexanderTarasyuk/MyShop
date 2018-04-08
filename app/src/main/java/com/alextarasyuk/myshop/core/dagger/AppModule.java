package com.alextarasyuk.myshop.core.dagger;

import android.content.Context;

import com.alextarasyuk.myshop.core.ProntoShopApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alex on 4/08/2018.
 */
@Module
public class AppModule {
    private final ProntoShopApplication app;

    public AppModule(ProntoShopApplication app) {
        this.app = app;
    }

    @Provides @Singleton
    public ProntoShopApplication getApp() {
        return app;
    }

    @Provides @Singleton
    public Context provideContext() {
        return app;
    }
}
