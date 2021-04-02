package com.example.architecterapp

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityContext

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope