package programas;

import funciones.Funciones;

import java.util.Scanner;

public class Ejercicios {

    public static String entersubMenu = "Ingrese Enter para volver al menu anterior...";
    public static String  enterMenu= "Presione enter para continuar...";

    public static void programaIf() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                 PROGRAMA                                    -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-    Programa que muestra el ciclo vital el cual se divide en diferentes      -");
        System.out.println("-    etapas del desarrollo humano, este se realiza utilizando                 -");
        System.out.println("-    el if, else if y else.                                                   -");
        System.out.println("-------------------------------------------------------------------------------");

        int edad;

        System.out.print("                        Ingresar la edad:");
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("      * Edad no validad");
            System.out.println("");
        } else if (edad >= 0 && edad <= 5) {
            System.out.println("      * Primera infancia");
            System.out.println("");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("      * Infancia");
            System.out.println("");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("      * Adolecencia");
            System.out.println("");
        } else if (edad >= 19 && edad <= 26) {
            System.out.println("      * Juventud");
            System.out.println("");
        } else if (edad >= 27 && edad <= 59) {
            System.out.println("      * Adultez");
            System.out.println("");
        } else
            System.out.println("      * Vejez");
        System.out.println("");

    }
    public static void programaSwitch(Scanner menuscanner) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                 PROGRAMA                                    -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-    Programa que de acuerdo con la calificación numérica ingresada indica    -");
        System.out.println("-    en que categoría se encuentra la nota entre el rango del 1 al 10.        -");
        System.out.println("-                                                                             -");


        Scanner scanner = new Scanner(System.in);
        System.out.print("             Ingrese el numero de su calificación:");


        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 1:
            case 2:
                System.out.println("    * Su calificacion es F");
                System.out.println("");
                Funciones.funcionScannerEnter(menuscanner,enterMenu);
                break;
            case 3:
            case 4:
                System.out.println("    * Su calificacion es D");
                System.out.println("");
                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                break;
            case 5:
            case 6:
                System.out.println("    * Su calificacion es C");
                System.out.println("");
                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                break;
            case 7:
            case 8:
                System.out.println("    * Su calificacion es B");
                System.out.println("");
                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                break;
            case 9:
            case 10:
                System.out.println("    * Su calificacion es A");
                System.out.println("");
                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                break;

            default:
                System.out.println("Número no válido, por favor verifique.");
                System.out.println("");
                break;
        }
    }

    public static void programaTernaria(Scanner menuscanner) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-                               PROGRAMA                                       -");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("- Validacion numero mayor entre dos valores.                                   -");
        System.out.println("--------------------------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int valor1 = menuscanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int valor2 = menuscanner.nextInt();


        int mayor = (valor1 > valor2) ? valor1 : valor2;
        System.out.println("El mayor es: " + mayor);

    }

    public static void programaDoWhile() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                               PROGRAMA                                      -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-      Realizar la suma de los numero del 1 al 10.                            -");
        System.out.println("-------------------------------------------------------------------------------");


        int suma = 0;
        int i = 1;

        do {
            System.out.println("La suma en esta iteracion es: " + suma);
            suma += i;

            i++;

        } while (i <= 10);


        System.out.println("La suma total es: " + suma);
        System.out.println("");
    }

    public static void programaWhile() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-                               PROGRMA                                           -");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("-      Realizar la suma de los numero del 1 al 10.                                -");
        System.out.println("-----------------------------------------------------------------------------------");

        int suma = 0;
        int i = 1;

        while (i <= 10) {
            suma += i;

            i++;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("");

    }

    public static void programafor() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                               PROGRAMA                                      -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-      Realizar la suma de los numero del 1 al 10.                            -");
        System.out.println("-------------------------------------------------------------------------------");

        int suma = 0;


        for (int i = 1; i <= 10; i++) {
            suma += i;

            System.out.println("La sumatoria de los numeros enteros entre 1 y 10 es " + suma);
            System.out.println("");

        }
    }

}
