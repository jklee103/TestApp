package com.example.architecterapp

import android.app.Application

class App: Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
            .setModule(AppModule())
            .setApp(this)
            .build()
    }

    fun getAppComponent(): AppComponent{
        return appComponent
    }
}