/*
Ejercicio 7:
    Indicar si un número ingresado es par o impar. 
*/
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese numero para saber si es par o impar: ");
        int esPar = escaner.nextInt();
        if (esPar%2==0){
            System.out.println("El numero " + esPar + " es par.");
        }
        else {
            System.out.println("El numero " + esPar + " es impar.");
        }

        escaner.close();
    }
}
