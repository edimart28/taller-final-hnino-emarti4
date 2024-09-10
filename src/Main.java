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
                    boolean volverAlMenuPrincipal = false;
                    while (!volverAlMenuPrincipal) {
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
                        System.out.println("-                                9. Volver menu principal                     -");
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                      ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                      ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                      ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("          Ingrese Enter para volver al menu anterior                      ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 9:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrincipal = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                break;

                        }
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                   STRING                                    -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  El tipo de dato String representa cadenas de texto, que pueden ser         -");
                    System.out.println("-  escritas utilizando comillas simples, dobles o acentos graves (backticks). -");
                    System.out.println("-  Los acentos graves permiten crear plantillas literales (template literals) -");
                    System.out.println("-  que incluyen interpolación de variables y expresiones.                     -");
                    System.out.println("-                                                                             -");
                    System.out.println("-  Ejemplo                                                                    -");
                    System.out.println("-          comillasSimples = 'Hola, mundo!';                                  -");
                    System.out.println("-          plantillaLiteral = `Mi número favorito es ${entero}`;              -");
                    System.out.println("-          caracteresEscape = 'Texto con \"comillas\" y salto de línea';      -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-                                 CONSTANTES                                  -");
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("-  Es un tipo especial de variable cuyo valor no puede ser modificado una     -");
                    System.out.println("-  vez que ha sido asignado. A diferencia de las variables regulares, que se  -");
                    System.out.println("-  pueden actualizar a lo largo de la ejecución de un programa, las           -");
                    System.out.println("-  constantes mantienen su valor original durante toda su vida útil.          -");
                    System.out.println("-                                                                             -");
                    System.out.println("-  Ejemplo                                                                    -");
                    System.out.println("-               const nombreConstante = valorInicial;                         -");
                    System.out.println("-                         const PI = 3.14159;                                 -");
                    System.out.println("-------------------------------------------------------------------------------");
                    break;

                case 4:
                    boolean volverAlMenuPrinci = false;
                    while (!volverAlMenuPrinci) {
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("-                                OPERADORES                                               -");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("-  Un operador representa un símbolo que permite realizar operaciones                     -");
                        System.out.println("-  aritméticas, relacionar elementos o hacer preguntas donde se involucra                 -");
                        System.out.println("-  más de una condición.                                                                  -");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("-                            TIPO  DE OPERADORES                                          -");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("-                       1.	Aritméticos.                                                  -");
                        System.out.println("-                       2.	Relacionales.                                                 -");
                        System.out.println("-                       3.	Lógicos.                                                      -");
                        System.out.println("-                       4.	Asignacion.                                                   -");
                        System.out.println("-                       5.	Incremento / Decremento.                                      -");
                        System.out.println("-                       6.	Volver al menu principal                                      -");
                        System.out.println("-      12. Salir                                                                          -");
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.print("Digite su opción: ");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.print("Digite su opción: ");
                        }

                        menuop = menuscanner.nextInt();

                        switch (menuop) {
                            case 12:
                                System.out.println("\n!Gracias¡");
                                System.exit(0);
                                break;

                            case 1:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                ARITMETICOS                                  -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                                                             -");
                                System.out.println("-  |     OPERADOR     |           DESCRIPCIÓN            |     EJEMPLO     |  -");
                                System.out.println("-  |Suma (+)          |Este operador suma dos números y  |   8 = 5 + 3     |  -");
                                System.out.println("-  |                  |devuelve el resultado.            |                 |  -");
                                System.out.println("-  |Resta (-)         |Este operador resta el segundo    |   2 = 5 - 3     |  -");
                                System.out.println("-  |                  |número del primero y devuelve el  |                 |  -");
                                System.out.println("-  |				  |resultado.                        |                 |  -");
                                System.out.println("-  |Multiplicación(*) |Este operador multiplica dos      |  15 = 5 * 3     |  -");
                                System.out.println("-  |                  |números y devuelve el resultado.  |                 |  -");
                                System.out.println("-  |División (/)      |Este operador divide el primer    |   2 = 6 / 3     |  -");
                                System.out.println("-  |                  |número por el segundo y devuelve  |                 |  -");
                                System.out.println("-  |				  |el resultado.                     |                 |  -");
                                System.out.println("-  |Módulo (%)        |Este operador devuelve el residuo |   2 = 5 % 3     |  -");
                                System.out.println("-  |                  |de la división del primer número  |                 |  -");
                                System.out.println("-  |				  |entre el segundo.                 |                 |  -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                  Ingrese Enter para volver al menu anterior                   ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                              RELACIONALES                                   -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                                                             -");
                                System.out.println("-  |     OPERADOR     |           DESCRIPCIÓN            |     EJEMPLO      | -");
                                System.out.println("-  |Igual (==)        | Devuelve true si los operandos   |     3 == '3'     | -");
                                System.out.println("-  |                  | son iguales.                     |                  | -");
                                System.out.println("-  |Diferente (!=)    | Devuelve true si los operandos   |   var1 != 4      | -");
                                System.out.println("-  |                  |  no son iguales.	             |                  | -");
                                System.out.println("-  |Mayor que (>)     | Devuelve true si el operando     |   var2 > var1    | -");
                                System.out.println("-  |                  | izquierdo es mayor que el        |    12  > 2       | -");
                                System.out.println("-  |				  |operando derecho.                 |                  | -");
                                System.out.println("-  |Mayor o igual que | Devuelve true si el operando     |   var2 >= var1   | -");
                                System.out.println("-  |(>=)              | izquierdo es mayor o igual que   |     var1 >= 3    | -");
                                System.out.println("-  |				  | el operando derecho.             |                  | -");
                                System.out.println("-  |Menor que (<)     | Devuelve true si el operando     |   var1 < var2    | -");
                                System.out.println("-  |                  | izquierdo es menor que el        |    2   < 12      | -");
                                System.out.println("-  |				  | operando derecho.                |                  | -");
                                System.out.println("-  |Menor o igual que | Devuelve true si el operando     |   var1 <= var2   | -");
                                System.out.println("-  |(<=)              | izquierdo es menor o igual que   |     var2 <= 5    | -");
                                System.out.println("-  |				  | el operando derecho.             |                  | -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 3:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                   LOGICOS                                   -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                                                             -");
                                System.out.println("-  |    OPERADOR   |           DESCRIPCION            |       EJEMPLO      |  -");
                                System.out.println("-  |AND (&&)       |Este operador devuelve true si    |                    |  -");
                                System.out.println("-  |               |ambas expresiones booleanas son   |                    |  -");
                                System.out.println("-  |			   |true. De lo contrario, devuelve   |                    |  -");
                                System.out.println("-  |			   |false.                            |                    |  -");
                                System.out.println("-  |OR (||)        |Este operador devuelve true si al |                    |  -");
                                System.out.println("-  |               |menos una de las expresiones      |                    |  -");
                                System.out.println("-  |			   |booleanas es true. De lo          |                    |  -");
                                System.out.println("-  |			   |contrario, devuelve false.        |                    |  -");
                                System.out.println("-  |               |                                  |                    |  -");
                                System.out.println("-  |NOT (!)        |Este operador invierte el valor   |                    |  -");
                                System.out.println("-  |               |booleano de la expresión a la que |                    |  -");
                                System.out.println("-  |			   |se aplica. Si la expresión es     |                    |  -");
                                System.out.println("-  |			   |true, devuelve false, y viceversa.|                    |  -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 4:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                 ASIGNACION                                  -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 5:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                          INCREMENTO / DECREMENTO                            -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-  |    OPERADOR      |          DESCRIPCION             |     EJEMPLO     |  -");
                                System.out.println("-  |Incremento (++)   |Este operador se utiliza para     |  int a = 5;a++; |  -");
                                System.out.println("-  |                  |incrementar en uno el valor de    |     Res = 6     |  -");
                                System.out.println("-  |				  |una variable.                     |                 |  -");
                                System.out.println("-  |Decremento (--)   |Este operador se utiliza para     |  int a = 5;a--; |  -");
                                System.out.println("-  |                  |decrementar en uno el valor de    |     Res = 4     |  -");
                                System.out.println("-  |				  |una variable.                     |                 |  -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                Ingrese Enter para volver al menu anterior                     ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                        System.out.println("-         5.	Volver al menu principal                                      -");
                        System.out.println("- 12. Salir                                                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.print("Digite su opción: ");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.print("Digite su opción: ");
                        }

                        menuif = menuscanner.nextInt();

                        switch (menuif) {

                            case 12:
                                System.out.println("\n!Gracias¡");
                                System.exit(0);
                                break;

                            case 1:
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-                                     IF                                      -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("-  La sentencia if en Java se utiliza para evaluar una condición y ejecutar   -");
                                System.out.println("-  cierto código solo si la condición se cumple.                              -");
                                System.out.println("-                                                                             -");
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("                  Ingrese Enter para volver al menu anterior                   ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("                  Ingrese Enter para volver al menu anterior                   ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                                System.out.println("                  Ingrese Enter para volver al menu anterior                   ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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


                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPrincip = true;
                                break;

                            default:
                                System.out.println("Número no válido, por favor verifique.");
                                System.out.println("                                                                        ");
                                break;
                        }

                    }
                    break;

                case 6:
                    boolean volverAlMenuPrincipa = false;
                    while (!volverAlMenuPrincipa) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                             CONDICIONAL SWITCH                              -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                           1.	Switch.                                       -");
                        System.out.println("-                           2.	Programa                                      -");
                        System.out.println("-                           3.	Volver al menu principal                      -");
                        System.out.println("-  12. Salir                                                                  -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.print("Digite su opción: ");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La opcion que ingresada no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.print("Digite su opción: ");
                        }

                        menusw = menuscanner.nextInt();

                        switch (menusw) {

                            case 12:
                                System.out.println("\n!Gracias¡");
                                System.exit(0);
                                break;

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
                                System.out.println("                  Ingrese Enter para volver al menu anterior                   ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
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
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                            CONDICIONAL TERNARIA                             -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                               1. Teoria                                     -");
                        System.out.println("-                               2. Practica                                   -");
                        System.out.println("-                               3. Volver al menu principal                   -");
                        System.out.println("-  12. Salir                                                                  -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("Ingrese una sub opcion");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La opcion ingresada no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.print("Digite su opción: ");
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                       TEORIA TERNARIA                                                     -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                                                                                           -");
                                System.out.println("- Es una forma compacta de escribir una estructura if-else en una sola línea. Son útiles para asignar valores               -");
                                System.out.println("- o tomar decisiones simples de manera más concisa.                                                                         -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("                                                  Ingrese Enter para volver al menu anterior                                 ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-                               PRACTICA TERNARIA                       -");
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-                  Validacion numero mayor entre dos valores.           -");
                                System.out.println("-------------------------------------------------------------------------");


                                Scanner scanner = new Scanner(System.in);

                                System.out.print("Ingrese el primer valor: ");
                                int valor1 = menuscanner.nextInt();

                                System.out.print("Ingrese el segundo valor: ");
                                int valor2 = menuscanner.nextInt();


                                int mayor = (valor1 > valor2) ? valor1 : valor2;
                                System.out.println("El mayor es: " + mayor);

                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPri = true;
                                break;

                            case 12:
                                System.out.println("Saliendo...");

                                System.exit(0);


                                break;
                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                return;
                        }
                    }

                    break;
                case 8:
                    boolean volverAlMenuPr = false;
                    while (!volverAlMenuPr) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                 BUCLE DO WHILE                              -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                          1. Teoria                                    -");
                        System.out.println("-                          2. Practica                                  -");
                        System.out.println("-                          3. Volver al menu principal                  -");
                        System.out.println("- 12. Salir                                                             -");
                        System.out.println("-------------------------------------------------------------------------");
                        System.out.println("Ingrese una sub opcion");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.println("Ingrese una sub opcion");
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                       TEORIA DO WHILE                                                     -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                                                                                           -");
                                System.out.println("- Es una estructura de control en programación que permite ejecutar un bloque de código al menos una vez y luego repetirlo  -");
                                System.out.println("- mientras se cumpla una condición específica.                                                                              -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("                                                  Ingrese Enter para volver al menu anterior                                 ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-                               PRACTICA DO WHILE                       -");
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                                System.out.println("-------------------------------------------------------------------------");


                                int suma = 0;
                                int i = 1;

                                do {
                                    System.out.println("La suma en esta iteracion es: " + suma);
                                    suma += i;

                                    i++;

                                } while (i <= 10);


                                System.out.println("La suma total es: " + suma);
                                break;

                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuPr = true;
                                break;

                            case 12:
                                System.out.println("Saliendo...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                return;
                        }
                    }
                    break;
                case 9:
                    boolean volverAlMenuP = false;
                    while (!volverAlMenuP) {
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                               BUCLE WHILE                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                1. Teoria                                    -");
                        System.out.println("-                                2. Practica                                  -");
                        System.out.println("-                                3. Volver al menu principal                  -");
                        System.out.println("- 12. Salir                                                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("Ingrese una sub opcion");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.println("Ingrese una sub opcion");
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                       TEORIA WHILE                                                        -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                                                                                           -");
                                System.out.println("- Es una estructura de control que permite repetir un bloque de código mientras se cumpla una condición específica.         -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("                                                  Ingrese Enter para volver al menu anterior                                 ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-                               PRACTICA WHILE                          -");
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                                System.out.println("-------------------------------------------------------------------------");

                                int suma = 0;
                                int i = 1;

                                while (i <= 10) {
                                    suma += i;

                                    i++;
                                }
                                System.out.println("La suma es: " + suma);
                                break;

                            case 12:
                                System.out.println("Saliendo...");
                                System.exit(0);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenuP = true;
                                break;
                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                return;
                        }
                    }
                    break;
                case 10:
                    boolean volverAlMenu = false;
                    while (!volverAlMenu) {

                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                               BUCLE FOR                                     -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("-                                1. Teoria                                    -");
                        System.out.println("-                                2. Practica                                  -");
                        System.out.println("-                                3. Volver al menu principal                  -");
                        System.out.println("- 12. Salir                                                                   -");
                        System.out.println("-------------------------------------------------------------------------------");
                        System.out.println("Ingrese una sub opcion");

                        while (!menuscanner.hasNextInt()) {
                            System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                            menuscanner.next();
                            System.out.println("Ingrese una sub opcion");
                        }
                        subMenu = menuscanner.nextInt();
                        switch (subMenu) {
                            case 1:
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                       TEORIA FOR                                                          -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("-                                                                                                                           -");
                                System.out.println("- Es una estructura de control de flujo que se utiliza para repetir un bloque de código un número específico de veces.      -");
                                System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                                System.out.println("                                                  Ingrese Enter para volver al menu anterior                                 ");
                                menuscanner.nextLine();
                                menuscanner.nextLine();
                                break;

                            case 2:
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-                               PRACTICA FOR                            -");
                                System.out.println("-------------------------------------------------------------------------");
                                System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                                System.out.println("-------------------------------------------------------------------------");


                                int suma = 0;

                                for (int i = 1; i <= 10; i++) {
                                    suma += i;

                                    System.out.println("La sumatoria de los numeros enteros entre 1 y 10 es " + suma);
                                }
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal...");
                                volverAlMenu = true;
                                break;

                            case 12:
                                System.out.println("Saliendo...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opcion no valida, inicie nuevamente");
                                return;
                        }
                    }
            }

            System.out.print("Presione enter para continuar...");
            menuscanner.nextLine();
            menuscanner.nextLine();

        } while (menu != 0);

        menuscanner.close();


    }

}