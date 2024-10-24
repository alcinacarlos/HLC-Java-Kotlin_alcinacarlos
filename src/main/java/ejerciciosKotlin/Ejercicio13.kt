package ejerciciosKotlin

class Anime(
    val nombre:String,
    val episodios:Int,
    val genero:String
){
    override fun toString(): String {
        return "Nombre: $nombre\nGénero: $genero\nEpisodios: $episodios"
    }
}

fun ejercicio13(){
    val anime1 = Anime("Hola", 33, "accion")
    val anime2 = Anime("fsfags", 11, "suspense")

    println(anime2)
    println()
    println(anime1)
}