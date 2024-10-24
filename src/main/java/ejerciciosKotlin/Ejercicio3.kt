package ejerciciosKotlin

import kotlin.math.pow

fun ejercicio3(){
    val num = pedirEntero("Introduce el radio del círculo:").toDouble()
    val pi = kotlin.math.PI
    val area = pi * num.pow(2)
    println("Area: $area")
}