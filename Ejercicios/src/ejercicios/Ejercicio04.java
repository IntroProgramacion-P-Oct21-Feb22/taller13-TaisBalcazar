/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double sueldo;
        String nombre;
        double[] arregloSueldos;
        int numeroDatosArreglo;
        int i = 1;
        int j;

        try {
            while (i <= 4) {
                System.out.printf("Datos para usuario %d\n", i);

                System.out.println("Cuantos sueldos quiere agregar al arreglo");
                numeroDatosArreglo = entrada.nextInt();
                if (numeroDatosArreglo < 0 || numeroDatosArreglo > 5) {
                    throw new Exception("La cantidad de sueldos a ingresar"
                            + " esta  fuera del rango permitido");
                }
                arregloSueldos = new double[numeroDatosArreglo];
                j = 0;
                while (j < arregloSueldos.length) {
                    System.out.printf("agregue sueldo %d para usuario %d\n",
                            j, i);
                    sueldo = entrada.nextDouble();
                    
                    /* Agregar una excepción de tipo InputMismatchException, 
                       lanzar una Excepción cuando la nota ingresa por el usuario
                       sea mayor a 10 o menor a 0.
                       Profe, un sueldo tiene que ser mayor a 10, por eso le puse
                       que la restriccion sea menor a 1000
                    */ 
                    if (sueldo < 0 || sueldo > 1000) {
                        throw new Exception("Sueldo fuera de rango");
                    }
                    arregloSueldos[j] = sueldo;
                    j = j + 1;
                }

                for (int k = 0; k < arregloSueldos.length; k++) {
                    System.out.printf("Sueldo ingresado: %.3f\n", arregloSueldos[k]);
                }
                i = i + 1;
            }
        } catch (InputMismatchException e) {
            System.out.printf("Ocurrió un error de tipo %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió un error %s\n", e);

            System.out.printf("%s\n", "Gracias por usar el sistema");
        }
    }
}
