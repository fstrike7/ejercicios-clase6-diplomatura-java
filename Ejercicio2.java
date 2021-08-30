/*
Ejercicio 2:
    Realizar algoritmo que lea dos números, calculando y
    escribiendo el valor de su suma, resta, producto y división.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        float x = escaner.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float y = escaner.nextFloat();
        
        System.out.println("Suma: " + (x+y));
        System.out.println("Resta: " + (x-y));
        System.out.println("Multiplicacion: " + (x*y));
        System.out.println("Division: " + (x/y));

        escaner.close();
    }
}
