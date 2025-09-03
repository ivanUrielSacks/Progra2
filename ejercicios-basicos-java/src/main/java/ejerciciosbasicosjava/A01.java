
package ejerciciosbasicosjava;
import java.util.Scanner;
public class A01 
{

    public static void main(String[] args)
    {
//        [A.01] Máximos, mínimos y promedios
//        Ingresar 5 números por consola, guardandolos
//        en una variable escalar. Calcular y mostrar: el
//        valor máximo, el valor mínimo y el promedio.
//        Nota: utilizar estructuras repetitivas.
        
        Scanner input = new Scanner(System.in);
        
        double valorMinimo = Integer.MAX_VALUE;
        double valorMaximo = Integer.MIN_VALUE;
        double valorPromedio = 0;
        
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Ingese el valor del numero " + i + ": ");
            double num = input.nextDouble();
            
            if(num < valorMinimo)
            {
                valorMinimo = num;
            }
            if(num > valorMaximo)
            {
                valorMaximo = num;
            }
            
            valorPromedio += num;
        }
        valorPromedio = valorPromedio / 5;
        System.out.println("El valor Maximo es: " + valorMaximo);
        System.out.println("El valor Minimo es: " + valorMinimo);
        System.out.println("El valor promedio es: " + valorPromedio);
        
    }
}
