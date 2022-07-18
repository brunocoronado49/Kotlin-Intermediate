package com.brauny.kotlinintermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

typealias MyMapList = MutableMap<Int, ArrayList<String>>

// Un typealisa de funcion:
typealias MyFun = (Int, String) -> String

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enumClasses()
        nestedAndInnerClasses()
        inheritanceClass()
        interfaces()
        visibilityModifier()
        dataClasses()
        typeAlias()
        destructuring()
        extensions()
    }

    // Extensions
    private fun extensions() {

    }

    // Desctructuring
    private fun destructuring() {
        val bruce = Worker("Bruce", 24, "Programmer")
        val (name, _, work) = bruce
        println("Hola mi nombre es $name  y soy $work")

        println(bruce.component1()) // output: Francsico
        println(bruce.component2()) // output: 24
        println(bruce.component3()) // output: Programmer

        val (bruceName, bruceAge, bruceWork) = myWorker()
        println("Hola mi nombre es $bruceName, tengo $bruceAge años y soy $bruceWork")

    }

    private fun myWorker(): Worker {
        return Worker("Bruce", 24, "Programmer")
    }

    // Typep alias
    // los type alias nos ayudan a simplificar algo como esto:
    private var myMap: MutableMap<Int, ArrayList<String>> = mutableMapOf()

    // usando el typealias que creamos fuera de la clase
    private var mySecondMap: MyMapList = mutableMapOf()

    private fun typeAlias() {
        var myNewMap: MyMapList = mutableMapOf()

        myNewMap[1] = arrayListOf("bruce", "francisco")
        myNewMap[2] = arrayListOf("jose", "rangel")


    }

    // Data classes
    private fun dataClasses() {
        val bruce = Worker("Francisco", 24, "Programmer")
        bruce.lastWork = "gamer"

        val franco = Worker("Francisco", 24, "Programmer")
        franco.lastWork = "gamer"

        val sara = Worker()

        // equals & hascode
        if (bruce == sara) {
            println("They are equals")
        } else {
            println("Thery are not equals")
        }

        if (bruce.equals(franco)) {
            println("They are equals")
        } else {
            println("Thery are not equals")
        }

        // Convert data class to String
        println(bruce.toString())

        // copy
        val bruce2 = bruce.copy(age = 31)
        println(bruce2.toString())

        // componentN or destructuring
        val (name, age) = bruce
        println(name) // output: Francisco
        println(age) // output: 24
    }

    // visibility modifier
    private fun visibilityModifier() {
        //val visibility = Visibility()
        //visibility.name = "Francisco"
        // visibility.saveMyName() // Output: Mi nombre es Francisco
    }

    // Interface
    private fun interfaces() {
        val gamer = Person("Brauny", 24)
        gamer.play()
        gamer.stream()
    }

    // Class Inheritance
    private fun inheritanceClass() {
        val programador = Programmer("Brauny", 24, "Kotlin")
        val disenador = Designer("Franco", 32)

        programador.work()
        programador.sayLanguage()
        programador.goToWork()

        disenador.work()
    }

    // Nested and Inner classes
    private fun nestedAndInnerClasses() {
        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum = myNestedClass.add(20, 56)
        println("The result of sum is: $sum")

        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo: Int = myInnerClass.sumTwo(38)
        println("The result of sum is: $sumTwo")

    }

    // Enum Classes
    enum class Direction(val dir: Int) {
        NORTE(1), SUR(-1), EAST(1), WEST(-1);

        fun description(): String {
            return when (this) {
                NORTE -> "The direction is NORTE"
                SUR -> "The direction is SUR"
                EAST -> "The direction is EAST"
                WEST -> "The direction is WWST"
                else -> "The direction no exists"
            }
        }
    }
    private fun enumClasses() {
        var userDirection: Direction? = null
        println("Direction: $userDirection")

        userDirection = Direction.NORTE
        println("Direction: $userDirection")

        userDirection = Direction.SUR
        println("Direction: $userDirection")

        println("Prop name: ${userDirection.name}") // SUR
        println("Prop name: ${userDirection.ordinal}") // 1

        // Take description of direction
        println(userDirection.description())
        println(userDirection.dir)
    }
}