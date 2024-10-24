package ejerciciosJava;

public class Ejercicio9 {
    public static void main() {
        int num = Utils.pedirEntero();
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println("Es primo: " + primo);
    }
}

