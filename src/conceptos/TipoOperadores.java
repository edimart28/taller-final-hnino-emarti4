package conceptos;

public class TipoOperadores {
    public static void conceptoOpradores() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                OPERADORES                                   -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-  Un operador representa un símbolo que permite realizar operaciones         -");
        System.out.println("-  aritméticas, relacionar elementos o hacer preguntas donde se involucra     -");
        System.out.println("-  más de una condición.                                                      -");
        System.out.println("-------------------------------------------------------------------------------");

    }
    public static void conceptoAritmeticos() {
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
    }

    public static void conceptoRelacionales() {
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
    }

    public static void conceptoLogicos() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                   LOGICOS                                   -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                                                             -");
        System.out.println("-  |    OPERADOR   |           DESCRIPCION            |       EJEMPLO      |  -");
        System.out.println("-  |AND (&&)       |Este operador devuelve true si    | (5>3 && 3<4); true |  -");
        System.out.println("-  |               |ambas expresiones booleanas son   |                    |  -");
        System.out.println("-  |			   |true. De lo contrario, devuelve   |                    |  -");
        System.out.println("-  |			   |false.                            |                    |  -");
        System.out.println("-  |OR (||)        |Este operador devuelve true si al | (5>3 || 3<4); true |  -");
        System.out.println("-  |               |menos una de las expresiones      |                    |  -");
        System.out.println("-  |			   |booleanas es true. De lo          |                    |  -");
        System.out.println("-  |			   |contrario, devuelve false.        |                    |  -");
        System.out.println("-  |               |                                  |                    |  -");
        System.out.println("-  |NOT (!)        |Este operador invierte el valor   |   false =!(5>3)    |  -");
        System.out.println("-  |               |booleano de la expresión a la que |                    |  -");
        System.out.println("-  |			   |se aplica. Si la expresión es     |                    |  -");
        System.out.println("-  |			   |true, devuelve false, y viceversa.|                    |  -");
        System.out.println("-------------------------------------------------------------------------------");

    }

    public static void conceptoAsignacion() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                                 ASIGNACION                                  -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-  |               |                                  |                    |  -");
        System.out.println("-  |    OPERADOR   |           DESCRIPCION            |       EJEMPLO      |  -");
        System.out.println("-  |       =       |La asignación simple asigna el 	  |    int = a = 5;    |  -");
        System.out.println("-  |               |valor de b al operando a.         |                    |  -");
        System.out.println("-  |      +=       |A a se le asigna el valor de      |   a = 5; a += 3;   |  -");
        System.out.println("-  |               |a + b.                            |       Resp. 8      |  -");
        System.out.println("-  |	  -=	   |Al operando a se le asigna el     |   a = 5; a -= 3;   |  -");
        System.out.println("-  |               |valor de a - b.                   |       Resp. 2      |  -");
        System.out.println("-  |	  *=	   |La asignación de multiplicación   |   a = 5; a *= 3;   |  -");
        System.out.println("-  |               |hace que a reciba el resultado    |       Resp. 15     |  -");
        System.out.println("-  |			   |de a * b.                         |                    |  -");
        System.out.println("-  |      /=       |Aquí, a recibe el resultado de    |  a = 6; a /= 3;    |  -");
        System.out.println("-  |               |dividir a entre b.                |      Resp. 2       |  -");
        System.out.println("-  |      %=       |Calcula el modulo del operando izq|  a = 5; a %= 3;    |  -");
        System.out.println("-  |			   |por el operador der y asignaa el  |      Resp. 2       |  -");
        System.out.println("-  |			   |resultado al operando izq.        |                    |  -");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void conceptoIncremento() {
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
    }

}
