package ejerciciosKotlin

import kotlin.random.Random

fun ejercicio4(){
    val generatedNum = Random.nextInt(1,100)
    var userNum:Int? = null
    do {
        userNum = pedirEntero("Adivina un número del 1 al 100: ")
        if (userNum > generatedNum){
            println("Casii, el número a adivinar es más bajo")
        } else if (userNum < generatedNum){
            println("Casii, el número a adivinar es más alto")
        }
    }while (generatedNum != userNum)
    println("Acertaste")
}