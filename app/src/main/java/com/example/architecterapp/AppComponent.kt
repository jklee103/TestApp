package com.example.architecterapp

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun mainActivityComponentBuilder(): MainActivityComponent.Builder
    fun inject(app: App)

    @Component.Factory
    interface Factory{
        fun create(
            @BindsInstance app: App,
            appModule: AppModule
        )
    }
}