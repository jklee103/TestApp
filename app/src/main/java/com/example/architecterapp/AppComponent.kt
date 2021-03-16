package com.example.architecterapp

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun mainActivityComponentBuilder(): MainActivityComponent.Builder
    fun inject(app: App)

    @Component.Builder
    interface Builder{
        fun setModule(module: AppModule): Builder
        @BindsInstance
        fun setApp(app: App): Builder
        fun build(): AppComponent
    }
}