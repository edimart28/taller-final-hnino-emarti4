import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menuscanner = new Scanner(System.in);
        int menu;
        int subMenu;


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
                    System.out.println("-                          1. byte                                      -");
                    System.out.println("-                          2. short                                     -");
                    System.out.println("-                          3. int                                       -");
                    System.out.println("-                          4. long                                      -");
                    System.out.println("-                          5. float                                     -");
                    System.out.println("-                          6. double                                    -");
                    System.out.println("-                          7. char                                      -");
                    System.out.println("-                          8. boolean                                   -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");
                    while (!menuscanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        menuscanner.next();
                        System.out.println("Ingrese una sub opcion");


                    }

                    subMenu = menuscanner.nextInt();
                    switch (subMenu) {
                        case 0:
                            System.out.println("\n!Gracias¡");
                            System.exit(0);
                            break;

                        case 1:

                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("                           BYTE                                          ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-        El tipo de dato byte se utiliza para almacenar valores         -");
                            System.out.println("-        numéricos enteros pequeños.                                    -");
                            System.out.println("-        Rango: -128 a 127.                                             -");
                            System.out.println("-        Ejemplo:                                                       -");
                            System.out.println("-                          byte edad = 26                               -");
                            System.out.println("-------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("                           SHORT                                         ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-        Se tipo de dato short se utiliza cuando se necesita un rango   -");
                            System.out.println("-        más amplio que el proporcionado por los bytes.                 -");
                            System.out.println("-        Rango: -32768 a 32767.                                         -");
                            System.out.println("-        Ejemplo:                                                       -");
                            System.out.println("-                          short año = 2024;                            -");
                            System.out.println("-------------------------------------------------------------------------");
                            break;

                        case 3:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           INT                                            ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-        Es un tipo de dato que representa números enteros, es decir,    -");
                            System.out.println("-        números sin parte decimal, estos pueden ser positivos, negativos-");
                            System.out.println("-        o cero.                                                         -");
                            System.out.println("-        Rango: -2,147,483,648 a 2,147,483,647                           -");
                            System.out.println("-        Ejemplo:                                                        -");
                            System.out.println("-                          int valorTotal = 21456                        -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 4:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           LONG                                           ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-      El tipo de dato long se utiliza para representar números enteros  -");
                            System.out.println("-      que requieren un rango mayor que el proporcionado por un tipo int -");
                            System.out.println("-      Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807     -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         long token = 214562565454                      -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 5:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           FLOAT                                          ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-      El tipo de dato float se utiliza para representar números reales  -");
                            System.out.println("-      (decimales)                                                       -");
                            System.out.println("-      Precisòn: De 6 a 7 digitos.                                       -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         float TRM = 4021.63                            -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 6:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           DOUBLE                                         ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato double se utiliza para representar números con mayor  -");
                            System.out.println("-  exactitud y un rango más amplio en comparación con el tipo float      -");
                            System.out.println("-      Precisòn: De 15 a 17 digitos.                                     -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         double Temperatura = 28.635464646              -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 7:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           CHAR                                           ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato char se utiliza para representar un solo              -");
                            System.out.println("-  carácter, como una letra, un dígito, un símbolo o un espacio.         -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         char Nota = B                                  -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 8:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           BOOLEAN                                        ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato boolean se usa para representar valores de dos        -");
                            System.out.println("-  posibles estados lógicos: true (verdadero) y false (falso).           -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                   boolean contraseñaCorrecta = false                   -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;

                    }

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


                    System.out.print("Presione enter para continuar...");
                    menuscanner.nextLine();
                    menuscanner.nextLine();

            }


        } while (menu != 0);

        menuscanner.close();


    }

}