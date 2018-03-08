

import static org.junit.Assert.*;//Librerias de la clase de prueba
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class CalculadoraTest.
 *
 * @author  (Sergio Sanz, Oscar Calderon)
 * @version (calculadora 2.0)
 */
public class CalculadoraTest
{
    /**
     * Default constructor for test class CalculadoraTest
     */
    Calculadora calculadora;


    public CalculadoraTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() throws Exception
    {
        calculadora = new Calculadora();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() throws Exception
    {
    }
    @Test
    public void suma(){
        //Caso 1 suma probamos con dos numeros reales positivos
        calculadora.ponNum1(1);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5, calculadora.resultadoReal(),0.1);//0,1 es el valor de desborde de un double
        //Caso 2 suma con dos numeros reales negativos
        calculadora.ponNum1(-1);
        calculadora.ponNum2(-2);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(-3, calculadora.resultadoReal(),0.1);
        //Caso 3 suma probamos el 0 como segundo operando
        calculadora.ponNum1(5.5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5.5, calculadora.resultadoReal(),0.1);
        //Caso 4 suma probamos con el 0 la propiedad conmutativa si se cumple
        calculadora.ponNum1(0);
        calculadora.ponNum2(5.5);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(5.5, calculadora.resultadoReal(),0.1);
        //Caso 5 suma ponemos los valores limite positivos del double y da infinito como resultado
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        //Caso 6 suma ponemos los valores limite negativos del double y da menos infinito como resultado
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        //Caso 7 ponemos los valores limite positivos y negativos y espera un 0
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
    }
    @Test
    public void resta(){
        //Caso 1 resta ponemos dos numeros reales y el resultado sale negativo
        calculadora.ponNum1(2.2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-1.8, calculadora.resultadoReal(),0.1);
        //Caso 2 resta probamos que al cambiar los operandos el resultado es distinto (positivo)
        calculadora.ponNum1(4);
        calculadora.ponNum2(2.2);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(1.8, calculadora.resultadoReal(),0.1);
        //Caso 3 resta probamos el 0 que no modifica el valor del primer numero
        calculadora.ponNum1(4);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(4, calculadora.resultadoReal(),0.1);
        //Caso 4 resta probamos que al cambiar el 0 por el 4 cambia el resultado
        calculadora.ponNum1(0);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-4, calculadora.resultadoReal(),0.1);
        //Caso 5 resta al poner el valor limite positivo menos el negativo da infinto
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
       //Caso 6 resta poner valor limite  negativo menos el positivo es igual a menos infinito
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        //Caso 7 resta poner los valores limites negativos espera un 0 porque - -(-) = -+
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
    }
    @Test
    public void multiplicacion(){
        //Caso 1 multiplicacion dos numeros reales
        calculadora.ponNum1(3.1);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(15.5, calculadora.resultadoReal(),0.1);
        //Caso 2 multiplicacion dos numeros reales invertidos y no cambia el resultado
        calculadora.ponNum1(5);
        calculadora.ponNum2(3.1);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(15.5, calculadora.resultadoReal(),0.1);
        //Caso 3 multiplicacion por 0
        calculadora.ponNum1(0);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        //Caso 4 multiplicacion por 0 invirtiendo valores y no cambia
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        //Caso 5 multiplicacion limite positivo por limite positivo espera infinito
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
        //Caso 6 multiplicacion limite negativo por limite positivo espera menos infinito
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        //Caso 7 multiplicacion limite negativo por limite negativo espera
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
    }
    @Test
    public void division(){
        //Caso 1 division entre dos reales
        calculadora.ponNum1(4);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(2, calculadora.resultadoReal(),0.1);
        //Caso 2 division dos reales invertidos
        calculadora.ponNum1(2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0.5, calculadora.resultadoReal(),0.1);
        //Caso 3 division 0 entre un divisor distinto a 0 espera 5
        calculadora.ponNum1(0);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
        //Caso 4 division numero real entre 0 espera infinito
        calculadora.ponNum1(5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(Double.POSITIVE_INFINITY, calculadora.resultadoReal(),0.1);
       //Caso 5 division espera un 0
        calculadora.ponNum1(0);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(0, calculadora.resultadoReal(),0.1);
       //Caso 6 division espera uno ya que se dividen dos valores iguales
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(1.0, calculadora.resultadoReal(),0.1);
        //Caso 7 division se divide 0 entre 0 y no sale numero
        calculadora.ponNum1(0);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(Double.NaN, calculadora.resultadoReal(),0.1);
        //Caso 8 division negativo entre 0
        calculadora.ponNum1(-5);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(Double.NEGATIVE_INFINITY, calculadora.resultadoReal(),0.1);
        // Caso 9 division limite positivo entre limite negativo
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(-1.0, calculadora.resultadoReal(),0.1);
        //Caso 10 division limite negativo entre limite negativo
        calculadora.ponNum1(-Double.MAX_VALUE);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();
        assertEquals(1, calculadora.resultadoReal(),0.1);
    }
    @Test
    public void raices(){
        //Caso 1 raices
        calculadora.ponNum1(9);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("RAICES");
        calculadora.opera();
        assertEquals(3.0,calculadora.resultadoReal(),0.1);
        
        //Caso 2 raices
        calculadora.ponNum1(-32);
        calculadora.ponNum2(5);
        calculadora.ponOperacion("RAICES");
        calculadora.opera();
        assertEquals(Double.NaN,calculadora.resultadoReal(),0.1);
        /*
        //caso3 raices
        calculadora.ponNum1(5);
        calculadora.PonIndice(3);
        calculadora.ponOperacion("RAICES");
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
        */
        
    }
    @Test
    public void potencias(){
        //Caso 1 potencias
        calculadora.ponNum1(2);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("POTENCIAS");
        calculadora.opera();
        assertEquals(4.0,calculadora.resultadoReal(),0.1);
        //Caso 2 potencias
        calculadora.ponNum1(2);
        calculadora.ponNum2(0);
        calculadora.ponOperacion("POTENCIAS");
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
     //Caso 3 potencias
        calculadora.ponNum1(0);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("POTENCIAS");
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
    }
    @Test
    public void logaritmos(){
        //Caso 1 logaritmos
        calculadora.ponNum1(10);
        calculadora.ponOperacion("LOGARITMOS");
        calculadora.opera();
        assertEquals(1.0,calculadora.resultadoReal(),0.1);
          //Caso 2 logaritmos
        calculadora.ponNum1(1);
        calculadora.ponOperacion("LOGARITMOS");
        calculadora.opera();
        assertEquals(0,calculadora.resultadoReal(),0.1);
          //Caso 3 logaritmos
        calculadora.ponNum1(2.3);
        calculadora.ponOperacion("LOGARITMOS");
        calculadora.opera();
        assertEquals(0.361727836,calculadora.resultadoReal(),0.1);
    }
    @Test
    public void factoriales(){
        //Caso 1 factoriales
        calculadora.PonFactorial(4);
        calculadora.ponOperacion("FACTORIALES");
        calculadora.opera();
        assertEquals(24,calculadora.resultado());
        //Caso 2 factoriales
        calculadora.PonFactorial(0);
        calculadora.ponOperacion("FACTORIALES");
        calculadora.opera();
        assertEquals(1,calculadora.resultado());
        //Caso 3 factoriales
        calculadora.PonFactorial(Integer.MAX_VALUE);
        calculadora.ponOperacion("FACTORIALES");
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
  //Caso 4 factoriales
        calculadora.PonFactorial(-2);
        calculadora.ponOperacion("FACTORIALES");
        calculadora.opera();
        assertEquals(0,calculadora.resultado());
    }
}
