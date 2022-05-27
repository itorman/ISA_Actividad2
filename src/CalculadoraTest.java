import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/* Clase calculadoraTest

No tiene argumentos.
Contiene un main para ejecutar una serie de batería de test a la clase Calculadora
Implementa series de 3 test para cada uno de los métodos suma, resta, multiplicacion y raiz de la clase calculadora

*/
public class CalculadoraTest {

    private static final double DELTA = 1e-2;

    public static void main(String args[]) {


        testSuma();
        testResta();
        testMultiplicacion();
        testDivision();
        testRaiz();
    }
    
    @Test //test case
    public static void testSuma() {
        Calculadora calc = new Calculadora();
        double[][] cases = { { 1.0, 3.4, 4.4 }, { 3.8, 4, 7.8 }, { 3, 0, 3 } };
        double resultado;
        double suma;
        /* itera sobre los casos probando que los argumentos de cada uno de los tres test se corresponde con el 
        resultado esperado */
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            suma = calc.suma(cases[i][0], cases[i][1]);
            // assert
            //assert suma == resultado : "Error en la suma"; otra opcion con assert
            //assertEquals(resultado, suma, DELTA); //otra opcion con assert
            /* si el resultado del metodo suma se corresponde con el pasado por el array de los test
            el test se da por bueno, de lo contrario determina fallo */
            if (suma == resultado) {
                System.out.println("Test suma OK en caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }

    @Test //test case
    public static void testResta() {
        Calculadora calc = new Calculadora();
        double[][] cases = { { 5, 3.4, 1.6 }, { 3.865, 4,-0.135 }, { 0,  0.0, 0.0 } };
        double resultado;
        double resta;
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            resta = calc.resta(cases[i][0], cases[i][1]);
            // assert
            //segundo test da falso negativo por redondeo 
            //System.out.println(resta);
            //System.out.println(resultado);
            //assertEquals(resultado, resta, DELTA); // PUEDE SER UNA OPCION??
            /* si el resultado del metodo resta se corresponde con el pasado por el array de los test
            el test se da por bueno, de lo contrario determina fallo.
            Se acepta un error menor de 10e-3*/
            if (Math.abs(resta-resultado)<0.001) { 
                System.out.println("Test resta OK en caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }

    @Test //test case
    public static void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        double[][] cases = { { 5.0, 3, 15.0 }, { 3.8, -4, -15.2 }, { 0, 8, 0 } };
        double resultado;
        double multiplicacion;
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            multiplicacion = calc.multiplica(cases[i][0], cases[i][1]);
            // assert
            /* si el resultado del metodo multiplicacion se corresponde con el pasado por el array de los test
            el test se da por bueno, de lo contrario determina fallo */
            if (multiplicacion == resultado) {
                System.out.println("Test multiplicacion OK en el caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }

    @Test //test case
    public static void testDivision() {
        Calculadora calc = new Calculadora();
        double[][] cases = { { 45, 3.4, 13.2352 }, { 8, -2, -4 }, { 0, 9, 0 } };
        double resultado;
        double division;
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            division = calc.division(cases[i][0], cases[i][1]);
            // assert
            // error de falso negativo en el primer caso por redondeo
            //System.out.println(division);
            //System.out.println(resultado);
            /* si el resultado del metodo division se corresponde con el pasado por el array de los test
            el test se da por bueno, de lo contrario determina fallo.
            Se acepta un error menor de 10e-3*/
            if (Math.abs(division-resultado)<0.001) {
                System.out.println("Test division OK en el caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }

    @Test //test case ignore and will not execute
    public static void testRaiz() {
        Calculadora calc = new Calculadora();
        double[][] cases = { { 45, 6.708 }, { 36, 6 }, { 85, 9.219 } };
        double resultado;
        double raiz;
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][1];
            // act
            raiz = calc.raiz(cases[i][0]);
            // assert
            // error falso negativo en primero y segundo caso por redondeo
            //System.out.println(raiz);
            //System.out.println(resultado);

            /* si el resultado del metodo raiz se corresponde con el pasado por el array de los test
            el test se da por bueno, de lo contrario determina fallo.
            Se acepta un error menor de 10e-3*/
            if (Math.abs(raiz-resultado)<0.001) {
                System.out.println("Test raiz OK en el caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }
}
    