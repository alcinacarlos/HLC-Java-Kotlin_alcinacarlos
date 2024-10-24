package ejerciciosKotlin

class Videojuego(
    val titulo:String,
    val plataforma:String,
    val horasJugadas:Int
){
    override fun toString(): String {
        return "Título: $titulo, Plataforma: $plataforma, Horas Jugadas: $horasJugadas"
    }
}

fun ejercicio14(){
    val inventario = mutableListOf<Videojuego>()
    var salir = true
    while (salir){
        println("Menú:")
        println("\t1. Añadir videojuego")
        println("\t2. Eliminar videojuego")
        println("\t3. Mostrar todos los videojuegos")
        println("\t4. Salir")

        when(pedirEntero("Elige qué quieres hacer: ")){
            1 -> {
                inventario.add(crearVideojuego())
            }
            2 -> {
                mostrarVideojuegos(inventario)
                val seleccionado = pedirEntero("Selecciona el videojuego a eliminar: ")
                if (seleccionado in 0..inventario.size){
                    inventario.removeAt(seleccionado)
                    println("Juego eliminado correctamente")
                }else{
                    println("No has seleccionado un videojuego válido")
                }
            }
            3 -> mostrarVideojuegos(inventario)
            4 -> salir = false
            else -> println("Opción no válida")
        }

    }

}

private fun crearVideojuego(): Videojuego {
    println("Introduce el nombre:")
    val nombre = readln()
    println("Introduce la plataforma: ")
    val plataforma = readln()
    val horas= pedirEntero("Introduce horas jugadas: ")
    return Videojuego(nombre, plataforma, horas)
}

private fun mostrarVideojuegos(videojuegos: List<Videojuego>){
    if (videojuegos.isEmpty()) return println("No hay videojuegos")
    println("Mostrando inventario: ")
    videojuegos.forEachIndexed{index, videojuego -> println("$index. $videojuego") }
}

