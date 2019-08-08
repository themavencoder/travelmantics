package com.themavencoder.travelmanticsfinal;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by themavencoder on 08,August,2019
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        FirebaseApp.initializeApp(this);
        super.onCreate();
    }
}
