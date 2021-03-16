package com.example.architecterapp

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MainActivityComponent::class])
class AppModule {
    @Provides
    @Singleton //ㅁㅐ번 인스턴스 생성, 시스템에서 가져오고 싶으면 지우기
    fun provideSharedPreferences(app: App): SharedPreferences{
        return app.getSharedPreferences("default", Context.MODE_PRIVATE)
    }
}