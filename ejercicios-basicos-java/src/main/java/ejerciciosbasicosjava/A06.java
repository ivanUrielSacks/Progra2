
package ejerciciosbasicosjava;
import java.util.ArrayList;
import java.util.Scanner;

public class A06
{
    public static void main(String[] args)
    {
        //[A.06] Bis sextus dies ante calendas martii
        //Escribir un programa que determine si un año es bisiesto.
        //Un año es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo si
        //ellos también son múltiplos de 400. Por ejemplo: el año 2000 es bisiesto pero 1900 no.
        //Pedirle al usuario un año de inicio y otro de fin y mostrar todos los años bisiestos en ese
        //rango.
        //Nota: Utilizar estructuras repetitivas, selectivas y la función módulo (%).

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un anio de inicio ");
        int inicio = input.nextInt();
        
        System.out.println("Ingrese un anio de fin ");
        int ultimo = input.nextInt();
        input.close();
        
        System.out.println("Anios bisiestos: ");

        for(int i = inicio; i <= ultimo; i += 1)
            if((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0))
            {
                System.out.println(" " + i);
            }

    }
}
