package com.brauny.kotlinintermediate

// Se puede extender desde una clase solamente pero tambien de una interfaz
class Programmer(name: String, age: Int, val language: String): Person(name, age), Car {
    override fun work() {
        println("Esta programando")
    }

    fun sayLanguage() {
        println("Esta persona usa $language")
    }

    override fun goToWork() {
        println("Esta persona va a Google")
    }

    override fun drive() {
        println("Esta persona va en carro")
    }
}