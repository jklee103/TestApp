package com.example.architecterapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testHelloWorld(){
        var myComponent: MyComponent = DaggerMyComponent.create()
        System.out.println("result: "+myComponent.getString())
    }

    @Test
    fun testMemberInjection(){
        var myClass = MyClass()
        var str = myClass.str
        assertNotNull("조회 결과 null", str)
        var myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)
        str = myClass.str
        assertEquals("Hello World", str)
    }

    @Test
    fun testMemberInjector(){
        var myClass = MyClass()
        var str = myClass.str
        System.out.println("result = "+str)
        var myComponent =DaggerMyComponent.create()
        var injector = myComponent.getInjector()
        injector.injectMembers(myClass)
        str = myClass.str
        System.out.println("result = "+str)
    }
}