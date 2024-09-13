package conceptos;

public class DatosPrimitivos {

    public static void conceptoDatosPrimitivos() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-                              DATOS PRIMITIVOS                               -");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-  Son aquellos que no poseen métodos ni propiedades. Además, los valores     -");
        System.out.println("-  asignados con estos tipos de datos son inmutables, lo que quiere decir que -");
        System.out.println("-  después de asignar una variable a un valor primitivo, si deseas cambiar su -");
        System.out.println("-  valor necesitaras reasignarle un valor nuevo, ya que su valor inicial no   -");
        System.out.println("-  puede ser modificado, simplemente se substituye con el nuevo valor.        -");
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void conceptosByte (){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-                          BYTE                                         -");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-        El tipo de dato byte se utiliza para almacenar valores         -");
        System.out.println("-        numéricos enteros pequeños.                                    -");
        System.out.println("-        Rango: -128 a 127.                                             -");
        System.out.println("-        Ejemplo:                                                       -");
        System.out.println("-                          byte edad = 26                               -");
        System.out.println("-------------------------------------------------------------------------");

    }

    public static void conceptosShort () {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-                          SHORT                                        -");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-        Se tipo de dato short se utiliza cuando se necesita un rango   -");
        System.out.println("-        más amplio que el proporcionado por los bytes.                 -");
        System.out.println("-        Rango: -32768 a 32767.                                         -");
        System.out.println("-        Ejemplo:                                                       -");
        System.out.println("-                          short año = 2024;                            -");
        System.out.println("-------------------------------------------------------------------------");

    }

    public static void conceptosInt () {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          INT                                           -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-        Es un tipo de dato que representa números enteros, es decir,    -");
        System.out.println("-        números sin parte decimal, estos pueden ser positivos, negativos-");
        System.out.println("-        o cero.                                                         -");
        System.out.println("-        Rango: -2,147,483,648 a 2,147,483,647                           -");
        System.out.println("-        Ejemplo:                                                        -");
        System.out.println("-                          int valorTotal = 21456                        -");
        System.out.println("--------------------------------------------------------------------------");

    }

    public static void conceptoLong () {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          LONG                                          -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-      El tipo de dato long se utiliza para representar números enteros  -");
        System.out.println("-      que requieren un rango mayor que el proporcionado por un tipo int -");
        System.out.println("-      Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807     -");
        System.out.println("-      Ejemplo:                                                          -");
        System.out.println("-                         long token = 214562565454                      -");
        System.out.println("--------------------------------------------------------------------------");

    }

    public static void conceptoFloat() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          FLOAT                                         -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-      El tipo de dato float se utiliza para representar números reales  -");
        System.out.println("-      (decimales)                                                       -");
        System.out.println("-      Precisòn: De 6 a 7 digitos.                                       -");
        System.out.println("-      Ejemplo:                                                          -");
        System.out.println("-                         float TRM = 4021.63                            -");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void conceptoDouble() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          DOUBLE                                        -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-  El tipo de dato double se utiliza para representar números con mayor  -");
        System.out.println("-  exactitud y un rango más amplio en comparación con el tipo float      -");
        System.out.println("-      Precisòn: De 15 a 17 digitos.                                     -");
        System.out.println("-      Ejemplo:                                                          -");
        System.out.println("-                         double Temperatura = 28.635464646              -");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void conceptoChair() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          CHAR                                          -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-  El tipo de dato char se utiliza para representar un solo              -");
        System.out.println("-  carácter, como una letra, un dígito, un símbolo o un espacio.         -");
        System.out.println("-      Ejemplo:                                                          -");
        System.out.println("-                         char Nota = B                                  -");
        System.out.println("--------------------------------------------------------------------------");
    }

    public static void conceptoBoolean() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-                          BOOLEAN                                       -");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-  El tipo de dato boolean se usa para representar valores de dos        -");
        System.out.println("-  posibles estados lógicos: true (verdadero) y false (falso).           -");
        System.out.println("-      Ejemplo:                                                          -");
        System.out.println("-                   boolean contraseñaCorrecta = false                   -");
        System.out.println("--------------------------------------------------------------------------");
    }

}
