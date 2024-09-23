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


    public static void funcionScannerEnter(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void funcionDigiteSuOpcion() {
        System.out.print("Digite su opción: ");
    }

    public static void volviendoAlMenuPrincipal() {
        System.out.println("Volviendo al menú principal...");
    }

    public static void numeroNoValido() {
        System.out.println("Número no válido, por favor verifique.");

    }


}











