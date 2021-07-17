package com.kotlin.test

// can inherit
class Person1: Person2() {

    override fun doSomething() {
        super.doSomething()
    }


}

open class Person2 {
    
    open fun doSomething(){

    }

    fun doSomething1() {
        
    }
}

// can not inherit
interface Behavior {
    fun sad(value: Int): Boolean
    fun happy()
}

interface Features {
    fun hair(): Boolean // false or true
    fun haveEye()
}