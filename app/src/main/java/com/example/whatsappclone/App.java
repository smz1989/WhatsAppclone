package com.example.whatsappclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XezRptOgK4ossdKR4JQQZ4wD2g565QcGqyDipgDQ")
                // if defined
                .clientKey("LZUE5IS4xYsaDbqUM9J9gpL1qZgJSCd5LdR7sT0l")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
