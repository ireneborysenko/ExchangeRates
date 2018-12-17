package com.borysenko.exchangerates.ui;


import com.borysenko.exchangerates.model.ExchangeRates;

/**
 * Created by Android Studio.
 * User: Iryna
 * Date: 16/12/18
 * Time: 14:51
 */
public interface MainScreen {
    interface View {

        void fillPBTable(ExchangeRates rates);

        void fillNBTable(ExchangeRates rates);
    }

    interface Presenter {

        void loadRates(String date);
    }
}
