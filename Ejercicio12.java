/*
Ejercicio 12:
    Leer un número comprendido entre uno y siete, 
    ambos inclusive e imprimir el nombre del día de la semana Correspondiente.
*/
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese número del día de la semana, comprendido entre 1 y 7: ");
        int numeroDia = escaner.nextInt();
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        if (numeroDia > 7 || numeroDia < 1){
            System.out.println("Comprendido entre 1 y 7.");
        } else {
            System.out.println("Corresponde al dia " + dias[numeroDia-1]);
        }
        escaner.close();
    }
}
