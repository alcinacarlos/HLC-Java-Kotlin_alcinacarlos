package ejerciciosKotlin

fun ejercicio9(){
    val num = pedirEntero()
    var primo = true

    for (i in 2 until num) {
        if (num % i == 0) {
            primo = false
        }
    }
    println("Es primo: $primo")

}