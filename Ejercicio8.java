/*
Ejercicio 8:
    Leer un número e indicar si este es multiplo de dos.
*/
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese numero para saber si es multiplo de dos: ");
        int esMultiplo = escaner.nextInt();
        if (esMultiplo == 0){ // Hay que tener en cuenta que el módulo de dos distingue 0 como numero par, por lo que es necesario agregar una comprobación mas.
            System.out.println("El numero 0 no es multiplo de dos");
        }
        else if (esMultiplo%2==0){
            System.out.println("El numero " + esMultiplo + " es multiplo de dos.");
        }
        else {
            System.out.println("El numero " + esMultiplo + " no es multiplo de dos.");
        }
        escaner.close();
    }
}
