/*
Ejercicio 6:
    Ingresar por teclado los precios correspondientes a cinco articulos y las cantidades
    vendidas de cada uno de ellos. Calcular e imprimir el importe total
    de ventas de cada uno y un importe total de lo vendido.
*/
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int[] precio_articulo = new int[5];
        int[] cantidades_vendidas = new int[5];
        Scanner escaner = new Scanner(System.in);

        for (int i=0; i<precio_articulo.length; i++){
            System.out.println("Ingrese precio del articulo " + (i+1));
            precio_articulo[i] = escaner.nextInt();
            System.out.println("Ingrese cantidades vendidas para el articulo " + (i+1));
            cantidades_vendidas[i] = escaner.nextInt();
        }

        int total_ventas = 0; // Declaramos e inicializamos una variable que almacene el total.

        for (int i=0; i<precio_articulo.length; i++){
            int total_unitario = precio_articulo[i]*cantidades_vendidas[i]; // Variable temporal que guarda el importe total del articulo.
            total_ventas += total_unitario; // Se le suma el valor unitario al importe total.
            System.out.println("Importe total del articulo " + (i+1) + ": " + total_unitario);
        }
        System.out.println("Importe total de todos los articulos: " + total_ventas);

        escaner.close();

    }
}
