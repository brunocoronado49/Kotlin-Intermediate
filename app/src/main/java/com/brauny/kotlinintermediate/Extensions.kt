package com.brauny.kotlinintermediate

import java.text.SimpleDateFormat
import java.util.*

// Las extensiones las podemos reutilizar para sacar utilidades y usarlas en otras
// partes del codigo

fun Date.customFormat(): String {
    val formatter = SimpleDateFormat("yyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    return formatter.format(this)
}

val Date.formatSize : Int
    get() = this.customFormat().length