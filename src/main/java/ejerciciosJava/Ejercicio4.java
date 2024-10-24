package ejerciciosJava;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int generatedNum = random.nextInt(100) + 1;
        int userNum;

        do {
            userNum = Utils.pedirEntero("Adivina un número del 1 al 100: ");
            if (userNum > generatedNum) {
                System.out.println("Casii, el número a adivinar es más bajo");
            } else if (userNum < generatedNum) {
                System.out.println("Casii, el número a adivinar es más alto");
            }
        } while (generatedNum != userNum);

        System.out.println("Acertaste");
    }
}

