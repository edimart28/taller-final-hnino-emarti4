import conceptos.*;
import funciones.Funciones;
import menus.Menu;
import menus.SubMenu;
import programas.Ejercicios;

import java.util.Scanner;



public class Main {

    public static String entersubMenu = "Ingrese Enter para volver al menu anterior...";
    public static String  enterMenu= "Presione enter para continuar...";
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                DatosPrimitivos.conceptosShort();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 3:
                                DatosPrimitivos.conceptosInt();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 4:
                                DatosPrimitivos.conceptoLong();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 5:
                                DatosPrimitivos.conceptoFloat();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 6:
                                DatosPrimitivos.conceptoDouble();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 7:
                                DatosPrimitivos.conceptoChair();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 8:
                                DatosPrimitivos.conceptoBoolean();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                TipoOperadores.conceptoRelacionales();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 3:
                                TipoOperadores.conceptoLogicos();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 4:
                                TipoOperadores.conceptoAsignacion();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 5:
                                TipoOperadores.conceptoIncremento();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Condicionales.conceptoElseIf();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 3:
                                Condicionales.conceptoElse();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 4:
                                Ejercicios.programaIf();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Ejercicios.programaSwitch(menuscanner);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Ejercicios.programaTernaria(menuscanner);
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Ejercicios.programaDoWhile();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Ejercicios.programaWhile();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
                                break;
                            case 2:
                                Ejercicios.programafor();
                                Funciones.funcionScannerEnter(menuscanner,entersubMenu);
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

            Funciones.funcionScannerEnter(menuscanner,enterMenu);

        } while (menu != 0);

        menuscanner.close();

    }
}