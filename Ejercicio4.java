/*
Ejercicio 4:
    Dadas dos variables numéricas A y B, que el usuario debe teclear,
    se pide realizar un algoritmo que intercambie los valores de ambas variables
    y muestre cuánto valen al final las dos variables (recuerda la asignación)
*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese variable A: ");
        int A = escaner.nextInt();
        System.out.println("Ingrese variable B: ");
        int B = escaner.nextInt();

        int temporal = B;
        B = A;
        A = temporal;

        System.out.println("A: " + A);
        System.out.println("B: " + B);

        escaner.close();
    }
}
