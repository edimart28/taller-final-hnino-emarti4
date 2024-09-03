import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner menuscanner = new Scanner(System.in);

        int menu;
        int subMenu;
        int menuif;
        int menusw;

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
                    System.out.println("-  Son aquellos que no poseen métodos ni propiedades. Además, los valores     -");
                    System.out.println("-  asignados con estos tipos de datos son inmutables, lo que quiere decir que -");
                    System.out.println("-  después de asignar una variable a un valor primitivo, si deseas cambiar su -");
                    System.out.println("-  valor necesitaras reasignarle un valor nuevo, ya que su valor inicial no   -");
                    System.out.println("-  puede ser modificado, simplemente se substituye con el nuevo valor.        -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                1. Byte                                      -");
                    System.out.println("-                                2. Short                                     -");
                    System.out.println("-                                3. Int                                       -");
                    System.out.println("-                                4. Long                                      -");
                    System.out.println("-                                5. Float                                     -");
                    System.out.println("-                                6. Double                                    -");
                    System.out.println("-                                7. Char                                      -");
                    System.out.println("-                                8. Boolean                                   -");
                    System.out.println("-      12. Salir                                                              -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    while (!menuscanner.hasNextInt()) {
                        System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                        menuscanner.next();
                        System.out.print("Digite su opción: ");
                    }

                    subMenu = menuscanner.nextInt();

                    switch (subMenu) {
                        case 12:
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
                            System.out.println("Número no válido, por favor verifique.");
                            break;
                    }
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
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                OPERADORES                                   -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case 5:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                        CONDICIONAL IF, ELSE IF Y ELSE                       -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Las estructuras de control establecen condicionales en nuestros código.    -");
                    System.out.println("-  Por ejemplo, qué condiciones deben cumplirse para realizar una operación   -");
                    System.out.println("-  o qué debe ocurrir para ejecutar una función.                              -");
                    System.out.println("-                                                                             -");
                    System.out.println("-         1.	If.                                                           -");
                    System.out.println("-         2.	Else if.                                                      -");
                    System.out.println("-         3.	Else.                                                         -");
                    System.out.println("-         4.	Programa                                                      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    while (!menuscanner.hasNextInt()) {
                        System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                        menuscanner.next();
                        System.out.print("Digite su opción: ");
                    }

                    menuif = menuscanner.nextInt();

                    switch (menuif) {

                        case 1:
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-                                     IF                                      -");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-  La sentencia if en Java se utiliza para evaluar una condición y ejecutar   -");
                            System.out.println("-  cierto código solo si la condición se cumple.                              -");
                            System.out.println("-                                                                             -");
                            System.out.println("-------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-                                  ELSE IF                                    -");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-  La sentencia else if en Java es una extensión de la sentencia if-else que  -");
                            System.out.println("-  permite especificar múltiples condiciones de control de flujo en un solo   -");
                            System.out.println("-  bloque de código. Es similar a la sentencia if-else, pero permite          -");
                            System.out.println("-  especificar varias condiciones adicionales antes de llegar a la sentencia  -");
                            System.out.println("-  else final.                                                                -");
                            System.out.println("-                                                                             -");
                            System.out.println("-------------------------------------------------------------------------------");
                            break;

                        case 3:
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-                                   ELSE                                      -");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-  La sentencia else en Java se usa junto con la sentencia if para            -");
                            System.out.println("-  especificar un bloque de código que se ejecutará si la condición           -");
                            System.out.println("-  especificada en la sentencia if es falsa.                                  -");
                            System.out.println("-                                                                             -");
                            System.out.println("-------------------------------------------------------------------------------");
                            break;

                        case 4:
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-                                 PROGRAMA                                    -");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-    Programa que muestra el ciclo vital el cual se divide en diferentes      -");
                            System.out.println("-    etapas del desarrollo humano, este se realiza utilizando                 -");
                            System.out.println("-    el if, else if y else.                                                   -");
                            System.out.println("-                                                                             -");

                            int edad;

                            System.out.print("                        Ingresar la edad:");
                            Scanner scanner = new Scanner(System.in);
                            edad = scanner.nextInt();

                            if (edad < 0) {
                                System.out.println("      * Edad no validad");
                                System.out.println("                                                                        ");
                            } else if (edad >= 0 && edad <= 5) {
                                System.out.println("      * Primera infancia");
                                System.out.println("                                                                        ");
                            } else if (edad >= 6 && edad <= 11) {
                                System.out.println("      * Infancia");
                                System.out.println("                                                                        ");
                            } else if (edad >= 12 && edad <= 18) {
                                System.out.println("      * Adolecencia");
                                System.out.println("                                                                        ");
                            } else if (edad >= 19 && edad <= 26) {
                                System.out.println("      * Juventud");
                                System.out.println("                                                                        ");
                            } else if (edad >= 27 && edad <= 59) {
                                System.out.println("      * Adultez");
                                System.out.println("                                                                        ");
                            } else
                                System.out.println("      * Vejez");
                            System.out.println("                                                                        ");
                            break;

                        default:
                            System.out.println("Número no válido, por favor verifique.");
                            System.out.println("                                                                        ");
                            break;

                    }
                    break;

                case 6:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                             CONDICIONAL SWITCH                              -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-         1.	Switch.                                                       -");
                    System.out.println("-         2.	Programa                                                      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Digite su opción: ");

                    while (!menuscanner.hasNextInt()) {
                        System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                        menuscanner.next();
                        System.out.print("Digite su opción: ");
                    }

                    menusw = menuscanner.nextInt();

                    switch (menusw) {

                        case 1:
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-                                 SWITCH                                      -");
                            System.out.println("-------------------------------------------------------------------------------");
                            System.out.println("-  El condicional switch case es una estructura que evalúa más de un caso     -");
                            System.out.println("-  y se caracteriza por:                                                      -");
                            System.out.println("-																			  -");
                            System.out.println("-    * Selección de una opción entre varias.                                  -");
                            System.out.println("-    * Switch recibe un “caso” y lo evalúa hasta encontrar el caso que        -");
                            System.out.println("-      corresponda.                                                           -");
                            System.out.println("-    * Se puede usar la opción “default” para cuando no se encuentra el       -");
                            System.out.println("-      caso dado.                                                             -");
                            System.out.println("-																			  -");
                            System.out.println("-  Este condicional es útil a la hora de definir por ejemplo un menú de       -");
                            System.out.println("-  usuario en aplicaciones que se ejecutan por consola.                       -");
                            System.out.println("-                                                                             -");
                            System.out.println("-------------------------------------------------------------------------------");
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
                                    break;
                                case 3:
                                case 4:
                                    System.out.println("    * Su calificacion es D");
                                    System.out.println("");
                                    break;
                                case 5:
                                case 6:
                                    System.out.println("    * Su calificacion es C");
                                    System.out.println("");
                                    break;
                                case 7:
                                case 8:
                                    System.out.println("    * Su calificacion es B");
                                    System.out.println("");
                                    break;
                                case 9:
                                case 10:
                                    System.out.println("    * Su calificacion es A");
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Número no válido, por favor verifique.");
                                    System.out.println("");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Número no válido, por favor verifique.");
                            System.out.println("");
                            break;
                    }
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
                    break;

            }

            System.out.print("Presione enter para continuar...");
            menuscanner.nextLine();
            menuscanner.nextLine();

        } while (menu != 0);

        menuscanner.close();


    }

}