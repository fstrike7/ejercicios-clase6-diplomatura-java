/* 
Ejercicio 5:
    Ingresar como dato el perímetro de un cuadrado. 
    Calcular e imprimir el volumen del cubo que tiene como lado el cuadrado antes mencionado.
    (V=a3).
*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese perímetro de un cuadrado: ");
        int perimetro = escaner.nextInt();
        float lado = perimetro/4; // Se divide para sacar cada lado del perimetro.
        float volumenCubo = (lado*lado*lado); // Se eleva al cubo un lado.
        System.out.println("Volumen del cubo: " + volumenCubo);

        escaner.close();
    }
}
