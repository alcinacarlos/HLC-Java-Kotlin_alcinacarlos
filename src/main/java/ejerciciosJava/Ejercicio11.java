package ejerciciosJava;

public class Ejercicio11 {
    public static void main() {
        int num = Utils.pedirEntero();
        int a = 0, b = 1;

        System.out.println("Los primeros " + num + " números de la secuencia de Fibonacci son:");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b += temp;
        }
    }
}

