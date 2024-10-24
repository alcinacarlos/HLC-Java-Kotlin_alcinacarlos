package ejerciciosKotlin

fun ejercicio8(){
    println("Introduce la cadena para contar las vocales: ")
    val cadena = readln()
    var nA = 0
    var nE = 0
    var nI = 0
    var nO = 0
    var nU = 0
    for (caracter in cadena){
        when(caracter.toString().lowercase()){
            "a" -> nA++
            "e" -> nE++
            "i" -> nI++
            "o" -> nO++
            "u" -> nU++
        }
    }
    println("A: $nA")
    println("E: $nE")
    println("I: $nI")
    println("O: $nO")
    println("U: $nU")
}