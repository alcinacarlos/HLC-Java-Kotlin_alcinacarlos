package ejerciciosJava;

public class Ejercicio12 {
    public static void main() {
        int num = Utils.pedirEntero("Introduce un número para invertir: ");
        System.out.println("Número invertido: " + new StringBuilder(String.valueOf(num)).reverse().toString());
    }
}

