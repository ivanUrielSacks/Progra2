
package ejerciciosbasicosjava;
import java.util.Scanner;

public class A02 
{
    public static void main(String[] args)
    {
//        [A.02] Potencias
//        Ingresar un número y mostrar: el cuadrado y el cubo del mismo.
//        Se debe validar que el número sea mayor que cero, caso contrario, mostrar
//        el mensaje: "ERROR. ¡Reingresar número!".
//        Nota: Utilizar el método ‘pow’ de la clase Math para realizar la operación.
        
        Scanner input = new Scanner(System.in);
        double num;
        
        System.out.println("Ingrese  un numero al que desea calcular su cuadrado y cubo");
        num = input.nextDouble();
        
        while(num <= 0)
        {
            System.out.println("ERROR. ¡Reingresar numero!");
            num = input.nextDouble();
        }
        
        System.out.println("El cuadro del numero es: " + Math.pow(num, 2));
        System.out.println("Y el cubo del numero es: " + Math.pow(num, 3));


    }
}
