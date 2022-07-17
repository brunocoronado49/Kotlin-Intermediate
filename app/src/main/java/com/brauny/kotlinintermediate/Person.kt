package com.brauny.kotlinintermediate

// Cualquier clase hereda de otra llamada Any
open class Person(name: String, age: Int): Work(), Game {
    open fun work() {
        println("esta persona esta trabajando")
    }

    override fun goToWork() {
        println("Esta persona va al trabajo")
    }

    override val game: String = "Cyberpunk 2077"

    override fun play() {
        println("Esta persona juega $game")
    }

    override fun stream() {
        super.stream()
    }
}