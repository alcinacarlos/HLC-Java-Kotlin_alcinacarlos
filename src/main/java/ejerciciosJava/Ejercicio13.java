package ejerciciosJava;

class Anime {
    private final String nombre;
    private final int episodios;
    private final String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nGénero: " + genero + "\nEpisodios: " + episodios;
    }
}

public class Ejercicio13 {
    public static void main() {
        Anime anime1 = new Anime("Hola", 33, "acción");
        Anime anime2 = new Anime("fsfags", 11, "suspense");

        System.out.println(anime2);
        System.out.println();
        System.out.println(anime1);
    }
}
