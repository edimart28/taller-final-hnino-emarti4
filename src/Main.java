import conceptos.*;
import funciones.Funciones;
import menus.Menu;
import menus.SubMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menuscanner = new Scanner(System.in);

        int menu;
        int subMenu;
        int menuop;
        int menuif;
        int menusw;

        do {

            Menu.menuPrincipal();

            Funciones.funcionDigiteSuOpcion();

            while (!menuscanner.hasNextInt()) {

                Funciones.funcionOpcionNoValida();
                menuscanner.next();
            }


            menu = menuscanner.nextInt();

            switch (menu) {
                case 0:
                    Funciones.funcionSalir();
                    break;

                case 1:
                    boolean volverAlMenuPrincipal = false;

                    while (!volverAlMenuPrincipal) {

                        DatosPrimitivos.conceptoDatosPrimitivos();
                        SubMenu.subMenu();

                        Funciones.funcionDigiteSuOpcion();


                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }

                        subMenu = menuscanner.nextInt();

                        switch (subMenu) {
                            case 0:
                                Funciones.funcionSalir();
                                break;

                            case 1:
                                DatosPrimitivos.conceptosByte();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:

                                DatosPrimitivos.conceptosShort();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 3:
                                DatosPrimitivos.conceptosInt();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 4:

                                DatosPrimitivos.conceptoLong();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 5:
                                DatosPrimitivos.conceptoFloat();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 6:
                                DatosPrimitivos.conceptoDouble();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 7:
                                DatosPrimitivos.conceptoChair();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 8:
                                DatosPrimitivos.conceptoBoolean();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 9:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrincipal = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                //System.exit(0); //Opcion para que finalice al ingresar numero no valido.
                                break;
                        }
                    }
                    break;


                case 2:
                    Cstring.conceptosString();
                    break;

                case 3:
                    Constantes.conceptosConstantes();
                    break;

                case 4:
                    boolean volverAlMenuPrinci = false;
                    while (!volverAlMenuPrinci) {

                        TipoOperadores.conceptoOpradores();

                        SubMenu.subMenuOperadores();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }

                        menuop = menuscanner.nextInt();

                        switch (menuop) {
                            case 0:
                                Funciones.funcionSalir();
                                break;

                            case 1:
                                TipoOperadores.conceptoAritmeticos();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:
                                TipoOperadores.conceptoRelacionales();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 3:
                                TipoOperadores.conceptoLogicos();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 4:
                                TipoOperadores.conceptoAsignacion();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 5:
                                TipoOperadores.conceptoIncremento();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 6:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrinci = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                break;
                        }

                    }
                    break;


                case 5:
                    boolean volverAlMenuPrincip = false;
                    while (!volverAlMenuPrincip) {
                        Condicionales.conceptoIfElse();

                        SubMenu.subMenuIf();
                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }

                        menuif = menuscanner.nextInt();

                        switch (menuif) {

                            case 0:
                                Funciones.funcionSalir();
                                break;

                            case 1:
                                Condicionales.conceptoIf();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:
                                Condicionales.conceptoElseIf();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 3:
                                Condicionales.conceptoElse();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 4:
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

                                Funciones.funcionScannerEnter(menuscanner);
                                break;


                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrincip = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                System.out.println("");
                                //System.exit(0);
                                break;
                        }

                    }
                    break;


                case 6:
                    boolean volverAlMenuPrincipa = false;
                    while (!volverAlMenuPrincipa) {

                        SubMenu.subMenuSwitc();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }

                        menusw = menuscanner.nextInt();

                        switch (menusw) {

                            case 0:
                                Funciones.funcionSalir();
                                break;

                            case 1:
                                Condicionales.conceptoSwitc();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:
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
                                        Funciones.funcionScannerEnter(menuscanner);
                                        break;
                                    case 3:
                                    case 4:
                                        System.out.println("    * Su calificacion es D");
                                        System.out.println("");
                                        Funciones.funcionScannerEnter(menuscanner);
                                        break;
                                    case 5:
                                    case 6:
                                        System.out.println("    * Su calificacion es C");
                                        System.out.println("");
                                        Funciones.funcionScannerEnter(menuscanner);
                                        break;
                                    case 7:
                                    case 8:
                                        System.out.println("    * Su calificacion es B");
                                        System.out.println("");
                                        Funciones.funcionScannerEnter(menuscanner);
                                        break;
                                    case 9:
                                    case 10:
                                        System.out.println("    * Su calificacion es A");
                                        System.out.println("");
                                        Funciones.funcionScannerEnter(menuscanner);
                                        break;

                                    default:
                                        System.out.println("Número no válido, por favor verifique.");
                                        System.out.println("");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrincipa = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                System.out.println("");

                                break;
                        }
                    }
                    break;


                case 7:
                    boolean volverAlMenuPri = false;
                    while (!volverAlMenuPri) {

                        SubMenu.subMenuTernarias();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 0:
                                Funciones.funcionSalir();
                                break;
                            case 1:
                                Condicionales.conceptoTernaria();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:
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
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPri = true;

                                break;

                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                break;
                        }
                    }
                    break;


                case 8:
                    boolean volverAlMenuPr = false;
                    while (!volverAlMenuPr) {

                        SubMenu.subMenuDoWhile();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 0:
                                Funciones.funcionSalir();
                                break;

                            case 1:

                                Ciclos.conceptoDoWhile();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 2:
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
                                Funciones.funcionScannerEnter(menuscanner);
                                break;


                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPr = true;
                                break;

                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                break;
                        }

                    }
                    break;


                case 9:
                    boolean volverAlMenuP = false;
                    while (!volverAlMenuP) {

                        SubMenu.subMenuWhile();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 0:
                                Funciones.funcionSalir();
                                break;
                            case 1:

                                Ciclos.conceptoWhile();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;


                            case 2:
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
                                System.out.print("                  Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuP = true;
                                break;

                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                break;
                        }
                    }
                    break;


                case 10:
                    boolean volverAlMenu = false;
                    while (!volverAlMenu) {

                        SubMenu.subMenuFor();

                        Funciones.funcionDigiteSuOpcion();

                        while (!menuscanner.hasNextInt()) {
                            Funciones.funcionOpcionNoValida();
                            menuscanner.next();
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 0:
                                Funciones.funcionSalir();
                                break;
                            case 1:

                                Ciclos.conceptoFor();
                                Funciones.funcionScannerEnter(menuscanner);
                                break;


                            case 2:
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
                                Funciones.funcionScannerEnter(menuscanner);
                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenu = true;
                                break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion no valida, inicie nuevamente");
                    break;
            }

            System.out.print("Presione enter para continuar..." );
            menuscanner.nextLine();
            menuscanner.nextLine();

        } while (menu != 0);

        menuscanner.close();

    }

}