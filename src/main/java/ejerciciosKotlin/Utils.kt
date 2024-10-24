package ejerciciosKotlin

fun pedirEntero(customMessage:String? = null):Int{
    var num:Int? = null
    val message = customMessage ?: "Introduce un número entero: "
    while (num == null){
        println(message)
        num = readlnOrNull()?.toIntOrNull()
        if (num == null) println("Número entero no válido")
    }
    return num
}