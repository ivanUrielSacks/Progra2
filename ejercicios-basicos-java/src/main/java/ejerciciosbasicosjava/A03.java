package ejerciciosbasicosjava;

import java.util.Scanner;

public class A03 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double num;

        System.out.println("Ingresa un numero:");
        num = input.nextDouble();

        if (num <= 1) 
        {
            System.out.println("El numero debe ser mayor a uno para que haya primos");
        }
        else 
        {
            System.out.println("Numeros primos:");

            for (int n = 2; n <= (int)num; n++) {
                boolean esPrimo = true;

                for (int i = 2; i <= Math.sqrt(n); i++) 
                {
                    if (n % i == 0)
                    {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo)
                {
                    System.out.print(n + " ");
                }
            }
        }

        input.close();
    }
}
