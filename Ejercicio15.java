/*
Ejercicio 15:
    De una serie de 20 valores, se quiere saber cuántos cumplen con la condición
    de ser impares mayores que cincuenta y menores que cien.
*/
import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner escaner = new Scanner(System.in);
        int cantidadCondicion = 0;
        System.out.println("Ingrese 20 numeros a continuación, al final son impares mayores que cincuenta y menores que cien.");
        for (int i=0; i<20; i++){
            System.out.println("Numero " + (i+1) + ": ");
            numeros[i] = escaner.nextInt();
            if (numeros[i] % 3 == 0 && numeros[i] > 50 && numeros[i] < 100){
                cantidadCondicion += 1;
            }
        }
        System.out.println("Cantidad de numeros que cumplen con la condición de ser impares, mayores a 50 y menores que 100: " + cantidadCondicion);
        escaner.close();
    }
}
