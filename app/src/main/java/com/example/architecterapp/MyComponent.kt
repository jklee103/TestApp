package com.example.architecterapp

import dagger.Component

@Component(modules = [MyModule::class]) //참조된 모듈 클래스로부터 의존성 제공받음
interface MyComponent { //제공할 의존성을 정의하는 인터페이스
    fun getString():String //모듈반환형이랑 다르면 컴파일 에러
}