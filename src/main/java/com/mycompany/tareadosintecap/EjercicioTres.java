
package com.mycompany.tareadosintecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioTres {
    public void mayorMenor (){
        int n, m;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n = sp.nextInt();
        System.out.println("Ingrese el segundo numero");
        m = sp.nextInt();
        if (n > m) {
            System.out.println("Los numeros ordenados de mayor a menor: " + n +", "+ m);
        } else {
            System.out.println("Los numeros ordenados de mayor a menor: " + m + ", " + n);
        }
    }
}
