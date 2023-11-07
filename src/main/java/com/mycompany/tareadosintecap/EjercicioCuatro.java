
package com.mycompany.tareadosintecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioCuatro {
    public void ordenamiento(){
        int n, m, p;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        n = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        m = sp.nextInt();
        System.out.println("Ingrese tercer numero");
        p = sp.nextInt();
        if (n > m && n > p && m > p) {
            System.out.println("Los numeros ordenados de mayor a menor: " + n + "," + m + "," + p);
        } else if (m > n && m > p && n > p) {
            System.out.println("Los numeros ordenados de mayor a menor: " + m + "," + n + "," + p);
        } else if (p > m && p > n && m > n) {
            System.out.println("Los numeros ordenados de mayor a menor: " + p + "," + m + "," + n);
        } else if (m > n && m > p && p > n) {
            System.out.println("Los numeros ordenados de mayor a menor: " + m + "," + p + "," + n);
        } else if (p > m && p > n && n > m) {
            System.out.println("Los numeros ordenados de mayor a menor: " + p + "," + n + "," + m);
        } else if (n > m && n > p && p > m) {
            System.out.println("Los numeros ordenados de mayor a menor: " + n + "," + p + "," + m);
        }
    } 
}
