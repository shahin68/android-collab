package com.kotlin.test

import org.junit.Test
import org.junit.Assert.*

class UnitTest {

    private fun multiply(a: Int, b: Int): Int {
        return a*b
    }

    @Test
    fun test_multiply_should_pass() {
        val result = multiply(3,3)
        print(result)
        assertEquals(result, 9)
    }

    @Test
    fun test_multiply_should_fail() {
        val result = multiply(3,3)
        print(result)
        assertEquals(result, 8)
    }
}