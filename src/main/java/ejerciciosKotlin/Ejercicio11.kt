package ejerciciosKotlin

fun ejercicio11(){

    val num = pedirEntero()

    var a = 0
    var b = 1

    println("Los primeros $num números de la secuencia de Fibonacci son:")
    for (i in 1..num) {
        print("$a ")
        val temp = a
        a = b
        b += temp
    }
}