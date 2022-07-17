package com.brauny.kotlinintermediate

class Designer(name: String, age: Int): Person(name, age) {
    override fun work() {
        println("Esta diseñando")
        super.work()
    }
}