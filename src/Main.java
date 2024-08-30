import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menuscanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-                        MENÚ CAPÍTULO DE PROGRAMACIÓN                        -");
            System.out.println("-                        HEIDY NIÑO - EDINSON MARTINEZ                        -");
            System.out.println("-                               HNINO - EMARTI4                               -");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("-         1.	Datos Primitivos                                              -");
            System.out.println("-         2.	String.                                                       -");
            System.out.println("-         3.	Constantes.                                                   -");
            System.out.println("-         4.	Operadores.                                                   -");
            System.out.println("-         5.	Condicional IF, ELSE IF y ELSE.                               -");
            System.out.println("-         6.	Condicional Switch.                                           -");
            System.out.println("-         7.	Condicional ternaria.                                         -");
            System.out.println("-         8.	Bucle Do While.                                               -");
            System.out.println("-         9.	Bucle While.                                                  -");
            System.out.println("-         10.	Bucle For.                                                    -");
            System.out.println("-                                                                             -");
            System.out.println("-      0.	Salir                                                             -");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Digite su opción: ");

            while (!menuscanner.hasNextInt()) {
                System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                menuscanner.next();
                System.out.print("Digite su opción: ");
            }


            menu = menuscanner.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("\n!Gracias¡");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                              DATOS PRIMITIVOS                               -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                   STRING                                    -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 CONSTANTES                                  -");
                    System.out.println("-------------------------------------------------------------------------------");

                    break;
                case 4:

                    int menuop;
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                OPERADORES                                   -");
                    System.out.println("-------------------------------------------------------------------------------");

                    break;
                case 5:

                    int menuif;
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                        CONDICIONAL IF, ELSE IF Y ELSE                       -");
                    System.out.println("-------------------------------------------------------------------------------");
                                        break;

                case 6:

                    int menusw;
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                             CONDICIONAL SWITCH                              -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case 7:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                            CONDICIONAL TERNARIA                             -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                               BUCLE DO WHILE                                -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 BUCLE WHILE                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 10:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 BUCLE WHILE                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Número no válido, por favor verifique.");

            }

            System.out.print("Presione enter para continuar...");
            menuscanner.nextLine();
            menuscanner.nextLine();

        }
        while (menu != 0) ;

        menuscanner.close();

    }
}