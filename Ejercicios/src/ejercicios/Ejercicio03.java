/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

/**
 *
 * @author TaisBalcazar
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double calificacion;
        String nombre;

        int i = 1;
        try {

            while (i <= 4) {
                System.out.println("Ingrese calificación: ");
                calificacion = entrada.nextDouble();

                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("Intente de nuevo, calificacion fuera de rango");
                }
                System.out.println("Ingrese nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();

                if (nombre.equals("Mario") || nombre.equals("Pedro")
                        || nombre.equals("Luis") || nombre.equals("Ana")
                        || nombre.equals("Carolina")) {
                    throw new Exception("El nombre no es permitido ");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }

            System.out.printf("%s\n", "Gracias por usar el sistema");
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
