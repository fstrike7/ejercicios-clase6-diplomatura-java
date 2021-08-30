/*
Ejercicio 13:
    Leer una serie de 15 números enteros, 
    informar mediante un mensaje cuántos son mayores que 100.
*/
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Scanner escaner = new Scanner(System.in);
        int cantidadMayores = 0;
        System.out.println("A continuación, ingrese 15 numeros, al final se informa cuantos son mayores a 100.");
        for (int i=0; i<15; i++){
            System.out.println("Numero " + (i+1) + ": ");
            numeros[i] = escaner.nextInt();
            if (numeros[i] > 100){
                cantidadMayores += 1;
            }
        }
        System.out.println("Cantidad de numeros mayores a 100: " + cantidadMayores);
        escaner.close();
    }
}
