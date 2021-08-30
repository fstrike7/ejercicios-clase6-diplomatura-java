/*
Ejercicio 1:
    Si un lote de terreno tiene X metros de frente por Y metros de fondo: 
    calcular e imprimir la cantidad de metros de alambre para cercarlo 
    (X e Y serán leídos al comenzar el programa).
*/
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese metros de frente: ");
        int x = escaner.nextInt();
        System.out.println("Ingrese metros de fondo: ");
        int y = escaner.nextInt();
        int cantidadAlambre = x*y;
        System.out.println("Metros de alambre calculado: " + cantidadAlambre);

        escaner.close();
    }
}