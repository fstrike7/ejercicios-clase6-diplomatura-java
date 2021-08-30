/*
Ejercicio 10:
    Dado un número entero positivo menor que cien, leerlo desde teclado, indicar si es primo.
    (Los números primos son aquellos que sólo son divisibles por sí mismos y por uno.
    - En el caso del ejemplo, por ser el número leído menor que cien, 
    sólo hay que comprobar que el número no sea 2 - 3 - 5 - 7 o múltiple de alguno de estos. 
    Si se cumple esta condición, se trata entonces de un número primo.
*/
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para saber si es primo: ");
        int esPrimo = escaner.nextInt();
        int primos[] = {2,3,5,7};
        for (int i=0; i<primos.length; i++){
            if (esPrimo % primos[i] == 0 && esPrimo!= primos[i]){ // Si es divisible por el numero y además no es uno de los números primos (2,3,5,7).
                System.out.println("El numero no es primo.");
                return; // Corta la ejecución
            }
        }
        System.out.println("El numero es primo."); // En caso de que no se cumpla en ningún momento el if, llega a éste punto.
        escaner.close();
    }
}
