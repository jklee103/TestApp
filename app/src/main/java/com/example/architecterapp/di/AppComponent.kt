package com.example.architecterapp.di

import com.example.architecterapp.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,//dagger.android 사용 위한 설
        ActivityModule::class,//액티비티 스코프 모듈
        AppModule::class //앱 스코프 모듈
    ]
)

interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<App> {

    }
}