package ejerciciosJava;


public class Ejercicio3 {
    public static void main() {
        int num = Utils.pedirEntero("Introduce el radio del círculo:");
        double pi = Math.PI;
        double area = pi * Math.pow(num, 2);
        System.out.println("Area: " + area);
    }
}

