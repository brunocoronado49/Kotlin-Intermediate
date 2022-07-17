package com.brauny.kotlinintermediate

interface Game {
    val game: String

    fun play()

    fun stream() {
        println("Hola estoy jugando $game")
    }
}