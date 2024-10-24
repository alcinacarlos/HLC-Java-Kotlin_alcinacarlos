package ejerciciosJava;

public class Ejercicio5 {
    public static void main() {
        int num = Utils.pedirEntero("Número para tabla de multiplicar: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
    }
}
