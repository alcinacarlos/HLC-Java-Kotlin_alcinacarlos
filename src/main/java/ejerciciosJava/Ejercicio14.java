package ejerciciosJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Videojuego {
    private final String titulo;
    private final String plataforma;
    private final int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Plataforma: " + plataforma + ", Horas Jugadas: " + horasJugadas;
    }
}

public class Ejercicio14 {
    public static void main() {
        List<Videojuego> inventario = new ArrayList<>();
        boolean salir = true;
        Scanner scanner = new Scanner(System.in);

        while (salir) {
            System.out.println("Menú:");
            System.out.println("\t1. Añadir videojuego");
            System.out.println("\t2. Eliminar videojuego");
            System.out.println("\t3. Mostrar todos los videojuegos");
            System.out.println("\t4. Salir");

            switch (Utils.pedirEntero("Elige qué quieres hacer: ")) {
                case 1 -> inventario.add(crearVideojuego(scanner));
                case 2 -> {
                    mostrarVideojuegos(inventario);
                    int seleccionado = Utils.pedirEntero("Selecciona el videojuego a eliminar: ");
                    if (seleccionado >= 0 && seleccionado < inventario.size()) {
                        inventario.remove(seleccionado);
                        System.out.println("Juego eliminado correctamente");
                    } else {
                        System.out.println("No has seleccionado un videojuego válido");
                    }
                }
                case 3 -> mostrarVideojuegos(inventario);
                case 4 -> salir = false;
                default -> System.out.println("Opción no válida");
            }
        }
    }

    private static Videojuego crearVideojuego(Scanner scanner) {
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la plataforma: ");
        String plataforma = scanner.nextLine();
        int horas = Utils.pedirEntero("Introduce horas jugadas: ");
        return new Videojuego(nombre, plataforma, horas);
    }

    private static void mostrarVideojuegos(List<Videojuego> videojuegos) {
        if (videojuegos.isEmpty()) {
            System.out.println("No hay videojuegos");
            return;
        }
        System.out.println("Mostrando inventario: ");
        for (int i = 0; i < videojuegos.size(); i++) {
            System.out.println(i + ". " + videojuegos.get(i));
        }
    }
}

