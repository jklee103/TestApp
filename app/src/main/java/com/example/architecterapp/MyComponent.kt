package com.example.architecterapp

import dagger.Component
import dagger.MembersInjector

@Component(modules = [MyModule::class]) //참조된 모듈 클래스로부터 의존성 제공받음
interface MyComponent { //제공할 의존성을 정의하는 인터페이스
    fun getString():String //모듈반환형이랑 다르면 컴파일 에러
    fun inject(myClass: MyClass) //멤버 인젝션 메서드
    fun getInjector(): MembersInjector<MyClass> //멤버 인젝터 반환 후 injectmembers 호출하면 멤버인젝션이랑 같아짐
}