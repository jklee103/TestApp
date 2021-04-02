package com.example.architecterapp

import com.example.architecterapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class App: DaggerApplication() {
        override fun onCreate() {
            super.onCreate()
            //timber setting for log
            Timber.plant(Timber.DebugTree())
        }

        override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        //after appcomponent setting, daggerAppComponent is create
            return DaggerAppComponent.factory().create(this)
    }
}