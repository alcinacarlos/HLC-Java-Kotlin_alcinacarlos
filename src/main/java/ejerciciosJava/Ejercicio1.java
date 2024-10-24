package ejerciciosJava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
    }
}

