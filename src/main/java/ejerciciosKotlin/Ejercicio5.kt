package ejerciciosKotlin

fun ejercicio5(){
    val num = pedirEntero("Número para tabla de multiplicar: ")
    for (i in 1..10){
        println("$num * $i = ${i*num}")
    }
}