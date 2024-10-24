package ejerciciosJava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una cadena y la convierto al revés: ");
        String cadena = scanner.nextLine();
        System.out.println(new StringBuilder(cadena).reverse());
    }
}
