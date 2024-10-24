package ejerciciosJava;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cadena para contar las vocales: ");
        String cadena = scanner.nextLine();
        int nA = 0, nE = 0, nI = 0, nO = 0, nU = 0;

        for (char caracter : cadena.toCharArray()) {
            switch (Character.toLowerCase(caracter)) {
                case 'a':
                    nA++;
                    break;
                case 'e':
                    nE++;
                    break;
                case 'i':
                    nI++;
                    break;
                case 'o':
                    nO++;
                    break;
                case 'u':
                    nU++;
                    break;
            }
        }
        System.out.println("A: " + nA);
        System.out.println("E: " + nE);
        System.out.println("I: " + nI);
        System.out.println("O: " + nO);
        System.out.println("U: " + nU);
    }
}

