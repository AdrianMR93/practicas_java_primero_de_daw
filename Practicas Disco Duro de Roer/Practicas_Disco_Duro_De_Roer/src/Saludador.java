/*
    Pide un nombre por teclado y haz que te salude.

    Por ejemplo, si introduces "Fernando", la respuesta debe ser ¡Hola Fernando!

 */

import java.util.Scanner;

public class Saludador {
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúal es tu nombre?");
        nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
