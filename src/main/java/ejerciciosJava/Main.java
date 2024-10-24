package ejerciciosJava;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void showMenu() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }
        System.out.println("Bienvenido, selecciona el ejercicio a ejecutar:");
        System.out.println("\t 0. Salir");
        for (int i = 1; i <= 14; i++) {
            System.out.println("\t " + i + ". Ejercicio " + i);
        }
    }

    private static void menuPrincipal() {
        boolean salir = true;
        while (salir) {
            showMenu();
            int choice = Utils.pedirEntero("");
            switch (choice) {
                case 0 -> salir = false;
                case 1 -> Ejercicio1.main();
                case 2 -> Ejercicio2.main();
                case 3 -> Ejercicio3.main();
                case 4 -> Ejercicio4.main();
                case 5 -> Ejercicio5.main();
                case 6 -> Ejercicio6.main();
                case 7 -> Ejercicio7.main();
                case 8 -> Ejercicio8.main();
                case 9 -> Ejercicio9.main();
                case 10 -> Ejercicio10.main();
                case 11 -> Ejercicio11.main();
                case 12 -> Ejercicio12.main();
                case 13 -> Ejercicio13.main();
                case 14 -> Ejercicio14.main();
                default -> System.out.println("Ejercicio no válido, vuelve a intentarlo");
            }
            if (choice != 0) {
                System.out.println("\nEjercicio mostrado, espera 5 segundos....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("Hasta luego!");
    }
}

