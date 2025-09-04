
package ejerciciosbasicosjava;
import java.util.ArrayList;
public class AO4
{
    public static void main(String[] args)
    {
//    [A.04] Números perfectos
//    Un número perfecto es un entero positivo, que es igual a la suma de todos los enteros
//    positivos (excluido el mismo)que son divisores del número.
//    El primer número perfecto es 6, ya que los divisores de 6 son 1, 2 y 3;
//    y 1 + 2 + 3 = 6. Escribir una aplicación que encuentre los 4 primeros
//    números perfectos.
//    Nota: Utilizar estructuras repetitivas y selectivas.
    
        ArrayList<Integer> divisores = new ArrayList<>();
        int[] numerosPerfectos = new int[4];
        int contadorPerfectos = 0;
        boolean bandera;
        double total;
        for(int i = 2; contadorPerfectos < 4; i++)
        {
            bandera = false;
            total = 0;
            divisores.clear();
            
            for(int n = 1; n < i; n++)
            {
                if(i%n == 0)
                {
                    divisores.add(n);
                }
            }
            for(double divisor : divisores)
            {
                total += divisor;

            }
            
            if(total == i)
            {
                bandera = true;
            }
            
            if(bandera == true)
            {
                numerosPerfectos[contadorPerfectos] = i;
                contadorPerfectos++;
                
            }
        }
        System.out.println("Los primeros 4 numeros perfectos son: ");

        for(double perfecto : numerosPerfectos)
        {
            System.out.print(" " + perfecto);
        }


    }
}
