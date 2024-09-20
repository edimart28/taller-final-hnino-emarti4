package funciones;

import java.util.Scanner;

public class Funciones {

    public static void funcionOpcionNoValida() {

        System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
        System.out.print("Digite su opción: ");

    }

    public static void funcionSalir() {
        System.out.println("\n!Gracias¡");
        System.exit(0);
    }

    public static void funcionScannerEnter(Scanner scanner) {
        System.out.print("          Ingrese Enter para volver al menu anterior   " +
                "                  ");
        scanner.nextLine();
        scanner.nextLine();

    }

}











