/*
Ejercicio 14:
    Leer cincuenta números e indicar la cantidad de valores mayores que diez.
*/
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        Scanner escaner = new Scanner(System.in);
        int cantidadMayores = 0;
        System.out.println("Ingrese 50 numeros, al final se informa cuantos son mayores a 10.");
        for (int i=0; i<50; i++){
            System.out.println("Numero " + (i+1) + ": ");
            numeros[i] = escaner.nextInt();
            if (numeros[i] > 10){
                cantidadMayores += 1;
            }
        }
        System.out.println("Cantidad de numeros mayores a 10: " + cantidadMayores);
        escaner.close();
    }
}
