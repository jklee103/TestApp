package com.example.architecterapp.di

import android.app.Application
import android.content.Context
import com.example.architecterapp.App
import com.example.architecterapp.ApplicationContext
import com.example.architecterapp.SingleLiveEvent
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApp(app: App): Application {
        return app
    }

    //ApplicationContext 어노가 붙었었는데 싱글톤이랑 겹쳐서 뺌.(스코프는 하나밖에 안됨)
    @Provides
    @Singleton
    fun provideContext(app: App): Context {
        return app
    }

    @Singleton
    @Provides
    @Named("errorEvent")
    fun provideErrorEvent(): SingleLiveEvent<Throwable> {
        return SingleLiveEvent()
    }
}