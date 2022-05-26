import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

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
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            suma = calc.suma(cases[i][0], cases[i][1]);
            // assert
            //assert suma == resultado : "Error en la suma"; otra opcion con assert
            //assertEquals(resultado, suma, DELTA); //otra opcion con assert
           
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
        double[][] cases = { { 5, 3.4, 1.6 }, { 3.8, 4, -0.2 }, { 0, 0.0, 0.0 } };
        double resultado;
        double resta;
        for (int i = 0; i < cases.length; i++) {
            // arrange
            resultado = cases[i][2];
            // act
            resta = calc.resta(cases[i][0], cases[i][1]);
            // assert
            //segundo test da falso negativo por redondeo 
            System.out.println(resta);
            System.out.println(resultado);
            //assertEquals(resultado, resta, DELTA); // PUEDE SER UNA OPCION??
            if (resta == resultado) { 
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
        double[][] cases = { { 45, 3.4, 13.235 }, { 8, -2, -4 }, { 0, 9, 0 } };
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
            if (division == resultado) {
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
            if (raiz == resultado) {
                System.out.println("Test raiz OK en el caso " + i);
            } else {
                System.out.println("Error en el test caso " + i);
            }
        }
    }
}
    