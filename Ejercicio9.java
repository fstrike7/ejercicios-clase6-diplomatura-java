/*
Ejercicio 9:
    Leer un número e indicar si es divisible por tres.
*/

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese numero para saber si es divisible por tres: ");
        int esDivisible = escaner.nextInt();
        if (esDivisible == 1){ // Lo mismo que el ejercicio anterior
            System.out.println("El numero 1 no es divisible por tres.");
        }
        else if (esDivisible%3==0){
            System.out.println("El numero " + esDivisible + " es divisible por tres.");
        }
        else {
            System.out.println("El numero " + esDivisible + " no es divisible por tres.");
        }
        escaner.close();
    }
}
