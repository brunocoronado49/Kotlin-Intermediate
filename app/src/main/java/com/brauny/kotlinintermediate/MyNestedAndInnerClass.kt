package com.brauny.kotlinintermediate

class MyNestedAndInnerClass {

    private val one = 1

    private fun sumOne() : Int {
        return one
    }

    class MyNestedClass {
        fun add(a: Int, b: Int) : Int {
            return a + b
        }
    }

    inner class MyInnerClass {
        fun sumTwo(c: Int) : Int {
            return c + one + sumOne()
        }
    }
}