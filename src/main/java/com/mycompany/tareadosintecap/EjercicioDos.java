
package com.mycompany.tareadosintecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioDos {

    public void positivoNegativo() {
        int n;
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n = sp.nextInt();
        if (n > 0) {
            System.out.println("El numero es POSITIVO");
        } else {
            System.out.println("El numero es NEGATIVO");
        }
    }
}
