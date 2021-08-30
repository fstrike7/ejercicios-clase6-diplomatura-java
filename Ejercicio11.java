/*
Ejercicio 11
    Se leen el sueldo básico y la categoría de un empleado. 
    Para calcular el sueldo neto se efectúan los siguientes descuentos: 
        Categoría 1: 30% 
        Categoría 2: 25% 
        Categoría 3: 25% 
        Categoría 4: 10% 
    Para otras Categorías no hay descuentos. 
    Imprimir el sueldo neto básico y Categoría.
*/
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int descuentos[] = {30,25,25,10}; // Guardamos los descuentos en un array. 

        System.out.println("Ingrese sueldo basico del empleado: ");
        float sueldoBasico = escaner.nextFloat();

        System.out.println("Ingrese la categoria del empleado: ");
        int categoria = escaner.nextInt();

        float sueldoNeto;
        if (categoria <= descuentos.length){ // Si la categoria ingresada por el usuario es menor o igual al tamaño del array.
            sueldoNeto = sueldoBasico-(sueldoBasico*descuentos[categoria-1]/100); //[categoria-1] porque para la 1er categoría corresponde la primer posición del array, y asi sucesivamente.
        }
        else {
            sueldoNeto = sueldoBasico;
        }
        System.out.println("Sueldo neto: " + sueldoNeto);
        escaner.close();
    }
}
