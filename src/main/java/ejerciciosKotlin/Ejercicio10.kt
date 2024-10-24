package ejerciciosKotlin

fun ejercicio10(){
    var celsius:Boolean? = null
    while (celsius == null){
        println("Introduce a qué temperatura quieres convertir (C o F)")
        val userA = readln().lowercase()
        when(userA){
            "c" -> celsius = true
            "f" -> celsius = false
            else -> println("Vuelve a intentarlo")
        }
    }

    val numeroConvertir = pedirEntero("Introduce una temperatura: ")
    val numeroConvertido = if (celsius) (numeroConvertir - 32) * 5/9 else numeroConvertir * 9/5 + 32
    val tString = if (celsius) "Celsius" else "Fahrenheit"
    println("Temperatura en $tString = $numeroConvertido")

}