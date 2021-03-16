package com.example.architecterapp

import dagger.BindsInstance
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MainFragmentModule::class])
interface MainFragmentComponent {
    fun inject(mainFragment: MainFragment)

    @Subcomponent.Builder
    interface Builder{
        fun setModule(module: MainFragmentModule): Builder
        @BindsInstance
        fun setFragment(fragment: MainFragment): Builder
        fun build(): MainFragmentComponent
    }
}