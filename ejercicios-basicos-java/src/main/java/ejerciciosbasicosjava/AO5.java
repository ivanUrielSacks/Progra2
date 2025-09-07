
package ejerciciosbasicosjava;
import java.util.ArrayList;
import java.util.Scanner;

public class AO5 
{
    public static void main(String[] args)
    {
        //        [A.05] Centros Numéricos
//    Un centro numérico es un número que separa una lista de números enteros (comenzando
//    en 1) en dos grupos de números, cuyas sumas son iguales.
//    El primer centro numérico es el 6, el cual separa la lista (1 a 8) en los grupos: (1; 2; 3; 4; 5)
//    y (7; 8) cuyas sumas son ambas iguales a 15. El segundo centro numérico es el 35, el cual
//    separa la lista (1 a 49) en los grupos: (1 a 34) y (36 a 49) cuyas sumas son ambas iguales a
//    595.
//    Se pide elaborar una aplicación que calcule los centros numéricos entre 1 y el número que
//    el usuario ingres por consola.
//    Nota: Utilizar estructuras repetitivas y selectivas.
        
        
        ArrayList<Integer> centrosNumericos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese hasta que numero desea calcualar los centros numericos");
        int numeroImput = input.nextInt();
        
        for(int i = 1; i < numeroImput; i++)
        {
            int primerGrupo = 0;
            int segundoGrupo = 0;
            boolean banderaCentroNumerico = false;
       
            for(int a = 1; a < i; a++)
            {
                primerGrupo += a;
            }
            for(int b = i + 1; b < primerGrupo; b++)
            {
                if(segundoGrupo == primerGrupo && primerGrupo > 3)
                {
                    banderaCentroNumerico = true;
                    break;
                }

                segundoGrupo += b;
            }
            if(banderaCentroNumerico)
            {
                centrosNumericos.add(i);
            }
                           
        }
        
        System.out.println("Centros numericos: ");

        for(int numero : centrosNumericos)
        {
            System.out.print(" " + numero);            
        }
    }



}
