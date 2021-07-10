package com.kotlin.test

// can inherit
class Person1: Person2() {

    override fun doSomething() {
        super.doSomething()
    }

    override fun sad(value: Int): Boolean {
        return super.sad(value)
    }

    override fun happy() {
        super.happy()
    }
}

open class Person2: Behavior {

    open fun doSomething(){
        print("Hello")
    }

    fun doSomething1() {

    }

    override fun sad(value: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun happy() {
        TODO("Not yet implemented")
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