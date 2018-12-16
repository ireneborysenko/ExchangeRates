package com.borysenko.exchangerates.dagger;

import com.borysenko.exchangerates.ui.MainScreen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Android Studio.
 * User: Iryna
 * Date: 16/12/18
 * Time: 14:49
 */
@Module
public class MainScreenModule {
    private final MainScreen.View mView;

    public MainScreenModule(MainScreen.View mView) {
        this.mView = mView;
    }

    @Provides
    MainScreen.View providesMainScreenView() {
        return mView;
    }
}