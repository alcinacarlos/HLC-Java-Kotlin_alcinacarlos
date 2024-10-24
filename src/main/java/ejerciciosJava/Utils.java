package ejerciciosJava;

import java.util.Scanner;

public class Utils {
    public static int pedirEntero(String customMessage) {
        Scanner scanner = new Scanner(System.in);
        Integer num = null;
        String message = (customMessage != null) ? customMessage : "Introduce un número entero: ";

        while (num == null) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Número entero no válido");
            }
        }
        return num;
    }

    public static int pedirEntero() {
        return pedirEntero(null);
    }
}
