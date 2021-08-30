/*
Ejercicio 3:
    Un pintor sabe que con una pintura determinada puede pintar 3,6 metros cuadrados por
    cada medio litro. Sabiendo la altura y el largo de la pared a pintar, 
    informar cuántos litros de pintura u.lizará (Altura y Largo en metros). 
*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese altura de la pared a pintar: ");
        int altura = escaner.nextInt();
        System.out.println("Ingrese largo de la pared a pintar: ");
        int largo = escaner.nextInt();
        int superficie = altura * largo;
        double totalPintura = (superficie/3.6)*2; // La cantidad de latas se multiplica por dos porque es 1/2 litro cada 3.6 metros cuadrados
        System.out.println("Total de litros usados: " + totalPintura);
        escaner.close();
    }
}
