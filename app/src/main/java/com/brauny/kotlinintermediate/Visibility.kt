package com.brauny.kotlinintermediate

private class Visibility {
    // En esta parte name es public, como defecto
    // Si usamos la palabra reservada private no se podra acceder a esta
    // variable fuera de la clase
    var name: String? = null

    private fun saveMyName() {

        // Con let desempaquetamos el valor de name si esque no viene nula
        // se accede con "it"
        name?.let {
            println("Mi nombre es: $it")
        } ?: run {
            // En caso de que no tenga nombre usamos run
            println("No tengo nombre")
        }
    }
}

open class VisibilityTwo {
    protected fun sayMyNameTwo() {
        // Si podemos acceder a esta clase ya que estamos en el mismo fichero/archivo
        // pero no podemos acceder a sus propiedades y metodos privados
        val visibility = Visibility()
        visibility.name = "Bruce"
    }
}

// Esta clase extiene de la primer clase
class VisibilityThree: VisibilityTwo() {
    internal var age: Int? = null
    fun sayMyNameThree() {
        // Podemos acceder a este metodo ya que viene de una super clase
        // osea la clase padre, protected es como provate pero accesible a clases
        // hijos
        sayMyNameTwo()
    }
}

// NOTE: un modulo en kotlin es un conjunto de ficheros o archivos que se
// han compilado de manera conjunta