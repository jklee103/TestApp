package com.example.architecterapp

import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainFragmentComponent::class])
class MainActivityModule {
    @Provides
    @ActivityScope
    fun provideActivityName(): String{
        return MainActivity::class.simpleName.toString()
    }
}