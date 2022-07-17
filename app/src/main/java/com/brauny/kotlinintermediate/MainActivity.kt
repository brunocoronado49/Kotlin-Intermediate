package com.brauny.kotlinintermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enumClasses()
        nestedAndInnerClasses()
        inheritanceClass()
        interfaces()
        visibilityModifier()
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