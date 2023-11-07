
package com.mycompany.tareadosintecap;

import java.util.Scanner;

/**
 *
 * @author Emerson
 */
public class EjercicioQuinto {
    public void fecha(){
        Scanner tc = new Scanner(System.in);
        int dia, mes, anio;
        System.out.print("Ingresa el día: ");
        dia = tc.nextInt();
        System.out.print("Ingresa el mes: ");
        mes = tc.nextInt();
        System.out.print("Ingresa el año: ");
        anio = tc.nextInt();

        boolean esFechaValida = validarFecha(dia, mes);
        if (esFechaValida) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada es inválida.");
        }
    }

    private static boolean validarFecha(int dia, int mes) {
        if (mes >= 1 && mes <= 12) {
            if (dia >= 1 && dia <= 31) {
                // Verificar si el mes tiene 30 o 28 días
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                    return false;
                }
                if (mes == 2 && dia > 28) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
