package com.example.architecterapp

import dagger.Module
import dagger.Provides
import java.util.*

@Module
class MainFragmentModule {
    @Provides
    @FragmentScope
    fun provideInt(): Integer {
        return Integer(Random().nextInt())
    }
}