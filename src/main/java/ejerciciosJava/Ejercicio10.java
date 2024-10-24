package ejerciciosJava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Boolean celsius = null;

        while (celsius == null) {
            System.out.println("Introduce a qué temperatura quieres convertir (C o F)");
            String userA = scanner.nextLine().toLowerCase();
            if (userA.equals("c")) {
                celsius = true;
            } else if (userA.equals("f")) {
                celsius = false;
            } else {
                System.out.println("Vuelve a intentarlo");
            }
        }

        int numeroConvertir = Utils.pedirEntero("Introduce una temperatura: ");
        double numeroConvertido = celsius ? (numeroConvertir - 32) * 5.0 / 9 : numeroConvertir * 9.0 / 5 + 32;
        String tString = celsius ? "Celsius" : "Fahrenheit";
        System.out.println("Temperatura en " + tString + " = " + numeroConvertido);
    }
}

